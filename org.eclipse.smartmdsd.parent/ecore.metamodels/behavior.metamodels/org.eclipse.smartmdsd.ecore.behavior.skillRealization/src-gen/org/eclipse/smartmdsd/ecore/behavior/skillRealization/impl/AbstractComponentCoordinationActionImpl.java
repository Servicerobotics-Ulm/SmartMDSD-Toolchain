/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component Coordination Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractComponentCoordinationActionImpl#getCoordinationService <em>Coordination Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComponentCoordinationActionImpl extends AbstractCoordinationActionImpl
		implements AbstractComponentCoordinationAction {
	/**
	 * The cached value of the '{@link #getCoordinationService() <em>Coordination Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationService()
	 * @generated
	 * @ordered
	 */
	protected CoordinationInterfaceInstance coordinationService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentCoordinationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationInterfaceInstance getCoordinationService() {
		if (coordinationService != null && coordinationService.eIsProxy()) {
			InternalEObject oldCoordinationService = (InternalEObject) coordinationService;
			coordinationService = (CoordinationInterfaceInstance) eResolveProxy(oldCoordinationService);
			if (coordinationService != oldCoordinationService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE,
							oldCoordinationService, coordinationService));
			}
		}
		return coordinationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationInterfaceInstance basicGetCoordinationService() {
		return coordinationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinationService(CoordinationInterfaceInstance newCoordinationService) {
		CoordinationInterfaceInstance oldCoordinationService = coordinationService;
		coordinationService = newCoordinationService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE,
					oldCoordinationService, coordinationService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE:
			if (resolve)
				return getCoordinationService();
			return basicGetCoordinationService();
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
		case SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE:
			setCoordinationService((CoordinationInterfaceInstance) newValue);
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
		case SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE:
			setCoordinationService((CoordinationInterfaceInstance) null);
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
		case SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE:
			return coordinationService != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractComponentCoordinationActionImpl
