/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.service.serviceDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage
 * @generated
 */
public interface ServiceDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceDefinitionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Service Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Def Model</em>'.
	 * @generated
	 */
	ServiceDefModel createServiceDefModel();

	/**
	 * Returns a new object of class '<em>Service Def Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Def Repository</em>'.
	 * @generated
	 */
	ServiceDefRepository createServiceDefRepository();

	/**
	 * Returns a new object of class '<em>Comm Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Repo Import</em>'.
	 * @generated
	 */
	CommRepoImport createCommRepoImport();

	/**
	 * Returns a new object of class '<em>Service Repo Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Repo Version</em>'.
	 * @generated
	 */
	ServiceRepoVersion createServiceRepoVersion();

	/**
	 * Returns a new object of class '<em>Service Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Property</em>'.
	 * @generated
	 */
	ServiceProperty createServiceProperty();

	/**
	 * Returns a new object of class '<em>Coordination Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Service Definition</em>'.
	 * @generated
	 */
	CoordinationServiceDefinition createCoordinationServiceDefinition();

	/**
	 * Returns a new object of class '<em>Forking Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forking Service Definition</em>'.
	 * @generated
	 */
	ForkingServiceDefinition createForkingServiceDefinition();

	/**
	 * Returns a new object of class '<em>Request Answer Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Answer Service Definition</em>'.
	 * @generated
	 */
	RequestAnswerServiceDefinition createRequestAnswerServiceDefinition();

	/**
	 * Returns a new object of class '<em>Communication Service Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Service Usage</em>'.
	 * @generated
	 */
	CommunicationServiceUsage createCommunicationServiceUsage();

	/**
	 * Returns a new object of class '<em>Joining Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joining Service Definition</em>'.
	 * @generated
	 */
	JoiningServiceDefinition createJoiningServiceDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServiceDefinitionPackage getServiceDefinitionPackage();

} //ServiceDefinitionFactory
