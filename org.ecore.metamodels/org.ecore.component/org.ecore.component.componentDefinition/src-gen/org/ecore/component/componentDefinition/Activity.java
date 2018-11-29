/**
 */
package org.ecore.component.componentDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.Activity#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ComponentSubNode {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDefinition.ActivityExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getActivity_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityExtension> getExtensions();

} // Activity
