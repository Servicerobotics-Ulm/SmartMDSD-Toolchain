/**
 */
package org.eclipse.smartmdsd.ecore.system.deployment;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getComponentArtefact()
 * @model
 * @generated
 */
public interface ComponentArtefact extends AbstractDeploymentElement {
	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference.
	 * @see #setDeploy(Deployment)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getComponentArtefact_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	Deployment getDeploy();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getDeploy <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' containment reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deployment value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentInstance)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getComponentArtefact_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getComponentArtefact_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // ComponentArtefact
