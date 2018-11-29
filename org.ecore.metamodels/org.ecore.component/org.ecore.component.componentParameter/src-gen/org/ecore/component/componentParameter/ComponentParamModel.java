/**
 */
package org.ecore.component.componentParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.service.parameterDefinition.ParamDefRepoImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Param Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.ComponentParamModel#getParametrization <em>Parametrization</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ComponentParamModel#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParamModel()
 * @model
 * @generated
 */
public interface ComponentParamModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametrization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametrization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametrization</em>' containment reference.
	 * @see #setParametrization(ComponentParameter)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParamModel_Parametrization()
	 * @model containment="true"
	 * @generated
	 */
	ComponentParameter getParametrization();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ComponentParamModel#getParametrization <em>Parametrization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametrization</em>' containment reference.
	 * @see #getParametrization()
	 * @generated
	 */
	void setParametrization(ComponentParameter value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.parameterDefinition.ParamDefRepoImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParamModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamDefRepoImport> getImports();

} // ComponentParamModel
