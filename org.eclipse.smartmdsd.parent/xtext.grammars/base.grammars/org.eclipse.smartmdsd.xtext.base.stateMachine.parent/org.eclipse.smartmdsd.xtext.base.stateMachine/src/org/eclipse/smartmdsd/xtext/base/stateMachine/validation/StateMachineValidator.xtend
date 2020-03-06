/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
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
