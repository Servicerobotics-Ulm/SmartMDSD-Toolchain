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
package org.eclipse.smartmdsd.xtext.component.componentParameter.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

@ExtendWith(InjectionExtension)
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
		Assertions.assertEquals(expected.toString,
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}