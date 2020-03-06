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
package org.eclipse.smartmdsd.xtext.component.componentParameter.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ComponentParameterInjectorProvider)
class ComponentParameterParsingTest {
	@Inject
	ParseHelper<ComponentParamModel> parseHelper
	
	@Inject extension ComponentParameterResourceHelper
	
	@Test
	def void loadModel() {
		val componentTestModel = "ComponentDefinition MyComponent {  }"
		val resourceSet = componentTestModel.componentResourceSet
		val result = parseHelper.parse(
		'''
		ComponentParameter MyComponentParameters component MyComponent {
			InternalParameter P1 {
				attr: String = ""
			}
			ExtendedParameter P2 {
				attr: Int32 = 0
			}
			ExtendedTrigger T1 active {
				attr: Double = 0
			}
		}
		''', resourceSet)
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
