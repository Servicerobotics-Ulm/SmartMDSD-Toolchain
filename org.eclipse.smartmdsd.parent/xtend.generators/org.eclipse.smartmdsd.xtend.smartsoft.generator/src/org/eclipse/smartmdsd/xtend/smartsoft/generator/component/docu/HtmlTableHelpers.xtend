//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================
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