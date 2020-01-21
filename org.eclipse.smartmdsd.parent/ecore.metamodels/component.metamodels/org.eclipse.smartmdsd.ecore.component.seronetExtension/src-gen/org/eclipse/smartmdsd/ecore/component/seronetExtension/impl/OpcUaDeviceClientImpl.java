/**
 */
package org.eclipse.smartmdsd.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opc Ua Device Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#isAutoConnect <em>Auto Connect</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#getDeviceURI <em>Device URI</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#getRootObjectPath <em>Root Object Path</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl#getOpcuaXmlFile <em>Opcua Xml File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpcUaDeviceClientImpl extends PlainOpcUaPortImpl implements OpcUaDeviceClient {
	/**
	 * The default value of the '{@link #isAutoConnect() <em>Auto Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoConnect() <em>Auto Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean autoConnect = AUTO_CONNECT_EDEFAULT;

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
	 * The default value of the '{@link #getRootObjectPath() <em>Root Object Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootObjectPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_OBJECT_PATH_EDEFAULT = "Server";

	/**
	 * The cached value of the '{@link #getRootObjectPath() <em>Root Object Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootObjectPath()
	 * @generated
	 * @ordered
	 */
	protected String rootObjectPath = ROOT_OBJECT_PATH_EDEFAULT;

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
	@Override
	public boolean isAutoConnect() {
		return autoConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoConnect(boolean newAutoConnect) {
		boolean oldAutoConnect = autoConnect;
		autoConnect = newAutoConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT, oldAutoConnect, autoConnect));
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
					SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI, oldDeviceURI, deviceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootObjectPath() {
		return rootObjectPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootObjectPath(String newRootObjectPath) {
		String oldRootObjectPath = rootObjectPath;
		rootObjectPath = newRootObjectPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH, oldRootObjectPath, rootObjectPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpcuaXmlFile() {
		return opcuaXmlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT:
			return isAutoConnect();
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			return getDeviceURI();
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH:
			return getRootObjectPath();
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT:
			setAutoConnect((Boolean) newValue);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			setDeviceURI((String) newValue);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH:
			setRootObjectPath((String) newValue);
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT:
			setAutoConnect(AUTO_CONNECT_EDEFAULT);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			setDeviceURI(DEVICE_URI_EDEFAULT);
			return;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH:
			setRootObjectPath(ROOT_OBJECT_PATH_EDEFAULT);
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
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT:
			return autoConnect != AUTO_CONNECT_EDEFAULT;
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
			return DEVICE_URI_EDEFAULT == null ? deviceURI != null : !DEVICE_URI_EDEFAULT.equals(deviceURI);
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH:
			return ROOT_OBJECT_PATH_EDEFAULT == null ? rootObjectPath != null
					: !ROOT_OBJECT_PATH_EDEFAULT.equals(rootObjectPath);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (autoConnect: ");
		result.append(autoConnect);
		result.append(", deviceURI: ");
		result.append(deviceURI);
		result.append(", rootObjectPath: ");
		result.append(rootObjectPath);
		result.append(", opcuaXmlFile: ");
		result.append(opcuaXmlFile);
		result.append(')');
		return result.toString();
	}

} //OpcUaDeviceClientImpl
