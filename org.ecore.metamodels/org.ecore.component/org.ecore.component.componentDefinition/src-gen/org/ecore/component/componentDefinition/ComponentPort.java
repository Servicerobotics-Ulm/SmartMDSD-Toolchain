/**
 */
package org.ecore.component.componentDefinition;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentPort#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentPort()
 * @model abstract="true"
 * @generated
 */
public interface ComponentPort extends NamedComponentElement, AbstractDocumentedElement {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDefinition.ComponentPortExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentPort_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentPortExtension> getExtensions();

} // ComponentPort
