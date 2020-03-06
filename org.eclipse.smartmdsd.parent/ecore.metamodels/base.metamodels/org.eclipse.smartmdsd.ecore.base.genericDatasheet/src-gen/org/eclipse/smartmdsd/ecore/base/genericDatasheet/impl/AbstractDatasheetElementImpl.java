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
package org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Datasheet Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractDatasheetElementImpl extends MinimalEObjectImpl.Container
		implements AbstractDatasheetElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDatasheetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDatasheetPackage.Literals.ABSTRACT_DATASHEET_ELEMENT;
	}

} //AbstractDatasheetElementImpl
