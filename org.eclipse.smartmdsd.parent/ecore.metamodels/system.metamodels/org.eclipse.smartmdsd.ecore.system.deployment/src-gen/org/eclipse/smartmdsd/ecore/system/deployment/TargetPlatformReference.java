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
package org.eclipse.smartmdsd.ecore.system.deployment;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getLogin <em>Login</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference()
 * @model
 * @generated
 */
public interface TargetPlatformReference extends AbstractDeploymentElement {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference.
	 * @see #setPlatform(TargetPlatformDefinition)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference_Platform()
	 * @model required="true"
	 * @generated
	 */
	TargetPlatformDefinition getPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getPlatform <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(TargetPlatformDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' containment reference.
	 * @see #setDirectory(UploadDirectory)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference_Directory()
	 * @model containment="true"
	 * @generated
	 */
	UploadDirectory getDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getDirectory <em>Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' containment reference.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(UploadDirectory value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' containment reference.
	 * @see #setLogin(LoginAccountSelection)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference_Login()
	 * @model containment="true"
	 * @generated
	 */
	LoginAccountSelection getLogin();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getLogin <em>Login</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' containment reference.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(LoginAccountSelection value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' containment reference.
	 * @see #setHost(NetworkInterfaceSelection)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getTargetPlatformReference_Host()
	 * @model containment="true"
	 * @generated
	 */
	NetworkInterfaceSelection getHost();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getHost <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' containment reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(NetworkInterfaceSelection value);

} // TargetPlatformReference
