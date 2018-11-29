/**
 */
package org.ecore.component.seronetExtension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.component.componentDefinition.AbstractComponentElement;
import org.ecore.component.componentDefinition.AbstractComponentLink;
import org.ecore.component.componentDefinition.ComponentPortExtension;
import org.ecore.component.componentDefinition.NamedComponentElement;

import org.ecore.component.seronetExtension.*;

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
 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage
 * @generated
 */
public class SeronetExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeronetExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeronetExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = SeronetExtensionPackage.eINSTANCE;
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE: {
			SupportedMiddleware supportedMiddleware = (SupportedMiddleware) theEObject;
			T result = caseSupportedMiddleware(supportedMiddleware);
			if (result == null)
				result = caseComponentPortExtension(supportedMiddleware);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.PLAIN_OPC_UA_PORT: {
			PlainOpcUaPort plainOpcUaPort = (PlainOpcUaPort) theEObject;
			T result = casePlainOpcUaPort(plainOpcUaPort);
			if (result == null)
				result = caseNamedComponentElement(plainOpcUaPort);
			if (result == null)
				result = caseAbstractComponentElement(plainOpcUaPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT: {
			OpcUaDeviceClient opcUaDeviceClient = (OpcUaDeviceClient) theEObject;
			T result = caseOpcUaDeviceClient(opcUaDeviceClient);
			if (result == null)
				result = casePlainOpcUaPort(opcUaDeviceClient);
			if (result == null)
				result = caseNamedComponentElement(opcUaDeviceClient);
			if (result == null)
				result = caseAbstractComponentElement(opcUaDeviceClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.OPC_UA_STATUS_SERVER: {
			OpcUaStatusServer opcUaStatusServer = (OpcUaStatusServer) theEObject;
			T result = caseOpcUaStatusServer(opcUaStatusServer);
			if (result == null)
				result = casePlainOpcUaPort(opcUaStatusServer);
			if (result == null)
				result = caseNamedComponentElement(opcUaStatusServer);
			if (result == null)
				result = caseAbstractComponentElement(opcUaStatusServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK: {
			OpcUaClientLink opcUaClientLink = (OpcUaClientLink) theEObject;
			T result = caseOpcUaClientLink(opcUaClientLink);
			if (result == null)
				result = caseAbstractComponentLink(opcUaClientLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Middleware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedMiddleware(SupportedMiddleware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Opc Ua Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Opc Ua Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainOpcUaPort(PlainOpcUaPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opc Ua Device Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opc Ua Device Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcUaDeviceClient(OpcUaDeviceClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opc Ua Status Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opc Ua Status Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcUaStatusServer(OpcUaStatusServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opc Ua Client Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opc Ua Client Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcUaClientLink(OpcUaClientLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Port Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Port Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPortExtension(ComponentPortExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentElement(AbstractComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedComponentElement(NamedComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentLink(AbstractComponentLink object) {
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

} //SeronetExtensionSwitch
