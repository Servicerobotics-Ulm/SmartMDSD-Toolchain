/**
 */
package org.ecore.service.serviceDefinition;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.AbstractServiceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.AbstractServiceDefinition#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getAbstractServiceDefinition()
 * @model abstract="true"
 * @generated
 */
public interface AbstractServiceDefinition extends AbstractDocumentedElement {
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
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getAbstractServiceDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.AbstractServiceDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.serviceDefinition.ServiceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getAbstractServiceDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceProperty> getProperties();

} // AbstractServiceDefinition
