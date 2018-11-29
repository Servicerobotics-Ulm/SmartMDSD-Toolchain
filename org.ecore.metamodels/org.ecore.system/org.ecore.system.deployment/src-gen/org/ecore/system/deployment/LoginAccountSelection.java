/**
 */
package org.ecore.system.deployment;

import org.eclipse.emf.ecore.EObject;

import org.ecore.system.targetPlatform.LoginAccount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Account Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.LoginAccountSelection#getLogin <em>Login</em>}</li>
 *   <li>{@link org.ecore.system.deployment.LoginAccountSelection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.deployment.DeploymentPackage#getLoginAccountSelection()
 * @model
 * @generated
 */
public interface LoginAccountSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' reference.
	 * @see #setLogin(LoginAccount)
	 * @see org.ecore.system.deployment.DeploymentPackage#getLoginAccountSelection_Login()
	 * @model required="true"
	 * @generated
	 */
	LoginAccount getLogin();

	/**
	 * Sets the value of the '{@link org.ecore.system.deployment.LoginAccountSelection#getLogin <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' reference.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(LoginAccount value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.system.deployment.DeploymentPackage#getLoginAccountSelection_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.system.deployment.LoginAccountSelection#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // LoginAccountSelection
