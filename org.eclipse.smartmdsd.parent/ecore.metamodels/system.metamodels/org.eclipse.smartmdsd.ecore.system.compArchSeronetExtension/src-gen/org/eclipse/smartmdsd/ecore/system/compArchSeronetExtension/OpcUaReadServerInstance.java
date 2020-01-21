/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opc Ua Read Server Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getReadServer <em>Read Server</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaReadServerInstance()
 * @model
 * @generated
 */
public interface OpcUaReadServerInstance extends ComponentInstanceExtension {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaReadServerInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaReadServerInstance_PortNumber()
	 * @model
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

	/**
	 * Returns the value of the '<em><b>Read Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Server</em>' reference.
	 * @see #setReadServer(OpcUaReadServer)
	 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#getOpcUaReadServerInstance_ReadServer()
	 * @model required="true"
	 * @generated
	 */
	OpcUaReadServer getReadServer();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance#getReadServer <em>Read Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Server</em>' reference.
	 * @see #getReadServer()
	 * @generated
	 */
	void setReadServer(OpcUaReadServer value);

} // OpcUaReadServerInstance
