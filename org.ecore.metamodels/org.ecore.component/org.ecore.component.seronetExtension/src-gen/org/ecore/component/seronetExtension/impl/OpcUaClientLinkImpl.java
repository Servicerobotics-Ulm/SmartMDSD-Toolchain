/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl;

import org.ecore.component.seronetExtension.OpcUaClientLink;
import org.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Client Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaClientLinkImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaClientLinkImpl extends AbstractComponentLinkImpl implements OpcUaClientLink {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected OpcUaDeviceClient client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaClientLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (client != null) {
			return getClient().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClient getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject) client;
			client = (OpcUaDeviceClient) eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClient basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(OpcUaDeviceClient newClient) {
		OpcUaDeviceClient oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT,
					oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT:
			if (resolve)
				return getClient();
			return basicGetClient();
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
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT:
			setClient((OpcUaDeviceClient) newValue);
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
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT:
			setClient((OpcUaDeviceClient) null);
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
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK__CLIENT:
			return client != null;
		}
		return super.eIsSet(featureID);
	}

} //OpcUaClientLinkImpl
