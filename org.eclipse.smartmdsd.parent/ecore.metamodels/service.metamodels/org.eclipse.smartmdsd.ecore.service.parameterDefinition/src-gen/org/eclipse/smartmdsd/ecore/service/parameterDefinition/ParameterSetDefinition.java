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
 * A representation of the model object '<em><b>Parameter Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition()
 * @model
 * @generated
 */
public interface ParameterSetDefinition extends AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.AbstractParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage#getParameterSetDefinition_Extends()
	 * @model
	 * @generated
	 */
	EList<ParameterSetDefinition> getExtends();

} // ParameterSetDefinition
