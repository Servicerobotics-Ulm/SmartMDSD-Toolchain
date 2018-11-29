/**
 */
package org.ecore.service.serviceDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Repo Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.CommRepoImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCommRepoImport()
 * @model
 * @generated
 */
public interface CommRepoImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCommRepoImport_ImportedNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CommRepoImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

} // CommRepoImport
