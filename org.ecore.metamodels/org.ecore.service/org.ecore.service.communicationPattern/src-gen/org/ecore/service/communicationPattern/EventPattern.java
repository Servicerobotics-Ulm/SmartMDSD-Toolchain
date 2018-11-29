/**
 */
package org.ecore.service.communicationPattern;

import org.ecore.service.communicationObject.CommunicationObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationPattern.EventPattern#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.ecore.service.communicationPattern.EventPattern#getActivationType <em>Activation Type</em>}</li>
 *   <li>{@link org.ecore.service.communicationPattern.EventPattern#getEventStateType <em>Event State Type</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getEventPattern()
 * @model
 * @generated
 */
public interface EventPattern extends ForkingPattern {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getEventPattern_EventType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getEventType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.EventPattern#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(CommunicationObject value);

	/**
	 * Returns the value of the '<em><b>Activation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Type</em>' reference.
	 * @see #setActivationType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getEventPattern_ActivationType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getActivationType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.EventPattern#getActivationType <em>Activation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Type</em>' reference.
	 * @see #getActivationType()
	 * @generated
	 */
	void setActivationType(CommunicationObject value);

	/**
	 * Returns the value of the '<em><b>Event State Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event State Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event State Type</em>' reference.
	 * @see #setEventStateType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getEventPattern_EventStateType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getEventStateType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.EventPattern#getEventStateType <em>Event State Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event State Type</em>' reference.
	 * @see #getEventStateType()
	 * @generated
	 */
	void setEventStateType(CommunicationObject value);

} // EventPattern
