/**
 */
package org.ecore.component.componentDefinition;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentDefinition#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentDefinition#getLogo <em>Logo</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends AbstractDocumentedElement {
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
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.ComponentDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDefinition.AbstractComponentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefinition_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponentElement> getElements();

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefinition_Logo()
	 * @model
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.ComponentDefinition#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

} // ComponentDefinition
