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
package org.eclipse.smartmdsd.ecore.component.seronetExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Device Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#isAutoConnect <em>Auto Connect</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI <em>Device URI</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getRootObjectPath <em>Root Object Path</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile <em>Opcua Xml File</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient()
 * @model
 * @generated
 */
public interface OpcUaDeviceClient extends PlainOpcUaPort {
	/**
	 * Returns the value of the '<em><b>Auto Connect</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Connect</em>' attribute.
	 * @see #setAutoConnect(boolean)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_AutoConnect()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutoConnect();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#isAutoConnect <em>Auto Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Connect</em>' attribute.
	 * @see #isAutoConnect()
	 * @generated
	 */
	void setAutoConnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Device URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device URI</em>' attribute.
	 * @see #setDeviceURI(String)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_DeviceURI()
	 * @model
	 * @generated
	 */
	String getDeviceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI <em>Device URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device URI</em>' attribute.
	 * @see #getDeviceURI()
	 * @generated
	 */
	void setDeviceURI(String value);

	/**
	 * Returns the value of the '<em><b>Root Object Path</b></em>' attribute.
	 * The default value is <code>"Server"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Object Path</em>' attribute.
	 * @see #setRootObjectPath(String)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_RootObjectPath()
	 * @model default="Server"
	 * @generated
	 */
	String getRootObjectPath();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getRootObjectPath <em>Root Object Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Object Path</em>' attribute.
	 * @see #getRootObjectPath()
	 * @generated
	 */
	void setRootObjectPath(String value);

	/**
	 * Returns the value of the '<em><b>Opcua Xml File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opcua Xml File</em>' attribute.
	 * @see #setOpcuaXmlFile(String)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaDeviceClient_OpcuaXmlFile()
	 * @model
	 * @generated
	 */
	String getOpcuaXmlFile();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile <em>Opcua Xml File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opcua Xml File</em>' attribute.
	 * @see #getOpcuaXmlFile()
	 * @generated
	 */
	void setOpcuaXmlFile(String value);

} // OpcUaDeviceClient
