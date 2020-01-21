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

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import static extension org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitectureModelUtility.*
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import org.eclipse.smartmdsd.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.PublicOperationMode
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance

class SystemGenerator2Impl extends AbstractGenerator {
	
	@Inject extension CopyrightHelpers
	@Inject extension ActivityConfig 
	@Inject extension BehaviorSystem
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model: resource.allContents.toIterable.filter(typeof(SystemComponentArchitecture))) {
			fsa.generateFile("CMakeLists.txt", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, model.compileCMakeLists)
			fsa.generateFile("BuildExternalComponents.cmake", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, model.compileBuildExternalComponents)
			
			//behavior files
			fsa.generateFile("CoordinationModuleConnections.json", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, model.compileModuleConnections)
			fsa.generateFile("behaviorProjectFiles.sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, model.compileBehaviorProjectFiles)
			
			for(component: model.components) {
				fsa.generateFile(component.name+".ini", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, component.compileIniFile)
			}
		}
	}	
	
	def compileCMakeLists(SystemComponentArchitecture system)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
	
	INCLUDE(src-gen/system/BuildExternalComponents.cmake)
	'''
	
	def compileBuildExternalComponents(SystemComponentArchitecture system)
	'''
		CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
		PROJECT(«system.name»)
		
		# this is a pseudo-target just to trigger CMake builder
		ADD_CUSTOM_TARGET(${PROJECT_NAME} ALL)
	'''
	
	
	def String getSmartSoftFolder(ComponentInstance componentInstance)
	{
		val proj = ResourcesPlugin.getWorkspace().getRoot().getProject(componentInstance.component.name)
		val smartSoftFolder = proj.getFolder("smartsoft")
		if(smartSoftFolder.exists) {
			return smartSoftFolder.location.toOSString
		}
		return ""
	}
	
	def compileIniFile(ComponentInstance compInstance)
	'''
	[smartsoft]
	«getCopyrightHash()»
	
	##########################
	# component parameters
	
	[component]
	
	# the name of the component for the naming service
	name «compInstance.name»
	# the initial MainState of the component
	initialMainState «compInstance.initialMainState»
	#defaultScheduler FIFO
	#useLogger true
	
	##########################
	# server port parameters
	«FOR server: compInstance.allServerPorts»
	
	[«server.name»]
	serviceName «server.name»
	roboticMiddleware «compInstance.getSelectedMiddlewareString(server)»
«««	«IF cl.stereotype instanceof profile.SmartPushTimedServer»
«««		cycle «(cl.stereotype as profile.SmartPushTimedServer).cycleInSeconds»
«««	«ENDIF»
	«ENDFOR»	
	
	##########################
	# client port parameters
	«FOR client: compInstance.allClientPorts»
	
	[«client.name»]
	wiringName «client.name»
	«IF compInstance.hasConnection(client)»
		serverName «compInstance.getConnectedServer(client).name»
		serviceName «compInstance.getConnectedService(client).name»
		initialConnect true
	«ELSE»
		serverName unknown
		serviceName unknown
		initialConnect false
	«ENDIF»
	roboticMiddleware «compInstance.getSelectedMiddlewareString(client)»
	interval 1
	«ENDFOR»
	
	«FOR opcDeviceClient: compInstance.component.elements.filter(OpcUaDeviceClient)»
		[«opcDeviceClient.name»]
		«IF compInstance.extensions.filter(OpcUaDeviceClientInstance).exists[it.deviceClient==opcDeviceClient]»
		deviceURI «compInstance.extensions.filter(OpcUaDeviceClientInstance).findFirst[it.deviceClient==opcDeviceClient]?.deviceURI»
		«ELSE»
		deviceURI «opcDeviceClient.deviceURI»
		«ENDIF»
		opcuaXmlFile «opcDeviceClient.opcuaXmlFile»
	«ENDFOR»
	
	«FOR opcStatusServer: compInstance.component.elements.filter(OpcUaReadServer)»
		[«opcStatusServer.name»]
		«IF compInstance.extensions.filter(OpcUaReadServerInstance).exists[it.readServer==opcStatusServer]»
		portNumber «compInstance.extensions.filter(OpcUaReadServerInstance).findFirst[it.readServer==opcStatusServer].portNumber»
		«ELSE»
		portNumber «opcStatusServer.portNumber»
		«ENDIF»
	«ENDFOR»
	
	##########################
	# activity parameters
	«FOR activity: compInstance.component.activities»
	
	[«activity.name»]
	«IF compInstance.extensions.filter(ActivityConfigurationMapping).exists[it.activity==activity]»
		«compInstance.extensions.filter(ActivityConfigurationMapping).findFirst[it.activity==activity].compileActivityNode»
	«ELSE»
		«activity.compileDefaultActivity»
	«ENDIF»
	«ENDFOR»
	'''
	
	def private getInitialMainState(ComponentInstance componentInstance) {
		for(slave: componentInstance.component.elements.filter(CoordinationSlavePort)) {
			for(mode: slave.elements.filter(PublicOperationMode).filter[it.isIsDefaultInit==true]) {
				return mode.name
			}
		}
		return "Neutral"
	}
	
	def private hasConnection(ComponentInstance component, ComponentPort service) {
		val port = component.ports.findFirst[it.port==service]
		if(port instanceof RequiredService) {
			val parent = component.eContainer
			if(parent instanceof SystemComponentArchitecture) {
				return parent.connections.exists[it.from==port]
			}
		}
		return false
	}
	
	def private ProvidedService getConnectedService(ComponentInstance component, ComponentPort service) {
		val port = component.ports.findFirst[it.port==service]
		if(port instanceof RequiredService) {
			val parent = component.eContainer
			if(parent instanceof SystemComponentArchitecture) {
				val connection = parent.connections.findFirst[it.from==port]
				if(connection !== null) {
					return connection.to
				}
			}
		}
		return null
	}
	
	def private ComponentInstance getConnectedServer(ComponentInstance component, ComponentPort service) {
		val connectedSvc = component.getConnectedService(service)
		if(connectedSvc !== null) {
			val parent = connectedSvc.eContainer
			if(parent instanceof ComponentInstance) {
				return parent
			}
		}
		return null
	}
	
	def String getSelectedMiddlewareString(ComponentInstance component, ComponentPort service) {
		val parent = component.eContainer
		if(parent instanceof SystemComponentArchitecture) {
			val port = component.ports.findFirst[it.port==service]
			if(port instanceof RequiredService) {
				val connection = parent.connections.findFirst[it.from==port]
				if(connection !== null) {
					if(connection.middlewareSelection !== null) {
						return connection.middlewareSelection.eClass.name
					}
				}
			} else  if(port instanceof ProvidedService) {
				for(connection: parent.connections.filter[it.to == port]) {
					if(connection.middlewareSelection !== null) {
						// use the first connection that has a middleware selection for configuring the middleware
						return connection.middlewareSelection.eClass.name
					}
				}
			}
		}
		return ACE_SmartSoft.simpleName
	}
}