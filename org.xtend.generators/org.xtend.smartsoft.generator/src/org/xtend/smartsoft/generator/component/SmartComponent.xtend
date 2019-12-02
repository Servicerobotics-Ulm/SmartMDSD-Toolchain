//===============================================================
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//  Copyright (C) 2009-2011 Dennis Stampfer, Andreas Steck
//  Copyright (C) since 2012 Alex lotz
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
import org.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.ecore.component.performanceExtension.ActivationConstraints
import org.ecore.component.componentDefinition.AnswerPort
import org.ecore.component.componentDefinition.InputPort
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.seronetExtension.MixedPortROS
import org.ecore.component.seronetExtension.MixedPortYARP
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.component.performanceExtension.DefaultTrigger
import org.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.ecore.component.performanceExtension.DefaultInputTrigger
import org.ecore.component.coordinationExtension.CoordinationMasterPort
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.component.coordinationExtension.PublicOperationMode
import org.ecore.component.componentParameter.ComponentParametersRef
import org.ecore.component.componentDefinition.AbstractComponentElement
import org.ecore.service.roboticMiddleware.ACE_SmartSoft

class SmartComponent {
	@Inject extension CopyrightHelpers
	@Inject extension SmartIniParameter
	@Inject extension CommObjectGenHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension SmartTask
	@Inject extension SmartInputHandler
	@Inject extension SmartQueryHandler
	@Inject extension SmartComponentPortFactory
	@Inject extension SmartComponentExtension

//	@Inject extension ComponentDefinitionModelUtility
	
	def String getCompImplHeaderFilename(ComponentDefinition component) '''«component.name»Impl.hh'''
	
	def String getCompImplSourceFilename(ComponentDefinition component) '''«component.name»Impl.cc'''
	
	def String getCompHeaderFilename(ComponentDefinition component) '''«component.name».hh'''
	
	def String getCompSourceFilename(ComponentDefinition component) '''«component.name».cc'''
	
	def String getCoreUserHeaderFilename(ComponentDefinition component) '''«component.name»Core.hh'''
	
	def String getCoreUserSourceFilename(ComponentDefinition component) '''«component.name»Core.cc'''
	
	def String getComponentDefinitionSingletonShortcut() '''COMP'''
	
	def String getCoreName(ComponentDefinition component) '''«component.name»Core'''
	
	def String getSingletonName(ComponentDefinition component) '''_«component.name.toFirstLower»'''
	
	def String getParameterIniFileName(ComponentDefinition comp) { comp.name + ".ini.head" }
		
	/////////////////////////////////////////////////////
	// main.cc 
	/////////////////////////////////////////////////////
	def MainFileContent(ComponentDefinition component) '''
		«getCopyright()»
		#include <iostream>
		#include "«component.getCompHeaderFilename()»"
		
		int main(int argc, char *argv[])
		{
			std::cout << "main...\n";
			// initialize component infrastructure (loading ini-file, creating ports, tasks, etc.)
			«component.name»::instance()->init(argc, argv);
			// run component infrastructure until the component is commanded to shutdown
			«component.name»::instance()->run();
			// clean-up component's internal resources (deleting ports, tasks, etc.)
			«component.name»::instance()->fini();
			// destroy the component's singleton
			«component.name»::deleteInstance();
			std::cout << "... main() end. return 0." << std::endl;
			return 0;
		}
	'''
	
	
	/////////////////////////////////////////////////////
	// COMPNAMEImpl.hh
	/////////////////////////////////////////////////////
	def CompImplHeaderFileContent(ComponentDefinition component) '''
		«getCopyright()»
		#ifndef _«component.name.toUpperCase»IMPL_HH
		#define _«component.name.toUpperCase»IMPL_HH
		
		#include <chrono>
		#include "aceSmartSoft.hh"
		
		class «component.name»Impl : public SmartACE::SmartComponent {
		public:
			«component.name»Impl(const std::string &componentName, int & argc, char ** argv);
			«component.name»Impl(const std::string &componentName, int & argc, char ** argv, const ACE_Sched_Params &sched_params);
			virtual ~«component.name»Impl();
		
			int startComponentInfrastructure();
			void stopComponentInfrastructure(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2));
			void cleanUpComponentResources();
		};
		
		#endif
	''' 
	
	
	/////////////////////////////////////////////////////
	// COMPNAMEImpl.cc
	/////////////////////////////////////////////////////
	def CompImplSourceFileContent(ComponentDefinition component) '''
		«getCopyright()»
		#include "«component.getCompImplHeaderFilename»"
		
		«component.getName()»Impl::«component.getName()»Impl(const std::string &componentName, int & argc, char ** argv)
		:	SmartACE::SmartComponent(componentName, argc, argv)
		{  }
		
		«component.getName()»Impl::«component.getName()»Impl(const std::string &componentName, int & argc, char ** argv, const ACE_Sched_Params &sched_params)
		:	SmartACE::SmartComponent(componentName, argc, argv, NULL, sched_params)
		{  }
		
		«component.getName()»Impl::~«component.getName()»Impl() 
		{  }
		
		int «component.getName()»Impl::startComponentInfrastructure(void)
		{
			// open thread for managing all server-initiated-disconnects in this component
			srvInitDiscHandler.start();
		
			// if meanwile strg+c was called -> return immediatelly, without waiting on substate or reactor
			if(!first_call_of_handle_signal) return -1;
		
			componentIsRunning = true;
			return 0;
		}
		
		void «component.getName()»Impl::stopComponentInfrastructure(const std::chrono::steady_clock::duration &timeoutTime)
		{
			this->signalSmartTasksToStop(timeoutTime);
		}
		void «component.getName()»Impl::cleanUpComponentResources()
		{
			this->cleanUpInternalResources();
		}
	''' 
	
	
	
	/////////////////////////////////////////////////////
	// COMPNAME.hh
	/////////////////////////////////////////////////////
	def CompHeaderFileContent(ComponentDefinition component) '''
		«getCopyright()»
		#ifndef _«component.getName().toUpperCase()»_HH
		#define _«component.getName().toUpperCase()»_HH
		
		#include <map>
		#include <iostream>
		#include "aceSmartSoft.hh"
		#include "smartQueryServerTaskTrigger_T.h"
		#include "«component.getCoreUserHeaderFilename()»"
		
		#include "«component.portFactoryInterfaceFilename»"
		#include "«component.componentExtensionHeaderFilename»"
		
		// forward declarations
		class «component.name»PortFactoryInterface;
		class «component.name»Extension;
		
		«FOR ext: componentGeneratorExtensions»
		// includes for «ext.getExtensionName(component)»
		«ext.getHeaderIncludes(component)»
		
		«ENDFOR»
		
		// include communication objects
		«FOR obj : ComponentDefinitionModelUtility.getAllCommObjects(component).sortBy[it.name]»
			#include <«obj.userClassHeaderFileNameFQN»>
			#include <«obj.serailizationHeaderFileNameFQN»>
		«ENDFOR»
		
		// include tasks
		«FOR task : component.activities.sortBy(e | e.name)»
			#include "«task.TaskUserHeaderFileName»"
		«ENDFOR»
		// include UpcallManagers
		«FOR input: component.inputPorts.sortBy[it.name]»
			#include "«input.UpcallManagerHeaderFileName»"
		«ENDFOR»
		
		// include input-handler(s)
		«FOR handler : component.inputHandlers.sortBy(e | e.name)»
			#include "«handler.InputHandlerUserHeaderFileName»"
		«ENDFOR»
		// include request-handler(s)
		«FOR handler : component.requestHandlers.sortBy(e | e.name)»
			#include "«handler.QueryServerHandlerUserHeaderFileName»"
		«ENDFOR»
		
		// include handler
		#include "CompHandler.hh"
		
«««		«FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Class)).toIterable.sortBy(e | e.name)»
«««			«IF cl.stereotype instanceof profile.SmartHandler»
«««				#include "«(cl.stereotype as profile.SmartHandler).HandlerUserHeaderFileName»"
«««			«ENDIF»
«««		«ENDFOR»
«««		
		«IF component.hasParameters»
		#include "ParameterStateStruct.hh"
		#include "ParameterUpdateHandler.hh"
		«ENDIF»
		
		#include "SmartStateChangeHandler.hh"
		
		#define «getComponentDefinitionSingletonShortcut» «component.getName()»::instance()
		
		class «component.getName()» : public «component.getCoreName()» {
		private:
			static «component.getName()» *«component.getSingletonName()»;
			
			// constructor
			«component.getName()»();
			
			// copy-constructor
			«component.getName()»(const «component.getName()»& cc);
			
			// destructor
			~«component.getName()»() { };
			
			// load parameter from ini file
			void loadParameter(int argc, char* argv[]);
			
			// instantiate comp-handler
			CompHandler compHandler;
			
			// helper method that maps a string-name to an according TaskTriggerSubject
			Smart::TaskTriggerSubject* getInputTaskTriggerFromString(const std::string &client);
			
			// internal map storing the different port-creation factories (that internally map to specific middleware implementations)
			std::map<std::string, «component.name»PortFactoryInterface*> portFactoryRegistry;
			
			// internal map storing various extensions of this component class
			std::map<std::string, «component.name»Extension*> componentExtensionRegistry;
			
		public:
			«IF component.hasParameters»
				ParameterStateStruct getGlobalState() const
				{
					return paramHandler.getGlobalState();
				}
				
				ParameterStateStruct getParameters() const
				{
					return paramHandler.getGlobalState();
				}
			«ENDIF»
«««		    
«««		    // instantiate handler
«««			«FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Class)).toIterable.sortBy(e | e.name)»
«««				«IF cl.stereotype instanceof profile.SmartHandler»
«««				«(cl.stereotype as profile.SmartHandler).nameClass» *«(cl.stereotype as profile.SmartHandler).nameInstance»;
«««				«ENDIF»
«««			«ENDFOR»
			
			// define tasks
			«FOR task : component.activities.sortBy(e | e.name)»
				Smart::TaskTriggerSubject* «task.nameInstance»Trigger;
				«task.nameClass» *«task.nameInstance»;
			«ENDFOR»
			
			// define input-ports
			«FOR input: component.inputPorts.sortBy[it.name]»
				// InputPort «input.name»
				«input.portDefinition» *«input.nameInstance»;
				Smart::InputTaskTrigger<«input.inputHandlerCommObject»> *«input.nameInstance»InputTaskTrigger;
				«input.nameClass»UpcallManager *«input.nameInstance»UpcallManager;
			«ENDFOR»
			
			// define request-ports
			«FOR request: component.requestPorts.sortBy[it.name]»
				«request.portDefinition» *«request.nameInstance»;
			«ENDFOR»
			
			// define input-handler
			«FOR handler: component.inputHandlers.sortBy[it.name]»
				«handler.nameClass» *«handler.nameInstance»;
			«ENDFOR»
			
			// define output-ports
			«FOR output: component.outputPorts.sortBy[it.name]»
				«output.portDefinition» *«output.nameInstance»;
				«IF output.isEventServer»
				std::shared_ptr<Smart::IEventTestHandler<«output.getCommObjectCppList(true)»>> «output.nameInstance»EventTestHandler;
				«ENDIF»
			«ENDFOR»
			
			// define answer-ports
			«FOR answer: component.answerPorts.sortBy[it.name]»
				«answer.portDefinition» *«answer.nameInstance»;
				Smart::QueryServerTaskTrigger<«answer.inputHandlerCommObject»> *«answer.nameInstance»InputTaskTrigger;
			«ENDFOR»
			
			// define request-handlers
			«FOR handler: component.requestHandlers.sortBy[it.name]»
				«handler.nameClass» *«handler.nameInstance»;
			«ENDFOR»
			
			«FOR ext: componentGeneratorExtensions»
			// definitions of «ext.getExtensionName(component)»
			«ext.getClassMemberDefinition(component)»
			
			«ENDFOR»
			
			// define default slave ports
			SmartACE::StateSlave *stateSlave;
			SmartStateChangeHandler *stateChangeHandler;
			SmartACE::WiringSlave *wiringSlave;
			«IF component.hasParameters»
				ParamUpdateHandler paramHandler;
				SmartACE::ParameterSlave *param;
			«ENDIF»
			
			«IF component.elements.exists[it instanceof CoordinationMasterPort]»
				// define master ports
				SmartACE::StateMaster *stateMaster;
				SmartACE::ParameterMaster *paramMaster;
				SmartACE::WiringMaster *wiringMaster;
			«ENDIF»
			
			/// this method is used to register different PortFactory classes (one for each supported middleware framework)
			void addPortFactory(const std::string &name, «component.name»PortFactoryInterface *portFactory);
			
			SmartACE::SmartComponent* getComponentImpl();
			
			/// this method is used to register different component-extension classes
			void addExtension(«component.name»Extension *extension);
			
			/// this method allows to access the registered component-extensions (automatically converting to the actuall implementation type)
			template <typename T>
			T* getExtension(const std::string &name) {
				auto it = componentExtensionRegistry.find(name);
				if(it != componentExtensionRegistry.end()) {
					return dynamic_cast<T*>(it->second);
				}
				return 0;
			}
			
			/// initialize component's internal members
			void init(int argc, char *argv[]);
			
			/// execute the component's infrastructure
			void run();
			
			/// clean-up component's resources
			void fini();
			
			/// call this method to set the overall component into the Alive state (i.e. component is then ready to operate)
			void setStartupFinished();
			
			/// connect all component's client ports
			Smart::StatusCode connectAndStartAllServices();
			
			/// start all assocuated Activities
			void startAllTasks();
			
			/// start all associated timers
			void startAllTimers();
			
			«FOR client: component.allClientPorts.sortBy[it.name]»
			Smart::StatusCode connect«client.nameClass»(const std::string &serverName, const std::string &serviceName);
			«ENDFOR»
		
			// return singleton instance
			static «component.nameClass»* instance()
			{
				if(«component.getSingletonName()» == 0) {
					«component.getSingletonName()» = new «component.nameClass»();
				}
				return «component.getSingletonName()»;
			}
			
			static void deleteInstance() {
				if(«component.getSingletonName()» != 0) {
					delete «component.getSingletonName()»;
				}
			}
			
			«component.CreateIniStruct»
		};
		#endif
	''' 
	
	def private isVirtualElement(AbstractComponentElement element) {
		if(element instanceof CoordinationSlavePort
			|| element instanceof CoordinationMasterPort
			|| element instanceof ComponentParametersRef
			|| element instanceof MixedPortROS
			|| element instanceof MixedPortYARP
		) {
			return true
		}
		return false
	}
	
	/////////////////////////////////////////////////////
	// COMPNAME.cc
	/////////////////////////////////////////////////////
	def CompSourceFileContent(ComponentDefinition component) 
	'''
		«getCopyright()»
		#include "«component.getCompHeaderFilename()»"
		#include "smartTimedTaskTrigger.h"
		//FIXME: implement logging
		//#include "smartGlobalLogger.hh"

		// the ace port-factory is used as a default port-mapping
		#include "«component.acePortFactoryHeaderFilename»"
		
		«FOR initiator: component.ports.filter[it.isEventServer].sortBy[it.name]»
		#include "«initiator.nameClass»EventTestHandler.hh"
		«ENDFOR»
		
		// initialize static singleton pointer to zero
		«component.getName()»* «component.getName()»::«component.getSingletonName()» = 0;
		
		// constructor
		«component.getName()»::«component.getName()»()
		{
			std::cout << "constructor of «component.getName()»\n";
			
			// set all pointer members to NULL
			«FOR element : component.elements.sortBy(e | e.nameOriginal)»
				«IF element.isVirtualElement==true»//«ENDIF»«element.nameInstance» = NULL;
				«IF element instanceof InputPort»
					«element.nameInstance»InputTaskTrigger = NULL;
					«element.nameInstance»UpcallManager = NULL;
				«ELSEIF element instanceof Activity»
					«element.nameInstance»Trigger = NULL;
				«ELSEIF element instanceof AnswerPort»
					«element.nameInstance»InputTaskTrigger = NULL;
				«ELSEIF element.isEventServer»
					«element.nameInstance»EventTestHandler = nullptr; 
				«ENDIF»
			«ENDFOR»
«««		    «FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Port)).toIterable.sortBy(e | e.name)»
«««				«IF cl.stereotype instanceof profile.SmartSendServer»
«««					«var port = (cl.stereotype as profile.SmartSendServer)»
«««					«IF port.smartSendHandler.active»
«««						thread«port.smartSendHandler.nameClass» = NULL;
«««					«ENDIF»
«««				«ELSEIF cl.stereotype instanceof profile.SmartQueryServer»
«««					«var port = (cl.stereotype as profile.SmartQueryServer)»
«««					«IF port.smartQueryHandler.active»
«««						thread«port.smartQueryHandler.nameClass» = NULL;
«««					«ENDIF»
«««				«ELSEIF cl.stereotype instanceof profile.SmartPushTimedServer»
«««					«var port = (cl.stereotype as profile.SmartPushTimedServer)»
«««					«IF port.smartPushTimedHandler.active»
«««						thread«port.smartPushTimedHandler.nameClass» = NULL;
«««					«ENDIF»
«««				«ENDIF»
«««			«ENDFOR»
«««			«FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Class)).toIterable.sortBy(e | e.name)»
«««				«IF cl.stereotype instanceof profile.SmartHandler»
«««				«(cl.stereotype as profile.SmartHandler).nameInstance» = NULL;
«««				«ENDIF»
«««			«ENDFOR»
«««			«FOR p : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Port)).toIterable»
«««				«IF p.stereotype instanceof profile.SmartMasterSlaveInteractionPattern»
«««					«(p.stereotype as profile.SmartMasterSlaveInteractionPattern).nameInstance» = NULL;
«««				«ENDIF»
«««			«ENDFOR»
			stateChangeHandler = NULL;
			stateSlave = NULL;
			wiringSlave = NULL;
			«IF component.hasParameters»param = NULL;«ENDIF»
			«IF component.elements.exists[it instanceof CoordinationMasterPort]»
				stateMaster = NULL;
				paramMaster = NULL;
				wiringMaster = NULL;
			«ENDIF»
			
			«component.iniParametersConstructor»
		}

		void «component.getName()»::addPortFactory(const std::string &name, «component.name»PortFactoryInterface *portFactory)
		{
			portFactoryRegistry[name] = portFactory;
		}
		
		void «component.getName()»::addExtension(«component.name»Extension *extension)
		{
			componentExtensionRegistry[extension->getName()] = extension;
		}
		
		SmartACE::SmartComponent* «component.getName()»::getComponentImpl()
		{
			return dynamic_cast<«component.getName()»AcePortFactory*>(portFactoryRegistry["ACE_SmartSoft"])->getComponentImpl();
		}

		/**
		 * Notify the component that setup/initialization is finished.
		 * You may call this function from anywhere in the component.
		 *
		 * Set component's internal lifecycle state automaton (if any) into 
		 * Alive mode (from here on the component is ready to provide its services)
		 */
		void «component.getName()»::setStartupFinished() {
			stateSlave->setWaitState("Alive");
			std::cout << "ComponentDefinition initialization/startup finished." << std::endl;
		}
		
		
		«FOR client: component.allClientPorts.sortBy[it.name]»
			Smart::StatusCode «component.getName()»::connect«client.nameClass»(const std::string &serverName, const std::string &serviceName) {
				Smart::StatusCode status;
				
				«IF client.isOptional»
				if(connections.«client.nameInstance».initialConnect == false) {
					return Smart::SMART_OK;
				}
				«ENDIF»
				std::cout << "connecting to: " << serverName << "; " << serviceName << std::endl;
				status = «client.nameInstance»->connect(serverName, serviceName);
				while(status != Smart::SMART_OK)
				{
					ACE_OS::sleep(ACE_Time_Value(0,500000));
					status = COMP->«client.nameInstance»->connect(serverName, serviceName);
				}
				std::cout << "connected.\n";
				«IF client.isSubscriber»
				«client.nameInstance»->subscribe(connections.«client.nameInstance».interval);
				«ENDIF»
				return status;
			}
		«ENDFOR»
		
		
		/**
		 * First connect ALL client ports contained in this component, then start all services:
		 * activate state, push, etc...
		 */
		Smart::StatusCode «component.getName()»::connectAndStartAllServices() {
			Smart::StatusCode status = Smart::SMART_OK;
			
			«FOR client: component.allClientPorts.sortBy[it.name]»
				status = connect«client.nameClass»(connections.«client.nameInstance».serverName, connections.«client.nameInstance».serviceName);
				if(status != Smart::SMART_OK) return status;
			«ENDFOR»
			return status;
		}

		/**
		 * Start all tasks contained in this component.
		 */
		void «component.getName()»::startAllTasks() {
			«FOR task : component.activities.sortBy(e | e.name)»
				// start task «task.nameOriginal»
				if(connections.«task.nameInstance».scheduler != "DEFAULT") {
					ACE_Sched_Params «task.nameInstance»_SchedParams(ACE_SCHED_OTHER, ACE_THR_PRI_OTHER_DEF);
					if(connections.«task.nameInstance».scheduler == "FIFO") {
						«task.nameInstance»_SchedParams.policy(ACE_SCHED_FIFO);
						«task.nameInstance»_SchedParams.priority(ACE_THR_PRI_FIFO_MIN);
					} else if(connections.«task.nameInstance».scheduler == "RR") {
						«task.nameInstance»_SchedParams.policy(ACE_SCHED_RR);
						«task.nameInstance»_SchedParams.priority(ACE_THR_PRI_RR_MIN);
					}
					«task.nameInstance»->start(«task.nameInstance»_SchedParams, connections.«task.nameInstance».cpuAffinity);
				} else {
					«task.nameInstance»->start();
				}
			«ENDFOR»
		}
		
		/**
		 * Start all timers contained in this component
		 */
		void «component.getName()»::startAllTimers() {
«««			«FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Class)).toIterable.sortBy(e | e.name)»
«««				«IF cl.isStereotypeApplied("profile::SmartTimer")»
«««					// start SmartTimer
«««					COMP->«(cl.stereotype as profile.SmartTimer).nameInstance»->start();
«««				«ENDIF»
«««			«ENDFOR»
		}


		Smart::TaskTriggerSubject* «component.getName()»::getInputTaskTriggerFromString(const std::string &client)
		{
			«FOR input: component.inputPorts.sortBy[it.name]»
				if(client == "«input.nameOriginal»") return «input.nameInstance»InputTaskTrigger;
			«ENDFOR»
			
			return NULL;
		}


		void «component.getName()»::init(int argc, char *argv[])
		{
			try {
				Smart::StatusCode status;
				
				// load initial parameters from ini-file (if found)
				loadParameter(argc, argv);
				
				«IF component.hasParameters»
				// print out the actual parameters which are used to initialize the component
				std::cout << " \nComponentDefinition Initial-Parameters:\n" << COMP->getParameters() << std::endl;
				«ENDIF»
				
				«FOR ext: componentGeneratorExtensions»
				// initializations of «ext.getExtensionName(component)»
				«ext.getClassMemberInitialization(component)»
				
				«ENDFOR»
				
				// initialize all registered port-factories
				for(auto portFactory = portFactoryRegistry.begin(); portFactory != portFactoryRegistry.end(); portFactory++) 
				{
					portFactory->second->initialize(this, argc, argv);
				}
				
				// initialize all registered component-extensions
				for(auto extension = componentExtensionRegistry.begin(); extension != componentExtensionRegistry.end(); extension++) 
				{
					extension->second->initialize(this, argc, argv);
				}
				
				«component.name»PortFactoryInterface *acePortFactory = portFactoryRegistry["«ACE_SmartSoft.simpleName»"];
				if(acePortFactory == 0) {
					std::cerr << "ERROR: acePortFactory NOT instantiated -> exit(-1)" << std::endl;
					exit(-1);
				}
				
				// this pointer is used for backwards compatibility (deprecated: should be removed as soon as all patterns, including coordination, are moved to port-factory)
				SmartACE::SmartComponent *component = dynamic_cast<«component.name»AcePortFactory*>(acePortFactory)->getComponentImpl();
				
				std::cout << "ComponentDefinition «component.getName()» is named " << connections.component.name << std::endl;
				
				if(connections.component.useLogger == true) {
					//FIXME: use logging
					//Smart::LOGGER->openLogFileInFolder("data/"+connections.component.name);
					//Smart::LOGGER->startLogging();
				}

				// create event-test handlers (if needed)
				«FOR output: component.outputPorts.sortBy[it.name]»
					«IF output.isEventServer»
						«output.nameInstance»EventTestHandler = std::make_shared<«output.nameClass»EventTestHandler>();
					«ENDIF»
				«ENDFOR»
				
				// create server ports
				// TODO: set minCycleTime from Ini-file
				«FOR server: component.allServerPorts.sortBy[it.name]»
					«IF server.isEventServer»
						«server.nameInstance»EventTestHandler = std::make_shared<«server.nameClass»EventTestHandler>();
						«server.nameInstance» = portFactoryRegistry[connections.«server.nameInstance».roboticMiddleware]->create«server.nameClass»(connections.«server.nameInstance».serviceName, «server.nameInstance»EventTestHandler);
					«ELSE»
						«server.nameInstance» = portFactoryRegistry[connections.«server.nameInstance».roboticMiddleware]->create«server.nameClass»(connections.«server.nameInstance».serviceName);
					«ENDIF»
					«IF server instanceof AnswerPort»
						«server.nameInstance»InputTaskTrigger = new Smart::QueryServerTaskTrigger<«server.inputHandlerCommObject»>(«server.nameInstance»);
					«ENDIF»
				«ENDFOR»
				
				// create client ports
				«FOR client: component.allClientPorts.sortBy[it.name]»
				«client.nameInstance» = portFactoryRegistry[connections.«client.nameInstance».roboticMiddleware]->create«client.nameClass»();
				«ENDFOR»
				
				// create InputTaskTriggers and UpcallManagers
				«FOR input: component.inputPorts.sortBy[it.name]»
					«input.nameInstance»InputTaskTrigger = new Smart::InputTaskTrigger<«input.inputHandlerCommObject»>(«input.nameInstance»);
					«input.nameInstance»UpcallManager = new «input.nameClass»UpcallManager(«input.nameInstance»);
				«ENDFOR»
				
				// create input-handler
				«FOR handler: component.inputHandlers.sortBy[it.name]»
					«handler.nameInstance» = new «handler.nameClass»(«handler.inputPort.nameInstance», connections.«handler.nameInstance».prescale);
				«ENDFOR»
				
				// create request-handlers
				«FOR handler: component.requestHandlers.sortBy[it.name]»
					«handler.nameInstance» = new «handler.nameClass»(«handler.answerPort.nameInstance»);
				«ENDFOR»
				
				// create state pattern
				stateChangeHandler = new SmartStateChangeHandler();
				stateSlave = new SmartACE::StateSlave(component, stateChangeHandler);
				«FOR slave: component.elements.filter(CoordinationSlavePort)»
					«FOR mode: slave.elements.filter(PublicOperationMode)»
						«FOR sub: mode.activates»
							if (stateSlave->defineStates("«mode.name»" ,"«sub.name»") != Smart::SMART_OK) std::cerr << "ERROR: defining state combinaion «mode.name».«sub.name»" << std::endl;
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
				status = stateSlave->setUpInitialState(connections.component.initialComponentMode);
				if (status != Smart::SMART_OK) std::cerr << status << "; failed setting initial ComponentMode: " << connections.component.initialComponentMode << std::endl;
				// activate state slave
				status = stateSlave->activate();
				if(status != Smart::SMART_OK) std::cerr << "ERROR: activate state" << std::endl;
				
				wiringSlave = new SmartACE::WiringSlave(component);
				// add client port to wiring slave
				«FOR client: component.allClientPorts.sortBy[it.name]»
				if(connections.«client.nameInstance».roboticMiddleware == "«ACE_SmartSoft.simpleName»") {
					//FIXME: this must also work with other implementations
					dynamic_cast<«client.portImplementation»*>(«client.nameInstance»)->add(wiringSlave, connections.«client.nameInstance».wiringName);
				}
				«ENDFOR»
				
				«IF component.hasParameters»
				// create parameter slave
				param = new SmartACE::ParameterSlave(component, &paramHandler);
				«ENDIF»
				
				«IF component.elements.exists[it instanceof CoordinationMasterPort]»
					// create master ports
					stateMaster = new SmartACE::StateMaster(component);
					paramMaster = new SmartACE::ParameterMaster(component);
					wiringMaster = new SmartACE::WiringMaster(component);
				«ENDIF»
				
				«FOR task : component.activities.sortBy(e | e.name)»
					// create Task «task.name»
					«task.nameInstance» = new «task.nameClass»(component);
					// configure input-links
					«FOR inLink: task.inputLinks.sortBy[it.name]»
					«inLink.inputPort.nameInstance»UpcallManager->attach(«task.nameInstance»);
					«ENDFOR»
«««					«task.nameInstance»->setUpLogging(«component.activities.indexOf(task)»*10, connections.component.useLogger);
					// configure task-trigger (if task is configurable)
					«IF !task.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
					if(connections.«task.nameInstance».trigger == "PeriodicTimer") {
						// create PeriodicTimerTrigger
						int microseconds = 1000*1000 / connections.«task.nameInstance».periodicActFreq;
						if(microseconds > 0) {
							Smart::TimedTaskTrigger *triggerPtr = new Smart::TimedTaskTrigger();
							triggerPtr->attach(«task.nameInstance»);
							component->getTimerManager()->scheduleTimer(triggerPtr, (void *) 0, std::chrono::microseconds(microseconds), std::chrono::microseconds(microseconds));
							// store trigger in class member
							«task.nameInstance»Trigger = triggerPtr;
						} else {
							std::cerr << "ERROR: could not set-up Timer with cycle-time " << microseconds << " as activation source for Task «task.nameClass»" << std::endl;
						}
					} else if(connections.«task.nameInstance».trigger == "DataTriggered") {
						«task.nameInstance»Trigger = getInputTaskTriggerFromString(connections.«task.nameInstance».inPortRef);
						if(«task.nameInstance»Trigger != NULL) {
							«task.nameInstance»Trigger->attach(«task.nameInstance», connections.«task.nameInstance».prescale);
						} else {
							std::cerr << "ERROR: could not set-up InPort " << connections.«task.nameInstance».inPortRef << " as activation source for Task «task.nameClass»" << std::endl;
						}
					} «IF task.extensions.exists[it instanceof DefaultTrigger]»else«ENDIF»
					«ENDIF»
					«FOR trigger: task.extensions.filter(DefaultTrigger)»
					{
						«IF trigger instanceof DefaultPeriodicTimer»
							// setup default task-trigger as PeriodicTimer
							Smart::TimedTaskTrigger *triggerPtr = new Smart::TimedTaskTrigger();
							int microseconds = 1000*1000 / «trigger.periodicActFreq»;
							if(microseconds > 0) {
								component->getTimerManager()->scheduleTimer(triggerPtr, (void *) 0, std::chrono::microseconds(microseconds), std::chrono::microseconds(microseconds));
								triggerPtr->attach(«task.nameInstance»);
								// store trigger in class member
								«task.nameInstance»Trigger = triggerPtr;
							} else {
								std::cerr << "ERROR: could not set-up Timer with cycle-time " << microseconds << " as activation source for Task «task.nameClass»" << std::endl;
							}
						«ELSEIF trigger instanceof DefaultInputTrigger»
							// setup default task-trigger as InputTrigger
							«task.nameInstance»Trigger = getInputTaskTriggerFromString("«(trigger as DefaultInputTrigger).inputLink.name»");
							if(«task.nameInstance»Trigger != NULL) {
								«task.nameInstance»Trigger->attach(«task.nameInstance», connections.«task.nameInstance».prescale);
							} else {
								std::cerr << "ERROR: could not set-up InPort «(trigger as DefaultInputTrigger).inputLink.name» as activation source for Task «task.nameClass»" << std::endl;
							}
						«ENDIF»
					}
					«ENDFOR»
					
«««					«IF cl.stereotype instanceof profile.SmartTimer»
«««						«(cl.stereotype as profile.SmartTimer).nameInstance» = new «(cl.stereotype as profile.SmartTimer).nameClass»();
«««					«ENDIF»
				«ENDFOR»
				
				// link observers with subjects
				«FOR node: component.subNodes.sortBy(e|e.name)»
					«FOR observer: node.observers»
						«observer.subject.nameInstance»->attach_interaction_observer(«node.nameInstance»);
					«ENDFOR»
				«ENDFOR»
			} catch (const std::exception &ex) {
				std::cerr << "Uncaught std exception" << ex.what() << std::endl;
			} catch (...) {
				std::cerr << "Uncaught exception" << std::endl;
			}
		}
		
		// run the component
		void «component.getName()»::run()
		{
			stateSlave->acquire("init");
			// startup all registered port-factories
			for(auto portFactory = portFactoryRegistry.begin(); portFactory != portFactoryRegistry.end(); portFactory++) 
			{
				portFactory->second->onStartup();
			}
			
			// startup all registered component-extensions
			for(auto extension = componentExtensionRegistry.begin(); extension != componentExtensionRegistry.end(); extension++) 
			{
				extension->second->onStartup();
			}
			stateSlave->release("init");
			
			// do not call this handler within the init state (see above) as this handler internally calls setStartupFinished() (this should be fixed in future)
			compHandler.onStartup();
			
			// this call blocks until the component is commanded to shutdown
			stateSlave->acquire("shutdown");
			
			// shutdown all registered component-extensions
			for(auto extension = componentExtensionRegistry.begin(); extension != componentExtensionRegistry.end(); extension++) 
			{
				extension->second->onShutdown();
			}
			
			// shutdown all registered port-factories
			for(auto portFactory = portFactoryRegistry.begin(); portFactory != portFactoryRegistry.end(); portFactory++) 
			{
				portFactory->second->onShutdown();
			}
			
			if(connections.component.useLogger == true) {
				//FIXME: use logging
				//Smart::LOGGER->stopLogging();
			}
			
			compHandler.onShutdown();
			
			stateSlave->release("shutdown");
		}
		
		// clean-up component's resources
		void «component.getName()»::fini()
		{
			// unlink all observers
			«FOR node: component.subNodes.sortBy(e|e.name)»
				«FOR observer: node.observers»
					«observer.subject.nameInstance»->detach_interaction_observer(«node.nameInstance»);
				«ENDFOR»
			«ENDFOR»
			
			// destroy all task instances
			«FOR task : component.activities.sortBy(e | e.name)»
				// unlink all UpcallManagers
				«FOR inLink: task.inputLinks.sortBy[it.name]»
				«inLink.inputPort.nameInstance»UpcallManager->detach(«task.nameInstance»);
				«ENDFOR»
				// unlink the TaskTrigger
				if(«task.nameInstance»Trigger != NULL){
					«task.nameInstance»Trigger->detach(«task.nameInstance»);
					delete «task.nameInstance»;
				}
			«ENDFOR»

			// destroy all input-handler
			«FOR handler: component.inputHandlers.sortBy[it.name]»
				delete «handler.nameInstance»;
			«ENDFOR»

			// destroy InputTaskTriggers and UpcallManagers
			«FOR input: component.inputPorts.sortBy[it.name]»
				delete «input.nameInstance»InputTaskTrigger;
				delete «input.nameInstance»UpcallManager;
			«ENDFOR»

			// destroy client ports
			«FOR client: component.allClientPorts.sortBy[it.name]»
			delete «client.nameInstance»;
			«ENDFOR»

			// destroy server ports
			«FOR server: component.allServerPorts.sortBy[it.name]»
				delete «server.nameInstance»;
				«IF server instanceof AnswerPort»
					delete «server.nameInstance»InputTaskTrigger;
				«ENDIF»
			«ENDFOR»
			// destroy event-test handlers (if needed)
			«FOR output: component.outputPorts.sortBy[it.name]»
				«IF output.isEventServer»
					«output.nameInstance»EventTestHandler;
				«ENDIF»
			«ENDFOR»
			
			// destroy request-handlers
			«FOR handler: component.requestHandlers.sortBy[it.name]»
				delete «handler.nameInstance»;
			«ENDFOR»
			
			delete stateSlave;
			// destroy state-change-handler
			delete stateChangeHandler;
			
			// destroy all master/slave ports
			delete wiringSlave;
			«IF component.hasParameters»delete param;«ENDIF»
			
			«IF component.elements.exists[it instanceof CoordinationMasterPort]»
				// destroy master ports
				delete stateMaster;
				delete paramMaster;
				delete wiringMaster;
			«ENDIF»
«««			// delete all master/slave ports
«««			«FOR p : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Port)).toIterable»
«««				«IF p.stereotype instanceof profile.SmartMasterSlaveInteractionPattern»
«««					delete «(p.stereotype as profile.SmartMasterSlaveInteractionPattern).nameInstance»;
«««				«ENDIF»
«««			«ENDFOR»

			// destroy all registered component-extensions
			for(auto extension = componentExtensionRegistry.begin(); extension != componentExtensionRegistry.end(); extension++) 
			{
				extension->second->destroy();
			}

			// destroy all registered port-factories
			for(auto portFactory = portFactoryRegistry.begin(); portFactory != portFactoryRegistry.end(); portFactory++) 
			{
				portFactory->second->destroy();
			}
			
			«FOR ext: componentGeneratorExtensions»
			// destruction of «ext.getExtensionName(component)»
			«ext.getClassMemberDestruction(component)»
			
			«ENDFOR»
		}
		
		«component.loadParameterImplementation»
	''' 
	
	
	
	
	/////////////////////////////////////////////////////
	// COMPNAMECore.hh
	/////////////////////////////////////////////////////
	def CoreUserHeaderFileContent(ComponentDefinition component) '''
		«getCopyrightWriteOnce()»
		#ifndef _«component.getCoreName.toUpperCase»_HH
		#define _«component.getCoreName.toUpperCase»_HH
			
		#include "aceSmartSoft.hh"
		#include <iostream>
		
		class «component.getCoreName()»
		{
		private:
		
		public:
			«component.getCoreName()»();
		};
			
		#endif
	'''
	
	
	/////////////////////////////////////////////////////
	// COMPNAMECore.cc
	/////////////////////////////////////////////////////
	def CoreUserSourceFileContent(ComponentDefinition component) '''
		«getCopyrightWriteOnce()»
		#include "«component.getCoreUserHeaderFilename()»"
		
		// constructor
		«component.getCoreName()»::«component.getCoreName()»()
		{
			std::cout << "constructor «component.getCoreName()»\n";
		}
	''' 
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////
	// CompHandler.hh
	/////////////////////////////////////////////////////
	def CompHandlerHeaderFileContent(ComponentDefinition component) '''
		«getCopyrightWriteOnce()»
		#ifndef _COMPHANDLER_HH
		#define _COMPHANDLER_HH
			
		class CompHandler
		{
		public:
			void onStartup();
			void onShutdown();
		};
			
		#endif
	'''




	/////////////////////////////////////////////////////
	// CompHandler.cc
	/////////////////////////////////////////////////////
	def CompHandlerSourceFileContent(ComponentDefinition component) '''
		«getCopyrightWriteOnce()»
		#include "CompHandler.hh"
		#include "«component.getCompHeaderFilename()»"
		
		#include <iostream>
		
		// include communication objects
		«FOR obj : ComponentDefinitionModelUtility.getAllCommObjects(component).sortBy[it.name]»
			#include <«obj.userClassHeaderFileNameFQN»>
		«ENDFOR»

		
		void CompHandler::onStartup() 
		{
			std::cout << "startup - put your startupCode in CompHandler::onStartup()!!!\n";
		
			Smart::StatusCode status;
		
			// Start all services. If you need manual control, use the content of this function to
			// connect and start each service individually, e.g:
			// COMP->connectMyPortName("SmartExampleComponent", "examplePort");
			status = COMP->connectAndStartAllServices();
			
			// Start all tasks. If you need manual control, use the content of this function to
			// start each task individually.
			COMP->startAllTasks();
			
			// Start all timers. If you need manual control, use the content of this function to
			// start each timer individually.
			COMP->startAllTimers();
			
			// Notify the component that setup/initialization is finished.
			// You may move this function to any other place.
			COMP->setStartupFinished(); 
		}
		
		void CompHandler::onShutdown() 
		{
			std::cout << "shutdown - put your cleanup code in CompHandler::onShutdown()!!!\n";
			
		}
	'''
}
