/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.base.basicAttributes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesFactory
 * @model kind="package"
 * @generated
 */
public interface BasicAttributesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicAttributes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/base/basicAttributes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicAttributes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicAttributesPackage eINSTANCE = org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAttributeDefinition()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__NAME = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__TYPE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DEFAULTVALUE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeRefinementImpl <em>Attribute Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeRefinementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAttributeRefinement()
	 * @generated
	 */
	int ATTRIBUTE_REFINEMENT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT__VALUE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT__ATTRIBUTE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Attribute Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFINEMENT_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl <em>Abstract Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAbstractAttributeType()
	 * @generated
	 */
	int ABSTRACT_ATTRIBUTE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_TYPE__ARRAY = 0;

	/**
	 * The number of structural features of the '<em>Abstract Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAbstractValue()
	 * @generated
	 */
	int ABSTRACT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.PrimitiveTypeImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ARRAY = ABSTRACT_ATTRIBUTE_TYPE__ARRAY;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_NAME = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = ABSTRACT_ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.SingleValueImpl <em>Single Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.SingleValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getSingleValue()
	 * @generated
	 */
	int SINGLE_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_OPERATION_COUNT = ABSTRACT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUES = ABSTRACT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = ABSTRACT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayTypeImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.FloatingPointValueImpl <em>Floating Point Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.FloatingPointValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getFloatingPointValue()
	 * @generated
	 */
	int FLOATING_POINT_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating Point Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Floating Point Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.IntValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.StringValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BoolValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.InlineEnumerationTypeImpl <em>Inline Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.InlineEnumerationTypeImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getInlineEnumerationType()
	 * @generated
	 */
	int INLINE_ENUMERATION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ENUMERATION_TYPE__ARRAY = ABSTRACT_ATTRIBUTE_TYPE__ARRAY;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ENUMERATION_TYPE__ENUMS = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ENUMERATION_TYPE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inline Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ENUMERATION_TYPE_OPERATION_COUNT = ABSTRACT_ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getEnumerationElement()
	 * @generated
	 */
	int ENUMERATION_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationValueImpl
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getEnumerationValue()
	 * @generated
	 */
	int ENUMERATION_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__VALUE = SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_FEATURE_COUNT = SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_OPERATION_COUNT = SINGLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME <em>PRIMITIVE TYPE NAME</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getPRIMITIVE_TYPE_NAME()
	 * @generated
	 */
	int PRIMITIVE_TYPE_NAME = 15;

	/**
	 * The meta object id for the '<em>Cardinality</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 16;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
	 * @generated
	 */
	EClass getAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getName()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getType()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EReference getAttributeDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultvalue</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EReference getAttributeDefinition_Defaultvalue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement <em>Attribute Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Refinement</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
	 * @generated
	 */
	EClass getAttributeRefinement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getValue()
	 * @see #getAttributeRefinement()
	 * @generated
	 */
	EReference getAttributeRefinement_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getAttribute()
	 * @see #getAttributeRefinement()
	 * @generated
	 */
	EReference getAttributeRefinement_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType <em>Abstract Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Attribute Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
	 * @generated
	 */
	EClass getAbstractAttributeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType#getArray()
	 * @see #getAbstractAttributeType()
	 * @generated
	 */
	EReference getAbstractAttributeType_Array();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue <em>Abstract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
	 * @generated
	 */
	EClass getAbstractValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType#getTypeName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypeName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue
	 * @generated
	 */
	EClass getSingleValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue#getValues()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayType#getLength()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Length();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue <em>Floating Point Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Point Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue
	 * @generated
	 */
	EClass getFloatingPointValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue#getValue()
	 * @see #getFloatingPointValue()
	 * @generated
	 */
	EAttribute getFloatingPointValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue#isValue()
	 * @see #getBoolValue()
	 * @generated
	 */
	EAttribute getBoolValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType <em>Inline Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Enumeration Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
	 * @generated
	 */
	EClass getInlineEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType#getEnums()
	 * @see #getInlineEnumerationType()
	 * @generated
	 */
	EReference getInlineEnumerationType_Enums();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement
	 * @generated
	 */
	EClass getEnumerationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement#getName()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement#getValue()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue
	 * @generated
	 */
	EClass getEnumerationValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue#getValue()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EReference getEnumerationValue_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME <em>PRIMITIVE TYPE NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PRIMITIVE TYPE NAME</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
	 * @generated
	 */
	EEnum getPRIMITIVE_TYPE_NAME();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicAttributesFactory getBasicAttributesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAttributeDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__NAME = eINSTANCE.getAttributeDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getAttributeDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION__DEFAULTVALUE = eINSTANCE.getAttributeDefinition_Defaultvalue();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeRefinementImpl <em>Attribute Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeRefinementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAttributeRefinement()
		 * @generated
		 */
		EClass ATTRIBUTE_REFINEMENT = eINSTANCE.getAttributeRefinement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFINEMENT__VALUE = eINSTANCE.getAttributeRefinement_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFINEMENT__ATTRIBUTE = eINSTANCE.getAttributeRefinement_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl <em>Abstract Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAbstractAttributeType()
		 * @generated
		 */
		EClass ABSTRACT_ATTRIBUTE_TYPE = eINSTANCE.getAbstractAttributeType();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ATTRIBUTE_TYPE__ARRAY = eINSTANCE.getAbstractAttributeType_Array();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getAbstractValue()
		 * @generated
		 */
		EClass ABSTRACT_VALUE = eINSTANCE.getAbstractValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.PrimitiveTypeImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE_NAME = eINSTANCE.getPrimitiveType_TypeName();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.SingleValueImpl <em>Single Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.SingleValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getSingleValue()
		 * @generated
		 */
		EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayTypeImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__LENGTH = eINSTANCE.getArrayType_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.FloatingPointValueImpl <em>Floating Point Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.FloatingPointValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getFloatingPointValue()
		 * @generated
		 */
		EClass FLOATING_POINT_VALUE = eINSTANCE.getFloatingPointValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_POINT_VALUE__VALUE = eINSTANCE.getFloatingPointValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.IntValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.StringValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BoolValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.InlineEnumerationTypeImpl <em>Inline Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.InlineEnumerationTypeImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getInlineEnumerationType()
		 * @generated
		 */
		EClass INLINE_ENUMERATION_TYPE = eINSTANCE.getInlineEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ENUMERATION_TYPE__ENUMS = eINSTANCE.getInlineEnumerationType_Enums();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getEnumerationElement()
		 * @generated
		 */
		EClass ENUMERATION_ELEMENT = eINSTANCE.getEnumerationElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_ELEMENT__NAME = eINSTANCE.getEnumerationElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_ELEMENT__VALUE = eINSTANCE.getEnumerationElement_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.EnumerationValueImpl
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getEnumerationValue()
		 * @generated
		 */
		EClass ENUMERATION_VALUE = eINSTANCE.getEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE__VALUE = eINSTANCE.getEnumerationValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME <em>PRIMITIVE TYPE NAME</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getPRIMITIVE_TYPE_NAME()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_NAME = eINSTANCE.getPRIMITIVE_TYPE_NAME();

		/**
		 * The meta object literal for the '<em>Cardinality</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.BasicAttributesPackageImpl#getCardinality()
		 * @generated
		 */
		EDataType CARDINALITY = eINSTANCE.getCardinality();

	}

} //BasicAttributesPackage
