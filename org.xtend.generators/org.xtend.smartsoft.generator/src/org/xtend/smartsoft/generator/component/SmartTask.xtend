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
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.ecore.component.componentDefinition.ComponentDefinition

import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.component.componentDefinition.InputHandler
import org.ecore.component.coordinationExtension.OperationModeBinding
import org.ecore.component.seronetExtension.OpcUaReadServer

class SmartTask {
	@Inject extension ComponentGenHelpers
	@Inject extension CommObjectGenHelpers
	@Inject extension CopyrightHelpers
	@Inject extension SmartComponent
	@Inject extension SmartInputHandler
	@Inject extension InteractionObserver
	
//	@Inject extension ComponentDefinitionModelUtility
	
	def TaskHeaderFileName(Activity h) { h.nameClass + "Core.hh" }
	def TaskSourceFileName(Activity h) { h.nameClass + "Core.cc" }
	def TaskUserHeaderFileName(Activity h) { h.nameClass + ".hh" }
	def TaskUserSourceFileName(Activity h) { h.nameClass + ".cc" }
	
	def void CreateSmartTask(Activity t, IFileSystemAccess fsa) {
		fsa.generateFile(t.TaskHeaderFileName, t.TaskHeaderFileContent)
		fsa.generateFile(t.TaskSourceFileName, t.TaskSourceFileContent)

		fsa.generateFile(t.TaskUserSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, t.TaskUserSourceFileContent)
		fsa.generateFile(t.TaskUserHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, t.TaskUserHeaderFileContent)		
	}
	
	///////////////////////////
	// Header file of Task: TASKCore.hh
	///////////////////////////
	def TaskHeaderFileContent(Activity task) '''
		«getCopyright()»
		#ifndef _«task.nameClass.toUpperCase»_CORE_HH
		#define _«task.nameClass.toUpperCase»_CORE_HH
			
		#include "aceSmartSoft.hh"
		
		// include upcall interface
		«FOR inLink: task.inputLinks.sortBy[it.name]»
			#include "«inLink.inputPort.UpcallInterfaceHeaderFileName»"
		«ENDFOR»
		
		// include communication-objects for output ports
		«FOR initiator: (task.eContainer as ComponentDefinition).outputPorts.filter[it.activity==task].sortBy[it.name]»
			«FOR commObj: ComponentDefinitionModelUtility.getAllCommObjects(initiator).sortBy[it.name]»
			#include <«commObj.userClassHeaderFileNameFQN»>
			«ENDFOR»
		«ENDFOR»
		
		// include all interaction-observer interfaces
		#include <«task.nodeObserverInterfaceHeaderFileName»>
		«FOR obs: task.observers.sortBy[it.nameClass]»
		#include <«obs.subject.nodeObserverInterfaceHeaderFileName»>
		«ENDFOR»
		
		«FOR ext: activityGeneratorExtensions»
		«ext.getHeaderIncludes(task)»
		«ENDFOR»
		
		class «task.nameClass»Core
		:	public SmartACE::ManagedTask
		,	public Smart::TaskTriggerSubject
		«FOR obs: task.observers.sortBy[it.nameClass]»
		,	public «obs.subject.nodeObserverInterfaceClassName»
		«ENDFOR»
		«FOR inLink: task.inputLinks.sortBy[it.name]»
		,	public «inLink.inputPort.nameClass»UpcallInterface
		«ENDFOR»
		{
		private:
			bool useDefaultState; 
			bool useLogging;
			int taskLoggingId;
			unsigned int currentUpdateCount;
			
			«FOR inLink: task.inputLinks.sortBy[it.name]»
				Smart::StatusCode «inLink.inputPort.nameInstance»Status;
				«inLink.inputPort.inputHandlerCommObject» «inLink.inputPort.nameInstance»Object;
«««				«IF inLink.input instanceof AnswerPort»
«««					SmartACE::QueryId «inLink.responder.nameInstance»Id;
«««				«ENDIF»
			«ENDFOR»
			
			«FOR ext: activityGeneratorExtensions»
			«ext.getClassMemberPrivateDefinition(task)»
			«ENDFOR»
			
		protected:
			virtual int execute_protected_region();
			
			virtual void updateAllCommObjects();
			
			virtual int getPreviousCommObjId();
			
			void triggerLogEntry(const int& idOffset);
			
			«FOR obs: task.observers.sortBy[it.nameClass]»
			// overload this method in derived classes!
			virtual void on_update_from(const «obs.subject.nameClass»* subject) {
				// no-op
			}
			«ENDFOR»
			
			«FOR input: task.inputLinks.map[inputPort].sortBy[it.name]»
				// overload and implement this method in derived classes to immediately get all incoming updates from «input.name» (as soon as they arrive)
				virtual void on_«input.name»(const «input.inputHandlerCommObject» &input) {
					// no-op
				}
				
				// this method can be safely used from the thread in derived classes
«««				«IF responder instanceof AnswerPort»
«««				inline Smart::StatusCode «responder.nameInstance»GetUpdate(«responder.communicationObjects.get("Request").fullyQualifiedNameCpp» &«responder.nameInstance»Object) const
«««				{
«««					// copy local object buffer and return the last status code
«««					«responder.nameInstance»Object = this->«responder.nameInstance»RequestObject;
«««					return «responder.nameInstance»Status;
«««				}
«««				Smart::StatusCode «responder.nameInstance»Answer(const «responder.communicationObjects.get("Answer").fullyQualifiedNameCpp» &«responder.nameInstance»Object);
«««				«ELSE»
				inline Smart::StatusCode «input.nameInstance»GetUpdate(«input.inputHandlerCommObject» &«input.nameInstance»Object) const
				{
					// copy local object buffer and return the last status code
					«input.nameInstance»Object = this->«input.nameInstance»Object;
					return «input.nameInstance»Status;
				}
«««				«ENDIF»
			«ENDFOR»
			
			«FOR output: (task.eContainer as ComponentDefinition).outputPorts.sortBy[it.name]»
				«IF output.activity.equals(task)»
					// this method is meant to be used in derived classes
					«IF output.isEventServer»
					Smart::StatusCode «output.nameInstance»Put(«output.eventServerStateObject» &eventState);
					«ELSE»
					Smart::StatusCode «output.nameInstance»Put(«output.commObjectsParameterList»);
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			
			«FOR ext: activityGeneratorExtensions»
			«ext.getClassMemberProtectedDefinition(task)»
			«ENDFOR»
			
		«task.compileNodeSubjectHeader»
		
		public:
			«task.nameClass»Core(Smart::IComponent *comp, const bool &useDefaultState=true);
			virtual ~«task.nameClass»Core();
			
			inline void setUpLogging(const int &taskNbr, const bool &useLogging=true) {
				this->taskLoggingId = taskNbr;
				this->useLogging = useLogging;
			}
			
			inline bool isLoggingActive() const {
				return useLogging;
			}
			
			inline int getLoggingID() const {
				return taskLoggingId;
			}
			
			inline int getCurrentUpdateCount() const {
				return currentUpdateCount;
			}
			
			«FOR ext: activityGeneratorExtensions»
			«ext.getClassMemberPublicDefinition(task)»
			«ENDFOR»
		};
		#endif
	'''
	
	///////////////////////////
	// Task source name
	///////////////////////////
	def TaskSourceFileContent(Activity task) '''
		«getCopyright()»
		#include "«task.TaskHeaderFileName»"
		#include "«task.TaskUserHeaderFileName»"
		#include "«(task.eContainer as ComponentDefinition).getCompHeaderFilename»"
		
		//FIXME: use logging
		//#include "smartGlobalLogger.hh"
		
		// include observers
		«FOR observer: task.observers.sortBy[it.nameClass]»
			«IF observer.subject instanceof Activity»
				#include "«(observer.subject  as Activity).TaskUserHeaderFileName»"
			«ELSEIF observer.subject instanceof InputHandler»
				#include "«(observer.subject as InputHandler).InputHandlerUserHeaderFileName»"
			«ENDIF»
		«ENDFOR»
		
		«FOR ext: activityGeneratorExtensions»
		«ext.getSourceIncludes(task)»
		«ENDFOR»
		
		«task.nameClass»Core::«task.nameClass»Core(Smart::IComponent *comp, const bool &useDefaultState) 
		:	SmartACE::ManagedTask(comp)
		,	useDefaultState(useDefaultState)
		,	useLogging(false)
		,	taskLoggingId(0)
		,	currentUpdateCount(0)
		«FOR inLink: task.inputLinks.sortBy[it.name]»
			,	«inLink.inputPort.nameInstance»Status(Smart::SMART_DISCONNECTED)
			,	«inLink.inputPort.nameInstance»Object()
		«ENDFOR»
		{
			«FOR ext: activityGeneratorExtensions»
			«ext.getClassMemberConstruction(task)»
			«ENDFOR»
		}
		
		«task.nameClass»Core::~«task.nameClass»Core()
		{
			«FOR ext: activityGeneratorExtensions»
			«ext.getClassMemberDestruction(task)»
			«ENDFOR»
		}
		
		«FOR ext: activityGeneratorExtensions»
		«ext.getSourceImplementation(task)»
		«ENDFOR»
		
		«task.compileNodeSubjectSource»
		
		int «task.nameClass»Core::execute_protected_region()
		{
			«FOR state: task.extensions.filter(OperationModeBinding)»
			if(useDefaultState) {
				Smart::StatusCode status = COMP->stateSlave->acquire("«state.name»");
				if(status != Smart::SMART_OK) {
					std::cerr << "«task.nameClass»Core: ERROR acquiring state active: " << status << std::endl;
					return 0;
				}
			}
			«ENDFOR»
			
			// update of comm-objects must be within the protected region to prevent aged comm-object values
			this->updateAllCommObjects();
			
			if(useLogging == true) {
				//FIXME: use logging
				//Smart::LOGGER->log(taskLoggingId, getCurrentUpdateCount(), getPreviousCommObjId());
			}
			
			// this is the user code (should not internally use the state-pattern any more)
			int retval = this->on_execute();
			
			// notify all attached interaction observers
			this->notify_all_interaction_observers();
			
			// inform all associated tasks about a new update
			this->trigger_all_tasks();
			
			// increment current currentUpdateCount for the next iteration
			currentUpdateCount++;
			
			«FOR state: task.extensions.filter(OperationModeBinding)»
			if(useDefaultState) {
				COMP->stateSlave->release("«state.name»");
			}
			«ENDFOR»
			return retval;
		}
		
«««		«IF !task.observers.empty»
«««		void «task.nameClass»Core::update_from(const Smart::TaskInteractionSubject* subject)
«««		{
«««			// try typecasting into according Task or Upcall class
«««			«FOR obs: task.observers.sortBy[it.nameClass]»
«««				«IF obs != task.observers.head»else«ENDIF» if(const «obs.nameClass»* «obs.nameInstance» = dynamic_cast<const «obs.nameClass»*>(subject)) {
«««					this->on_update_from(«obs.nameInstance»);
«««				}
«««			«ENDFOR»
«««		}
«««		«ENDIF»
		
		void «task.nameClass»Core::updateAllCommObjects()
		{
			«FOR input: task.inputLinks.map[inputPort].sortBy[it.name]»
«««				«IF responder instanceof AnswerPort»
«««					«responder.nameInstance»Status = COMP->«responder.nameInstance»InputTrigger->consumeRequest(«responder.nameInstance»Id, «responder.nameInstance»RequestObject);
«««				«ELSE»
					«input.nameInstance»Status = COMP->«input.nameInstance»InputTaskTrigger->getUpdate(«input.nameInstance»Object);
«««				«ENDIF»
			«ENDFOR»
			
			«FOR ext: activityGeneratorExtensions»
			«ext.getUpdateValuesImplementation(task)»
			«ENDFOR»
		}
		
«««		«FOR responder: task.inputLinks.map[responder].filter(AnswerPort)»
«««		Smart::StatusCode «task.nameClass»Core::«responder.nameInstance»Answer(const «responder.communicationObjects.get("Answer").fullyQualifiedNameCpp» &«responder.nameInstance»Object)
«««		{
«««			return COMP->«responder.nameInstance»InputTrigger->answer(«responder.nameInstance»Id, «responder.nameInstance»Object);
«««		}
«««		«ENDFOR»
		
		«FOR output: (task.eContainer as ComponentDefinition).outputPorts.sortBy[it.name]»
			«IF output.activity.equals(task)»
				// this method is meant to be used in derived classes
				Smart::StatusCode «task.nameClass»Core::«output.nameInstance»Put(«IF output.isEventServer»«output.eventServerStateObject» &eventState«ELSE»«output.commObjectsParameterList»«ENDIF»)
				{
					«FOR opcStatusServer: (task.eContainer as ComponentDefinition).elements.filter(OpcUaReadServer).filter[it.outPort==output]»
					COMP->«opcStatusServer.name.toFirstLower»->put(«output.commObjectsCallerList»);
					«ENDFOR»
«««					int pushLoggingId = taskLoggingId + 1 + 2*«(task.eContainer as ComponentDefinition).outputPorts.indexOf(initiator)»;
«««					if(useLogging == true) {
«««						//FIXME: use logging
«««						//Smart::LOGGER->log(pushLoggingId, getCurrentUpdateCount(), getPreviousCommObjId());
«««					}
					Smart::StatusCode result = COMP->«output.nameInstance»->«output.sourceMainMethod»(«IF output.isEventServer»eventState«ELSE»«output.commObjectsCallerList»«ENDIF»);
					if(useLogging == true) {
						//FIXME: use logging
						//Smart::LOGGER->log(pushLoggingId+1, getCurrentUpdateCount(), getPreviousCommObjId());
					}
					return result;
				}
			«ENDIF»
		«ENDFOR»
		
		void «task.nameClass»Core::triggerLogEntry(const int& idOffset)
		{
			if(useLogging == true) {
				int logId = taskLoggingId + 2*«(task.eContainer as ComponentDefinition).outputPorts.size» + idOffset;
				//FIXME: use logging
				//Smart::LOGGER->log(logId, getCurrentUpdateCount(), getPreviousCommObjId());
			}
		}
		
		int «task.nameClass»Core::getPreviousCommObjId()
		{
			// this method needs to be overloaded and implemented in derived classes
			return 0;
		}
	'''
	
	///////////////////////////
	// User task HEADER: TASK.hh
	///////////////////////////
	def TaskUserHeaderFileContent(Activity task) '''
		«getCopyrightWriteOnce()»
		#ifndef _«task.nameClass.toUpperCase»_HH
		#define _«task.nameClass.toUpperCase»_HH
		
		#include "«task.TaskHeaderFileName»"
		«FOR ext: activityGeneratorExtensions»
		«ext.getUserHeaderIncludes(task)»
		«ENDFOR»
		
		class «task.nameClass»  : public «task.nameClass»Core
		{
		private:
			«FOR obs: task.observers.sortBy[it.nameClass]»
			virtual void on_update_from(const «obs.nameClass»* «obs.nameInstance»);
			«ENDFOR»
			«FOR inLink: task.inputLinks.sortBy[it.name]»
			virtual void on_«inLink.inputPort.name»(const «inLink.inputPort.inputHandlerCommObject» &input);
			«ENDFOR»
		public:
			«task.nameClass»(SmartACE::SmartComponent *comp);
			virtual ~«task.nameClass»();
			
			virtual int on_entry();
			virtual int on_execute();
			virtual int on_exit();
			«FOR ext: activityGeneratorExtensions»
			«ext.getUserClassMemberPublicDefinition(task)»
			«ENDFOR»
		};
		
		#endif
	'''
	
	
	///////////////////////////
	// User task source: TASK.cc
	///////////////////////////
	def TaskUserSourceFileContent(Activity task) '''
		«getCopyrightWriteOnce()»
		#include "«task.TaskUserHeaderFileName»"
		#include "«(task.eContainer as ComponentDefinition).getCompHeaderFilename»"
		
		#include <iostream>
		
		«task.nameClass»::«task.nameClass»(SmartACE::SmartComponent *comp) 
		:	«task.nameClass»Core(comp)
		{
			std::cout << "constructor «task.nameClass»\n";
		}
		«task.nameClass»::~«task.nameClass»() 
		{
			std::cout << "destructor «task.nameClass»\n";
		}
		
		«FOR observer: task.observers.sortBy[it.nameClass]»
		void «task.nameClass»::on_update_from(const «observer.subject.nameClass»* «observer.subject.nameInstance»)
		{
			// update triggered from «observer.subject.nameClass»
			// (use a local mutex here, because this method is called from within the thread of «observer.subject.name»)
		}
		«ENDFOR»
		
		«FOR inLink: task.inputLinks.sortBy[it.name]»
		void «task.nameClass»::on_«inLink.inputPort.name»(const «inLink.inputPort.inputHandlerCommObject» &input)
		{
			// upcall triggered from InputPort «inLink.inputPort.name»
			// - use a local mutex here, because this upcal is called asynchroneously from outside of this task
			// - do not use longer blocking calls here since this upcall blocks the InputPort «inLink.inputPort.name»
			// - if you need to implement a long-running procedure, do so within the on_execute() method and in
			//   there, use the method «inLink.inputPort.nameInstance»GetUpdate(input) to get a copy of the input object
		}
		«ENDFOR»
		«FOR ext: activityGeneratorExtensions»
		«ext.getUserSourceImplementation(task)»
		«ENDFOR»
		int «task.nameClass»::on_entry()
		{
			// do initialization procedures here, which are called once, each time the task is started
			// it is possible to return != 0 (e.g. when initialization fails) then the task is not executed further
			return 0;
		}
		int «task.nameClass»::on_execute()
		{
			// this method is called from an outside loop,
			// hence, NEVER use an infinite loop (like "while(1)") here inside!!!
			// also do not use blocking calls which do not result from smartsoft kernel
			
			// to get the incoming data, use this methods:
			Smart::StatusCode status;
			«FOR input: task.inputLinks.map[inputPort].sortBy[it.name]»
			«input.inputHandlerCommObject» «input.nameInstance»Object;
			status = this->«input.nameInstance»GetUpdate(«input.nameInstance»Object);
			if(status != Smart::SMART_OK) {
				std::cerr << status << std::endl;
				// return 0;
			} else {
				std::cout << "received: " << «input.nameInstance»Object << std::endl;
			}
			«ENDFOR»

			std::cout << "Hello from «task.nameClass» " << std::endl;
		
			// it is possible to return != 0 (e.g. when the task detects errors), then the outer loop breaks and the task stops
			return 0;
		}
		int «task.nameClass»::on_exit()
		{
			// use this method to clean-up resources which are initialized in on_entry() and needs to be freed before the on_execute() can be called again
			return 0;
		}
	'''
	
}