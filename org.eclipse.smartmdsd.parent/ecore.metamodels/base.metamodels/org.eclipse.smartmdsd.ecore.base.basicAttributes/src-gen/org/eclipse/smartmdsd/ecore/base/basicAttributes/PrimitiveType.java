/**
 */
package org.eclipse.smartmdsd.ecore.base.basicAttributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends AbstractAttributeType {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
	 * @see #setTypeName(PRIMITIVE_TYPE_NAME)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getPrimitiveType_TypeName()
	 * @model required="true"
	 * @generated
	 */
	PRIMITIVE_TYPE_NAME getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(PRIMITIVE_TYPE_NAME value);

} // PrimitiveType
