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
package org.eclipse.smartmdsd.ecore.component.componentDatasheet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage
 * @generated
 */
public interface ComponentDatasheetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDatasheetFactory eINSTANCE = org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl.ComponentDatasheetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Component Datasheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Datasheet</em>'.
	 * @generated
	 */
	ComponentDatasheet createComponentDatasheet();

	/**
	 * Returns a new object of class '<em>Component Port Datasheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Port Datasheet</em>'.
	 * @generated
	 */
	ComponentPortDatasheet createComponentPortDatasheet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentDatasheetPackage getComponentDatasheetPackage();

} //ComponentDatasheetFactory
