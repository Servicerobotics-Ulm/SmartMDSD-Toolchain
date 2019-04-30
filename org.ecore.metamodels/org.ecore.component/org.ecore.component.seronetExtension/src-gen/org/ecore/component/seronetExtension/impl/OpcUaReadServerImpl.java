/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.OutputPort;

import org.ecore.component.seronetExtension.OpcUaReadServer;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Read Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaReadServerImpl extends PlainOpcUaPortImpl implements OpcUaReadServer {
	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outPort;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 4840;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaReadServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.OPC_UA_READ_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort getOutPort() {
		if (outPort != null && outPort.eIsProxy()) {
			InternalEObject oldOutPort = (InternalEObject) outPort;
			outPort = (OutputPort) eResolveProxy(oldOutPort);
			if (outPort != oldOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT, oldOutPort, outPort));
			}
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutPort(OutputPort newOutPort) {
		OutputPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT,
					oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_READ_SERVER__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT:
			if (resolve)
				return getOutPort();
			return basicGetOutPort();
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__PORT_NUMBER:
			return getPortNumber();
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
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT:
			setOutPort((OutputPort) newValue);
			return;
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__PORT_NUMBER:
			setPortNumber((Integer) newValue);
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
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT:
			setOutPort((OutputPort) null);
			return;
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__PORT_NUMBER:
			setPortNumber(PORT_NUMBER_EDEFAULT);
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
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__OUT_PORT:
			return outPort != null;
		case SeronetExtensionPackage.OPC_UA_READ_SERVER__PORT_NUMBER:
			return portNumber != PORT_NUMBER_EDEFAULT;
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
		result.append(" (portNumber: ");
		result.append(portNumber);
		result.append(')');
		return result.toString();
	}

} //OpcUaReadServerImpl
