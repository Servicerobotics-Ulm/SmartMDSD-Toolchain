/**
 */
package org.ecore.service.parameterDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition()
 * @model
 * @generated
 */
public interface ParameterSetDefinition extends EObject {
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
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.parameterDefinition.AbstractParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.ecore.service.parameterDefinition.ParameterSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Extends()
	 * @model
	 * @generated
	 */
	EList<ParameterSetDefinition> getExtends();

} // ParameterSetDefinition
