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

import com.google.inject.Inject
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetMETHOD

class OpcUaClientImpl implements OpcUaClient {
	@Inject extension CopyrightHelpers
	@Inject extension OpcUaObjectInterfaceImpl
	@Inject extension OpcUaXmlParser
	
	override getOpcUa_DeviceClient_HeaderFileName(String clientName) { "OpcUa"+clientName + ".hh" }
	override getOpcUa_DeviceClient_SourceFileName(String clientName) { "OpcUa"+clientName + ".cc" }
	
	override getOpcUa_DeviceClient_TestMain_SourceFileName(String clientName) {clientName + "ClientMain.cc"}
	
	///////////////////////////
	// Header file of OpcUaDeviceClient
	///////////////////////////
	override compileOpcUa_DeviceClient_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	'''
		«getCopyright()»

		#ifndef _«objectName.toUpperCase»_HH
		#define _«objectName.toUpperCase»_HH
		
		// use the generic client implmentation from the Open62541 C++ Wrapper Library
		#include <OpcUaGenericClient.hh>
		
		// implement the abstract interface
		#include "«objectName.getOpcUaDevice_Interface_HeaderFileName()»"
		
		namespace OPCUA {
		
		/** This class wraps OPC UA related communication to an OPC UA Device.
		 *
		 * This class internally implements an OPC UA client and provides a C++ API
		 * based on a provided XML file that contains the device's information model.
		 * 
		 * In case where no XML file is provided, this class can still be used generically
		 * by using two generic connect methods and the generic template getter/setter/caller methods.
		 * 
		 */
		class «objectName» : public GenericClient, public «objectName»Interface
		{
		protected:
			// method implementing the XML-specific client space
			virtual bool createClientSpace(const bool activateUpcalls=true) override;
			
			// generic upcall method called whenever one of the ntity's values is changed
			virtual void handleVariableValueUpdate(const std::string &variableName, const OPCUA::Variant &value) override;
			
			«FOR entity: entityList»
				// specific method to handle value updates for «entity.name»
				void handle«entity.name.toFirstUpper»(const «entity.type.cppType» &value);
				
			«ENDFOR»
		
		public:
			// Constructor
			«objectName»();
			
			// Destructor
			virtual ~«objectName»();
			
			«FOR entity: entityList»
			/** XML Specific Getter function for variable «entity.name»
			 *
			 *  This function gets «entity.name»  from the Server
			 *  When class «objectName» is used with a Specific XML file to connect to
			 *  SeRoNet Servers which implements the device information model.
			 *
			 *  @return the new value (or a default value like 0 in case of errors)
			 */
			virtual «entity.type.cppType» get«entity.name.toFirstUpper»() const;
			
			/** XML Specific Getter function for variable «entity.name»
			 *
			 *  This function gets «entity.name»  from the Server
			 *  When class «objectName» is used with a Specific XML file to connect to
			 *  SeRoNet Servers which implements the device information model.
			 *	
			 *  @param value	:output parameter, returns the new value if StatusCode is ALL_OK
			 *
			 *  @return status code
			 *	- ALL_OK
			 *  - DISCONNECTED
			 *  - ERROR_COMMUNICATION
			 */
			virtual OPCUA::StatusCode get«entity.name.toFirstUpper»(«entity.type.cppType» &«entity.name.toFirstLower») const override;
			virtual OPCUA::StatusCode get«entity.name.toFirstUpper»Wait(«entity.type.cppType» &«entity.name.toFirstLower»);
			
			«IF (entity.userAccessLevel == 2)||(entity.userAccessLevel == 3) »
			/** XML Specific Setter function for entity «entity.name»
			 *
			 *  This function sets «entity.name»  at the Server
			 *  When class «objectName» is used with a Specific XML file to connect to
			 *  SeRoNet Servers which implements the device information model.
			 *
			 *  @param value			:Value to be set
			 * 
			 *  @return status code
			 *    - true    : Entity was found and the value was set correctly
			 *    - false   : Entity was not found or the value was not set correctly
			 */
			virtual OPCUA::StatusCode set«entity.name.toFirstUpper»(const «entity.type.cppType» &value) override;
			
			«ENDIF»
			«ENDFOR»
			
			«FOR method: methodList»
			/** XML Specific Caller function for method «method.name»
			 *
			 *  This function calls the method «method.name» at the Server
			 *
			«FOR argIn: method.inputArguments»
				*  @param «argIn.name»			: Input | DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
			«ENDFOR»
			«FOR argIn: method.outputArguments»			
				*  @param «argIn.name»			: Output| DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
			«ENDFOR»			 	
			 * 
			 *  @return status code
			 *    - true    : Method was found and the method call was completed correctly
			 *    - false   : Method was not found or the method call was not completed correctly
			 */
			 virtual OPCUA::StatusCode call«method.name.toFirstUpper»(«method.cppMethodArgumentsDef») override;
			 
			«ENDFOR»
		};
		
		} /* namespace OPCUA */
		
		#endif // _«objectName.toUpperCase»_HH
	'''
	///////////////////////////
	// Source file of OpcUaDeviceClient
	///////////////////////////
	override compileOpcUa_DeviceClient_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	'''
		«getCopyright()»
		
		#include "«objectName.getOpcUa_DeviceClient_HeaderFileName()»"
		
		using namespace OPCUA;
		
		«objectName»::«objectName»()
		{  }
		«objectName»::~«objectName»()
		{  }
		
		bool «objectName»::createClientSpace(const bool activateUpcalls)
		{
			bool result = true;
			«FOR entity: entityList»
			if(this->addVariableNode("«entity.name»", activateUpcalls) != true) {
				result = false;
			}
			«ENDFOR»
			«FOR method: methodList»
			if(this->addMethodNode("«method.name»") != true) {
				result = false;
			}
			«ENDFOR»
			return result;
		}
		
		void «objectName»::handleVariableValueUpdate(const std::string &variableName, const OPCUA::Variant &value)
		{
			«FOR entity: entityList»
			«IF entity != entityList.head»else «ENDIF»if(variableName == "«entity.name»") 
			{
				this->handle«entity.name.toFirstUpper»(value);
			}
			«ENDFOR»
		}
		
		«FOR entity: entityList»
			// specific method to handle value updates for «entity.name»
			void «objectName»::handle«entity.name.toFirstUpper»(const «entity.type.cppType» &value)
			{
				//implement your specific code here (if needed)
				std::cout << "handle«entity.name.toFirstUpper»(): " << value << std::endl;
			}
			
		«ENDFOR»
		
		// generate xml-specific getters and setters
		«FOR entity: entityList»
		«entity.type.cppType» «objectName»::get«entity.name.toFirstUpper»() const {
			OPCUA::Variant genericValue;
			OPCUA::StatusCode status = getVariableCurrentValue("«entity.name»", genericValue);
			if(status == OPCUA::StatusCode::ALL_OK) {
				return genericValue;
			}
			return «entity.type.cppDefaultValue»;
		}
		OPCUA::StatusCode «objectName»::get«entity.name.toFirstUpper»(«entity.type.cppType» &«entity.name.toFirstLower») const {
			OPCUA::Variant genericValue;
			OPCUA::StatusCode status = getVariableCurrentValue("«entity.name»", genericValue);
			«entity.name.toFirstLower» = genericValue«IF entity.type.equals("String")».toString()«ENDIF»;
			return status;
		}
		OPCUA::StatusCode «objectName»::get«entity.name.toFirstUpper»Wait(«entity.type.cppType» &«entity.name.toFirstLower») {
			OPCUA::Variant genericValue;
			OPCUA::StatusCode status = getVariableNextValue("«entity.name»", genericValue);
			«entity.name.toFirstLower» = genericValue«IF entity.type.equals("String")».toString()«ENDIF»;
			return status;
		}
		
		«IF (entity.userAccessLevel == 2)||(entity.userAccessLevel == 3) »
		OPCUA::StatusCode «objectName»::set«entity.name.toFirstUpper»(const «entity.type.cppType» &value) {
			return setVariableValue("«entity.name»", value);
		}
		
		«ENDIF»
		«ENDFOR»
		
		«FOR method: methodList»
		 OPCUA::StatusCode «objectName»::call«method.name.toFirstUpper»(«method.cppMethodArgumentsDef»)
		 {
		 	std::vector<OPCUA::Variant> inputArguments(«method.inputArguments.size»);
		 	«var count1=-1»
		 	«FOR arg: method.inputArguments»
		 	inputArguments[«count1=count1+1»] = «arg.name»;
		 	«ENDFOR»
		 	std::vector<OPCUA::Variant> outputArguments;
		 	OPCUA::StatusCode status = callMethod(std::string("«method.name»"), inputArguments, outputArguments);
		 	if(status == OPCUA::StatusCode::ALL_OK)
		 	{
		 		«var count2=-1»
		 		«FOR arg: method.outputArguments»
		 			«IF arg.DataTypeIdentifier == OpcUaXmlParser.SeRoNetARGUMENT.UA_TYPES_STRING»
		 			«arg.name» = outputArguments[«count2=count2+1»].toString();
		 			«ELSE»
		 			«arg.name» = outputArguments[«count2=count2+1»];
		 			«ENDIF»
				«ENDFOR»
		 	}
		 	return status;
		 }
		 
		«ENDFOR»
	'''
	
	override compileOpcUa_DeviceClient_TestMain_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) 
	'''
	#include <iostream>
	
	#include "«objectName.getOpcUa_DeviceClient_HeaderFileName()»"
	
	void callAllGetters(const OPCUA::«objectName» &client) {
		«FOR entity: entityList»
		«entity.type.cppType» «entity.name.toFirstLower» = client.get«entity.name.toFirstUpper»();
		std::cout << "get«entity.name.toFirstUpper»(): " << «entity.name.toFirstLower» << std::endl;
		
		«ENDFOR»
	}
	
	int main(int argc, char* argv[]) 
	{
		OPCUA::«objectName» client;
		
		std::string serverAddress = "opc.tcp://localhost:4840";
		std::string rootObjectName = "«objectName»";
		std::cout << "connecting client: " << client.connect(serverAddress, rootObjectName) << std::endl;
		
		// this is just a testing method
		callAllGetters(client);
		
		OPCUA::StatusCode status;
		do {
			// this executes the client's upcall (i.e. subscription) infrastructure
			status = client.run_once();
		} while(status == OPCUA::StatusCode::ALL_OK);
		return 0;
	}
	'''
	
	override compileOpcUa_DeviceClient_Test_CMakeListsContent(String objectName)
	'''
		CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
		
		PROJECT(«objectName»ClientTest)
		
		# find Open62541CppWrapper as the main dependency
		FIND_PACKAGE(Open62541CppWrapper 1.0)
		
		# setup default include directoy
		INCLUDE_DIRECTORIES(
			${PROJECT_SOURCE_DIR}
			${PROJECT_SOURCE_DIR}/..
		)
		
		# setup server source files
		SET(SERVER_SRCS
			${PROJECT_SOURCE_DIR}/«objectName.opcUa_DeviceClient_SourceFileName»
			${PROJECT_SOURCE_DIR}/«objectName.opcUa_DeviceClient_TestMain_SourceFileName»
		)
		
		# create server test executable
		ADD_EXECUTABLE(${PROJECT_NAME} ${SERVER_SRCS})
		TARGET_LINK_LIBRARIES(${PROJECT_NAME} Open62541CppWrapper)
		SET_TARGET_PROPERTIES(${PROJECT_NAME} PROPERTIES
		    CXX_STANDARD 14
		)
	'''
	
}