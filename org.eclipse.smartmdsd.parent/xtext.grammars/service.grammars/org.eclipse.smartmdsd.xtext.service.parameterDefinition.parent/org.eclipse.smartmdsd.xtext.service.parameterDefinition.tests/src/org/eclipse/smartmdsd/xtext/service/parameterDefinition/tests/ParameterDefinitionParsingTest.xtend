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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ParameterDefinitionInjectorProvider)
class ParameterDefinitionParsingTest {
	@Inject
	ParseHelper<ParamDefModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse(
		'''
		ParameterSetRepository MyRepo {
			ParameterSet MyParameterSet {
				Trigger MyTrigger {
					attr: String
				}
				Parameter MyParameter {
					attr: Int32
				}
			}
		}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
