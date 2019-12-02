//==============================================================================
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
//==============================================================================
package org.open62541.xml.compiler

import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetMETHOD

interface OpcUaObjectInterface {
	def String getOpcUaDevice_Interface_HeaderFileName(String objectName)
	
	def CharSequence compileOpcUaDevice_Interface_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) 
}