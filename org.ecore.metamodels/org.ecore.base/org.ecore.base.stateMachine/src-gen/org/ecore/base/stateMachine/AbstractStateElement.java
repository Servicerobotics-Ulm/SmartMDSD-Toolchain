/**
 */
package org.ecore.base.stateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.stateMachine.AbstractStateElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.stateMachine.StateMachinePackage#getAbstractStateElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractStateElement extends AbstractMachineElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.base.stateMachine.StateMachinePackage#getAbstractStateElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.base.stateMachine.AbstractStateElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractStateElement
