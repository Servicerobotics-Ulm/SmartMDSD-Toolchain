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
package org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SystemExtensionImpl extends MinimalEObjectImpl.Container implements SystemExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.SYSTEM_EXTENSION;
	}

} //SystemExtensionImpl
