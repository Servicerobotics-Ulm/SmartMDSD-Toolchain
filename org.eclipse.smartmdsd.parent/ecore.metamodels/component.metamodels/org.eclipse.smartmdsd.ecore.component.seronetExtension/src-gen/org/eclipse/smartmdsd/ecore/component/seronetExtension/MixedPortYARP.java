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

import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortYARPBase;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Port YARP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortYARP#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortYARP()
 * @model
 * @generated
 */
public interface MixedPortYARP extends DerivedComponentElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(MixedPortYARPBase)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortYARP_Port()
	 * @model required="true"
	 * @generated
	 */
	MixedPortYARPBase getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortYARP#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(MixedPortYARPBase value);

} // MixedPortYARP
