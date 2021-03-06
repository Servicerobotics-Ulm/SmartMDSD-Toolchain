/**
 */
package org.ecore.system.datasheetPropertyChecks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasheet Property Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction <em>Function</em>}</li>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit <em>Property Unit</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck()
 * @model
 * @generated
 */
public interface DatasheetPropertyCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.system.datasheetPropertyChecks.EvaluationFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @see #setFunction(EvaluationFunction)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_Function()
	 * @model
	 * @generated
	 */
	EvaluationFunction getFunction();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(EvaluationFunction value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyName()
	 * @model
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.system.datasheetPropertyChecks.EvaluationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @see #setOperator(EvaluationOperator)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_Operator()
	 * @model
	 * @generated
	 */
	EvaluationOperator getOperator();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EvaluationOperator value);

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' attribute.
	 * @see #setPropertyValue(String)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyValue()
	 * @model
	 * @generated
	 */
	String getPropertyValue();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Value</em>' attribute.
	 * @see #getPropertyValue()
	 * @generated
	 */
	void setPropertyValue(String value);

	/**
	 * Returns the value of the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Unit</em>' attribute.
	 * @see #setPropertyUnit(String)
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyUnit()
	 * @model
	 * @generated
	 */
	String getPropertyUnit();

	/**
	 * Sets the value of the '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit <em>Property Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Unit</em>' attribute.
	 * @see #getPropertyUnit()
	 * @generated
	 */
	void setPropertyUnit(String value);

} // DatasheetPropertyCheck
