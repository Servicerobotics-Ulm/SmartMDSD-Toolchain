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
package org.eclipse.smartmdsd.ecore.component.componentDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage
 * @generated
 */
public interface ComponentDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDefinitionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Component Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Def Model</em>'.
	 * @generated
	 */
	ComponentDefModel createComponentDefModel();

	/**
	 * Returns a new object of class '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition</em>'.
	 * @generated
	 */
	ComponentDefinition createComponentDefinition();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Input Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Handler</em>'.
	 * @generated
	 */
	InputHandler createInputHandler();

	/**
	 * Returns a new object of class '<em>Service Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Repo Import</em>'.
	 * @generated
	 */
	ServiceRepoImport createServiceRepoImport();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Request Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Port</em>'.
	 * @generated
	 */
	RequestPort createRequestPort();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Answer Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Port</em>'.
	 * @generated
	 */
	AnswerPort createAnswerPort();

	/**
	 * Returns a new object of class '<em>Request Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Handler</em>'.
	 * @generated
	 */
	RequestHandler createRequestHandler();

	/**
	 * Returns a new object of class '<em>Component Sub Node Observer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sub Node Observer</em>'.
	 * @generated
	 */
	ComponentSubNodeObserver createComponentSubNodeObserver();

	/**
	 * Returns a new object of class '<em>Input Port Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port Link</em>'.
	 * @generated
	 */
	InputPortLink createInputPortLink();

	/**
	 * Returns a new object of class '<em>Request Port Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Port Link</em>'.
	 * @generated
	 */
	RequestPortLink createRequestPortLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentDefinitionPackage getComponentDefinitionPackage();

} //ComponentDefinitionFactory
