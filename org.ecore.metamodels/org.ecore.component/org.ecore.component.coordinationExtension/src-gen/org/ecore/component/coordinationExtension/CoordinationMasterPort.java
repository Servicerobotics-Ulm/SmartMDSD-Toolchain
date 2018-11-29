/**
 */
package org.ecore.component.coordinationExtension;

import org.ecore.component.componentDefinition.NamedComponentElement;
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Master Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.CoordinationMasterPort#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationMasterPort()
 * @model
 * @generated
 */
public interface CoordinationMasterPort extends NamedComponentElement {
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
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getCoordinationMasterPort_Service()
	 * @model required="true"
	 * @generated
	 */
	CoordinationServiceDefinition getService();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.CoordinationMasterPort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CoordinationServiceDefinition value);

} // CoordinationMasterPort
