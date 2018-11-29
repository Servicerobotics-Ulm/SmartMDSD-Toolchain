/**
 */
package org.ecore.component.componentDocumentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Docu Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getAbstractComponentDocuElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComponentDocuElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getAbstractComponentDocuElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AbstractComponentDocuElement
