//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.component.componentParameter.tests

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
import org.ecore.component.componentParameter.ComponentParamModel
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.ecore.component.componentParameter.InternalParameter
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.base.basicAttributes.BasicAttributesPackage

@RunWith(XtextRunner)
@InjectWith(ComponentParameterInjectorProvider)
class ComponentParameterScopeProviderTest {
	@Inject	ParseHelper<ComponentParamModel> parseHelper
	@Inject extension ComponentParameterResourceHelper
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider
	
	def private parse(CharSequence model) {
		val parameterDefinitionTestModel = 
		'''
		ParameterSetRepository MyRepo {
			ParameterSet MyParamSet {
				Parameter MyParam {
					en: InlineEnumeration {EN1 EN2} = EN1
					s: String = "Text"
					i: Int32 = 0
					d: Double = 0
					b: Boolean = true
				}
				Trigger MyTrigger {
					attr: String
				}
			}
		}
		'''
		val resourceSet = parameterDefinitionTestModel.parameterResourceSet
		return parseHelper.parse(model, resourceSet)
	}
	
	@Test def void testEnumScope() {
		val result = '''
		ComponentParameter MyComponentParameters {
			InternalParameter MyParam {
				en: InlineEnumeration {EN1 EN2} = EN1
			}
		}
		'''.parse
		result.assertNoErrors
		val param = result.parametrization.parameters.head
		val attr = (param as InternalParameter).attributes.head
		attr.defaultvalue.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "EN1, EN2")
	}
	
	@Test def void testParamSetInstanceScope() {
		val result = '''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet {
			}
		}
		'''.parse
		result.assertNoErrors
		val param = result.parametrization.parameters.head
		val set = (param as ParameterSetInstance)
		set.assertScope(ComponentParameterPackage.eINSTANCE.parameterSetInstance_ParamSet, "MyRepo.MyParamSet")
	}
	
	@Test def void testParamInstanceScope() {
		val result = '''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet {
				ParameterInstance MyParam {  }
				TriggerInstance MyTrigger active
			}
		}
		'''.parse
		result.assertNoErrors
		val paramSet = result.parametrization.parameters.head
		val param = (paramSet as ParameterSetInstance).parameterInstances.head
		param.assertScope(ComponentParameterPackage.eINSTANCE.parameterInstance_ParameterDef, "MyParam")
		val trigger = (paramSet as ParameterSetInstance).parameterInstances.last
		trigger.assertScope(ComponentParameterPackage.eINSTANCE.triggerInstance_TriggerDef, "MyTrigger")
	}
	
	@Test def void testAttributeRefinementScope() {
		val result = '''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet {
				ParameterInstance MyParam {  
					s = "Text"
				}
			}
		}
		'''.parse
		result.assertNoErrors
		val paramSet = result.parametrization.parameters.head
		val param = (paramSet as ParameterSetInstance).parameterInstances.head
		val attr = (param as ParameterInstance).attributes.head
		attr.assertScope(BasicAttributesPackage.eINSTANCE.attributeRefinement_Attribute, "en, s, i, d, b")
	}
	
	@Test def void testEnumRefinementScope() {
		val result = '''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet {
				ParameterInstance MyParam {  
					en = EN1
				}
			}
		}
		'''.parse
		result.assertNoErrors
		val paramSet = result.parametrization.parameters.head
		val param = (paramSet as ParameterSetInstance).parameterInstances.head
		val attr = (param as ParameterInstance).attributes.head
		attr.value.assertScope(BasicAttributesPackage.eINSTANCE.enumerationValue_Value, "EN1, EN2")
	}
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		Assert.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}