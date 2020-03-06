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
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectModel
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
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
		Assertions.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}