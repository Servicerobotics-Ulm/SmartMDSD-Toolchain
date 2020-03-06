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