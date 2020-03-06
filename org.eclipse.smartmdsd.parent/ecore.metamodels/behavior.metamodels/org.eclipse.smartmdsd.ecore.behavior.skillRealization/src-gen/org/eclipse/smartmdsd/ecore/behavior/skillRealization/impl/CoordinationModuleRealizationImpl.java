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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Module Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl#getCoordinationModuleDef <em>Coordination Module Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl#getCoordInterfaceInsts <em>Coord Interface Insts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationModuleRealizationImpl extends MinimalEObjectImpl.Container
		implements CoordinationModuleRealization {
	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<SkillRealization> skills;

	/**
	 * The cached value of the '{@link #getCoordinationModuleDef() <em>Coordination Module Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationModuleDef()
	 * @generated
	 * @ordered
	 */
	protected CoordinationModuleDefinition coordinationModuleDef;

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
	 * The cached value of the '{@link #getCoordInterfaceInsts() <em>Coord Interface Insts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordInterfaceInsts()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationInterfaceInstance> coordInterfaceInsts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationModuleRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.COORDINATION_MODULE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SkillRealization> getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList<SkillRealization>(SkillRealization.class, this,
					SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationModuleDefinition getCoordinationModuleDef() {
		if (coordinationModuleDef != null && coordinationModuleDef.eIsProxy()) {
			InternalEObject oldCoordinationModuleDef = (InternalEObject) coordinationModuleDef;
			coordinationModuleDef = (CoordinationModuleDefinition) eResolveProxy(oldCoordinationModuleDef);
			if (coordinationModuleDef != oldCoordinationModuleDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF,
							oldCoordinationModuleDef, coordinationModuleDef));
			}
		}
		return coordinationModuleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationModuleDefinition basicGetCoordinationModuleDef() {
		return coordinationModuleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinationModuleDef(CoordinationModuleDefinition newCoordinationModuleDef) {
		CoordinationModuleDefinition oldCoordinationModuleDef = coordinationModuleDef;
		coordinationModuleDef = newCoordinationModuleDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF,
					oldCoordinationModuleDef, coordinationModuleDef));
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
					SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoordinationInterfaceInstance> getCoordInterfaceInsts() {
		if (coordInterfaceInsts == null) {
			coordInterfaceInsts = new EObjectContainmentEList<CoordinationInterfaceInstance>(
					CoordinationInterfaceInstance.class, this,
					SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS);
		}
		return coordInterfaceInsts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS:
			return ((InternalEList<?>) getSkills()).basicRemove(otherEnd, msgs);
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS:
			return ((InternalEList<?>) getCoordInterfaceInsts()).basicRemove(otherEnd, msgs);
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
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS:
			return getSkills();
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF:
			if (resolve)
				return getCoordinationModuleDef();
			return basicGetCoordinationModuleDef();
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__NAME:
			return getName();
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS:
			return getCoordInterfaceInsts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS:
			getSkills().clear();
			getSkills().addAll((Collection<? extends SkillRealization>) newValue);
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF:
			setCoordinationModuleDef((CoordinationModuleDefinition) newValue);
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__NAME:
			setName((String) newValue);
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS:
			getCoordInterfaceInsts().clear();
			getCoordInterfaceInsts().addAll((Collection<? extends CoordinationInterfaceInstance>) newValue);
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
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS:
			getSkills().clear();
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF:
			setCoordinationModuleDef((CoordinationModuleDefinition) null);
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS:
			getCoordInterfaceInsts().clear();
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
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__SKILLS:
			return skills != null && !skills.isEmpty();
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF:
			return coordinationModuleDef != null;
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS:
			return coordInterfaceInsts != null && !coordInterfaceInsts.isEmpty();
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

} //CoordinationModuleRealizationImpl
