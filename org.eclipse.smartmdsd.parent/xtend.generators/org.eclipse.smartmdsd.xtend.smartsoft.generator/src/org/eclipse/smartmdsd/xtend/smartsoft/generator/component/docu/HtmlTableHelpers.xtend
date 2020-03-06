/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component.docu

class HtmlTableHelpers {
	def getTableBegin() 
		'''<table style="border-collapse:collapse;">'''
	def getTableEnd() 
		'''</table>'''
	def getAsTableCaption(String text)
		'''<caption><i>Table:</i> «text»</caption>'''
	def getTableHeaderBegin() 
		'''<tr style="background-color:#ccc;">'''
	def getTableHeaderEnd() 
		'''</tr>'''
	def getAsTableHeaderCell(String text) 
		'''<th style="border:1px solid black; padding: 5px;"><i>«text»</i></th>'''
	def getAsTableCell(String text) 
		'''<td style="border:1px solid black; padding: 5px;">«text»</td>'''
	def getEmptyTableCell() 
		'''<td style="border:1px solid black; padding: 5px;"></td>''' 
}