/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CauseEffectChainFactoryImpl extends EFactoryImpl implements CauseEffectChainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CauseEffectChainFactory init() {
		try {
			CauseEffectChainFactory theCauseEffectChainFactory = (CauseEffectChainFactory) EPackage.Registry.INSTANCE
					.getEFactory(CauseEffectChainPackage.eNS_URI);
			if (theCauseEffectChainFactory != null) {
				return theCauseEffectChainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CauseEffectChainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseEffectChainFactoryImpl() {
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL:
			return createCuaseEffectChainModel();
		case CauseEffectChainPackage.ACTIVITY_CHAIN:
			return createActivityChain();
		case CauseEffectChainPackage.ACTIVITY_LINK:
			return createActivityLink();
		case CauseEffectChainPackage.INPUT_HANDLER_LINK:
			return createInputHandlerLink();
		case CauseEffectChainPackage.MAX_RESPONSE_TIME:
			return createMaxResponseTime();
		case CauseEffectChainPackage.MIN_RESPONSE_TIME:
			return createMinResponseTime();
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
	public CuaseEffectChainModel createCuaseEffectChainModel() {
		CuaseEffectChainModelImpl cuaseEffectChainModel = new CuaseEffectChainModelImpl();
		return cuaseEffectChainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityChain createActivityChain() {
		ActivityChainImpl activityChain = new ActivityChainImpl();
		return activityChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityLink createActivityLink() {
		ActivityLinkImpl activityLink = new ActivityLinkImpl();
		return activityLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputHandlerLink createInputHandlerLink() {
		InputHandlerLinkImpl inputHandlerLink = new InputHandlerLinkImpl();
		return inputHandlerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxResponseTime createMaxResponseTime() {
		MaxResponseTimeImpl maxResponseTime = new MaxResponseTimeImpl();
		return maxResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinResponseTime createMinResponseTime() {
		MinResponseTimeImpl minResponseTime = new MinResponseTimeImpl();
		return minResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CauseEffectChainPackage getCauseEffectChainPackage() {
		return (CauseEffectChainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CauseEffectChainPackage getPackage() {
		return CauseEffectChainPackage.eINSTANCE;
	}

} //CauseEffectChainFactoryImpl
