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
import org.ecore.component.componentDefinition.RequestHandler
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.InputHandler
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*

class SmartQueryHandler {
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension CommObjectGenHelpers
	@Inject extension SmartInputHandler
	@Inject extension SmartTask
	@Inject extension SmartComponent
	@Inject extension InteractionObserver
	
	def QueryServerHandlerCoreHeaderFileName(RequestHandler handler) { handler.nameClass+"Core.hh" }
	def QueryServerHandlerCoreSourceFileName(RequestHandler handler) { handler.nameClass+"Core.cc" }
	def QueryServerHandlerUserHeaderFileName(RequestHandler handler) { handler.nameClass+".hh" }
	def QueryServerHandlerUserSourceFileName(RequestHandler handler) { handler.nameClass+".cc" }
	
	def void CreateQueryServerHandlers(ComponentDefinition comp, IFileSystemAccess fsa) {
		for(handler: comp.elements.filter(RequestHandler)) {
			fsa.generateFile(handler.QueryServerHandlerCoreHeaderFileName, handler.HandlerHeaderFileContent)
			fsa.generateFile(handler.QueryServerHandlerCoreSourceFileName, handler.HandlerCoreSourceFileContent)
			fsa.generateFile(handler.QueryServerHandlerUserHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, handler.HandlerUserHeaderFileContent)
			fsa.generateFile(handler.QueryServerHandlerUserSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, handler.HandlerUserSourceFileContent)	
		}
	}
	
	
	///////////////////////////////
	// Handler Header Files
	/////////////////////////////
	def HandlerHeaderFileContent(RequestHandler handler) '''
	«getCopyright()»
	#ifndef _«handler.name.toUpperCase()»_CORE_HH
	#define _«handler.name.toUpperCase()»_CORE_HH
			
	#include "aceSmartSoft.hh"
	
	«FOR obj : ComponentDefinitionModelUtility.getAllCommObjects(handler).sortBy[it.name]»
		#include <«obj.userClassHeaderFileNameFQN»>
	«ENDFOR»
	
	// include the input interfaces (if any)
	«FOR inLink: handler.inputLinks.sortBy[it.name]»
		#include "«inLink.inputPort.UpcallInterfaceHeaderFileName»"
	«ENDFOR»
	
	// include all interaction-observer interfaces
	#include <«handler.nodeObserverInterfaceHeaderFileName»>
	«FOR obs: handler.observers.sortBy[it.nameClass]»
	#include <«obs.subject.nodeObserverInterfaceHeaderFileName»>
	«ENDFOR»
	
	class «handler.nameClass»Core 
	:	public Smart::IInputHandler<std::pair<Smart::QueryIdPtr,«handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»>>
	,	public Smart::TaskTriggerSubject
	«FOR obs: handler.observers.sortBy[it.nameClass]»
	,	public «obs.subject.nodeObserverInterfaceClassName»
	«ENDFOR»
	«FOR inLink: handler.inputLinks.sortBy[it.name]»
	,	public «inLink.inputPort.nameClass»UpcallInterface
	«ENDFOR»
	{
	private:
	virtual void handle_input(const std::pair<Smart::QueryIdPtr,«handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»> &input) override {
		this->handleQuery(input.first, input.second);
	}
	
	«FOR inLink: handler.inputLinks.sortBy[it.name]»
		Smart::StatusCode «inLink.inputPort.nameInstance»Status;
		«inLink.inputPort.inputHandlerCommObject» «inLink.inputPort.nameInstance»Object;
	«ENDFOR»
	
		virtual void updateAllCommObjects();
	
	«handler.compileNodeSubjectHeader»
	
	protected:
		«FOR obs: handler.observers.sortBy[it.name]»
		// overload this method in derived classes!
		virtual void on_update_from(const «obs.subject.nameClass»* subject) {
			// no-op
		}
		«ENDFOR»
		
		«FOR input: handler.inputLinks.map[inputPort].sortBy[it.name]»
			// overload and implement this method in derived classes to immediately get all incoming updates from «input.name» (as soon as they arrive)
			virtual void on_«input.name»(const «input.inputHandlerCommObject» &input) {
				// no-op
			}
			
			// this method can be safely used from the thread in derived classes
			inline Smart::StatusCode «input.nameInstance»GetUpdate(«input.inputHandlerCommObject» &«input.nameInstance»Object) const
			{
				// copy local object buffer and return the last status code
				«input.nameInstance»Object = this->«input.nameInstance»Object;
				return «input.nameInstance»Status;
			}
			
		«ENDFOR»
	public:
		using IQueryServer = Smart::IQueryServerPattern<«handler.answerPort.getCommObjectCppList(true)»>;
		using QueryId = Smart::QueryIdPtr;
		«handler.nameClass»Core(IQueryServer *server);
		virtual ~«handler.nameClass»Core() = default;
		
	protected:
		IQueryServer *server;
		//this user-method has to be implemented in derived classes
		virtual void handleQuery(const QueryId &id, const «handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»& request) = 0;
	};
	#endif
	'''
	
	//////////////////////////////
	// Handler Core Source Files
	/////////////////////////////
	def HandlerCoreSourceFileContent(RequestHandler handler) 
	'''
	«getCopyright()»
	#include "«handler.QueryServerHandlerCoreHeaderFileName»"
	#include "«handler.QueryServerHandlerUserHeaderFileName»"
	
	// include observers
	«FOR observer: handler.observers.sortBy[it.nameClass]»
		«IF observer.subject instanceof Activity»
			#include "«(observer.subject  as Activity).TaskUserHeaderFileName»"
		«ELSEIF observer.subject instanceof InputHandler»
			#include "«(observer.subject as InputHandler).InputHandlerUserHeaderFileName»"
		«ENDIF»
	«ENDFOR»
	
	«handler.nameClass»Core::«handler.nameClass»Core(IQueryServer* server)
	:	Smart::IInputHandler<std::pair<Smart::QueryIdPtr,«handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»>>(server)
	,	server(server)
	«FOR inLink: handler.inputLinks.sortBy[it.name]»
	,	«inLink.inputPort.nameInstance»Status(Smart::SMART_DISCONNECTED)
	,	«inLink.inputPort.nameInstance»Object()
	«ENDFOR»
	{
		
	}
	
	void «handler.nameClass»Core::updateAllCommObjects()
	{
		«FOR input: handler.inputLinks.map[inputPort].sortBy[it.name]»
			«input.nameInstance»Status = COMP->«input.nameInstance»InputTaskTrigger->getUpdate(«input.nameInstance»Object);
		«ENDFOR»
	}
	
	«handler.compileNodeSubjectSource»
	'''

	///////////////////////////////
	// Handler USER Header Files
	/////////////////////////////
	def HandlerUserHeaderFileContent(RequestHandler handler) 
	'''
	«getCopyrightWriteOnce()»
	#ifndef _«handler.name.toUpperCase()»_USER_HH
	#define _«handler.name.toUpperCase()»_USER_HH
			
	#include "«handler.QueryServerHandlerCoreHeaderFileName»"
	
	class «handler.nameClass» : public «handler.nameClass»Core
	{
	protected:
		«FOR obs: handler.observers.sortBy[it.nameClass]»
		virtual void on_update_from(const «obs.nameClass»* «obs.nameInstance»);
		«ENDFOR»	
	public:
		«handler.nameClass»(IQueryServer *server);
		virtual ~«handler.nameClass»() = default;
		virtual void handleQuery(const QueryId &id, const «handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»& request);
	};
	#endif
	'''

	//////////////////////////////
	// Handler USER Source Files
	/////////////////////////////
	def HandlerUserSourceFileContent(RequestHandler handler) 
	'''
	«getCopyrightWriteOnce()»
	#include "«handler.QueryServerHandlerUserHeaderFileName»"
	#include "«(handler.eContainer as ComponentDefinition).getCompHeaderFilename»"
	
	«handler.nameClass»::«handler.nameClass»(IQueryServer *server)
	:	«handler.nameClass»Core(server)
	{
		
	}
	
	«FOR observer: handler.observers.sortBy[it.nameClass]»
	void «handler.nameClass»::on_update_from(const «observer.subject.nameClass»* «observer.subject.nameInstance»)
	{
		// update triggered from «observer.subject.nameClass»
		// (use a local mutex here, because this method is called from within the thread of «observer.subject.name»)
	}
	«ENDFOR»
	
	void «handler.nameClass»::handleQuery(const Smart::QueryIdPtr &id, const «handler.answerPort.communicationObjects.get("Request").fullyQualifiedNameCpp»& request) 
	{
		«handler.answerPort.communicationObjects.get("Answer").fullyQualifiedNameCpp» answer;
		
		// implement your query handling logic here and fill in the answer object
		
		this->server->answer(id, answer);
	}
	'''
}
