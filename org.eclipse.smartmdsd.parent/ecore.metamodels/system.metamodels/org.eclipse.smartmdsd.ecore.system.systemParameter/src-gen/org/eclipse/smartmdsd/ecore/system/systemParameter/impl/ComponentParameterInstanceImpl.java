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
package org.eclipse.smartmdsd.ecore.system.systemParameter.impl;

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

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;

import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance;
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl#getComponentParam <em>Component Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentParameterInstanceImpl extends MinimalEObjectImpl.Container implements ComponentParameterInstance {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterRefinement> parameters;

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
	 * The cached value of the '{@link #getComponentParam() <em>Component Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentParam()
	 * @generated
	 * @ordered
	 */
	protected ComponentParameter componentParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParameterInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemParameterPackage.Literals.COMPONENT_PARAMETER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject) componentInstance;
			componentInstance = (ComponentInstance) eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE,
							oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE, oldComponentInstance,
					componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterRefinement> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterRefinement>(ParameterRefinement.class, this,
					SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (componentInstance != null) {
			return getComponentInstance().getName();
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
		return (componentInstance != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentParameter getComponentParam() {
		if (componentParam != null && componentParam.eIsProxy()) {
			InternalEObject oldComponentParam = (InternalEObject) componentParam;
			componentParam = (ComponentParameter) eResolveProxy(oldComponentParam);
			if (componentParam != oldComponentParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM, oldComponentParam,
							componentParam));
			}
		}
		return componentParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameter basicGetComponentParam() {
		return componentParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentParam(ComponentParameter newComponentParam) {
		ComponentParameter oldComponentParam = componentParam;
		componentParam = newComponentParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM, oldComponentParam,
					componentParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE:
			if (resolve)
				return getComponentInstance();
			return basicGetComponentInstance();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS:
			return getParameters();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__NAME:
			return getName();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM:
			if (resolve)
				return getComponentParam();
			return basicGetComponentParam();
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
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE:
			setComponentInstance((ComponentInstance) newValue);
			return;
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends ParameterRefinement>) newValue);
			return;
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM:
			setComponentParam((ComponentParameter) newValue);
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
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE:
			setComponentInstance((ComponentInstance) null);
			return;
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS:
			getParameters().clear();
			return;
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM:
			setComponentParam((ComponentParameter) null);
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
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE:
			return componentInstance != null;
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__NAME:
			return isSetName();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM:
			return componentParam != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentParameterInstanceImpl
