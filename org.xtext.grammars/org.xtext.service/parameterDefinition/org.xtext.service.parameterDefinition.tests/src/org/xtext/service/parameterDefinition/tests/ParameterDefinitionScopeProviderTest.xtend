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
package org.xtext.service.parameterDefinition.tests

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
import org.ecore.service.parameterDefinition.ParamDefModel
import org.ecore.service.parameterDefinition.ParameterSetDefinition
import org.ecore.service.parameterDefinition.ParameterDefinition
import org.ecore.base.basicAttributes.BasicAttributesPackage

@RunWith(XtextRunner)
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
		val param = (result.repository?.sets.last as ParameterSetDefinition).parameters.head
		val enumAttr = (param as ParameterDefinition).attributes.head
		enumAttr.defaultvalue.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "EN1, EN2")
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		Assert.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}