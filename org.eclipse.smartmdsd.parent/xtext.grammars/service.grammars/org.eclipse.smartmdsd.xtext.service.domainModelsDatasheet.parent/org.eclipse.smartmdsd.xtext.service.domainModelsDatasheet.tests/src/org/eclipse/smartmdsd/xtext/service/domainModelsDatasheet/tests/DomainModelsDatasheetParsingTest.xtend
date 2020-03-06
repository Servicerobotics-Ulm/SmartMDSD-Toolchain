/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
