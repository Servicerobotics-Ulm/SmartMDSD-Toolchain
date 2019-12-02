//===============================================================
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        ZAFH Servicerobotic Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//===============================================================
package org.xtend.smartsoft.generator.component

import com.google.inject.Inject
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDefinition.OutputPort

class SmartEventHandler {
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension CommObjectGenHelpers
	
	def EventTestHandlerCoreHeaderFileName(ComponentPort service) { service.nameClass+"EventTestHandlerCore.hh" }
	def EventTestHandlerUserHeaderFileName(ComponentPort service) { service.nameClass+"EventTestHandler.hh" }
	def EventTestHandlerUserSourceFileName(ComponentPort service) { service.nameClass+"EventTestHandler.cc" }
	
	def void CreateEventTestHandlers(ComponentDefinition comp, IFileSystemAccess fsa) {
		for(eventServer: comp.elements.filter(OutputPort).filter[it.isEventServer]) {
			fsa.generateFile(eventServer.EventTestHandlerCoreHeaderFileName, eventServer.HandlerHeaderFileContent)
			fsa.generateFile(eventServer.EventTestHandlerUserHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, eventServer.HandlerUserHeaderFileContent)
			fsa.generateFile(eventServer.EventTestHandlerUserSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, eventServer.HandlerUserSourceFileContent)	
		}
	}
	
	
	///////////////////////////////
	// Handler Header Files
	/////////////////////////////
	def HandlerHeaderFileContent(OutputPort service) '''
	«getCopyright()»
	#ifndef _«service.name.toUpperCase()»_EVENT_TEST_HANDLER_CORE_HH
	#define _«service.name.toUpperCase()»_EVENT_TEST_HANDLER_CORE_HH
			
	#include "aceSmartSoft.hh"
	
	«FOR obj : ComponentDefinitionModelUtility.getAllCommObjects(service).sortBy[it.name]»
		#include <«obj.userClassHeaderFileNameFQN»>
	«ENDFOR»
	
	class «service.nameClass»EventTestHandlerCore : public SmartACE::EventTestHandler<«service.getCommObjectCppList(true)»>
	{
	};
	#endif
	'''

	///////////////////////////////
	// Handler USER Header Files
	/////////////////////////////
	def HandlerUserHeaderFileContent(OutputPort service) 
	'''
	«getCopyrightWriteOnce()»
	#ifndef _«service.name.toUpperCase()»_EVENT_TEST_HANDLER_USER_HH
	#define _«service.name.toUpperCase()»_EVENT_TEST_HANDLER_USER_HH
			
	#include "«service.EventTestHandlerCoreHeaderFileName»"
	
	class «service.nameClass»EventTestHandler : public «service.nameClass»EventTestHandlerCore
	{
	public:
		virtual bool testEvent(
			«service.communicationObjects.get("Activation").fullyQualifiedNameCpp» &p,
			«service.communicationObjects.get("Event").fullyQualifiedNameCpp» &r,
			const «service.communicationObjects.get("EventState").fullyQualifiedNameCpp» &s
		) throw();
	};
	#endif
	'''

	//////////////////////////////
	// Handler USER Source Files
	/////////////////////////////
	def HandlerUserSourceFileContent(OutputPort service) 
	'''
	«getCopyrightWriteOnce()»
	#include "«service.EventTestHandlerUserHeaderFileName»"
	
	bool «service.nameClass»EventTestHandler::testEvent(
		«service.communicationObjects.get("Activation").fullyQualifiedNameCpp» &p,
		«service.communicationObjects.get("Event").fullyQualifiedNameCpp» &r,
		const «service.communicationObjects.get("EventState").fullyQualifiedNameCpp» &s
	) throw() {
		// fire all events (without filtering) in the default implementation
		// implement your own (specific) event-filtering code using the event-parameter as input
		// true means that the current event will be fired to the according client
		// false means that the current event is ignored (it will not be communicated to the according client)
		return true;
	}
	'''
}