/**
 */
package org.ecore.component.componentDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.AbstractComponentLink#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getAbstractComponentLink()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComponentLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getAbstractComponentLink_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // AbstractComponentLink
