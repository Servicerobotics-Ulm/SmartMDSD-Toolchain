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
package org.eclipse.smartmdsd.ecore.system.systemDatasheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetFactory
 * @model kind="package"
 * @generated
 */
public interface SystemDatasheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systemDatasheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/system/systemDatasheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "systemDatasheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemDatasheetPackage eINSTANCE = org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetImpl <em>System Datasheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetImpl
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetPackageImpl#getSystemDatasheet()
	 * @generated
	 */
	int SYSTEM_DATASHEET = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET__ELEMENTS = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET__NAME = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_FEATURE_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_OPERATION_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet <em>System Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Datasheet</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet
	 * @generated
	 */
	EClass getSystemDatasheet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet#getName()
	 * @see #getSystemDatasheet()
	 * @generated
	 */
	EAttribute getSystemDatasheet_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemDatasheetFactory getSystemDatasheetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetImpl <em>System Datasheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetImpl
		 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetPackageImpl#getSystemDatasheet()
		 * @generated
		 */
		EClass SYSTEM_DATASHEET = eINSTANCE.getSystemDatasheet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DATASHEET__NAME = eINSTANCE.getSystemDatasheet_Name();

	}

} //SystemDatasheetPackage
