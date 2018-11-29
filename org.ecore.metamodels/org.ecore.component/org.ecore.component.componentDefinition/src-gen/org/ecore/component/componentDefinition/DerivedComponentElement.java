/**
 */
package org.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Component Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.DerivedComponentElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getDerivedComponentElement()
 * @model abstract="true"
 * @generated
 */
public interface DerivedComponentElement extends AbstractComponentElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getDerivedComponentElement_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.component.componentDefinition.DerivedComponentElement#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // DerivedComponentElement
