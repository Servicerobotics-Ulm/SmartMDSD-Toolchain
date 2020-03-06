/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.base.mixedport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.base.mixedport.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MixedportFactoryImpl extends EFactoryImpl implements MixedportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MixedportFactory init() {
		try {
			MixedportFactory theMixedportFactory = (MixedportFactory) EPackage.Registry.INSTANCE
					.getEFactory(MixedportPackage.eNS_URI);
			if (theMixedportFactory != null) {
				return theMixedportFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MixedportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedportFactoryImpl() {
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
		case MixedportPackage.MIXED_PORT_OPC_UA_BASE:
			return createMixedPortOpcUaBase();
		case MixedportPackage.MIXED_PORT_ROS_BASE:
			return createMixedPortROSBase();
		case MixedportPackage.MIXED_PORT_YARP_BASE:
			return createMixedPortYARPBase();
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
	public MixedPortOpcUaBase createMixedPortOpcUaBase() {
		MixedPortOpcUaBaseImpl mixedPortOpcUaBase = new MixedPortOpcUaBaseImpl();
		return mixedPortOpcUaBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortROSBase createMixedPortROSBase() {
		MixedPortROSBaseImpl mixedPortROSBase = new MixedPortROSBaseImpl();
		return mixedPortROSBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortYARPBase createMixedPortYARPBase() {
		MixedPortYARPBaseImpl mixedPortYARPBase = new MixedPortYARPBaseImpl();
		return mixedPortYARPBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedportPackage getMixedportPackage() {
		return (MixedportPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MixedportPackage getPackage() {
		return MixedportPackage.eINSTANCE;
	}

} //MixedportFactoryImpl
