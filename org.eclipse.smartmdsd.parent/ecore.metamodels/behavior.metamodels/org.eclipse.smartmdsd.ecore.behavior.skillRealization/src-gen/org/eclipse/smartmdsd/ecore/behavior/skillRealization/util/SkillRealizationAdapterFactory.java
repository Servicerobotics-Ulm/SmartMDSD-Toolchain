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
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage
 * @generated
 */
public class SkillRealizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SkillRealizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SkillRealizationPackage.eINSTANCE;
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
	protected SkillRealizationSwitch<Adapter> modelSwitch = new SkillRealizationSwitch<Adapter>() {
		@Override
		public Adapter caseSkillRealizationModel(SkillRealizationModel object) {
			return createSkillRealizationModelAdapter();
		}

		@Override
		public Adapter caseCoordinationModuleRealization(CoordinationModuleRealization object) {
			return createCoordinationModuleRealizationAdapter();
		}

		@Override
		public Adapter caseSkillRealization(SkillRealization object) {
			return createSkillRealizationAdapter();
		}

		@Override
		public Adapter caseAbstractCoordinationAction(AbstractCoordinationAction object) {
			return createAbstractCoordinationActionAdapter();
		}

		@Override
		public Adapter caseAbstractComponentCoordinationAction(AbstractComponentCoordinationAction object) {
			return createAbstractComponentCoordinationActionAdapter();
		}

		@Override
		public Adapter caseComponentCoordinationActionEvent(ComponentCoordinationActionEvent object) {
			return createComponentCoordinationActionEventAdapter();
		}

		@Override
		public Adapter caseComponentCoordinationActionWiring(ComponentCoordinationActionWiring object) {
			return createComponentCoordinationActionWiringAdapter();
		}

		@Override
		public Adapter caseComponentCoordinationActionParameter(ComponentCoordinationActionParameter object) {
			return createComponentCoordinationActionParameterAdapter();
		}

		@Override
		public Adapter caseComponentCoordinationActionActivation(ComponentCoordinationActionActivation object) {
			return createComponentCoordinationActionActivationAdapter();
		}

		@Override
		public Adapter caseCoordinationActionBlock(CoordinationActionBlock object) {
			return createCoordinationActionBlockAdapter();
		}

		@Override
		public Adapter caseEventHandler(EventHandler object) {
			return createEventHandlerAdapter();
		}

		@Override
		public Adapter caseCoordinationInterfaceInstance(CoordinationInterfaceInstance object) {
			return createCoordinationInterfaceInstanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel
	 * @generated
	 */
	public Adapter createSkillRealizationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization <em>Coordination Module Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization
	 * @generated
	 */
	public Adapter createCoordinationModuleRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization <em>Skill Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization
	 * @generated
	 */
	public Adapter createSkillRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractCoordinationAction <em>Abstract Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractCoordinationAction
	 * @generated
	 */
	public Adapter createAbstractCoordinationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction <em>Abstract Component Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction
	 * @generated
	 */
	public Adapter createAbstractComponentCoordinationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent <em>Component Coordination Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent
	 * @generated
	 */
	public Adapter createComponentCoordinationActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionWiring <em>Component Coordination Action Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionWiring
	 * @generated
	 */
	public Adapter createComponentCoordinationActionWiringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter <em>Component Coordination Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter
	 * @generated
	 */
	public Adapter createComponentCoordinationActionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation <em>Component Coordination Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation
	 * @generated
	 */
	public Adapter createComponentCoordinationActionActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock <em>Coordination Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock
	 * @generated
	 */
	public Adapter createCoordinationActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance <em>Coordination Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance
	 * @generated
	 */
	public Adapter createCoordinationInterfaceInstanceAdapter() {
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

} //SkillRealizationAdapterFactory
