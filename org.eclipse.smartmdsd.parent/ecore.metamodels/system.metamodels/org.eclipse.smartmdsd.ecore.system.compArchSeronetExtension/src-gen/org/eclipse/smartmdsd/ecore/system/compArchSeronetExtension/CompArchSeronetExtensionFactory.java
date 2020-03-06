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
package org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage
 * @generated
 */
public interface CompArchSeronetExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompArchSeronetExtensionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl.CompArchSeronetExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Opc Ua Device Client Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Device Client Instance</em>'.
	 * @generated
	 */
	OpcUaDeviceClientInstance createOpcUaDeviceClientInstance();

	/**
	 * Returns a new object of class '<em>Opc Ua Read Server Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Read Server Instance</em>'.
	 * @generated
	 */
	OpcUaReadServerInstance createOpcUaReadServerInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompArchSeronetExtensionPackage getCompArchSeronetExtensionPackage();

} //CompArchSeronetExtensionFactory
