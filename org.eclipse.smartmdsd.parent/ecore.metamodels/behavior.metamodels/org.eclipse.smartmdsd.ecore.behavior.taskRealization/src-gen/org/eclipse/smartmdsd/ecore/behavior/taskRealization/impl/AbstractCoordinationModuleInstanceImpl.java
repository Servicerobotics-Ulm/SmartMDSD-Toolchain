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
package org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Coordination Module Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl#getCoordModuleDef <em>Coord Module Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCoordinationModuleInstanceImpl extends MinimalEObjectImpl.Container
		implements AbstractCoordinationModuleInstance {
	/**
	 * The cached value of the '{@link #getCoordModuleDef() <em>Coord Module Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordModuleDef()
	 * @generated
	 * @ordered
	 */
	protected CoordinationModuleDefinition coordModuleDef;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCoordinationModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationModuleDefinition getCoordModuleDef() {
		if (coordModuleDef != null && coordModuleDef.eIsProxy()) {
			InternalEObject oldCoordModuleDef = (InternalEObject) coordModuleDef;
			coordModuleDef = (CoordinationModuleDefinition) eResolveProxy(oldCoordModuleDef);
			if (coordModuleDef != oldCoordModuleDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF,
							oldCoordModuleDef, coordModuleDef));
			}
		}
		return coordModuleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationModuleDefinition basicGetCoordModuleDef() {
		return coordModuleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordModuleDef(CoordinationModuleDefinition newCoordModuleDef) {
		CoordinationModuleDefinition oldCoordModuleDef = coordModuleDef;
		coordModuleDef = newCoordModuleDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF, oldCoordModuleDef,
					coordModuleDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF:
			if (resolve)
				return getCoordModuleDef();
			return basicGetCoordModuleDef();
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME:
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
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF:
			setCoordModuleDef((CoordinationModuleDefinition) newValue);
			return;
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME:
			setName((String) newValue);
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
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF:
			setCoordModuleDef((CoordinationModuleDefinition) null);
			return;
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
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
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF:
			return coordModuleDef != null;
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractCoordinationModuleInstanceImpl
