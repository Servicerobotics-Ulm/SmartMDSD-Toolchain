/**
 */
package org.ecore.component.componentDocumentation;

import org.ecore.component.coordinationExtension.PublicOperationMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Mode Docu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentModeDocu#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentModeDocu()
 * @model
 * @generated
 */
public interface ComponentModeDocu extends AbstractModeDocu {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(PublicOperationMode)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentModeDocu_Mode()
	 * @model required="true"
	 * @generated
	 */
	PublicOperationMode getMode();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentModeDocu#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PublicOperationMode value);

} // ComponentModeDocu
