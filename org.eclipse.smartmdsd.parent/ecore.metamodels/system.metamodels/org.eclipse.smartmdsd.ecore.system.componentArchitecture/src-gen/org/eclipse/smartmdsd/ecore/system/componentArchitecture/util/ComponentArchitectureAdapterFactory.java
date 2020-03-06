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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage
 * @generated
 */
public class ComponentArchitectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentArchitectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentArchitecturePackage.eINSTANCE;
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
	protected ComponentArchitectureSwitch<Adapter> modelSwitch = new ComponentArchitectureSwitch<Adapter>() {
		@Override
		public Adapter caseSystemComponentArchitecture(SystemComponentArchitecture object) {
			return createSystemComponentArchitectureAdapter();
		}

		@Override
		public Adapter caseComponentInstance(ComponentInstance object) {
			return createComponentInstanceAdapter();
		}

		@Override
		public Adapter caseServiceInstance(ServiceInstance object) {
			return createServiceInstanceAdapter();
		}

		@Override
		public Adapter caseRequiredService(RequiredService object) {
			return createRequiredServiceAdapter();
		}

		@Override
		public Adapter caseProvidedService(ProvidedService object) {
			return createProvidedServiceAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseSystemExtension(SystemExtension object) {
			return createSystemExtensionAdapter();
		}

		@Override
		public Adapter caseComponentInstanceExtension(ComponentInstanceExtension object) {
			return createComponentInstanceExtensionAdapter();
		}

		@Override
		public Adapter caseActivityConfigurationMapping(ActivityConfigurationMapping object) {
			return createActivityConfigurationMappingAdapter();
		}

		@Override
		public Adapter caseInputHandlerConfigurationMapping(InputHandlerConfigurationMapping object) {
			return createInputHandlerConfigurationMappingAdapter();
		}

		@Override
		public Adapter caseComponentInstanceConfigurationElement(ComponentInstanceConfigurationElement object) {
			return createComponentInstanceConfigurationElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture <em>System Component Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
	 * @generated
	 */
	public Adapter createSystemComponentArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance
	 * @generated
	 */
	public Adapter createServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService
	 * @generated
	 */
	public Adapter createRequiredServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService
	 * @generated
	 */
	public Adapter createProvidedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension <em>System Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension
	 * @generated
	 */
	public Adapter createSystemExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension <em>Component Instance Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension
	 * @generated
	 */
	public Adapter createComponentInstanceExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping <em>Activity Configuration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping
	 * @generated
	 */
	public Adapter createActivityConfigurationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping <em>Input Handler Configuration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping
	 * @generated
	 */
	public Adapter createInputHandlerConfigurationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceConfigurationElement <em>Component Instance Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceConfigurationElement
	 * @generated
	 */
	public Adapter createComponentInstanceConfigurationElementAdapter() {
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

} //ComponentArchitectureAdapterFactory
