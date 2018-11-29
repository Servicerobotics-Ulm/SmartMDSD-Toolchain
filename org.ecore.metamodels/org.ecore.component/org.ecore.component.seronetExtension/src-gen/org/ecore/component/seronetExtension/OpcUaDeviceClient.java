/**
 */
package org.ecore.component.seronetExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Device Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI <em>Device URI</em>}</li>
 *   <li>{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile <em>Opcua Xml File</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient()
 * @model
 * @generated
 */
public interface OpcUaDeviceClient extends PlainOpcUaPort {
	/**
	 * Returns the value of the '<em><b>Device URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device URI</em>' attribute.
	 * @see #setDeviceURI(String)
	 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_DeviceURI()
	 * @model
	 * @generated
	 */
	String getDeviceURI();

	/**
	 * Sets the value of the '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI <em>Device URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device URI</em>' attribute.
	 * @see #getDeviceURI()
	 * @generated
	 */
	void setDeviceURI(String value);

	/**
	 * Returns the value of the '<em><b>Opcua Xml File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opcua Xml File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opcua Xml File</em>' attribute.
	 * @see #setOpcuaXmlFile(String)
	 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_OpcuaXmlFile()
	 * @model
	 * @generated
	 */
	String getOpcuaXmlFile();

	/**
	 * Sets the value of the '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile <em>Opcua Xml File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcua Xml File</em>' attribute.
	 * @see #getOpcuaXmlFile()
	 * @generated
	 */
	void setOpcuaXmlFile(String value);

} // OpcUaDeviceClient
