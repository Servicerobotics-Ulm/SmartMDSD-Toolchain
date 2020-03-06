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
package org.eclipse.smartmdsd.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Way Communication Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OneWayCommunicationPatternImpl extends CommunicationPatternImpl
		implements OneWayCommunicationPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneWayCommunicationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.ONE_WAY_COMMUNICATION_PATTERN;
	}

} //OneWayCommunicationPatternImpl
