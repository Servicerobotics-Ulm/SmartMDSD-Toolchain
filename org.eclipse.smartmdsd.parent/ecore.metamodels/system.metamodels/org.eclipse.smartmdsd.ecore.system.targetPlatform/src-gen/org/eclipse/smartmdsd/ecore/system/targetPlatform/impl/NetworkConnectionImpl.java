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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.NetworkConnectionImpl#getEndpoint1 <em>Endpoint1</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.NetworkConnectionImpl#getEndpoint2 <em>Endpoint2</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.NetworkConnectionImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkConnectionImpl extends AbstractTPElementImpl implements NetworkConnection {
	/**
	 * The cached value of the '{@link #getEndpoint1() <em>Endpoint1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint1()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface endpoint1;

	/**
	 * The cached value of the '{@link #getEndpoint2() <em>Endpoint2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint2()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface endpoint2;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.NETWORK_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface getEndpoint1() {
		if (endpoint1 != null && endpoint1.eIsProxy()) {
			InternalEObject oldEndpoint1 = (InternalEObject) endpoint1;
			endpoint1 = (NetworkInterface) eResolveProxy(oldEndpoint1);
			if (endpoint1 != oldEndpoint1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1, oldEndpoint1, endpoint1));
			}
		}
		return endpoint1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetEndpoint1() {
		return endpoint1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpoint1(NetworkInterface newEndpoint1) {
		NetworkInterface oldEndpoint1 = endpoint1;
		endpoint1 = newEndpoint1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1,
					oldEndpoint1, endpoint1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface getEndpoint2() {
		if (endpoint2 != null && endpoint2.eIsProxy()) {
			InternalEObject oldEndpoint2 = (InternalEObject) endpoint2;
			endpoint2 = (NetworkInterface) eResolveProxy(oldEndpoint2);
			if (endpoint2 != oldEndpoint2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2, oldEndpoint2, endpoint2));
			}
		}
		return endpoint2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetEndpoint2() {
		return endpoint2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpoint2(NetworkInterface newEndpoint2) {
		NetworkInterface oldEndpoint2 = endpoint2;
		endpoint2 = newEndpoint2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2,
					oldEndpoint2, endpoint2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_CONNECTION__KIND,
					oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1:
			if (resolve)
				return getEndpoint1();
			return basicGetEndpoint1();
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2:
			if (resolve)
				return getEndpoint2();
			return basicGetEndpoint2();
		case TargetPlatformPackage.NETWORK_CONNECTION__KIND:
			return getKind();
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
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1:
			setEndpoint1((NetworkInterface) newValue);
			return;
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2:
			setEndpoint2((NetworkInterface) newValue);
			return;
		case TargetPlatformPackage.NETWORK_CONNECTION__KIND:
			setKind((String) newValue);
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
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1:
			setEndpoint1((NetworkInterface) null);
			return;
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2:
			setEndpoint2((NetworkInterface) null);
			return;
		case TargetPlatformPackage.NETWORK_CONNECTION__KIND:
			setKind(KIND_EDEFAULT);
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
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT1:
			return endpoint1 != null;
		case TargetPlatformPackage.NETWORK_CONNECTION__ENDPOINT2:
			return endpoint2 != null;
		case TargetPlatformPackage.NETWORK_CONNECTION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //NetworkConnectionImpl
