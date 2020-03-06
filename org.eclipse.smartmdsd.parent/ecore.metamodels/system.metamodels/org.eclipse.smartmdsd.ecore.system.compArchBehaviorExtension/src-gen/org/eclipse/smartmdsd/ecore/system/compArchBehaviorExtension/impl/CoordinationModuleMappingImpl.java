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
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Module Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl#getCoordModuleInst <em>Coord Module Inst</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl#getCoordModReal <em>Coord Mod Real</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl#getCoordInterCompInstMapping <em>Coord Inter Comp Inst Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationModuleMappingImpl extends SystemExtensionImpl implements CoordinationModuleMapping {
	/**
	 * The cached value of the '{@link #getCoordModuleInst() <em>Coord Module Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordModuleInst()
	 * @generated
	 * @ordered
	 */
	protected AbstractCoordinationModuleInstance coordModuleInst;

	/**
	 * The cached value of the '{@link #getCoordModReal() <em>Coord Mod Real</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordModReal()
	 * @generated
	 * @ordered
	 */
	protected CoordinationModuleRealization coordModReal;

	/**
	 * The cached value of the '{@link #getCoordInterCompInstMapping() <em>Coord Inter Comp Inst Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordInterCompInstMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationInterfaceComponentInstanceMapping> coordInterCompInstMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationModuleMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompArchBehaviorExtensionPackage.Literals.COORDINATION_MODULE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinationModuleInstance getCoordModuleInst() {
		if (coordModuleInst != null && coordModuleInst.eIsProxy()) {
			InternalEObject oldCoordModuleInst = (InternalEObject) coordModuleInst;
			coordModuleInst = (AbstractCoordinationModuleInstance) eResolveProxy(oldCoordModuleInst);
			if (coordModuleInst != oldCoordModuleInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST,
							oldCoordModuleInst, coordModuleInst));
			}
		}
		return coordModuleInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinationModuleInstance basicGetCoordModuleInst() {
		return coordModuleInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordModuleInst(AbstractCoordinationModuleInstance newCoordModuleInst) {
		AbstractCoordinationModuleInstance oldCoordModuleInst = coordModuleInst;
		coordModuleInst = newCoordModuleInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST, oldCoordModuleInst,
					coordModuleInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationModuleRealization getCoordModReal() {
		if (coordModReal != null && coordModReal.eIsProxy()) {
			InternalEObject oldCoordModReal = (InternalEObject) coordModReal;
			coordModReal = (CoordinationModuleRealization) eResolveProxy(oldCoordModReal);
			if (coordModReal != oldCoordModReal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL,
							oldCoordModReal, coordModReal));
			}
		}
		return coordModReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationModuleRealization basicGetCoordModReal() {
		return coordModReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordModReal(CoordinationModuleRealization newCoordModReal) {
		CoordinationModuleRealization oldCoordModReal = coordModReal;
		coordModReal = newCoordModReal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL, oldCoordModReal,
					coordModReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoordinationInterfaceComponentInstanceMapping> getCoordInterCompInstMapping() {
		if (coordInterCompInstMapping == null) {
			coordInterCompInstMapping = new EObjectContainmentEList<CoordinationInterfaceComponentInstanceMapping>(
					CoordinationInterfaceComponentInstanceMapping.class, this,
					CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING);
		}
		return coordInterCompInstMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING:
			return ((InternalEList<?>) getCoordInterCompInstMapping()).basicRemove(otherEnd, msgs);
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST:
			if (resolve)
				return getCoordModuleInst();
			return basicGetCoordModuleInst();
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL:
			if (resolve)
				return getCoordModReal();
			return basicGetCoordModReal();
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING:
			return getCoordInterCompInstMapping();
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST:
			setCoordModuleInst((AbstractCoordinationModuleInstance) newValue);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL:
			setCoordModReal((CoordinationModuleRealization) newValue);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING:
			getCoordInterCompInstMapping().clear();
			getCoordInterCompInstMapping()
					.addAll((Collection<? extends CoordinationInterfaceComponentInstanceMapping>) newValue);
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST:
			setCoordModuleInst((AbstractCoordinationModuleInstance) null);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL:
			setCoordModReal((CoordinationModuleRealization) null);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING:
			getCoordInterCompInstMapping().clear();
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MODULE_INST:
			return coordModuleInst != null;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_MOD_REAL:
			return coordModReal != null;
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING:
			return coordInterCompInstMapping != null && !coordInterCompInstMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationModuleMappingImpl
