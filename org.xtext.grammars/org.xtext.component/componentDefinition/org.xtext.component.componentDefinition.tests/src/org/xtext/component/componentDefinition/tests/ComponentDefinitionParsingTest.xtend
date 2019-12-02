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
package org.xtext.component.componentDefinition.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.component.componentDefinition.ComponentDefModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(ComponentDefinitionInjectorProvider)
class ComponentDefinitionParsingTest {
	@Inject
	ParseHelper<ComponentDefModel> parseHelper
	@Inject extension ValidationTestHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse(
		'''
		ComponentDefinition	MyComponent {
			Activity MyTask {
				ActivationConstraints {
					configurable = true
					maxActFreq = 10.0 Hz
				}
				DefaultTrigger PeriodicTimer 10.0 Hz;
			}
		}
		''')
		Assert.assertNotNull(result)
		result.assertNoErrors
	}
}
