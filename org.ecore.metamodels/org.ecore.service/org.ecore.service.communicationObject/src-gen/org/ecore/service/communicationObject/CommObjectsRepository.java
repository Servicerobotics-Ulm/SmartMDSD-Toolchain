/**
 */
package org.ecore.service.communicationObject;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Objects Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.CommObjectsRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.communicationObject.CommObjectsRepository#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ecore.service.communicationObject.CommObjectsRepository#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ecore.service.communicationObject.CommObjectsRepository#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommObjectsRepository()
 * @model
 * @generated
 */
public interface CommObjectsRepository extends AbstractDocumentedElement {
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
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommObjectsRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationObject.CommObjectsRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.communicationObject.AbstractCommElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommObjectsRepository_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCommElement> getElements();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommObjectsRepository_Version()
	 * @model containment="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationObject.CommObjectsRepository#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute.
	 * @see #setDependency(String)
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommObjectsRepository_Dependency()
	 * @model
	 * @generated
	 */
	String getDependency();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationObject.CommObjectsRepository#getDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' attribute.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(String value);

} // CommObjectsRepository
