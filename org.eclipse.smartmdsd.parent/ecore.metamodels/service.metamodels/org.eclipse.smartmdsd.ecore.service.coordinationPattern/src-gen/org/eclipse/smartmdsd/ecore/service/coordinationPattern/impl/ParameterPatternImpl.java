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
package org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.ParameterPattern;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl.ParameterPatternImpl#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterPatternImpl extends CoordinationPatternImpl implements ParameterPattern {
	/**
	 * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSetDefinition parameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPatternPackage.Literals.PARAMETER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSetDefinition getParameterSet() {
		if (parameterSet != null && parameterSet.eIsProxy()) {
			InternalEObject oldParameterSet = (InternalEObject) parameterSet;
			parameterSet = (ParameterSetDefinition) eResolveProxy(oldParameterSet);
			if (parameterSet != oldParameterSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET, oldParameterSet,
							parameterSet));
			}
		}
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetDefinition basicGetParameterSet() {
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterSet(ParameterSetDefinition newParameterSet) {
		ParameterSetDefinition oldParameterSet = parameterSet;
		parameterSet = newParameterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET, oldParameterSet, parameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET:
			if (resolve)
				return getParameterSet();
			return basicGetParameterSet();
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
		case CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET:
			setParameterSet((ParameterSetDefinition) newValue);
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
		case CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET:
			setParameterSet((ParameterSetDefinition) null);
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
		case CoordinationPatternPackage.PARAMETER_PATTERN__PARAMETER_SET:
			return parameterSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterPatternImpl
