/**
 */
package org.eclipse.smartmdsd.ecore.system.deployment;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interface Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNetworkInterfaceSelection()
 * @model
 * @generated
 */
public interface NetworkInterfaceSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(NetworkInterface)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNetworkInterfaceSelection_Network()
	 * @model required="true"
	 * @generated
	 */
	NetworkInterface getNetwork();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(NetworkInterface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNetworkInterfaceSelection_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // NetworkInterfaceSelection
