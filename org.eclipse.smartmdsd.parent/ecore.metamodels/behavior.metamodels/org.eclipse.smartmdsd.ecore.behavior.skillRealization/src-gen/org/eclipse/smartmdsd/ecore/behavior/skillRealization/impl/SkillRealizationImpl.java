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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl#getSkillDef <em>Skill Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationImpl extends MinimalEObjectImpl.Container implements SkillRealization {
	/**
	 * The cached value of the '{@link #getSkillDef() <em>Skill Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillDef()
	 * @generated
	 * @ordered
	 */
	protected SkillDefinition skillDef;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected CoordinationActionBlock action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.SKILL_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillDefinition getSkillDef() {
		if (skillDef != null && skillDef.eIsProxy()) {
			InternalEObject oldSkillDef = (InternalEObject) skillDef;
			skillDef = (SkillDefinition) eResolveProxy(oldSkillDef);
			if (skillDef != oldSkillDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF, oldSkillDef, skillDef));
			}
		}
		return skillDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillDefinition basicGetSkillDef() {
		return skillDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillDef(SkillDefinition newSkillDef) {
		SkillDefinition oldSkillDef = skillDef;
		skillDef = newSkillDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF,
					oldSkillDef, skillDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationActionBlock getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(CoordinationActionBlock newAction, NotificationChain msgs) {
		CoordinationActionBlock oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.SKILL_REALIZATION__ACTION, oldAction, newAction);
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
	public void setAction(CoordinationActionBlock newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SkillRealizationPackage.SKILL_REALIZATION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SkillRealizationPackage.SKILL_REALIZATION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkillRealizationPackage.SKILL_REALIZATION__ACTION,
					newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillRealizationPackage.SKILL_REALIZATION__ACTION:
			return basicSetAction(null, msgs);
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
		case SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF:
			if (resolve)
				return getSkillDef();
			return basicGetSkillDef();
		case SkillRealizationPackage.SKILL_REALIZATION__ACTION:
			return getAction();
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
		case SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF:
			setSkillDef((SkillDefinition) newValue);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION__ACTION:
			setAction((CoordinationActionBlock) newValue);
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
		case SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF:
			setSkillDef((SkillDefinition) null);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION__ACTION:
			setAction((CoordinationActionBlock) null);
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
		case SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF:
			return skillDef != null;
		case SkillRealizationPackage.SKILL_REALIZATION__ACTION:
			return action != null;
		}
		return super.eIsSet(featureID);
	}

} //SkillRealizationImpl
