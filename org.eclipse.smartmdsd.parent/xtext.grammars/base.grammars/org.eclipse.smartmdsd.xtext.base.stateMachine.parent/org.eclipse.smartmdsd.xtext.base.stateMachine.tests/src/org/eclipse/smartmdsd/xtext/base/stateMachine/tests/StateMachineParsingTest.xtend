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
