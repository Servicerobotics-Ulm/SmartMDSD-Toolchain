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