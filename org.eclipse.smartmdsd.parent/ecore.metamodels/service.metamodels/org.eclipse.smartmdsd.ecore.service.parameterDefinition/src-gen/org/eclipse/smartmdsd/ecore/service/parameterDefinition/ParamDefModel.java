/**
 */
package org.eclipse.smartmdsd.ecore.service.parameterDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Def Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParamDefModel()
 * @model
 * @generated
 */
public interface ParamDefModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(ParameterSetRepository)
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParamDefModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	ParameterSetRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ParameterSetRepository value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefRepoImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParamDefModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamDefRepoImport> getImports();

} // ParamDefModel
