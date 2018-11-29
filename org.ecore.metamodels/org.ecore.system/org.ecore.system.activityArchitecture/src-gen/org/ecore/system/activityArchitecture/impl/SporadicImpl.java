/**
 */
package org.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.Sporadic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.SporadicImpl#getMinActFreq <em>Min Act Freq</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.SporadicImpl#getMaxActFreq <em>Max Act Freq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SporadicImpl extends ActivationSourceImpl implements Sporadic {
	/**
	 * The default value of the '{@link #getMinActFreq() <em>Min Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinActFreq()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ACT_FREQ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinActFreq() <em>Min Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinActFreq()
	 * @generated
	 * @ordered
	 */
	protected double minActFreq = MIN_ACT_FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxActFreq() <em>Max Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActFreq()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ACT_FREQ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxActFreq() <em>Max Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActFreq()
	 * @generated
	 * @ordered
	 */
	protected double maxActFreq = MAX_ACT_FREQ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.SPORADIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinActFreq() {
		return minActFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinActFreq(double newMinActFreq) {
		double oldMinActFreq = minActFreq;
		minActFreq = newMinActFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ,
					oldMinActFreq, minActFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxActFreq() {
		return maxActFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActFreq(double newMaxActFreq) {
		double oldMaxActFreq = maxActFreq;
		maxActFreq = newMaxActFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ,
					oldMaxActFreq, maxActFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ:
			return getMinActFreq();
		case ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ:
			return getMaxActFreq();
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
		case ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ:
			setMinActFreq((Double) newValue);
			return;
		case ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ:
			setMaxActFreq((Double) newValue);
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
		case ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ:
			setMinActFreq(MIN_ACT_FREQ_EDEFAULT);
			return;
		case ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ:
			setMaxActFreq(MAX_ACT_FREQ_EDEFAULT);
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
		case ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ:
			return minActFreq != MIN_ACT_FREQ_EDEFAULT;
		case ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ:
			return maxActFreq != MAX_ACT_FREQ_EDEFAULT;
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
		result.append(" (minActFreq: ");
		result.append(minActFreq);
		result.append(", maxActFreq: ");
		result.append(maxActFreq);
		result.append(')');
		return result.toString();
	}

} //SporadicImpl
