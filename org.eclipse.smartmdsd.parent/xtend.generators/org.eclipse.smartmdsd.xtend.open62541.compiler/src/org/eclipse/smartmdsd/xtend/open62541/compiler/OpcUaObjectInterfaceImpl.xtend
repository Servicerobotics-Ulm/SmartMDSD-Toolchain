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
package org.eclipse.smartmdsd.xtend.open62541.compiler

import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetMETHOD
import com.google.inject.Inject

class OpcUaObjectInterfaceImpl implements OpcUaObjectInterface {
	@Inject extension CopyrightHelpers
	@Inject extension OpcUaXmlParser
	
	override getOpcUaDevice_Interface_HeaderFileName(String objectName) { objectName + "Interface.hh" }
	
	override CharSequence compileOpcUaDevice_Interface_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) 
	'''
	«getCopyright()»
	#ifndef _«objectName.toUpperCase»_INTERFACE_HH
	#define _«objectName.toUpperCase»_INTERFACE_HH	
	
	#include <string>
	#include <OpcUaStatusCode.hh>
	
	/**
	 * This is the public C++ interface that needs to be implemented on
	 * both sides (the client and the server)
	 */
	class «objectName»Interface {
	public:
		«objectName»Interface() {  }
		virtual ~«objectName»Interface() {  }
	
		«FOR entity: entityList»
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
		virtual OPCUA::StatusCode get«entity.name.toFirstUpper»(«entity.type.cppType» &«entity.name.toFirstLower») const = 0;
		
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
		 *	- ALL_OK
		 *  - DISCONNECTED
		 *  - ERROR_COMMUNICATION
		 */
		virtual OPCUA::StatusCode set«entity.name.toFirstUpper»(const «entity.type.cppType» &value) = 0;
		
		«ENDIF»
		«ENDFOR»
		«FOR method: methodList»
		/** XML Specific Caller function for method «method.name»
		 *
		 *  This function calls «method.name» at the Server
		 *  When class ConveyorBelt is used with a Specific XML file to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *
		«FOR argIn: method.inputArguments»
			*  @param «argIn.name»			: Input | DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
		«ENDFOR»
		«FOR argIn: method.outputArguments»			
			*  @param «argIn.name»			: Output| DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
		«ENDFOR»			 	
		 * 
		 *  @return status code
		 *	- ALL_OK
		 *  - DISCONNECTED
		 *  - ERROR_COMMUNICATION
		 */
		 virtual OPCUA::StatusCode call«method.name.toFirstUpper»(«method.cppMethodArgumentsDef») = 0;
		 
		«ENDFOR»
	};

	#endif /* _«objectName.toUpperCase»_INTERFACE_HH */
	'''
}