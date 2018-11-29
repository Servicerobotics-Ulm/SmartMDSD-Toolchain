/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Device Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#getDeviceURI <em>Device URI</em>}</li>
 *   <li>{@link org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#getOpcuaXmlFile <em>Opcua Xml File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaDeviceClientImpl extends PlainOpcUaPortImpl implements OpcUaDeviceClient {
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
	 * The default value of the '{@link #getOpcuaXmlFile() <em>Opcua Xml File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcuaXmlFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OPCUA_XML_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpcuaXmlFile() <em>Opcua Xml File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcuaXmlFile()
	 * @generated
	 * @ordered
	 */
	protected String opcuaXmlFile = OPCUA_XML_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpcUaDeviceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceURI() {
		return deviceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceURI(String newDeviceURI) {
		String oldDeviceURI = deviceURI;
		deviceURI = newDeviceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI, oldDeviceURI, deviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpcuaXmlFile() {
		return opcuaXmlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpcuaXmlFile(String newOpcuaXmlFile) {
		String oldOpcuaXmlFile = opcuaXmlFile;
		opcuaXmlFile = newOpcuaXmlFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE, oldOpcuaXmlFile, opcuaXmlFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			return getDeviceURI();
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE:
			return getOpcuaXmlFile();
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			setDeviceURI((String) newValue);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE:
			setOpcuaXmlFile((String) newValue);
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			setDeviceURI(DEVICE_URI_EDEFAULT);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE:
			setOpcuaXmlFile(OPCUA_XML_FILE_EDEFAULT);
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			return DEVICE_URI_EDEFAULT == null ? deviceURI != null : !DEVICE_URI_EDEFAULT.equals(deviceURI);
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE:
			return OPCUA_XML_FILE_EDEFAULT == null ? opcuaXmlFile != null
					: !OPCUA_XML_FILE_EDEFAULT.equals(opcuaXmlFile);
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
		result.append(" (deviceURI: ");
		result.append(deviceURI);
		result.append(", opcuaXmlFile: ");
		result.append(opcuaXmlFile);
		result.append(')');
		return result.toString();
	}

} //OpcUaDeviceClientImpl
