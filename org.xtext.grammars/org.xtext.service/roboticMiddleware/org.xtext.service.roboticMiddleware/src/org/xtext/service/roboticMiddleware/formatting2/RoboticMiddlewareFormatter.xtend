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
package org.xtext.service.roboticMiddleware.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument

class RoboticMiddlewareFormatter extends AbstractFormatter2 {
	
	@Inject extension RoboticMiddlewareGrammarAccess
	
	override format(Object obj, IFormattableDocument document) {
		
	}
	
	// TODO: implement for 
}
