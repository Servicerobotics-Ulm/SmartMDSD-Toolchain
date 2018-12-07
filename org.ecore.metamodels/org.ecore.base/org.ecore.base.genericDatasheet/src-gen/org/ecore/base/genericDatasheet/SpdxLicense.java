/**
 */
package org.ecore.base.genericDatasheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spdx License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.SpdxLicense#getLicenseID <em>License ID</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getSpdxLicense()
 * @model
 * @generated
 */
public interface SpdxLicense extends AbstractLicense {
	/**
	 * Returns the value of the '<em><b>License ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License ID</em>' attribute.
	 * @see #setLicenseID(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getSpdxLicense_LicenseID()
	 * @model required="true"
	 * @generated
	 */
	String getLicenseID();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.SpdxLicense#getLicenseID <em>License ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License ID</em>' attribute.
	 * @see #getLicenseID()
	 * @generated
	 */
	void setLicenseID(String value);

} // SpdxLicense
