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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Wiring Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getDynamicWiringPattern()
 * @model
 * @generated
 */
public interface DynamicWiringPattern extends CoordinationPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connect(String sourceComponent, String sourcePort, String targetComponent, String targetPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disconnect(String sourceComponent, String sourcePort);

} // DynamicWiringPattern
