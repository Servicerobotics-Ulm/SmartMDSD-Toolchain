/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.impl.ComponentPortExtensionImpl;

import org.ecore.component.seronetExtension.SeronetExtensionPackage;
import org.ecore.component.seronetExtension.SupportedMiddleware;

import org.ecore.service.roboticMiddleware.RoboticMiddleware;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Middleware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl#getMiddleware <em>Middleware</em>}</li>
 *   <li>{@link org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedMiddlewareImpl extends ComponentPortExtensionImpl implements SupportedMiddleware {
	/**
	 * The cached value of the '{@link #getMiddleware() <em>Middleware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleware()
	 * @generated
	 * @ordered
	 */
	protected RoboticMiddleware middleware;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedMiddlewareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticMiddleware getMiddleware() {
		return middleware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddleware(RoboticMiddleware newMiddleware, NotificationChain msgs) {
		RoboticMiddleware oldMiddleware = middleware;
		middleware = newMiddleware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE, oldMiddleware, newMiddleware);
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
	public void setMiddleware(RoboticMiddleware newMiddleware) {
		if (newMiddleware != middleware) {
			NotificationChain msgs = null;
			if (middleware != null)
				msgs = ((InternalEObject) middleware).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE, null, msgs);
			if (newMiddleware != null)
				msgs = ((InternalEObject) newMiddleware).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE, null, msgs);
			msgs = basicSetMiddleware(newMiddleware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE, newMiddleware, newMiddleware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT,
					oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			return basicSetMiddleware(null, msgs);
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			return getMiddleware();
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT:
			return isDefault();
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			setMiddleware((RoboticMiddleware) newValue);
			return;
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT:
			setDefault((Boolean) newValue);
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			setMiddleware((RoboticMiddleware) null);
			return;
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			return middleware != null;
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT:
			return default_ != DEFAULT_EDEFAULT;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //SupportedMiddlewareImpl
