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

import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Handler Configuration Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getInputHandlerConfigurationMapping()
 * @model
 * @generated
 */
public interface InputHandlerConfigurationMapping extends ComponentInstanceConfigurationElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getInputHandlerConfigurationMapping_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' reference.
	 * @see #setHandler(InputHandler)
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getInputHandlerConfigurationMapping_Handler()
	 * @model required="true"
	 * @generated
	 */
	InputHandler getHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getHandler <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(InputHandler value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' reference.
	 * @see #setConfig(InputHandlerNode)
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#getInputHandlerConfigurationMapping_Config()
	 * @model required="true"
	 * @generated
	 */
	InputHandlerNode getConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(InputHandlerNode value);

} // InputHandlerConfigurationMapping
