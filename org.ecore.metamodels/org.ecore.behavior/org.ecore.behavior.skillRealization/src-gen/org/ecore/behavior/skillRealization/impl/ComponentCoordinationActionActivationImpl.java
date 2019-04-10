/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.ecore.service.componentMode.ComponentModeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Coordination Action Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.ComponentCoordinationActionActivationImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentCoordinationActionActivationImpl extends AbstractComponentCoordinationActionImpl
		implements ComponentCoordinationActionActivation {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ComponentModeDefinition state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentCoordinationActionActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeDefinition getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (ComponentModeDefinition) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeDefinition basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(ComponentModeDefinition newState) {
		ComponentModeDefinition oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE:
			if (resolve)
				return getState();
			return basicGetState();
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE:
			setState((ComponentModeDefinition) newValue);
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE:
			setState((ComponentModeDefinition) null);
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE:
			return state != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentCoordinationActionActivationImpl
