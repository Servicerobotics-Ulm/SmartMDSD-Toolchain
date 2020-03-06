/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl.ExecutionTimeImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl.ExecutionTimeImpl#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionTimeImpl extends MinimalEObjectImpl.Container implements ExecutionTime {
	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue minTime;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue maxTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.EXECUTION_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeValue getMinTime() {
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinTime(TimeValue newMinTime, NotificationChain msgs) {
		TimeValue oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME, oldMinTime, newMinTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTime(TimeValue newMinTime) {
		if (newMinTime != minTime) {
			NotificationChain msgs = null;
			if (minTime != null)
				msgs = ((InternalEObject) minTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME, null, msgs);
			if (newMinTime != null)
				msgs = ((InternalEObject) newMinTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME, null, msgs);
			msgs = basicSetMinTime(newMinTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME,
					newMinTime, newMinTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeValue getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxTime(TimeValue newMaxTime, NotificationChain msgs) {
		TimeValue oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME, oldMaxTime, newMaxTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTime(TimeValue newMaxTime) {
		if (newMaxTime != maxTime) {
			NotificationChain msgs = null;
			if (maxTime != null)
				msgs = ((InternalEObject) maxTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME, null, msgs);
			if (newMaxTime != null)
				msgs = ((InternalEObject) newMaxTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME, null, msgs);
			msgs = basicSetMaxTime(newMaxTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME,
					newMaxTime, newMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME:
			return basicSetMinTime(null, msgs);
		case ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME:
			return basicSetMaxTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME:
			return getMinTime();
		case ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME:
			return getMaxTime();
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
		case ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME:
			setMinTime((TimeValue) newValue);
			return;
		case ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME:
			setMaxTime((TimeValue) newValue);
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
		case ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME:
			setMinTime((TimeValue) null);
			return;
		case ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME:
			setMaxTime((TimeValue) null);
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
		case ActivityArchitecturePackage.EXECUTION_TIME__MIN_TIME:
			return minTime != null;
		case ActivityArchitecturePackage.EXECUTION_TIME__MAX_TIME:
			return maxTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionTimeImpl
