/**
 */
package org.ecore.base.genericDatasheet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasheet Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.DatasheetProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.DatasheetProperty#getValue <em>Value</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.DatasheetProperty#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.DatasheetProperty#getSemanticID <em>Semantic ID</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.DatasheetProperty#getShortDescription <em>Short Description</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty()
 * @model
 * @generated
 */
public interface DatasheetProperty extends AbstractDatasheetElement {
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
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.DatasheetProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.DatasheetProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.DatasheetProperty#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Semantic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic ID</em>' attribute.
	 * @see #setSemanticID(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty_SemanticID()
	 * @model
	 * @generated
	 */
	String getSemanticID();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.DatasheetProperty#getSemanticID <em>Semantic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic ID</em>' attribute.
	 * @see #getSemanticID()
	 * @generated
	 */
	void setSemanticID(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#getDatasheetProperty_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link org.ecore.base.genericDatasheet.DatasheetProperty#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

} // DatasheetProperty
