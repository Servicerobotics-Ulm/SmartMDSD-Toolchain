/**
 */
package org.ecore.base.basicAttributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.EnumerationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EnumerationElement)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getEnumerationValue_Value()
	 * @model required="true"
	 * @generated
	 */
	EnumerationElement getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.EnumerationValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumerationElement value);

} // EnumerationValue
