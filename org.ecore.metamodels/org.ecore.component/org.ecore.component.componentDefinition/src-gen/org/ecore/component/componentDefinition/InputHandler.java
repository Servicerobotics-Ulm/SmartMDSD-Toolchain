/**
 */
package org.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.InputHandler#isActiveQueue <em>Active Queue</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.InputHandler#getInputPort <em>Input Port</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputHandler()
 * @model
 * @generated
 */
public interface InputHandler extends ComponentSubNode {
	/**
	 * Returns the value of the '<em><b>Active Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Queue</em>' attribute.
	 * @see #setActiveQueue(boolean)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputHandler_ActiveQueue()
	 * @model required="true"
	 * @generated
	 */
	boolean isActiveQueue();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.InputHandler#isActiveQueue <em>Active Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Queue</em>' attribute.
	 * @see #isActiveQueue()
	 * @generated
	 */
	void setActiveQueue(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputHandler_InputPort()
	 * @model required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.InputHandler#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

} // InputHandler
