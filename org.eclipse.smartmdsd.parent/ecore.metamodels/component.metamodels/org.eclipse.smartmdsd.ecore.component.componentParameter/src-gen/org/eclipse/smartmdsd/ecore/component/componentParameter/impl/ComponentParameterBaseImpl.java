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
package org.eclipse.smartmdsd.ecore.component.componentParameter.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterBase;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ComponentParameterBaseImpl extends MinimalEObjectImpl.Container
		implements ComponentParameterBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParameterBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.COMPONENT_PARAMETER_BASE;
	}

} //ComponentParameterBaseImpl
