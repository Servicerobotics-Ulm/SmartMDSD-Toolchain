/**
 */
package org.ecore.system.causeEffectChain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.system.activityArchitecture.TimeUnit;

import org.ecore.system.causeEffectChain.CauseEffectChainPackage;
import org.ecore.system.causeEffectChain.MaxResponseTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Response Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxResponseTimeImpl extends MinimalEObjectImpl.Container implements MaxResponseTime {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.SEC;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxResponseTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CauseEffectChainPackage.Literals.MAX_RESPONSE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CauseEffectChainPackage.MAX_RESPONSE_TIME__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CauseEffectChainPackage.MAX_RESPONSE_TIME__UNIT,
					oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__VALUE:
			return getValue();
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__UNIT:
			return getUnit();
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
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__VALUE:
			setValue((Integer) newValue);
			return;
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__UNIT:
			setUnit((TimeUnit) newValue);
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
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__UNIT:
			setUnit(UNIT_EDEFAULT);
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
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__VALUE:
			return value != VALUE_EDEFAULT;
		case CauseEffectChainPackage.MAX_RESPONSE_TIME__UNIT:
			return unit != UNIT_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //MaxResponseTimeImpl
