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
package org.eclipse.smartmdsd.ecore.service.coordinationPattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage
 * @generated
 */
public interface CoordinationPatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoordinationPatternFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl.CoordinationPatternFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>State Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Pattern</em>'.
	 * @generated
	 */
	StatePattern createStatePattern();

	/**
	 * Returns a new object of class '<em>Parameter Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Pattern</em>'.
	 * @generated
	 */
	ParameterPattern createParameterPattern();

	/**
	 * Returns a new object of class '<em>Dynamic Wiring Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Wiring Pattern</em>'.
	 * @generated
	 */
	DynamicWiringPattern createDynamicWiringPattern();

	/**
	 * Returns a new object of class '<em>Monitoring Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring Pattern</em>'.
	 * @generated
	 */
	MonitoringPattern createMonitoringPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoordinationPatternPackage getCoordinationPatternPackage();

} //CoordinationPatternFactory
