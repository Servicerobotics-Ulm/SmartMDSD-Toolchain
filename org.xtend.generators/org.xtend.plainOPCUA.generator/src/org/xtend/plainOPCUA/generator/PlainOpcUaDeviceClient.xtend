//--------------------------------------------------------------------------
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
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------

package org.xtend.plainOPCUA.generator

import org.ecore.component.seronetExtension.OpcUaDeviceClient
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.google.inject.Inject
import org.open62541.xml.compiler.OpcUaClientImpl
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetENTITY
import java.util.ArrayList
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetMETHOD
import org.open62541.xml.compiler.OpcUaXmlParser
import org.open62541.xml.compiler.OpcUaObjectInterfaceImpl
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
