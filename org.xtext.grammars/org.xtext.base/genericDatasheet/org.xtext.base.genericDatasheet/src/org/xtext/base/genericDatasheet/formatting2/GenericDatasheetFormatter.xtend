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
package org.xtext.base.genericDatasheet.formatting2

import com.google.inject.Inject
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess
import org.ecore.base.genericDatasheet.DatasheetProperty
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2

class GenericDatasheetFormatter extends AbstractFormatter2 {
	
	@Inject extension GenericDatasheetGrammarAccess
	
	def dispatch void format(DatasheetProperty property, extension IFormattableDocument document) {
		val ropen = property.regionFor.keyword("{")
		val rclose = property.regionFor.keyword("}")
		//ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
