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
package org.xtext.component.componentParameter.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.component.componentParameter.ComponentParamModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(ComponentParameterInjectorProvider)
class ComponentParameterParsingTest {
	
	@Inject	ParseHelper<ComponentParamModel> parseHelper
	@Inject extension ComponentParameterResourceHelper
	@Inject extension ValidationTestHelper
	
	@Test
	def void parseModel() {
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
		Assert.assertNotNull(result)
		result.assertNoErrors
	}
}
