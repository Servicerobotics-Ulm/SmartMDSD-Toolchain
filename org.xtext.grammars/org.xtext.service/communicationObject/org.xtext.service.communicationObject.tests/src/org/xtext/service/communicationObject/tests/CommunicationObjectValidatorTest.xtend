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
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.EClass
import org.ecore.service.communicationObject.CommObjectModel
import org.ecore.service.communicationObject.CommunicationObjectPackage
import org.xtext.service.communicationObject.validation.CommunicationObjectValidator
import org.ecore.base.basicAttributes.BasicAttributesPackage
import org.xtext.base.basicAttributes.validation.BasicAttributesValidator

@RunWith(XtextRunner)
@InjectWith(CommunicationObjectInjectorProvider)
class CommunicationObjectValidatorTest {
	@Inject
	ParseHelper<CommObjectModel> parseHelper
	
	@Inject extension ValidationTestHelper
	
	private static val DEF_VAL = BasicAttributesPackage.eINSTANCE.abstractValue
	private static val COMM_OBJ = CommunicationObjectPackage.eINSTANCE.communicationObject
	private static val ATTR = BasicAttributesPackage.eINSTANCE.attributeDefinition
	
	def private testmodel(CharSequence attrBody)
	'''
		CommObjectsRepository MyRepo {
			CommObject MyCommObject1 { 
				attr: Int32
			}
			CommObject MyCommObject2 { 
				attr: Double
			}
			CommObject MyCommObject3 {
				attr: «attrBody»
			}
		}
	'''
	
	def private void assertIncompatibleTypes(CharSequence attrBody, 
		EClass c, String checkType) 
	{
		parseHelper.parse(attrBody.testmodel).assertError(c, checkType)
	}
	def private void assertCompatibleTypes(CharSequence attrBody) 
	{
		parseHelper.parse(attrBody.testmodel).assertNoErrors
	}
	
	@Test def void testObjectType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''MyCommObject1 = 100'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''MyCommObject1 = 100.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''MyCommObject1 = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''MyCommObject1 = MyCommObject2()'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''MyCommObject1 = MyCommObject1()'''.assertCompatibleTypes
	}
	
	@Test def void testStringType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''String = 100'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''String = 100.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''String = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''String = "Hello"'''.assertCompatibleTypes
		'''String[] = ["Hello", "World"]'''.assertCompatibleTypes
	}
	@Test def void testDoubleType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''Double = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Double = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Double = 100'''.assertCompatibleTypes
		'''Double = 1.0'''.assertCompatibleTypes
		'''Double[] = [1.0, .1]'''.assertCompatibleTypes
		'''Double = -1.0'''.assertCompatibleTypes
		'''Double = .0'''.assertCompatibleTypes
		'''Double = 1.0e-10'''.assertCompatibleTypes
	}
	@Test def void testInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''Int32 = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Int32 = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Int32 = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Int32 = 1'''.assertCompatibleTypes
		'''Int32[] = [1, -1]'''.assertCompatibleTypes
	}
	@Test def void testUInt32Type() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''UInt32 = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''UInt32 = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''UInt32 = true'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''UInt32 = -1'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''UInt32 = 1'''.assertCompatibleTypes
		'''UInt32[] = [1, 2, 3]'''.assertCompatibleTypes
	}
	@Test def void testBooleanType() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		'''Boolean = 1.0'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Boolean = "Hello"'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Boolean = 1'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Boolean = true'''.assertCompatibleTypes
		'''Boolean = false'''.assertCompatibleTypes
		'''Boolean[] = [false, true]'''.assertCompatibleTypes
	}
	
	@Test def void testArraySize() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_CARDINALITY
		'''Int32[1] = [1, 2]'''.assertIncompatibleTypes(DEF_VAL, checkType)
		'''Int32[2] = [1, 2]'''.assertCompatibleTypes
		'''Int32[3] = [1, 2]'''.assertCompatibleTypes
		'''Int32[*] = [1, 2]'''.assertCompatibleTypes
		'''Int32[] = [1, 2]'''.assertCompatibleTypes
	}
	
	@Test def void testCapitalCommElemName() {
		val checkType = CommunicationObjectValidator.CAPITAL_COMM_ELEM_NAME
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject MyCommObject1 { }
		}
		''').assertNoWarnings(COMM_OBJ, checkType)
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject myCommObject1 { }
		}
		''').assertWarning(COMM_OBJ, checkType)
	}

	@Test def void testCppKeywordCommElemName() {
		val checkType = CommunicationObjectValidator.CPP_KEYWORD_COMM_ELEM_NAME
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject class { }
		}
		''').assertError(COMM_OBJ, checkType)
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject return { }
		}
		''').assertError(COMM_OBJ, checkType)
	}
	
	@Test def void testCppKeywordAttributeName() {
		val checkType = CommunicationObjectValidator.CPP_KEYWORD_ATTR_NAME
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject Comm1 {
				class: String
			}
		}
		''').assertError(ATTR, checkType)
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			CommObject Comm1 { 
				this: Boolean
			}
		}
		''').assertError(ATTR, checkType)
	}
	
	@Test def void testEnumTypeConformance() {
		val checkType = BasicAttributesValidator.INCOMPATIBLE_TYPES
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			Enumeration MyEnum {
				ENUM1 ENUM2
			}
			CommObject Comm1 {
				en: MyEnum = 10
			}
		}
		''').assertError(DEF_VAL, checkType)
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			Enumeration MyEnum {
				ENUM1 ENUM2
			}
			Enumeration MyEnum2 {
				ENUM3 ENUM4
			}
			CommObject Comm1 {
				en: MyEnum = ENUM1
			}
		}
		''').assertNoErrors
	}
	
	@Test def void testForbiddenEnumName() {
		val checkType = CommunicationObjectValidator.RESERVED_ENUM_NAME
		parseHelper.parse(
		'''
		CommObjectsRepository MyRepo {
			Enumeration MyEnum {
				ENUM_VALUE_UNDEFINED
			}
		}
		''').assertError(BasicAttributesPackage.eINSTANCE.enumerationElement, checkType)
	}
}