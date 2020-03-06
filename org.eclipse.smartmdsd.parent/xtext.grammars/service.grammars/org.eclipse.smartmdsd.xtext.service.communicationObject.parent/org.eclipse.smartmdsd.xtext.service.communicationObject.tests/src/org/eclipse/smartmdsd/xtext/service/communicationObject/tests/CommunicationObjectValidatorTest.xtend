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
package org.eclipse.smartmdsd.xtext.service.communicationObject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectModel
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(CommunicationObjectInjectorProvider)
class CommunicationObjectValidatorTest {
	@Inject
	ParseHelper<CommObjectModel> parseHelper
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			CommObjectsRepository MyRepo {
				CommObject MyCommObject {
					attr1: Int32
					attr2: Double
					attr3: String
				}
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty)
		// validation helper
		result.assertNoErrors
		
		val repo = result.repository
		Assertions.assertEquals("MyRepo", repo.name)
		val commObj = repo.elements.get(0)
		Assertions.assertEquals("MyCommObject", commObj.name)
		val attr1 = (commObj as CommunicationObject).attributes.get(0)
		Assertions.assertEquals("attr1", attr1.name)
		val attr1Type = (attr1.type as PrimitiveType).typeName
		Assertions.assertEquals("Int32", attr1Type.literal)
	}
}