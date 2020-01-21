//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.eclipse.smartmdsd.xtext.service.domainModelsDatasheet.formatting2

import org.eclipse.smartmdsd.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheet
import org.eclipse.xtext.formatting2.IFormattableDocument

class DomainModelsDatasheetFormatter extends GenericDatasheetFormatter {
	
//	@Inject extension DomainModelsDatasheetGrammarAccess
	
	def dispatch void format(DomainModelsDatasheet domainModelsDatasheet, extension IFormattableDocument document) {
		val ropen = domainModelsDatasheet.regionFor.keyword("{")
		val rclose = domainModelsDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
