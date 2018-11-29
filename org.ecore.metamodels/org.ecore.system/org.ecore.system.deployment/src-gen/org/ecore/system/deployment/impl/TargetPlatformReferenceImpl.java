/**
 */
package org.ecore.system.deployment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.deployment.DeploymentPackage;
import org.ecore.system.deployment.LoginAccountSelection;
import org.ecore.system.deployment.NetworkInterfaceSelection;
import org.ecore.system.deployment.TargetPlatformReference;
import org.ecore.system.deployment.UploadDirectory;

import org.ecore.system.targetPlatform.TargetPlatformDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Platform Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.impl.TargetPlatformReferenceImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.TargetPlatformReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.TargetPlatformReferenceImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.TargetPlatformReferenceImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.TargetPlatformReferenceImpl#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetPlatformReferenceImpl extends AbstractDeploymentElementImpl implements TargetPlatformReference {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected TargetPlatformDefinition platform;

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
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected UploadDirectory directory;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected LoginAccountSelection login;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterfaceSelection host;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPlatformReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformDefinition getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject) platform;
			platform = (TargetPlatformDefinition) eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformDefinition basicGetPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(TargetPlatformDefinition newPlatform) {
		TargetPlatformDefinition oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM,
					oldPlatform, platform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UploadDirectory getDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectory(UploadDirectory newDirectory, NotificationChain msgs) {
		UploadDirectory oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY, oldDirectory, newDirectory);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(UploadDirectory newDirectory) {
		if (newDirectory != directory) {
			NotificationChain msgs = null;
			if (directory != null)
				msgs = ((InternalEObject) directory).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY, null, msgs);
			if (newDirectory != null)
				msgs = ((InternalEObject) newDirectory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY, null, msgs);
			msgs = basicSetDirectory(newDirectory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY, newDirectory, newDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginAccountSelection getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogin(LoginAccountSelection newLogin, NotificationChain msgs) {
		LoginAccountSelection oldLogin = login;
		login = newLogin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN, oldLogin, newLogin);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(LoginAccountSelection newLogin) {
		if (newLogin != login) {
			NotificationChain msgs = null;
			if (login != null)
				msgs = ((InternalEObject) login).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN, null, msgs);
			if (newLogin != null)
				msgs = ((InternalEObject) newLogin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN, null, msgs);
			msgs = basicSetLogin(newLogin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN,
					newLogin, newLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterfaceSelection getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(NetworkInterfaceSelection newHost, NotificationChain msgs) {
		NetworkInterfaceSelection oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST, oldHost, newHost);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(NetworkInterfaceSelection newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject) host).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST, null, msgs);
			if (newHost != null)
				msgs = ((InternalEObject) newHost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST, null, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST,
					newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
			return basicSetDirectory(null, msgs);
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
			return basicSetLogin(null, msgs);
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
			return basicSetHost(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM:
			if (resolve)
				return getPlatform();
			return basicGetPlatform();
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME:
			return getName();
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
			return getDirectory();
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
			return getLogin();
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
			return getHost();
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
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM:
			setPlatform((TargetPlatformDefinition) newValue);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
			setDirectory((UploadDirectory) newValue);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
			setLogin((LoginAccountSelection) newValue);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
			setHost((NetworkInterfaceSelection) newValue);
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
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM:
			setPlatform((TargetPlatformDefinition) null);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
			setDirectory((UploadDirectory) null);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
			setLogin((LoginAccountSelection) null);
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
			setHost((NetworkInterfaceSelection) null);
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
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__PLATFORM:
			return platform != null;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
			return directory != null;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
			return login != null;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
			return host != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TargetPlatformReferenceImpl
