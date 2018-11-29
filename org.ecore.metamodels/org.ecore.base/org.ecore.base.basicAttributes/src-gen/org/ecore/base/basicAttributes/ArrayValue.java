/**
 */
package org.ecore.base.basicAttributes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.ArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends AbstractValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getArrayValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleValue> getValues();

} // ArrayValue
