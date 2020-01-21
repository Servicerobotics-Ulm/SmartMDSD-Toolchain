//================================================================
//
//  Copyright (C) 2019 Matthias Lutz, Alex Lotz, Dennis Stampfer
//
//        lutz@hs-ulm.de
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//================================================================
package org.eclipse.smartmdsd.xtend.behavior.generator.domainModels

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ComponentGenHelpers
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern
import org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern
import org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern
import org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage
import org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository
import org.eclipse.smartmdsd.xtend.behavior.generator.ExtendedOutputConfigurationProvider

class CoordinationInterfaceGeneratorImpl extends AbstractGenerator {
	
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension CommObjectGenHelpers
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		// info file with generator version string
		fsa.generateFile("info.txt", resource.compileToolchainVersionFile);
		
		
		// run-time-interface
		fsa.generateFile("runTimeInterface.hh", resource.compileModuleInterface)
		
		fsa.generateFile("coordinationInterfaces.cmake",resource.compileCollectCMakeCoordinationInterface);
		
		
		for(coordServiceDef: resource.allContents.toIterable.filter(typeof(CoordinationServiceDefinition))) {
			fsa.generateFile(coordServiceDef.name+"/"+"CMakeLists.txt", coordServiceDef.compileCMakeCoordinationInterfaceSlave)
			
			fsa.generateFile(coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper+".hh", coordServiceDef.compileCoordinationInterfaceSlaveHeader)
			fsa.generateFile(coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper+".cc", coordServiceDef.compileCoordinationInterfaceSlaveSource)
			
			fsa.generateFile(coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper+"Core.hh", coordServiceDef.compileCoordinationInterfaceSlaveCoreHeader)
			fsa.generateFile(coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper+"Core.cc", coordServiceDef.compileCoordinationInterfaceSlaveCoreSource)
			
			generateServicesHandler(fsa, coordServiceDef)
			
			fsa.generateFile(coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + "RunTimeInterface.cc", coordServiceDef.compileSwitchCoordinationServiceSource)
		}
		
	}
	
	def generateServicesHandler(IFileSystemAccess2 fsa, CoordinationServiceDefinition coordServiceDef) {
		for(service : coordServiceDef.services.sortBy(e | e.name)){
			var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)
			if (pattern instanceof EventPattern) {
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "EventHandlerCore.hh", service.compileEventHandlerHeaderCore(pattern, coordServiceDef.name))
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "EventHandlerCore.cc", service.compileEventHandlerSourceCore(pattern, coordServiceDef.name))
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "EventHandler.hh", ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileEventHandlerHeader(pattern, coordServiceDef.name))
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "EventHandler.cc", ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileEventHandlerSource(pattern, coordServiceDef.name))
			} else if (pattern instanceof SendPattern) {
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "SendHandler.hh",ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileSendHeader(pattern, coordServiceDef.name))
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "SendHandler.cc",ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileSendSource(pattern, coordServiceDef.name))
				
			} else if (pattern instanceof QueryPattern){
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "QueryHandler.hh",ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileQueryHeader(pattern, coordServiceDef.name))
				fsa.generateFile( coordServiceDef.name+"/"+coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "QueryHandler.cc",ExtendedOutputConfigurationProvider::SRC_OUTPUT, service.compileQuerySource(pattern, coordServiceDef.name))
			}
		}
	}



	def compileToolchainVersionFile( Resource res)
	'''
	«toolchainVersionFileString»
	'''

	/*
	 * compileModuleInterface moduleInterface.hh
	 */
	def compileModuleInterface(Resource res)'''
	#ifndef _RUNTIMEINTERFACE_HH
	#define _RUNTIMEINTERFACE_HH
	
	#include <map>
	#include <string>
	#include <string.h>
	
	extern 	std::string queryParam(const std::string& server, const std::string& param);
	extern 	std::string setState(const std::string& server, const std::string& state);
	extern  int appedEvent(const std::string& event);
	
	typedef struct
	{
		std::string ciTypeName;
		std::string componentInstanceName;
		std::map< std::string,std::string >serviceNameMap;
	
	}CiConnection;
	
	struct ciLessLibC : public std::binary_function<std::string, std::string, bool> {
	    bool operator()(const std::string &lhs, const std::string &rhs) const {
	        return strcasecmp(lhs.c_str(), rhs.c_str()) < 0 ;
	    }
	};
	
	#endif
	'''
	
	
	def compileCollectCMakeCoordinationInterface(Resource resource)'''
		«getCopyrightWriteOnceHash()»
		
		CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
		«FOR service : resource.allContents.toIterable.filter(typeof(CoordinationServiceDefinition))»
		MESSAGE("-- Include «service.name.toFirstUpper»")
		ADD_SUBDIRECTORY(${CMAKE_CURRENT_LIST_DIR}/«service.name.toFirstUpper» ${CMAKE_CURRENT_BINARY_DIR}/«service.name.toFirstUpper»)
		«ENDFOR»
	'''
	
	
	/*
	 * CoordinationInterfaceLibrary.cmake
	 */
	def compileCMakeCoordinationInterfaceSlave(CoordinationServiceDefinition coordServiceDef)'''
	«getCopyrightHash()»
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	PROJECT(«coordServiceDef.name»)
	
	# find SmartSoft package
	#FIND_SMARTSOFT(3.0)
	FIND_PACKAGE(AceSmartSoft PATHS $ENV{SMART_ROOT_ACE}/modules)
	
	# these are the regular includes (add your own includes, if needed)
	INCLUDE_DIRECTORIES(
	  ${CMAKE_CURRENT_LIST_DIR}
	  ${CMAKE_CURRENT_LIST_DIR}/../
	  ${CMAKE_CURRENT_LIST_DIR}/../../src/«coordServiceDef.name.toFirstUpper»
	)
	
	# collect the toolchain-generated source-files
	FILE(GLOB_RECURSE SRC ${CMAKE_CURRENT_LIST_DIR}/*.cc)
	FILE(GLOB_RECURSE SRC_GEN ${CMAKE_CURRENT_LIST_DIR}/../../src/«coordServiceDef.name.toFirstUpper»/*.cc)
	
	IF(WIN32)
		ADD_LIBRARY(${PROJECT_NAME} STATIC ${SRC} ${SRC_GEN})
	ELSE()
		ADD_LIBRARY(${PROJECT_NAME} SHARED ${SRC} ${SRC_GEN})
	ENDIF()
	
	# SmartSoftKernel is one of the default dependencies for each component
	TARGET_LINK_LIBRARIES(${PROJECT_NAME} AceSmartSoftKernel)
	TARGET_LINK_LIBRARIES(${PROJECT_NAME} «(coordServiceDef.eContainer as ServiceDefRepository).name.toFirstUpper»)
	
	# automatically install the component target
	# automatically run "make install" after regular "make" for the communication object
	ADD_DEPENDENCIES(autoinstall ${PROJECT_NAME})
	
	# install component executable target
	INSTALL(TARGETS ${PROJECT_NAME} DESTINATION lib)
	'''
	
	/////////////////////////////////
	// CoordinationInterfaceSlave
	
 	/*
	 * compileCoordinationInterfaceSlaveHeader
	 */
	 def compileCoordinationInterfaceSlaveHeader(CoordinationServiceDefinition coordServiceDef) '''
		#ifndef «coordServiceDef.name.toUpperCase»_H_
		#define «coordServiceDef.name.toUpperCase»_H_
		#include "aceSmartSoft.hh"
		
		// include communication objects
		«FOR obj : CoordinationInterfaceModelUtility.getAllCommObjects(coordServiceDef).sortBy[it.name]»
			#include <«obj.userClassHeaderFileNameFQN»>
			#include <«obj.serailizationHeaderFileNameFQN»>
		«ENDFOR»
		
		
		«FOR service : coordServiceDef.services.sortBy(e | e.name)»
			«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
			«switch (pattern) {
//					PushPattern: 			'''//PUSH IS NOT USED!'''
					EventPattern:			'''#include "«coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "EventHandlerCore.hh"»"'''
					SendPattern: 			'''#include "«coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "SendHandler.hh"»"'''
					QueryPattern: 			'''#include "«coordServiceDef.name.toFirstUpper + service.name.toFirstUpper + "QueryHandler.hh"»"'''
					default: ""
			}»
		«ENDFOR»
		

		class «coordServiceDef.name.toFirstUpper» {
		 	
		public:
			«coordServiceDef.name.toFirstUpper» ();
			~«coordServiceDef.name.toFirstUpper» ();
		

			//variables, ports, handlers
			//param, state, wiring is dealt with the single master
			«FOR service : coordServiceDef.services.sortBy(e | e.name)»
				«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
				«IF pattern instanceof PushPattern»
					//PUSH IS NOT USED!
				«ELSEIF pattern instanceof EventPattern»
					Smart::IEventClientPattern<«pattern.getCommObjectCppList(false)»> *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»EventHandlerCore *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»EventHandlerCore;
				«ELSEIF pattern instanceof SendPattern»
					SmartACE::SendClient<«pattern.getCommObjectCppList(false)»> *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»SendHandler *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»SendHandler;
				«ELSEIF pattern instanceof QueryPattern»
					Smart::IQueryClientPattern<«pattern.getCommObjectCppList(false)»> *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»QueryHandler *«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler;
				«ENDIF»
			«ENDFOR»
		 };
		#endif /* «coordServiceDef.name.toUpperCase»_H_ */
	 '''
	 
	 
	/*
	 * compileCoordinationInterfaceSlaveSource
	 */
	 def compileCoordinationInterfaceSlaveSource(CoordinationServiceDefinition coordServiceDef) '''
	 #include "«coordServiceDef.name.toFirstUpper».hh"
	 
	 «coordServiceDef.name.toFirstUpper»::«coordServiceDef.name.toFirstUpper» (){
		«FOR service : coordServiceDef.services.sortBy(e | e.name)»
			«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
			«IF pattern instanceof PushPattern»
				//PUSH IS NOT USED!
			«ELSEIF pattern instanceof EventPattern»
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = NULL;
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»EventHandlerCore = NULL;
			«ELSEIF pattern instanceof SendPattern»
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»SendHandler = NULL;
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = NULL;
			«ELSEIF pattern instanceof QueryPattern»
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler = NULL;
				«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = NULL;
			«ENDIF»
		«ENDFOR»
	 }
	 «coordServiceDef.name.toFirstUpper»::~«coordServiceDef.name.toFirstUpper» (){
	 	
	 }
	 
	 '''
	 
	// CoordinationInterfaceSlave
	/////////////////////////////////
	
	
	/////////////////////////////////
 	// CoordinationInterfaceSlaveCORE
	 
	/*
	 * compileCoordinationInterfaceSlaveCoreHeader
	 */
	 def compileCoordinationInterfaceSlaveCoreHeader(CoordinationServiceDefinition coordServiceDef) '''
		#ifndef «coordServiceDef.name.toUpperCase»CORE_H_
		#define «coordServiceDef.name.toUpperCase»CORE_H_
		#include "aceSmartSoft.hh"
		#include "runTimeInterface.hh"
		
		#include <string>
		#include <map>
		#include <iostream>
		
		#include "«coordServiceDef.name.toFirstUpper».hh"
		
		 class «coordServiceDef.name.toFirstUpper»Core {
		 	friend class ACE_Singleton<«coordServiceDef.name.toFirstUpper»Core, ACE_Thread_Mutex>;
		private:
			«coordServiceDef.name.toFirstUpper»Core (){
				std::cout<<"Create «coordServiceDef.name.toFirstUpper» Module Singelton..."<<std::endl;
			}
			~«coordServiceDef.name.toFirstUpper»Core (){
				std::cout<<"Destroy «coordServiceDef.name.toFirstUpper» Module Singelton..."<<std::endl;
			}
			
			std::map<std::string, «coordServiceDef.name.toFirstUpper», ciLessLibC> ciInstanceMap;
		public:
			void addNewModuleInstance(const std::string& name);
			int initCiInstance(SmartACE::SmartComponent * component, const std::string& ciInstanceName, const std::map< std::string, CiConnection, ciLessLibC> &ciConnectionsMap);
			int finiCiInstance(const std::string& ciInstanceName);
			std::string switchCi(const std::string& ciInstanceName, const std::string& componentName, const std::string& componentInstanceName, const std::string& service, const std::string& inString);
		
		 };
		#endif /* «coordServiceDef.name.toUpperCase»CORE_H_ */
	 '''
	 
	 
	 	 	/**
	 * compileModuleCoreSource
	 */
	 def compileCoordinationInterfaceSlaveCoreSource(CoordinationServiceDefinition coordServiceDef) '''
		#include "«coordServiceDef.name.toFirstUpper»Core.hh"
		#include <cstdio>
		#include <string>
		#include <cstring>
		#include <cstdlib>
		
		#include <smartNumericCorrelationId.h>

		 void «coordServiceDef.name.toFirstUpper»Core::addNewModuleInstance(const std::string& name){
		 	std::cout<<"addNewModuleInstance name:"<<name<<std::endl;
			«coordServiceDef.name.toFirstUpper» mi;
			 ciInstanceMap.insert ( std::pair<std::string,«coordServiceDef.name.toFirstUpper»>(name,mi));
		 }
		 
		 int «coordServiceDef.name.toFirstUpper»Core::initCiInstance(SmartACE::SmartComponent * component, const std::string& ciInstanceName, const std::map< std::string, CiConnection, ciLessLibC > &ciConnectionsMap){
		 	std::map<std::string, «coordServiceDef.name.toFirstUpper», ciLessLibC>::iterator iter = ciInstanceMap.find(ciInstanceName);
			if(iter != ciInstanceMap.end()){
				std::cout<<__FUNCTION__<<" create ports and handlers..."<<std::endl;

			// create ports


			//component name: «coordServiceDef.name»
			«FOR service : coordServiceDef.services.sortBy(e | e.name)»
				«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
				«IF pattern instanceof PushPattern»
				//PUSH IS NOT USED!
				«ELSEIF pattern instanceof EventPattern»
				//EVENT CLIENT
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = new SmartACE::EventClient<«pattern.activationType.fullyQualifiedNameCpp»,«pattern.eventType.fullyQualifiedNameCpp»>(component);
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»EventHandlerCore = new «coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»EventHandlerCore(iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client, ciInstanceName);
				«ELSEIF pattern instanceof SendPattern»
				//SEND CLIENT
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = new SmartACE::SendClient<«pattern.dataType.fullyQualifiedNameCpp»>(component);
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»SendHandler = new «coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»SendHandler();
				«ELSEIF pattern instanceof QueryPattern»
				//QUERY CLIENT
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client = new SmartACE::QueryClient<«pattern.requestType.fullyQualifiedNameCpp»,«pattern.answerType.fullyQualifiedNameCpp»>(component);
				iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler = new «coordServiceDef.name.toFirstUpper»«service.name.toFirstUpper»QueryHandler();
				«ENDIF»
			«ENDFOR»
			
			// connect ports
			std::cout<<__FUNCTION__<<" connect ports..."<<std::endl; 
			std::map< std::string, CiConnection, ciLessLibC>::const_iterator ci_inst_iter = ciConnectionsMap.find(ciInstanceName);
			if(ci_inst_iter != ciConnectionsMap.end()){
				«FOR service : coordServiceDef.services.sortBy(e | e.name)»
				«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
				«IF pattern instanceof EventPattern||
				    pattern instanceof SendPattern||
				    pattern instanceof QueryPattern»
				{
					std::map<std::string, std::string>::const_iterator service_iter = ci_inst_iter->second.serviceNameMap.find("«service.name»");
					if(service_iter != ci_inst_iter->second.serviceNameMap.end()){
						std::string serviceName(service_iter->second);
				
						Smart::StatusCode status;
				
						std::cout << "connecting to: " << ci_inst_iter->second.componentInstanceName << "; " << serviceName << std::endl;
						status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->connect(ci_inst_iter->second.componentInstanceName, serviceName);
						while(status != Smart::SMART_OK)
						{
							ACE_OS::sleep(ACE_Time_Value(0,500000));
							status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->connect(ci_inst_iter->second.componentInstanceName, serviceName);
						}
						std::cout << "connected.\n";
					} else {
						std::cout<<"ERROR SERVICE NOT FOUND IN MAP!"<<std::endl;
						return 1;
					}
				}
				«ENDIF»
				«ENDFOR»
			} else {
				std::cout<<"Was not able to find ci inst in ciComponent connection map!"<<std::endl;
			}

				return 0;
			} else {
				std::cout<<"ERROR WAS NOT ABLE TO FIND CI INSTANCE IN MAP --> this should not have happend!"<<std::endl;
				return -1;
			}
		 }
		 
		 int «coordServiceDef.name.toFirstUpper»Core::finiCiInstance(const std::string& ciInstanceName){
		 	std::map<std::string, «coordServiceDef.name.toFirstUpper»>::iterator iter = ciInstanceMap.find(ciInstanceName);
			if(iter != ciInstanceMap.end()){
					«FOR service : coordServiceDef.services.sortBy(e | e.name)»
					«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
					«IF pattern instanceof PushPattern»
						//PUSH IS NOT USED!
					«ELSEIF pattern instanceof EventPattern»
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»EventHandlerCore;
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«ELSEIF pattern instanceof SendPattern»
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»SendHandler;
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«ELSEIF pattern instanceof QueryPattern»
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler;
						delete iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client;
					«ENDIF»
					«ENDFOR»
				return 0;
			} else {
				std::cout<<"ERROR WAS NOT ABLE TO FIND CI INSTANCE IN MAP --> this should not have happend!"<<std::endl;
				return -1;
			}
		}
		
		std::string «coordServiceDef.name.toFirstUpper»Core::switchCi(const std::string& ciInstanceName, const std::string& componentName, const std::string& componentInstanceName, const std::string& service, const std::string& inString){
			std::map<std::string, «coordServiceDef.name.toFirstUpper»>::const_iterator iter = ciInstanceMap.find(ciInstanceName);
			
			if(ciInstanceName == "NIL" && ciInstanceMap.size() == 1){
				std::cout<<"Fallback - no module-inst given, using the only existing module instance!"<<std::endl;
				iter = ciInstanceMap.begin();
			}
			
			if(iter != ciInstanceMap.end()){
				
				std::cout<<"switch«coordServiceDef.name» - compInstName: "<<componentInstanceName<<" inString: "<<inString<<" service: "<<service<<std::endl;
				
				std::ostringstream outString;
				outString << "(error (unknown error))";
			
					
					// param
					if(strcasecmp(service.c_str(), "param") == 0 )
					{
						outString.str(queryParam(componentInstanceName, inString));
					}
					if(strcasecmp(service.c_str(), "state") == 0 )
					{
						outString.str(setState(componentInstanceName, inString));
					}
					«FOR service : coordServiceDef.services.sortBy(e | e.name)»
						«var pattern = ComponentDefinitionModelUtility.getPattern(service.uses)»
						«IF pattern instanceof PushPattern»
						//PUSH IS NOT USED!
						«ELSEIF pattern instanceof QueryPattern»
						if(strcasecmp(service.c_str(), "«service.name»") == 0 )
						{
							«pattern.requestType.fullyQualifiedNameCpp» request;
							«pattern.answerType.fullyQualifiedNameCpp» answer;
							
							Smart::StatusCode status;
							request = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler->handleRequest(inString);
							
							std::cout << "vor status = «service.name»Client->query(request,answer);\n";
							status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->query(request,answer);
							std::cout << "nach status = «service.name»Client->query(request,answer);\n";
							outString.str("");
							switch (status)
							{
								case Smart::SMART_OK:
								{
									std::string resString = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»QueryHandler->handleAnswer(answer);
									outString << "(ok "<<resString<<")";
									break;
							 	}
								case Smart::SMART_DISCONNECTED:
									outString << "(error (smart disconnected))";
									break;
								case Smart::SMART_ERROR_COMMUNICATION:
									outString << "(error (smart communication error))";
									break;
								case Smart::SMART_ERROR:
									outString << "(error (smart error))";
									break;
								default:
									outString << "(error (unknown error))";
									break;
							} // switch(status)
						}
						«ELSEIF pattern instanceof SendPattern»
						if(strcasecmp(service.c_str(), "«service.name»") == 0 )
						{
							«pattern.dataType.fullyQualifiedNameCpp» com;
							
							Smart::StatusCode status;
							com = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»SendHandler->handleSend(inString);

							// everything is ok
							status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->send(com);
							outString.str("");
							switch (status)
							{
									case Smart::SMART_OK:
											outString << "(ok ())";
											break;
									case Smart::SMART_DISCONNECTED:
											outString << "(error (smart disconnected))";
											break;
									case Smart::SMART_ERROR_COMMUNICATION:
											outString << "(error (smart communication error))";
											break;
									case Smart::SMART_ERROR:
											outString << "(error (smart error))";
											break;
									default:
											outString << "(error (unknown error))";
											break;
							}
						}
						«ELSEIF pattern instanceof EventPattern»
						if(strcasecmp(service.c_str(), "«service.name»-activate") == 0 )
						{
							Smart::StatusCode status;
							Smart::EventIdPtr id = nullptr;
							char *input  = (char *)NULL;
							char *pointer = (char *)NULL;
							char *param1  = (char *)NULL;
							
							pointer = input = strdup(inString.c_str());
							do
							{
								param1 = strsep(&input," ()\"\n");
							} while ((param1 != NULL) && (strlen(param1)==0));
								
							«pattern.activationType.fullyQualifiedNameCpp» param;
							param = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»EventHandlerCore->activateEventParam(input);
								
							// CONTINOUS
							if( strcasecmp(param1, "CONTINUOUS") == 0 )
							{
								status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->activate(Smart::continuous, param, id);
								outString.str("");
								switch(status)
								{
									case Smart::SMART_OK:
										outString << "(ok ("<<id<<"))";
										break;
									case Smart::SMART_DISCONNECTED:
										outString << "(error (smart disconnected))";
										break;
									case Smart::SMART_ERROR_COMMUNICATION:
										outString << "(error (smart communication error))";
										break;
									case Smart::SMART_ERROR:
										outString << "(error (unknown error))";
						       			break;
									default:
							            outString << "(error (unknown error))";
							            break;
								} // switch
							} // CONTINOUS
								
							// SINGLE
							else if( strcasecmp(param1, "SINGLE") == 0 )
							{
								status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->activate(Smart::single, param, id);
								outString.str("");
								switch(status)
								{
									case Smart::SMART_OK:
										outString << "(ok ("<<id<<"))";
										break;
									case Smart::SMART_DISCONNECTED:
										outString << "(error (smart disconnected))";
										break;
									case Smart::SMART_ERROR_COMMUNICATION:
										outString << "(error (smart communication error))";
										break;
									case Smart::SMART_ERROR:
							            outString << "(error (unknown error))";
							            break;
									default:
							            outString << "(error (unknown error))";
							            break;
								} // switch
							}
						}
								
						// goal event deactivate
						if(strcasecmp(service.c_str(), "«service.name»-deactivate") == 0)
						{
							Smart::StatusCode status;
							char *input  = (char *)NULL;
							char *pointer = (char *)NULL;
							char *param1  = (char *)NULL;
								
							pointer = input = strdup(inString.c_str());
							do
							{
								param1 = strsep(&input," ()\"\n");
							} while ((param1 != NULL) && (strlen(param1)==0));
								
							std::string str(param1);
							// remove " "
							str = str.substr(1, str.length()-2);
							// TODO: <alex> this seems to be quite a hack, as ID is not always an int and will not work with other middlewares as ACE
							Smart::EventIdPtr id = std::make_shared<Smart::NumericCorrelationId>(atoi( param1 ));
								
							status = iter->second.«coordServiceDef.name.toFirstLower»«service.name.toFirstLower»Client->deactivate(id);
							outString.str("");
							switch(status)
							{
							case Smart::SMART_OK:
								outString << "(ok ("<<id<<"))";
								break;
							case Smart::SMART_WRONGID:
								outString << "(error (smart wrongid))";
								break;
							case Smart::SMART_ERROR_COMMUNICATION:
								outString << "(error (smart communication error))";
								break;
							case Smart::SMART_ERROR:
								outString << "(error (unknown error))";
								break;
							default:
								outString << "(error (unknown error))";
								break;
							} // switch
								
						}
						«ENDIF»
					«ENDFOR»
			
				return outString.str();
				
			} else {
				std::cout<<"ERROR WAS NOT ABLE TO FIND CI INSTANCE IN MAP --> this should not have happend!"<<std::endl;
				std::ostringstream outString;
				outString << "(fatal error)";
				return outString.str();
			}
		}
	 '''
	 
	 
	 
 	// CoordinationInterfaceSlaveCORE
 	/////////////////////////////////
	 
  	/*
	 * compileModuleSource switchModule.cc
	 */
	 def compileSwitchCoordinationServiceSource(CoordinationServiceDefinition coordServiceDef) '''	
		#include "«coordServiceDef.name.toFirstUpper»Core.hh"
		#include "runTimeInterface.hh"

		typedef ACE_Singleton<«coordServiceDef.name.toFirstUpper»Core, ACE_Thread_Mutex> «coordServiceDef.name.toUpperCase»_MODULE;

		//INIT FUNCTION
		
		extern "C" int init«coordServiceDef.name»(SmartACE::SmartComponent * component, const std::string& ciInstanceName, const std::map< std::string,  CiConnection, ciLessLibC > &ciConnectionsMap){
			«coordServiceDef.name.toUpperCase»_MODULE::instance()->addNewModuleInstance(ciInstanceName);

			return «coordServiceDef.name.toUpperCase»_MODULE::instance()->initCiInstance(component,ciInstanceName,ciConnectionsMap);
		}

		
		
		//FINI FUNCTION

		extern "C" int fini«coordServiceDef.name»(const std::string& ciInstanceName){
			return «coordServiceDef.name.toUpperCase»_MODULE::instance()->finiCiInstance(ciInstanceName);
		}


		//SWITCH FUNCTION
		
		extern "C" std::string switch«coordServiceDef.name»(const std::string& ciInstanceName, const std::string& componentName, const std::string& componentInstanceName, const std::string& service, const std::string& inString)
		{
			return «coordServiceDef.name.toUpperCase»_MODULE::instance()->switchCi(ciInstanceName,componentName,componentInstanceName,service,inString);
		}
	 '''
	 
	 
	 /////////////////////////////////////////////
	 //serviceHandler Files
	 
	 


	 /////////////////////////////////
	 // EVENT
	 
	  def compileEventHandlerSource(CommunicationServiceUsage service, EventPattern pattern, String coordServiceDefName) '''
		#include "«coordServiceDefName.toFirstUpper»«service.name.toFirstUpper + "EventHandler.hh"»"
		
		std::string «coordServiceDefName.toFirstUpper»«service.name.toFirstUpper»EventHandler::handleEvent(const «pattern.eventType.fullyQualifiedNameCpp» &r) throw() {
			std::string outString;
			
			//convert the event result commObject to string representation outString (to TCL)
			//std::ostringstream ss;
			//ss << "("<< std::setprecision( 2 ) << answer_data<<")";
			//outString = ss.str();
			return outString;
		}

		«pattern.activationType.fullyQualifiedNameCpp» «coordServiceDefName.toFirstUpper»«service.name.toFirstUpper»EventHandler::activateEventParam(const std::string& parameterString){
			«pattern.activationType.fullyQualifiedNameCpp» param;
			
			//fill the event activation (parameter) commObject with the data provided via the inString (from TCL)
			//e.g. param.setLisp(inString);
			return param;
		}
	  '''  
	  
	  
	  def compileEventHandlerHeader(CommunicationServiceUsage port, EventPattern pattern, String coordServiceDefName) '''
		#ifndef _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»EVENTHANDLER_HH_
		#define _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»EVENTHANDLER_HH_
		#include "aceSmartSoft.hh"
		#include <string>
		#include <iostream>
		
		
		#include "«pattern.eventType.userClassHeaderFileNameFQN»"
		#include "«pattern.activationType.userClassHeaderFileNameFQN»"
		
		class «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandler
		{
		public:
			std::string handleEvent(const «pattern.eventType.fullyQualifiedNameCpp» &r) throw();
			«pattern.activationType.fullyQualifiedNameCpp» activateEventParam(const std::string& parameterString);
		};
		
		#endif
	  '''
	  
	  def compileEventHandlerSourceCore(CommunicationServiceUsage port, EventPattern pattern, String coordServiceDefName) '''
		#include "«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper + "EventHandlerCore.hh"»"
		#include "runTimeInterface.hh"
		#include <cstdio>
		#include <iostream>

		«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore::«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore(Smart::IEventClientPattern<«pattern.activationType.fullyQualifiedNameCpp», «pattern.eventType.fullyQualifiedNameCpp»> *client, std::string ciInstanceName)
		: Smart::IEventHandler<«pattern.eventType.fullyQualifiedNameCpp»>(client)
		{
			this->ciInstanceName = ciInstanceName;
		}
				
		void «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const «pattern.eventType.fullyQualifiedNameCpp» &r) {
			std::cout<<"Event CORE Called!"<<std::endl;
			std::string resultString;
			resultString = userHandler.handleEvent(r);
			
			std::ostringstream eventResult;
			eventResult<< "(";
			eventResult<< "( coordination-interfaces-type . \"«coordServiceDefName»\")";
			eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
			eventResult<< "( service-name . \"«port.name»\")";
			eventResult<< "( id . "<<id<<")";
			eventResult<< "( data . \""<<resultString<<"\")";
			eventResult<< ")";
		//	eventResult<<"((\"«coordServiceDefName»\" "<<this->ciInstanceName<<" \"«port.name»\" "<<id<<") "<<resultString<<")";
			int result = appedEvent(eventResult.str());
		}
		
		«pattern.activationType.fullyQualifiedNameCpp» «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore::activateEventParam(const std::string& parameterString){
			std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
			return userHandler.activateEventParam(parameterString);
		}
	  '''
	  
	  def compileEventHandlerHeaderCore(CommunicationServiceUsage port, EventPattern pattern, String coordServiceDefName) '''
		#ifndef _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»EVENTHANDLERCORE_HH_
		#define _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»EVENTHANDLERCORE_HH_
		#include "aceSmartSoft.hh"
		#include <string>
		
		#include "«pattern.eventType.userClassHeaderFileNameFQN»"
		#include "«pattern.activationType.userClassHeaderFileNameFQN»"
		#include "«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper + "EventHandler.hh"»"
		
		class «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore : public Smart::IEventHandler<«pattern.eventType.fullyQualifiedNameCpp»>
		{
		public:
			«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandlerCore(Smart::IEventClientPattern<«pattern.activationType.fullyQualifiedNameCpp», «pattern.eventType.fullyQualifiedNameCpp»> *client, std::string moduleInstanceName);
			virtual void handleEvent(const Smart::EventIdPtr &id, const «pattern.eventType.fullyQualifiedNameCpp» &r) override;
			«pattern.activationType.fullyQualifiedNameCpp» activateEventParam(const std::string& parameterString);
		private:
			«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»EventHandler userHandler;
			std::string ciInstanceName;
		};
		
		#endif
	  '''
  	 // EVENT
  	 /////////////////////////////////
  	 
  	 
  	 /////////////////////////////////
   	 // QUERY
	 
  	def compileQuerySource(CommunicationServiceUsage port, QueryPattern pattern, String coordServiceDefName) '''
		#include "«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper + "QueryHandler.hh"»"
		  
		«pattern.requestType.fullyQualifiedNameCpp» «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»QueryHandler::handleRequest(const std::string& inString){

			«pattern.requestType.fullyQualifiedNameCpp» request;
			//fill the request commObject with the data provided via the inString (from TCL)
			//e.g. request.setLisp(inString);

			return request;
		}

		std::string «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»QueryHandler::handleAnswer(const «pattern.answerType.fullyQualifiedNameCpp»& answer){
			
			std::string outString;
			//fill the outString (to TCL) with the data provided via the answer commObject
			//e.g. 
			//std::ostringstream ss;
			//ss << "("<< std::setprecision( 2 ) << answer_data<<")";
			//outString = ss.str();
			return outString;
		}
	  '''
	 
	 
	 def compileQueryHeader(CommunicationServiceUsage port, QueryPattern pattern, String coordServiceDefName) '''
		#ifndef _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»QUERYHANDLER_HH_
		#define _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»QUERYHANDLER_HH_

		#include "«pattern.requestType.userClassHeaderFileNameFQN»"
		#include "«pattern.answerType.userClassHeaderFileNameFQN»"
		#include <string>
		
		class «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»QueryHandler
		{
		public:
		
			«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»QueryHandler(){
		
			}
		
			«pattern.requestType.fullyQualifiedNameCpp» handleRequest(const std::string& inString);
		
			std::string handleAnswer(const «pattern.answerType.fullyQualifiedNameCpp»& answer);
		};
		
		#endif
	 '''

   	 // QUERY
  	 /////////////////////////////////
  	 
  	 /////////////////////////////////
	 // SEND
	 
 	def compileSendHeader(CommunicationServiceUsage port, SendPattern pattern, String coordServiceDefName) '''
		#ifndef _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»SENDHANDLER_HH_
		#define _«coordServiceDefName.toUpperCase»«port.name.toUpperCase»SENDHANDLER_HH_

		#include "«pattern.dataType.userClassHeaderFileNameFQN»"
		#include <string>
		
		class «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»SendHandler
		{
		public:
		
			«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»SendHandler(){
		
			}
		
			«pattern.dataType.fullyQualifiedNameCpp» handleSend(std::string inString);
		};
		
		#endif
	 '''
	 
	def compileSendSource(CommunicationServiceUsage port, SendPattern pattern, String coordServiceDefName) '''
		#include "«coordServiceDefName.toFirstUpper»«port.name.toFirstUpper + "SendHandler.hh"»"
		  
		«pattern.dataType.fullyQualifiedNameCpp» «coordServiceDefName.toFirstUpper»«port.name.toFirstUpper»SendHandler::handleSend(std::string inString){

			«pattern.dataType.fullyQualifiedNameCpp» sendCommObject;

			//fill the send commObject with the data provided via the inString (from TCL)
			
			//sendCommObject.setData(inString);

			return sendCommObject;
		}

	  '''
	 // SEND
  	 /////////////////////////////////

	 //serviceHandler Files
	 /////////////////////////////////////////////
}