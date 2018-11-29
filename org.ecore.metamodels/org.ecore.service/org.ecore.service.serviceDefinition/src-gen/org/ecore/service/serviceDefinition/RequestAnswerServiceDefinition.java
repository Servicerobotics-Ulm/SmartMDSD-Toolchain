/**
 */
package org.ecore.service.serviceDefinition;

import org.ecore.service.communicationPattern.RequestAnswerPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Answer Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getRequestAnswerServiceDefinition()
 * @model
 * @generated
 */
public interface RequestAnswerServiceDefinition extends TwoWayCommunicationService {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(RequestAnswerPattern)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getRequestAnswerServiceDefinition_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequestAnswerPattern getPattern();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(RequestAnswerPattern value);

} // RequestAnswerServiceDefinition
