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
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboticMiddlewareFactoryImpl extends EFactoryImpl implements RoboticMiddlewareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoboticMiddlewareFactory init() {
		try {
			RoboticMiddlewareFactory theRoboticMiddlewareFactory = (RoboticMiddlewareFactory) EPackage.Registry.INSTANCE
					.getEFactory(RoboticMiddlewarePackage.eNS_URI);
			if (theRoboticMiddlewareFactory != null) {
				return theRoboticMiddlewareFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoboticMiddlewareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticMiddlewareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RoboticMiddlewarePackage.ACE_SMART_SOFT:
			return createACE_SmartSoft();
		case RoboticMiddlewarePackage.OPC_UA_SE_RO_NET:
			return createOpcUa_SeRoNet();
		case RoboticMiddlewarePackage.CORBA_SMART_SOFT:
			return createCORBA_SmartSoft();
		case RoboticMiddlewarePackage.DDS_SMART_SOFT:
			return createDDS_SmartSoft();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ACE_SmartSoft createACE_SmartSoft() {
		ACE_SmartSoftImpl acE_SmartSoft = new ACE_SmartSoftImpl();
		return acE_SmartSoft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpcUa_SeRoNet createOpcUa_SeRoNet() {
		OpcUa_SeRoNetImpl opcUa_SeRoNet = new OpcUa_SeRoNetImpl();
		return opcUa_SeRoNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CORBA_SmartSoft createCORBA_SmartSoft() {
		CORBA_SmartSoftImpl corbA_SmartSoft = new CORBA_SmartSoftImpl();
		return corbA_SmartSoft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDS_SmartSoft createDDS_SmartSoft() {
		DDS_SmartSoftImpl ddS_SmartSoft = new DDS_SmartSoftImpl();
		return ddS_SmartSoft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoboticMiddlewarePackage getRoboticMiddlewarePackage() {
		return (RoboticMiddlewarePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoboticMiddlewarePackage getPackage() {
		return RoboticMiddlewarePackage.eINSTANCE;
	}

} //RoboticMiddlewareFactoryImpl
