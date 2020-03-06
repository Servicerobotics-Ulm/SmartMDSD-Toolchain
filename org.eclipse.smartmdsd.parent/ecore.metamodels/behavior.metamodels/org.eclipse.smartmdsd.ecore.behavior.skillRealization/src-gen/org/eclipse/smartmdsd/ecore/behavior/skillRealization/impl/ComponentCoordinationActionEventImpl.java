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
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Coordination Action Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentCoordinationActionEventImpl extends AbstractComponentCoordinationActionImpl
		implements ComponentCoordinationActionEvent {
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
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EventHandler handler;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final EventMode MODE_EDEFAULT = EventMode.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EventMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected String param = PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentCoordinationActionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_EVENT;
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
					SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventHandler getHandler() {
		if (handler != null && handler.eIsProxy()) {
			InternalEObject oldHandler = (InternalEObject) handler;
			handler = (EventHandler) eResolveProxy(oldHandler);
			if (handler != oldHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER, oldHandler, handler));
			}
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler basicGetHandler() {
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandler(EventHandler newHandler) {
		EventHandler oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER, oldHandler, handler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(EventMode newMode) {
		EventMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParam(String newParam) {
		String oldParam = param;
		param = newParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM, oldParam, param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME:
			return getName();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER:
			if (resolve)
				return getHandler();
			return basicGetHandler();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE:
			return getMode();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM:
			return getParam();
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME:
			setName((String) newValue);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER:
			setHandler((EventHandler) newValue);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE:
			setMode((EventMode) newValue);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM:
			setParam((String) newValue);
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER:
			setHandler((EventHandler) null);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM:
			setParam(PARAM_EDEFAULT);
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
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER:
			return handler != null;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE:
			return mode != MODE_EDEFAULT;
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM:
			return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
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
		result.append(", mode: ");
		result.append(mode);
		result.append(", param: ");
		result.append(param);
		result.append(')');
		return result.toString();
	}

} //ComponentCoordinationActionEventImpl
