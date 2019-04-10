/**
 */
package org.ecore.component.coordinationExtension;

import org.eclipse.emf.common.util.EList;

import org.ecore.component.componentDefinition.NamedComponentElement;

import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Slave Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.CoordinationSlavePort#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.CoordinationSlavePort#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort()
 * @model
 * @generated
 */
public interface CoordinationSlavePort extends NamedComponentElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.coordinationExtension.AbstractCoordinationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCoordinationElement> getElements();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(CoordinationServiceDefinition)
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationSlavePort_Service()
	 * @model required="true"
	 * @generated
	 */
	CoordinationServiceDefinition getService();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.CoordinationSlavePort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CoordinationServiceDefinition value);

} // CoordinationSlavePort
