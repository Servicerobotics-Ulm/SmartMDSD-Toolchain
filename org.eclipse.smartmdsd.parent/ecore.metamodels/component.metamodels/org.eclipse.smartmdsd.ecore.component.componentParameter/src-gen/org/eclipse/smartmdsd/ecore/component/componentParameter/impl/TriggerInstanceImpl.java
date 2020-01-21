/**
 */
package org.eclipse.smartmdsd.ecore.component.componentParameter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage;
import org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl#getTriggerDef <em>Trigger Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerInstanceImpl extends AbstractParameterInstanceImpl implements TriggerInstance {
	/**
	 * The cached value of the '{@link #getTriggerDef() <em>Trigger Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerDef()
	 * @generated
	 * @ordered
	 */
	protected TriggerDefinition triggerDef;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.TRIGGER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition getTriggerDef() {
		if (triggerDef != null && triggerDef.eIsProxy()) {
			InternalEObject oldTriggerDef = (InternalEObject) triggerDef;
			triggerDef = (TriggerDefinition) eResolveProxy(oldTriggerDef);
			if (triggerDef != oldTriggerDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF, oldTriggerDef, triggerDef));
			}
		}
		return triggerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition basicGetTriggerDef() {
		return triggerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerDef(TriggerDefinition newTriggerDef) {
		TriggerDefinition oldTriggerDef = triggerDef;
		triggerDef = newTriggerDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF, oldTriggerDef, triggerDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentParameterPackage.TRIGGER_INSTANCE__ACTIVE,
					oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (triggerDef != null) {
			return getTriggerDef().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (triggerDef != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF:
			if (resolve)
				return getTriggerDef();
			return basicGetTriggerDef();
		case ComponentParameterPackage.TRIGGER_INSTANCE__ACTIVE:
			return isActive();
		case ComponentParameterPackage.TRIGGER_INSTANCE__NAME:
			return getName();
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
		case ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF:
			setTriggerDef((TriggerDefinition) newValue);
			return;
		case ComponentParameterPackage.TRIGGER_INSTANCE__ACTIVE:
			setActive((Boolean) newValue);
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
		case ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF:
			setTriggerDef((TriggerDefinition) null);
			return;
		case ComponentParameterPackage.TRIGGER_INSTANCE__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
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
		case ComponentParameterPackage.TRIGGER_INSTANCE__TRIGGER_DEF:
			return triggerDef != null;
		case ComponentParameterPackage.TRIGGER_INSTANCE__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case ComponentParameterPackage.TRIGGER_INSTANCE__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //TriggerInstanceImpl
