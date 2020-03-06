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
package org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.DynamicWiringPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Wiring Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DynamicWiringPatternImpl extends CoordinationPatternImpl implements DynamicWiringPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicWiringPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPatternPackage.Literals.DYNAMIC_WIRING_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void connect(String sourceComponent, String sourcePort, String targetComponent, String targetPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void disconnect(String sourceComponent, String sourcePort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CoordinationPatternPackage.DYNAMIC_WIRING_PATTERN___CONNECT__STRING_STRING_STRING_STRING:
			connect((String) arguments.get(0), (String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
			return null;
		case CoordinationPatternPackage.DYNAMIC_WIRING_PATTERN___DISCONNECT__STRING_STRING:
			disconnect((String) arguments.get(0), (String) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DynamicWiringPatternImpl
