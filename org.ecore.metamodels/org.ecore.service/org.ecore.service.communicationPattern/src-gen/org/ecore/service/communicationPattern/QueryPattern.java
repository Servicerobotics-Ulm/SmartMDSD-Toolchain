/**
 */
package org.ecore.service.communicationPattern;

import org.ecore.service.communicationObject.CommunicationObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationPattern.QueryPattern#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.ecore.service.communicationPattern.QueryPattern#getAnswerType <em>Answer Type</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getQueryPattern()
 * @model
 * @generated
 */
public interface QueryPattern extends RequestAnswerPattern {
	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' reference.
	 * @see #setRequestType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getQueryPattern_RequestType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getRequestType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.QueryPattern#getRequestType <em>Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' reference.
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(CommunicationObject value);

	/**
	 * Returns the value of the '<em><b>Answer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Type</em>' reference.
	 * @see #setAnswerType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getQueryPattern_AnswerType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getAnswerType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.QueryPattern#getAnswerType <em>Answer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Type</em>' reference.
	 * @see #getAnswerType()
	 * @generated
	 */
	void setAnswerType(CommunicationObject value);

} // QueryPattern
