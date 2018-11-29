//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.component.componentDefinition.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.ecore.component.componentDefinition.ComponentDefModel
import org.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.xtext.component.componentDefinition.validation.ComponentDefinitionValidator
import org.ecore.component.performanceExtension.PerformanceExtensionPackage
import org.ecore.base.stateMachine.StateMachinePackage
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage

@RunWith(XtextRunner)
@InjectWith(ComponentDefinitionInjectorProvider)
class ComponentDefinitionValidatorTest {
	@Inject extension ParseHelper<ComponentDefModel>
	@Inject extension ValidationTestHelper
	
//	@Test def void testDuplicateOperationModeBinding() {
//		'''
//		ComponentDefinition MyComponent {
//			Activity MyTask {
//				OperationModeBinding s1
//				OperationModeBinding s2
//			}
//			StateAutomaton MyAutomaton { 
//				SubState s1
//				SubState s2
//				CustomMainState M1 { subStates s1, s2 }
//			}
//		}
//		'''.parse.assertError(
//			CoordinationExtensionPackage.eINSTANCE.operationModeBinding,
//			ComponentDefinitionValidator.DUPLICATE_OPERATION_MODE_BINDING
//		)
//	}
//	
//	@Test def void testSubStateNotUsedByAnyMainState() {
//		'''
//		ComponentDefinition MyComponent {
//			StateAutomaton MyAutomaton {
//				SubState s1;
//				SubState s2;
//			}
//		}
//		'''.parse.assertWarning(
//			CoordinationExtensionPackage.eINSTANCE.privateOperationMode,
//			ComponentDefinitionValidator.NOT_USED_PRIVATE_OPERATION_MODE
//		)
//	}
//	
//	@Test def void testSubStateSmallFirstLetter() {
//		'''
//		ComponentDefinition MyComponent {
//			StateAutomaton MyAutomaton {
//				SubState S1;
//			}
//		}
//		'''.parse.assertWarning(
//			StateMachinePackage.eINSTANCE.subState,
//			ComponentDefinitionValidator.SUB_STATE_NAME
//		)
//	}
	
	def private activityTestModel(CharSequence body)
	'''
		ComponentDefinition MyComponent {
			Activity MyTask {
				«body»
			}
		}
	'''
	
	@Test def void testDuplicateActivationConstraints() {
		'''
		ActivationConstraints { configurable = true }
		ActivationConstraints { configurable = false }
		'''.activityTestModel.parse.assertError(
			PerformanceExtensionPackage.eINSTANCE.activationConstraints,
			ComponentDefinitionValidator.DUPLICATE_ACTIVATION_CONSTRAINTS
		)
	}
	
	@Test def void testValidActivationConstraints() {
		'''
		ActivationConstraints {
			configurable = true
			minActFreq = 10.0 Hz
			maxActFreq = 10.0 Hz
		}
		'''.activityTestModel.parse.assertNoErrors
	}
	
	@Test def void testInvalidActivationConstraints() {
		'''
		ActivationConstraints {
			configurable = true
			minActFreq = 20.0 Hz
			maxActFreq = 10.0 Hz
		}
		'''.activityTestModel.parse.assertWarning(
			PerformanceExtensionPackage.eINSTANCE.activationConstraints,
			ComponentDefinitionValidator.ACTIVATION_FREQUENCY_CONSTRAINT
		)
	}
	
	@Test def void testInvalidDefaultPeriodicTimer1() {
		'''
		ActivationConstraints {
			configurable = true
			minActFreq = 10.0 Hz
			maxActFreq = 20.0 Hz
		}
		DefaultTrigger PeriodicTimer 9.9 Hz;
		'''.activityTestModel.parse.assertWarning(
			PerformanceExtensionPackage.eINSTANCE.defaultPeriodicTimer,
			ComponentDefinitionValidator.DEFAULT_TIMED_TRIGGER_MIN_FREQUENCY
		)
	}
	
	@Test def void testInvalidDefaultPeriodicTimer2() {
		'''
		ActivationConstraints {
			configurable = true
			minActFreq = 10.0 Hz
			maxActFreq = 20.0 Hz
		}
		DefaultTrigger PeriodicTimer 20.1 Hz;
		'''.activityTestModel.parse.assertWarning(
			PerformanceExtensionPackage.eINSTANCE.defaultPeriodicTimer,
			ComponentDefinitionValidator.DEFAULT_TIMED_TRIGGER_MAX_FREQUENCY
		)
	}
	
	
	@Test def void testValidDefaultPeriodicTimer() {
		'''
		ActivationConstraints {
			configurable = true
			minActFreq = 10.0 Hz
			maxActFreq = 20.0 Hz
		}
		DefaultTrigger PeriodicTimer 10.0 Hz;
		'''.activityTestModel.parse.assertNoErrors
	}
	
	@Test def void testActivityObservationHierarchyCycle() {
		'''
		ComponentDefinition MyRepo {
			Activity T1 { Observe T3 }
			Activity T2 { Observe T1 }
			Activity T3 { Observe T2 }
		}
		'''.parse => [
			assertHierarchyCycle("T1")
			assertHierarchyCycle("T2")
			assertHierarchyCycle("T3")
		]
	}
	
	@Test def void testActivityObservationSelfCycle() {
		'''
		ComponentDefinition MyRepo {
			Activity T1 { Observe T1 }
		}
		'''.parse => [
			assertError(
				ComponentDefinitionPackage.eINSTANCE.componentSubNodeObserver,
				ComponentDefinitionValidator.ACTIVITY_OBSERVATION_CYLE
			)
		]
	}
	
	@Test def void testNoHierarchyCycle() {
		'''
		ComponentDefinition MyRepo {
			Activity T1 { }
			Activity T2 { Observe T1 }
			Activity T3 { Observe T2 }
		}
		'''.parse.assertNoErrors
	}
	
	def private void assertHierarchyCycle(ComponentDefModel component, String expectedClassName) {
		component.assertError(
			ComponentDefinitionPackage.eINSTANCE.componentSubNodeObserver,
			ComponentDefinitionValidator.ACTIVITY_OBSERVATION_CYLE,
			"Cycle in ActivityObservation of observed Activity "+expectedClassName+"."
		)
	}
}