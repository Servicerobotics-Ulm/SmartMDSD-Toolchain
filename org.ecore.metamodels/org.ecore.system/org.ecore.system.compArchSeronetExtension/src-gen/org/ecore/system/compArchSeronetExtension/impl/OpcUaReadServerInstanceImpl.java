/**
 */
package org.ecore.system.compArchSeronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.seronetExtension.OpcUaReadServer;

import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance;

import org.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Read Server Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.impl.OpcUaReadServerInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.impl.OpcUaReadServerInstanceImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.impl.OpcUaReadServerInstanceImpl#getReadServer <em>Read Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaReadServerInstanceImpl extends ComponentInstanceExtensionImpl implements OpcUaReadServerInstance {
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
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadServer() <em>Read Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadServer()
	 * @generated
	 * @ordered
	 */
	protected OpcUaReadServer readServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaReadServerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (readServer != null) {
			return getReadServer().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (readServer != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER, oldPortNumber,
					portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaReadServer getReadServer() {
		if (readServer != null && readServer.eIsProxy()) {
			InternalEObject oldReadServer = (InternalEObject) readServer;
			readServer = (OpcUaReadServer) eResolveProxy(oldReadServer);
			if (readServer != oldReadServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER, oldReadServer,
							readServer));
			}
		}
		return readServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaReadServer basicGetReadServer() {
		return readServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadServer(OpcUaReadServer newReadServer) {
		OpcUaReadServer oldReadServer = readServer;
		readServer = newReadServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER, oldReadServer,
					readServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__NAME:
			return getName();
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER:
			return getPortNumber();
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER:
			if (resolve)
				return getReadServer();
			return basicGetReadServer();
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
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER:
			setPortNumber((Integer) newValue);
			return;
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER:
			setReadServer((OpcUaReadServer) newValue);
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
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER:
			setPortNumber(PORT_NUMBER_EDEFAULT);
			return;
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER:
			setReadServer((OpcUaReadServer) null);
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
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__NAME:
			return isSetName();
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER:
			return portNumber != PORT_NUMBER_EDEFAULT;
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER:
			return readServer != null;
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
		result.append(" (portNumber: ");
		result.append(portNumber);
		result.append(')');
		return result.toString();
	}

} //OpcUaReadServerInstanceImpl
