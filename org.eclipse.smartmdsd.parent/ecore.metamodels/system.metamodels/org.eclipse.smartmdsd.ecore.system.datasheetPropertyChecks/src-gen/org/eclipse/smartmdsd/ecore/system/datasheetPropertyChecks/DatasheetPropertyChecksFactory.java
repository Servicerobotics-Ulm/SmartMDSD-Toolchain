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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage
 * @generated
 */
public interface DatasheetPropertyChecksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasheetPropertyChecksFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>System Datasheet Property Checks Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Datasheet Property Checks Model</em>'.
	 * @generated
	 */
	SystemDatasheetPropertyChecksModel createSystemDatasheetPropertyChecksModel();

	/**
	 * Returns a new object of class '<em>Datasheet Property Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasheet Property Check</em>'.
	 * @generated
	 */
	DatasheetPropertyCheck createDatasheetPropertyCheck();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasheetPropertyChecksPackage getDatasheetPropertyChecksPackage();

} //DatasheetPropertyChecksFactory
