/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks;

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
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit <em>Property Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck()
 * @model
 * @generated
 */
public interface DatasheetPropertyCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @see #setFunction(EvaluationFunction)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_Function()
	 * @model
	 * @generated
	 */
	EvaluationFunction getFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(EvaluationFunction value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyName()
	 * @model
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @see #setOperator(EvaluationOperator)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_Operator()
	 * @model
	 * @generated
	 */
	EvaluationOperator getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EvaluationOperator value);

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' attribute.
	 * @see #setPropertyValue(String)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyValue()
	 * @model
	 * @generated
	 */
	String getPropertyValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue <em>Property Value</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Unit</em>' attribute.
	 * @see #setPropertyUnit(String)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getDatasheetPropertyCheck_PropertyUnit()
	 * @model
	 * @generated
	 */
	String getPropertyUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit <em>Property Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Unit</em>' attribute.
	 * @see #getPropertyUnit()
	 * @generated
	 */
	void setPropertyUnit(String value);

} // DatasheetPropertyCheck
