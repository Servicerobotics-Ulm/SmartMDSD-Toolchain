/**
 */
package org.ecore.base.genericDatasheet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLicense <em>License</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getShortDescrition <em>Short Descrition</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getSupplierDescription <em>Supplier Description</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.GenericDatasheet#getTrl <em>Trl</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet()
 * @model
 * @generated
 */
public interface GenericDatasheet extends EObject {
	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(AbstractLicense)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_License()
	 * @model containment="true"
	 * @generated
	 */
	AbstractLicense getLicense();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(AbstractLicense value);

	/**
	 * Returns the value of the '<em><b>Short Descrition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Descrition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Descrition</em>' attribute.
	 * @see #setShortDescrition(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_ShortDescrition()
	 * @model required="true"
	 * @generated
	 */
	String getShortDescrition();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getShortDescrition <em>Short Descrition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Descrition</em>' attribute.
	 * @see #getShortDescrition()
	 * @generated
	 */
	void setShortDescrition(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Description</em>' attribute.
	 * @see #setSupplierDescription(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_SupplierDescription()
	 * @model
	 * @generated
	 */
	String getSupplierDescription();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getSupplierDescription <em>Supplier Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Description</em>' attribute.
	 * @see #getSupplierDescription()
	 * @generated
	 */
	void setSupplierDescription(String value);

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Homepage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' attribute.
	 * @see #setHomepage(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_Homepage()
	 * @model
	 * @generated
	 */
	String getHomepage();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getHomepage <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' attribute.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(String value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_BaseURI()
	 * @model required="true"
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Trl</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link org.ecore.base.genericDatasheet.TRL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trl</em>' attribute.
	 * @see org.ecore.base.genericDatasheet.TRL
	 * @see #setTrl(TRL)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheet_Trl()
	 * @model default="Undefined"
	 * @generated
	 */
	TRL getTrl();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getTrl <em>Trl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trl</em>' attribute.
	 * @see org.ecore.base.genericDatasheet.TRL
	 * @see #getTrl()
	 * @generated
	 */
	void setTrl(TRL value);

} // GenericDatasheet
