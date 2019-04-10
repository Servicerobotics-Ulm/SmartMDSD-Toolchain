/**
 */
package org.ecore.behavior.taskDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.behavior.taskDefinition.TASK_RESULT_TYPES;
import org.ecore.behavior.taskDefinition.TaskDefinitionPackage;
import org.ecore.behavior.taskDefinition.TaskResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskResultImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.ecore.behavior.taskDefinition.impl.TaskResultImpl#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskResultImpl extends MinimalEObjectImpl.Container implements TaskResult {
	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final TASK_RESULT_TYPES RESULT_EDEFAULT = TASK_RESULT_TYPES.SUCCESS;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected TASK_RESULT_TYPES result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected String resultValue = RESULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDefinitionPackage.Literals.TASK_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TASK_RESULT_TYPES getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(TASK_RESULT_TYPES newResult) {
		TASK_RESULT_TYPES oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDefinitionPackage.TASK_RESULT__RESULT, oldResult,
					result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(String newResultValue) {
		String oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDefinitionPackage.TASK_RESULT__RESULT_VALUE,
					oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaskDefinitionPackage.TASK_RESULT__RESULT:
			return getResult();
		case TaskDefinitionPackage.TASK_RESULT__RESULT_VALUE:
			return getResultValue();
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
		case TaskDefinitionPackage.TASK_RESULT__RESULT:
			setResult((TASK_RESULT_TYPES) newValue);
			return;
		case TaskDefinitionPackage.TASK_RESULT__RESULT_VALUE:
			setResultValue((String) newValue);
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
		case TaskDefinitionPackage.TASK_RESULT__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case TaskDefinitionPackage.TASK_RESULT__RESULT_VALUE:
			setResultValue(RESULT_VALUE_EDEFAULT);
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
		case TaskDefinitionPackage.TASK_RESULT__RESULT:
			return result != RESULT_EDEFAULT;
		case TaskDefinitionPackage.TASK_RESULT__RESULT_VALUE:
			return RESULT_VALUE_EDEFAULT == null ? resultValue != null : !RESULT_VALUE_EDEFAULT.equals(resultValue);
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
		result.append(" (result: ");
		result.append(result);
		result.append(", resultValue: ");
		result.append(resultValue);
		result.append(')');
		return result.toString();
	}

} //TaskResultImpl
