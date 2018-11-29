/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.OutputPort;

import org.ecore.component.seronetExtension.OpcUaStatusServer;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Status Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaStatusServerImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaStatusServerImpl extends PlainOpcUaPortImpl implements OpcUaStatusServer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaStatusServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.OPC_UA_STATUS_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutPort() {
		if (outPort != null && outPort.eIsProxy()) {
			InternalEObject oldOutPort = (InternalEObject) outPort;
			outPort = (OutputPort) eResolveProxy(oldOutPort);
			if (outPort != oldOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT, oldOutPort, outPort));
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
	public void setOutPort(OutputPort newOutPort) {
		OutputPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT, oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT:
			if (resolve)
				return getOutPort();
			return basicGetOutPort();
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
		case SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT:
			setOutPort((OutputPort) newValue);
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
		case SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT:
			setOutPort((OutputPort) null);
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
		case SeronetExtensionPackage.OPC_UA_STATUS_SERVER__OUT_PORT:
			return outPort != null;
		}
		return super.eIsSet(featureID);
	}

} //OpcUaStatusServerImpl
