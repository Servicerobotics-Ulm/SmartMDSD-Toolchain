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

import com.google.inject.Inject
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.seronetExtension.OpcUaDeviceClient
import org.ecore.component.seronetExtension.OpcUaReadServer

class PlainOpcUaGenerator2Impl extends AbstractGenerator {
	// Plain OPC UA extensions
	@Inject extension PlainOpcUaDeviceClient
	@Inject extension PlainOpcUaStatusServer
	@Inject extension PlainOpcUaComponentExtension
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(comp: input.allContents.toIterable.filter(typeof(ComponentDefinition))) 
		{
			fsa.generateFile(
				comp.plainOpcUaExtensionHeaderFilename,
				comp.compilePlainOpcUaExtensionHeader
			)
			fsa.generateFile(
				comp.plainOpcUaExtensionSourceFilename,
				comp.compilePlainOpcUaExtensionSource
			)
			
			fsa.generateFile(
				comp.name+"PlainOpcUa.cmake",
				comp.compileCMakeFile
			)
			
			// generate related classes for Plain OPC UA Ports
			for(opcUaDevClient: comp.elements.filter(OpcUaDeviceClient)) {
				opcUaDevClient.compilePlainOpcUaDeviceClient(fsa)
			}
			for(opcUaStatusServer: comp.elements.filter(OpcUaReadServer)) {
				opcUaStatusServer.compilePlainOpcUaReadServer(fsa)
			}
		}
	}
	
	def compileCMakeFile(ComponentDefinition component) 
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
	
	FIND_PACKAGE(Open62541CppWrapper 1.0 QUIET)

	IF(Open62541CppWrapper_FOUND)
		SET(CMAKE_CXX_STANDARD 14)
		INCLUDE_DIRECTORIES(${CMAKE_CURRENT_LIST_DIR})
		FILE(GLOB PLAIN_OPCUA_SRCS ${CMAKE_CURRENT_LIST_DIR}/*.cc)
	ENDIF(Open62541CppWrapper_FOUND)
	'''
	
}