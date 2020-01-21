/**
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillResultImpl extends MinimalEObjectImpl.Container implements SkillResult {
	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final SKILL_RESULT_TYPES RESULT_EDEFAULT = SKILL_RESULT_TYPES.SUCCESS;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected SKILL_RESULT_TYPES result = RESULT_EDEFAULT;

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
	protected SkillResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillDefinitionPackage.Literals.SKILL_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SKILL_RESULT_TYPES getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(SKILL_RESULT_TYPES newResult) {
		SKILL_RESULT_TYPES oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkillDefinitionPackage.SKILL_RESULT__RESULT,
					oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultValue(String newResultValue) {
		String oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkillDefinitionPackage.SKILL_RESULT__RESULT_VALUE,
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
		case SkillDefinitionPackage.SKILL_RESULT__RESULT:
			return getResult();
		case SkillDefinitionPackage.SKILL_RESULT__RESULT_VALUE:
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
		case SkillDefinitionPackage.SKILL_RESULT__RESULT:
			setResult((SKILL_RESULT_TYPES) newValue);
			return;
		case SkillDefinitionPackage.SKILL_RESULT__RESULT_VALUE:
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
		case SkillDefinitionPackage.SKILL_RESULT__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case SkillDefinitionPackage.SKILL_RESULT__RESULT_VALUE:
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
		case SkillDefinitionPackage.SKILL_RESULT__RESULT:
			return result != RESULT_EDEFAULT;
		case SkillDefinitionPackage.SKILL_RESULT__RESULT_VALUE:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (result: ");
		result.append(result);
		result.append(", resultValue: ");
		result.append(resultValue);
		result.append(')');
		return result.toString();
	}

} //SkillResultImpl
