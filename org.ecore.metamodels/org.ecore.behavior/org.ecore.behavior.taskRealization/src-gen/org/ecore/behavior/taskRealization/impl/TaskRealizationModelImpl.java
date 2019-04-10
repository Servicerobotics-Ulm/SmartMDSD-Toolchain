/**
 */
package org.ecore.behavior.taskRealization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;
import org.ecore.behavior.taskRealization.TaskRealization;
import org.ecore.behavior.taskRealization.TaskRealizationModel;
import org.ecore.behavior.taskRealization.TaskRealizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl#getAbstCoordInst <em>Abst Coord Inst</em>}</li>
 *   <li>{@link org.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRealizationModelImpl extends MinimalEObjectImpl.Container implements TaskRealizationModel {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskRealization> tasks;

	/**
	 * The cached value of the '{@link #getAbstCoordInst() <em>Abst Coord Inst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstCoordInst()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCoordinationModuleInstance> abstCoordInst;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRealizationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskRealizationPackage.Literals.TASK_REALIZATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskRealization> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskRealization>(TaskRealization.class, this,
					TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCoordinationModuleInstance> getAbstCoordInst() {
		if (abstCoordInst == null) {
			abstCoordInst = new EObjectContainmentEList<AbstractCoordinationModuleInstance>(
					AbstractCoordinationModuleInstance.class, this,
					TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST);
		}
		return abstCoordInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskRealizationPackage.TASK_REALIZATION_MODEL__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST:
			return ((InternalEList<?>) getAbstCoordInst()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS:
			return getTasks();
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST:
			return getAbstCoordInst();
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends TaskRealization>) newValue);
			return;
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST:
			getAbstCoordInst().clear();
			getAbstCoordInst().addAll((Collection<? extends AbstractCoordinationModuleInstance>) newValue);
			return;
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__NAME:
			setName((String) newValue);
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
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS:
			getTasks().clear();
			return;
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST:
			getAbstCoordInst().clear();
			return;
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__NAME:
			setName(NAME_EDEFAULT);
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
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__TASKS:
			return tasks != null && !tasks.isEmpty();
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__ABST_COORD_INST:
			return abstCoordInst != null && !abstCoordInst.isEmpty();
		case TaskRealizationPackage.TASK_REALIZATION_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskRealizationModelImpl
