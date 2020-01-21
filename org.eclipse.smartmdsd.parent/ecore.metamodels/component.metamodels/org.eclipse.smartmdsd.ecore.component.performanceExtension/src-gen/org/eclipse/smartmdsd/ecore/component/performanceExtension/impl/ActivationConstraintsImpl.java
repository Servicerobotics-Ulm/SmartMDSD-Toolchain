/**
 */
package org.eclipse.smartmdsd.ecore.component.performanceExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityExtensionImpl;

import org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints;
import org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.ActivationConstraintsImpl#isConfigurable <em>Configurable</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.ActivationConstraintsImpl#getMinActFreq <em>Min Act Freq</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.ActivationConstraintsImpl#getMaxActFreq <em>Max Act Freq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivationConstraintsImpl extends ActivityExtensionImpl implements ActivationConstraints {
	/**
	 * The default value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIGURABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected boolean configurable = CONFIGURABLE_EDEFAULT;

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
	protected ActivationConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformanceExtensionPackage.Literals.ACTIVATION_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConfigurable() {
		return configurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurable(boolean newConfigurable) {
		boolean oldConfigurable = configurable;
		configurable = newConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__CONFIGURABLE, oldConfigurable, configurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinActFreq() {
		return minActFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinActFreq(double newMinActFreq) {
		double oldMinActFreq = minActFreq;
		minActFreq = newMinActFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ, oldMinActFreq, minActFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxActFreq() {
		return maxActFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxActFreq(double newMaxActFreq) {
		double oldMaxActFreq = maxActFreq;
		maxActFreq = newMaxActFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ, oldMaxActFreq, maxActFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__CONFIGURABLE:
			return isConfigurable();
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ:
			return getMinActFreq();
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ:
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
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__CONFIGURABLE:
			setConfigurable((Boolean) newValue);
			return;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ:
			setMinActFreq((Double) newValue);
			return;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ:
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
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__CONFIGURABLE:
			setConfigurable(CONFIGURABLE_EDEFAULT);
			return;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ:
			setMinActFreq(MIN_ACT_FREQ_EDEFAULT);
			return;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ:
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
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__CONFIGURABLE:
			return configurable != CONFIGURABLE_EDEFAULT;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ:
			return minActFreq != MIN_ACT_FREQ_EDEFAULT;
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (configurable: ");
		result.append(configurable);
		result.append(", minActFreq: ");
		result.append(minActFreq);
		result.append(", maxActFreq: ");
		result.append(maxActFreq);
		result.append(')');
		return result.toString();
	}

} //ActivationConstraintsImpl
