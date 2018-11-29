/**
 */
package org.ecore.system.targetPlatform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.targetPlatform.LoginAccount;
import org.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.impl.LoginAccountImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.impl.LoginAccountImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.impl.LoginAccountImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginAccountImpl extends AbstractTPSubNodeImpl implements LoginAccount {
	/**
	 * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected String fullname = FULLNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.LOGIN_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullname(String newFullname) {
		String oldFullname = fullname;
		fullname = newFullname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.LOGIN_ACCOUNT__FULLNAME,
					oldFullname, fullname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.LOGIN_ACCOUNT__EMAIL, oldEmail,
					email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.LOGIN_ACCOUNT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPlatformPackage.LOGIN_ACCOUNT__FULLNAME:
			return getFullname();
		case TargetPlatformPackage.LOGIN_ACCOUNT__EMAIL:
			return getEmail();
		case TargetPlatformPackage.LOGIN_ACCOUNT__NAME:
			return getName();
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
		case TargetPlatformPackage.LOGIN_ACCOUNT__FULLNAME:
			setFullname((String) newValue);
			return;
		case TargetPlatformPackage.LOGIN_ACCOUNT__EMAIL:
			setEmail((String) newValue);
			return;
		case TargetPlatformPackage.LOGIN_ACCOUNT__NAME:
			setName((String) newValue);
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
		case TargetPlatformPackage.LOGIN_ACCOUNT__FULLNAME:
			setFullname(FULLNAME_EDEFAULT);
			return;
		case TargetPlatformPackage.LOGIN_ACCOUNT__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case TargetPlatformPackage.LOGIN_ACCOUNT__NAME:
			setName(NAME_EDEFAULT);
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
		case TargetPlatformPackage.LOGIN_ACCOUNT__FULLNAME:
			return FULLNAME_EDEFAULT == null ? fullname != null : !FULLNAME_EDEFAULT.equals(fullname);
		case TargetPlatformPackage.LOGIN_ACCOUNT__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case TargetPlatformPackage.LOGIN_ACCOUNT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (fullname: ");
		result.append(fullname);
		result.append(", email: ");
		result.append(email);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LoginAccountImpl
