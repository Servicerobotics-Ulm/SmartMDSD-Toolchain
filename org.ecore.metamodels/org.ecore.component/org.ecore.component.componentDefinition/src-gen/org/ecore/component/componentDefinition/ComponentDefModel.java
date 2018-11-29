/**
 */
package org.ecore.component.componentDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Def Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentDefModel#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentDefModel#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefModel()
 * @model
 * @generated
 */
public interface ComponentDefModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefModel_Component()
	 * @model containment="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.ComponentDefModel#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDefinition.ServiceRepoImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentDefModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceRepoImport> getImports();

} // ComponentDefModel
