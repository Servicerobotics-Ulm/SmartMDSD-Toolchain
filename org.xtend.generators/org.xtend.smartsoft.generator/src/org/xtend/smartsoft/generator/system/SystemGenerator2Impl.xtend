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

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtend.smartsoft.generator.CopyrightHelpers
import com.google.inject.Inject
import org.ecore.system.componentArchitecture.ComponentInstance
import static extension org.ecore.system.componentArchitecture.ComponentArchitectureModelUtility.*
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.system.componentArchitecture.ProvidedService
import org.ecore.component.componentDefinition.ComponentPort
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.ecore.system.componentArchitecture.ActivityConfigurationMapping
import org.ecore.system.componentArchitecture.RequiredService
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.component.coordinationExtension.PublicOperationMode
import org.ecore.component.seronetExtension.OpcUaDeviceClient
import org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance
import org.ecore.service.roboticMiddleware.ACE_SmartSoft
import org.eclipse.core.resources.ResourcesPlugin

class SystemGenerator2Impl extends AbstractGenerator {
	
	@Inject extension CopyrightHelpers
	@Inject extension ActivityConfig 
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model: resource.allContents.toIterable.filter(typeof(SystemComponentArchitecture))) {
			fsa.generateFile("CMakeLists.txt", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, model.compileCMakeLists)
			fsa.generateFile("BuildExternalComponents.cmake", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, model.compileBuildExternalComponents)
			for(component: model.components) {
				fsa.generateFile(component.name+".ini", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_CONFIG, component.compileIniFile)
			}
		}
	}
	
	def compileCMakeLists(SystemComponentArchitecture system)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	INCLUDE(src-gen/system/BuildExternalComponents.cmake)
	'''
	
	def compileBuildExternalComponents(SystemComponentArchitecture system)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	INCLUDE(ExternalProject)
	
	«FOR componentInstance: system.components»
	ExternalProject_Add(«componentInstance.name»External
		PREFIX «componentInstance.name»
		SOURCE_DIR "«componentInstance.smartSoftFolder»"
		BINARY_DIR "«componentInstance.smartSoftFolder»/build"
		INSTALL_COMMAND ""
	)
	
	«ENDFOR»
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
				val providedPort = (port as ProvidedService)
				for(connection: parent.connections.filter[it.to == providedPort]) {
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