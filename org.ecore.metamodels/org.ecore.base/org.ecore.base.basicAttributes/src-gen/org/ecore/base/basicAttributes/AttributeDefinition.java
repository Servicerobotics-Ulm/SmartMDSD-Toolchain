/**
 */
package org.ecore.base.basicAttributes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.AttributeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.base.basicAttributes.AttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue <em>Defaultvalue</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.AttributeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractAttributeType)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractAttributeType getType();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.AttributeDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractAttributeType value);

	/**
	 * Returns the value of the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaultvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #setDefaultvalue(AbstractValue)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Defaultvalue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractValue getDefaultvalue();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(AbstractValue value);

} // AttributeDefinition
