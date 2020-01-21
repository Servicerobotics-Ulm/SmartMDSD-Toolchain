/**
 */
package org.eclipse.smartmdsd.ecore.service.serviceDefinition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage
 * @generated
 */
public class ServiceDefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServiceDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = ServiceDefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL: {
			ServiceDefModel serviceDefModel = (ServiceDefModel) theEObject;
			T result = caseServiceDefModel(serviceDefModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY: {
			ServiceDefRepository serviceDefRepository = (ServiceDefRepository) theEObject;
			T result = caseServiceDefRepository(serviceDefRepository);
			if (result == null)
				result = caseAbstractDocumentationElement(serviceDefRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION: {
			AbstractServiceDefinition abstractServiceDefinition = (AbstractServiceDefinition) theEObject;
			T result = caseAbstractServiceDefinition(abstractServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(abstractServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.COMM_REPO_IMPORT: {
			CommRepoImport commRepoImport = (CommRepoImport) theEObject;
			T result = caseCommRepoImport(commRepoImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.SERVICE_REPO_VERSION: {
			ServiceRepoVersion serviceRepoVersion = (ServiceRepoVersion) theEObject;
			T result = caseServiceRepoVersion(serviceRepoVersion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.SERVICE_PROPERTY: {
			ServiceProperty serviceProperty = (ServiceProperty) theEObject;
			T result = caseServiceProperty(serviceProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_DEFINITION: {
			CommunicationServiceDefinition communicationServiceDefinition = (CommunicationServiceDefinition) theEObject;
			T result = caseCommunicationServiceDefinition(communicationServiceDefinition);
			if (result == null)
				result = caseAbstractServiceDefinition(communicationServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(communicationServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION: {
			CoordinationServiceDefinition coordinationServiceDefinition = (CoordinationServiceDefinition) theEObject;
			T result = caseCoordinationServiceDefinition(coordinationServiceDefinition);
			if (result == null)
				result = caseAbstractServiceDefinition(coordinationServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(coordinationServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION: {
			ForkingServiceDefinition forkingServiceDefinition = (ForkingServiceDefinition) theEObject;
			T result = caseForkingServiceDefinition(forkingServiceDefinition);
			if (result == null)
				result = caseOneWayCommunicationService(forkingServiceDefinition);
			if (result == null)
				result = caseCommunicationServiceDefinition(forkingServiceDefinition);
			if (result == null)
				result = caseAbstractServiceDefinition(forkingServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(forkingServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.REQUEST_ANSWER_SERVICE_DEFINITION: {
			RequestAnswerServiceDefinition requestAnswerServiceDefinition = (RequestAnswerServiceDefinition) theEObject;
			T result = caseRequestAnswerServiceDefinition(requestAnswerServiceDefinition);
			if (result == null)
				result = caseTwoWayCommunicationService(requestAnswerServiceDefinition);
			if (result == null)
				result = caseCommunicationServiceDefinition(requestAnswerServiceDefinition);
			if (result == null)
				result = caseAbstractServiceDefinition(requestAnswerServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(requestAnswerServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.ONE_WAY_COMMUNICATION_SERVICE: {
			OneWayCommunicationService oneWayCommunicationService = (OneWayCommunicationService) theEObject;
			T result = caseOneWayCommunicationService(oneWayCommunicationService);
			if (result == null)
				result = caseCommunicationServiceDefinition(oneWayCommunicationService);
			if (result == null)
				result = caseAbstractServiceDefinition(oneWayCommunicationService);
			if (result == null)
				result = caseAbstractDocumentationElement(oneWayCommunicationService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.TWO_WAY_COMMUNICATION_SERVICE: {
			TwoWayCommunicationService twoWayCommunicationService = (TwoWayCommunicationService) theEObject;
			T result = caseTwoWayCommunicationService(twoWayCommunicationService);
			if (result == null)
				result = caseCommunicationServiceDefinition(twoWayCommunicationService);
			if (result == null)
				result = caseAbstractServiceDefinition(twoWayCommunicationService);
			if (result == null)
				result = caseAbstractDocumentationElement(twoWayCommunicationService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE: {
			CommunicationServiceUsage communicationServiceUsage = (CommunicationServiceUsage) theEObject;
			T result = caseCommunicationServiceUsage(communicationServiceUsage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ServiceDefinitionPackage.JOINING_SERVICE_DEFINITION: {
			JoiningServiceDefinition joiningServiceDefinition = (JoiningServiceDefinition) theEObject;
			T result = caseJoiningServiceDefinition(joiningServiceDefinition);
			if (result == null)
				result = caseOneWayCommunicationService(joiningServiceDefinition);
			if (result == null)
				result = caseCommunicationServiceDefinition(joiningServiceDefinition);
			if (result == null)
				result = caseAbstractServiceDefinition(joiningServiceDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(joiningServiceDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Def Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDefModel(ServiceDefModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Def Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Def Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDefRepository(ServiceDefRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractServiceDefinition(AbstractServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comm Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comm Repo Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommRepoImport(CommRepoImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Repo Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Repo Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRepoVersion(ServiceRepoVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProperty(ServiceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationServiceDefinition(CommunicationServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationServiceDefinition(CoordinationServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forking Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forking Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkingServiceDefinition(ForkingServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Answer Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Answer Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAnswerServiceDefinition(RequestAnswerServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Way Communication Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Way Communication Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneWayCommunicationService(OneWayCommunicationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Way Communication Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Way Communication Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoWayCommunicationService(TwoWayCommunicationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Service Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Service Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationServiceUsage(CommunicationServiceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joining Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joining Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoiningServiceDefinition(JoiningServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Documentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Documentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDocumentationElement(AbstractDocumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ServiceDefinitionSwitch
