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
package org.xtext.base.basicAttributes.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.base.basicAttributes.AttributeDefinition
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.emf.ecore.EClass
import org.xtext.base.basicAttributes.validation.BasicAttributesValidator

@RunWith(XtextRunner)
@InjectWith(BasicAttributesInjectorProvider)
class BasicAttributesParsingTest {
	@Inject
	ParseHelper<AttributeDefinition> parseHelper
	@Inject extension ValidationTestHelper
	
	private static val DEF_VAL = BasicAttributesPackage.eINSTANCE.abstractValue
	private static val ATTR = BasicAttributesPackage.eINSTANCE.attributeDefinition
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			attr1: Int32 = 0
		''')
		Assert.assertNotNull(result)
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
