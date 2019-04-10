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

class Open62541GenericServerImpl implements Open62541GenericServer {
	@Inject extension CopyrightHelpers
	@Inject extension Open62541CppWrapperImpl
	
	override getOpcUa_GenericServer_HeaderFileName() {"OpcUaGenericServer.hh"}
	
	override getOpcUa_GenericServer_SourceFileName() {"OpcUaGenericServer.cc"}
	
	override compileOpcUa_GenericServer_HeaderFileContent() 
	'''
	«getCopyright()»
	
	#ifndef OPCUAGENERICSERVER_HH_
	#define OPCUAGENERICSERVER_HH_
	
	#include <map>
	#include <string>
	
	#ifdef HAS_OPCUA
		#ifdef UA_ENABLE_AMALGAMATION
			#include <open62541.h>
		#else
			#include <open62541/ua_server.h>
		#endif
	#endif
	
	#include "«opcUaStatusCodeHeaderFileName»"
	#include "«opcUaValueTypeHeaderFileName»"
	#include "«opcUaNodeIdHeaderFileName»"
	
	namespace OPCUA {
	
	class GenericServer {
	private:
	#ifdef HAS_OPCUA
		UA_ServerConfig *config;
		UA_Server *server;
		NodeId rootObjectId;
	#endif // HAS_OPCUA
	
		/** this method is used by the Constructor to create the root object
		 *
		 *  This method wraps the code to create a default server object under the default
		 *  objects folder using the given objectName. Optionally the namespace index can be
		 *  specified (default is 1).
		 *
		 *  @param objectName the name of the object which will result in the browse and the display names
		 *  @param namespaceId optional parameter to specify the namespace index
		 *
		 *  @return true if object has been created successfully of false otherwise
		 */
		bool createRootObject(const std::string &objectName, const unsigned short &namespaceId=1);
	
	protected:
	
		/** use this method from within createServerSpace() to add an OPC UA variable to the internal server space
		 *
		 *  This method wraps the code to create and add a new OPC UA variable to the internally created
		 *  rootObject using the given nodeName. In addition, the created variable is initialized
		 *  with the provided initialValue. The variable can be either readOnly (default) or read+write otherwise.
		 *  Optionally the namespace index can be specified (default is 1).
		 *
		 *  @param nodeName the name of the variable which will result in the browse and the display names
		 *  @param initialValue is the initial variable value (also specifying the variable's type)
		 *  @param readOnly optional parameter to specify if the variably is read-only (from the client's perspective) or also with write access
		 *  @param namespaceId optional parameter to specify the namespace index
		 *
		 *  @return true if the variable has been created successfully of false otherwise
		 */
		bool addVariableNode(const std::string &nodeName, const OPCUA::ValueType &initialValue, const bool &readOnly=true, const unsigned short &namespaceId=1);
	
		/** use this method from within createServerSpace() to add an OPC UA method to the internal server space
		 *
		 *  This method wraps the code to create and add a new OPC UA Method with its input and output arguments
		 *  to the internally created rootObject. The Method's arguments are specified using a map where the keys denote the argument names and
		 *  the values denote the data-types. Please note, that the ValueType parts are only used to identify the data-type of the according
		 *  Method attribute. If you additionally provide initial values, these values will be ignored as this is currently
		 *  not supported by the underlying library.
		 *
		 *  @param methodBrowseName the name of the OPC UA Method which will result in the browse and the display names
		 *  @param inputArguments a map specifying the Method's input arguments (key=name, value=type)
		 *  @param outputArguments a map specifying the Method's output arguments (key=name, value=type)
		 *  @param namespaceId optional parameter to specify the namespace index
		 *
		 *  @return true if the OPC UA Method has been created successfully of false otherwise
		 */
		bool addMethodNode(const std::string &methodBrowseName,
				const std::map<std::string,ValueType> &inputArguments,
				const std::map<std::string,ValueType> &outputArguments,
				const unsigned short &namespaceId=1);
	
		/** overload and implement this method in derived classes to implement the server space
		 *
		 *  Please use the methods createRootObject(), addVariableNode() and addMethodNode() to define the server space.
		 *  This method is automatically called from within the method run()
		 *
		 *  @return true on success or false if something went wrong during initialization
		 *
		 *  @sa addVariableNode()
		 *  @sa addMethodNode()
		 */
		virtual bool createServerSpace();
	
		/** overload this method to get notified about read requests from a remote client for the provided variable name
		 *
		 *  This upcall handler is triggered each time the OPC UA variable (identified by the browseName) is read from a remote client.
		 *  In case the variable is read internally from within the server, this method is not called as this might easily
		 *  cause infinite loops. You can overload this method in derived classes to implement a specific behavior for
		 *  incoming read requests.
		 *
		 *  @param browseName the browse name of the OPC UA variable
		 *  @param value output argument receives the new value of the OPC UA variable
		 *
		 */
		virtual void handleOnRead(const std::string &browseName, ValueType &value);
	
		/** overload this method to get notified about write requests from a remote client for the provided variable name
		 *
		 *  This upcall handler is triggered each time the OPC UA variable (identified by the browseName) is written from a remote client.
		 *  You can overload this method in derived classes to implement a specific behavior for incoming write requests.
		 *
		 *  @param browseName the browse name of the OPC UA variable
		 *  @param value the new value of the OPC UA variable
		 *
		 */
		virtual void handleOnWrite(const std::string &browseName, const ValueType &value);
	
		/** overload this method to get notified about remote method calls from a remote client for the provided OPC UA Method name
		 *
		 *  This upcall handler is triggered each time the OPC UA Method (identified by the browseName) is called from a remote client.
		 *  You can overload this method in derived classes to implement a specific behavior for incoming method calls.
		 *
		 *  @param browseName the browse name of the OPC UA variable
		 *  @param inputs a vector of input-argument-values
		 *  @param outputs a reference to a vector to store the resulting output-argument-values
		 *
		 */
		virtual void handleMethodCall(const std::string &browseName, const std::vector<ValueType> &inputs, std::vector<ValueType> &outputs);
	
	public:
		/** default constructor requires at the minimum a name for the root object that is automatically created
		 *
		 *  This constructor internally creates a new UA_Server and a server space with one root object
		 *  with the given name and namespace-ID. Optionally, the port-number for the UA_Server can be provided.
		 *
		 *  @param rootObjectName The browse noame of the root-object within the server-space
		 *  @param namespaceId optionally, the namespace ID for the browse-name can be given (default: 1)
		 *  @param portNr optional port number for the server to listen to (default: 4840)
		 *  @param activateSignalHandler optional parameter to activate/deactivate the default SIGINT signal handler (for stopping the server with CTRL+C)
		 *
		 */
		GenericServer(
			const std::string &rootObjectName,
			const unsigned short &namespaceId=1,
			const unsigned short &portNr=4840,
			const bool &activateSignalHandler=true
		);
	
		/// default destructor
		virtual ~GenericServer();
	
		/** use this method to write a new value to an internal variable identified by its browseName
		 *
		 *  This method can be used to activelly write a new value to an OPC UA Variable (identified by the browseName).
		 *
		 *  @param browseName the browse name of the OPC UA Variable to write the new value to
		 *  @param value the new value for the OPC UA Variable
		 *  @param namespaceId an optional namespace index (in case the variable is in a different index than 1)
		 */
		OPCUA::StatusCode writeVariable(const std::string &browseName, const OPCUA::ValueType &value, const unsigned short &namespaceId=1);
	
		/** this method executes the internal OPC-UA server until CTRL-C is pressed
		 *
		 *  This method should be called from a new thread (or the main thread) to operate the
		 *  server-side infrastructure (like upcalls/events/etc.) This method blocks forever as long
		 *  as no CTR+C (i.e. the SIGINT) signal is pressed.
		 *
		 *  @return 0 if everything was fine or -1 otherwise
		 */
		int run();
		
		void signalStop();
	};
	
	} /* namespace OPCUA */
	
	#endif /* OPCUAGENERICSERVER_HH_ */
	'''
	
	override compileOpcUa_GenericServer_SourceFileContent()
	'''
	#include "«opcUa_GenericServer_HeaderFileName»"
	
	#include <vector>
	#include <sstream>
	#include <functional>
	
	#ifdef HAS_OPCUA
	#ifndef UA_ENABLE_AMALGAMATION
	#include <open62541/ua_config_default.h>
	#include <open62541/ua_log_stdout.h>
	#endif
	#endif // HAS_OPCUA
	
	namespace OPCUA {
	
	#ifdef HAS_OPCUA
	// create signal handler
	UA_Boolean running = true;
	void signal_handler(int sign)
	{
	    UA_LOG_INFO(UA_Log_Stdout, UA_LOGCATEGORY_SERVER, "received ctrl-c");
	    running = false;
	}
	
	static std::map<UA_Server*,std::function<void(const std::string&,ValueType&)>> on_read_upcall_bindings;
	static std::map<UA_Server*,std::function<void(const std::string&,const ValueType&)>> on_write_upcall_bindings;
	
	static std::map<UA_Server*,std::function<void(const std::string&,const std::vector<ValueType>&,std::vector<ValueType>&)>> method_callback_bindings;
	
	
	static std::string readBrowseName(UA_Server *server, const UA_NodeId *nodeId)
	{
		std::string browseName;
		UA_QualifiedName *outBrowseName = UA_QualifiedName_new();
		UA_StatusCode status = UA_Server_readBrowseName(server, *nodeId, outBrowseName);
		if(status == UA_STATUSCODE_GOOD) {
			browseName = std::string((const char*)outBrowseName->name.data, outBrowseName->name.length);
		}
		UA_QualifiedName_delete(outBrowseName);
		return browseName;
	}
	
	static void handle_onRead(UA_Server *server,
	               const UA_NodeId *sessionId, void *sessionContext,
	               const UA_NodeId *nodeId, void *nodeContext,
	               const UA_NumericRange *range, const UA_DataValue *data)
	{
		auto it = on_read_upcall_bindings.find(server);
		if(it != on_read_upcall_bindings.end()) {
			// propagate upcall to the according server object to get a new value
			ValueType value;
			it->second(readBrowseName(server,nodeId), value);
			if(!value.isEmpty()) {
				// there is a new value from the upcall handler, write the value to the server
				UA_Server_writeValue(server, *nodeId, *static_cast<const UA_Variant*>(value));
			}
		}
	}
	
	static void handle_onWrite(UA_Server *server,
	               const UA_NodeId *sessionId, void *sessionContext,
	               const UA_NodeId *nodeId, void *nodeContext,
	               const UA_NumericRange *range, const UA_DataValue *data)
	{
		if(sessionId->identifier.numeric != 1)
		{
			auto it = on_write_upcall_bindings.find(server);
			if(it != on_write_upcall_bindings.end()) {
				// call the upcall method related to the according server object
				it->second(readBrowseName(server,nodeId), ValueType(data->value));
			}
		}
	}
	
	static UA_StatusCode
	genericMethodCallback(UA_Server *server,
	                         const UA_NodeId *sessionId, void *sessionHandle,
	                         const UA_NodeId *methodId, void *methodContext,
	                         const UA_NodeId *objectId, void *objectContext,
	                         size_t inputSize, const UA_Variant *input,
	                         size_t outputSize, UA_Variant *output)
	{
		std::vector<ValueType> inputVector(inputSize);
		for(size_t i=0; i<inputSize; ++i) {
			inputVector[i] = input[i];
		}
		std::vector<ValueType> outputVector(outputSize);
	
		auto it = method_callback_bindings.find(server);
		if(it != method_callback_bindings.end()) {
			NodeId id(*methodId);
			// propagate the method call
			it->second(id.getSimpleName(), inputVector, outputVector);
	
			std::vector<UA_Variant> outputArguments(outputVector.size());
			for(size_t i=0; i<outputVector.size(); ++i) {
				output[i] = outputVector[i];
			}
		}
		return UA_STATUSCODE_GOOD;
	}
	#endif // HAS_OPCUA
	
	GenericServer::GenericServer(const std::string &rootObjectName, const unsigned short &namespaceId, const unsigned short &portNr, const bool &activateSignalHandler)
	{
		#ifdef HAS_OPCUA
		
		if(activateSignalHandler == true) {
			// setup signal handlers
			signal(SIGINT, signal_handler);
			signal(SIGTERM, signal_handler);
		}
	
		// setup the OPC UA server
		config = UA_ServerConfig_new_minimal(portNr, NULL);
		server = UA_Server_new(config);
	
		on_read_upcall_bindings[server] = std::bind(&GenericServer::handleOnRead, this, std::placeholders::_1, std::placeholders::_2);
		on_write_upcall_bindings[server] = std::bind(&GenericServer::handleOnWrite, this, std::placeholders::_1, std::placeholders::_2);
	
		method_callback_bindings[server] = std::bind(&GenericServer::handleMethodCall, this, std::placeholders::_1, std::placeholders::_2, std::placeholders::_3);
	
		// initialize the root object
		this->createRootObject(rootObjectName, namespaceId);
		#endif // HAS_OPCUA
	}
	
	GenericServer::~GenericServer()
	{
		#ifdef HAS_OPCUA
		// cleanup server resources
		UA_Server_delete(server);
		UA_ServerConfig_delete(config);
		#endif // HAS_OPCUA
	}
	
	
	void GenericServer::handleOnWrite(const std::string &browseName, const ValueType &value)
	{
		// no-op
	}
	void GenericServer::handleOnRead(const std::string &browseName, ValueType &value)
	{
		// no-op
	}
	void GenericServer::handleMethodCall(const std::string &browseName, const std::vector<ValueType> &inputs, std::vector<ValueType> &outputs)
	{
		// no-op
	}
	
	int GenericServer::run() {
		#ifdef HAS_OPCUA
		// setup server space
		if(createServerSpace() == true) {
			// execute the blocking server method
			UA_StatusCode retval = UA_Server_run(server, &running);
			return (int)retval;
		}
		#endif // HAS_OPCUA
		return -1;
	}
	
	void GenericServer::signalStop()
	{
		running = false;
	}
	
	bool GenericServer::createRootObject(const std::string &objectName, const unsigned short &namespaceId)
	{
	#ifdef HAS_OPCUA
		// Add an object node to the information model
		UA_ObjectAttributes oAttr = UA_ObjectAttributes_default;
		oAttr.displayName = UA_LOCALIZEDTEXT_ALLOC("en-US", objectName.c_str());
		UA_QualifiedName browseName = UA_QUALIFIEDNAME_ALLOC(namespaceId, objectName.c_str());
		// create the root-object ID
		rootObjectId = NodeId(objectName, namespaceId);
		const UA_NodeId *rootObjectIdPtr = rootObjectId;
		// add object node
		UA_StatusCode status = UA_Server_addObjectNode(server,
				*rootObjectIdPtr, // use the predefined rootObjectId
				UA_NODEID_NUMERIC(0, UA_NS0ID_OBJECTSFOLDER),	// parent node is the objects folder
				UA_NODEID_NUMERIC(0, UA_NS0ID_ORGANIZES),		// default reference type for objects
				browseName, // browse name
				UA_NODEID_NUMERIC(0, UA_NS0ID_BASEOBJECTTYPE), // type definition: default base object type
				oAttr, NULL, NULL
		);
		// cleanup allocated memory
		UA_ObjectAttributes_deleteMembers(&oAttr);
		UA_QualifiedName_deleteMembers(&browseName);
	
		// check and return the status
		if(status == UA_STATUSCODE_GOOD) {
			return true;
		}
	#endif // HAS_OPCUA
		return false;
	}
	
	bool GenericServer::addVariableNode(
			const std::string &nodeName,
			const OPCUA::ValueType &initialValue,
			const bool &readOnly,
			const unsigned short &namespaceId
	)
	{
	#ifdef HAS_OPCUA
		// create default attribute properties
		UA_VariableAttributes attr = UA_VariableAttributes_default;
	
		// copy the initial value into the attribute definition
		UA_Variant uaValue = initialValue;
		attr.dataType = uaValue.type->typeId;
		attr.value = uaValue;
	
		// setup the variable properties
		attr.description = UA_LOCALIZEDTEXT_ALLOC("en-US", nodeName.c_str());
		attr.displayName = UA_LOCALIZEDTEXT_ALLOC("en-US", nodeName.c_str());
		// setup read/write access
		if(readOnly == true) {
			attr.accessLevel = UA_ACCESSLEVELMASK_READ;
		} else {
			attr.accessLevel = UA_ACCESSLEVELMASK_READ | UA_ACCESSLEVELMASK_WRITE;
		}
	
		// create a string node id
		NodeId nodeId(nodeName, namespaceId);
		const UA_NodeId *nodeIdPtr = nodeId;
	
		// create browse name
		UA_QualifiedName browseName = UA_QUALIFIEDNAME_ALLOC(namespaceId, nodeName.c_str());
	
		const UA_NodeId *rootObjectIdPtr = rootObjectId;
	
		// add variable definition to the server using rootObjectId as the parent node
		UA_StatusCode status = UA_Server_addVariableNode(server,
					*nodeIdPtr,			// specify the node-id up-front
					*rootObjectIdPtr,   // parent node
					UA_NODEID_NUMERIC(0, UA_NS0ID_HASCOMPONENT), // default reference type
					browseName, // browse name
					UA_NODEID_NUMERIC(0, UA_NS0ID_BASEDATAVARIABLETYPE), // type definition
					attr, NULL, NULL);
	
		// cleanup allocated memory
		UA_QualifiedName_deleteMembers(&browseName);
		UA_VariableAttributes_deleteMembers(&attr);
	
		if(status != UA_STATUSCODE_GOOD) {
			return false;
		}
	
		// set generic callback method references
		UA_ValueCallback callback;
		callback.onRead = handle_onRead;
		callback.onWrite = handle_onWrite;
		status = UA_Server_setVariableNode_valueCallback(server, *nodeIdPtr, callback);
	
		// check and return the status
		if(status == UA_STATUSCODE_GOOD) {
			return true;
		}
	#endif // HAS_OPCUA
			return false;
	}
	
	bool GenericServer::addMethodNode(const std::string &methodBrowseName,
				const std::map<std::string,ValueType> &inputArguments,
				const std::map<std::string,ValueType> &outputArguments,
				const unsigned short &namespaceId)
	{
	#ifdef UA_ENABLE_METHODCALLS
		// create method's input arguments
		UA_Argument uaInputArguments[inputArguments.size()];
		size_t i=0;
		for(auto input = inputArguments.begin(); input != inputArguments.end(); input++) {
			UA_Argument_init(&uaInputArguments[i]);
			uaInputArguments[i].description = UA_LOCALIZEDTEXT_ALLOC("en-US", input->first.c_str());
			uaInputArguments[i].name = UA_STRING_ALLOC(input->first.c_str());
			// get a value copy
			UA_Variant value = input->second;
			uaInputArguments[i].dataType = value.type->typeId;
	
			if(input->second.isArrayType()) {
				// setup the array dimensions
				uaInputArguments[i].valueRank = 1;
				uaInputArguments[i].arrayDimensionsSize = value.arrayDimensionsSize;
				UA_UInt32_copy(value.arrayDimensions, uaInputArguments[i].arrayDimensions);
			} else {
				// scalar type
				uaInputArguments[i].valueRank = -1;
			}
	
			// cleanup value copy
			UA_Variant_deleteMembers(&value);
	
			// increment i
			i++;
		}
	
		// create method's output arguments
		UA_Argument uaOutputArguments[outputArguments.size()];
		// reset i
		i = 0;
		for(auto output = outputArguments.begin(); output != outputArguments.end(); output++)
		{
			UA_Argument_init(&uaOutputArguments[i]);
			uaOutputArguments[i].description = UA_LOCALIZEDTEXT_ALLOC("en-US", output->first.c_str());
			uaOutputArguments[i].name = UA_STRING_ALLOC(output->first.c_str());
			// get a value copy
			UA_Variant value = output->second;
			uaOutputArguments[i].dataType = value.type->typeId;
	
			if(output->second.isArrayType()) {
				// setup the array dimensions
				uaOutputArguments[i].valueRank = 1;
				uaOutputArguments[i].arrayDimensionsSize = value.arrayDimensionsSize;
				UA_UInt32_copy(value.arrayDimensions, uaOutputArguments[i].arrayDimensions);
			} else {
				// scalar type
				uaOutputArguments[i].valueRank = -1;
			}
	
			// cleanup value copy
			UA_Variant_deleteMembers(&value);
	
			// increment i
			i++;
		}
	
		// create method's attributes
		UA_MethodAttributes attr = UA_MethodAttributes_default;
		attr.description = UA_LOCALIZEDTEXT_ALLOC("en-US",methodBrowseName.c_str());
		attr.displayName = UA_LOCALIZEDTEXT_ALLOC("en-US",methodBrowseName.c_str());
		attr.executable = true;
		attr.userExecutable = true;
	
		// create browse name
		UA_QualifiedName browseName = UA_QUALIFIEDNAME_ALLOC(namespaceId, methodBrowseName.c_str());
	
		// create a string node id
		NodeId nodeId(methodBrowseName, namespaceId);
		const UA_NodeId *nodeIdPtr = nodeId;
		const UA_NodeId *rootObjectIdPtr = rootObjectId;
	
		// add method to the parent server object
		UA_StatusCode status = UA_Server_addMethodNode(server,
				*nodeIdPtr, // string-based method id
				*rootObjectIdPtr, // parent is the specified root object
				UA_NODEID_NUMERIC(0, UA_NS0ID_HASCOMPONENT), // default reference type
				browseName, // browse name
				attr, &genericMethodCallback, // method attributes and the callback method reference
				inputArguments.size(), uaInputArguments,  // set input arguments
				outputArguments.size(), uaOutputArguments, // set output arguments
				NULL, NULL);
	
		// cleanup allocated memory
		UA_QualifiedName_deleteMembers(&browseName);
		UA_MethodAttributes_deleteMembers(&attr);
	
		// cleanup allocated memory for input arguments
		for(size_t i=0; i<inputArguments.size(); ++i)
		{
			UA_Argument_deleteMembers(&uaInputArguments[i]);
		}
		// cleanup allocated memory for output arguments
		for(size_t i=0; i<outputArguments.size(); ++i)
		{
			UA_Argument_deleteMembers(&uaOutputArguments[i]);
		}
	
		// check and return the status
		if(status == UA_STATUSCODE_GOOD) {
			return true;
		}
	#endif // UA_ENABLE_METHODCALLS
		return false;
	}
	
	bool GenericServer::createServerSpace()
	{
		// no-op
		return true;
	}
	
	OPCUA::StatusCode GenericServer::writeVariable(const std::string &nodeName, const OPCUA::ValueType &value, const unsigned short &namespaceId)
	{
	#ifdef HAS_OPCUA
	    NodeId nodeId(nodeName,namespaceId);
	    UA_StatusCode status = UA_Server_writeValue(server,
	    		*static_cast<const UA_NodeId*>(nodeId), // use const access to prevent memory leaks
				*static_cast<const UA_Variant*>(value)  // use const access to prevent memory leaks
		);
		// check and return the status
		if(status == UA_STATUSCODE_GOOD) {
			return StatusCode::ALL_OK;
		}
	#endif // HAS_OPCUA
		return StatusCode::ERROR_COMMUNICATION;
	}
	
	} /* namespace OPCUA */
	'''
	
}