/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.ecore.service.skillDefinition.SkillDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationImpl#getSkillDef <em>Skill Def</em>}</li>
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SkillRealizationPackage.SKILL_REALIZATION__SKILL_DEF:
			if (resolve)
				return getSkillDef();
			return basicGetSkillDef();
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
		}
		return super.eIsSet(featureID);
	}

} //SkillRealizationImpl
