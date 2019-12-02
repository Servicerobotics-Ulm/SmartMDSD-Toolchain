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
package org.xtext.base.stateMachine.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.base.stateMachine.AbstractMachineElement
import org.ecore.base.stateMachine.StateMachine
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess

class StateMachineFormatter extends AbstractFormatter2 {
	
	@Inject extension StateMachineGrammarAccess

	def dispatch void format(StateMachine stateMachine, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (AbstractMachineElement abstractMachineElement : stateMachine.getElements()) {
			abstractMachineElement.format;
		}
	}

	// TODO: implement for State
}
