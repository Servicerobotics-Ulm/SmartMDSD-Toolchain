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
package org.xtext.service.communicationObject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.service.communicationObject.CommObjectModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.base.basicAttributes.PrimitiveType

@RunWith(XtextRunner)
@InjectWith(CommunicationObjectInjectorProvider)
class CommunicationObjectParsingTest {
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
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		// validation helper
		result.assertNoErrors
		
		val repo = result.repository
		Assert.assertEquals("MyRepo", repo.name)
		val commObj = repo.elements.get(0)
		Assert.assertEquals("MyCommObject", commObj.name)
		val attr1 = (commObj as CommunicationObject).attributes.get(0)
		Assert.assertEquals("attr1", attr1.name)
		val attr1Type = (attr1.type as PrimitiveType).typeName
		Assert.assertEquals("Int32", attr1Type.literal)
	}
}
