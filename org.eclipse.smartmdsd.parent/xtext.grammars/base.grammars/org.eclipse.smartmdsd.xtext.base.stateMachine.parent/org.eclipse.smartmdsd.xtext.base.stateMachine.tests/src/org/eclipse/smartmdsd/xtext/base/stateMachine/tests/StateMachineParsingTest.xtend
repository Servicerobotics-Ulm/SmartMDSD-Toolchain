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
package org.eclipse.smartmdsd.xtext.base.stateMachine.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.smartmdsd.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@ExtendWith(InjectionExtension)
@InjectWith(StateMachineInjectorProvider)
class StateMachineParsingTest {
	@Inject
	ParseHelper<StateMachine> parseHelper
	
	@Inject extension ValidationTestHelper
	
	@Inject StateMachineDefaultLifecycleLib lib
	@Inject Provider<ResourceSet> rsp
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			StateMachine MyStateMachine {
				State Init;
				private StateTransition Init -> Alive;
				State Alive;
				public StateTransition Alive -> Shutdown;
				State Shutdown;
			}
		''')
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test def void testLifecycleLibraryContainsNoErrors() {
		val resourceSet = rsp.get
		lib.loadLib(resourceSet)
		resourceSet.resources.head.contents.head.assertNoErrors
	}
}
