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
package org.xtend.smartsoft.generator.component.params

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import java.lang.CharSequence
import java.util.Map
import java.util.HashMap
import java.util.List
import java.util.ArrayList
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.xtend.smartsoft.generator.component.SmartComponent
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.component.componentParameter.ExtendedTrigger
import org.ecore.service.parameterDefinition.TriggerDefinition
import org.ecore.service.parameterDefinition.ParameterSetDefinition
import org.ecore.service.parameterDefinition.ParameterDefinition
import org.ecore.service.parameterDefinition.ParameterSetRepository
import org.ecore.component.componentParameter.TriggerInstance
import org.ecore.component.componentParameter.ExtendedParameter
import org.ecore.component.componentParameter.InternalParameter
import org.ecore.component.componentParameter.ComponentParameterModelUtility
import org.ecore.component.componentParameter.ComponentParameter
import org.ecore.component.componentParameter.AbstractComponentParameter
import org.ecore.base.basicAttributes.InlineEnumerationType
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.SingleValue
import org.ecore.component.componentParameter.ComponentParameterBase
import org.ecore.base.basicAttributes.AttributeRefinement

class SmartComponentParameter {
	@Inject extension CopyrightHelpers
	@Inject extension SmartComponent
	
	@Inject extension ComponentParamsGenHelpers
	@Inject extension ComponentParameterModelUtility
	
	def ParameterUpdateHandlerHeaderFileName(ComponentParameter h) { "ParameterUpdateHandler.hh" }
	def ParameterUpdateHandlerSourceFileName(ComponentParameter h) { "ParameterUpdateHandler.cc" }
	def TriggerHandlerCoreHeaderFileName(ComponentParameter h) { "TriggerHandlerCore.hh" }
	def TriggerHandlerCoreSourceFileName(ComponentParameter h) { "TriggerHandlerCore.cc" }
	def TriggerHandlerHeaderFileName(ComponentParameter h) { "TriggerHandler.hh" }
	def TriggerHandlerSourceFileName(ComponentParameter h) { "TriggerHandler.cc" }	
	def ParameterStateStructCoreHeaderFileName(ComponentParameter h) { "ParameterStateStructCore.hh" }
	def ParameterStateStructHeaderFileName(ComponentParameter h) { "ParameterStateStruct.hh" }
	def ParameterStateStructSourceFileName(ComponentParameter h) { "ParameterStateStruct.cc" }
	
	def ParameterIniFileName(ComponentParameter h) { h.component.name+".ini.bottom" }
	def ParameterIniFileHeadName(ComponentParameter h) { h.component.name+".ini.head" }
	def ParameterIniFileTemplateName(ComponentParameter h) { h.component.name+".ini.template" }
	
	def void CreateSmartComponentParameterSlave(ComponentParameter p, IFileSystemAccess2 fsa) {
		val iniFileBottomContent = p.compileIniFile;
		fsa.generateFile(p.ParameterIniFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, iniFileBottomContent)
		if(fsa.isFile(p.ParameterIniFileHeadName)) {
			val iniFileHeadContent = fsa.readTextFile(p.ParameterIniFileHeadName).toString
			fsa.generateFile(p.ParameterIniFileTemplateName, iniFileHeadContent+iniFileBottomContent)
		}
		
		fsa.generateFile(p.ParameterStateStructCoreHeaderFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, p.compileStructCore)
		fsa.generateFile(p.ParameterUpdateHandlerHeaderFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, p.compileUpdateHandlerHH)
		fsa.generateFile(p.ParameterUpdateHandlerSourceFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, p.compileUpdateHandlerCC)
		
		if(p.parameters.filter(typeof(ParameterSetInstance)).exists(pi|pi.paramSet.parameters.exists(pd|pd instanceof TriggerDefinition))
			|| p.parameters.exists(tr|tr instanceof ExtendedTrigger)
		)
		{
			fsa.generateFile(p.TriggerHandlerCoreHeaderFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, p.compileTriggerHandlerCoreHH)
			fsa.generateFile(p.TriggerHandlerCoreSourceFileName, ExtendedOutputConfigurationProvider::SRC_GEN_PARAMS, p.compileTriggerHandlerCoreCC)
			fsa.generateFile(p.TriggerHandlerHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, p.compileTriggerHandlerHH)
			fsa.generateFile(p.TriggerHandlerSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, p.compileTriggerHandlerCC)
		} else {
//			print("No Trigger were defined!\n")
		}
		
		fsa.generateFile(p.ParameterStateStructHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, p.compileStructHH)
		fsa.generateFile(p.ParameterStateStructSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, p.compileStructCC)
	}
	
	def private dispatch String getFullyQualifiedName(ParameterDefinition par) {
		var ParameterSetDefinition set = (par.eContainer as ParameterSetDefinition)
		var String result = set.fullyQualifiedName + "." + par.name
		return result
	}
	
	def private dispatch String getFullyQualifiedVariableName(ParameterDefinition par) {
		var ParameterSetDefinition set = (par.eContainer as ParameterSetDefinition)
		var String result = set.fullyQualifiedVariableName + "_" + par.name
		return result
	}
	
	def private dispatch String getFullyQualifiedName(TriggerDefinition trig) {
		var ParameterSetDefinition set = (trig.eContainer as ParameterSetDefinition)
		var String result = set.fullyQualifiedName + "." + trig.name
		return result
	}
	
	def private dispatch String getFullyQualifiedVariableName(TriggerDefinition trig) {
		var ParameterSetDefinition set = (trig.eContainer as ParameterSetDefinition)
		var String result = set.fullyQualifiedVariableName + "_" + trig.name
		return result
	}
	
	def private dispatch String getFullyQualifiedName(ParameterSetDefinition set) {
		var ParameterSetRepository repo = (set.eContainer as ParameterSetRepository)
		var String result = repo.name + "." + set.name
		return result
	}
	
	def private dispatch String getFullyQualifiedVariableName(ParameterSetDefinition set) {
		var ParameterSetRepository repo = (set.eContainer as ParameterSetRepository)
		var String result = repo.name + "_" + set.name
		return result
	}
	
//	def CharSequence ParameterDumpContent(org.eclipse.uml2.uml.Component comp) '''
//		// Generated Dump. Do not edit! SmartComponentParameter::ParameterDumpContent()
//		«FOR comment : comp.eAllContents.filter(typeof(org.eclipse.uml2.uml.Comment)).toIterable»
//			«var st = comment.stereotype as profile.SmartComponentParameter»
//			«IF st != null»
//				«st.parameterDefinition»
//			«ENDIF»
//		«ENDFOR»
//		
//	'''
	
	def private dispatch generateTriggerAttributeDefinitions(TriggerDefinition t) {
		var result = ""
		for(el: t.attributes) {
			if(el.arrayType) {
				result = result + '''const std::list<«el.compileCppType»> &«el.name»'''
			} else {
				result = result + '''const «el.compileCppType» &«el.name»'''
			}
			if(el != t.attributes.last) {
				result = result + ''', '''
			}
		}
		return result
	}
	def private dispatch generateTriggerAttributeDefinitions(ExtendedTrigger t) {
		var result = ""
		for(el: t.attributes) {
			if(el.arrayType) {
				result = result + '''const std::list<«el.compileCppType»> &«el.name»'''	
			} else {
				result = result + '''const «el.compileCppType» &«el.name»'''
			}
			if(el != t.attributes.last) {
				result = result + ''', '''
			}
		}
		return result
	}
	def private dispatch generateTriggerAttributeNames(TriggerDefinition t, String prefix) {
		var result = ""
		for(el: t.attributes) {
			result = result + '''«prefix»«el.name»'''
			if(el != t.attributes.last) {
				result = result + ''', '''
			}
		}
		return result
	}
	def private dispatch generateTriggerAttributeNames(ExtendedTrigger t, String prefix) {
		var result = ""
		for(el: t.attributes) {
			result = result + '''«prefix»«el.name»'''
			if(el != t.attributes.last) {
				result = result + ''', '''
			}
		}
		return result
	}
	
	def boolean hasActiveTriggers(ComponentParameter usage) {
		for(inst: usage.parameters.filter(typeof(ParameterSetInstance))) {
			if(inst.parameterInstances.filter(typeof(TriggerInstance)).exists(t|t.active)) {
				return true;
			}
		}
		for(extTr: usage.parameters.filter(typeof(ExtendedTrigger))) {
			if(extTr.active) {
				return true;
			}
		}
		return false
	}
	
	def CharSequence compileTriggerHandlerCoreHH(ComponentParameter usage)
	'''
		«copyright»
		#ifndef _TRIGGERHANDLERCORE_HH
		#define _TRIGGERHANDLERCORE_HH
		
		«IF usage.hasActiveTriggers»
		#include "aceSmartSoft.hh"
		#include <queue>
		«ENDIF»
		
		#include <string>
		#include <iostream>
		#include <list>
		
		«IF usage.hasActiveTriggers»
			class TriggerHandlerCore : public SmartACE::ManagedTask
		«ELSE»
			class TriggerHandlerCore
		«ENDIF» 
		{
			friend class ParamUpdateHandler;
			
		public:
			TriggerHandlerCore() 
			«IF usage.hasActiveTriggers»
			:	SmartACE::ManagedTask(NULL) //TODO: a propper component pointer should be probably used here instead of NULL
			,	mutex()
			,	sema(0) // initialize semaphore in blocking mode
			,	current_trigger_enumerator(TriggerEnumerators::UNDEFINED_TRIGGER_ACTION)
			«ENDIF»
			{  
				«IF usage.hasActiveTriggers»
				this->start();
				«ENDIF» 
			}
			virtual ~TriggerHandlerCore() {  }
		
			«FOR paramSetInst : usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
				// trigger user methods
				«FOR trigger: paramSetInst.paramSet.parameters.filter(typeof(TriggerDefinition)).sortBy[it.name]»
				
					«IF trigger.attributes.exists(el|el.type instanceof InlineEnumerationType)»
						class «trigger.name»Type {
						public:
						
					«ENDIF»
						«FOR attr: trigger.attributes.filter(el|el.type instanceof InlineEnumerationType).sortBy[it.name]»
							«attr.generateEnumClass»
							
							«IF attr.arrayType»
								static std::list<«attr.compileCppType»> convert«attr.name.toFirstUpper»Type(const std::list<std::string> &«attr.name») {
									static std::list<«attr.compileCppType»> result;
									std::list<std::string>::const_iterator it;
									for(it=«attr.name».begin(); it!=«attr.name».end(); it++) {
										result.push_back(*it);
									}
									return result;
								}
								
							«ENDIF»
						«ENDFOR»
					«IF trigger.attributes.exists(el|el.type instanceof InlineEnumerationType)»
						}; // end class «trigger.name»Type
					«ENDIF»
					
					virtual void handle«trigger.fullyQualifiedVariableName.toFirstUpper»(«trigger.generateTriggerAttributeDefinitions») = 0;
				«ENDFOR»
			«ENDFOR»
			
			// extended trigger user methods
			«FOR extendedTrigger: usage.parameters.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
				«IF extendedTrigger.attributes.haveEnums»
					class «extendedTrigger.name»Type {
					public:
						
				«ENDIF»
					«FOR attr: extendedTrigger.attributes.filter[it.type instanceof InlineEnumerationType].sortBy[it.name]»
						«attr.generateEnumClass»
						
						«IF attr.arrayType»
							static std::list<«attr.compileCppType»> convert«attr.name.toFirstUpper»Type(const std::list<std::string> &«attr.name») {
								static std::list<«attr.compileCppType»> result;
								std::list<std::string>::const_iterator it;
								for(it=«attr.name».begin(); it!=«attr.name».end(); it++) {
									result.push_back(*it);
								}
								return result;
							}
							
						«ENDIF»
					«ENDFOR»
				«IF extendedTrigger.attributes.haveEnums»
					}; // end class «extendedTrigger.name»Type
				«ENDIF»
				
				virtual void handle«extendedTrigger.name.toFirstUpper»(«extendedTrigger.generateTriggerAttributeDefinitions») = 0;
			«ENDFOR»
			
		«IF usage.hasActiveTriggers»
		protected:
			SmartACE::SmartMutex mutex;
			SmartACE::SmartSemaphore sema;
			int on_execute();
		
			class TriggerEnumerators {
			public:
				enum ENUM {
					UNDEFINED_TRIGGER_ACTION
					«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
						«FOR t: inst.parameterInstances.filter(typeof(TriggerInstance)).filter(t|t.active).sortBy[it.triggerDef.name]»
						, «t.triggerDef.fullyQualifiedVariableName.toUpperCase»
						«ENDFOR»
						«FOR extTr: usage.parameters.filter(typeof(ExtendedTrigger)).filter(t|t.active).sortBy[it.name]»
						, «extTr.name.toUpperCase»
						«ENDFOR»
					«ENDFOR»
				};
			};
			TriggerEnumerators::ENUM current_trigger_enumerator;
			std::queue<TriggerEnumerators::ENUM> trigger_queue;
			
			«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
				«FOR t: inst.parameterInstances.filter(typeof(TriggerInstance)).filter(t|t.active).sortBy[it.triggerDef.name]»
					// active trigger «t.triggerDef.name»
					struct «t.triggerDef.fullyQualifiedVariableName»Attributes {
						«FOR el: t.triggerDef.attributes.sortBy[it.name]»
							«IF el.arrayType»
								std::list<«el.compileCppType»> «el.name»;
							«ELSE»
								«el.compileCppType» «el.name»;
							«ENDIF»
						«ENDFOR»
					}current_«t.triggerDef.fullyQualifiedVariableName»;
					std::queue<«t.triggerDef.fullyQualifiedVariableName»Attributes> «t.triggerDef.fullyQualifiedVariableName»_queue;
					
				«ENDFOR»
			«ENDFOR»
			«FOR extTr: usage.parameters.filter(typeof(ExtendedTrigger)).filter(t|t.active).sortBy[it.name]»
				// active trigger «extTr.name»
				struct «extTr.name»Attributes {
					«FOR el: extTr.attributes.sortBy[it.name]»
						«IF el.arrayType»
							std::list<«el.compileCppType»> «el.name»;
						«ELSE»
							«el.compileCppType» «el.name»;
						«ENDIF»
					«ENDFOR»
				}current_«extTr.name»;
				std::queue<«extTr.name»Attributes> «extTr.name»_queue;
			«ENDFOR»
		«ENDIF»
		private:
			«FOR paramSetInst : usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
				// trigger internal methods
				«FOR trigger: paramSetInst.paramSet.parameters.filter(typeof(TriggerDefinition)).sortBy[it.name]»
					void handle«trigger.fullyQualifiedVariableName.toFirstUpper»Core(«trigger.generateTriggerAttributeDefinitions»);
				«ENDFOR»
			«ENDFOR»
			
			// extended trigger internal methods 
			«FOR extendedTrigger: usage.parameters.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
				void handle«extendedTrigger.name.toFirstUpper»Core(«extendedTrigger.generateTriggerAttributeDefinitions»);
			«ENDFOR»
		};
		
		#endif // _TRIGGERHANDLERCORE_HH
	'''
	def CharSequence compileTriggerHandlerCoreCC(ComponentParameter usage)
	'''
		«copyright»

		#include "«usage.TriggerHandlerCoreHeaderFileName»"
		
		«IF usage.hasActiveTriggers»
			int TriggerHandlerCore::on_execute()
			{
				// blocking wait until some active trigger request(s) come in
				sema.acquire();
				
				{
					SmartACE::SmartGuard g(mutex);
					
					// get the top trigger from the queue
					current_trigger_enumerator = trigger_queue.front();
					trigger_queue.pop();
					
					// retrieve the corresponding trigger attributes from the trigger specific queue
					switch(current_trigger_enumerator) {
					«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
						«FOR t: inst.parameterInstances.filter(typeof(TriggerInstance)).filter(t|t.active).sortBy[it.triggerDef.name]»
							case TriggerEnumerators::«t.triggerDef.fullyQualifiedVariableName.toUpperCase»:
								current_«t.triggerDef.fullyQualifiedVariableName» = «t.triggerDef.fullyQualifiedVariableName»_queue.front();
								«t.triggerDef.fullyQualifiedVariableName»_queue.pop();
								break;
						«ENDFOR»
					«ENDFOR»
					«FOR extTr: usage.parameters.filter(typeof(ExtendedTrigger)).filter(t|t.active).sortBy[it.name]»
						case TriggerEnumerators::«extTr.name.toUpperCase»:
						current_«extTr.name» = «extTr.name»_queue.front();
						«extTr.name»_queue.pop();
						break;
					«ENDFOR»
					}
				} // mutex release
			
				// now call the corresponding trigger handler
				// (releasing the mutex before, allows to store newly incoming trigger commands on the queue in parallel)
				switch(current_trigger_enumerator) {
				«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
					«FOR t: inst.parameterInstances.filter(typeof(TriggerInstance)).filter(t|t.active).sortBy[it.triggerDef.name]»
						case TriggerEnumerators::«t.triggerDef.fullyQualifiedVariableName.toUpperCase»:
							this->handle«t.triggerDef.fullyQualifiedVariableName.toFirstUpper»(«t.triggerDef.generateTriggerAttributeNames("current_"+t.triggerDef.fullyQualifiedVariableName+".")»);
							break;
					«ENDFOR»
				«ENDFOR»
				«FOR extTr: usage.parameters.filter(typeof(ExtendedTrigger)).filter(t|t.active).sortBy[it.name]»
					case TriggerEnumerators::«extTr.name.toUpperCase»:
						this->handle«extTr.name.toFirstUpper»(«extTr.generateTriggerAttributeNames("current_"+extTr.name+".")»);
						break;
				«ENDFOR»
				}
				return 0;
			}
		«ENDIF»
		
		«FOR paramSetInst : usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
			//
			// trigger internal handler methods
			//
			«FOR trigger: paramSetInst.paramSet.parameters.filter(typeof(TriggerDefinition)).sortBy[it.name]»
			
				// handle «trigger.name»
				void TriggerHandlerCore::handle«trigger.fullyQualifiedVariableName.toFirstUpper»Core(«trigger.generateTriggerAttributeDefinitions»)
				{
					«IF paramSetInst.parameterInstances.filter(typeof(TriggerInstance)).exists(t|t.triggerDef == trigger && t.active)»
						SmartACE::SmartGuard g(mutex);

						// store the current set of trigger-attributes in a queue
						«trigger.fullyQualifiedVariableName»Attributes attr;
						«FOR el: trigger.attributes.sortBy[it.name]»
							attr.«el.name» = «el.name»;
						«ENDFOR»
						«trigger.fullyQualifiedVariableName»_queue.push(attr);
						
						// store the current trigger call in the shared trigger-queue
						trigger_queue.push(TriggerEnumerators::«trigger.fullyQualifiedVariableName.toUpperCase»);
						
						// signal the task, in case it is waiting
						sema.release();
					«ELSE»
						this->handle«trigger.fullyQualifiedVariableName.toFirstUpper»(«trigger.generateTriggerAttributeNames("")»);
					«ENDIF»
				}
			«ENDFOR»
		«ENDFOR»
		
		//
		// extended trigger internal handler methods
		//
		«FOR extendedTrigger: usage.parameters.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
		
				// handle «extendedTrigger.name»
				void TriggerHandlerCore::handle«extendedTrigger.name.toFirstUpper»Core(«extendedTrigger.generateTriggerAttributeDefinitions»)
				{
					«IF extendedTrigger.active»
						SmartACE::SmartGuard g(mutex);

						// store the current set of trigger-attributes in a queue
						«extendedTrigger.name»Attributes attr;
						«FOR el: extendedTrigger.attributes.sortBy[it.name]»
							attr.«el.name» = «el.name»;
						«ENDFOR»
						«extendedTrigger.name»_queue.push(attr);
						
						// store the current trigger call in the shared trigger-queue
						trigger_queue.push(TriggerEnumerators::«extendedTrigger.name.toUpperCase»);
						
						// signal the task, in case it is waiting
						cond.signal();
					«ELSE»
						this->handle«extendedTrigger.name.toFirstUpper»(«extendedTrigger.generateTriggerAttributeNames("")»);
					«ENDIF»
				}
		«ENDFOR»
	'''
	
	def CharSequence compileTriggerHandlerHH(ComponentParameter usage)
	'''
		«copyrightWriteOnce»
		#ifndef _TRIGGERHANDLER_HH
		#define _TRIGGERHANDLER_HH
		
		#include "«usage.TriggerHandlerCoreHeaderFileName»"
		
		class TriggerHandler: public TriggerHandlerCore 
		{
		public:
			TriggerHandler() {  }
			virtual ~TriggerHandler() {  }
			
			// trigger user methods
			«FOR paramSetInst : usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
				«FOR trigger: paramSetInst.paramSet.parameters.filter(typeof(TriggerDefinition)).sortBy[it.name]»
					virtual void handle«trigger.fullyQualifiedVariableName.toFirstUpper»(«trigger.generateTriggerAttributeDefinitions»);
				«ENDFOR»
			«ENDFOR»
			«FOR extendedTrigger: usage.parameters.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
				virtual void handle«extendedTrigger.name.toFirstUpper»(«extendedTrigger.generateTriggerAttributeDefinitions»);
			«ENDFOR»
		};
		
		#endif // _TRIGGERHANDLER_HH
	'''
	def CharSequence compileTriggerHandlerCC(ComponentParameter usage)
	'''
		«copyrightWriteOnce»
		
		#include "«usage.TriggerHandlerHeaderFileName»"
		
		#include "«usage.component?.compHeaderFilename»"
		
		// trigger user methods
		«FOR paramSetInst : usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
			«FOR trigger: paramSetInst.paramSet.parameters.filter(typeof(TriggerDefinition)).sortBy[it.name]»
				void TriggerHandler::handle«trigger.fullyQualifiedVariableName.toFirstUpper»(«trigger.generateTriggerAttributeDefinitions»)
				{
					// implement the trigger behavior here. Be aware, if you must use blocking calls here, please set this
					// trigger as active in the model. For an active trigger an active queue will be generated internally 
					// (transparent for the usage here). Thus an active trigger will be called within a separate task scope.
				}
			«ENDFOR»
		«ENDFOR»
		«FOR extendedTrigger: usage.parameters.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
			void TriggerHandler::handle«extendedTrigger.name.toFirstUpper»(«extendedTrigger.generateTriggerAttributeDefinitions»)
			{
				// implement the trigger behavior here. Be aware, if you must use blocking calls here, please set this
				// trigger as active in the model. For an active trigger an active queue will be generated internally 
				// (transparent for the usage here). Thus an active trigger will be called within a separate task scope.
			}
		«ENDFOR»
	'''
	
	def CharSequence compileStructHH(ComponentParameter usage) 
	'''
		«copyrightWriteOnce»
		
		#ifndef _PARAMETERSTATESTRUCT_HH
		#define _PARAMETERSTATESTRUCT_HH
		
		#include "«usage.ParameterStateStructCoreHeaderFileName»"
		
		class ParameterStateStruct: public ParameterStateStructCore
		{
		public:
			ParameterStateStruct() {  }
			virtual ~ParameterStateStruct() {  }
			
			// implement this method to check whether the incoming parameters
			// provided by the commit state are consistent, in case the ParameterResponseType
			// is not OK, the commit parameter is NOT copied into the global state.
			// HINT: avoid using blocking calls from within this handler, use Triggers for that instead.
			virtual SmartACE::ParamResponseType handleCOMMIT(const ParameterStateStruct &commitState);
			
			// define your own getter methods here
			// (to provide conversion functions and/or more convenient getter methods)
			// these own getter methods will be accessible through "COMP->getParameters().yourOwnMethod()"
			// inside of your methods use the getter methods from the parent class ParameterStateStructCore
			// (they provide parameter values from the global state only, which are available after the last commit)
		};
		
		inline std::ostream &operator<<(std::ostream &os, const ParameterStateStruct &pss)
		{
			pss.to_ostream(os);
			return os;
		}
		
		#endif
	'''
	
	def CharSequence compileStructCC(ComponentParameter usage) 
	'''
	«copyrightWriteOnce»
	
	#include "«usage.ParameterStateStructHeaderFileName»"
	
	#include "«usage.component.compHeaderFilename»"
	
	SmartACE::ParamResponseType ParameterStateStruct::handleCOMMIT(const ParameterStateStruct &commitState) {
		// implement any consistency checks here which ensure that the incoming parameter meets components
		// internal constraints. If the current parameter violates any consistency checks, return 
		// SmartACE::ParamResponseType::INVALID, which will result in this commitState to be rejected (not 
		// copied into the globalState) and the corresponding response type is communicated back to the
		// ParameterMaster. Be aware, that you should avoid blocking calls here. If you need blocking
		// calls, use an active trigger in combination with commit.
		return SmartACE::ParamResponseType::OK;
	}
	
	// implement your custom getter methods here
	'''
	
	

	def CharSequence compileUpdateHandlerCC(ComponentParameter usage) 
	'''
		«copyright»
		#include "«usage.ParameterUpdateHandlerHeaderFileName»"
		
		#include "«usage.component.compHeaderFilename»"
		
		SmartACE::CommParameterResponse ParamUpdateHandler::handleParameter(const SmartACE::CommParameterRequest& request)
		{
			SmartACE::CommParameterResponse answer;
		
			std::string tag = request.getTag();
			std::cout<<"PARAMETER: "<<tag<<std::endl;
			
			«usage.parameters.generateHandleEntries»
			
		
			std::cout<<"[handleQuery] PARAMETER "<<tag<<" DONE\n\n";
		
			return answer;
		}
		
		
		ParameterStateStruct ParamUpdateHandler::getGlobalState() const{
			SmartACE::SmartGuard g(globalStateLock);
			return this->globalState;
		}
		
«««		«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance))»
«««			«FOR t: inst.paramSet.parameters.filter(typeof(TriggerDefinition))»
«««			SmartACE::StatusCode ParamUpdateHandler::waitFor«t.name.toUpperCase»() const{
«««				if(«t.name.toUpperCase»_CVmap.find(ACE_Thread_Manager::instance()->thr_self()) == «t.name.toUpperCase»_CVmap.end()){
«««					COMP->component->addCV(&«t.name.toUpperCase»_CVmap[ACE_Thread_Manager::instance()->thr_self()]);
«««				}
«««				return «t.name.toUpperCase»_CVmap[ACE_Thread_Manager::instance()->thr_self()].wait();
«««			}
«««			«ENDFOR»
«««		«ENDFOR»
		
		void ParamUpdateHandler::loadParameter(SmartACE::SmartIniParameter &parameter)
		{
			/*
			 Parameters can be specified via command line -filename=<filename>
		
			 With this parameter present:
			 - The component will look for the file in the current working directory,
			 a path relative to the current directory or any absolute path
			 - The component will use the default values if the file cannot be found
		
			 With this parameter absent:
			 - <Name of Component>.ini will be read from current working directory, if found there
			 - $SMART_ROOT/etc/<Name of Component>.ini will be read otherwise
			 - Default values will be used if neither found in working directory or /etc
			 */
		
			// load parameters
			try
			{
				// print all known parameters
				parameter.print();
		
				//
				// load internal parameters (if any)
				//
				«FOR p: usage.parameters.filter(typeof(InternalParameter)).sortBy[it.name]»
					// parameter «p.name»
					«FOR v: p.attributes.sortBy[it.name]»
						«IF v.type instanceof InlineEnumerationType»
							«IF v.arrayType»
								std::list<std::string> temp_«p.name»_«v.name»;
								if(parameter.get«v.compileCommObjType»List("«p.name»", "«v.name»", temp_«p.name»_«v.name»))
								{
									commitState.«p.name».set«v.name.toFirstUpper»Type(temp_«p.name»_«v.name»);
									globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
								}
							«ELSE»
								std::string temp_«p.name»_«v.name» = "";
								if(parameter.get«v.compileCommObjType»("«p.name»", "«v.name»", temp_«p.name»_«v.name»))
								{
									commitState.«p.name».«v.name» = temp_«p.name»_«v.name»;
									globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
								}
							«ENDIF»
						«ELSE»
							«IF v.arrayType»
								if(parameter.get«v.compileCommObjType»List("«p.name»", "«v.name»", commitState.«p.name».«v.name»))
							«ELSE»
								if(parameter.get«v.compileCommObjType»("«p.name»", "«v.name»", commitState.«p.name».«v.name»))
							«ENDIF»
							{
								globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
							}
						«ENDIF»
					«ENDFOR»
				«ENDFOR»
				
				//
				// load extended parameters (if any)
				//
				«FOR p: usage.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
					// parameter «p.name»
					«FOR v: p.attributes.sortBy[it.name]»
						«IF v.type instanceof InlineEnumerationType»
							«IF v.arrayType»
								std::list<std::string> temp_«p.name»_«v.name»;
								if(parameter.get«v.compileCommObjType»List("«p.name»", "«v.name»", temp_«p.name»_«v.name»))
								{
									commitState.«p.name».set«v.name.toFirstUpper»Type(temp_«p.name»_«v.name»);
									globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
								}
							«ELSE»
								std::string temp_«p.name»_«v.name» = "";
								if(parameter.get«v.compileCommObjType»("«p.name»", "«v.name»", temp_«p.name»_«v.name»))
								{
									commitState.«p.name».«v.name» = temp_«p.name»_«v.name»;
									globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
								}
							«ENDIF»
						«ELSE»
							«IF v.arrayType»
								if(parameter.get«v.compileCommObjType»List("«p.name»", "«v.name»", commitState.«p.name».«v.name»))
							«ELSE»
								if(parameter.get«v.compileCommObjType»("«p.name»", "«v.name»", commitState.«p.name».«v.name»))
							«ENDIF»
							{
								globalState.«p.name».«v.name» = commitState.«p.name».«v.name»;
							}
						«ENDIF»
					«ENDFOR»
				«ENDFOR»
				
				//
				// load instance parameters (if a parameter definition was instantiated in the model)
				//
				«FOR inst: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
					«FOR p: inst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
						// parameter «p.fullyQualifiedName»
						«FOR v: p.attributes.sortBy[it.name]»
							«IF v.type instanceof InlineEnumerationType»
								«IF v.arrayType»
									std::list<std::string> temp_«p.fullyQualifiedVariableName»_«v.name»;
									if(parameter.get«v.compileCommObjType»List("«p.fullyQualifiedName»", "«v.name»", temp_«p.fullyQualifiedVariableName»_«v.name»))
									{
										commitState.«p.fullyQualifiedName».set«v.name.toFirstUpper»Type(temp_«p.fullyQualifiedVariableName»_«v.name»);
										globalState.«p.fullyQualifiedName».«v.name» = commitState.«p.fullyQualifiedName».«v.name»;
									}
								«ELSE»
									std::string temp_«p.fullyQualifiedVariableName»_«v.name» = "";
									if(parameter.get«v.compileCommObjType»("«p.fullyQualifiedName»", "«v.name»", temp_«p.fullyQualifiedVariableName»_«v.name»))
									{
										commitState.«p.fullyQualifiedName».«v.name» = temp_«p.fullyQualifiedVariableName»_«v.name»;
										globalState.«p.fullyQualifiedName».«v.name» = commitState.«p.fullyQualifiedName».«v.name»;
									}
								«ENDIF»
							«ELSE»
								«IF v.arrayType»
									if(parameter.get«v.compileCommObjType»List("«p.fullyQualifiedName»", "«v.name»", commitState.«p.fullyQualifiedName».«v.name»))
								«ELSE»
									if(parameter.get«v.compileCommObjType»("«p.fullyQualifiedName»", "«v.name»", commitState.«p.fullyQualifiedName».«v.name»))
								«ENDIF»
								{
									globalState.«p.fullyQualifiedName».«v.name» = commitState.«p.fullyQualifiedName».«v.name»;
								}
							«ENDIF»
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
		
			} catch (const SmartACE::IniParameterError & e)
			{
				std::cerr << "Exception from parameter handling: " << e << std::endl;
			} catch (const std::exception &ex)
			{
				std::cerr << "Uncaught std:: exception" << ex.what() << std::endl;
			} catch (...)
			{
				std::cerr << "Uncaught exception" << std::endl;
			}
		}
	'''
	def generateHandleEntries(EList<AbstractComponentParameter> list)
	'''
	if (tag == "COMMIT")
	{
		answer.setResponse(globalState.handleCOMMIT(commitState));
		if(answer.getResponse() == SmartACE::ParamResponseType::OK) {
			globalStateLock.acquire();
			// change the content of the globalState, however change only the generated content
			// without affecting potential user member variables (which is more intuitive for the user)
			globalState.setContent(commitState);
			globalStateLock.release();
		} else {
			// the commit validation check returned != OK
			// the commit state is rejected and is not copied into the global state
		}
	}
	«FOR ex: list.filter(typeof(ExtendedParameter)).sortBy[it.name]»
		else if (tag == "«ex.name.toUpperCase»")
		{
			answer.setResponse(SmartACE::ParamResponseType::OK); // TODO: this should be decided according to validation checks defined in the model (not yet implemented)
			
			«var counter = 0»
			«FOR v: ex.attributes»
				«IF v.arrayType»
					std::list<«v.type.compileParamHandlerCppType»> temp_«v.name»;
					if(request.get«v.compileCommObjType»List("«counter=counter+1»", temp_«v.name») == 0) {
					«IF v.type instanceof InlineEnumerationType»
						commitState.«ex.name».set«v.name.toFirstUpper»Type(temp_«v.name»);
					«ELSE»	
						commitState.«ex.name».«v.name» = temp_«v.name»;
					«ENDIF»
				«ELSE»
					«v.type.compileParamHandlerCppType» temp_«v.name» = «v.standardValue»;
					if(request.get«v.compileCommObjType»("«counter=counter+1»", temp_«v.name») == 0) {
						commitState.«ex.name».«v.name» = temp_«v.name»;
				«ENDIF»
				} else {
					answer.setResponse(SmartACE::ParamResponseType::INVALID);
				}
			«ENDFOR»
		}
	«ENDFOR»
	«FOR exTr: list.filter(typeof(ExtendedTrigger)).sortBy[it.name]»
		else if (tag == "«exTr.name.toUpperCase»")
		{
			«var counter = 0»
			«FOR v: exTr.attributes»
				«IF v.arrayType»
					std::list<«v.type.compileParamHandlerCppType»> temp_«v.name»;
					if(request.get«v.compileCommObjType»List("«counter=counter+1»", temp_«v.name») != 0) {
				«ELSE»
					«v.type.compileParamHandlerCppType» temp_«v.name» = «v.standardValue»;
					if(request.get«v.compileCommObjType»("«counter=counter+1»", temp_«v.name») != 0) {
				«ENDIF»
					answer.setResponse(SmartACE::ParamResponseType::INVALID);
				}
			«ENDFOR»
			
			if(answer.getResponse() == SmartACE::ParamResponseType::OK) {
				triggerHandler.handle«exTr.name.toFirstUpper»Core(
				«FOR v: exTr.attributes»
					«IF v.arrayType && v.type instanceof InlineEnumerationType»
						TriggerHandler::«exTr.name»Type::convert«v.name.toFirstUpper»Type(temp_«v.name»)«IF v != exTr.attributes.last», «ENDIF»
					«ELSE»
						temp_«v.name»«IF v != exTr.attributes.last», «ENDIF»
					«ENDIF»
				«ENDFOR»
				);
			}
		}
	«ENDFOR»
	«FOR ex: list.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
		«FOR p: ex.paramSet.parameters.sortBy[it.name]»
			else if (tag == "«p.fullyQualifiedName.toUpperCase»")
			{
				«IF p instanceof TriggerDefinition»
					answer.setResponse(SmartACE::ParamResponseType::OK);
					
					«var counter = 0»
					«FOR v: (p as TriggerDefinition).attributes»
						«IF v.arrayType»
							std::list<«v.type.compileParamHandlerCppType»> temp_«v.name»;
							if(request.get«v.compileCommObjType»List("«counter=counter+1»", temp_«v.name») != 0) {
						«ELSE»
							«v.type.compileParamHandlerCppType» temp_«v.name» = «v.standardValue»;
							if(request.get«v.compileCommObjType»("«counter=counter+1»", temp_«v.name») != 0) {
						«ENDIF»
							answer.setResponse(SmartACE::ParamResponseType::INVALID);
						}
					«ENDFOR»
					
					if(answer.getResponse() == SmartACE::ParamResponseType::OK) {
						triggerHandler.handle«(p as TriggerDefinition).fullyQualifiedVariableName.toFirstUpper»Core(
						«FOR v: (p as TriggerDefinition).attributes»
							«IF v.arrayType && v.type instanceof InlineEnumerationType»
								TriggerHandler::«(p as TriggerDefinition).name»Type::convert«v.name.toFirstUpper»Type(temp_«v.name»)«IF v != (p as TriggerDefinition).attributes.last», «ENDIF»
							«ELSE»
								temp_«v.name»«IF v != (p as TriggerDefinition).attributes.last», «ENDIF»
							«ENDIF»
						«ENDFOR»
						);
					}
				«ELSEIF p instanceof ParameterDefinition»
					answer.setResponse(SmartACE::ParamResponseType::OK); // TODO: this should be decided according to validation checks defined in the model (not yet implemented)
					
					«var counter = 0»
					«FOR v: (p as ParameterDefinition).attributes»
						«IF v.arrayType»
							std::list<«v.type.compileParamHandlerCppType»> temp_«v.name»;
							if(request.get«v.compileCommObjType»List("«counter=counter+1»", temp_«v.name») == 0) {
								«IF v.type instanceof InlineEnumerationType»
									commitState.«p.fullyQualifiedName».set«v.name.toFirstUpper»Type(temp_«v.name»);
								«ELSE»	
									commitState.«p.fullyQualifiedName».«v.name» = temp_«v.name»;
								«ENDIF»
						«ELSE»
							«v.type.compileParamHandlerCppType» temp_«v.name» = «v.standardValue»;
							if(request.get«v.compileCommObjType»("«counter=counter+1»", temp_«v.name») == 0) {
								commitState.«p.fullyQualifiedName».«v.name» = temp_«v.name»;
						«ENDIF»
						} else {
							answer.setResponse(SmartACE::ParamResponseType::INVALID);
						}
					«ENDFOR»
					
				«ENDIF»
			}
		«ENDFOR»
	«ENDFOR»
	else
	{
		/////////////////////////////////////////////////////////////////////
		// default new
		std::cout<<"ERROR wrong Parameter!"<<std::endl;
		answer.setResponse(SmartACE::ParamResponseType::INVALID);
	}
	'''

	def CharSequence compileUpdateHandlerHH(ComponentParameter usage) 
	'''
		«copyright»
		#ifndef _PARAMUPDATEHANDLER_HH_
		#define _PARAMUPDATEHANDLER_HH_
		
		#include "aceSmartSoft.hh"
		#include "«usage.ParameterStateStructHeaderFileName»"
		«IF usage.parameters.filter(typeof(ParameterSetInstance)).exists(pi|pi.paramSet.parameters.exists(pd|pd instanceof TriggerDefinition)) || usage.parameters.exists(tr|tr instanceof ExtendedTrigger)»
		#include "«usage.TriggerHandlerHeaderFileName»"
		«ENDIF»
		
		class ParamUpdateHandler: public SmartACE::ParameterUpdateHandler {
		public:
			SmartACE::CommParameterResponse handleParameter(const SmartACE::CommParameterRequest& request);
		
			ParameterStateStruct getGlobalState() const;
«««		«IF usage.paramSet != null»
«««			// wait for trigger methods
«««			«FOR p: usage.paramSet.params»
«««				«IF p instanceof Trigger»
«««					SmartACE::StatusCode waitFor«(p as Trigger).name.toUpperCase»() const;
«««				«ENDIF»
«««			«ENDFOR»
«««		«ENDIF»
			
			void loadParameter(SmartACE::SmartIniParameter &parameter);
		
		protected:
			//local globale state stuff
			ParameterStateStruct globalState,commitState;
			mutable SmartACE::SmartMutex globalStateLock;
			«IF usage.parameters.filter(typeof(ParameterSetInstance)).exists(pi|pi.paramSet.parameters.exists(pd|pd instanceof TriggerDefinition)) || usage.parameters.exists(tr|tr instanceof ExtendedTrigger)»
			TriggerHandler triggerHandler;
			«ENDIF»
«««			«IF usage.paramSet != null»
«««				//trigger CVs
«««				«FOR p: usage.paramSet.params»
«««				«IF p instanceof Trigger»
«««				mutable std::map<ACE_thread_t,SmartACE::SmartCVwithMemory> «(p as Trigger).name.toUpperCase»_CVmap;
«««				«ENDIF»
«««				«ENDFOR»
«««			«ENDIF»
		};
		
		#endif
	'''

	def CharSequence compileStructCore(ComponentParameter usage) 
	'''
		«copyright»
		#ifndef _PARAMETERSTATESTRUCTCORE_HH
		#define _PARAMETERSTATESTRUCTCORE_HH
		
		#include "aceSmartSoft.hh"
		
		#include <iostream>
		
		// forward declaration (in order to define validateCOMMIT(ParameterStateStruct) which is implemented in derived class)
		class ParameterStateStruct;
		
		class ParameterStateStructCore
		{
			friend class ParamUpdateHandler;
		public:
			
			«usage.generateMemberStructs»
			
		protected:

			«usage.generateMemberVariables»
			
«««			«usage.generateUpcallsCore»
«««			
«««		«IF usage.paramSet != null»
«««			// trigger methods
«««			«FOR trigger: usage.paramSet.params»
«««			«IF trigger instanceof Trigger»
«««			SmartACE::ParamResponseType handle«trigger.name.toUpperCase»Core() {
«««					return handle«trigger.name.toUpperCase»();
«««			}
«««			«ENDIF»
«««			«ENDFOR»
«««		«ENDIF»

«««			«usage.generateUpcalls»
«««			«IF usage.paramSet != null»
«««				// trigger user methods
«««				«FOR trigger: usage.paramSet.params»
«««					«IF trigger instanceof Trigger»
«««					virtual SmartACE::ParamResponseType handle«trigger.name.toUpperCase»() = 0;
«««					«ENDIF»
«««				«ENDFOR»
«««			«ENDIF»
			«usage.generateMembersCopyFunction»

			// special trigger method (user upcall) called before updating parameter global state
			virtual SmartACE::ParamResponseType handleCOMMIT(const ParameterStateStruct &commitState) = 0;
		public:
			ParameterStateStructCore() {  }
			virtual ~ParameterStateStructCore() {  }
			
			«usage.generateGetterMethods»
			
			// helper method to easily implement output stream in derived classes
			void to_ostream(std::ostream &os = std::cout) const
			{
				«usage.generateOSmembers»
			}
		};
		
		#endif
	'''
	
	def generateEnumClass(AttributeDefinition attr) 
	{
		if(attr.type instanceof InlineEnumerationType)
		{
			var en = (attr.type as InlineEnumerationType)
			'''
				/**
				 * Wrapper class for Enum «attr.name»
				 */
				class «attr.name»Type {
				public:
					enum ENUM_«attr.name» {
						ENUM_VALUE_UNDEFINED = 0,
						«var counter = 0»
						«FOR el: en.enums»
						«el.name» = «counter=counter+1»«IF el != en.enums.last»,«ENDIF»
						«ENDFOR»
					};
					
					// default constructor
					«attr.name»Type() { 
						value = ENUM_VALUE_UNDEFINED;
					}
					
					// copy constructor for enum type
					«attr.name»Type(ENUM_«attr.name» e) {
						value = e;
					}
					
					// copy constructor for String type
					«attr.name»Type(const std::string &literal) {
						from_string(literal);
					}
					
					// from_string assignment operator
					«attr.name»Type& operator = (const std::string &literal) {
						from_string(literal);
						return *this;
					}
					
					// ENUM operator
					operator ENUM_«attr.name»() const {
						return value;
					}
					
					// String operator
					operator std::string() const {
						return to_string();
					}
					
					// compare operator
					bool operator == (const ENUM_«attr.name» t) const {
						return this->value == t;
					}
					
					std::string to_string() const {
						std::string result = "";
						switch (value) {
							«FOR el: en.enums.sortBy[it.name]»
							case «el.name»:
								result = "«el.name»";
								break;
							«ENDFOR»
							default:
								result = "ENUM_VALUE_UNDEFINED";
								break;
						};
						return result;
					}
					
					void from_string(const std::string &literal) {
						«FOR el: en.enums»
							«IF el == en.enums.head»
							if(literal == "«el.name»") {
							«ELSE»
							} else if(literal == "«el.name»") {
							«ENDIF»
								value = «el.name»;
						«ENDFOR»
						} else {
							value = ENUM_VALUE_UNDEFINED;
						}
					}
					
					// helper method to easily implement output stream
					void to_ostream(std::ostream &os = std::cout) const {
						os << to_string();
					}
				private:
					ENUM_«attr.name» value;
				};
			'''
		}
	}
	
	def generateMemberStructs(ComponentParameter usage) '''
		///////////////////////////////////////////
		// Internal params
		///////////////////////////////////////////
		
		«FOR p: usage.parameters.filter(typeof(InternalParameter))»
			/**
			 * Definition of Parameter «p.name»
			 */
			class «p.name»Type 
			{
				friend class ParamUpdateHandler;
				«FOR attr: p.attributes.filter(v|v.type instanceof InlineEnumerationType).sortBy[it.name]»
					public:
					«attr.generateEnumClass»
					
					«IF attr.arrayType»
						«attr.generateEnumArrayConversionMethod»
						
					«ENDIF»
				«ENDFOR»
			protected:
				/**
				 * here are the member definitions
				 */
				«FOR el: p.attributes.sortBy[it.name]»
					«IF el.arrayType»
						std::list<«el.compileCppType»> «el.name»;
					«ELSE»
						«el.compileCppType» «el.name»;
					«ENDIF»
				«ENDFOR»
			
			public:
				// default constructor
				«p.name»Type() {
					«FOR el: p.attributes.sortBy[it.name]»
						«IF el.type.array !== null»
							«FOR v: (el.defaultvalue as ArrayValue).values»
								«el.name».push_back(«v.compileContent»);
							«ENDFOR»
						«ELSE»
							«el.name» = «el.defaultvalue.compileContent»;
						«ENDIF»
					«ENDFOR»
				}
			
				/**
				 * here are the public getters
				 */
				«FOR el: p.attributes.sortBy[it.name]»
					«IF el.type.array !== null»
						inline std::list<«el.compileCppType»> get«el.name.toFirstUpper»() const { return «el.name»; }
					«ELSE»
						inline «el.compileCppType» get«el.name.toFirstUpper»() const { return «el.name»; }
					«ENDIF»
				«ENDFOR»
				
				void to_ostream(std::ostream &os = std::cout) const
				{
					os << "«p.name»(";
					«FOR el: p.attributes.sortBy[it.name]»
						«IF el.defaultvalue instanceof ArrayValue»
							std::list<«el.compileCppType»>::const_iterator «el.name»It;
							for(«el.name»It=«el.name».begin(); «el.name»It!=«el.name».end(); «el.name»It++)
							{
							«FOR v: (el.defaultvalue as ArrayValue).values»
								os << "«el.name» = " << *«el.name»It << ", ";
							«ENDFOR»
							}
						«ELSE»
							os << "«el.name» = " << «el.name» << ", ";
						«ENDIF»
					«ENDFOR»
					os << ")\n";
				}
				
			}; // end class «p.name»Type
			
		«ENDFOR»
	
		///////////////////////////////////////////
		// External params
		///////////////////////////////////////////
		
		«FOR ex: usage.parameters.filter(typeof(ExtendedParameter))»
			/**
			 * Definition of Parameter «ex.name»
			 */
			class «ex.name»Type 
			{
				friend class ParamUpdateHandler;
				«FOR attr: ex.attributes.filter(v|v.type instanceof InlineEnumerationType).sortBy[it.name]»
					public:
					«attr.generateEnumClass»
					
					«IF attr.arrayType»
						«attr.generateEnumArrayConversionMethod»
						
					«ENDIF»
				«ENDFOR»
			protected:
				/**
				 * here are the member definitions
				 */
				«FOR el: ex.attributes.sortBy[it.name]»
					«IF el.arrayType»
						std::list<«el.compileCppType»> «el.name»;
					«ELSE»
						«el.compileCppType» «el.name»;
					«ENDIF»
				«ENDFOR»
			
			public:
				// default constructor
				«ex.name»Type() {
					«FOR el: ex.attributes.sortBy[it.name]»
						«IF el.defaultvalue instanceof ArrayValue»
							«FOR v: (el.defaultvalue as ArrayValue).values»
								«el.name».push_back(«v.compileContent»);
							«ENDFOR»
						«ELSE»
							«el.name» = «el.defaultvalue.compileContent»;
						«ENDIF»
					«ENDFOR»
				}
			
				/**
				 * here are the public getters
				 */
				«FOR el: ex.attributes.sortBy[it.name]»
					«IF el.arrayType»
						inline std::list<«el.compileCppType»> get«el.name.toFirstUpper»() const { return «el.name»; }
					«ELSE»
						inline «el.compileCppType» get«el.name.toFirstUpper»() const { return «el.name»; }
					«ENDIF»
				«ENDFOR»
				
				void to_ostream(std::ostream &os = std::cout) const
				{
					os << "«ex.name»(";
					«FOR el: ex.attributes.sortBy[it.name]»
						«IF el.defaultvalue instanceof ArrayValue»
							std::list<«el.compileCppType»>::const_iterator «el.name»It;
							for(«el.name»It=«el.name».begin(); «el.name»It!=«el.name».end(); «el.name»It++)
							{
							«FOR v: (el.defaultvalue as ArrayValue).values»
								os << "«el.name» = " << *«el.name»It << ", ";
							«ENDFOR»
							}
						«ELSE»
							os << "«el.name» = " << «el.name» << ", ";
						«ENDIF»
					«ENDFOR»
					os << ")\n";
				}
			}; // end class «ex.name»Type
			
		«ENDFOR»
	
		///////////////////////////////////////////
		// Instance params
		///////////////////////////////////////////
		
		«FOR repo: usage.allRepos.entrySet»
			/**
			 * Definition of instantiated ParameterRepository «repo.key»
			 */
			class «repo.key»Type {
				friend class ParamUpdateHandler;
				public:
				«FOR set_inst: repo.value»
					/**
					 * Definition of instantiated ParameterSet «set_inst.paramSet.name»
					 */
					class «set_inst.paramSet.name»Type {
						friend class ParamUpdateHandler;
						public:
						«FOR param: set_inst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
							/**
							 * Definition of Parameter «param.name»
							 */
							class «param.name»Type {
								friend class ParamUpdateHandler;
								«FOR attr: param.attributes.filter[it.type instanceof InlineEnumerationType].sortBy[it.name]»
									public:
									«attr.generateEnumClass»
									
									«IF attr.arrayType»
										«attr.generateEnumArrayConversionMethod»
									«ENDIF»
									
								«ENDFOR»
							
							protected:
								/**
								 * here are the member definitions
								 */
								«FOR v: param.attributes.sortBy[it.name]»
									«IF v.arrayType»
										std::list<«v.compileCppType»> «v.name»;
									«ELSE»
										«v.compileCppType» «v.name»;
									«ENDIF»
								«ENDFOR»
								
							public:
								// default constructor
								«param.name»Type() {
									«FOR v: param.attributes.sortBy[it.name]»
										«v.generateConstructorDefaultValues(param, set_inst)»
									«ENDFOR»
								}
								
								/**
								 * here are the getter methods
								 */
								«FOR v: param.attributes.sortBy[it.name]»
									«IF v.arrayType»
										inline std::list<«v.compileCppType»> get«v.name.toFirstUpper»() const { return «v.name»; }
									«ELSE»
										inline «v.compileCppType» get«v.name.toFirstUpper»() const { return «v.name»; }
									«ENDIF»
								«ENDFOR»
								
								void to_ostream(std::ostream &os = std::cout) const
								{
									os << "\t«param.name»(";
									«FOR el: param.attributes.sortBy[it.name]»
										«IF el instanceof ArrayValue»
											std::list<«el.compileCppType»>::const_iterator «el.name»It;
											for(«el.name»It=«el.name».begin(); «el.name»It!=«el.name».end(); «el.name»It++)
											{
											«FOR v: (el as ArrayValue).values»
												os << "«el.name» = " << *«el.name»It << ", ";
											«ENDFOR»
											}
										«ELSE»
											os << "«el.name» = " << «el.name» << ", ";
										«ENDIF»
									«ENDFOR»
									os << ")\n";
								}
								
							}; // end of parameter class «param.name»Type
							
						«ENDFOR»
						protected:
							/**
							 * internal members
							 */
							«FOR param: set_inst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
								«param.name»Type «param.name»;
							«ENDFOR»
							
						public:
							/**
							 * public getter methods
							 */
							«FOR param: set_inst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
								inline «param.name»Type get«param.name.toFirstUpper»() const { return «param.name»; }
							«ENDFOR»
							
							void to_ostream(std::ostream &os = std::cout) const
							{
								os << "«set_inst.paramSet.name»(\n";
								«FOR param: set_inst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
									«param.name».to_ostream(os);
								«ENDFOR»
								os << ")";
							}
					}; // end of parameter-set class «set_inst.paramSet.name»Type
					
				«ENDFOR»
				protected:
					/**
					 * internal members
					 */
					«FOR set_inst: repo.value»
						«set_inst.paramSet.name»Type «set_inst.paramSet.name»;
					«ENDFOR»
				
				public:
					/**
					 * public getter methods
					 */
					«FOR set_inst: repo.value»
						inline «set_inst.paramSet.name»Type get«set_inst.paramSet.name.toFirstUpper»() const { return «set_inst.paramSet.name»; }
					«ENDFOR»
					
					void to_ostream(std::ostream &os = std::cout) const
					{
						os << "«repo.key»(\n";
						«FOR set_inst: repo.value»
							«set_inst.paramSet.name».to_ostream(os);
						«ENDFOR»
						os << ")";
					}
			}; // end of parameter-repository wrapper class «repo.key»Type
		«ENDFOR»
	'''
	
	def private String generateConstructorDefaultValues(AttributeDefinition attr, ParameterDefinition par, ParameterSetInstance set_inst) {
		var par_inst = set_inst.parameterInstances.filter(typeof(ParameterInstance))?.findFirst(p|p.parameterDef.equals(par))
		var String result = ""
		if(par_inst !== null) {
			var attr_inst = par_inst.attributes.findFirst(a|a.attribute.equals(attr))
			if(attr_inst !== null) {
				if(attr_inst.value instanceof ArrayValue) {
					for(curr_attr: (attr_inst.value as ArrayValue).values) {
						result = result + '''«attr_inst.attribute.name».push_back(«curr_attr.compileContent»);''' 
					}
				} else {
					result = '''«attr_inst.attribute.name» = «attr_inst.value.compileContent»;'''
				}
			}
		}
		if(result.empty) {
			// no instance value found -> just use a standard value
			result = '''«attr.name» = «attr.standardValue»;'''
		}
		return result
	}
	
	def private Map<String, List<ParameterSetInstance> > getAllRepos(ComponentParameter usage) {
		var Map<String, List<ParameterSetInstance> > repos = new HashMap<String, List<ParameterSetInstance> >()
		for(set_inst: usage.parameters.filter(typeof(ParameterSetInstance))) {
			var curr_repo = (set_inst.paramSet.eContainer as ParameterSetRepository);
			if(repos.get(curr_repo.name) === null) {
				repos.put(curr_repo.name, new ArrayList<ParameterSetInstance>())
			}
			repos.get(curr_repo.name).add(set_inst);
		}
		return repos
	}
	
	def private generateEnumArrayConversionMethod(AttributeDefinition attr)
	'''
		void set«attr.name.toFirstUpper»Type(const std::list<std::string> &«attr.name») {
			std::list<std::string>::const_iterator it;
			this->«attr.name».clear();
			for(it=«attr.name».begin(); it!=«attr.name».end(); it++) {
				this->«attr.name».push_back(*it);
			}
		}
	'''
	
	def generateMembersCopyFunction(ComponentParameter model)
	'''
	void setContent(const ParameterStateStructCore &commit) {
		// External params
		«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
			this->«ex.name» = commit.get«ex.name.toFirstUpper»();
		«ENDFOR»
	
		«FOR repo: model.allRepos.keySet»
			this->«repo» = commit.get«repo.toFirstUpper»();
		«ENDFOR»
	}
	'''
	
	def generateMemberVariables(ComponentParameter model) 
	'''
	// Internal params
	«FOR p: model.parameters.filter(typeof(InternalParameter)).sortBy[it.name]»
		«p.name»Type «p.name»;
	«ENDFOR»

	// External params
	«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
		«ex.name»Type «ex.name»;
	«ENDFOR»
	
	// Instance params (encapsulated in a wrapper class for each instantiated parameter repository)
	«FOR repo: model.allRepos.keySet»
		«repo»Type «repo»;
	«ENDFOR»
	'''
	
	def generateOSmembers(ComponentParameter model)
	'''
	// Internal params
	«FOR p: model.parameters.filter(typeof(InternalParameter)).sortBy[it.name]»
		«p.name».to_ostream(os);
	«ENDFOR»

	// External params
	«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
		«ex.name».to_ostream(os);
	«ENDFOR»
	
	// Instance params (encapsulated in a wrapper class for each instantiated parameter repository)
	«FOR repo: model.allRepos.keySet»
		«repo».to_ostream(os);
	«ENDFOR»
	'''
	
	def generateUpcallsCore(ComponentParameter model) 
	'''
	// Extended param upcall methods
	«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
		SmartACE::ParamResponseType handle«ex.name.toUpperCase»Core(«ex.attributes.getNameTypes(true)») {
			«FOR el: ex.attributes.sortBy[it.name]»
				this->«ex.name».«el.name» = «el.name»;
			«ENDFOR»
			return handle«ex.name.toUpperCase»(«ex.name»);
		}
	«ENDFOR»
	
	«FOR paramSetInst : model.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
		// Instance param upcall methods
		«FOR p: paramSetInst.paramSet.parameters.filter(typeof(ParameterDefinition))»
			SmartACE::ParamResponseType handle«p.name.toUpperCase»Core(«p.attributes.getNameTypes(true)») {
				«FOR v: p.attributes.sortBy[it.name]»
					this->«p.name».«v.name» = «v.name»;
				«ENDFOR»
				return handle«p.name.toUpperCase»(«p.attributes.ntNames»);
			}
		«ENDFOR»
	«ENDFOR»
	'''
	
	def generateUpcalls(ComponentParameter model)
	'''
	// Extended param user upcall methods
	«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
		virtual SmartACE::ParamResponseType handle«ex.name.toUpperCase»(«ex.attributes.getNameTypes(true)») = 0;
	«ENDFOR»
	
	«FOR paramSetInst : model.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
		// Instance param user upcall methods
		«FOR p: paramSetInst.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
			virtual SmartACE::ParamResponseType handle«p.name.toUpperCase»(«p.attributes.getNameTypes(true)») = 0;
		«ENDFOR»
	«ENDFOR»
	'''
	
	def generateGetterMethods(ComponentParameter model)
	'''
		// internal param getters
		«FOR in : model.parameters.filter(typeof(InternalParameter)).sortBy[it.name]»
			«IF !in.attributes.empty»
				«in.name»Type get«in.name.toFirstUpper»() const {
					return «in.name»;
				}
			«ENDIF»
		«ENDFOR»
		
		// external param getters
		«FOR ex: model.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
			«IF !ex.attributes.empty»
				«ex.name»Type get«ex.name.toFirstUpper»() const {
					return «ex.name»;
				}
			«ENDIF»
		«ENDFOR»
		
		// repo wrapper class getter(s)
		«FOR repo: model.allRepos.keySet»
			«repo»Type get«repo.toFirstUpper»() const {
				return «repo»;
			}
		«ENDFOR»
	'''

	def compileIniFile(ComponentParameter usage) 
	'''
		#####################
		# internal parameters
		#####################
		«FOR internalGroup: usage.parameters.filter(typeof(InternalParameter)).sortBy(g|g.name)»
			«internalGroup.compileIniFileParameter»
		«ENDFOR»
		
		#####################
		# extended parameters
		#####################
		«FOR extended: usage.parameters.filter(typeof(ExtendedParameter)).sortBy[it.name]»
			«extended.compileIniFileParameter»
		«ENDFOR»
		
		#####################
		# instance parameters
		#####################
		«FOR paramSetInstance: usage.parameters.filter(typeof(ParameterSetInstance)).sortBy[it.name]»
			##########################
			# ParameterSet «paramSetInstance.name»
			«FOR par: paramSetInstance.paramSet.parameters.filter(typeof(ParameterDefinition)).sortBy[it.name]»
				«IF paramSetInstance.parameterInstances.filter(typeof(ParameterInstance)).exists(p|p.parameterDef == par)»
					«paramSetInstance.parameterInstances.filter(typeof(ParameterInstance)).findFirst(p|p.parameterDef == par).compileIniFileParameter»
				«ELSE»
					«FOR el: par.attributes.sortBy[it.name]»
						«IF el.arrayType»
							# element «el.name» is an array type without a default value
						«ELSE»
							«el.name» «el.type.defaultValue»
						«ENDIF»
					«ENDFOR»
					
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
	'''

	def compileIniFileParameter(ComponentParameterBase parameter)
	'''
		«IF parameter instanceof InternalParameter»
			##########################
			# InternalParameter «parameter.name»
			[«parameter.name»]
			«FOR el: parameter.attributes.sortBy(v|v.name)»
				«el.compileIniAttribute»
			«ENDFOR»
		«ELSEIF parameter instanceof ExtendedParameter»
			«val extended = parameter as ExtendedParameter»
			##########################
			# ExtendedParameter «extended.name»
			[«extended.name»]
			«FOR nv: extended.attributes.sortBy[it.name]»
				«nv.compileIniAttribute»
			«ENDFOR»
		«ELSEIF parameter instanceof ParameterInstance»
			«val paramInstance = parameter as ParameterInstance»
			##########################
			# ParameterInstance «paramInstance.name»
			[«paramInstance.name»]
			«FOR v: paramInstance.attributes»
				«v.compileIniAttribute»
			«ENDFOR»
		«ENDIF»
		
	'''
	
	def dispatch compileIniAttribute(AttributeDefinition attr) 
	'''
		«IF attr.defaultvalue instanceof SingleValue»
			«attr.name» «(attr.defaultvalue as SingleValue).value»
		«ELSEIF attr.defaultvalue instanceof ArrayValue»
			# «attr.name» has an array value (defined by assigning each array element in a separate line)
			«FOR arrVal: (attr.defaultvalue as ArrayValue).values»
				«attr.name» «arrVal.value»
			«ENDFOR»
		«ENDIF»
	'''
	def dispatch compileIniAttribute(AttributeRefinement attr) 
	'''
		«IF attr.value instanceof SingleValue»
			«attr.attribute.name» «(attr.value as SingleValue).value»
		«ELSEIF attr.value instanceof ArrayValue»
			# «attr.attribute.name» has an array value (defined by assigning each array element in a separate line)
			«FOR arrVal: (attr.value as ArrayValue).values»
				«attr.attribute.name» «arrVal.value»
			«ENDFOR»
		«ENDIF»
	'''
}
	
