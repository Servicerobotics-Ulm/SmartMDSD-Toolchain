/**
 */
package org.ecore.behavior.taskDefinition.impl;

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

import org.ecore.base.basicAttributes.AttributeDefinition;

import org.ecore.behavior.taskDefinition.TaskDefinition;
import org.ecore.behavior.taskDefinition.TaskDefinitionPackage;
import org.ecore.behavior.taskDefinition.TaskResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl#getOutAttribute <em>Out Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDefinitionImpl extends MinimalEObjectImpl.Container implements TaskDefinition {
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
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskResult> results;

	/**
	 * The cached value of the '{@link #getInAttribute() <em>In Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> inAttribute;

	/**
	 * The cached value of the '{@link #getOutAttribute() <em>Out Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> outAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDefinitionPackage.Literals.TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDefinitionPackage.TASK_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<TaskResult>(TaskResult.class, this,
					TaskDefinitionPackage.TASK_DEFINITION__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getInAttribute() {
		if (inAttribute == null) {
			inAttribute = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this,
					TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE);
		}
		return inAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getOutAttribute() {
		if (outAttribute == null) {
			outAttribute = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this,
					TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE);
		}
		return outAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaskDefinitionPackage.TASK_DEFINITION__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
		case TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE:
			return ((InternalEList<?>) getInAttribute()).basicRemove(otherEnd, msgs);
		case TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE:
			return ((InternalEList<?>) getOutAttribute()).basicRemove(otherEnd, msgs);
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
		case TaskDefinitionPackage.TASK_DEFINITION__NAME:
			return getName();
		case TaskDefinitionPackage.TASK_DEFINITION__RESULTS:
			return getResults();
		case TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE:
			return getInAttribute();
		case TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE:
			return getOutAttribute();
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
		case TaskDefinitionPackage.TASK_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends TaskResult>) newValue);
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE:
			getInAttribute().clear();
			getInAttribute().addAll((Collection<? extends AttributeDefinition>) newValue);
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE:
			getOutAttribute().clear();
			getOutAttribute().addAll((Collection<? extends AttributeDefinition>) newValue);
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
		case TaskDefinitionPackage.TASK_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__RESULTS:
			getResults().clear();
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE:
			getInAttribute().clear();
			return;
		case TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE:
			getOutAttribute().clear();
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
		case TaskDefinitionPackage.TASK_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TaskDefinitionPackage.TASK_DEFINITION__RESULTS:
			return results != null && !results.isEmpty();
		case TaskDefinitionPackage.TASK_DEFINITION__IN_ATTRIBUTE:
			return inAttribute != null && !inAttribute.isEmpty();
		case TaskDefinitionPackage.TASK_DEFINITION__OUT_ATTRIBUTE:
			return outAttribute != null && !outAttribute.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskDefinitionImpl
