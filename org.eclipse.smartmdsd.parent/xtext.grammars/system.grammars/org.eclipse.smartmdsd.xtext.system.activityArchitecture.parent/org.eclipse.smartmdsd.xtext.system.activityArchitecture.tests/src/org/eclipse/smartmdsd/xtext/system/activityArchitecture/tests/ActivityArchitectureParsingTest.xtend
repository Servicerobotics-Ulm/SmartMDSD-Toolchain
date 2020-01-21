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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ActivityArchitectureInjectorProvider)
class ActivityArchitectureParsingTest {
	@Inject
	ParseHelper<ActivityArchitectureModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			ActivityArchitectureModel MyModel {
				ActivityNode Node1 {
					activationSource PeriodicTimer {
						periodicActFreq 1.0 Hz;
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
