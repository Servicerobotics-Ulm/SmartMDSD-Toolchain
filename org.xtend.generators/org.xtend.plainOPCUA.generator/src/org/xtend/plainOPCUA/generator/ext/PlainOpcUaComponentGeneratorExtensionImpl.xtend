//===============================================================================
//
//  Copyright (C) 2018 Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        nagrath@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
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
//===============================================================================
package org.xtend.plainOPCUA.generator.ext

import org.xtend.smartsoft.generator.component.ComponentGeneratorExtension
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.seronetExtension.OpcUaDeviceClient
import org.ecore.component.seronetExtension.OpcUaReadServer
import com.google.inject.Inject
import org.xtend.plainOPCUA.generator.PlainOpcUaDeviceClient
import org.xtend.plainOPCUA.generator.PlainOpcUaStatusServer

class PlainOpcUaComponentGeneratorExtensionImpl implements ComponentGeneratorExtension 
{
	@Inject extension PlainOpcUaDeviceClient
	@Inject extension PlainOpcUaStatusServer

	override getExtensionName(ComponentDefinition component) { "PlainOpcUa"+component.name+"Extension" }
	
	override getHeaderIncludes(ComponentDefinition component) 
	'''
		// include plain OPC UA device clients
		«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
		#include "«opcDeviceClient.opcUaDeviceClientHeader»"
		«ENDFOR»
		// include plain OPC UA status servers
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		#include "«opcStatusServer.serverControllerHeaderFileName»"
		«ENDFOR»
	'''
	
	override getSourceIncludes(ComponentDefinition component) ''''''
	
	override getClassMemberDefinition(ComponentDefinition component) 
	'''
		«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
		OPCUA::«opcDeviceClient.name.toFirstUpper» *«opcDeviceClient.name.toFirstLower»;
		«ENDFOR»
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		OPCUA::«opcStatusServer.className» *«opcStatusServer.name.toFirstLower»;
		«ENDFOR»
	'''
	
	override getIniStructDefinition(ComponentDefinition component) 
	'''
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			struct «client.name.toFirstUpper»_struct {
				bool autoConnect;
				std::string deviceURI;
				std::string rootObjectPath;
				std::string opcuaXmlFile;
			} «client.name.toFirstLower»;
			
		«ENDFOR»
	'''
	
	override getLoadParameters(ComponentDefinition component)
	'''
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			// load parameteters for OpcUaDeviceClient «client.name»
			if(parameter.checkIfParameterExists("«client.name»", "autoConnect")) {
				parameter.getBoolean("«client.name»", "autoConnect", connections.«client.name.toFirstLower».autoConnect);
			}
			if(parameter.checkIfParameterExists("«client.name»", "rootObjectPath")) {
				parameter.getString("«client.name»", "rootObjectPath", connections.«client.name.toFirstLower».rootObjectPath);
			}
			if(parameter.checkIfParameterExists("«client.name»", "deviceURI")) {
				parameter.getString("«client.name»", "deviceURI", connections.«client.name.toFirstLower».deviceURI);
			}
			if(parameter.checkIfParameterExists("«client.name»", "opcuaXmlFile")) {
				parameter.getString("«client.name»", "opcuaXmlFile", connections.«client.name.toFirstLower».opcuaXmlFile);
			}
		«ENDFOR»
	'''
	
	override getIniFileParameters(ComponentDefinition component) 
	'''
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
		[«client.name»]
		autoConnect «client.autoConnect»
		deviceURI «client.deviceURI»
		rootObjectPath «client.rootObjectPath»
		opcuaXmlFile «client.opcuaXmlFile»
		
		«ENDFOR»
		
		«FOR server: component.elements.filter(OpcUaReadServer)»
		[«server.name»]
		portNumber «server.portNumber»
		
		«ENDFOR»
	'''
	
	override getCMakeIncludes(ComponentDefinition component) 
	'''
		GET_FILENAME_COMPONENT(PlainOPCUA_DIR "${PROJECT_SOURCE_DIR}/../plainOpcUa" REALPATH)
		IF(EXISTS ${PlainOPCUA_DIR})
		INCLUDE("${PlainOPCUA_DIR}/src-gen/«component.name»PlainOpcUa.cmake")
		LIST(APPEND FURTHER_SRCS ${PLAIN_OPCUA_SRCS})
		ENDIF(EXISTS ${PlainOPCUA_DIR})
		
	'''
	
	override getCMakeTargetConfiguration(ComponentDefinition component) 
	'''
		IF(Open62541CppWrapper_FOUND)
		TARGET_LINK_LIBRARIES(${PROJECT_NAME} Open62541CppWrapper)
		TARGET_COMPILE_DEFINITIONS(${PROJECT_NAME} PUBLIC HAS_OPCUA)
		ENDIF(Open62541CppWrapper_FOUND)
	'''
}