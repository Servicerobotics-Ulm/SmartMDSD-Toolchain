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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParameter()
 * @model
 * @generated
 */
public interface ComponentParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractComponentParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParameter_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponentParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParameter_Component()
	 * @model
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentParameter
