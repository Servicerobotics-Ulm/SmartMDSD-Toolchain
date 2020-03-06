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
package org.eclipse.smartmdsd.ecore.component.coordinationExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Master Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationMasterPort#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationMasterPort()
 * @model
 * @generated
 */
public interface CoordinationMasterPort extends NamedComponentElement {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(CoordinationServiceDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationMasterPort_Service()
	 * @model required="true"
	 * @generated
	 */
	CoordinationServiceDefinition getService();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationMasterPort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CoordinationServiceDefinition value);

} // CoordinationMasterPort
