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
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component

import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import java.util.ArrayList
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ComponentGenHelpers
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference
import java.util.List
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaServerImpl
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaObjectInterfaceImpl
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetMETHOD
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetNodeId

class PlainOpcUaStatusServer {
	@Inject extension CopyrightHelpers
	@Inject extension CommObjectGenHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension OpcUaServerImpl
	@Inject extension OpcUaObjectInterfaceImpl
	@Inject extension OpcUaXmlParser
	
	// this variable is used by the recursive method getEntityList(...) to generate a consecutive entity-id 
	var currentEntityId = 6000;
	
	def getNameInstance(OpcUaReadServer server) {
		server.name.toFirstLower+"Controller"
	}
	def getClassName(OpcUaReadServer server) {
		server.name.toFirstUpper+"Controller"
	}
	
	def getServerControllerHeaderFileName(OpcUaReadServer server) {
		server.name+"Controller.hh"
	}
	def getServerControllerSourceFileName(OpcUaReadServer server) {
		server.name+"Controller.cc"
	}
	
	def compilePlainOpcUaReadServer(OpcUaReadServer server, IFileSystemAccess2 fsa) {
		val objects = ComponentDefinitionModelUtility.getAllCommObjects(server.outPort)
		val communicationObject = objects.head
		if(communicationObject !== null) {
			// reset the current entity ID to the starting value of 6000
			currentEntityId = 6000;
			val entityList = communicationObject.getEntityList("", "", new ArrayList<SeRoNetENTITY>())
			val Iterable<SeRoNetMETHOD> methodList = new ArrayList<SeRoNetMETHOD>();
			
			// generate OPC UA StatusServer information model as an XML file
			fsa.generateFile(
				server.name+".xml",
				server.compileReadServerXMLFileContent(entityList)
			)
			
			// generate OPC UA Object Interface header
			fsa.generateFile(
				server.name.opcUaDevice_Interface_HeaderFileName,
				server.name.compileOpcUaDevice_Interface_HeaderFileContent(entityList, methodList)
			)  
			
			// generate OPC UA server header file
			fsa.generateFile(
				server.name.opcUaDevice_Server_HeaderFileName,
				server.name.compileOpcUaDevice_Server_HeaderFileContent(entityList,methodList)
			)
			
			// generate OPC UA server source file
			fsa.generateFile(
				server.name.opcUaDevice_Server_SourceFileName,
				server.name.compileOpcUaDevice_Server_SourceFileContent(entityList,methodList)
			)
			
			// generate OPC UA server controller header file
			fsa.generateFile(
				server.serverControllerHeaderFileName,
				server.compileServerControllerHeader(communicationObject, entityList)
			)
			
			// generate OPC UA server controller source file
			fsa.generateFile(
				server.serverControllerSourceFileName,
				server.compileServerControllerSource(communicationObject, entityList)
			)
		}
	}
	
	def private Iterable<SeRoNetENTITY> getEntityList(CommunicationObject object, String parentName, String parentCommObjectCall, List<SeRoNetENTITY> result) {
		for(attribute: object.attributes) {
			val entity = new SeRoNetENTITY();
			entity.userAccessLevel = 1 // read only
			
			val type = attribute.type
			if(type instanceof PrimitiveType) 
			{
				// construct name
				if(parentName != "") {
					entity.name = parentName + "_" + attribute.name
					entity.commObjectCall = parentCommObjectCall + ".get" + attribute.name.toFirstUpper
				} else {
					entity.name = attribute.name
					entity.commObjectCall = ".get" + attribute.name.toFirstUpper
				}
				if(type.array !== null) {
					entity.commObjectCall = entity.commObjectCall + "Ref()"
				} else {
					entity.commObjectCall = entity.commObjectCall + "()"
				}
				
				if(
					type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN ||
					type.typeName == PRIMITIVE_TYPE_NAME.INT32 ||
					type.typeName == PRIMITIVE_TYPE_NAME.DOUBLE ||
					type.typeName == PRIMITIVE_TYPE_NAME.STRING
				)
				{
					entity.type = type.typeName.literal
				} else if(type.typeName == PRIMITIVE_TYPE_NAME.FLOAT) {
					entity.type = "Double"
				} else {
					entity.type = "Int32"
				}
				
				if(type.array !== null) {
					entity.type = "std::vector<" + entity.type + ">"
				}
				
				entity.nodeid = new SeRoNetNodeId
				entity.nodeid.i = currentEntityId++;
				
				entity.Parent_nodeid = new SeRoNetNodeId
				entity.Parent_nodeid.i = 1001
				
				// add entity to the list
				result.add(entity)
			} else if(type instanceof CommElementReference) {
				val typeName = type.typeName
				if(typeName instanceof CommunicationObject) {
					if(parentName != "") {
						val currentName = parentName + "_" + attribute.name
						var currentCommObjectCall = parentCommObjectCall + ".get" + attribute.name.toFirstUpper
						if(type.array !== null) {
							currentCommObjectCall = currentCommObjectCall + "Ref()"
						} else {
							currentCommObjectCall = currentCommObjectCall + "()"
						}
						typeName.getEntityList(currentName, currentCommObjectCall, result)
					} else {
						var currentCommObjectCall = ".get" + attribute.name.toFirstUpper
						if(type.array !== null) {
							currentCommObjectCall = currentCommObjectCall + "Ref()"
						} else {
							currentCommObjectCall = currentCommObjectCall + "()"
						}
						typeName.getEntityList(attribute.name, currentCommObjectCall, result)
					}
				}
			}
		}
		return result;
	}
	
	///////////////////////////
	// XML file of Read Server
	///////////////////////////
	def private compileReadServerXMLFileContent(OpcUaReadServer server, Iterable<SeRoNetENTITY> entitiesReadServer) '''
		<!--
		«getCopyright().replace('-','').replace('//','')»
		-->
		<UANodeSet xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xmlns:uax="http://opcfoundation.org/UA/2008/02/Types.xsd"
				xmlns="http://opcfoundation.org/UA/2011/03/UANodeSet.xsd"
				xmlns:s1="http://yourorganisation.org/example_nodeset/"
				xmlns:xsd="http://www.w3.org/2001/XMLSchema">
			<NamespaceUris>
				<Uri>http://http://opcfoundation.org/UA/SeRoNet«server.name.toFirstUpper»/</Uri>
			</NamespaceUris>
			<Aliases>
				<Alias Alias="Boolean">i=1</Alias>
				<Alias Alias="UInt32">i=7</Alias>
				<Alias Alias="String">i=12</Alias>
				<Alias Alias="HasModellingRule">i=37</Alias>
				<Alias Alias="HasTypeDefinition">i=40</Alias>
				<Alias Alias="HasSubtype">i=45</Alias>
				<Alias Alias="HasProperty">i=46</Alias>
				<Alias Alias="HasComponent">i=47</Alias>
				<Alias Alias="Argument">i=296</Alias>
			</Aliases>
			<Extensions>
				<Extension>
					<ModelInfo Tool="UaModeler" Hash="Zs8w1AQI71W8P/GOk3k/xQ==" Version="1.3.4"/>
				</Extension>
			</Extensions>
			<UAReferenceType NodeId="ns=1;i=4001" BrowseName="1:providesInputTo">
				<DisplayName>providesInputTo</DisplayName>
				<References>
					<Reference ReferenceType="HasSubtype" IsForward="false">i=33</Reference>
				</References>
				<InverseName Locale="en-US">inputProcidedBy</InverseName>
			</UAReferenceType>
			<UAObjectType IsAbstract="true" NodeId="ns=1;i=1001"
			              BrowseName="1:«server.name»">
			    <DisplayName>«server.name»</DisplayName>
			    <References>
			        <Reference ReferenceType="HasSubtype" IsForward="false">
			            i=58
			        </Reference>
			        «FOR en: entitiesReadServer»
			         <Reference ReferenceType="HasComponent">ns=1;i=«en.nodeid.i»</Reference>
			        «ENDFOR»
			    </References>
			</UAObjectType>
			«FOR en: entitiesReadServer»
			<!--                                    «en.name»     -->
			<UAVariable DataType="«en.type»" ParentNodeId="ns=1;i=1001"
			        NodeId="ns=1;i=«en.nodeid.i»" BrowseName="1:«en.name»"
			        UserAccessLevel="1" AccessLevel="1">
			<DisplayName>«en.name»</DisplayName>
			<References>
			    <Reference ReferenceType="HasTypeDefinition">i=63</Reference>
			    <Reference ReferenceType="HasModellingRule">i=78</Reference>
			    <Reference ReferenceType="HasComponent" IsForward="false">
			        ns=1;i=1001
			    </Reference>
			</References>
			</UAVariable>
			«ENDFOR»
		</UANodeSet>
	'''
	
	
	def CharSequence compileServerControllerHeader(OpcUaReadServer server, CommunicationObject commObj, Iterable<SeRoNetENTITY> entityList)
	'''
	«getCopyright()»
	
	#ifndef «server.name.toUpperCase»CONTROLLER_H_
	#define «server.name.toUpperCase»CONTROLLER_H_
	
	// C++11 mutex
	#include <mutex>
	#include "aceSmartSoft.hh"
	#include "«server.name.opcUaDevice_Interface_HeaderFileName»"
	#include "«server.name.opcUaDevice_Server_HeaderFileName»"
	#include <«commObj.userClassHeaderFileNameFQN»>
	
	namespace OPCUA {
	
	/**
	 * This class implements the Controller part of the Model-View-Controller (MVC)
	 * design pattern. As a second responsibility, this class also implements
	 * the generated interface which is used by the internally initialized OPC UA
	 * server to interact with the actual model. The actual model can be internally
	 * accessed over the given view pointer. Conceptually, this class decouples
	 * the OPC UA server from the Model and handles the lifecycle of the OPC UA server.
	 */
	class «server.className» : public «server.name»Interface, public SmartACE::Task
	{
	private:
		// the internal OPC UA server
		OPCUA::«server.name» server;
		
		// a copy of the most recent communication object
		mutable std::mutex object_mutex;
		«commObj.fullyQualifiedNameCpp» «server.name»Object;
		
		/// implementing the SmartACE::Task
		virtual int task_execution();
	
	public:
		«server.className»(Smart::IComponent *component, const unsigned short &portNumber=4840);
		virtual ~«server.className»();
	
		/// allows updating the internal communication-object copy
		virtual void put(«server.outPort.commObjectsParameterList»);
		
		// override stop method from SmartACE::Task base class (to stop internal GenricServer)
		virtual int stop(const bool wait_till_stopped=true) override;
		
		«FOR entity: entityList»
		/** XML Specific Getter function for entity «entity.name»
		 *
		 *  This function gets «entity.name»  from the Server
		 *  When class «server.name» is used with a Specific XML file to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *
		 *  @param value			:Value that was read (when status code true)
		 * 
		 *  @return status code
		 *    - true    : Entity was found and the value was read correctly
		 *    - false   : Entity was not found or the value was not read correctly
		 */
		virtual OPCUA::StatusCode get«entity.name.toFirstUpper»(«entity.type.cppType» &value) const;
		
		«ENDFOR»
	};
	
	} /* namespace OPCUA */
	
	#endif /* «server.name.toUpperCase»CONTROLLER_H_ */
	'''
	
	def CharSequence compileServerControllerSource(OpcUaReadServer server, CommunicationObject commObj, Iterable<SeRoNetENTITY> entityList)
	'''
	«getCopyright()»
	
	#include "«server.serverControllerHeaderFileName»"
	
	using namespace OPCUA;
	
	«server.className»::«server.className»(Smart::IComponent *component, const unsigned short &portNumber)
	:	SmartACE::Task(component)
	,	server(this, portNumber, false)
	{  }
	
	«server.className»::~«server.className»()
	{  }
	
	void «server.className»::put(«server.outPort.commObjectsParameterList») {
		std::unique_lock<std::mutex> lock(object_mutex);
		this->«server.name»Object = «server.outPort.nameInstance»DataObject;
	}
	
	int «server.className»::stop(const bool wait_till_stopped) {
		this->server.signalStop();
		return SmartACE::Task::stop(wait_till_stopped);
	}
	
	//Getter methods for all OPCUA Entity nodes.		
	«FOR entity: entityList»
		OPCUA::StatusCode «server.className»::get«entity.name.toFirstUpper»(«entity.type.cppType» &value) const
		{
			std::unique_lock<std::mutex> lock(object_mutex);
			value = «server.name»Object«entity.commObjectCall»;
			return OPCUA::StatusCode::ALL_OK;
		}
	«ENDFOR»			

	int «server.className»::task_execution()
	{
		// this call executes the OPCUA server (until it is killed)
		return server.run();
	}
	'''
}
