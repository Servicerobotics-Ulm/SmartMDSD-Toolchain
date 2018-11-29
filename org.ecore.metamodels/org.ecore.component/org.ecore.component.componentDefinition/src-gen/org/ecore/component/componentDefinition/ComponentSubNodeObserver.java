/**
 */
package org.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Sub Node Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.ComponentSubNodeObserver#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentSubNodeObserver()
 * @model
 * @generated
 */
public interface ComponentSubNodeObserver extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(ComponentSubNode)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getComponentSubNodeObserver_Subject()
	 * @model required="true"
	 * @generated
	 */
	ComponentSubNode getSubject();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.ComponentSubNodeObserver#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(ComponentSubNode value);

} // ComponentSubNodeObserver
