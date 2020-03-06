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
package org.eclipse.smartmdsd.ecore.base.stateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachineFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/base/stateMachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stateMachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinePackage eINSTANCE = org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractMachineElementImpl <em>Abstract Machine Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractMachineElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getAbstractMachineElement()
	 * @generated
	 */
	int ABSTRACT_MACHINE_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Abstract Machine Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Machine Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MACHINE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateTransitionImpl
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__FROM = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__TO = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__VISIBILITY = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_OPERATION_COUNT = ABSTRACT_MACHINE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachineImpl
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractStateElementImpl <em>Abstract State Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractStateElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getAbstractStateElement()
	 * @generated
	 */
	int ABSTRACT_STATE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_ELEMENT__NAME = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract State Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_ELEMENT_FEATURE_COUNT = ABSTRACT_MACHINE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract State Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_ELEMENT_OPERATION_COUNT = ABSTRACT_MACHINE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateImpl
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_STATE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ABSTRACT_STATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType <em>Visibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getFrom()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getTo()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_To();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateTransition#getVisibility()
	 * @see #getStateTransition()
	 * @generated
	 */
	EAttribute getStateTransition_Visibility();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine#getElements()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine#getName()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractMachineElement <em>Abstract Machine Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Machine Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractMachineElement
	 * @generated
	 */
	EClass getAbstractMachineElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractStateElement <em>Abstract State Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractStateElement
	 * @generated
	 */
	EClass getAbstractStateElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractStateElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.AbstractStateElement#getName()
	 * @see #getAbstractStateElement()
	 * @generated
	 */
	EAttribute getAbstractStateElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineFactory getStateMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateTransitionImpl
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__FROM = eINSTANCE.getStateTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__TO = eINSTANCE.getStateTransition_To();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TRANSITION__VISIBILITY = eINSTANCE.getStateTransition_Visibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachineImpl
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__ELEMENTS = eINSTANCE.getStateMachine_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractMachineElementImpl <em>Abstract Machine Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractMachineElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getAbstractMachineElement()
		 * @generated
		 */
		EClass ABSTRACT_MACHINE_ELEMENT = eINSTANCE.getAbstractMachineElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractStateElementImpl <em>Abstract State Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.AbstractStateElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getAbstractStateElement()
		 * @generated
		 */
		EClass ABSTRACT_STATE_ELEMENT = eINSTANCE.getAbstractStateElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATE_ELEMENT__NAME = eINSTANCE.getAbstractStateElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateImpl
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType <em>Visibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.VisibilityType
		 * @see org.eclipse.smartmdsd.ecore.base.stateMachine.impl.StateMachinePackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

	}

} //StateMachinePackage
