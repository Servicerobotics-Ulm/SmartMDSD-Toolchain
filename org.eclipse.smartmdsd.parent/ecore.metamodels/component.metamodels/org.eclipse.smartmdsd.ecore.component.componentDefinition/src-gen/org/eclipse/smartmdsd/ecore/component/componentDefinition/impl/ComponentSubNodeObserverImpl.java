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
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Sub Node Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeObserverImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSubNodeObserverImpl extends AbstractComponentLinkImpl implements ComponentSubNodeObserver {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected ComponentSubNode subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSubNodeObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (subject != null) {
			return getSubject().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSubNode getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject) subject;
			subject = (ComponentSubNode) eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSubNode basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(ComponentSubNode newSubject) {
		ComponentSubNode oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT:
			if (resolve)
				return getSubject();
			return basicGetSubject();
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
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT:
			setSubject((ComponentSubNode) newValue);
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
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT:
			setSubject((ComponentSubNode) null);
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
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER__SUBJECT:
			return subject != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentSubNodeObserverImpl
