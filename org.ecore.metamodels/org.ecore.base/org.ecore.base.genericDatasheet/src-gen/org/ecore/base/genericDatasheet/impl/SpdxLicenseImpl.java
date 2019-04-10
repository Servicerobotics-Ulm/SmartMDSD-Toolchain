/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.SpdxLicense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spdx License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.SpdxLicenseImpl#getLicenseID <em>License ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpdxLicenseImpl extends AbstractLicenseImpl implements SpdxLicense {
	/**
	 * The default value of the '{@link #getLicenseID() <em>License ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseID()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseID() <em>License ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseID()
	 * @generated
	 * @ordered
	 */
	protected String licenseID = LICENSE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpdxLicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDatasheetPackage.Literals.SPDX_LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicenseID() {
		return licenseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseID(String newLicenseID) {
		String oldLicenseID = licenseID;
		licenseID = newLicenseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.SPDX_LICENSE__LICENSE_ID,
					oldLicenseID, licenseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GenericDatasheetPackage.SPDX_LICENSE__LICENSE_ID:
			return getLicenseID();
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
		case GenericDatasheetPackage.SPDX_LICENSE__LICENSE_ID:
			setLicenseID((String) newValue);
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
		case GenericDatasheetPackage.SPDX_LICENSE__LICENSE_ID:
			setLicenseID(LICENSE_ID_EDEFAULT);
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
		case GenericDatasheetPackage.SPDX_LICENSE__LICENSE_ID:
			return LICENSE_ID_EDEFAULT == null ? licenseID != null : !LICENSE_ID_EDEFAULT.equals(licenseID);
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
		result.append(" (licenseID: ");
		result.append(licenseID);
		result.append(')');
		return result.toString();
	}

} //SpdxLicenseImpl
