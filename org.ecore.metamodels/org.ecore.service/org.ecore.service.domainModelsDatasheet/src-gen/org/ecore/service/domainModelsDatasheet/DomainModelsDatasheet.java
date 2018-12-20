/**
 */
package org.ecore.service.domainModelsDatasheet;

import org.ecore.base.genericDatasheet.GenericDatasheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Models Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage#getDomainModelsDatasheet()
 * @model
 * @generated
 */
public interface DomainModelsDatasheet extends GenericDatasheet {
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
	 * @see org.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage#getDomainModelsDatasheet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DomainModelsDatasheet
