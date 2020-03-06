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
package org.eclipse.smartmdsd.ecore.service.parameterDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage
 * @generated
 */
public interface ParameterDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterDefinitionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.parameterDefinition.impl.ParameterDefinitionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Param Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Def Model</em>'.
	 * @generated
	 */
	ParamDefModel createParamDefModel();

	/**
	 * Returns a new object of class '<em>Parameter Set Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set Repository</em>'.
	 * @generated
	 */
	ParameterSetRepository createParameterSetRepository();

	/**
	 * Returns a new object of class '<em>Parameter Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set Definition</em>'.
	 * @generated
	 */
	ParameterSetDefinition createParameterSetDefinition();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Definition</em>'.
	 * @generated
	 */
	TriggerDefinition createTriggerDefinition();

	/**
	 * Returns a new object of class '<em>Param Def Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Def Repo Import</em>'.
	 * @generated
	 */
	ParamDefRepoImport createParamDefRepoImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParameterDefinitionPackage getParameterDefinitionPackage();

} //ParameterDefinitionFactory
