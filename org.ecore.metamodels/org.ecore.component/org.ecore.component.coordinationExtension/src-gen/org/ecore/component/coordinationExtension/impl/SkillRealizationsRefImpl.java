/**
 */
package org.ecore.component.coordinationExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.behavior.skillRealization.SkillRealizationSet;

import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.component.coordinationExtension.SkillRealizationsRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Realizations Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.impl.SkillRealizationsRefImpl#getSkillRealizationSetRef <em>Skill Realization Set Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationsRefImpl extends AbstractCoordinationElementImpl implements SkillRealizationsRef {
	/**
	 * The cached value of the '{@link #getSkillRealizationSetRef() <em>Skill Realization Set Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillRealizationSetRef()
	 * @generated
	 * @ordered
	 */
	protected SkillRealizationSet skillRealizationSetRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillRealizationsRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationExtensionPackage.Literals.SKILL_REALIZATIONS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationSet getSkillRealizationSetRef() {
		if (skillRealizationSetRef != null && skillRealizationSetRef.eIsProxy()) {
			InternalEObject oldSkillRealizationSetRef = (InternalEObject) skillRealizationSetRef;
			skillRealizationSetRef = (SkillRealizationSet) eResolveProxy(oldSkillRealizationSetRef);
			if (skillRealizationSetRef != oldSkillRealizationSetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF,
							oldSkillRealizationSetRef, skillRealizationSetRef));
			}
		}
		return skillRealizationSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationSet basicGetSkillRealizationSetRef() {
		return skillRealizationSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillRealizationSetRef(SkillRealizationSet newSkillRealizationSetRef) {
		SkillRealizationSet oldSkillRealizationSetRef = skillRealizationSetRef;
		skillRealizationSetRef = newSkillRealizationSetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF,
					oldSkillRealizationSetRef, skillRealizationSetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF:
			if (resolve)
				return getSkillRealizationSetRef();
			return basicGetSkillRealizationSetRef();
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
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF:
			setSkillRealizationSetRef((SkillRealizationSet) newValue);
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
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF:
			setSkillRealizationSetRef((SkillRealizationSet) null);
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
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF:
			return skillRealizationSetRef != null;
		}
		return super.eIsSet(featureID);
	}

} //SkillRealizationsRefImpl
