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
package org.eclipse.smartmdsd.ecore.service.serviceDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefModel()
 * @model
 * @generated
 */
public interface ServiceDefModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommRepoImport> getImports();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(ServiceDefRepository)
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	ServiceDefRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ServiceDefRepository value);

} // ServiceDefModel
