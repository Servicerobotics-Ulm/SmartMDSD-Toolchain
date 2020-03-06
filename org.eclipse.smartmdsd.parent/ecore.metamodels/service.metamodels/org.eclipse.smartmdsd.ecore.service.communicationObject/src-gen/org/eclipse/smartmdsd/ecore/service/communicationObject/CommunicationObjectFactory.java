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
package org.eclipse.smartmdsd.ecore.service.communicationObject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage
 * @generated
 */
public interface CommunicationObjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationObjectFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommunicationObjectFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Comm Object Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Object Model</em>'.
	 * @generated
	 */
	CommObjectModel createCommObjectModel();

	/**
	 * Returns a new object of class '<em>Comm Objects Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Objects Repository</em>'.
	 * @generated
	 */
	CommObjectsRepository createCommObjectsRepository();

	/**
	 * Returns a new object of class '<em>Comm Repository Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Repository Import</em>'.
	 * @generated
	 */
	CommRepositoryImport createCommRepositoryImport();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Communication Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Object</em>'.
	 * @generated
	 */
	CommunicationObject createCommunicationObject();

	/**
	 * Returns a new object of class '<em>Comm Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Element Value</em>'.
	 * @generated
	 */
	CommElementValue createCommElementValue();

	/**
	 * Returns a new object of class '<em>Comm Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Element Reference</em>'.
	 * @generated
	 */
	CommElementReference createCommElementReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationObjectPackage getCommunicationObjectPackage();

} //CommunicationObjectFactory
