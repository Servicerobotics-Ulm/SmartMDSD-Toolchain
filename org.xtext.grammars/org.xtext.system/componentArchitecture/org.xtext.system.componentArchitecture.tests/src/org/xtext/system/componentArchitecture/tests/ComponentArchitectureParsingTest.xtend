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
package org.xtext.system.componentArchitecture.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.ecore.system.componentArchitecture.SystemComponentArchitecture

@RunWith(XtextRunner)
@InjectWith(ComponentArchitectureInjectorProvider)
class ComponentArchitectureParsingTest {
	@Inject
	ParseHelper<SystemComponentArchitecture> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			SystemComponentArchitecture MyName {  }
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
