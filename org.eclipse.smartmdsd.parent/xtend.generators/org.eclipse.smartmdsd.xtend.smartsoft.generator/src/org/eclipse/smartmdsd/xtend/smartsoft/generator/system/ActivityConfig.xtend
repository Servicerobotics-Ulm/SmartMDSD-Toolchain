//===============================================================
//
//  Copyright (C) 2018 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//===============================================================
package org.eclipse.smartmdsd.xtend.smartsoft.generator.system

import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger
import org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints
import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultTrigger
import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataTriggered
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.PeriodicTimer
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.Sporadic
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataFlow
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
import static extension org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*

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
		inPortRef «trigger.inputLink.inputPort.name»
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