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
package org.eclipse.smartmdsd.ecore.component.coordinationExtension.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage
 * @generated
 */
public class CoordinationExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoordinationExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CoordinationExtensionPackage.eINSTANCE;
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
	protected CoordinationExtensionSwitch<Adapter> modelSwitch = new CoordinationExtensionSwitch<Adapter>() {
		@Override
		public Adapter casePublicOperationMode(PublicOperationMode object) {
			return createPublicOperationModeAdapter();
		}

		@Override
		public Adapter casePrivateOperationMode(PrivateOperationMode object) {
			return createPrivateOperationModeAdapter();
		}

		@Override
		public Adapter caseCoordinationSlavePort(CoordinationSlavePort object) {
			return createCoordinationSlavePortAdapter();
		}

		@Override
		public Adapter caseAbstractCoordinationElement(AbstractCoordinationElement object) {
			return createAbstractCoordinationElementAdapter();
		}

		@Override
		public Adapter caseCoordinationMasterPort(CoordinationMasterPort object) {
			return createCoordinationMasterPortAdapter();
		}

		@Override
		public Adapter caseOperationModeBinding(OperationModeBinding object) {
			return createOperationModeBindingAdapter();
		}

		@Override
		public Adapter caseCommunicationServiceUsageRealization(CommunicationServiceUsageRealization object) {
			return createCommunicationServiceUsageRealizationAdapter();
		}

		@Override
		public Adapter caseSkillRealizationsRef(SkillRealizationsRef object) {
			return createSkillRealizationsRefAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentationElement(AbstractDocumentationElement object) {
			return createAbstractDocumentationElementAdapter();
		}

		@Override
		public Adapter caseAbstractComponentElement(AbstractComponentElement object) {
			return createAbstractComponentElementAdapter();
		}

		@Override
		public Adapter caseNamedComponentElement(NamedComponentElement object) {
			return createNamedComponentElementAdapter();
		}

		@Override
		public Adapter caseActivityExtension(ActivityExtension object) {
			return createActivityExtensionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.PublicOperationMode <em>Public Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.PublicOperationMode
	 * @generated
	 */
	public Adapter createPublicOperationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.PrivateOperationMode <em>Private Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.PrivateOperationMode
	 * @generated
	 */
	public Adapter createPrivateOperationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort <em>Coordination Slave Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
	 * @generated
	 */
	public Adapter createCoordinationSlavePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.AbstractCoordinationElement <em>Abstract Coordination Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.AbstractCoordinationElement
	 * @generated
	 */
	public Adapter createAbstractCoordinationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationMasterPort <em>Coordination Master Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationMasterPort
	 * @generated
	 */
	public Adapter createCoordinationMasterPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding <em>Operation Mode Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding
	 * @generated
	 */
	public Adapter createOperationModeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization <em>Communication Service Usage Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization
	 * @generated
	 */
	public Adapter createCommunicationServiceUsageRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef <em>Skill Realizations Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef
	 * @generated
	 */
	public Adapter createSkillRealizationsRefAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement <em>Named Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement
	 * @generated
	 */
	public Adapter createNamedComponentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension <em>Activity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension
	 * @generated
	 */
	public Adapter createActivityExtensionAdapter() {
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

} //CoordinationExtensionAdapterFactory
