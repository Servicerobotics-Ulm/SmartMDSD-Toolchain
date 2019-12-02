/**
 */
package org.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.service.roboticMiddleware.RoboticMiddleware;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.ecore.system.componentArchitecture.Connection;
import org.ecore.system.componentArchitecture.ProvidedService;
import org.ecore.system.componentArchitecture.RequiredService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ConnectionImpl#getMiddlewareSelection <em>Middleware Selection</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ConnectionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ProvidedService to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected RequiredService from;

	/**
	 * The cached value of the '{@link #getMiddlewareSelection() <em>Middleware Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlewareSelection()
	 * @generated
	 * @ordered
	 */
	protected RoboticMiddleware middlewareSelection;

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
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedService getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (ProvidedService) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(ProvidedService newTo) {
		ProvidedService oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentArchitecturePackage.CONNECTION__TO, oldTo,
					to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredService getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (RequiredService) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.CONNECTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(RequiredService newFrom) {
		RequiredService oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentArchitecturePackage.CONNECTION__FROM,
					oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoboticMiddleware getMiddlewareSelection() {
		return middlewareSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddlewareSelection(RoboticMiddleware newMiddlewareSelection,
			NotificationChain msgs) {
		RoboticMiddleware oldMiddlewareSelection = middlewareSelection;
		middlewareSelection = newMiddlewareSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION, oldMiddlewareSelection,
					newMiddlewareSelection);
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
	@Override
	public void setMiddlewareSelection(RoboticMiddleware newMiddlewareSelection) {
		if (newMiddlewareSelection != middlewareSelection) {
			NotificationChain msgs = null;
			if (middlewareSelection != null)
				msgs = ((InternalEObject) middlewareSelection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION, null,
						msgs);
			if (newMiddlewareSelection != null)
				msgs = ((InternalEObject) newMiddlewareSelection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION, null,
						msgs);
			msgs = basicSetMiddlewareSelection(newMiddlewareSelection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION, newMiddlewareSelection,
					newMiddlewareSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (from != null) {
			return getFrom().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (from != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION:
			return basicSetMiddlewareSelection(null, msgs);
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
		case ComponentArchitecturePackage.CONNECTION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case ComponentArchitecturePackage.CONNECTION__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION:
			return getMiddlewareSelection();
		case ComponentArchitecturePackage.CONNECTION__NAME:
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
		case ComponentArchitecturePackage.CONNECTION__TO:
			setTo((ProvidedService) newValue);
			return;
		case ComponentArchitecturePackage.CONNECTION__FROM:
			setFrom((RequiredService) newValue);
			return;
		case ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION:
			setMiddlewareSelection((RoboticMiddleware) newValue);
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
		case ComponentArchitecturePackage.CONNECTION__TO:
			setTo((ProvidedService) null);
			return;
		case ComponentArchitecturePackage.CONNECTION__FROM:
			setFrom((RequiredService) null);
			return;
		case ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION:
			setMiddlewareSelection((RoboticMiddleware) null);
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
		case ComponentArchitecturePackage.CONNECTION__TO:
			return to != null;
		case ComponentArchitecturePackage.CONNECTION__FROM:
			return from != null;
		case ComponentArchitecturePackage.CONNECTION__MIDDLEWARE_SELECTION:
			return middlewareSelection != null;
		case ComponentArchitecturePackage.CONNECTION__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
