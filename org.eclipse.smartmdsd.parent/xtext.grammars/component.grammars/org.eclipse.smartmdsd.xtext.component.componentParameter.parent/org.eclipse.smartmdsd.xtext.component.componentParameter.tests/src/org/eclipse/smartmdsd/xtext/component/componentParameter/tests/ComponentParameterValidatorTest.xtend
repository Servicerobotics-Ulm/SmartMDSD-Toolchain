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
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.smartmdsd.xtext.component.componentParameter.validation.ComponentParameterValidator
import org.eclipse.smartmdsd.xtext.base.basicAttributes.validation.BasicAttributesValidator

@ExtendWith(InjectionExtension)
@InjectWith(ComponentParameterInjectorProvider)
class ComponentParameterValidatorTest {
	@Inject	ParseHelper<ComponentParamModel> parseHelper
	@Inject extension ComponentParameterResourceHelper
	@Inject extension ValidationTestHelper
	
	
	static val DEF_VAL = BasicAttributesPackage.eINSTANCE.abstractValue
	
	
	def private parse(CharSequence model) {
		val parameterDefinitionTestModel = 
		'''
		ParameterSetRepository MyRepo {
			ParameterSet MyParamSet {
				Parameter MyParam {
					en: InlineEnumeration {EN1 EN2} = EN1
					s: String = "Text"
					ui: UInt32 = 0
					i: Int32 = 0
					iArr: Int32[1] = [0]
					d: Double = 0
					b: Boolean = true
				}
			}
		}
		'''
		val resourceSet = parameterDefinitionTestModel.parameterResourceSet
		return parseHelper.parse(model, resourceSet)
	}
	
	
	def private attributeTestModel(CharSequence attrBody)
	'''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet {
				ParameterInstance MyParam {
					«attrBody»
				}
			}
		}
	'''
	
	def private void assertAttributeIncompatibleTypes(CharSequence attrBody, 
		EClass c, String checkType) 
	{
		attrBody.attributeTestModel.parse.assertError(c, checkType)
	}
	def private void assertAttributeCompatibleTypes(CharSequence attrBody) 
	{
		attrBody.attributeTestModel.parse.assertNoErrors
	}
	
	@Test def void testStringType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''s = 100'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''s = 100.0'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''s = true'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''s = "Hello"'''.assertAttributeCompatibleTypes
	}
	@Test def void testDoubleType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''d = "Hello"'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''d = true'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''d = 100'''.assertAttributeCompatibleTypes
		'''d = 1.0'''.assertAttributeCompatibleTypes
		'''d = -1.0'''.assertAttributeCompatibleTypes
		'''d = .0'''.assertAttributeCompatibleTypes
		'''d = 1.0e-10'''.assertAttributeCompatibleTypes
	}
	@Test def void testInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''i = 1.0'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''i = "Hello"'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''i = true'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''i = 1'''.assertAttributeCompatibleTypes
	}
	@Test def void testUInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''ui = 1.0'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''ui = "Hello"'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''ui = true'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''ui = -1'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''ui = 1'''.assertAttributeCompatibleTypes
	}
	@Test def void testBooleanType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''b = 1.0'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''b = "Hello"'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''b = 1'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''b = true'''.assertAttributeCompatibleTypes
		'''b = false'''.assertAttributeCompatibleTypes
	}
	
	@Test def void testArraySize() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_CARDINALITY
		'''iArr = [1, 2]'''.assertAttributeIncompatibleTypes(DEF_VAL, checkType)
		'''iArr = [1]'''.assertAttributeCompatibleTypes
	}
	
	@Test def void testAllAttributesRefined() {
		val inst = ComponentParameterPackage.eINSTANCE.parameterInstance
		'''i = 0'''.attributeTestModel.parse.assertWarning(inst, ComponentParameterValidator.MISSING_ATTRIBUTE_REFINEMENTS)
		'''
		en = EN1
		s = "Text"
		ui = 0
		i = 0
		iArr = [0]
		d = 0
		b = true
		'''.attributeTestModel.parse.assertNoWarnings(inst, ComponentParameterValidator.MISSING_ATTRIBUTE_REFINEMENTS)
	}
	
	@Test def void testSingleParamSetInstance() {
		val parameterDefinitionTestModel = 
		'''
		ParameterSetRepository MyRepo {
			ParameterSet MyParamSet1 {}
			ParameterSet MyParamSet2 {}
		}
		'''
		val resourceSet = parameterDefinitionTestModel.parameterResourceSet
		val result = parseHelper.parse('''
		ComponentParameter MyComponentParameters {
			ParameterSetInstance MyRepo.MyParamSet1 { }
			ParameterSetInstance MyRepo.MyParamSet2 { }
		}
		''', resourceSet)
		val inst = ComponentParameterPackage.eINSTANCE.parameterSetInstance
		result.assertError(inst, ComponentParameterValidator.SINGLE_PARAM_SET_INSTANCE)
	}
}