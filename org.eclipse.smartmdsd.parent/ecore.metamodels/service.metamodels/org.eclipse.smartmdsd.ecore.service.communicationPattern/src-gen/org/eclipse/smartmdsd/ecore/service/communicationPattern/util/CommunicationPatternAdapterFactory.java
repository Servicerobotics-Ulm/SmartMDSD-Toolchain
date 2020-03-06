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
package org.eclipse.smartmdsd.ecore.service.communicationPattern.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage
 * @generated
 */
public class CommunicationPatternAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPatternPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPatternAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationPatternPackage.eINSTANCE;
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
	protected CommunicationPatternSwitch<Adapter> modelSwitch = new CommunicationPatternSwitch<Adapter>() {
		@Override
		public Adapter caseCommunicationPattern(CommunicationPattern object) {
			return createCommunicationPatternAdapter();
		}

		@Override
		public Adapter casePushPattern(PushPattern object) {
			return createPushPatternAdapter();
		}

		@Override
		public Adapter caseQueryPattern(QueryPattern object) {
			return createQueryPatternAdapter();
		}

		@Override
		public Adapter caseEventPattern(EventPattern object) {
			return createEventPatternAdapter();
		}

		@Override
		public Adapter caseSendPattern(SendPattern object) {
			return createSendPatternAdapter();
		}

		@Override
		public Adapter caseForkingPattern(ForkingPattern object) {
			return createForkingPatternAdapter();
		}

		@Override
		public Adapter caseJoiningPattern(JoiningPattern object) {
			return createJoiningPatternAdapter();
		}

		@Override
		public Adapter caseRequestAnswerPattern(RequestAnswerPattern object) {
			return createRequestAnswerPatternAdapter();
		}

		@Override
		public Adapter caseOneWayCommunicationPattern(OneWayCommunicationPattern object) {
			return createOneWayCommunicationPatternAdapter();
		}

		@Override
		public Adapter caseTwoWayCommunicationPattern(TwoWayCommunicationPattern object) {
			return createTwoWayCommunicationPatternAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern <em>Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern
	 * @generated
	 */
	public Adapter createCommunicationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern <em>Push Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern
	 * @generated
	 */
	public Adapter createPushPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern <em>Query Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern
	 * @generated
	 */
	public Adapter createQueryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern
	 * @generated
	 */
	public Adapter createEventPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern <em>Send Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern
	 * @generated
	 */
	public Adapter createSendPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern <em>Forking Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern
	 * @generated
	 */
	public Adapter createForkingPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.JoiningPattern <em>Joining Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.JoiningPattern
	 * @generated
	 */
	public Adapter createJoiningPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern <em>Request Answer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern
	 * @generated
	 */
	public Adapter createRequestAnswerPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern <em>One Way Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern
	 * @generated
	 */
	public Adapter createOneWayCommunicationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.TwoWayCommunicationPattern <em>Two Way Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.TwoWayCommunicationPattern
	 * @generated
	 */
	public Adapter createTwoWayCommunicationPatternAdapter() {
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

} //CommunicationPatternAdapterFactory
