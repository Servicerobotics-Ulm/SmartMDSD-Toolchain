/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.component.seronetExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Client Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaClientLink#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaClientLink()
 * @model
 * @generated
 */
public interface OpcUaClientLink extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(OpcUaDeviceClient)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaClientLink_Client()
	 * @model required="true"
	 * @generated
	 */
	OpcUaDeviceClient getClient();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaClientLink#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(OpcUaDeviceClient value);

} // OpcUaClientLink
