/**
 */
package org.ecore.base.basicAttributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.IntValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getIntValue()
 * @model
 * @generated
 */
public interface IntValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getIntValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.IntValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntValue
