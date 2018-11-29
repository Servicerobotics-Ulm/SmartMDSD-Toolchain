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
package org.open62541.xml.compiler

import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import com.google.inject.Guice
import com.google.inject.AbstractModule
import org.eclipse.xtext.parser.IEncodingProvider
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

class OpcUaXmlCompilerMain {
	def static void main(String[] args) 
	{
		var TimeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		if(args.size < 1) {
			System.err.println("TIMESTAMP: " + TimeStamp)			
			System.err.println("ERROR: no XML file specified")
			System.err.println("Arguments: <XML-File> ( [ALL] | ([SERVER] [CLIENT] [MVC]) ) (USE_TS)")
			return;
		}
		
		
		val xmlFile = new File(args.get(0));
		var generateServer = false
		var generateClient = false
		var generateMVC = false
		var generateHtml = false
		var useTimeStamp = false
		var TAG = args.get(0).replace(".xml","");

		for(String arg: args) 
		{
			if(arg != args.head) 
			{
				if(arg.equals("ALL")) {
					generateServer = true
					generateClient = true
					generateMVC = true
					generateHtml = true
				} else if(arg.equals("SERVER")) {
					generateServer = true
				} else if(arg.equals("CLIENT")) {
					generateClient = true
				} else if(arg.equals("MVC")) {
					generateServer = true
					generateMVC = true
				} else if(arg.equals("HTML")) {
					generateHtml = true
				} else if(arg.equals("USE_TS")) {
					useTimeStamp = true
				}
			}
		}

		// construct output folder (where the source files shall be generated into)
		var TargetOutputPath = "output_" + TAG 
		if(useTimeStamp == true) {
			TargetOutputPath = TargetOutputPath + "_" + TimeStamp
		}
		TargetOutputPath = TargetOutputPath + "/src-gen";

		// create default java file-system-access that uses the created output path as its root
		val fsa = new JavaIoFileSystemAccess();
		println("Output path set to: " + TargetOutputPath.replace("/src-gen",""));
		fsa.setOutputPath(TargetOutputPath);
		
		// clean-up the output path folder to prevent inconsistent files from previous run
		val outDir = new File(TargetOutputPath);
		if(outDir.exists && outDir.directory) {
			println("Cleanup Directory: "+TargetOutputPath)
			for(File f: outDir.listFiles) {
				if(f.directory) {
					for(File f2: f.listFiles) {
						if(!f2.directory) f2.delete
					}
				} else {
					f.delete
				}
			}
		}
		
		// create and set-up a Guice Module
		val injector = Guice.createInjector(new AbstractModule() {
			override protected configure() {
				// generic OPC-UA infrastructure
				binder().bind(Open62541CppWrapper).to(Open62541CppWrapperImpl)
				binder().bind(Open62541GenericClient).to(Open62541GenericClientImpl)
				binder().bind(Open62541GenericServer).to(Open62541GenericServerImpl)

				// bind Interface generator	
				binder().bind(OpcUaObjectInterface).to(OpcUaObjectInterfaceImpl)
				
				// the OPC-UA server wrapper generator
				binder().bind(OpcUaServer).to(OpcUaServerImpl)
				
				// the OPC-UA client wrapper generator
				binder().bind(OpcUaClient).to(OpcUaClientImpl)
				
//				binder().bind(OpcUaHtmlView).to(OpcUaHtmlViewImpl)
				binder().bind(AbstractModelViewController).to(AbstractModelViewControllerImpl)
				binder().bind(SpecificModelViewController).to(SpecificModelViewControllerImpl)
				
				// bind a default encoding provider
				binder().bind(IEncodingProvider).to(IEncodingProvider.Runtime);
			}
		})
		injector.injectMembers(fsa)
		
		// get generator for open62541-based C++ wrapper classes
		val open62541CppWrapperGenerator = injector.getInstance(Open62541CppWrapper)
		
		val open62541CppWrapperLibName = "Open62541CppWrapper"
		
		// generate StatusCode header
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperGenerator.opcUaStatusCodeHeaderFileName,
			open62541CppWrapperGenerator.compileOpcUaStatusCodeHeaderFileContent
		)
		
		// generate ValueType header and implementation
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperGenerator.getOpcUaValueTypeHeaderFileName(),
			open62541CppWrapperGenerator.compileOpcUaValueTypeHeaderFileContent()
		)
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperGenerator.getOpcUaValueTypeSourceFileName(),
			open62541CppWrapperGenerator.compileOpcUaValueTypeSourceFileContent()
		)
		
		// generate NodeId header and implementation
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperGenerator.opcUaNodeIdHeaderFileName,
			open62541CppWrapperGenerator.compileOpcUaNodeIdHeaderFileContent
		)
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperGenerator.opcUaNodeIdSourceFileName,
			open62541CppWrapperGenerator.compileOpcUaNodeIdSourceFileContent
		)
		
		// generate CMakeLists.txt and CMake-Config for compiling the open62541 wrapper library
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + "CMakeLists.txt",
			open62541CppWrapperGenerator.compileOpen62541WrapperLibCmake(open62541CppWrapperLibName)
		)
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + open62541CppWrapperLibName+"Config.cmake.in",
			open62541CppWrapperGenerator.compileOpen62541WrapperLibCmakeConfig
		)

		val genericClientGenerator = injector.getInstance(Open62541GenericClient)
		// generate GenericClient header and implementation
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + genericClientGenerator.opcUa_GenericClient_HeaderFileName,
			genericClientGenerator.compileOpcUa_GenericClient_HeaderFileContent
		)
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + genericClientGenerator.opcUa_GenericClient_SourceFileName,
			genericClientGenerator.compileOpcUa_GenericClient_SourceFileContent
		)
		
		val genericServerGenerator = injector.getInstance(Open62541GenericServer)
		// generate GenericServer header and implementation
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + genericServerGenerator.opcUa_GenericServer_HeaderFileName,
			genericServerGenerator.compileOpcUa_GenericServer_HeaderFileContent
		)
		fsa.generateFile(
			open62541CppWrapperLibName + "/" + genericServerGenerator.opcUa_GenericServer_SourceFileName,
			genericServerGenerator.compileOpcUa_GenericServer_SourceFileContent
		)
		
		val abstractMVCGenerator = injector.getInstance(AbstractModelViewController)
		// generate abstract model header file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractModelHeader,
			abstractMVCGenerator.compileAbstractModelHeader
		)
		// generate abstract model source file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractModelSource,
			abstractMVCGenerator.compileAbstractModelSource
		)
		// generate abstract model-observer header file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractModelObserverHeader,
			abstractMVCGenerator.compileAbstractModelObserverHeader
		)
		// generate abstract model-observer source file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractModelObserverSource,
			abstractMVCGenerator.compileAbstractModelObserverSource
		)
		// generate abstract MVC view header file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractViewHeader,
			abstractMVCGenerator.compileAbstractViewHeader
		)
		// generate abstract MVC controller header file
		fsa.generateFile(
			open62541CppWrapperLibName + "/MVC/" + abstractMVCGenerator.abstractControllerHeader,
			abstractMVCGenerator.compileAbstractControllerHeader
		)
		// create the class for parsing the XML file containing the OPC UA Information Model
		val parser = new OpcUaXmlParser();
		
		val objectName = parser.getObjectName(xmlFile)
		val entityList = parser.getEntityList(xmlFile);
		val methodList = parser.getMethodList(xmlFile);

		// generate Interface header file
		val interfaceGenerator = injector.getInstance(OpcUaObjectInterface)
		fsa.generateFile(
			interfaceGenerator.getOpcUaDevice_Interface_HeaderFileName(objectName),
			interfaceGenerator.compileOpcUaDevice_Interface_HeaderFileContent(
				objectName,
				entityList,
				methodList
			)
		)
		
		if(generateServer == true) {
			val serverSubFolder = "server"
			
			val serverGenerator = injector.getInstance(OpcUaServer)
			// generate server header file
			fsa.generateFile(
				serverSubFolder + "/" + serverGenerator.getOpcUaDevice_Server_HeaderFileName(objectName),
				serverGenerator.compileOpcUaDevice_Server_HeaderFileContent(
					objectName,
					entityList,
					methodList
				)
			)
			// generate server source file
			fsa.generateFile(
				serverSubFolder + "/" + serverGenerator.getOpcUaDevice_Server_SourceFileName(objectName),
				serverGenerator.compileOpcUaDevice_Server_SourceFileContent(
					objectName,
					entityList,
					methodList
				)
			)
		}
		
		if(generateClient == true) {
			val clientGenerator = injector.getInstance(OpcUaClient)
			
			val clientSubFolder = "client"

			// generate client header file
			fsa.generateFile(
				clientSubFolder + "/" + clientGenerator.getOpcUa_DeviceClient_HeaderFileName(objectName),
				clientGenerator.compileOpcUa_DeviceClient_HeaderFileContent(
					objectName,
					entityList,
					methodList
				)
			)
			// generate client source file
			fsa.generateFile(
				clientSubFolder + "/" + clientGenerator.getOpcUa_DeviceClient_SourceFileName(objectName),
				clientGenerator.compileOpcUa_DeviceClient_SourceFileContent(
					objectName,
					entityList,
					methodList
				)
			)
			
			// generate client's test main file
			fsa.generateFile(
				clientSubFolder + "/" + clientGenerator.getOpcUa_DeviceClient_TestMain_SourceFileName(objectName),
				clientGenerator.compileOpcUa_DeviceClient_TestMain_SourceFileContent(
					objectName,
					entityList,
					methodList
				)
			)
			
			// generate default CMakeLists.txt for compiling the default TestClient
			fsa.generateFile(
				clientSubFolder + "/" + "CMakeLists.txt",
				clientGenerator.compileOpcUa_DeviceClient_Test_CMakeListsContent(objectName)
			)
		}
		
		if(generateMVC == true) {
			val mvcGenerator = injector.getInstance(SpecificModelViewController)
			
			val mvcSubFolder = "server"
			
			// generate specific model header file
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificDriverModelHeader(objectName),
				mvcGenerator.compileSpecificDriverModelHeader(objectName)
			)
			
			// generate specific view header file
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificViewHeader(objectName),
				mvcGenerator.compileSpecificViewHeader(objectName)
			)
			// generate specific view source file
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificViewSource(objectName),
				mvcGenerator.compileSpecificViewSource(objectName)
			)
			
			// generate specific controller header file
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificControllerHeader(objectName),
				mvcGenerator.compileSpecificControllerHeader(objectName,entityList,methodList)
			)
			// generate specific controller source file
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificControllerSource(objectName),
				mvcGenerator.compileSpecificControllerSource(objectName,entityList,methodList)
			)
			
			// generate specific test server main
			fsa.generateFile(
				mvcSubFolder + "/" + mvcGenerator.getSpecificTestServer(objectName),
				mvcGenerator.compileSpecificTestServer(objectName)
			)
			// generate specific CMakeLists.txt for compiling the default TestServer and client
			fsa.generateFile(
				mvcSubFolder + "/" + "CMakeLists.txt",
				mvcGenerator.compileSpecificCMakeLists(objectName)
			)
		}
		
		// generate the CMakeLists.txt within the src-gen folder
		fsa.generateFile(
			"CMakeLists.txt",
			compileSrcGenCMakeLists(
				open62541CppWrapperLibName,
				generateMVC,
				generateClient
			)
		)
		// generate the top-level CMakeLists.txt
		fsa.generateFile(
			"../CMakeLists.txt",
			compileTopLevelCMakeLists
		)
		
		// this seems to be deprecated
//		if(generateHtml == true) {
//			val htmlGenerator = injector.getInstance(OpcUaHtmlView)
//			// generate html-view header file
//			fsa.generateFile(
//				htmlGenerator.getOpcUaDevice_HtmlView_HeaderFileName(objectName),
//				htmlGenerator.compileOpcUaDevice_HtmlView_HeaderFileContent(
//					objectName,
//					entityList,
//					methodList
//				)
//			)
//			// generate html-view source file
//			fsa.generateFile(
//				htmlGenerator.getOpcUaDevice_HtmlView_SourceFileName(objectName),
//				htmlGenerator.compileOpcUaDevice_HtmlView_SourceFileContent(
//					objectName,
//					entityList,
//					methodList
//				)
//			)
//		}
	}
	
	def static CharSequence compileSrcGenCMakeLists(String open62541CppWrapperLibName, boolean hasServer, boolean hasClient)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	# compile the «open62541CppWrapperLibName» library
	ADD_SUBDIRECTORY(«open62541CppWrapperLibName»)
	
	«IF hasServer»
	# compile the test server
	ADD_SUBDIRECTORY(server)
	«ENDIF»
	«IF hasClient»
	# compile the test client
	ADD_SUBDIRECTORY(client)
	«ENDIF»
	'''
	
	def static CharSequence compileTopLevelCMakeLists()
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	ADD_SUBDIRECTORY(src-gen)
	'''
}