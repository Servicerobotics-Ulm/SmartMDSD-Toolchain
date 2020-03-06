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
package org.eclipse.smartmdsd.ecore.base.genericDatasheet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage
 * @generated
 */
public interface GenericDatasheetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDatasheetFactory eINSTANCE = org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Datasheet Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasheet Property</em>'.
	 * @generated
	 */
	DatasheetProperty createDatasheetProperty();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	GenericDatasheetModel createGenericDatasheetModel();

	/**
	 * Returns a new object of class '<em>Mandatory Datasheet Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Datasheet Element</em>'.
	 * @generated
	 */
	MandatoryDatasheetElement createMandatoryDatasheetElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericDatasheetPackage getGenericDatasheetPackage();

} //GenericDatasheetFactory
