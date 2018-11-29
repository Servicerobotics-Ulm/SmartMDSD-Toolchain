/**
 */
package org.ecore.component.componentDefinition;

import org.ecore.service.serviceDefinition.TwoWayCommunicationService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.AnswerPort#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getAnswerPort()
 * @model
 * @generated
 */
public interface AnswerPort extends ComponentPort {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(TwoWayCommunicationService)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getAnswerPort_Service()
	 * @model required="true"
	 * @generated
	 */
	TwoWayCommunicationService getService();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.AnswerPort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(TwoWayCommunicationService value);

} // AnswerPort
