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

interface OpcUaClient 
{
	def String getOpcUa_DeviceClient_HeaderFileName(String clientName)
	def String getOpcUa_DeviceClient_SourceFileName(String clientName)
	
	def String getOpcUa_DeviceClient_TestMain_SourceFileName(String clientName)
	
	def CharSequence compileOpcUa_DeviceClient_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	def CharSequence compileOpcUa_DeviceClient_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	
	def CharSequence compileOpcUa_DeviceClient_TestMain_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	
	def CharSequence compileOpcUa_DeviceClient_Test_CMakeListsContent(String objectName);
}