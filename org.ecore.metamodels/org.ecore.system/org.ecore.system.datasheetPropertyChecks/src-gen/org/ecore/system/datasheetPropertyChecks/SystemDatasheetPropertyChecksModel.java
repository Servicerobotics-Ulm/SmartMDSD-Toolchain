/**
 */
package org.ecore.system.datasheetPropertyChecks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.system.componentArchitecture.SystemComponentArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Datasheet Property Checks Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getChecks <em>Checks</em>}</li>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel()
 * @model
 * @generated
 */
public interface SystemDatasheetPropertyChecksModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasheetPropertyCheck> getChecks();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(SystemComponentArchitecture)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel_System()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentArchitecture getSystem();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemComponentArchitecture value);

} // SystemDatasheetPropertyChecksModel
