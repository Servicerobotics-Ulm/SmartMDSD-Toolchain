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
package org.eclipse.smartmdsd.ecore.component.seronetExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROSLink;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixed Port ROS Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.impl.MixedPortROSLinkImpl#getMixedportros <em>Mixedportros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixedPortROSLinkImpl extends AbstractComponentLinkImpl implements MixedPortROSLink {
	/**
	 * The cached value of the '{@link #getMixedportros() <em>Mixedportros</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixedportros()
	 * @generated
	 * @ordered
	 */
	protected MixedPortROS mixedportros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixedPortROSLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (mixedportros != null) {
			return getMixedportros().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortROS getMixedportros() {
		if (mixedportros != null && mixedportros.eIsProxy()) {
			InternalEObject oldMixedportros = (InternalEObject) mixedportros;
			mixedportros = (MixedPortROS) eResolveProxy(oldMixedportros);
			if (mixedportros != oldMixedportros) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS, oldMixedportros, mixedportros));
			}
		}
		return mixedportros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedPortROS basicGetMixedportros() {
		return mixedportros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMixedportros(MixedPortROS newMixedportros) {
		MixedPortROS oldMixedportros = mixedportros;
		mixedportros = newMixedportros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS, oldMixedportros, mixedportros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS:
			if (resolve)
				return getMixedportros();
			return basicGetMixedportros();
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
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS:
			setMixedportros((MixedPortROS) newValue);
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
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS:
			setMixedportros((MixedPortROS) null);
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
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK__MIXEDPORTROS:
			return mixedportros != null;
		}
		return super.eIsSet(featureID);
	}

} //MixedPortROSLinkImpl
