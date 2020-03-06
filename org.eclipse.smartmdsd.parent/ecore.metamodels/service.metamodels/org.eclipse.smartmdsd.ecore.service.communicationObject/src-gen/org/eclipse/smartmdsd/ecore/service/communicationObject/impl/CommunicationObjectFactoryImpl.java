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
package org.eclipse.smartmdsd.ecore.service.communicationObject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.service.communicationObject.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationObjectFactoryImpl extends EFactoryImpl implements CommunicationObjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationObjectFactory init() {
		try {
			CommunicationObjectFactory theCommunicationObjectFactory = (CommunicationObjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(CommunicationObjectPackage.eNS_URI);
			if (theCommunicationObjectFactory != null) {
				return theCommunicationObjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationObjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObjectFactoryImpl() {
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
		case CommunicationObjectPackage.COMM_OBJECT_MODEL:
			return createCommObjectModel();
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY:
			return createCommObjectsRepository();
		case CommunicationObjectPackage.COMM_REPOSITORY_IMPORT:
			return createCommRepositoryImport();
		case CommunicationObjectPackage.VERSION:
			return createVersion();
		case CommunicationObjectPackage.ENUMERATION:
			return createEnumeration();
		case CommunicationObjectPackage.COMMUNICATION_OBJECT:
			return createCommunicationObject();
		case CommunicationObjectPackage.COMM_ELEMENT_VALUE:
			return createCommElementValue();
		case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE:
			return createCommElementReference();
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
	public CommObjectModel createCommObjectModel() {
		CommObjectModelImpl commObjectModel = new CommObjectModelImpl();
		return commObjectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommObjectsRepository createCommObjectsRepository() {
		CommObjectsRepositoryImpl commObjectsRepository = new CommObjectsRepositoryImpl();
		return commObjectsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommRepositoryImport createCommRepositoryImport() {
		CommRepositoryImportImpl commRepositoryImport = new CommRepositoryImportImpl();
		return commRepositoryImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationObject createCommunicationObject() {
		CommunicationObjectImpl communicationObject = new CommunicationObjectImpl();
		return communicationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommElementValue createCommElementValue() {
		CommElementValueImpl commElementValue = new CommElementValueImpl();
		return commElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommElementReference createCommElementReference() {
		CommElementReferenceImpl commElementReference = new CommElementReferenceImpl();
		return commElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationObjectPackage getCommunicationObjectPackage() {
		return (CommunicationObjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationObjectPackage getPackage() {
		return CommunicationObjectPackage.eINSTANCE;
	}

} //CommunicationObjectFactoryImpl
