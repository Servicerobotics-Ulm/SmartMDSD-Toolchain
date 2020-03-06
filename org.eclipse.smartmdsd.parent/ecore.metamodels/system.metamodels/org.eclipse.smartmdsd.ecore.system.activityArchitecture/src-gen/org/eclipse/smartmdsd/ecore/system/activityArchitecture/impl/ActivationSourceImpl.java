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
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivationSource;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ActivationSourceImpl extends MinimalEObjectImpl.Container implements ActivationSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.ACTIVATION_SOURCE;
	}

} //ActivationSourceImpl
