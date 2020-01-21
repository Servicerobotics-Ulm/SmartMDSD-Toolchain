//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.eclipse.smartmdsd.xtext.service.domainModelsDatasheet.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DomainModelsDatasheetInjectorProvider)
class DomainModelsDatasheetParsingTest {
	@Inject
	ParseHelper<DomainModelsDatasheet> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			DomainModelsDatasheet MyDatasheet {
				DatasheetProperty Supplier {
					value "Servicerobotics Ulm"
				}
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
