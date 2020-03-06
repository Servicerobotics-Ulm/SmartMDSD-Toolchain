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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getPortNr <em>Port Nr</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNamingService()
 * @model
 * @generated
 */
public interface NamingService extends AbstractDeploymentElement {
	/**
	 * Returns the value of the '<em><b>Port Nr</b></em>' attribute.
	 * The default value is <code>"20002"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Nr</em>' attribute.
	 * @see #setPortNr(int)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNamingService_PortNr()
	 * @model default="20002"
	 * @generated
	 */
	int getPortNr();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getPortNr <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Nr</em>' attribute.
	 * @see #getPortNr()
	 * @generated
	 */
	void setPortNr(int value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference.
	 * @see #setDeploy(Deployment)
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#getNamingService_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	Deployment getDeploy();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getDeploy <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' containment reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deployment value);

} // NamingService
