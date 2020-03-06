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
package org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationImpl#getTaskDef <em>Task Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRealizationImpl extends MinimalEObjectImpl.Container implements TaskRealization {
	/**
	 * The cached value of the '{@link #getTaskDef() <em>Task Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDef()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinition taskDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskRealizationPackage.Literals.TASK_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinition getTaskDef() {
		if (taskDef != null && taskDef.eIsProxy()) {
			InternalEObject oldTaskDef = (InternalEObject) taskDef;
			taskDef = (TaskDefinition) eResolveProxy(oldTaskDef);
			if (taskDef != oldTaskDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaskRealizationPackage.TASK_REALIZATION__TASK_DEF, oldTaskDef, taskDef));
			}
		}
		return taskDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinition basicGetTaskDef() {
		return taskDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskDef(TaskDefinition newTaskDef) {
		TaskDefinition oldTaskDef = taskDef;
		taskDef = newTaskDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskRealizationPackage.TASK_REALIZATION__TASK_DEF,
					oldTaskDef, taskDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION__TASK_DEF:
			if (resolve)
				return getTaskDef();
			return basicGetTaskDef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION__TASK_DEF:
			setTaskDef((TaskDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION__TASK_DEF:
			setTaskDef((TaskDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION__TASK_DEF:
			return taskDef != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskRealizationImpl
