/**
 */
package org.ecore.system.targetPlatform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.system.targetPlatform.*;

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
 * @see org.ecore.system.targetPlatform.TargetPlatformPackage
 * @generated
 */
public class TargetPlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetPlatformPackage.eINSTANCE;
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
		case TargetPlatformPackage.TARGET_PLATFORM_MODEL: {
			TargetPlatformModel targetPlatformModel = (TargetPlatformModel) theEObject;
			T result = caseTargetPlatformModel(targetPlatformModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION: {
			TargetPlatformDefinition targetPlatformDefinition = (TargetPlatformDefinition) theEObject;
			T result = caseTargetPlatformDefinition(targetPlatformDefinition);
			if (result == null)
				result = caseAbstractTPElement(targetPlatformDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.ABSTRACT_TP_ELEMENT: {
			AbstractTPElement abstractTPElement = (AbstractTPElement) theEObject;
			T result = caseAbstractTPElement(abstractTPElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.ABSTRACT_TP_SUB_NODE: {
			AbstractTPSubNode abstractTPSubNode = (AbstractTPSubNode) theEObject;
			T result = caseAbstractTPSubNode(abstractTPSubNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.NETWORK_CONNECTION: {
			NetworkConnection networkConnection = (NetworkConnection) theEObject;
			T result = caseNetworkConnection(networkConnection);
			if (result == null)
				result = caseAbstractTPElement(networkConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.NETWORK_INTERFACE: {
			NetworkInterface networkInterface = (NetworkInterface) theEObject;
			T result = caseNetworkInterface(networkInterface);
			if (result == null)
				result = caseAbstractTPSubNode(networkInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.CPU: {
			CPU cpu = (CPU) theEObject;
			T result = caseCPU(cpu);
			if (result == null)
				result = caseAbstractTPSubNode(cpu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.LOGIN_ACCOUNT: {
			LoginAccount loginAccount = (LoginAccount) theEObject;
			T result = caseLoginAccount(loginAccount);
			if (result == null)
				result = caseAbstractTPSubNode(loginAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.WINDOWS: {
			Windows windows = (Windows) theEObject;
			T result = caseWindows(windows);
			if (result == null)
				result = caseOperatingSystem(windows);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.OPERATING_SYSTEM: {
			OperatingSystem operatingSystem = (OperatingSystem) theEObject;
			T result = caseOperatingSystem(operatingSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.LINUX: {
			Linux linux = (Linux) theEObject;
			T result = caseLinux(linux);
			if (result == null)
				result = caseOperatingSystem(linux);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.MAC_OS: {
			MacOS macOS = (MacOS) theEObject;
			T result = caseMacOS(macOS);
			if (result == null)
				result = caseOperatingSystem(macOS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPlatformPackage.TARGET_MIDDLEWARE: {
			TargetMiddleware targetMiddleware = (TargetMiddleware) theEObject;
			T result = caseTargetMiddleware(targetMiddleware);
			if (result == null)
				result = caseAbstractTPSubNode(targetMiddleware);
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
	public T caseTargetPlatformModel(TargetPlatformModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatformDefinition(TargetPlatformDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract TP Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract TP Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTPElement(AbstractTPElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract TP Sub Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract TP Sub Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTPSubNode(AbstractTPSubNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConnection(NetworkConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPU(CPU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginAccount(LoginAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindows(Windows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinux(Linux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mac OS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mac OS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacOS(MacOS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Middleware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMiddleware(TargetMiddleware object) {
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

} //TargetPlatformSwitch
