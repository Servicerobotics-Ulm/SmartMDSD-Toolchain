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
package org.eclipse.smartmdsd.ecore.service.communicationPattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl#getActivationType <em>Activation Type</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl#getEventStateType <em>Event State Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventPatternImpl extends ForkingPatternImpl implements EventPattern {
	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationObject eventType;

	/**
	 * The cached value of the '{@link #getActivationType() <em>Activation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationObject activationType;

	/**
	 * The cached value of the '{@link #getEventStateType() <em>Event State Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStateType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationObject eventStateType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.EVENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationObject getEventType() {
		if (eventType != null && eventType.eIsProxy()) {
			InternalEObject oldEventType = (InternalEObject) eventType;
			eventType = (CommunicationObject) eResolveProxy(oldEventType);
			if (eventType != oldEventType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE, oldEventType, eventType));
			}
		}
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject basicGetEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(CommunicationObject newEventType) {
		CommunicationObject oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE,
					oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationObject getActivationType() {
		if (activationType != null && activationType.eIsProxy()) {
			InternalEObject oldActivationType = (InternalEObject) activationType;
			activationType = (CommunicationObject) eResolveProxy(oldActivationType);
			if (activationType != oldActivationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE, oldActivationType,
							activationType));
			}
		}
		return activationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject basicGetActivationType() {
		return activationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationType(CommunicationObject newActivationType) {
		CommunicationObject oldActivationType = activationType;
		activationType = newActivationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE, oldActivationType, activationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationObject getEventStateType() {
		if (eventStateType != null && eventStateType.eIsProxy()) {
			InternalEObject oldEventStateType = (InternalEObject) eventStateType;
			eventStateType = (CommunicationObject) eResolveProxy(oldEventStateType);
			if (eventStateType != oldEventStateType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE, oldEventStateType,
							eventStateType));
			}
		}
		return eventStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject basicGetEventStateType() {
		return eventStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventStateType(CommunicationObject newEventStateType) {
		CommunicationObject oldEventStateType = eventStateType;
		eventStateType = newEventStateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE, oldEventStateType, eventStateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE:
			if (resolve)
				return getEventType();
			return basicGetEventType();
		case CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE:
			if (resolve)
				return getActivationType();
			return basicGetActivationType();
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE:
			if (resolve)
				return getEventStateType();
			return basicGetEventStateType();
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
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE:
			setEventType((CommunicationObject) newValue);
			return;
		case CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE:
			setActivationType((CommunicationObject) newValue);
			return;
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE:
			setEventStateType((CommunicationObject) newValue);
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
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE:
			setEventType((CommunicationObject) null);
			return;
		case CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE:
			setActivationType((CommunicationObject) null);
			return;
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE:
			setEventStateType((CommunicationObject) null);
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
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_TYPE:
			return eventType != null;
		case CommunicationPatternPackage.EVENT_PATTERN__ACTIVATION_TYPE:
			return activationType != null;
		case CommunicationPatternPackage.EVENT_PATTERN__EVENT_STATE_TYPE:
			return eventStateType != null;
		}
		return super.eIsSet(featureID);
	}

} //EventPatternImpl
