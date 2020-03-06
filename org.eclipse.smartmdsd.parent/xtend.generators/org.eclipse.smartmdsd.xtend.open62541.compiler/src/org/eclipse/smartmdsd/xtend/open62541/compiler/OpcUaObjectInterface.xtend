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

interface OpcUaObjectInterface {
	def String getOpcUaDevice_Interface_HeaderFileName(String objectName)
	
	def CharSequence compileOpcUaDevice_Interface_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) 
}