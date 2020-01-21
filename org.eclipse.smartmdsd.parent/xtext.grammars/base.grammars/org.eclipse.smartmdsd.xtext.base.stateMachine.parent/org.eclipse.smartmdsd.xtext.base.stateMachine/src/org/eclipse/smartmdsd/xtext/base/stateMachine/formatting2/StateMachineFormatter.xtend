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
package org.eclipse.smartmdsd.xtext.base.stateMachine.formatting2

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class StateMachineFormatter extends AbstractFormatter2 {
	
//	@Inject extension StateMachineGrammarAccess

	def dispatch void format(StateMachine stateMachine, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractMachineElement : stateMachine.elements) {
			abstractMachineElement.format
		}
	}
	
	// TODO: implement for 
}
