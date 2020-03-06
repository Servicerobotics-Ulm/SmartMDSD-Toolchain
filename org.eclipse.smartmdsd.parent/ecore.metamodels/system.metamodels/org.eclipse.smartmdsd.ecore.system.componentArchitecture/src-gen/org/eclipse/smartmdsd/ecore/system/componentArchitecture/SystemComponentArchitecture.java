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
package org.eclipse.smartmdsd.ecore.system.componentArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Component Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getActivityArch <em>Activity Arch</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture()
 * @model
 * @generated
 */
public interface SystemComponentArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemExtension> getExtensions();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Activity Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Arch</em>' reference.
	 * @see #setActivityArch(ActivityArchitectureModel)
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getSystemComponentArchitecture_ActivityArch()
	 * @model
	 * @generated
	 */
	ActivityArchitectureModel getActivityArch();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getActivityArch <em>Activity Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Arch</em>' reference.
	 * @see #getActivityArch()
	 * @generated
	 */
	void setActivityArch(ActivityArchitectureModel value);

} // SystemComponentArchitecture
