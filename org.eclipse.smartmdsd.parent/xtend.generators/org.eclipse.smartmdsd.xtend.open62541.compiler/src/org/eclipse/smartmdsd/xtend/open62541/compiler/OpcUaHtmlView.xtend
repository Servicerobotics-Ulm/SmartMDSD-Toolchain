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

interface OpcUaHtmlView {
	def String getOpcUaDeviceServerVisualFileName()
	
	def String getOpcUaDevice_HtmlView_HeaderFileName(String objectName)
	def String getOpcUaDevice_HtmlView_SourceFileName(String objectName)
	
	def CharSequence compileOpcUaDevice_HtmlView_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	def CharSequence compileOpcUaDevice_HtmlView_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
}