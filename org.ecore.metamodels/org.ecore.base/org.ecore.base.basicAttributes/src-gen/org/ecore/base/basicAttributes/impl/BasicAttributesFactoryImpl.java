/**
 */
package org.ecore.base.basicAttributes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.base.basicAttributes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicAttributesFactoryImpl extends EFactoryImpl implements BasicAttributesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicAttributesFactory init() {
		try {
			BasicAttributesFactory theBasicAttributesFactory = (BasicAttributesFactory) EPackage.Registry.INSTANCE
					.getEFactory(BasicAttributesPackage.eNS_URI);
			if (theBasicAttributesFactory != null) {
				return theBasicAttributesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicAttributesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAttributesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION:
			return createAttributeDefinition();
		case BasicAttributesPackage.ATTRIBUTE_REFINEMENT:
			return createAttributeRefinement();
		case BasicAttributesPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case BasicAttributesPackage.SINGLE_VALUE:
			return createSingleValue();
		case BasicAttributesPackage.ARRAY_VALUE:
			return createArrayValue();
		case BasicAttributesPackage.ARRAY_TYPE:
			return createArrayType();
		case BasicAttributesPackage.FLOATING_POINT_VALUE:
			return createFloatingPointValue();
		case BasicAttributesPackage.INT_VALUE:
			return createIntValue();
		case BasicAttributesPackage.STRING_VALUE:
			return createStringValue();
		case BasicAttributesPackage.BOOL_VALUE:
			return createBoolValue();
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE:
			return createInlineEnumerationType();
		case BasicAttributesPackage.ENUMERATION_ELEMENT:
			return createEnumerationElement();
		case BasicAttributesPackage.ENUMERATION_VALUE:
			return createEnumerationValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BasicAttributesPackage.PRIMITIVE_TYPE_NAME:
			return createPRIMITIVE_TYPE_NAMEFromString(eDataType, initialValue);
		case BasicAttributesPackage.CARDINALITY:
			return createCardinalityFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BasicAttributesPackage.PRIMITIVE_TYPE_NAME:
			return convertPRIMITIVE_TYPE_NAMEToString(eDataType, instanceValue);
		case BasicAttributesPackage.CARDINALITY:
			return convertCardinalityToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRefinement createAttributeRefinement() {
		AttributeRefinementImpl attributeRefinement = new AttributeRefinementImpl();
		return attributeRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue createSingleValue() {
		SingleValueImpl singleValue = new SingleValueImpl();
		return singleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingPointValue createFloatingPointValue() {
		FloatingPointValueImpl floatingPointValue = new FloatingPointValueImpl();
		return floatingPointValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntValue createIntValue() {
		IntValueImpl intValue = new IntValueImpl();
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolValue createBoolValue() {
		BoolValueImpl boolValue = new BoolValueImpl();
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineEnumerationType createInlineEnumerationType() {
		InlineEnumerationTypeImpl inlineEnumerationType = new InlineEnumerationTypeImpl();
		return inlineEnumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationElement createEnumerationElement() {
		EnumerationElementImpl enumerationElement = new EnumerationElementImpl();
		return enumerationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValue createEnumerationValue() {
		EnumerationValueImpl enumerationValue = new EnumerationValueImpl();
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIMITIVE_TYPE_NAME createPRIMITIVE_TYPE_NAMEFromString(EDataType eDataType, String initialValue) {
		PRIMITIVE_TYPE_NAME result = PRIMITIVE_TYPE_NAME.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPRIMITIVE_TYPE_NAMEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCardinalityFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAttributesPackage getBasicAttributesPackage() {
		return (BasicAttributesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicAttributesPackage getPackage() {
		return BasicAttributesPackage.eINSTANCE;
	}

} //BasicAttributesFactoryImpl
