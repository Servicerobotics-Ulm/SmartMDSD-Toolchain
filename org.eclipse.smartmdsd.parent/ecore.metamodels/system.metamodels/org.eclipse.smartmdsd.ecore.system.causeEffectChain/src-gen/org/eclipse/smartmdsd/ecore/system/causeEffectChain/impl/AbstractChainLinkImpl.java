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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.AbstractChainLink;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Chain Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractChainLinkImpl extends MinimalEObjectImpl.Container implements AbstractChainLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractChainLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CauseEffectChainPackage.Literals.ABSTRACT_CHAIN_LINK;
	}

} //AbstractChainLinkImpl
