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

import org.eclipse.xtext.generator.IFileSystemAccess2
import com.google.inject.Inject
import org.open62541.xml.compiler.Open62541CppWrapperImpl
import org.open62541.xml.compiler.Open62541GenericClientImpl
import org.open62541.xml.compiler.Open62541GenericServerImpl

class PlainOpcUaHelpers {
	@Inject extension Open62541CppWrapperImpl
	@Inject extension Open62541GenericClientImpl
	@Inject extension Open62541GenericServerImpl
	
	def generatePlainOpcUaHelpers(IFileSystemAccess2 fsa) {
		// generate StatusCode header
		fsa.generateFile(
			opcUaStatusCodeHeaderFileName,
			compileOpcUaStatusCodeHeaderFileContent
		)
		
		// generate ValueType header file
		fsa.generateFile(
			opcUaValueTypeHeaderFileName,
			compileOpcUaValueTypeHeaderFileContent
		)
		// generate ValueType source file
		fsa.generateFile(
			opcUaValueTypeSourceFileName,
			compileOpcUaValueTypeSourceFileContent
		)
		
		// generate NodeId header file
		fsa.generateFile(
			opcUaNodeIdHeaderFileName,
			compileOpcUaNodeIdHeaderFileContent
		)
		// generate NodeId source file
		fsa.generateFile(
			opcUaNodeIdSourceFileName,
			compileOpcUaNodeIdSourceFileContent
		)
	}
	
	def generatePlainOpcUaGenericClient(IFileSystemAccess2 fsa) {
		// generate GenericClient header file
		fsa.generateFile(
			opcUa_GenericClient_HeaderFileName,
			compileOpcUa_GenericClient_HeaderFileContent
		)
		// generate GenericClient source file
		fsa.generateFile(
			opcUa_GenericClient_SourceFileName,
			compileOpcUa_GenericClient_SourceFileContent
		)
	}
	
	def generatePlainOpcUaGenericServer(IFileSystemAccess2 fsa) {
		// generate GenericServer header file
		fsa.generateFile(
			opcUa_GenericServer_HeaderFileName,
			compileOpcUa_GenericServer_HeaderFileContent
		)
		// generate GenericServer source file
		fsa.generateFile(
			opcUa_GenericServer_SourceFileName,
			compileOpcUa_GenericServer_SourceFileContent
		)
	}
}
