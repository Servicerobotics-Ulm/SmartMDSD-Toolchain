/**
 */
package org.ecore.base.stateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.stateMachine.StateTransition#getFrom <em>From</em>}</li>
 *   <li>{@link org.ecore.base.stateMachine.StateTransition#getTo <em>To</em>}</li>
 *   <li>{@link org.ecore.base.stateMachine.StateTransition#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.stateMachine.StateMachinePackage#getStateTransition()
 * @model
 * @generated
 */
public interface StateTransition extends AbstractMachineElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractStateElement)
	 * @see org.ecore.base.stateMachine.StateMachinePackage#getStateTransition_From()
	 * @model required="true"
	 * @generated
	 */
	AbstractStateElement getFrom();

	/**
	 * Sets the value of the '{@link org.ecore.base.stateMachine.StateTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractStateElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractStateElement)
	 * @see org.ecore.base.stateMachine.StateMachinePackage#getStateTransition_To()
	 * @model required="true"
	 * @generated
	 */
	AbstractStateElement getTo();

	/**
	 * Sets the value of the '{@link org.ecore.base.stateMachine.StateTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractStateElement value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.base.stateMachine.VisibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.ecore.base.stateMachine.VisibilityType
	 * @see #setVisibility(VisibilityType)
	 * @see org.ecore.base.stateMachine.StateMachinePackage#getStateTransition_Visibility()
	 * @model required="true"
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link org.ecore.base.stateMachine.StateTransition#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.ecore.base.stateMachine.VisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

} // StateTransition
