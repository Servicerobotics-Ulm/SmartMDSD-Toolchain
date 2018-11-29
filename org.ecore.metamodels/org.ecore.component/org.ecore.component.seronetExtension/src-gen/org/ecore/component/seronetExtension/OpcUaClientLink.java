/**
 */
package org.ecore.component.seronetExtension;

import org.ecore.component.componentDefinition.AbstractComponentLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Client Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.OpcUaClientLink#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaClientLink()
 * @model
 * @generated
 */
public interface OpcUaClientLink extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(OpcUaDeviceClient)
	 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaClientLink_Client()
	 * @model required="true"
	 * @generated
	 */
	OpcUaDeviceClient getClient();

	/**
	 * Sets the value of the '{@link org.ecore.component.seronetExtension.OpcUaClientLink#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(OpcUaDeviceClient value);

} // OpcUaClientLink
