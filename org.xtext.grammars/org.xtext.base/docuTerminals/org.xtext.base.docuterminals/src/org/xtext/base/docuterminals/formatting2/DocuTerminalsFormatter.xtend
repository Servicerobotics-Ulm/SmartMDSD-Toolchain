//===================================================================================
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
//===================================================================================
package org.xtext.base.docuterminals.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument

class DocuTerminalsFormatter extends AbstractFormatter2 {
	
	@Inject extension DocuTerminalsGrammarAccess
	
	override format(Object obj, IFormattableDocument document) {
	}
	
	// TODO: implement for 
}
