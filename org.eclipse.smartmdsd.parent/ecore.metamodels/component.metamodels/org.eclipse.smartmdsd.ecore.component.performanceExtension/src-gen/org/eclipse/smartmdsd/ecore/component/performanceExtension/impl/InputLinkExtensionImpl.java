/**
 */
package org.eclipse.smartmdsd.ecore.component.performanceExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl;

import org.eclipse.smartmdsd.ecore.component.performanceExtension.InputLinkExtension;
import org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Link Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.InputLinkExtensionImpl#isOversamplingOk <em>Oversampling Ok</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.InputLinkExtensionImpl#isUndersamplingOk <em>Undersampling Ok</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputLinkExtensionImpl extends InputPortLinkImpl implements InputLinkExtension {
	/**
	 * The default value of the '{@link #isOversamplingOk() <em>Oversampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOversamplingOk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERSAMPLING_OK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOversamplingOk() <em>Oversampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOversamplingOk()
	 * @generated
	 * @ordered
	 */
	protected boolean oversamplingOk = OVERSAMPLING_OK_EDEFAULT;

	/**
	 * The default value of the '{@link #isUndersamplingOk() <em>Undersampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndersamplingOk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERSAMPLING_OK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndersamplingOk() <em>Undersampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndersamplingOk()
	 * @generated
	 * @ordered
	 */
	protected boolean undersamplingOk = UNDERSAMPLING_OK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputLinkExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformanceExtensionPackage.Literals.INPUT_LINK_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOversamplingOk() {
		return oversamplingOk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversamplingOk(boolean newOversamplingOk) {
		boolean oldOversamplingOk = oversamplingOk;
		oversamplingOk = newOversamplingOk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.INPUT_LINK_EXTENSION__OVERSAMPLING_OK, oldOversamplingOk,
					oversamplingOk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUndersamplingOk() {
		return undersamplingOk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUndersamplingOk(boolean newUndersamplingOk) {
		boolean oldUndersamplingOk = undersamplingOk;
		undersamplingOk = newUndersamplingOk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.INPUT_LINK_EXTENSION__UNDERSAMPLING_OK, oldUndersamplingOk,
					undersamplingOk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__OVERSAMPLING_OK:
			return isOversamplingOk();
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__UNDERSAMPLING_OK:
			return isUndersamplingOk();
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
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__OVERSAMPLING_OK:
			setOversamplingOk((Boolean) newValue);
			return;
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__UNDERSAMPLING_OK:
			setUndersamplingOk((Boolean) newValue);
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
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__OVERSAMPLING_OK:
			setOversamplingOk(OVERSAMPLING_OK_EDEFAULT);
			return;
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__UNDERSAMPLING_OK:
			setUndersamplingOk(UNDERSAMPLING_OK_EDEFAULT);
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
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__OVERSAMPLING_OK:
			return oversamplingOk != OVERSAMPLING_OK_EDEFAULT;
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION__UNDERSAMPLING_OK:
			return undersamplingOk != UNDERSAMPLING_OK_EDEFAULT;
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
		result.append(" (oversamplingOk: ");
		result.append(oversamplingOk);
		result.append(", undersamplingOk: ");
		result.append(undersamplingOk);
		result.append(')');
		return result.toString();
	}

} //InputLinkExtensionImpl
