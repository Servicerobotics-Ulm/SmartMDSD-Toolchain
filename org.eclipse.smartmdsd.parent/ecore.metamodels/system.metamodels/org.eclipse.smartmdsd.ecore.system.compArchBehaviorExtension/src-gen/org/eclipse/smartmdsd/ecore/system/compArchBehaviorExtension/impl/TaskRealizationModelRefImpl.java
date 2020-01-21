/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Realization Model Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.TaskRealizationModelRefImpl#getTaskModelRef <em>Task Model Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRealizationModelRefImpl extends SystemExtensionImpl implements TaskRealizationModelRef {
	/**
	 * The cached value of the '{@link #getTaskModelRef() <em>Task Model Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskModelRef()
	 * @generated
	 * @ordered
	 */
	protected TaskRealizationModel taskModelRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRealizationModelRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompArchBehaviorExtensionPackage.Literals.TASK_REALIZATION_MODEL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRealizationModel getTaskModelRef() {
		if (taskModelRef != null && taskModelRef.eIsProxy()) {
			InternalEObject oldTaskModelRef = (InternalEObject) taskModelRef;
			taskModelRef = (TaskRealizationModel) eResolveProxy(oldTaskModelRef);
			if (taskModelRef != oldTaskModelRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF,
							oldTaskModelRef, taskModelRef));
			}
		}
		return taskModelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRealizationModel basicGetTaskModelRef() {
		return taskModelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskModelRef(TaskRealizationModel newTaskModelRef) {
		TaskRealizationModel oldTaskModelRef = taskModelRef;
		taskModelRef = newTaskModelRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF, oldTaskModelRef,
					taskModelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF:
			if (resolve)
				return getTaskModelRef();
			return basicGetTaskModelRef();
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
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF:
			setTaskModelRef((TaskRealizationModel) newValue);
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
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF:
			setTaskModelRef((TaskRealizationModel) null);
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
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF:
			return taskModelRef != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskRealizationModelRefImpl
