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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl;

import org.eclipse.smartmdsd.ecore.service.communicationObject.AbstractCommElement;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommElementReferenceImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommElementReferenceImpl extends AbstractAttributeTypeImpl implements CommElementReference {
	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected AbstractCommElement typeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationObjectPackage.Literals.COMM_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCommElement getTypeName() {
		if (typeName != null && typeName.eIsProxy()) {
			InternalEObject oldTypeName = (InternalEObject) typeName;
			typeName = (AbstractCommElement) eResolveProxy(oldTypeName);
			if (typeName != oldTypeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME, oldTypeName, typeName));
			}
		}
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCommElement basicGetTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(AbstractCommElement newTypeName) {
		AbstractCommElement oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME:
			if (resolve)
				return getTypeName();
			return basicGetTypeName();
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
		case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME:
			setTypeName((AbstractCommElement) newValue);
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
		case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME:
			setTypeName((AbstractCommElement) null);
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
		case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE__TYPE_NAME:
			return typeName != null;
		}
		return super.eIsSet(featureID);
	}

} //CommElementReferenceImpl
