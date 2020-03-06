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
package org.eclipse.smartmdsd.ecore.system.componentArchitecture.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.*;

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
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage
 * @generated
 */
public class ComponentArchitectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentArchitecturePackage.eINSTANCE;
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE: {
			SystemComponentArchitecture systemComponentArchitecture = (SystemComponentArchitecture) theEObject;
			T result = caseSystemComponentArchitecture(systemComponentArchitecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.COMPONENT_INSTANCE: {
			ComponentInstance componentInstance = (ComponentInstance) theEObject;
			T result = caseComponentInstance(componentInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.SERVICE_INSTANCE: {
			ServiceInstance serviceInstance = (ServiceInstance) theEObject;
			T result = caseServiceInstance(serviceInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.REQUIRED_SERVICE: {
			RequiredService requiredService = (RequiredService) theEObject;
			T result = caseRequiredService(requiredService);
			if (result == null)
				result = caseServiceInstance(requiredService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.PROVIDED_SERVICE: {
			ProvidedService providedService = (ProvidedService) theEObject;
			T result = caseProvidedService(providedService);
			if (result == null)
				result = caseServiceInstance(providedService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.SYSTEM_EXTENSION: {
			SystemExtension systemExtension = (SystemExtension) theEObject;
			T result = caseSystemExtension(systemExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION: {
			ComponentInstanceExtension componentInstanceExtension = (ComponentInstanceExtension) theEObject;
			T result = caseComponentInstanceExtension(componentInstanceExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING: {
			ActivityConfigurationMapping activityConfigurationMapping = (ActivityConfigurationMapping) theEObject;
			T result = caseActivityConfigurationMapping(activityConfigurationMapping);
			if (result == null)
				result = caseComponentInstanceConfigurationElement(activityConfigurationMapping);
			if (result == null)
				result = caseComponentInstanceExtension(activityConfigurationMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING: {
			InputHandlerConfigurationMapping inputHandlerConfigurationMapping = (InputHandlerConfigurationMapping) theEObject;
			T result = caseInputHandlerConfigurationMapping(inputHandlerConfigurationMapping);
			if (result == null)
				result = caseComponentInstanceConfigurationElement(inputHandlerConfigurationMapping);
			if (result == null)
				result = caseComponentInstanceExtension(inputHandlerConfigurationMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentArchitecturePackage.COMPONENT_INSTANCE_CONFIGURATION_ELEMENT: {
			ComponentInstanceConfigurationElement componentInstanceConfigurationElement = (ComponentInstanceConfigurationElement) theEObject;
			T result = caseComponentInstanceConfigurationElement(componentInstanceConfigurationElement);
			if (result == null)
				result = caseComponentInstanceExtension(componentInstanceConfigurationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Component Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponentArchitecture(SystemComponentArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInstance(ServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredService(RequiredService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedService(ProvidedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemExtension(SystemExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstanceExtension(ComponentInstanceExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Configuration Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Configuration Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityConfigurationMapping(ActivityConfigurationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Handler Configuration Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Handler Configuration Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputHandlerConfigurationMapping(InputHandlerConfigurationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Configuration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Configuration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstanceConfigurationElement(ComponentInstanceConfigurationElement object) {
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

} //ComponentArchitectureSwitch
