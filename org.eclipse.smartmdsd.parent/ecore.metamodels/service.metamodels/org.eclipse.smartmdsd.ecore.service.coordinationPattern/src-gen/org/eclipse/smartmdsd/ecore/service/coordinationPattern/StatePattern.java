/**
 */
package org.eclipse.smartmdsd.ecore.service.coordinationPattern;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getStatePattern()
 * @model
 * @generated
 */
public interface StatePattern extends CoordinationPattern {
	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' reference.
	 * @see #setLifecycle(StateMachine)
	 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getStatePattern_Lifecycle()
	 * @model required="true"
	 * @generated
	 */
	StateMachine getLifecycle();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern#getLifecycle <em>Lifecycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' reference.
	 * @see #setModes(ComponentModeCollection)
	 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getStatePattern_Modes()
	 * @model
	 * @generated
	 */
	ComponentModeCollection getModes();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern#getModes <em>Modes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modes</em>' reference.
	 * @see #getModes()
	 * @generated
	 */
	void setModes(ComponentModeCollection value);

} // StatePattern
