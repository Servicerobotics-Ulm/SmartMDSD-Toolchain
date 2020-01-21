/**
 */
package org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl.StatePatternImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl.StatePatternImpl#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatePatternImpl extends CoordinationPatternImpl implements StatePattern {
	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected StateMachine lifecycle;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected ComponentModeCollection modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPatternPackage.Literals.STATE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getLifecycle() {
		if (lifecycle != null && lifecycle.eIsProxy()) {
			InternalEObject oldLifecycle = (InternalEObject) lifecycle;
			lifecycle = (StateMachine) eResolveProxy(oldLifecycle);
			if (lifecycle != oldLifecycle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE, oldLifecycle, lifecycle));
			}
		}
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(StateMachine newLifecycle) {
		StateMachine oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE,
					oldLifecycle, lifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeCollection getModes() {
		if (modes != null && modes.eIsProxy()) {
			InternalEObject oldModes = (InternalEObject) modes;
			modes = (ComponentModeCollection) eResolveProxy(oldModes);
			if (modes != oldModes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationPatternPackage.STATE_PATTERN__MODES, oldModes, modes));
			}
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeCollection basicGetModes() {
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModes(ComponentModeCollection newModes) {
		ComponentModeCollection oldModes = modes;
		modes = newModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPatternPackage.STATE_PATTERN__MODES,
					oldModes, modes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE:
			if (resolve)
				return getLifecycle();
			return basicGetLifecycle();
		case CoordinationPatternPackage.STATE_PATTERN__MODES:
			if (resolve)
				return getModes();
			return basicGetModes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE:
			setLifecycle((StateMachine) newValue);
			return;
		case CoordinationPatternPackage.STATE_PATTERN__MODES:
			setModes((ComponentModeCollection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE:
			setLifecycle((StateMachine) null);
			return;
		case CoordinationPatternPackage.STATE_PATTERN__MODES:
			setModes((ComponentModeCollection) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CoordinationPatternPackage.STATE_PATTERN__LIFECYCLE:
			return lifecycle != null;
		case CoordinationPatternPackage.STATE_PATTERN__MODES:
			return modes != null;
		}
		return super.eIsSet(featureID);
	}

} //StatePatternImpl
