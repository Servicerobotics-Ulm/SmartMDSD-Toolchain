/**
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Service Usage Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getServiceUsage <em>Service Usage</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getComponentPort <em>Component Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCommunicationServiceUsageRealization()
 * @model
 * @generated
 */
public interface CommunicationServiceUsageRealization extends AbstractCoordinationElement {
	/**
	 * Returns the value of the '<em><b>Service Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Usage</em>' reference.
	 * @see #setServiceUsage(CommunicationServiceUsage)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCommunicationServiceUsageRealization_ServiceUsage()
	 * @model required="true"
	 * @generated
	 */
	CommunicationServiceUsage getServiceUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getServiceUsage <em>Service Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Usage</em>' reference.
	 * @see #getServiceUsage()
	 * @generated
	 */
	void setServiceUsage(CommunicationServiceUsage value);

	/**
	 * Returns the value of the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Port</em>' reference.
	 * @see #setComponentPort(ComponentPort)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCommunicationServiceUsageRealization_ComponentPort()
	 * @model required="true"
	 * @generated
	 */
	ComponentPort getComponentPort();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getComponentPort <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Port</em>' reference.
	 * @see #getComponentPort()
	 * @generated
	 */
	void setComponentPort(ComponentPort value);

} // CommunicationServiceUsageRealization
