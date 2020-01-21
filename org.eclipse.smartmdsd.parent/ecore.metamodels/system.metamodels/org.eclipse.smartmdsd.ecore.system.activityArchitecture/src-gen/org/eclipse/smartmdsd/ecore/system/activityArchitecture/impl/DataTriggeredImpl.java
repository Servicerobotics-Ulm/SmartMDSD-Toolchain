/**
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataTriggered;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TriggerInputNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Triggered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl.DataTriggeredImpl#getPrescale <em>Prescale</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl.DataTriggeredImpl#getTriggerRef <em>Trigger Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTriggeredImpl extends ActivationSourceImpl implements DataTriggered {
	/**
	 * The default value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESCALE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected int prescale = PRESCALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggerRef() <em>Trigger Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerRef()
	 * @generated
	 * @ordered
	 */
	protected TriggerInputNode triggerRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTriggeredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.DATA_TRIGGERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrescale() {
		return prescale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrescale(int newPrescale) {
		int oldPrescale = prescale;
		prescale = newPrescale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.DATA_TRIGGERED__PRESCALE,
					oldPrescale, prescale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerInputNode getTriggerRef() {
		if (triggerRef != null && triggerRef.eIsProxy()) {
			InternalEObject oldTriggerRef = (InternalEObject) triggerRef;
			triggerRef = (TriggerInputNode) eResolveProxy(oldTriggerRef);
			if (triggerRef != oldTriggerRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF, oldTriggerRef, triggerRef));
			}
		}
		return triggerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerInputNode basicGetTriggerRef() {
		return triggerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerRef(TriggerInputNode newTriggerRef) {
		TriggerInputNode oldTriggerRef = triggerRef;
		triggerRef = newTriggerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF, oldTriggerRef, triggerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivityArchitecturePackage.DATA_TRIGGERED__PRESCALE:
			return getPrescale();
		case ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF:
			if (resolve)
				return getTriggerRef();
			return basicGetTriggerRef();
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
		case ActivityArchitecturePackage.DATA_TRIGGERED__PRESCALE:
			setPrescale((Integer) newValue);
			return;
		case ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF:
			setTriggerRef((TriggerInputNode) newValue);
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
		case ActivityArchitecturePackage.DATA_TRIGGERED__PRESCALE:
			setPrescale(PRESCALE_EDEFAULT);
			return;
		case ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF:
			setTriggerRef((TriggerInputNode) null);
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
		case ActivityArchitecturePackage.DATA_TRIGGERED__PRESCALE:
			return prescale != PRESCALE_EDEFAULT;
		case ActivityArchitecturePackage.DATA_TRIGGERED__TRIGGER_REF:
			return triggerRef != null;
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
		result.append(" (prescale: ");
		result.append(prescale);
		result.append(')');
		return result.toString();
	}

} //DataTriggeredImpl
