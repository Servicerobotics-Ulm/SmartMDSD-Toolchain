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
package org.eclipse.smartmdsd.ecore.system.systemParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getComponentParam <em>Component Param</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getComponentParameterInstance()
 * @model
 * @generated
 */
public interface ComponentParameterInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getComponentParameterInstance_ComponentInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getComponentParameterInstance_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterRefinement> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getComponentParameterInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Component Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Param</em>' reference.
	 * @see #setComponentParam(ComponentParameter)
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getComponentParameterInstance_ComponentParam()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameter getComponentParam();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance#getComponentParam <em>Component Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Param</em>' reference.
	 * @see #getComponentParam()
	 * @generated
	 */
	void setComponentParam(ComponentParameter value);

} // ComponentParameterInstance
