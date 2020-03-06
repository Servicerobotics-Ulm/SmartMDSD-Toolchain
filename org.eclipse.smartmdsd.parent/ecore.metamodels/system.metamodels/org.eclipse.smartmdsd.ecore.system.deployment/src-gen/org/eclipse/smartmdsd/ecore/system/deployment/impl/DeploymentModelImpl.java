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
package org.eclipse.smartmdsd.ecore.system.deployment.impl;

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

import org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl#getComponentArch <em>Component Arch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentModelImpl extends MinimalEObjectImpl.Container implements DeploymentModel {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentElement> elements;

	/**
	 * The cached value of the '{@link #getComponentArch() <em>Component Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentArch()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentArchitecture componentArch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractDeploymentElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractDeploymentElement>(AbstractDeploymentElement.class, this,
					DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemComponentArchitecture getComponentArch() {
		if (componentArch != null && componentArch.eIsProxy()) {
			InternalEObject oldComponentArch = (InternalEObject) componentArch;
			componentArch = (SystemComponentArchitecture) eResolveProxy(oldComponentArch);
			if (componentArch != oldComponentArch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH, oldComponentArch, componentArch));
			}
		}
		return componentArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentArchitecture basicGetComponentArch() {
		return componentArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentArch(SystemComponentArchitecture newComponentArch) {
		SystemComponentArchitecture oldComponentArch = componentArch;
		componentArch = newComponentArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH,
					oldComponentArch, componentArch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case DeploymentPackage.DEPLOYMENT_MODEL__NAME:
			return getName();
		case DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS:
			return getElements();
		case DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH:
			if (resolve)
				return getComponentArch();
			return basicGetComponentArch();
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
		case DeploymentPackage.DEPLOYMENT_MODEL__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractDeploymentElement>) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH:
			setComponentArch((SystemComponentArchitecture) newValue);
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
		case DeploymentPackage.DEPLOYMENT_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS:
			getElements().clear();
			return;
		case DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH:
			setComponentArch((SystemComponentArchitecture) null);
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
		case DeploymentPackage.DEPLOYMENT_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.DEPLOYMENT_MODEL__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case DeploymentPackage.DEPLOYMENT_MODEL__COMPONENT_ARCH:
			return componentArch != null;
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

} //DeploymentModelImpl
