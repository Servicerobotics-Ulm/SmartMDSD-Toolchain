/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Realization Model Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef <em>Task Model Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getTaskRealizationModelRef()
 * @model
 * @generated
 */
public interface TaskRealizationModelRef extends SystemExtension {
	/**
	 * Returns the value of the '<em><b>Task Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Model Ref</em>' reference.
	 * @see #setTaskModelRef(TaskRealizationModel)
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getTaskRealizationModelRef_TaskModelRef()
	 * @model
	 * @generated
	 */
	TaskRealizationModel getTaskModelRef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef <em>Task Model Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Model Ref</em>' reference.
	 * @see #getTaskModelRef()
	 * @generated
	 */
	void setTaskModelRef(TaskRealizationModel value);

} // TaskRealizationModelRef
