/**
 */
package org.ecore.base.stateMachine.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.base.stateMachine.AbstractMachineElement;
import org.ecore.base.stateMachine.StateMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Machine Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractMachineElementImpl extends MinimalEObjectImpl.Container
		implements AbstractMachineElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMachineElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.ABSTRACT_MACHINE_ELEMENT;
	}

} //AbstractMachineElementImpl
