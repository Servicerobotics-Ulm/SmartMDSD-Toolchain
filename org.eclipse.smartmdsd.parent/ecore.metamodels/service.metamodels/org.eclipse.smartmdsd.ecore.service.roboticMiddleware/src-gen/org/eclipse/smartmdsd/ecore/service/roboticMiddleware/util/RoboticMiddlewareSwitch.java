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
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage
 * @generated
 */
public class RoboticMiddlewareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboticMiddlewarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticMiddlewareSwitch() {
		if (modelPackage == null) {
			modelPackage = RoboticMiddlewarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RoboticMiddlewarePackage.ROBOTIC_MIDDLEWARE: {
			RoboticMiddleware roboticMiddleware = (RoboticMiddleware) theEObject;
			T result = caseRoboticMiddleware(roboticMiddleware);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RoboticMiddlewarePackage.ACE_SMART_SOFT: {
			ACE_SmartSoft acE_SmartSoft = (ACE_SmartSoft) theEObject;
			T result = caseACE_SmartSoft(acE_SmartSoft);
			if (result == null)
				result = caseRoboticMiddleware(acE_SmartSoft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RoboticMiddlewarePackage.OPC_UA_SE_RO_NET: {
			OpcUa_SeRoNet opcUa_SeRoNet = (OpcUa_SeRoNet) theEObject;
			T result = caseOpcUa_SeRoNet(opcUa_SeRoNet);
			if (result == null)
				result = caseRoboticMiddleware(opcUa_SeRoNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RoboticMiddlewarePackage.CORBA_SMART_SOFT: {
			CORBA_SmartSoft corbA_SmartSoft = (CORBA_SmartSoft) theEObject;
			T result = caseCORBA_SmartSoft(corbA_SmartSoft);
			if (result == null)
				result = caseRoboticMiddleware(corbA_SmartSoft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RoboticMiddlewarePackage.DDS_SMART_SOFT: {
			DDS_SmartSoft ddS_SmartSoft = (DDS_SmartSoft) theEObject;
			T result = caseDDS_SmartSoft(ddS_SmartSoft);
			if (result == null)
				result = caseRoboticMiddleware(ddS_SmartSoft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robotic Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robotic Middleware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoboticMiddleware(RoboticMiddleware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACE Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACE Smart Soft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACE_SmartSoft(ACE_SmartSoft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opc Ua Se Ro Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opc Ua Se Ro Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcUa_SeRoNet(OpcUa_SeRoNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORBA Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORBA Smart Soft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORBA_SmartSoft(CORBA_SmartSoft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDS Smart Soft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDS Smart Soft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDS_SmartSoft(DDS_SmartSoft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RoboticMiddlewareSwitch
