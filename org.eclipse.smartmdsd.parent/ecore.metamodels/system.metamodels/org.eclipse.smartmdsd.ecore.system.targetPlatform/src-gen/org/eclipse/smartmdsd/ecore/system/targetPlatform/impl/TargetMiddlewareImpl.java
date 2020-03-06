/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.targetPlatform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Middleware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.TargetMiddlewareImpl#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetMiddlewareImpl extends AbstractTPSubNodeImpl implements TargetMiddleware {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMiddlewareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.TARGET_MIDDLEWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
					TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE, oldMiddleware, newMiddleware);
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
	public void setMiddleware(RoboticMiddleware newMiddleware) {
		if (newMiddleware != middleware) {
			NotificationChain msgs = null;
			if (middleware != null)
				msgs = ((InternalEObject) middleware).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE, null, msgs);
			if (newMiddleware != null)
				msgs = ((InternalEObject) newMiddleware).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE, null, msgs);
			msgs = basicSetMiddleware(newMiddleware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE,
					newMiddleware, newMiddleware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE:
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
		case TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE:
			return getMiddleware();
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
		case TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE:
			setMiddleware((RoboticMiddleware) newValue);
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
		case TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE:
			setMiddleware((RoboticMiddleware) null);
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
		case TargetPlatformPackage.TARGET_MIDDLEWARE__MIDDLEWARE:
			return middleware != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetMiddlewareImpl
