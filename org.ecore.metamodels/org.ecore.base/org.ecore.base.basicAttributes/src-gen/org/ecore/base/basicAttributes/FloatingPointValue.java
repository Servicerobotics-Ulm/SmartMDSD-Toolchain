/**
 */
package org.ecore.base.basicAttributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Point Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.FloatingPointValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getFloatingPointValue()
 * @model
 * @generated
 */
public interface FloatingPointValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getFloatingPointValue_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.FloatingPointValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // FloatingPointValue
