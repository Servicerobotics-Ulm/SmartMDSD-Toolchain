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
package org.eclipse.smartmdsd.xtext.service.componentMode.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ComponentModeInjectorProvider)
class ComponentModeParsingTest {
	@Inject
	ParseHelper<ComponentModeModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
		ComponentModeRepository MyRepo {
			ComponentModeCollection MyCollection {
				ComponentModeDefinition MyMode1;
				ComponentModeDefinition MyMode2;
			}
		}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty)
	}
}
