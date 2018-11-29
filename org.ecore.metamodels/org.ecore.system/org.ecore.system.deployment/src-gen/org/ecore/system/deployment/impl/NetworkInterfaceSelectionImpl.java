/**
 */
package org.ecore.system.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.system.deployment.DeploymentPackage;
import org.ecore.system.deployment.NetworkInterfaceSelection;

import org.ecore.system.targetPlatform.NetworkInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceSelectionImpl extends MinimalEObjectImpl.Container implements NetworkInterfaceSelection {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface network;

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
	protected NetworkInterfaceSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject) network;
			network = (NetworkInterface) eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(NetworkInterface newNetwork) {
		NetworkInterface oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (network != null) {
			return getNetwork().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (network != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK:
			if (resolve)
				return getNetwork();
			return basicGetNetwork();
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NAME:
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
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK:
			setNetwork((NetworkInterface) newValue);
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
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK:
			setNetwork((NetworkInterface) null);
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
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NETWORK:
			return network != null;
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //NetworkInterfaceSelectionImpl
