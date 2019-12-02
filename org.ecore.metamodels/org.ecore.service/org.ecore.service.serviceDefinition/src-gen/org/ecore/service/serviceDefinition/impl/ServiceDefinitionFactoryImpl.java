/**
 */
package org.ecore.service.serviceDefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.service.serviceDefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDefinitionFactoryImpl extends EFactoryImpl implements ServiceDefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceDefinitionFactory init() {
		try {
			ServiceDefinitionFactory theServiceDefinitionFactory = (ServiceDefinitionFactory) EPackage.Registry.INSTANCE
					.getEFactory(ServiceDefinitionPackage.eNS_URI);
			if (theServiceDefinitionFactory != null) {
				return theServiceDefinitionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceDefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinitionFactoryImpl() {
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
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL:
			return createServiceDefModel();
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY:
			return createServiceDefRepository();
		case ServiceDefinitionPackage.COMM_REPO_IMPORT:
			return createCommRepoImport();
		case ServiceDefinitionPackage.SERVICE_REPO_VERSION:
			return createServiceRepoVersion();
		case ServiceDefinitionPackage.SERVICE_PROPERTY:
			return createServiceProperty();
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION:
			return createCoordinationServiceDefinition();
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION:
			return createForkingServiceDefinition();
		case ServiceDefinitionPackage.REQUEST_ANSWER_SERVICE_DEFINITION:
			return createRequestAnswerServiceDefinition();
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE:
			return createCommunicationServiceUsage();
		case ServiceDefinitionPackage.JOINING_SERVICE_DEFINITION:
			return createJoiningServiceDefinition();
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
	public ServiceDefModel createServiceDefModel() {
		ServiceDefModelImpl serviceDefModel = new ServiceDefModelImpl();
		return serviceDefModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefRepository createServiceDefRepository() {
		ServiceDefRepositoryImpl serviceDefRepository = new ServiceDefRepositoryImpl();
		return serviceDefRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommRepoImport createCommRepoImport() {
		CommRepoImportImpl commRepoImport = new CommRepoImportImpl();
		return commRepoImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRepoVersion createServiceRepoVersion() {
		ServiceRepoVersionImpl serviceRepoVersion = new ServiceRepoVersionImpl();
		return serviceRepoVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProperty createServiceProperty() {
		ServicePropertyImpl serviceProperty = new ServicePropertyImpl();
		return serviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationServiceDefinition createCoordinationServiceDefinition() {
		CoordinationServiceDefinitionImpl coordinationServiceDefinition = new CoordinationServiceDefinitionImpl();
		return coordinationServiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkingServiceDefinition createForkingServiceDefinition() {
		ForkingServiceDefinitionImpl forkingServiceDefinition = new ForkingServiceDefinitionImpl();
		return forkingServiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestAnswerServiceDefinition createRequestAnswerServiceDefinition() {
		RequestAnswerServiceDefinitionImpl requestAnswerServiceDefinition = new RequestAnswerServiceDefinitionImpl();
		return requestAnswerServiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServiceUsage createCommunicationServiceUsage() {
		CommunicationServiceUsageImpl communicationServiceUsage = new CommunicationServiceUsageImpl();
		return communicationServiceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoiningServiceDefinition createJoiningServiceDefinition() {
		JoiningServiceDefinitionImpl joiningServiceDefinition = new JoiningServiceDefinitionImpl();
		return joiningServiceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefinitionPackage getServiceDefinitionPackage() {
		return (ServiceDefinitionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServiceDefinitionPackage getPackage() {
		return ServiceDefinitionPackage.eINSTANCE;
	}

} //ServiceDefinitionFactoryImpl
