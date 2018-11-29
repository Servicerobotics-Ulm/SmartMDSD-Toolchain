/**
 */
package org.ecore.system.compArchSeronetExtension;

import org.ecore.component.seronetExtension.OpcUaDeviceClient;

import org.ecore.system.componentArchitecture.ComponentInstanceExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Device Client Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceClient <em>Device Client</em>}</li>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceURI <em>Device URI</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaDeviceClientInstance()
 * @model
 * @generated
 */
public interface OpcUaDeviceClientInstance extends ComponentInstanceExtension {
	/**
	 * Returns the value of the '<em><b>Device Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Client</em>' reference.
	 * @see #setDeviceClient(OpcUaDeviceClient)
	 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaDeviceClientInstance_DeviceClient()
	 * @model required="true"
	 * @generated
	 */
	OpcUaDeviceClient getDeviceClient();

	/**
	 * Sets the value of the '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceClient <em>Device Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Client</em>' reference.
	 * @see #getDeviceClient()
	 * @generated
	 */
	void setDeviceClient(OpcUaDeviceClient value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaDeviceClientInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

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
	 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaDeviceClientInstance_DeviceURI()
	 * @model required="true"
	 * @generated
	 */
	String getDeviceURI();

	/**
	 * Sets the value of the '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceURI <em>Device URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device URI</em>' attribute.
	 * @see #getDeviceURI()
	 * @generated
	 */
	void setDeviceURI(String value);

} // OpcUaDeviceClientInstance
