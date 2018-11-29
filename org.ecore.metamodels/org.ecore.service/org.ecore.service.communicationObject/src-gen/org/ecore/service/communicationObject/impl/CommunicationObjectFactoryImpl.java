/**
 */
package org.ecore.service.communicationObject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.service.communicationObject.*;

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
	public CommObjectModel createCommObjectModel() {
		CommObjectModelImpl commObjectModel = new CommObjectModelImpl();
		return commObjectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommObjectsRepository createCommObjectsRepository() {
		CommObjectsRepositoryImpl commObjectsRepository = new CommObjectsRepositoryImpl();
		return commObjectsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommRepositoryImport createCommRepositoryImport() {
		CommRepositoryImportImpl commRepositoryImport = new CommRepositoryImportImpl();
		return commRepositoryImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject createCommunicationObject() {
		CommunicationObjectImpl communicationObject = new CommunicationObjectImpl();
		return communicationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommElementValue createCommElementValue() {
		CommElementValueImpl commElementValue = new CommElementValueImpl();
		return commElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommElementReference createCommElementReference() {
		CommElementReferenceImpl commElementReference = new CommElementReferenceImpl();
		return commElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
