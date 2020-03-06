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
package org.eclipse.smartmdsd.ecore.component.seronetExtension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition;
import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortOpcUaBase;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.*;

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
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage
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
				result = caseAbstractComponentElement(plainOpcUaPort);
			if (result == null)
				result = caseMixedPortOpcUaBase(plainOpcUaPort);
			if (result == null)
				result = caseAbstractMixedPortDefinition(plainOpcUaPort);
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
				result = caseAbstractComponentElement(opcUaDeviceClient);
			if (result == null)
				result = caseMixedPortOpcUaBase(opcUaDeviceClient);
			if (result == null)
				result = caseAbstractMixedPortDefinition(opcUaDeviceClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.OPC_UA_READ_SERVER: {
			OpcUaReadServer opcUaReadServer = (OpcUaReadServer) theEObject;
			T result = caseOpcUaReadServer(opcUaReadServer);
			if (result == null)
				result = casePlainOpcUaPort(opcUaReadServer);
			if (result == null)
				result = caseAbstractComponentElement(opcUaReadServer);
			if (result == null)
				result = caseMixedPortOpcUaBase(opcUaReadServer);
			if (result == null)
				result = caseAbstractMixedPortDefinition(opcUaReadServer);
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
		case SeronetExtensionPackage.MIXED_PORT_ROS: {
			MixedPortROS mixedPortROS = (MixedPortROS) theEObject;
			T result = caseMixedPortROS(mixedPortROS);
			if (result == null)
				result = caseDerivedComponentElement(mixedPortROS);
			if (result == null)
				result = caseAbstractComponentElement(mixedPortROS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.MIXED_PORT_YARP: {
			MixedPortYARP mixedPortYARP = (MixedPortYARP) theEObject;
			T result = caseMixedPortYARP(mixedPortYARP);
			if (result == null)
				result = caseDerivedComponentElement(mixedPortYARP);
			if (result == null)
				result = caseAbstractComponentElement(mixedPortYARP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK: {
			MixedPortROSLink mixedPortROSLink = (MixedPortROSLink) theEObject;
			T result = caseMixedPortROSLink(mixedPortROSLink);
			if (result == null)
				result = caseAbstractComponentLink(mixedPortROSLink);
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
	 * Returns the result of interpreting the object as an instance of '<em>Opc Ua Read Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opc Ua Read Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcUaReadServer(OpcUaReadServer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port ROS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port ROS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortROS(MixedPortROS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port YARP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port YARP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortYARP(MixedPortYARP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port ROS Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port ROS Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortROSLink(MixedPortROSLink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMixedPortDefinition(AbstractMixedPortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port Opc Ua Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port Opc Ua Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortOpcUaBase(MixedPortOpcUaBase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Derived Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedComponentElement(DerivedComponentElement object) {
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
