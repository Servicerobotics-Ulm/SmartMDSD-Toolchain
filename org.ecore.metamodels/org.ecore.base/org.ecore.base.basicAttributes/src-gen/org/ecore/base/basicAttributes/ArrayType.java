/**
 */
package org.ecore.base.basicAttributes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.ArrayType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getArrayType_Length()
	 * @model dataType="org.ecore.base.basicAttributes.Cardinality"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.ArrayType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

} // ArrayType
