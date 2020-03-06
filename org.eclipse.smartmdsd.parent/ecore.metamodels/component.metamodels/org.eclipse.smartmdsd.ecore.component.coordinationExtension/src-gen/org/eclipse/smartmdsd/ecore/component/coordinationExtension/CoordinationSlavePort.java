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

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Slave Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort()
 * @model
 * @generated
 */
public interface CoordinationSlavePort extends NamedComponentElement, AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.AbstractCoordinationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCoordinationElement> getElements();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(CoordinationServiceDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort_Service()
	 * @model required="true"
	 * @generated
	 */
	CoordinationServiceDefinition getService();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CoordinationServiceDefinition value);

} // CoordinationSlavePort
