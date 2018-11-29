/**
 */
package org.ecore.system.componentArchitecture;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.ServiceInstance#getPort <em>Port</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.ServiceInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getServiceInstance()
 * @model abstract="true"
 * @generated
 */
public interface ServiceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ComponentPort)
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getServiceInstance_Port()
	 * @model required="true"
	 * @generated
	 */
	ComponentPort getPort();

	/**
	 * Sets the value of the '{@link org.ecore.system.componentArchitecture.ServiceInstance#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ComponentPort value);

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
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getServiceInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.system.componentArchitecture.ServiceInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // ServiceInstance
