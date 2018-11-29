/**
 */
package org.ecore.component.seronetExtension;

import org.ecore.component.componentDefinition.OutputPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Status Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.seronetExtension.OpcUaStatusServer#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaStatusServer()
 * @model
 * @generated
 */
public interface OpcUaStatusServer extends PlainOpcUaPort {
	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' reference.
	 * @see #setOutPort(OutputPort)
	 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#getOpcUaStatusServer_OutPort()
	 * @model required="true"
	 * @generated
	 */
	OutputPort getOutPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.seronetExtension.OpcUaStatusServer#getOutPort <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(OutputPort value);

} // OpcUaStatusServer
