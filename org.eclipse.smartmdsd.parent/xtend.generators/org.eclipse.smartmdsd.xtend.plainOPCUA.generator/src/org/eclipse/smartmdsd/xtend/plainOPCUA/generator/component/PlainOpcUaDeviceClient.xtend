/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component

import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaClientImpl
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetENTITY
import java.util.ArrayList
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetMETHOD
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaObjectInterfaceImpl
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path

class PlainOpcUaDeviceClient {
	@Inject extension OpcUaClientImpl
	@Inject extension OpcUaObjectInterfaceImpl
	@Inject OpcUaXmlParser xmlParser
	
	def getOpcUaDeviceClientHeader(OpcUaDeviceClient client) {
		return client.name.getOpcUa_DeviceClient_HeaderFileName()
	}
	
	def compilePlainOpcUaDeviceClient(OpcUaDeviceClient client, IFileSystemAccess2 fsa) 
	{
		// parse given xml file and get the entry lists
		var Iterable<SeRoNetENTITY> entityList = new ArrayList<SeRoNetENTITY>();
		var Iterable<SeRoNetMETHOD> methodList = new ArrayList<SeRoNetMETHOD>();
		if(client.opcuaXmlFile !== null && client.opcuaXmlFile != "") {
			val workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
//			println("path: '"+client.opcuaXmlFile+"'")
			val xmlFile = workspaceRoot.getFile(new Path(client.opcuaXmlFile));
//			val xmlFile = new File(client.opcuaXmlFile);
			entityList = xmlParser.getEntityList(xmlFile.location.toFile)
			methodList = xmlParser.getMethodList(xmlFile.location.toFile)
		}

		// generate OPC UA Object Interface header
		fsa.generateFile(
			client.name.opcUaDevice_Interface_HeaderFileName,
			client.name.compileOpcUaDevice_Interface_HeaderFileContent(entityList, methodList)
		)
			
		// generate device client header file
		fsa.generateFile(
			client.name.getOpcUa_DeviceClient_HeaderFileName(),
			client.name.compileOpcUa_DeviceClient_HeaderFileContent(entityList, methodList)
		)
		
		// generate device client source file
		fsa.generateFile(
			client.name.getOpcUa_DeviceClient_SourceFileName(),
			client.name.compileOpcUa_DeviceClient_SourceFileContent(entityList, methodList)
		)
	}
}
