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

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getTargetMiddleware()
 * @model
 * @generated
 */
public interface TargetMiddleware extends AbstractTPSubNode {
	/**
	 * Returns the value of the '<em><b>Middleware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware</em>' containment reference.
	 * @see #setMiddleware(RoboticMiddleware)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getTargetMiddleware_Middleware()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoboticMiddleware getMiddleware();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware#getMiddleware <em>Middleware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware</em>' containment reference.
	 * @see #getMiddleware()
	 * @generated
	 */
	void setMiddleware(RoboticMiddleware value);

} // TargetMiddleware
