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
package org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl;

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

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel;

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityChain;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CuaseEffectChainModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuase Effect Chain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl#getChains <em>Chains</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl#getActArch <em>Act Arch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuaseEffectChainModelImpl extends MinimalEObjectImpl.Container implements CuaseEffectChainModel {
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
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityChain> chains;

	/**
	 * The cached value of the '{@link #getActArch() <em>Act Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActArch()
	 * @generated
	 * @ordered
	 */
	protected ActivityArchitectureModel actArch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuaseEffectChainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CauseEffectChainPackage.Literals.CUASE_EFFECT_CHAIN_MODEL;
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
					CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityChain> getChains() {
		if (chains == null) {
			chains = new EObjectContainmentEList<ActivityChain>(ActivityChain.class, this,
					CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityArchitectureModel getActArch() {
		if (actArch != null && actArch.eIsProxy()) {
			InternalEObject oldActArch = (InternalEObject) actArch;
			actArch = (ActivityArchitectureModel) eResolveProxy(oldActArch);
			if (actArch != oldActArch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH, oldActArch, actArch));
			}
		}
		return actArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureModel basicGetActArch() {
		return actArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActArch(ActivityArchitectureModel newActArch) {
		ActivityArchitectureModel oldActArch = actArch;
		actArch = newActArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH, oldActArch, actArch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS:
			return ((InternalEList<?>) getChains()).basicRemove(otherEnd, msgs);
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__NAME:
			return getName();
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS:
			return getChains();
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH:
			if (resolve)
				return getActArch();
			return basicGetActArch();
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__NAME:
			setName((String) newValue);
			return;
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS:
			getChains().clear();
			getChains().addAll((Collection<? extends ActivityChain>) newValue);
			return;
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH:
			setActArch((ActivityArchitectureModel) newValue);
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS:
			getChains().clear();
			return;
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH:
			setActArch((ActivityArchitectureModel) null);
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__CHAINS:
			return chains != null && !chains.isEmpty();
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH:
			return actArch != null;
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

} //CuaseEffectChainModelImpl
