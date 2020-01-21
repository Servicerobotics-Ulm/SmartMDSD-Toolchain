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
package org.eclipse.smartmdsd.xtext.base.basicAttributes.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.smartmdsd.xtext.base.basicAttributes.validation.BasicAttributesValidator
import org.eclipse.emf.ecore.EClass

@ExtendWith(InjectionExtension)
@InjectWith(BasicAttributesInjectorProvider)
class BasicAttributesParsingTest {
	@Inject
	ParseHelper<AttributeDefinition> parseHelper
	
	@Inject extension ValidationTestHelper
	
	static val DEF_VAL = BasicAttributesPackage.eINSTANCE.abstractValue
	static val ATTR = BasicAttributesPackage.eINSTANCE.attributeDefinition
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			attr1: Int32 = 0
		''')
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	
	def private void assertIncompatibleTypes(CharSequence attrBody, 
		EClass c, String checkType) 
	{
		parseHelper.parse(attrBody).assertError(c, checkType)
	}
	def private void assertCompatibleTypes(CharSequence attrBody) 
	{
		parseHelper.parse(attrBody).assertNoErrors
	}
	
	@Test def void testStringType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''attr: String = 100'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: String = 100.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: String = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: String = "Hello"'''.assertCompatibleTypes
		'''attr: String[] = ["Hello", "World"]'''.assertCompatibleTypes
	}
	@Test def void testDoubleType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''attr: Double = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Double = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Double = 100'''.assertCompatibleTypes
		'''attr: Double = 1.0'''.assertCompatibleTypes
		'''attr: Double[] = [1.0, .1]'''.assertCompatibleTypes
		'''attr: Double = -1.0'''.assertCompatibleTypes
		'''attr: Double = .0'''.assertCompatibleTypes
		'''attr: Double = 1.0e-10'''.assertCompatibleTypes
	}
	@Test def void testUInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''attr: UInt32 = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: UInt32 = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: UInt32 = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: UInt32 = -1'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: UInt32 = 1'''.assertCompatibleTypes
		'''attr: UInt32[] = [1, 2, 3]'''.assertCompatibleTypes
	}
	@Test def void testInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''attr: Int64 = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Int64 = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Int64 = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Int64 = 1'''.assertCompatibleTypes
		'''attr: Int64[] = [1, -1]'''.assertCompatibleTypes
	}
	@Test def void testBooleanType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''attr: Boolean = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Boolean = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Boolean = 1'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Boolean = true'''.assertCompatibleTypes
		'''attr: Boolean = false'''.assertCompatibleTypes
		'''attr: Boolean[] = [false, true]'''.assertCompatibleTypes
	}
	
	@Test def void testArraySize() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_CARDINALITY
		'''attr: Int32[1] = [1, 2]'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''attr: Int32[2] = [1, 2]'''.assertCompatibleTypes
		'''attr: Int32[3] = [1, 2]'''.assertCompatibleTypes
		'''attr: Int32[*] = [1, 2]'''.assertCompatibleTypes
		'''attr: Int32[] = [1, 2]'''.assertCompatibleTypes
	}
	
	@Test def void testSmallAttributeName() {
		val checkType = BasicAttributesValidator.SMALL_ATTR_NAME
		parseHelper.parse(
		'''
		attr: String
		''').assertNoWarnings(ATTR, checkType)
		parseHelper.parse(
		'''
		Attr: String
		''').assertWarning(ATTR, checkType)
	}
	
	@Test def void testCppKeywordAttributeName() {
		val checkType = BasicAttributesValidator.CPP_KEYWORD_ATTR_NAME
		parseHelper.parse(
		'''
		class: String
		''').assertError(ATTR, checkType)
		parseHelper.parse(
		'''
		this: Boolean
		''').assertError(ATTR, checkType)
	}
}
