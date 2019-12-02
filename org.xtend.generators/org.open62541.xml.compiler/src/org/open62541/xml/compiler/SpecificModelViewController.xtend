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
//==============================================================================------
package org.open62541.xml.compiler

import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.open62541.xml.compiler.OpcUaXmlParser.SeRoNetMETHOD

interface SpecificModelViewController {
	def String getSpecificDriverModelHeader(String name)

	def String getSpecificViewHeader(String name)
	def String getSpecificViewSource(String name)

	def String getSpecificControllerHeader(String name)
	def String getSpecificControllerSource(String name)
	
	def String getSpecificTestServer(String name)
	
	def CharSequence compileSpecificDriverModelHeader(String name)

	def CharSequence compileSpecificViewHeader(String name)
	def CharSequence compileSpecificViewSource(String name)

	def CharSequence compileSpecificControllerHeader(String name, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	def CharSequence compileSpecificControllerSource(String name, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	
	def CharSequence compileSpecificTestServer(String name)
	def CharSequence compileSpecificCMakeLists(String name)
}