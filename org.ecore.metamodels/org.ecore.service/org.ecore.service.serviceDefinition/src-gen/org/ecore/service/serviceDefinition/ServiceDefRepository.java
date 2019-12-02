/**
 */
package org.ecore.service.serviceDefinition;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.ServiceDefRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.ServiceDefRepository#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.ServiceDefRepository#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefRepository()
 * @model
 * @generated
 */
public interface ServiceDefRepository extends AbstractDocumentedElement {
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
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.ServiceDefRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(ServiceRepoVersion)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefRepository_Version()
	 * @model containment="true"
	 * @generated
	 */
	ServiceRepoVersion getVersion();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.ServiceDefRepository#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(ServiceRepoVersion value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.serviceDefinition.AbstractServiceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getServiceDefRepository_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractServiceDefinition> getServices();

} // ServiceDefRepository
