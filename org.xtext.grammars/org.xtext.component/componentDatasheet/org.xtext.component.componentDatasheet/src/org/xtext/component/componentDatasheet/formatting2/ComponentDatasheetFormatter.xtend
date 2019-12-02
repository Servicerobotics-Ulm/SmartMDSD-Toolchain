//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.xtext.component.componentDatasheet.formatting2

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.component.componentDatasheet.ComponentDatasheet
import org.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.ecore.component.componentDatasheet.ComponentPortDatasheet

class ComponentDatasheetFormatter extends GenericDatasheetFormatter {
	
//	@Inject extension ComponentDatasheetGrammarAccess

	def dispatch void format(ComponentDatasheet componentDatasheet, extension IFormattableDocument document) {
		val ropen = componentDatasheet.regionFor.keyword("{")
		val rclose = componentDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
		
		for(element: componentDatasheet.elements) {
			element.format
		}
	}
	
	def dispatch void format(ComponentPortDatasheet componentPortDatasheet, extension IFormattableDocument document) {
		val ropen = componentPortDatasheet.regionFor.keyword("{")
		val rclose = componentPortDatasheet.regionFor.keyword("}")
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
