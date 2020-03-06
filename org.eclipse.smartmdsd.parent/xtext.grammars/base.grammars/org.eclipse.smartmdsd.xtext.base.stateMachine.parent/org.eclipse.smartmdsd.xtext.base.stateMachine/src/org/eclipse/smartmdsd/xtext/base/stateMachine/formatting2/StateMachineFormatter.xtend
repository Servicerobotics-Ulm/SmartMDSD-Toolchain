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
