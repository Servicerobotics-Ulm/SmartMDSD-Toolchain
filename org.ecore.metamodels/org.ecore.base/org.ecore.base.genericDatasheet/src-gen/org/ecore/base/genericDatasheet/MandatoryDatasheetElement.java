/**
 */
package org.ecore.base.genericDatasheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Datasheet Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.MandatoryDatasheetElement#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.MandatoryDatasheetElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getMandatoryDatasheetElement()
 * @model
 * @generated
 */
public interface MandatoryDatasheetElement extends AbstractDatasheetElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
	 * @see #setName(MandatoryDatasheetElementNames)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getMandatoryDatasheetElement_Name()
	 * @model required="true"
	 * @generated
	 */
	MandatoryDatasheetElementNames getName();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.MandatoryDatasheetElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
	 * @see #getName()
	 * @generated
	 */
	void setName(MandatoryDatasheetElementNames value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getMandatoryDatasheetElement_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.MandatoryDatasheetElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MandatoryDatasheetElement
