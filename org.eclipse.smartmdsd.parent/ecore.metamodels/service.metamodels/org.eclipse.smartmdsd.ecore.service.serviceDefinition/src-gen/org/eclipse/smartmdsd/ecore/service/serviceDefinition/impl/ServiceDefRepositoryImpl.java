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
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Def Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefRepositoryImpl extends AbstractDocumentationElementImpl implements ServiceDefRepository {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected ServiceRepoVersion version;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractServiceDefinition> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.SERVICE_DEF_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRepoVersion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(ServiceRepoVersion newVersion, NotificationChain msgs) {
		ServiceRepoVersion oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION, oldVersion, newVersion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(ServiceRepoVersion newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject) version).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractServiceDefinition> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<AbstractServiceDefinition>(AbstractServiceDefinition.class, this,
					ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION:
			return basicSetVersion(null, msgs);
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
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
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__NAME:
			return getName();
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION:
			return getVersion();
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES:
			return getServices();
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
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__NAME:
			setName((String) newValue);
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION:
			setVersion((ServiceRepoVersion) newValue);
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends AbstractServiceDefinition>) newValue);
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
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION:
			setVersion((ServiceRepoVersion) null);
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES:
			getServices().clear();
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
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__VERSION:
			return version != null;
		case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY__SERVICES:
			return services != null && !services.isEmpty();
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

} //ServiceDefRepositoryImpl
