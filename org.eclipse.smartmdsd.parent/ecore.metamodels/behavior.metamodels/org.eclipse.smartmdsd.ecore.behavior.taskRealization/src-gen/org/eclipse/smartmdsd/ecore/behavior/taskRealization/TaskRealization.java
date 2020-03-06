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
package org.eclipse.smartmdsd.ecore.behavior.taskRealization;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization#getTaskDef <em>Task Def</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealization()
 * @model
 * @generated
 */
public interface TaskRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Def</em>' reference.
	 * @see #setTaskDef(TaskDefinition)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealization_TaskDef()
	 * @model required="true"
	 * @generated
	 */
	TaskDefinition getTaskDef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization#getTaskDef <em>Task Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Def</em>' reference.
	 * @see #getTaskDef()
	 * @generated
	 */
	void setTaskDef(TaskDefinition value);

} // TaskRealization
