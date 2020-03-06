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
package org.eclipse.smartmdsd.ecore.system.targetPlatform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.CPUImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.CPUImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.CPUImpl#getCoresTally <em>Cores Tally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUImpl extends AbstractTPSubNodeImpl implements CPU {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getCoresTally() <em>Cores Tally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoresTally()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_TALLY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCoresTally() <em>Cores Tally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoresTally()
	 * @generated
	 * @ordered
	 */
	protected int coresTally = CORES_TALLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.CPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.CPU__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.CPU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCoresTally() {
		return coresTally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoresTally(int newCoresTally) {
		int oldCoresTally = coresTally;
		coresTally = newCoresTally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.CPU__CORES_TALLY, oldCoresTally,
					coresTally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPlatformPackage.CPU__KIND:
			return getKind();
		case TargetPlatformPackage.CPU__NAME:
			return getName();
		case TargetPlatformPackage.CPU__CORES_TALLY:
			return getCoresTally();
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
		case TargetPlatformPackage.CPU__KIND:
			setKind((String) newValue);
			return;
		case TargetPlatformPackage.CPU__NAME:
			setName((String) newValue);
			return;
		case TargetPlatformPackage.CPU__CORES_TALLY:
			setCoresTally((Integer) newValue);
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
		case TargetPlatformPackage.CPU__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case TargetPlatformPackage.CPU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TargetPlatformPackage.CPU__CORES_TALLY:
			setCoresTally(CORES_TALLY_EDEFAULT);
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
		case TargetPlatformPackage.CPU__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
		case TargetPlatformPackage.CPU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TargetPlatformPackage.CPU__CORES_TALLY:
			return coresTally != CORES_TALLY_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", name: ");
		result.append(name);
		result.append(", coresTally: ");
		result.append(coresTally);
		result.append(')');
		return result.toString();
	}

} //CPUImpl
