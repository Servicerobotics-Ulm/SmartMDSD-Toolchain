/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Port Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink#getRequestPort <em>Request Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage#getRequestPortLink()
 * @model
 * @generated
 */
public interface RequestPortLink extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Request Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Port</em>' reference.
	 * @see #setRequestPort(RequestPort)
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage#getRequestPortLink_RequestPort()
	 * @model required="true"
	 * @generated
	 */
	RequestPort getRequestPort();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink#getRequestPort <em>Request Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Port</em>' reference.
	 * @see #getRequestPort()
	 * @generated
	 */
	void setRequestPort(RequestPort value);

} // RequestPortLink
