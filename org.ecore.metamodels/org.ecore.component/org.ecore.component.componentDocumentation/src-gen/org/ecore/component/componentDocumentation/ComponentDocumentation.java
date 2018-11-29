/**
 */
package org.ecore.component.componentDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getLicense <em>License</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation()
 * @model
 * @generated
 */
public interface ComponentDocumentation extends EObject {
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
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' attribute.
	 * @see #setHardware(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_Hardware()
	 * @model
	 * @generated
	 */
	String getHardware();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getComponentDocumentation_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComponentDocuElement> getElements();

} // ComponentDocumentation
