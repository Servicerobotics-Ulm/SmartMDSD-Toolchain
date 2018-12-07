/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.ProprietaryLicense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proprietary License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl#getFullText <em>Full Text</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProprietaryLicenseImpl extends AbstractLicenseImpl implements ProprietaryLicense {
	/**
	 * The default value of the '{@link #getFullText() <em>Full Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullText()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullText() <em>Full Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullText()
	 * @generated
	 * @ordered
	 */
	protected String fullText = FULL_TEXT_EDEFAULT;

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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprietaryLicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDatasheetPackage.Literals.PROPRIETARY_LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullText() {
		return fullText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullText(String newFullText) {
		String oldFullText = fullText;
		fullText = newFullText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.PROPRIETARY_LICENSE__FULL_TEXT, oldFullText, fullText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.PROPRIETARY_LICENSE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.PROPRIETARY_LICENSE__URL,
					oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__FULL_TEXT:
			return getFullText();
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__NAME:
			return getName();
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__URL:
			return getUrl();
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
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__FULL_TEXT:
			setFullText((String) newValue);
			return;
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__NAME:
			setName((String) newValue);
			return;
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__URL:
			setUrl((String) newValue);
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
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__FULL_TEXT:
			setFullText(FULL_TEXT_EDEFAULT);
			return;
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__URL:
			setUrl(URL_EDEFAULT);
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
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__FULL_TEXT:
			return FULL_TEXT_EDEFAULT == null ? fullText != null : !FULL_TEXT_EDEFAULT.equals(fullText);
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GenericDatasheetPackage.PROPRIETARY_LICENSE__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (fullText: ");
		result.append(fullText);
		result.append(", name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ProprietaryLicenseImpl
