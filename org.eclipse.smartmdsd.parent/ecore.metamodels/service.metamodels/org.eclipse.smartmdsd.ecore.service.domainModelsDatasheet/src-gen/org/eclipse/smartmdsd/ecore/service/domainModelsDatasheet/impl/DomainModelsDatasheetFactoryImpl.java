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
package org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainModelsDatasheetFactoryImpl extends EFactoryImpl implements DomainModelsDatasheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainModelsDatasheetFactory init() {
		try {
			DomainModelsDatasheetFactory theDomainModelsDatasheetFactory = (DomainModelsDatasheetFactory) EPackage.Registry.INSTANCE
					.getEFactory(DomainModelsDatasheetPackage.eNS_URI);
			if (theDomainModelsDatasheetFactory != null) {
				return theDomainModelsDatasheetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainModelsDatasheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelsDatasheetFactoryImpl() {
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
		case DomainModelsDatasheetPackage.DOMAIN_MODELS_DATASHEET:
			return createDomainModelsDatasheet();
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
	public DomainModelsDatasheet createDomainModelsDatasheet() {
		DomainModelsDatasheetImpl domainModelsDatasheet = new DomainModelsDatasheetImpl();
		return domainModelsDatasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainModelsDatasheetPackage getDomainModelsDatasheetPackage() {
		return (DomainModelsDatasheetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainModelsDatasheetPackage getPackage() {
		return DomainModelsDatasheetPackage.eINSTANCE;
	}

} //DomainModelsDatasheetFactoryImpl
