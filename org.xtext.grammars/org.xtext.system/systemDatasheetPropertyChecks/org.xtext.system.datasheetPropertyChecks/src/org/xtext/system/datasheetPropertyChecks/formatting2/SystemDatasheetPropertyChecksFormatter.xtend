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
package org.xtext.system.datasheetPropertyChecks.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess

class SystemDatasheetPropertyChecksFormatter extends AbstractFormatter2 {
	
	@Inject extension SystemDatasheetPropertyChecksGrammarAccess

	def dispatch void format(SystemDatasheetPropertyChecksModel systemDatasheetPropertyChecksModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (datasheetPropertyCheck : systemDatasheetPropertyChecksModel.checks) {
			datasheetPropertyCheck.format
		}
	}
	
	// TODO: implement for 
}
