//===================================================================================
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtend.smartsoft.generator.system

import org.ecore.component.componentDefinition.Activity
import org.ecore.component.performanceExtension.DefaultInputTrigger
import org.ecore.component.performanceExtension.ActivationConstraints
import org.ecore.component.performanceExtension.DefaultTrigger
import org.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.ecore.system.activityArchitecture.DataTriggered
import org.ecore.system.activityArchitecture.PeriodicTimer
import org.ecore.system.activityArchitecture.Sporadic
import org.ecore.system.componentArchitecture.ActivityConfigurationMapping
import org.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.ecore.system.activityArchitecture.DataFlow
import org.ecore.system.activityArchitecture.ActivityNode
import org.ecore.system.componentArchitecture.ComponentInstance
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.component.componentDefinition.OutputPort
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*

class ActivityConfig {
	def compileActivityNode(ActivityConfigurationMapping mapping)
	'''
		«mapping.config.activationSource.compile(mapping)»
		«IF mapping.config.scheduler !== null»
		scheduler «mapping.config.scheduler.type.literal»
		priority «mapping.config.scheduler.priority»
		«ENDIF»
		«IF mapping.config.affinity !== null»
		cpuAffinity «mapping.config.affinity.coreNumber»
		«ENDIF»
	'''
	
	def dispatch compile(DataTriggered data, ActivityConfigurationMapping mapping)
	'''
	triggerType DataTriggered
	inPortRef «mapping.inputPort?.name»
	prescale «data.prescale»
	'''
	def dispatch compile(PeriodicTimer timer, ActivityConfigurationMapping mapping)
	'''
	triggerType PeriodicTimer
	periodicActFreqHz «timer.periodicActFreq»
	'''
	def dispatch compile(Sporadic timer, ActivityConfigurationMapping mapping)
	'''
	triggerType Sporadic
	minActFreqHz «timer.minActFreq»
	maxActFreqHz «timer.maxActFreq»
	'''
	
	
	def getInputPort(ActivityConfigurationMapping mapping) {
		val sourceNode = mapping.sourceNode
		if(sourceNode instanceof ActivityNode) {
			val componentInstance = mapping.eContainer
			if(componentInstance instanceof ComponentInstance) {
				val systemModel = componentInstance.eContainer
				if(systemModel instanceof SystemComponentArchitecture) {
					for(port: componentInstance.ports) {
						if(mapping.activity.inputLinks.exists[it.inputPort==port.port]) {
							val connection = systemModel.connections.findFirst[it.from==port]
							if(connection !== null) {
								val sourcePort = connection.to.port
								val sourceComponent = connection.to.eContainer as ComponentInstance
								if(sourcePort instanceof OutputPort) {
									val sourceActivity = sourcePort.activity
									for(sourceActMapping: sourceComponent.extensions.filter(ActivityConfigurationMapping)) {
										if(sourceActMapping.activity == sourceActivity && sourceActMapping.config==sourceNode) {
											return port.port
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			//TODO: implement InputHandler type
		}
		return null;
	}
	
	def getSourceNode(ActivityConfigurationMapping mapping) {
		val activationSource = mapping.config.activationSource
		if(activationSource instanceof DataTriggered) {
			val actModel = mapping.config.eContainer
			if(actModel instanceof ActivityArchitectureModel) {
				val df = actModel.elements.filter(DataFlow).findFirst[it.destination==activationSource.triggerRef]
				if(df !== null) {
					return df.source
				}
			}
		}
		return null;
	}
	
	def compileDefaultActivity(Activity activity)
	'''
	«IF !activity.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
	minActFreqHz «activity.minActFreq»
	maxActFreqHz «activity.maxActFreq»
	«FOR trigger: activity.extensions.filter(DefaultTrigger)»
		«IF trigger instanceof DefaultPeriodicTimer»
		# setup default trigger as PeriodicTimer
		triggerType PeriodicTimer
		periodicActFreqHz «trigger.periodicActFreq»
		«ELSEIF trigger instanceof DefaultInputTrigger»
		# setup default trigger as DataTriggered
		triggerType DataTriggered
		inPortRef «(trigger as DefaultInputTrigger).inputLink.inputPort.name»
		prescale 1
		«ENDIF»
	«ENDFOR»
	# other trigger-types are:
	#triggerType PeriodicTimer
	#periodicActFreqHz «activity.minActFreq»
	# or alternatively:
	#triggerType DataTriggered
	#inPortRef <InPortName>
	#prescale 1
	«ENDIF»
	# optional scheduling parameters
	# scheduler FIFO
	# priority 0
	# cpuAffinity 0
	'''
	
	def Double getMinActFreq(Activity activity) {
		if(activity.extensions.filter(typeof(ActivationConstraints)).size == 0) {
			return 0.0
		} else {
			return activity.extensions.filter(typeof(ActivationConstraints)).get(0).minActFreq
		}
	}
	def Double getMaxActFreq(Activity activity) {
		if(activity.extensions.filter(typeof(ActivationConstraints)).size == 0) {
			return 0.0
		} else {
			return activity.extensions.filter(typeof(ActivationConstraints)).get(0).maxActFreq
		}
	}
}