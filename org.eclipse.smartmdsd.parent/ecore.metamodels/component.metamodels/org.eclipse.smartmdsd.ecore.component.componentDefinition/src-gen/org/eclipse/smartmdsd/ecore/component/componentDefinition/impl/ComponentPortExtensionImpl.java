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
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ComponentPortExtensionImpl extends MinimalEObjectImpl.Container
		implements ComponentPortExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.COMPONENT_PORT_EXTENSION;
	}

} //ComponentPortExtensionImpl
