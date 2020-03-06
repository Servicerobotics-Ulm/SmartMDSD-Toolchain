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

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Param Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getSystemParamModel()
 * @model
 * @generated
 */
public interface SystemParamModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getSystemParamModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentParameterInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(SystemComponentArchitecture)
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getSystemParamModel_System()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentArchitecture getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemComponentArchitecture value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getSystemParamModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SystemParamModel
