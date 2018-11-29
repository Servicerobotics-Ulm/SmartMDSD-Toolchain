/**
 */
package org.ecore.system.deployment.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.system.deployment.*;

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
 * @see org.ecore.system.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSwitch() {
		if (modelPackage == null) {
			modelPackage = DeploymentPackage.eINSTANCE;
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
		case DeploymentPackage.DEPLOYMENT_MODEL: {
			DeploymentModel deploymentModel = (DeploymentModel) theEObject;
			T result = caseDeploymentModel(deploymentModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.ABSTRACT_DEPLOYMENT_ELEMENT: {
			AbstractDeploymentElement abstractDeploymentElement = (AbstractDeploymentElement) theEObject;
			T result = caseAbstractDeploymentElement(abstractDeploymentElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE: {
			TargetPlatformReference targetPlatformReference = (TargetPlatformReference) theEObject;
			T result = caseTargetPlatformReference(targetPlatformReference);
			if (result == null)
				result = caseAbstractDeploymentElement(targetPlatformReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.COMPONENT_ARTEFACT: {
			ComponentArtefact componentArtefact = (ComponentArtefact) theEObject;
			T result = caseComponentArtefact(componentArtefact);
			if (result == null)
				result = caseAbstractDeploymentElement(componentArtefact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.NAMING_SERVICE: {
			NamingService namingService = (NamingService) theEObject;
			T result = caseNamingService(namingService);
			if (result == null)
				result = caseAbstractDeploymentElement(namingService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.DEPLOYMENT: {
			Deployment deployment = (Deployment) theEObject;
			T result = caseDeployment(deployment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.UPLOAD_DIRECTORY: {
			UploadDirectory uploadDirectory = (UploadDirectory) theEObject;
			T result = caseUploadDirectory(uploadDirectory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.TARGET_MODEL_INCLUDE: {
			TargetModelInclude targetModelInclude = (TargetModelInclude) theEObject;
			T result = caseTargetModelInclude(targetModelInclude);
			if (result == null)
				result = caseAbstractDeploymentElement(targetModelInclude);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.LOGIN_ACCOUNT_SELECTION: {
			LoginAccountSelection loginAccountSelection = (LoginAccountSelection) theEObject;
			T result = caseLoginAccountSelection(loginAccountSelection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeploymentPackage.NETWORK_INTERFACE_SELECTION: {
			NetworkInterfaceSelection networkInterfaceSelection = (NetworkInterfaceSelection) theEObject;
			T result = caseNetworkInterfaceSelection(networkInterfaceSelection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentModel(DeploymentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Deployment Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Deployment Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDeploymentElement(AbstractDeploymentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Platform Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Platform Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatformReference(TargetPlatformReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentArtefact(ComponentArtefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingService(NamingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upload Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upload Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUploadDirectory(UploadDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Model Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Model Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetModelInclude(TargetModelInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Account Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Account Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginAccountSelection(LoginAccountSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterfaceSelection(NetworkInterfaceSelection object) {
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

} //DeploymentSwitch
