/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.targetPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getFullname <em>Fullname</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getLoginAccount()
 * @model
 * @generated
 */
public interface LoginAccount extends AbstractTPSubNode {
	/**
	 * Returns the value of the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullname</em>' attribute.
	 * @see #setFullname(String)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getLoginAccount_Fullname()
	 * @model
	 * @generated
	 */
	String getFullname();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getFullname <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullname</em>' attribute.
	 * @see #getFullname()
	 * @generated
	 */
	void setFullname(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getLoginAccount_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getLoginAccount_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LoginAccount
