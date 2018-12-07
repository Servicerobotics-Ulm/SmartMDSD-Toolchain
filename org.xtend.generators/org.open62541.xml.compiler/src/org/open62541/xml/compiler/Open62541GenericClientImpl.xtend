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

class Open62541GenericClientImpl implements Open62541GenericClient 
{
	@Inject extension CopyrightHelpers
	@Inject extension Open62541CppWrapperImpl
	
	override getOpcUa_GenericClient_HeaderFileName() {"OpcUaGenericClient.hh"}
	override getOpcUa_GenericClient_SourceFileName() {"OpcUaGenericClient.cc"}
	
	///////////////////////////
	// Header file of OpcUaGenericClient
	///////////////////////////
	override compileOpcUa_GenericClient_HeaderFileContent() 
	'''
	«getCopyright()»
	
	#ifndef OPCUAGENERICCLIENT_HH_
	#define OPCUAGENERICCLIENT_HH_
	
	#include <map>
	#include <vector>
	#include <string>
	
	// C++11 interface
	#include <mutex>
	#include <condition_variable>
	
	#ifdef HAS_OPCUA
	#include <open62541.h>
	#endif
	
	#include "«opcUaStatusCodeHeaderFileName»"
	#include "«opcUaValueTypeHeaderFileName»"
	#include "«opcUaNodeIdHeaderFileName»"
	
	namespace OPCUA {
	
	class GenericClient {
	#ifdef HAS_OPCUA
	private:
		// the OPC UA client pointer (is initialized in connect() and destroyed in disconnect() methods)
		UA_Client *client;
	
		// the OPC UA Object ID (for the connected root object)
		NodeId rootObjectId;
	
		/** the internal registry of all the used entities (i.e. typically OPC UA variables)
		 *
		 *  Please overload and implement the method createClientSpace() in derived classes
		 *  such that all the needed entities are stored within this registry so that
		 *  they do not need to be searched on the fly each time the get/set entity method is called.
		 */
		std::map<std::string, NodeId> entityRegistry;
	
		/// internal registry to manage subscriptions (key=SubscriptionId, value=entityBrowseName)
		std::map<UA_UInt32, std::string> subscriptionsRegistry;
	
		// entityUpdate handling
		mutable std::mutex entityUpdateMutex;
		// entity update registry (key=EntityName, value=CondVar)
		std::map<std::string, std::condition_variable> entityUpdateSignalRegistry;
		// entity update value registry (key=EntityName, value=UpdateValue)
		std::map<std::string, OPCUA::ValueType> entityUpdateValueRegistry;
	
		// asynchronous readRequest mutex
		mutable std::mutex readRequestMutex;
		// asynchronous readRequest condition variable
		mutable std::condition_variable readRequestSignal;
		// asynchronous readRequest value registry
		mutable std::map<UA_UInt32, OPCUA::ValueType> readRequestValueRegistry;
	
		/// simple discovery service checks if the given address has any endpoints (not really needed)
		bool hasEndpoints(const std::string &address, const bool &display=true);
	
		/** method for finding an element by browsing a path within the server space
		 *
		 *  This method internally uses the OPC UA Browsing service to get the NodeId
		 *  of the element specified by the objectPath. The objectPath is assumed to have
		 *  the following structure:
		 *  <ObjectName>/element/subelement/subsubelement/...
		 *  The first segment is assumed to be the object located under the default UA_NS0ID_OBJECTSFOLDER.
		 *  The following segments specify a hierarchy of subelements below the root object.
		 *  Please note, that the individual elements are identified by their BrowseName (i.e. the qualified name)
		 *  and the namespaceIndex (the second, optional attribute).
		 *
		 *  @param objectPath:		the element location within an object specified as a path (linux like path syntax)
		 *  @param namespaceIndex:	the namespace-index used to create qualified names for the individual element names
		 *
		 *  @return the NodeId of the first matching element
		 *  	- NodeId is set to UA_NODEID_NULL if the element could not be found (use UA_NodeId_isNill(result) to check for nill)
		 */
		NodeId browseObjectPath(const std::string &objectPath, const unsigned short namespaceIndex=1) const;
	
		/** method to find a sub-element of the given parentNodeId
		 *
		 *  This method browses the direct children of the given parentNodeId. Please note that the element
		 *  is identified by its browse-name and only the first match is returned (in case of possible multiple
		 *  matches with the same browse-name).
		 *
		 *  @param elementBrowseName	the browse-name (not the display name) of the element to find
		 *  @param parentNodeId			the parent under which the element is searched
		 *  @param filterNodeType		optional filter for node types (default is a filter for OPC UA variables)
		 *
		 *  @return the NodeId of the first matching element
		 *  	- NodeId is set to NULL if the element could not be found
		 */
		NodeId findElement(const std::string &elementBrowseName, const NodeId &parentNodeId, const UA_NodeClass &filterNodeType=UA_NODECLASS_VARIABLE) const;
	
		/** this helper method is used to check if the client is connected and an entity with the provided name is available in the server object
		 *
		 *  The method implements the generic check that is is used from within the methods getEntity(), setEntity() and callMethod()
		 *  to assure that the client is connected and that the requested entity is actually existing in the server space.
		 *  In case the derived client has implemented the method createClientSpace() properly, then this method
		 *  uses the internal entityRegistry instead of accessing the server remotely (to make this check a lot faster).
		 *
		 *  @param entityBrowseName the entoty's browse name
		 *  @param entityId the output argument where the matched entity ID is returned
		 *  @param filterNodeType an optional filter (default value is a OPC UA Variable)
		 */
		OPCUA::StatusCode checkAndGetEntityId(const std::string &entityBrowseName, NodeId &entityId, const UA_NodeClass &filterNodeType=UA_NODECLASS_VARIABLE) const;
	
		// these two helper methods might be useful to create fast access to OPC UA variables (not yet tested)
		UA_StatusCode registerNode(const NodeId &nodeId);
		UA_StatusCode unregisterNode(const NodeId &nodeId);
	
		// these two helper methods should be used to implement the client async upcalls (not yet fully tested)
		UA_StatusCode createSubscription(const std::string &entityBrowseName, const unsigned int samplingIntervalMS=100);
		UA_StatusCode deleteSubscription(const std::string &entityBrowseName);
	
		/// internal upcall called from within the internal OPC UA upcall method, it propagates the call to the 
		void handleEntity(const UA_UInt32 &subscriptionId, UA_DataValue *data);
	
		/// internal upcall to handle asynchronous read-requests
		void handleReadRequest(const UA_UInt32 &requestId, UA_Variant *data);
	#endif
	
	protected:
	
		/** this method creates a fast-access registry to an OPC UA variable identified by its browse-name
		 *
		 *  This method searches for an OPC UA variable within the server space, and if found:
		 *  (i) creates a registry entry to speed-up read/write access and (ii) sets up a
		 *  subscription infrastructure to get notified about incoming value updates for the given variable.
		 *  This method is supposed to be used from within the custom implementation of the createClientSpace()
		 *  method.
		 *
		 *  @param variableBrowseName is the browse-name of the OPC UA variable within the server space
		 *  @param activateUpdateUpcall optional attribute allows activation/deactivation of the upcall interface for data-updates
		 *  @param samplingIntervalMS optional internal sampling interval for checking of the value-updates (default inteval is 100 ms)
		 *  @return true on SUCCESS or false on ERROR
		 *
		 *  @sa createClientSpace()
		 */
		bool addVariableNode(const std::string &variableBrowseName, const bool activateUpdateUpcall=true, const unsigned int samplingIntervalMS=100);
	
		/** this method creates a fast-access registry to an OPC UA method identified by its browse-name
		 *
		 *  This method searches for an OPC UA method within the server space, and if found creates a registry
		 *  entry to speed-up calling access. This method is supposed to be used from within the custom
		 *  implementation of the createClientSpace() method.
		 *
		 *  @param methodBrowseName is the browse-name of the OPC UA method within the server space
		 *  @return true on SUCCESS or false on ERROR
		 *
		 *  @sa createClientSpace()
		 */
		bool addMethodNode(const std::string &methodBrowseName);
	
		/** this method shall be implemented in derived classes to create the client-space (i.e. to fill the entityRegistry)
		 *
		 *  Please overload and implement this method in derived classes to specify the client's specific variables.
		 *  You can use the helper method findElement() to get the OPC UA node ids for the object and its variables.
		 *  The mapping of variable's browse name and node-id should be stored within the entityRegistry.
		 *  An example implementation is like this:
		 *
		 *	// for each entity create a registry entry like this:
		 *	if(this->addVariableNode("MyVariable") != true) {
		 *		return false;
		 *	}
		 *	// for each method create a registry entry like this:
		 *	if(this->addMethodNode("MyMethod") != true) {
		 *		return false;
		 *	}
		 *
		 *
		 *  @param activateUpcalls parameter that is propagated from the connect() method to indicate whether the the upcall interface should be activated or not (pass this value to the addMethodNode() method)
		 *  @return true if everything worked well, or false in case of problems
		 *
		 *  @sa addVariableNode()
		 *  @sa addMethodNode()
		 */
		virtual bool createClientSpace(const bool activateUpcalls=true);
	
		/// overload this method in derived classes to individually handle value-updates for the respective variable
		virtual void handleVariableValueUpdate(const std::string &variableBrowseName, const OPCUA::ValueType &value);
	
	public:
		GenericClient();
		virtual ~GenericClient();
	
		/** this method instantiates and connects the internal OPC UA Client
		 *
		 *  This method connects the internal OPC UA Client to the provided OPC UA Server URL.
		 *
		 *  @param address the OPC UA Server URL
		 *  @param objectName optional parameter specifying the root object within the server space
		 *  @param activateUpcalls optional parameter that allows activation/deactivation of the upcall interface of this client
		 *  @return OPCUA::StatusCode::ALL_OK on succes or OPCUA::StatusCode::ERROR_COMMUNICATION otherwise
		 */
		OPCUA::StatusCode connect(const std::string &address = "opc.tcp://localhost:4840", const std::string &objectName="", const bool activateUpcalls=true);
	
		/** this method disconnects the internal OPC UA Client (if it was connected before)
		 *
		 *  This method checks if client is connected and if so, disconnects it and cleans up its
		 *  allocated resources.
		 *
		 *  @return OPCUA::StatusCode::ALL_OK on success or OPCUA::StatusCode::ERROR_COMMUNICATION otherwise
		 */
		OPCUA::StatusCode disconnect();
	
		/** execute client's async interface
		 *
		 *  This method is supposed to be called repeatedly (i.e. in a loop) from within a new thread that
		 *  is supposed to be implemented in derived classes. Internally this method checks if client
		 *  is still connected and if so, tries to maintain a connection session. As long as the session
		 *  is valid, the method UA_Client_run_iterate is called that operates the client's asynchronous
		 *  API.
		 *
		 *	@param address the OPC UA Server URL
		 *  @param timeoutMS an optional argument for the timeout time (in milliseconds)
		 *  @return the current status of the client
		 *    - OPCUA::StatusCode::ALL_OK if everything is OK or
		 *    - OPCUA::StatusCode::DISCONNECTED if the client-connection is lost
		 */
		OPCUA::StatusCode run_once(const std::string &address = "opc.tcp://localhost:4840", const unsigned short &timeoutMS=500);
	
	
		/** Generic Getter function returning the current value of an OPC UA Variable
		 *
		 *  This function searches for an OPC UA Variable (identified by its browse-name)
		 *  within the server space and, if found, immediately returns its current value.
		 *
		 *  @param variableBrowseName	:Browse Name of the variable to be read
		 *  @param value		:Value that was read (when status code ALL_OK)
		 *
		 *  @return status code
		 *    - ALL_OK  : Variable was found and the value was read correctly
		 *    - DISCONNECTED : client is disconnected
		 *    - WRONG_ID : the variable with the given name is not available in the server
		 *    - ERROR_COMMUNICATION : something unexpected went wrong while communicating
		 */
		OPCUA::StatusCode getVariableCurrentValue(const std::string &variableBrowseName, OPCUA::ValueType &value) const;
	
		/** Generic Getter function that blocks until a new value-update of an OPC UA Variable arrives
		 *
		 *  This function searches for an OPC UA Variable (identified by its browse-name)
		 *  within the server space and, if found, waits until the value is updated before returning its current value.
		 *
		 *  @param variableBrowseName	:Browse Name of the variable to be read
		 *  @param value		:Value that was read (when status code ALL_OK)
		 *
		 *  @return status code
		 *    - ALL_OK  : Variable was found and the value was read correctly
		 *    - DISCONNECTED : client is disconnected
		 *    - WRONG_ID : the variable with the given name is not available in the server
		 *    - ERROR_COMMUNICATION : something unexpected went wrong while communicating
		 */
		OPCUA::StatusCode getVariableNextValue(const std::string &variableBrowseName, OPCUA::ValueType &value);
	
		/** Generic Setter function
		 *
		 *  This function sets a named entity at the Server
		 *  When class ConveyorBelt is used as a Generic class to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *
		 *
		 *  @param variableBrowseName	:Browse Name of the entity to be set
		 *  @param value		:Value to be set
		 *
		 *  @return status code
		 *    - ALL_OK  : Variable was found and the value was read correctly
		 *    - DISCONNECTED : client is disconnected
		 *    - WRONG_ID : the variable with the given name is not available in the server
		 *    - ERROR_COMMUNICATION : something unexpected went wrong while communicating
		 */
		OPCUA::StatusCode setVariableValue(const std::string &entityName, const OPCUA::ValueType &value);
	
		/** Generic Caller function
		 *
		 *  This function calls a named method at the Server
		 *
		 *  @param methodName		:Display Name of the method to be called
		 *  @param inputArguments	:A vector of Input argument-values
		 *  @param outputArguments	:A vector of Output argument-values
		 *
		 *  @return status code		:OPCUA::StatusCode
		 */
		OPCUA::StatusCode callMethod(const std::string &methodName, const std::vector<OPCUA::ValueType> &inputArguments, std::vector<OPCUA::ValueType> &outputArguments);
	};
	
	} /* namespace OPCUA */
	
	#endif /* OPCUAGENERICCLIENT_HH_ */
	'''
	
	override compileOpcUa_GenericClient_SourceFileContent() 
	'''
	«getCopyright()»
	
	#include "«opcUa_GenericClient_HeaderFileName»"
	
	#include <vector>
	#include <sstream>
	#include <functional>
	
	namespace OPCUA {
	
	#ifdef HAS_OPCUA
	static void
	inactivityCallback (UA_Client *client)
	{
		//TODO: check if this method is of any use
		std::cerr << "Server Inactivity" << std::endl;
	}
	
	#ifdef UA_ENABLE_SUBSCRIPTIONS
	// this is an internal registry map that connects subscription handle_entity_update(...)
	// method with the client's handleEntity(...) object-member-method
	static std::map<UA_UInt32,std::function<void(const UA_UInt32&,UA_DataValue*)>> subscription_bindings;
	
	// static and generic subscription handling method (shared by all client instances)
	static void
	handle_entity_update(UA_Client *client, UA_UInt32 subId, void *subContext,
	                         UA_UInt32 monId, void *monContext, UA_DataValue *value)
	{
		auto it = subscription_bindings.find(subId);
		if(it != subscription_bindings.end()) {
			// call bound function
			it->second(subId, value);
		}
	}
	
	
	static std::map<UA_Client*,std::function<void(const UA_UInt32&,UA_Variant*)>> on_read_registry;
	
	static
	void handle_on_read (UA_Client *client, void *userdata, UA_UInt32 requestId, UA_Variant *value)
	{
		auto it = on_read_registry.find(client);
		if(it != on_read_registry.end()) {
			// call bound function
			it->second(requestId, value);
		}
	
	    /*more type distinctions possible*/
	    return;
	}
	static
	void attrWritten (UA_Client *client, void *userdata, UA_UInt32 requestId, UA_WriteResponse *response)
	{
	    /*assuming no data to be retrieved by writing attributes*/
	    UA_WriteResponse_deleteMembers(response);
	}
	#endif
	
	bool GenericClient::hasEndpoints(const std::string &address, const bool &display)
	{
	    // Listing endpoints
	    UA_EndpointDescription* endpointArray = NULL;
	    size_t endpointArraySize = 0;
	    UA_StatusCode retval = UA_Client_getEndpoints(client, address.c_str(),
	                                                  &endpointArraySize, &endpointArray);
	    if(retval != UA_STATUSCODE_GOOD) {
	        UA_Array_delete(endpointArray, endpointArraySize, &UA_TYPES[UA_TYPES_ENDPOINTDESCRIPTION]);
	        return false;
	    }
	    if(display==true) {
	    	printf("%i endpoints found\n", (int)endpointArraySize);
	        for(size_t i=0;i<endpointArraySize;i++) {
	            printf("URL of endpoint %i is %.*s\n", (int)i,
	                   (int)endpointArray[i].endpointUrl.length,
	                   endpointArray[i].endpointUrl.data);
	        }
	    }
	    UA_Array_delete(endpointArray,endpointArraySize, &UA_TYPES[UA_TYPES_ENDPOINTDESCRIPTION]);
	    return (endpointArraySize > 0);
	}
	#endif // HAS_OPCUA
	
	GenericClient::GenericClient()
	{
	#ifdef HAS_OPCUA
		// set client to initially to zero (the real initialization happens during connection)
		client = 0;
	
		// default parent object is the default Objects Folder
		rootObjectId = UA_NODEID_NUMERIC(0, UA_NS0ID_OBJECTSFOLDER);
	#endif // HAS_OPCUA
	}
	
	GenericClient::~GenericClient()
	{
		// make sure the client is disconnected before destroying this instance
		this->disconnect();
	}
	
	OPCUA::StatusCode GenericClient::connect(const std::string &address, const std::string &objectName, const bool activateUpcalls)
	{
		// make sure the client is disconnected in any case
		this->disconnect();
	#ifdef HAS_OPCUA
		UA_ClientConfig config = UA_ClientConfig_default;
		/* Set stateCallback */
		config.inactivityCallback = inactivityCallback;
		/* Perform a connectivity check every 2 seconds */
		config.connectivityCheckInterval = 2000;
	
		// create a new client
		client = UA_Client_new(config);
	
		if( hasEndpoints(address) == true ) 
		{
			// Connect client to a server
			UA_StatusCode retval = UA_Client_connect(client, address.c_str());
			//retval = UA_Client_connect_username(client, "opc.tcp://localhost:4840", "user1", "password");
			if(retval != UA_STATUSCODE_GOOD) {
				UA_Client_delete(client);
				client = 0;
				return OPCUA::StatusCode::ERROR_COMMUNICATION;
			}
	
			// find the root object using its browseName under the default objects folder
			rootObjectId = this->findElement(objectName,
				UA_NODEID_NUMERIC(0, UA_NS0ID_OBJECTSFOLDER), // the the default objects folder as parent
				UA_NODECLASS_OBJECT // look for object types only
			);
			if(rootObjectId.isNull()) {
				// if the object could no be found -> disconnect client and return wrong ID
				this->disconnect();
				return OPCUA::StatusCode::WRONG_ID;
			}
	
			on_read_registry[client] = std::bind(&GenericClient::handleReadRequest, this, std::placeholders::_1, std::placeholders::_2);
	
			// call the method that hopefully creates the client space in derived classes
			if( this->createClientSpace(activateUpcalls) == true ) {
				// client is now connected
				return OPCUA::StatusCode::ALL_OK;
			}
		} else {
			UA_Client_delete(client);
			client = 0;
		}
	#endif // HAS_OPCUA
		// something else went wrong
		return OPCUA::StatusCode::ERROR_COMMUNICATION;
	}
	
	bool GenericClient::createClientSpace(const bool activateUpcalls)
	{
		// no-op
		return true;
	}
	
	OPCUA::StatusCode GenericClient::disconnect()
	{
	#ifdef HAS_OPCUA
		// disconnect and clean-up client
		if(client != 0) {
		    UA_Client_disconnect(client);
		    UA_Client_delete(client);
		    client = 0;
		}
	#endif // HAS_OPCUA
		return OPCUA::StatusCode::ALL_OK;
	}
	
	#ifdef HAS_OPCUA
	/**
	 * This implementation used a somewhat complicated low-level API at the moment because the client's
	 * high-level API seems not yet to be implemented. This implementation can be simplified in the future when
	 * the high level API is provided.
	 */
	NodeId GenericClient::browseObjectPath(const std::string &objectPath, const unsigned short namespaceIndex) const
	{
	    // create new node id
	    NodeId nodeId;
	
	    // parse path
		std::vector<std::string> path_segments;
		std::stringstream ss(objectPath);
		std::string segment;
		const char delimiter = '/';
		// parse path to get individual path elements
		while(std::getline(ss, segment, delimiter)) {
			path_segments.push_back(segment);
		}
	
		if(path_segments.size() > 0)
		{
			// create a UA relative-path struct array and fill it with values
			UA_RelativePathElement* ua_paths = (UA_RelativePathElement*)UA_Array_new(path_segments.size(), &UA_TYPES[UA_TYPES_RELATIVEPATHELEMENT]);
			for(size_t i = 0; i < path_segments.size(); i++) {
				if(i==0) {
					// the first element is assumed to be the object type, hence, use the UA_NS0ID_ORGANIZES typeId
					ua_paths[i].referenceTypeId = UA_NODEID_NUMERIC(0, UA_NS0ID_ORGANIZES);
				} else {
					// all the following path elements are assumed to be components
					ua_paths[i].referenceTypeId = UA_NODEID_NUMERIC(0, UA_NS0ID_HASCOMPONENT);
				}
				ua_paths[i].targetName = UA_QUALIFIEDNAME_ALLOC(namespaceIndex, path_segments[i].c_str());
			}
	
			// create the browse-path struct
			UA_BrowsePath browsePath;
			UA_BrowsePath_init(&browsePath);
			// use the default objects foulder as root
			browsePath.startingNode = UA_NODEID_NUMERIC(0, UA_NS0ID_OBJECTSFOLDER);
			browsePath.relativePath.elements = ua_paths;
			browsePath.relativePath.elementsSize = path_segments.size();
	
			// create the request struct including the browse path
			UA_TranslateBrowsePathsToNodeIdsRequest request;
			UA_TranslateBrowsePathsToNodeIdsRequest_init(&request);
			request.browsePaths = &browsePath;
			request.browsePathsSize = 1;
	
			// call the browse service
			UA_TranslateBrowsePathsToNodeIdsResponse response = UA_Client_Service_translateBrowsePathsToNodeIds(client, request);
	
			if(response.responseHeader.serviceResult == UA_STATUSCODE_GOOD) {
				if(response.resultsSize > 0 && response.results[0].targetsSize > 0) {
					// we just get the first target's node-id (typically there should be just one single target found, if any)
					nodeId = response.results[0].targets[0].targetId.nodeId;
				}
			}
	
			// cleanup allocated memory
			UA_BrowsePath_deleteMembers(&browsePath);
			UA_TranslateBrowsePathsToNodeIdsResponse_deleteMembers(&response);
		} // end if(path_elements.size() > 0)
	
		// nodeId is UA_NODEID_NULL in case the element has no been found
		return nodeId;
	}
	
	NodeId GenericClient::findElement(const std::string &elementBrowseName, const NodeId &parentNodeId, const UA_NodeClass &filterNodeType) const
	{
		// new id
		NodeId resultId;
	
	    // create default browse request
	    UA_BrowseRequest bReq;
	    UA_BrowseRequest_init(&bReq);
	    bReq.requestedMaxReferencesPerNode = 0;
	    bReq.nodesToBrowse = UA_BrowseDescription_new();
	    bReq.nodesToBrowseSize = 1;
	    // use given nodeId as parent (default is UA_NODEID_NUMERIC(0, UA_NS0ID_OBJECTSFOLDER))
	    bReq.nodesToBrowse[0].nodeId = parentNodeId;
	    bReq.nodesToBrowse[0].resultMask = UA_BROWSERESULTMASK_ALL; /* return everything */
	
	    // call the browse service
	    UA_BrowseResponse bResp = UA_Client_Service_browse(client, bReq);
	
	    // look for the element with the given name within the response
	    for(size_t i = 0; i < bResp.resultsSize; ++i)
	    {
	    	// pointer to the browse-results struct
	    	UA_BrowseResult *result = &(bResp.results[i]);
	        for(size_t j = 0; j < result->referencesSize; ++j)
	        {
	        	UA_ReferenceDescription *ref = &(result->references[j]);
	            // check the node-class type
	            if(ref->nodeClass == filterNodeType) {
	            	// check the browseName
	            	std::string browseName((const char*)ref->browseName.name.data, ref->browseName.name.length);
	            	if(browseName == elementBrowseName) {
	            		// copy node id into the variable that is returned below
	                    resultId = ref->nodeId.nodeId;
	                    // we only use the first match and ignore further possible matches
	                    break;
	            	}
	            }
	        }
	    }
	    // cleanup allocated memory
	    UA_BrowseRequest_deleteMembers(&bReq);
	    UA_BrowseResponse_deleteMembers(&bResp);
	
	    // nodeId can also be NULL in case that the searched element was not found
	    return resultId;
	}
	
	UA_StatusCode GenericClient::registerNode(const NodeId &nodeId)
	{
	    UA_RegisterNodesRequest request;
	    UA_RegisterNodesRequest_init(&request);
	
	    request.nodesToRegister = UA_NodeId_new();
	    // example: req.nodesToRegister[0] = UA_NODEID_NUMERIC(0, UA_NS0ID_SERVER_SERVERSTATUS_CURRENTTIME);
	    request.nodesToRegister[0] = nodeId;
	    request.nodesToRegisterSize = 1;
	
	    UA_RegisterNodesResponse response = UA_Client_Service_registerNodes(client, request);
	
	    // copy result
	    UA_StatusCode result = response.responseHeader.serviceResult;
	
	    // store result-nodeIds if needed
	    if(result == UA_STATUSCODE_GOOD && response.registeredNodeIdsSize > 0) {
	//    	std::cout << "registered node: " << nodeId.identifier.numeric <<
	//    			" now is: " << response.registeredNodeIds[0].identifier.numeric << std::endl;
	//    UA_NodeId nodeId = res.registeredNodeIds[0];
	    }
	
	    UA_RegisterNodesRequest_deleteMembers(&request);
	    UA_RegisterNodesResponse_deleteMembers(&response);
	
	    return result;
	}
	
	UA_StatusCode GenericClient::unregisterNode(const NodeId &nodeId)
	{
	    UA_UnregisterNodesRequest reqUn;
	    UA_UnregisterNodesRequest_init(&reqUn);
	
	    reqUn.nodesToUnregister = UA_NodeId_new();
	    reqUn.nodesToUnregister[0] = nodeId;
	    reqUn.nodesToUnregisterSize = 1;
	
	    UA_UnregisterNodesResponse resUn = UA_Client_Service_unregisterNodes(client, reqUn);
	    UA_StatusCode result = resUn.responseHeader.serviceResult;
	
	    UA_UnregisterNodesRequest_deleteMembers(&reqUn);
	    UA_UnregisterNodesResponse_deleteMembers(&resUn);
	
	    return result;
	}
	
	
	OPCUA::StatusCode GenericClient::checkAndGetEntityId(const std::string &entityBrowseName, NodeId &entityId, const UA_NodeClass &filterNodeType) const
	{
		// check if client is connected, if not, return immediately
		if(client == 0) {
			return OPCUA::StatusCode::DISCONNECTED;
		}
	
		// look for an entity name under the given object
		auto entityIt = entityRegistry.find(entityBrowseName);
		if(entityIt != entityRegistry.end()) {
			entityId = entityIt->second;
		} else {
			// browse for the entity ID on the fly (please implement the createClientSpace() to prevent on-the-fly browsing
			entityId = this->findElement(entityBrowseName, rootObjectId, filterNodeType);
		}
	
		// check that the entityId has been found
		if(entityId.isNull()) {
			return OPCUA::StatusCode::WRONG_ID;
		}
	
	    return OPCUA::StatusCode::ALL_OK;
	}
	
	
	UA_StatusCode GenericClient::createSubscription(const std::string &entityBrowseName, const unsigned int samplingIntervalMS)
	{
		// try getting the entity ID
		NodeId entityId;
		OPCUA::StatusCode result = checkAndGetEntityId(entityBrowseName, entityId);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return UA_STATUSCODE_BADSUBSCRIPTIONIDINVALID;
		}
	#ifdef UA_ENABLE_SUBSCRIPTIONS
	    /* Create a subscription */
	    UA_CreateSubscriptionRequest request = UA_CreateSubscriptionRequest_default();
	    request.requestedPublishingInterval = samplingIntervalMS;
	    UA_CreateSubscriptionResponse response = UA_Client_Subscriptions_create(client, request,
	                                                                            NULL, NULL, NULL);
	
	    if(response.responseHeader.serviceResult != UA_STATUSCODE_GOOD) {
	    	// subscription failed, return immediately
	    	return response.responseHeader.serviceResult;
	    }
	
	    // save the entity-name for the new subscription-id
	    subscriptionsRegistry[response.subscriptionId] = entityBrowseName;
	
	    // create upcall binding
	    subscription_bindings[response.subscriptionId] = std::bind(&GenericClient::handleEntity, this, std::placeholders::_1, std::placeholders::_2);
	
	    // create a monitored item
	    UA_MonitoredItemCreateRequest monRequest = UA_MonitoredItemCreateRequest_default(entityId);
	    monRequest.requestedParameters.samplingInterval = samplingIntervalMS;
	    UA_MonitoredItemCreateResult monResponse =
	    UA_Client_MonitoredItems_createDataChange(client, response.subscriptionId,
	                                              UA_TIMESTAMPSTORETURN_BOTH,
	                                              monRequest, NULL, handle_entity_update, NULL);
	    UA_MonitoredItemCreateRequest_deleteMembers(&monRequest);
	    return monResponse.statusCode;
	#else
	    return UA_STATUSCODE_BADSUBSCRIPTIONIDINVALID;
	#endif
	}
	
	UA_StatusCode GenericClient::deleteSubscription(const std::string &entityBrowseName)
	{
	#ifdef UA_ENABLE_SUBSCRIPTIONS
		for(auto it=subscriptionsRegistry.begin(); it!=subscriptionsRegistry.end(); it++) {
			// search for the entity to unsubscribe
			if(it->second == entityBrowseName) {
				// delete a single subscription
				return UA_Client_Subscriptions_deleteSingle(client, it->first);
			}
		}
	#endif
	    return UA_STATUSCODE_BADSUBSCRIPTIONIDINVALID;
	}
	
	void GenericClient::handleEntity(const UA_UInt32 &subscriptionId, UA_DataValue *data)
	{
		// extract the actual value
		OPCUA::ValueType value(data->value);
	
		auto it = subscriptionsRegistry.find(subscriptionId);
		if(it != subscriptionsRegistry.end())
		{
			{
				// acquire the entityUpdateMutex
				std::unique_lock<std::mutex> entityUpdateLock(entityUpdateMutex);
				// store the update for the respective entity
				entityUpdateValueRegistry[it->second] = value;
				// notify all waiting clients
				entityUpdateSignalRegistry[it->second].notify_all();
			}
			// propagate the update handling to the user method implemented in derived classes
			this->handleVariableValueUpdate(it->second, value);
		}
	}
	#endif // HAS_OPCUA
	
	
	void GenericClient::handleVariableValueUpdate(const std::string &variableBrowseName, const OPCUA::ValueType &value)
	{
		// no-op
	}
	
	bool GenericClient::addVariableNode(const std::string &entityBrowseName, const bool activateUpdateUpcall, const unsigned int samplingIntervalMS)
	{
	#ifdef HAS_OPCUA
		// try getting the entity ID
		NodeId entityId;
		OPCUA::StatusCode result = checkAndGetEntityId(entityBrowseName, entityId);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return false;
		}
	
		// save the entity ID within the internal registry
		entityRegistry[entityBrowseName] = entityId;
		
		if(activateUpdateUpcall == true) {
			// create subscription for the current entity
			this->createSubscription(entityBrowseName, samplingIntervalMS);
		}
		return true;
	#else
		return false;
	#endif // HAS_OPCUA
	}
	
	bool GenericClient::addMethodNode(const std::string &methodBrowseName)
	{
	#ifdef HAS_OPCUA
		NodeId methodId;
		OPCUA::StatusCode result = checkAndGetEntityId(methodBrowseName, methodId, UA_NODECLASS_METHOD);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return false;
		}
	
		// save the method ID within the internal registry
		entityRegistry[methodBrowseName] = methodId;
		return true;
	#else
		return false;
	#endif // HAS_OPCUA
	}
	
	void GenericClient::handleReadRequest(const UA_UInt32 &requestId, UA_Variant *data)
	{
		std::unique_lock<std::mutex> readRequestLock(readRequestMutex);
		readRequestValueRegistry[requestId] = *data;
		readRequestSignal.notify_all();
	}
	
	
	OPCUA::StatusCode GenericClient::getVariableCurrentValue(const std::string &variableName, OPCUA::ValueType &value) const
	{
		OPCUA::StatusCode result = OPCUA::StatusCode::ERROR_COMMUNICATION;
	#ifdef HAS_OPCUA
		// check if the entity ID can be found
		NodeId entityId;
		result = checkAndGetEntityId(variableName, entityId);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return result;
		}
	
		// Read attribute value
		UA_NodeId uaId = entityId;
		UA_UInt32 requestId = 0;
	
		// don't use the synchronous (i.e. direct) access to variables as it will conflict with the asynchronous API
	//	UA_StatusCode retval = UA_Client_readValueAttribute(client, uaId, variant);
		UA_StatusCode retval = UA_Client_readValueAttribute_async(client, uaId, handle_on_read, NULL, &requestId);
		if(retval == UA_STATUSCODE_GOOD) {
			while(true)
			{
				// grab the mutex
				std::unique_lock<std::mutex> readRequestLock(readRequestMutex);
				// wait for a read-request to finish
				readRequestSignal.wait(readRequestLock);
				// check if the registry has the result
				auto it = readRequestValueRegistry.find(requestId);
				// if request has been processed, then get the value and exit the while loop
				if(it != readRequestValueRegistry.end()) {
					// copy variant value
					value = it->second;
					// clean-up registry entry
					readRequestValueRegistry.erase(it);
					break;
				}
				// the required read request has not yet been processed -> wait for another signal
			}
			result = OPCUA::StatusCode::ALL_OK;
		} else {
			result = OPCUA::StatusCode::ERROR_COMMUNICATION;
		}
		UA_NodeId_deleteMembers(&uaId);
	#endif // HAS_OPCUA
		return result;
	}
	
	OPCUA::StatusCode GenericClient::getVariableNextValue(const std::string &variableName, OPCUA::ValueType &value)
	{
		OPCUA::StatusCode result = OPCUA::StatusCode::ERROR_COMMUNICATION;
	#ifdef HAS_OPCUA
		// check if the entity ID can be found
		NodeId entityId;
		result = checkAndGetEntityId(variableName, entityId);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return result;
		}
	
		// acquire the entityUpdateMutex
		std::unique_lock<std::mutex> entityUpdateLock(entityUpdateMutex);
		// blocking wait until the entity is released
		entityUpdateSignalRegistry[variableName].wait(entityUpdateLock);
		// copy the updated value
		value = entityUpdateValueRegistry[variableName];
	#endif // HAS_OPCUA
		// return result
		return result;
	}
	
	OPCUA::StatusCode GenericClient::setVariableValue(const std::string &variableName, const OPCUA::ValueType &value)
	{
		OPCUA::StatusCode result = OPCUA::StatusCode::ERROR_COMMUNICATION;
	#ifdef HAS_OPCUA
		// check if the entity ID can be found
		NodeId entityId;
		result = checkAndGetEntityId(variableName, entityId);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return result;
		}
	
		// write attribute value
		UA_UInt32 reqId;
		UA_StatusCode retval = UA_Client_writeValueAttribute_async(client, entityId, value, attrWritten, NULL, &reqId);
		if(retval == UA_STATUSCODE_GOOD) {
	    	result = OPCUA::StatusCode::ALL_OK;
		} else {
			result = OPCUA::StatusCode::ERROR_COMMUNICATION;
		}
	#endif // HAS_OPCUA
		// return result
		return result;
	}
	
	OPCUA::StatusCode GenericClient::callMethod(const std::string &methodName,
	                        const std::vector<OPCUA::ValueType> &inputArguments,
	                        std::vector<OPCUA::ValueType> &outputArguments)
	{
	#ifdef UA_ENABLE_METHODCALLS
		// check if the method ID can be found
		NodeId methodId;
		OPCUA::StatusCode result = checkAndGetEntityId(methodName, methodId, UA_NODECLASS_METHOD);
		if(result != OPCUA::StatusCode::ALL_OK) {
			return result;
		}
	
		// create input arguments
		std::vector<UA_Variant> uaInputArguments(inputArguments.size());
		for(size_t i=0; i<inputArguments.size(); ++i) {
			uaInputArguments[i] = inputArguments[i];
		}
	
		// output variables
		size_t outputSize=0;
		UA_Variant *output;
	
		// call the method (using high-level interface)
		UA_StatusCode retval = UA_Client_call(client,
	    	rootObjectId, 	// the parent object ID
			methodId,		// the current method ID
			inputArguments.size(), uaInputArguments.data(), // input arguments
			&outputSize, &output // output arguments
		);
	
		if(retval == UA_STATUSCODE_GOOD) {
			// collect and return the output arguments
			outputArguments.resize(outputSize);
			for(size_t i=0; i<outputSize; ++i) {
				outputArguments[i] = output[i];
			}
			// cleanup output arguments memory
			UA_Array_delete(output, outputSize, &UA_TYPES[UA_TYPES_VARIANT]);
			// cleanup input arguments memory
			for(size_t i=0; i<uaInputArguments.size(); ++i) {
				UA_Variant_deleteMembers(&uaInputArguments[i]);
			}
			// return SUCCESS
			return OPCUA::StatusCode::ALL_OK;
		}
	#endif
		return OPCUA::StatusCode::ERROR_COMMUNICATION;
	}
	
	OPCUA::StatusCode GenericClient::run_once(const std::string &address, const unsigned short &timeoutMS)
	{
	#ifdef HAS_OPCUA
		if(client == 0) {
			UA_sleep_ms(timeoutMS);
			return OPCUA::StatusCode::DISCONNECTED;
		}
		/* if already connected, this will return GOOD and do nothing */
		/* if the connection is closed/errored, the connection will be reset and then reconnected */
		/* Alternatively you can also use UA_Client_getState to get the current state */
		//UA_ClientState clientState = UA_Client_getState(client);
		UA_StatusCode status = UA_Client_connect(client, address.c_str());
		if(status != UA_STATUSCODE_GOOD) {
			std::cerr << "client connection status != UA_STATUSCODE_GOOD: " << status << std::endl;
			/* The connect may timeout after 1 second (see above) or it may fail immediately on network errors */
			/* E.g. name resolution errors or unreachable network. Thus there should be a small sleep here */
			UA_sleep_ms(timeoutMS);
			return OPCUA::StatusCode::DISCONNECTED;
		}
		// run client's callback interface with 500ms timeout
		UA_Client_run_iterate(client, timeoutMS);
		return OPCUA::StatusCode::ALL_OK;
	#else
		return OPCUA::StatusCode::ERROR_COMMUNICATION;
	#endif
	}
	
	} /* namespace OPCUA */
	'''
}