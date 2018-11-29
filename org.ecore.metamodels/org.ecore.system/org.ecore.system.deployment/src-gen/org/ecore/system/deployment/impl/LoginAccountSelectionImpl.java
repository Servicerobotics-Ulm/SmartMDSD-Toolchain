/**
 */
package org.ecore.system.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.system.deployment.DeploymentPackage;
import org.ecore.system.deployment.LoginAccountSelection;

import org.ecore.system.targetPlatform.LoginAccount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Account Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.impl.LoginAccountSelectionImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.LoginAccountSelectionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginAccountSelectionImpl extends MinimalEObjectImpl.Container implements LoginAccountSelection {
	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected LoginAccount login;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginAccountSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginAccount getLogin() {
		if (login != null && login.eIsProxy()) {
			InternalEObject oldLogin = (InternalEObject) login;
			login = (LoginAccount) eResolveProxy(oldLogin);
			if (login != oldLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN, oldLogin, login));
			}
		}
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginAccount basicGetLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(LoginAccount newLogin) {
		LoginAccount oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN,
					oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (login != null) {
			return getLogin().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (login != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN:
			if (resolve)
				return getLogin();
			return basicGetLogin();
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__NAME:
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
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN:
			setLogin((LoginAccount) newValue);
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
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN:
			setLogin((LoginAccount) null);
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
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__LOGIN:
			return login != null;
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //LoginAccountSelectionImpl
