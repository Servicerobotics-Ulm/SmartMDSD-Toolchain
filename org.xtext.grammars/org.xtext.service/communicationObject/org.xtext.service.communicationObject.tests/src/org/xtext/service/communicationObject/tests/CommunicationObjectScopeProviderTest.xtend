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
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.junit.Assert
import org.ecore.service.communicationObject.CommObjectModel
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.base.basicAttributes.BasicAttributesPackage

@RunWith(XtextRunner)
@InjectWith(CommunicationObjectInjectorProvider)
class CommunicationObjectScopeProviderTest {
	@Inject
	ParseHelper<CommObjectModel> parseHelper
	
	@Inject extension IScopeProvider
	
	@Test def void testScopeProviderForEnumValues() {
		val result = parseHelper.parse(
			'''
			CommObjectsRepository MyRepo {
				Enumeration MyEnum {
					ENUM1 ENUM2
				}
				Enumeration MyEnum2 {
					ENUM3 ENUM4
				}
				CommObject MyCommObject1 {
					en: MyEnum = ENUM1
				}
			}
			''')
		val enumAttr = (result.repository?.elements.last as CommunicationObject).attributes.head
		enumAttr.defaultvalue.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "ENUM1, ENUM2")
	}
	
	@Test def void testScopeProviderForInlineEnumerationValues() {
		val result = parseHelper.parse(
			'''
			CommObjectsRepository MyRepo {
				CommObject MyCommObject1 {
					en: InlineEnumeration {EN1 EN2} = EN1
				}
			}
			''')
		val enumAttr = (result.repository?.elements.last as CommunicationObject).attributes.head
		enumAttr.defaultvalue.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "EN1, EN2")
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		Assert.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}