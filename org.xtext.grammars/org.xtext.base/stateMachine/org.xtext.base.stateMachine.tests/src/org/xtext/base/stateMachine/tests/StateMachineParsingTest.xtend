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
package org.xtext.base.stateMachine.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.base.stateMachine.StateMachine
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet

@RunWith(XtextRunner)
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
		Assert.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test def void testLifecycleLibraryContainsNoErrors() {
		val resourceSet = rsp.get
		lib.loadLib(resourceSet)
		resourceSet.resources.head.contents.head.assertNoErrors
	}
}
