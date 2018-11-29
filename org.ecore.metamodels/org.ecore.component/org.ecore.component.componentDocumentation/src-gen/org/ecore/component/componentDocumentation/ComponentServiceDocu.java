/**
 */
package org.ecore.component.componentDocumentation;

import org.eclipse.emf.common.util.EList;

import org.ecore.component.componentDefinition.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Service Docu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentServiceDocu#getStates <em>States</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentServiceDocu#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentServiceDocu()
 * @model
 * @generated
 */
public interface ComponentServiceDocu extends AbstractComponentDocuElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDocumentation.AbstractModeDocu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentServiceDocu_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractModeDocu> getStates();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ComponentPort)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentServiceDocu_Port()
	 * @model required="true"
	 * @generated
	 */
	ComponentPort getPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentServiceDocu#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ComponentPort value);

} // ComponentServiceDocu
