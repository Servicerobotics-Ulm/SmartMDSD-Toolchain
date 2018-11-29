/**
 */
package org.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.RequestHandler#isActiveQueue <em>Active Queue</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.RequestHandler#getAnswerPort <em>Answer Port</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getRequestHandler()
 * @model
 * @generated
 */
public interface RequestHandler extends ComponentSubNode {
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
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getRequestHandler_ActiveQueue()
	 * @model required="true"
	 * @generated
	 */
	boolean isActiveQueue();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.RequestHandler#isActiveQueue <em>Active Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Queue</em>' attribute.
	 * @see #isActiveQueue()
	 * @generated
	 */
	void setActiveQueue(boolean value);

	/**
	 * Returns the value of the '<em><b>Answer Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Port</em>' reference.
	 * @see #setAnswerPort(AnswerPort)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getRequestHandler_AnswerPort()
	 * @model required="true"
	 * @generated
	 */
	AnswerPort getAnswerPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.RequestHandler#getAnswerPort <em>Answer Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Port</em>' reference.
	 * @see #getAnswerPort()
	 * @generated
	 */
	void setAnswerPort(AnswerPort value);

} // RequestHandler
