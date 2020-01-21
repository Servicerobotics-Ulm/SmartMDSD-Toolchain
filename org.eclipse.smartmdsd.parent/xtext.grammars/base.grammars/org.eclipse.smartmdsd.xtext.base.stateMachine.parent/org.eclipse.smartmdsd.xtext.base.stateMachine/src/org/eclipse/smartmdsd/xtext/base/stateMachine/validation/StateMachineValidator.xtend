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
package org.eclipse.smartmdsd.xtext.base.stateMachine.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StateMachineValidator extends AbstractStateMachineValidator {
	
	static val ISSUE = "org.eclipse.smartmdsd.xtext.base.stateMachine"
	static val STATE_UPPER = ISSUE+'MainStateUpper'

	@Check
	def checkCapitalState(org.eclipse.smartmdsd.ecore.base.stateMachine.State state) {
		if(Character.isLowerCase(state.name.charAt(0))) {
			warning("State should start with a capital letter.",
				StateMachinePackage.Literals.ABSTRACT_STATE_ELEMENT__NAME,
				STATE_UPPER
			)
		}
	}
	
}
