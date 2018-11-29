/**
 */
package org.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.PeriodicTimer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.PeriodicTimerImpl#getPeriodicActFreq <em>Periodic Act Freq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicTimerImpl extends ActivationSourceImpl implements PeriodicTimer {
	/**
	 * The default value of the '{@link #getPeriodicActFreq() <em>Periodic Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicActFreq()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIODIC_ACT_FREQ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriodicActFreq() <em>Periodic Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicActFreq()
	 * @generated
	 * @ordered
	 */
	protected double periodicActFreq = PERIODIC_ACT_FREQ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.PERIODIC_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriodicActFreq() {
		return periodicActFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicActFreq(double newPeriodicActFreq) {
		double oldPeriodicActFreq = periodicActFreq;
		periodicActFreq = newPeriodicActFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.PERIODIC_TIMER__PERIODIC_ACT_FREQ, oldPeriodicActFreq,
					periodicActFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivityArchitecturePackage.PERIODIC_TIMER__PERIODIC_ACT_FREQ:
			return getPeriodicActFreq();
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
		case ActivityArchitecturePackage.PERIODIC_TIMER__PERIODIC_ACT_FREQ:
			setPeriodicActFreq((Double) newValue);
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
		case ActivityArchitecturePackage.PERIODIC_TIMER__PERIODIC_ACT_FREQ:
			setPeriodicActFreq(PERIODIC_ACT_FREQ_EDEFAULT);
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
		case ActivityArchitecturePackage.PERIODIC_TIMER__PERIODIC_ACT_FREQ:
			return periodicActFreq != PERIODIC_ACT_FREQ_EDEFAULT;
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
		result.append(" (periodicActFreq: ");
		result.append(periodicActFreq);
		result.append(')');
		return result.toString();
	}

} //PeriodicTimerImpl
