/**
 */
package org.ecore.base.basicAttributes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.base.basicAttributes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage
 * @generated
 */
public class BasicAttributesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicAttributesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAttributesSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicAttributesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION: {
			AttributeDefinition attributeDefinition = (AttributeDefinition) theEObject;
			T result = caseAttributeDefinition(attributeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ATTRIBUTE_REFINEMENT: {
			AttributeRefinement attributeRefinement = (AttributeRefinement) theEObject;
			T result = caseAttributeRefinement(attributeRefinement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE: {
			AbstractAttributeType abstractAttributeType = (AbstractAttributeType) theEObject;
			T result = caseAbstractAttributeType(abstractAttributeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ABSTRACT_VALUE: {
			AbstractValue abstractValue = (AbstractValue) theEObject;
			T result = caseAbstractValue(abstractValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseAbstractAttributeType(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.SINGLE_VALUE: {
			SingleValue singleValue = (SingleValue) theEObject;
			T result = caseSingleValue(singleValue);
			if (result == null)
				result = caseAbstractValue(singleValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ARRAY_VALUE: {
			ArrayValue arrayValue = (ArrayValue) theEObject;
			T result = caseArrayValue(arrayValue);
			if (result == null)
				result = caseAbstractValue(arrayValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ARRAY_TYPE: {
			ArrayType arrayType = (ArrayType) theEObject;
			T result = caseArrayType(arrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.FLOATING_POINT_VALUE: {
			FloatingPointValue floatingPointValue = (FloatingPointValue) theEObject;
			T result = caseFloatingPointValue(floatingPointValue);
			if (result == null)
				result = caseSingleValue(floatingPointValue);
			if (result == null)
				result = caseAbstractValue(floatingPointValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.INT_VALUE: {
			IntValue intValue = (IntValue) theEObject;
			T result = caseIntValue(intValue);
			if (result == null)
				result = caseSingleValue(intValue);
			if (result == null)
				result = caseAbstractValue(intValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.STRING_VALUE: {
			StringValue stringValue = (StringValue) theEObject;
			T result = caseStringValue(stringValue);
			if (result == null)
				result = caseSingleValue(stringValue);
			if (result == null)
				result = caseAbstractValue(stringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.BOOL_VALUE: {
			BoolValue boolValue = (BoolValue) theEObject;
			T result = caseBoolValue(boolValue);
			if (result == null)
				result = caseSingleValue(boolValue);
			if (result == null)
				result = caseAbstractValue(boolValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE: {
			InlineEnumerationType inlineEnumerationType = (InlineEnumerationType) theEObject;
			T result = caseInlineEnumerationType(inlineEnumerationType);
			if (result == null)
				result = caseAbstractAttributeType(inlineEnumerationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ENUMERATION_ELEMENT: {
			EnumerationElement enumerationElement = (EnumerationElement) theEObject;
			T result = caseEnumerationElement(enumerationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BasicAttributesPackage.ENUMERATION_VALUE: {
			EnumerationValue enumerationValue = (EnumerationValue) theEObject;
			T result = caseEnumerationValue(enumerationValue);
			if (result == null)
				result = caseSingleValue(enumerationValue);
			if (result == null)
				result = caseAbstractValue(enumerationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinition(AttributeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRefinement(AttributeRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAttributeType(AbstractAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractValue(AbstractValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValue(SingleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Point Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Point Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingPointValue(FloatingPointValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntValue(IntValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolValue(BoolValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineEnumerationType(InlineEnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationElement(EnumerationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValue(EnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BasicAttributesSwitch
