/**
 */
package org.ecore.service.communicationObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Repository Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.CommRepositoryImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommRepositoryImport()
 * @model
 * @generated
 */
public interface CommRepositoryImport extends EObject {
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
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommRepositoryImport_ImportedNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationObject.CommRepositoryImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

} // CommRepositoryImport
