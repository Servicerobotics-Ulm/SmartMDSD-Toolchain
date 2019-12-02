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
package org.xtext.system.systemDatasheet.formatting2

import com.google.inject.Inject
import org.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.systemDatasheet.SystemDatasheet

class SystemDatasheetFormatter extends GenericDatasheetFormatter {
	
	@Inject extension SystemDatasheetGrammarAccess
	
	def dispatch void format(SystemDatasheet systemDatasheet, extension IFormattableDocument document) {
		val ropen = systemDatasheet.regionFor.keyword("{")
		val rclose = systemDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
