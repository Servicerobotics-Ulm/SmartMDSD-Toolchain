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
