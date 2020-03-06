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
package org.eclipse.smartmdsd.ecore.component.componentParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getInternalParameter()
 * @model
 * @generated
 */
public interface InternalParameter extends AbstractComponentParameter, ComponentParameterBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getInternalParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getInternalParameter_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributes();

} // InternalParameter
