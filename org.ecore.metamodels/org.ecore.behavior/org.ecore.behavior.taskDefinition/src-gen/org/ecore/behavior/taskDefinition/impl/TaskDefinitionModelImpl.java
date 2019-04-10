/**
 */
package org.ecore.behavior.taskDefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.behavior.taskDefinition.TaskDefinitionModel;
import org.ecore.behavior.taskDefinition.TaskDefinitionPackage;
import org.ecore.behavior.taskDefinition.TaskDefinitionRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskDefinitionModelImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDefinitionModelImpl extends MinimalEObjectImpl.Container implements TaskDefinitionModel {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected TaskDefinitionRepository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDefinitionPackage.Literals.TASK_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionRepository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(TaskDefinitionRepository newRepository, NotificationChain msgs) {
		TaskDefinitionRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY, oldRepository, newRepository);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(TaskDefinitionRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY:
			return basicSetRepository(null, msgs);
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
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY:
			return getRepository();
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
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY:
			setRepository((TaskDefinitionRepository) newValue);
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
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY:
			setRepository((TaskDefinitionRepository) null);
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
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL__REPOSITORY:
			return repository != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskDefinitionModelImpl
