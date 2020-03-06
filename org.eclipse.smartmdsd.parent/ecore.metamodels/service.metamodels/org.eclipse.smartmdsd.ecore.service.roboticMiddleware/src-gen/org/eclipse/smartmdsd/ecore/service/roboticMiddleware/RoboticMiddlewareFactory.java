/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage
 * @generated
 */
public interface RoboticMiddlewareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboticMiddlewareFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewareFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>ACE Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ACE Smart Soft</em>'.
	 * @generated
	 */
	ACE_SmartSoft createACE_SmartSoft();

	/**
	 * Returns a new object of class '<em>Opc Ua Se Ro Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Se Ro Net</em>'.
	 * @generated
	 */
	OpcUa_SeRoNet createOpcUa_SeRoNet();

	/**
	 * Returns a new object of class '<em>CORBA Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CORBA Smart Soft</em>'.
	 * @generated
	 */
	CORBA_SmartSoft createCORBA_SmartSoft();

	/**
	 * Returns a new object of class '<em>DDS Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDS Smart Soft</em>'.
	 * @generated
	 */
	DDS_SmartSoft createDDS_SmartSoft();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoboticMiddlewarePackage getRoboticMiddlewarePackage();

} //RoboticMiddlewareFactory
