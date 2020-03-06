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
package org.eclipse.smartmdsd.ecore.service.communicationPattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage
 * @generated
 */
public interface CommunicationPatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPatternFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Push Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Pattern</em>'.
	 * @generated
	 */
	PushPattern createPushPattern();

	/**
	 * Returns a new object of class '<em>Query Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Pattern</em>'.
	 * @generated
	 */
	QueryPattern createQueryPattern();

	/**
	 * Returns a new object of class '<em>Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Pattern</em>'.
	 * @generated
	 */
	EventPattern createEventPattern();

	/**
	 * Returns a new object of class '<em>Send Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Pattern</em>'.
	 * @generated
	 */
	SendPattern createSendPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationPatternPackage getCommunicationPatternPackage();

} //CommunicationPatternFactory
