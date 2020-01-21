/**
 */
package org.eclipse.smartmdsd.ecore.system.systemDatasheet;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetPackage#getSystemDatasheet()
 * @model
 * @generated
 */
public interface SystemDatasheet extends GenericDatasheetModel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetPackage#getSystemDatasheet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SystemDatasheet
