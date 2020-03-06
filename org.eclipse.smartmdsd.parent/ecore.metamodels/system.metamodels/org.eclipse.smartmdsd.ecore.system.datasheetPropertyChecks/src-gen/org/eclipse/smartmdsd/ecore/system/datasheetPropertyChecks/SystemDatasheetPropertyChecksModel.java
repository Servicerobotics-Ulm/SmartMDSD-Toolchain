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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Datasheet Property Checks Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getChecks <em>Checks</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel()
 * @model
 * @generated
 */
public interface SystemDatasheetPropertyChecksModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasheetPropertyCheck> getChecks();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(SystemComponentArchitecture)
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getSystemDatasheetPropertyChecksModel_System()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentArchitecture getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemComponentArchitecture value);

} // SystemDatasheetPropertyChecksModel
