/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient;

import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Device Client Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl#getDeviceClient <em>Device Client</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl#getDeviceURI <em>Device URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaDeviceClientInstanceImpl extends ComponentInstanceExtensionImpl implements OpcUaDeviceClientInstance {
	/**
	 * The cached value of the '{@link #getDeviceClient() <em>Device Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceClient()
	 * @generated
	 * @ordered
	 */
	protected OpcUaDeviceClient deviceClient;

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
	 * The default value of the '{@link #getDeviceURI() <em>Device URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceURI() <em>Device URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceURI()
	 * @generated
	 * @ordered
	 */
	protected String deviceURI = DEVICE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaDeviceClientInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpcUaDeviceClient getDeviceClient() {
		if (deviceClient != null && deviceClient.eIsProxy()) {
			InternalEObject oldDeviceClient = (InternalEObject) deviceClient;
			deviceClient = (OpcUaDeviceClient) eResolveProxy(oldDeviceClient);
			if (deviceClient != oldDeviceClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT,
							oldDeviceClient, deviceClient));
			}
		}
		return deviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClient basicGetDeviceClient() {
		return deviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceClient(OpcUaDeviceClient newDeviceClient) {
		OpcUaDeviceClient oldDeviceClient = deviceClient;
		deviceClient = newDeviceClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT, oldDeviceClient,
					deviceClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (deviceClient != null) {
			return getDeviceClient().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetName() {
		return (deviceClient != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceURI() {
		return deviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceURI(String newDeviceURI) {
		String oldDeviceURI = deviceURI;
		deviceURI = newDeviceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI, oldDeviceURI,
					deviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT:
			if (resolve)
				return getDeviceClient();
			return basicGetDeviceClient();
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__NAME:
			return getName();
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI:
			return getDeviceURI();
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
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT:
			setDeviceClient((OpcUaDeviceClient) newValue);
			return;
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI:
			setDeviceURI((String) newValue);
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
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT:
			setDeviceClient((OpcUaDeviceClient) null);
			return;
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI:
			setDeviceURI(DEVICE_URI_EDEFAULT);
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
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT:
			return deviceClient != null;
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__NAME:
			return isSetName();
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI:
			return DEVICE_URI_EDEFAULT == null ? deviceURI != null : !DEVICE_URI_EDEFAULT.equals(deviceURI);
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
		result.append(" (deviceURI: ");
		result.append(deviceURI);
		result.append(')');
		return result.toString();
	}

} //OpcUaDeviceClientInstanceImpl
