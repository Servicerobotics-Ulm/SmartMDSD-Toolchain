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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

@ExtendWith(InjectionExtension)
@InjectWith(ParameterDefinitionInjectorProvider)
class ParameterDefinitionScopeProviderTest {
	@Inject
	ParseHelper<ParamDefModel> parseHelper
	
	@Inject extension IScopeProvider
	
	@Test def void testScopeProviderForInlineEnumerationValues() {
		val result = parseHelper.parse(
			'''
			ParameterSetRepository MyRepo {
				ParameterSet MyParamSet {
					Parameter MyParam {
						en: InlineEnumeration {EN1 EN2} = EN1
					}
				}
			}
			''')
		val param = result.repository?.sets.last.parameters.head
		val enumAttr = (param as ParameterDefinition).attributes.head
		enumAttr.defaultvalue.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "EN1, EN2")
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		Assertions.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}