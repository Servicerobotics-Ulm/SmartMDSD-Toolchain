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
package org.eclipse.smartmdsd.ecore.base.mixedport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.mixedport.MixedportPackage
 * @generated
 */
public interface MixedportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MixedportFactory eINSTANCE = org.eclipse.smartmdsd.ecore.base.mixedport.impl.MixedportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mixed Port Opc Ua Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port Opc Ua Base</em>'.
	 * @generated
	 */
	MixedPortOpcUaBase createMixedPortOpcUaBase();

	/**
	 * Returns a new object of class '<em>Mixed Port ROS Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port ROS Base</em>'.
	 * @generated
	 */
	MixedPortROSBase createMixedPortROSBase();

	/**
	 * Returns a new object of class '<em>Mixed Port YARP Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port YARP Base</em>'.
	 * @generated
	 */
	MixedPortYARPBase createMixedPortYARPBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MixedportPackage getMixedportPackage();

} //MixedportFactory
