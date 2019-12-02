/**
 */
package org.ecore.service.serviceDefinition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.service.serviceDefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage
 * @generated
 */
public class ServiceDefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServiceDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServiceDefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinitionSwitch<Adapter> modelSwitch = new ServiceDefinitionSwitch<Adapter>() {
		@Override
		public Adapter caseServiceDefModel(ServiceDefModel object) {
			return createServiceDefModelAdapter();
		}

		@Override
		public Adapter caseServiceDefRepository(ServiceDefRepository object) {
			return createServiceDefRepositoryAdapter();
		}

		@Override
		public Adapter caseAbstractServiceDefinition(AbstractServiceDefinition object) {
			return createAbstractServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseCommRepoImport(CommRepoImport object) {
			return createCommRepoImportAdapter();
		}

		@Override
		public Adapter caseServiceRepoVersion(ServiceRepoVersion object) {
			return createServiceRepoVersionAdapter();
		}

		@Override
		public Adapter caseServiceProperty(ServiceProperty object) {
			return createServicePropertyAdapter();
		}

		@Override
		public Adapter caseCommunicationServiceDefinition(CommunicationServiceDefinition object) {
			return createCommunicationServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseCoordinationServiceDefinition(CoordinationServiceDefinition object) {
			return createCoordinationServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseForkingServiceDefinition(ForkingServiceDefinition object) {
			return createForkingServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseRequestAnswerServiceDefinition(RequestAnswerServiceDefinition object) {
			return createRequestAnswerServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseOneWayCommunicationService(OneWayCommunicationService object) {
			return createOneWayCommunicationServiceAdapter();
		}

		@Override
		public Adapter caseTwoWayCommunicationService(TwoWayCommunicationService object) {
			return createTwoWayCommunicationServiceAdapter();
		}

		@Override
		public Adapter caseCommunicationServiceUsage(CommunicationServiceUsage object) {
			return createCommunicationServiceUsageAdapter();
		}

		@Override
		public Adapter caseJoiningServiceDefinition(JoiningServiceDefinition object) {
			return createJoiningServiceDefinitionAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentedElement(AbstractDocumentedElement object) {
			return createAbstractDocumentedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.ServiceDefModel <em>Service Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.ServiceDefModel
	 * @generated
	 */
	public Adapter createServiceDefModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.ServiceDefRepository <em>Service Def Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.ServiceDefRepository
	 * @generated
	 */
	public Adapter createServiceDefRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.AbstractServiceDefinition <em>Abstract Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.AbstractServiceDefinition
	 * @generated
	 */
	public Adapter createAbstractServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.CommRepoImport <em>Comm Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.CommRepoImport
	 * @generated
	 */
	public Adapter createCommRepoImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.ServiceRepoVersion <em>Service Repo Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.ServiceRepoVersion
	 * @generated
	 */
	public Adapter createServiceRepoVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.ServiceProperty <em>Service Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.ServiceProperty
	 * @generated
	 */
	public Adapter createServicePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.CommunicationServiceDefinition <em>Communication Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.CommunicationServiceDefinition
	 * @generated
	 */
	public Adapter createCommunicationServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition <em>Coordination Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.CoordinationServiceDefinition
	 * @generated
	 */
	public Adapter createCoordinationServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.ForkingServiceDefinition <em>Forking Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.ForkingServiceDefinition
	 * @generated
	 */
	public Adapter createForkingServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition <em>Request Answer Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition
	 * @generated
	 */
	public Adapter createRequestAnswerServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.OneWayCommunicationService <em>One Way Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.OneWayCommunicationService
	 * @generated
	 */
	public Adapter createOneWayCommunicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.TwoWayCommunicationService <em>Two Way Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.TwoWayCommunicationService
	 * @generated
	 */
	public Adapter createTwoWayCommunicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.CommunicationServiceUsage <em>Communication Service Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.CommunicationServiceUsage
	 * @generated
	 */
	public Adapter createCommunicationServiceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.serviceDefinition.JoiningServiceDefinition <em>Joining Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.serviceDefinition.JoiningServiceDefinition
	 * @generated
	 */
	public Adapter createJoiningServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.documentation.AbstractDocumentedElement <em>Abstract Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement
	 * @generated
	 */
	public Adapter createAbstractDocumentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServiceDefinitionAdapterFactory
