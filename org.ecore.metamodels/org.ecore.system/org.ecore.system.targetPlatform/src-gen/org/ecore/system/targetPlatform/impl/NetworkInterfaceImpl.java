/**
 */
package org.ecore.system.targetPlatform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.targetPlatform.NetworkInterface;
import org.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl#getPortNr <em>Port Nr</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceImpl extends AbstractTPSubNodeImpl implements NetworkInterface {
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
	 * The default value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected String hostAddress = HOST_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNr() <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNr()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNr() <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNr()
	 * @generated
	 * @ordered
	 */
	protected int portNr = PORT_NR_EDEFAULT;

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
	protected NetworkInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.NETWORK_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_INTERFACE__KIND,
					oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostAddress() {
		return hostAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostAddress(String newHostAddress) {
		String oldHostAddress = hostAddress;
		hostAddress = newHostAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS,
					oldHostAddress, hostAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNr() {
		return portNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNr(int newPortNr) {
		int oldPortNr = portNr;
		portNr = newPortNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR,
					oldPortNr, portNr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.NETWORK_INTERFACE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPlatformPackage.NETWORK_INTERFACE__KIND:
			return getKind();
		case TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS:
			return getHostAddress();
		case TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR:
			return getPortNr();
		case TargetPlatformPackage.NETWORK_INTERFACE__NAME:
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
		case TargetPlatformPackage.NETWORK_INTERFACE__KIND:
			setKind((String) newValue);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS:
			setHostAddress((String) newValue);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR:
			setPortNr((Integer) newValue);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__NAME:
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
		case TargetPlatformPackage.NETWORK_INTERFACE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS:
			setHostAddress(HOST_ADDRESS_EDEFAULT);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR:
			setPortNr(PORT_NR_EDEFAULT);
			return;
		case TargetPlatformPackage.NETWORK_INTERFACE__NAME:
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
		case TargetPlatformPackage.NETWORK_INTERFACE__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS:
			return HOST_ADDRESS_EDEFAULT == null ? hostAddress != null : !HOST_ADDRESS_EDEFAULT.equals(hostAddress);
		case TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR:
			return portNr != PORT_NR_EDEFAULT;
		case TargetPlatformPackage.NETWORK_INTERFACE__NAME:
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", hostAddress: ");
		result.append(hostAddress);
		result.append(", portNr: ");
		result.append(portNr);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NetworkInterfaceImpl
