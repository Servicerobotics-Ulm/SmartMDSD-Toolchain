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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPSubNode;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.OperatingSystem;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetPlatformDefinitionImpl extends AbstractTPElementImpl implements TargetPlatformDefinition {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTPSubNode> elements;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem os;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPlatformDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.TARGET_PLATFORM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTPSubNode> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractTPSubNode>(AbstractTPSubNode.class, this,
					TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingSystem getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOs(OperatingSystem newOs, NotificationChain msgs) {
		OperatingSystem oldOs = os;
		os = newOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS, oldOs, newOs);
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
	public void setOs(OperatingSystem newOs) {
		if (newOs != os) {
			NotificationChain msgs = null;
			if (os != null)
				msgs = ((InternalEObject) os).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS, null, msgs);
			if (newOs != null)
				msgs = ((InternalEObject) newOs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS, null, msgs);
			msgs = basicSetOs(newOs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS,
					newOs, newOs));
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
					TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS:
			return basicSetOs(null, msgs);
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
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS:
			return getElements();
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS:
			return getOs();
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__NAME:
			return getName();
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
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractTPSubNode>) newValue);
			return;
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS:
			setOs((OperatingSystem) newValue);
			return;
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__NAME:
			setName((String) newValue);
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
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS:
			getElements().clear();
			return;
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS:
			setOs((OperatingSystem) null);
			return;
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
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
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__OS:
			return os != null;
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //TargetPlatformDefinitionImpl
