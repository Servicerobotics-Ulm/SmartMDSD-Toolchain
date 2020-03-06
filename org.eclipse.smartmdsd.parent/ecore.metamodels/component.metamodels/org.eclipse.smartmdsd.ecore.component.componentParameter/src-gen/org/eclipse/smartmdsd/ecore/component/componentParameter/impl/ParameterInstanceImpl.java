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
package org.eclipse.smartmdsd.ecore.component.componentParameter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement;

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl#getParameterDef <em>Parameter Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterInstanceImpl extends AbstractParameterInstanceImpl implements ParameterInstance {
	/**
	 * The cached value of the '{@link #getParameterDef() <em>Parameter Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDef()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition parameterDef;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRefinement> attributes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.PARAMETER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getParameterDef() {
		if (parameterDef != null && parameterDef.eIsProxy()) {
			InternalEObject oldParameterDef = (InternalEObject) parameterDef;
			parameterDef = (ParameterDefinition) eResolveProxy(oldParameterDef);
			if (parameterDef != oldParameterDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF, oldParameterDef,
							parameterDef));
			}
		}
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition basicGetParameterDef() {
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterDef(ParameterDefinition newParameterDef) {
		ParameterDefinition oldParameterDef = parameterDef;
		parameterDef = newParameterDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF, oldParameterDef, parameterDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeRefinement> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeRefinement>(AttributeRefinement.class, this,
					ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (parameterDef != null) {
			return getParameterDef().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetName() {
		return (parameterDef != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF:
			if (resolve)
				return getParameterDef();
			return basicGetParameterDef();
		case ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES:
			return getAttributes();
		case ComponentParameterPackage.PARAMETER_INSTANCE__NAME:
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
		case ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF:
			setParameterDef((ParameterDefinition) newValue);
			return;
		case ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends AttributeRefinement>) newValue);
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
		case ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF:
			setParameterDef((ParameterDefinition) null);
			return;
		case ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES:
			getAttributes().clear();
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
		case ComponentParameterPackage.PARAMETER_INSTANCE__PARAMETER_DEF:
			return parameterDef != null;
		case ComponentParameterPackage.PARAMETER_INSTANCE__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ComponentParameterPackage.PARAMETER_INSTANCE__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //ParameterInstanceImpl
