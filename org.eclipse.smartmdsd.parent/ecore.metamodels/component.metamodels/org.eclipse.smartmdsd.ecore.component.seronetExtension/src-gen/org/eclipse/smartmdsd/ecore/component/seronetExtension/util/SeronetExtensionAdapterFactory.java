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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition;
import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortOpcUaBase;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage
 * @generated
 */
public class SeronetExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeronetExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeronetExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SeronetExtensionPackage.eINSTANCE;
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
	protected SeronetExtensionSwitch<Adapter> modelSwitch = new SeronetExtensionSwitch<Adapter>() {
		@Override
		public Adapter caseSupportedMiddleware(SupportedMiddleware object) {
			return createSupportedMiddlewareAdapter();
		}

		@Override
		public Adapter casePlainOpcUaPort(PlainOpcUaPort object) {
			return createPlainOpcUaPortAdapter();
		}

		@Override
		public Adapter caseOpcUaDeviceClient(OpcUaDeviceClient object) {
			return createOpcUaDeviceClientAdapter();
		}

		@Override
		public Adapter caseOpcUaReadServer(OpcUaReadServer object) {
			return createOpcUaReadServerAdapter();
		}

		@Override
		public Adapter caseOpcUaClientLink(OpcUaClientLink object) {
			return createOpcUaClientLinkAdapter();
		}

		@Override
		public Adapter caseMixedPortROS(MixedPortROS object) {
			return createMixedPortROSAdapter();
		}

		@Override
		public Adapter caseMixedPortYARP(MixedPortYARP object) {
			return createMixedPortYARPAdapter();
		}

		@Override
		public Adapter caseMixedPortROSLink(MixedPortROSLink object) {
			return createMixedPortROSLinkAdapter();
		}

		@Override
		public Adapter caseComponentPortExtension(ComponentPortExtension object) {
			return createComponentPortExtensionAdapter();
		}

		@Override
		public Adapter caseAbstractComponentElement(AbstractComponentElement object) {
			return createAbstractComponentElementAdapter();
		}

		@Override
		public Adapter caseAbstractMixedPortDefinition(AbstractMixedPortDefinition object) {
			return createAbstractMixedPortDefinitionAdapter();
		}

		@Override
		public Adapter caseMixedPortOpcUaBase(MixedPortOpcUaBase object) {
			return createMixedPortOpcUaBaseAdapter();
		}

		@Override
		public Adapter caseAbstractComponentLink(AbstractComponentLink object) {
			return createAbstractComponentLinkAdapter();
		}

		@Override
		public Adapter caseDerivedComponentElement(DerivedComponentElement object) {
			return createDerivedComponentElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware <em>Supported Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware
	 * @generated
	 */
	public Adapter createSupportedMiddlewareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.PlainOpcUaPort <em>Plain Opc Ua Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.PlainOpcUaPort
	 * @generated
	 */
	public Adapter createPlainOpcUaPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient <em>Opc Ua Device Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient
	 * @generated
	 */
	public Adapter createOpcUaDeviceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer <em>Opc Ua Read Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer
	 * @generated
	 */
	public Adapter createOpcUaReadServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaClientLink <em>Opc Ua Client Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaClientLink
	 * @generated
	 */
	public Adapter createOpcUaClientLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS <em>Mixed Port ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS
	 * @generated
	 */
	public Adapter createMixedPortROSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortYARP <em>Mixed Port YARP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortYARP
	 * @generated
	 */
	public Adapter createMixedPortYARPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROSLink <em>Mixed Port ROS Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROSLink
	 * @generated
	 */
	public Adapter createMixedPortROSLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension <em>Component Port Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension
	 * @generated
	 */
	public Adapter createComponentPortExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement <em>Abstract Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement
	 * @generated
	 */
	public Adapter createAbstractComponentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition <em>Abstract Mixed Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.base.mixedport.AbstractMixedPortDefinition
	 * @generated
	 */
	public Adapter createAbstractMixedPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortOpcUaBase <em>Mixed Port Opc Ua Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortOpcUaBase
	 * @generated
	 */
	public Adapter createMixedPortOpcUaBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink <em>Abstract Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink
	 * @generated
	 */
	public Adapter createAbstractComponentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement <em>Derived Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement
	 * @generated
	 */
	public Adapter createDerivedComponentElementAdapter() {
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

} //SeronetExtensionAdapterFactory
