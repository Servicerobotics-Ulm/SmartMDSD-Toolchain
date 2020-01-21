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
package org.eclipse.smartmdsd.xtext.system.systemDatasheet.formatting2

import org.eclipse.smartmdsd.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet
import org.eclipse.xtext.formatting2.IFormattableDocument

class SystemDatasheetFormatter extends GenericDatasheetFormatter {
	
//	@Inject extension SystemDatasheetGrammarAccess
	
	def dispatch void format(SystemDatasheet systemDatasheet, extension IFormattableDocument document) {
		val ropen = systemDatasheet.regionFor.keyword("{")
		val rclose = systemDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
