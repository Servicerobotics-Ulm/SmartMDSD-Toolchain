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
package org.eclipse.smartmdsd.ecore.service.componentMode.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.service.componentMode.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentModeFactoryImpl extends EFactoryImpl implements ComponentModeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentModeFactory init() {
		try {
			ComponentModeFactory theComponentModeFactory = (ComponentModeFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentModePackage.eNS_URI);
			if (theComponentModeFactory != null) {
				return theComponentModeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentModeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeFactoryImpl() {
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
		case ComponentModePackage.COMPONENT_MODE_MODEL:
			return createComponentModeModel();
		case ComponentModePackage.COMPONENT_MODE_REPOSITORY:
			return createComponentModeRepository();
		case ComponentModePackage.COMPONENT_MODE_COLLECTION:
			return createComponentModeCollection();
		case ComponentModePackage.COMPONENT_MODE_DEFINITION:
			return createComponentModeDefinition();
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
	public ComponentModeModel createComponentModeModel() {
		ComponentModeModelImpl componentModeModel = new ComponentModeModelImpl();
		return componentModeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeRepository createComponentModeRepository() {
		ComponentModeRepositoryImpl componentModeRepository = new ComponentModeRepositoryImpl();
		return componentModeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeCollection createComponentModeCollection() {
		ComponentModeCollectionImpl componentModeCollection = new ComponentModeCollectionImpl();
		return componentModeCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeDefinition createComponentModeDefinition() {
		ComponentModeDefinitionImpl componentModeDefinition = new ComponentModeDefinitionImpl();
		return componentModeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModePackage getComponentModePackage() {
		return (ComponentModePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentModePackage getPackage() {
		return ComponentModePackage.eINSTANCE;
	}

} //ComponentModeFactoryImpl
