/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Sub Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentSubNode()
 * @model abstract="true"
 * @generated
 */
public interface ComponentSubNode extends NamedComponentElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentSubNode_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponentLink> getLinks();

} // ComponentSubNode
