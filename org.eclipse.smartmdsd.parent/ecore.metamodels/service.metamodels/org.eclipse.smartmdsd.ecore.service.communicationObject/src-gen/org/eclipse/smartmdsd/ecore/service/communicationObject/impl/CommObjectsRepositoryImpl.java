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
package org.eclipse.smartmdsd.ecore.service.communicationObject.impl;

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

import org.eclipse.smartmdsd.ecore.service.communicationObject.AbstractCommElement;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;
import org.eclipse.smartmdsd.ecore.service.communicationObject.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Objects Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommObjectsRepositoryImpl extends AbstractDocumentationElementImpl implements CommObjectsRepository {
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
	protected EList<AbstractCommElement> elements;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The default value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected String dependency = DEPENDENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommObjectsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY;
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
					CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCommElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractCommElement>(AbstractCommElement.class, this,
					CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION, oldVersion, newVersion);
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
	public void setVersion(Version newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject) version).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION, null,
						msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION, null,
						msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependency() {
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependency(String newDependency) {
		String oldDependency = dependency;
		dependency = newDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY, oldDependency, dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
			return basicSetVersion(null, msgs);
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
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME:
			return getName();
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
			return getElements();
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
			return getVersion();
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY:
			return getDependency();
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
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME:
			setName((String) newValue);
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractCommElement>) newValue);
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
			setVersion((Version) newValue);
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY:
			setDependency((String) newValue);
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
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
			getElements().clear();
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
			setVersion((Version) null);
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY:
			setDependency(DEPENDENCY_EDEFAULT);
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
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
			return version != null;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY:
			return DEPENDENCY_EDEFAULT == null ? dependency != null : !DEPENDENCY_EDEFAULT.equals(dependency);
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
		result.append(", dependency: ");
		result.append(dependency);
		result.append(')');
		return result.toString();
	}

} //CommObjectsRepositoryImpl
