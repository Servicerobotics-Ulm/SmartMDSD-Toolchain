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
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl;

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

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;

import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Datasheet Property Checks Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDatasheetPropertyChecksModelImpl extends MinimalEObjectImpl.Container
		implements SystemDatasheetPropertyChecksModel {
	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasheetPropertyCheck> checks;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentArchitecture system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDatasheetPropertyChecksModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasheetPropertyChecksPackage.Literals.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasheetPropertyCheck> getChecks() {
		if (checks == null) {
			checks = new EObjectContainmentEList<DatasheetPropertyCheck>(DatasheetPropertyCheck.class, this,
					DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS);
		}
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponentArchitecture getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject) system;
			system = (SystemComponentArchitecture) eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM, oldSystem,
							system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentArchitecture basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(SystemComponentArchitecture newSystem) {
		SystemComponentArchitecture oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS:
			return ((InternalEList<?>) getChecks()).basicRemove(otherEnd, msgs);
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
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS:
			return getChecks();
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
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
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS:
			getChecks().clear();
			getChecks().addAll((Collection<? extends DatasheetPropertyCheck>) newValue);
			return;
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM:
			setSystem((SystemComponentArchitecture) newValue);
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
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS:
			getChecks().clear();
			return;
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM:
			setSystem((SystemComponentArchitecture) null);
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
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS:
			return checks != null && !checks.isEmpty();
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM:
			return system != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemDatasheetPropertyChecksModelImpl
