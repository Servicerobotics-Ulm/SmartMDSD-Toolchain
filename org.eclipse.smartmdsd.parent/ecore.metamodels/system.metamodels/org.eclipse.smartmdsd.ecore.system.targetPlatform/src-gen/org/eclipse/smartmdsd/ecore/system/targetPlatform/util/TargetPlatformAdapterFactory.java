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
package org.eclipse.smartmdsd.ecore.system.targetPlatform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage
 * @generated
 */
public class TargetPlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TargetPlatformPackage.eINSTANCE;
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
	protected TargetPlatformSwitch<Adapter> modelSwitch = new TargetPlatformSwitch<Adapter>() {
		@Override
		public Adapter caseTargetPlatformModel(TargetPlatformModel object) {
			return createTargetPlatformModelAdapter();
		}

		@Override
		public Adapter caseTargetPlatformDefinition(TargetPlatformDefinition object) {
			return createTargetPlatformDefinitionAdapter();
		}

		@Override
		public Adapter caseAbstractTPElement(AbstractTPElement object) {
			return createAbstractTPElementAdapter();
		}

		@Override
		public Adapter caseAbstractTPSubNode(AbstractTPSubNode object) {
			return createAbstractTPSubNodeAdapter();
		}

		@Override
		public Adapter caseNetworkConnection(NetworkConnection object) {
			return createNetworkConnectionAdapter();
		}

		@Override
		public Adapter caseNetworkInterface(NetworkInterface object) {
			return createNetworkInterfaceAdapter();
		}

		@Override
		public Adapter caseCPU(CPU object) {
			return createCPUAdapter();
		}

		@Override
		public Adapter caseLoginAccount(LoginAccount object) {
			return createLoginAccountAdapter();
		}

		@Override
		public Adapter caseWindows(Windows object) {
			return createWindowsAdapter();
		}

		@Override
		public Adapter caseOperatingSystem(OperatingSystem object) {
			return createOperatingSystemAdapter();
		}

		@Override
		public Adapter caseLinux(Linux object) {
			return createLinuxAdapter();
		}

		@Override
		public Adapter caseMacOS(MacOS object) {
			return createMacOSAdapter();
		}

		@Override
		public Adapter caseTargetMiddleware(TargetMiddleware object) {
			return createTargetMiddlewareAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentationElement(AbstractDocumentationElement object) {
			return createAbstractDocumentationElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformModel
	 * @generated
	 */
	public Adapter createTargetPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition
	 * @generated
	 */
	public Adapter createTargetPlatformDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPElement <em>Abstract TP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPElement
	 * @generated
	 */
	public Adapter createAbstractTPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPSubNode <em>Abstract TP Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPSubNode
	 * @generated
	 */
	public Adapter createAbstractTPSubNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection <em>Network Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection
	 * @generated
	 */
	public Adapter createNetworkConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface
	 * @generated
	 */
	public Adapter createNetworkInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU
	 * @generated
	 */
	public Adapter createCPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount <em>Login Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount
	 * @generated
	 */
	public Adapter createLoginAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.Windows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.Windows
	 * @generated
	 */
	public Adapter createWindowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.Linux
	 * @generated
	 */
	public Adapter createLinuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.MacOS <em>Mac OS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.MacOS
	 * @generated
	 */
	public Adapter createMacOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware <em>Target Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware
	 * @generated
	 */
	public Adapter createTargetMiddlewareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement <em>Abstract Documentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement
	 * @generated
	 */
	public Adapter createAbstractDocumentationElementAdapter() {
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

} //TargetPlatformAdapterFactory
