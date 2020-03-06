/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz
 ********************************************************************************/
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
