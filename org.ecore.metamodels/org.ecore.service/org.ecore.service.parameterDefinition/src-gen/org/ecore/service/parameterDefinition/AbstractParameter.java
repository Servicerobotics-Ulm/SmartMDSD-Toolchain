/**
 */
package org.ecore.service.parameterDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.parameterDefinition.AbstractParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.parameterDefinition.AbstractParameter#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getAbstractParameter()
 * @model abstract="true"
 * @generated
 */
public interface AbstractParameter extends EObject {
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
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getAbstractParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.parameterDefinition.AbstractParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getAbstractParameter_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributes();

} // AbstractParameter
