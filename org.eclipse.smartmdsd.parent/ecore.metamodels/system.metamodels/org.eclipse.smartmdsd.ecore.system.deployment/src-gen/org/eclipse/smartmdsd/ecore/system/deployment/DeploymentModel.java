/**
 */
package org.eclipse.smartmdsd.ecore.system.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getComponentArch <em>Component Arch</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getDeploymentModel()
 * @model
 * @generated
 */
public interface DeploymentModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getDeploymentModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getDeploymentModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDeploymentElement> getElements();

	/**
	 * Returns the value of the '<em><b>Component Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Arch</em>' reference.
	 * @see #setComponentArch(SystemComponentArchitecture)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getDeploymentModel_ComponentArch()
	 * @model
	 * @generated
	 */
	SystemComponentArchitecture getComponentArch();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getComponentArch <em>Component Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Arch</em>' reference.
	 * @see #getComponentArch()
	 * @generated
	 */
	void setComponentArch(SystemComponentArchitecture value);

} // DeploymentModel
