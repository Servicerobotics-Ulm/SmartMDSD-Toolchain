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
package org.eclipse.smartmdsd.ecore.service.parameterDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetRepository#getSets <em>Sets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetRepository()
 * @model
 * @generated
 */
public interface ParameterSetRepository extends AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetRepository_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterSetDefinition> getSets();

} // ParameterSetRepository
