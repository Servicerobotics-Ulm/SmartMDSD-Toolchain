/**
 */
package org.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.InputPortLink#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.InputPortLink#getInputPort <em>Input Port</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputPortLink()
 * @model
 * @generated
 */
public interface InputPortLink extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputPortLink_Optional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.InputPortLink#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getInputPortLink_InputPort()
	 * @model required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.InputPortLink#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

} // InputPortLink
