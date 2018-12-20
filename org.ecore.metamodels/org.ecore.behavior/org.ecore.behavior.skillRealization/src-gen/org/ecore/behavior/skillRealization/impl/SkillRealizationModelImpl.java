/**
 */
package org.ecore.behavior.skillRealization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.behavior.skillRealization.SkillRealizationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl#getSkillsets <em>Skillsets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationModelImpl extends MinimalEObjectImpl.Container implements SkillRealizationModel {
	/**
	 * The cached value of the '{@link #getSkillsets() <em>Skillsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillsets()
	 * @generated
	 * @ordered
	 */
	protected EList<SkillRealizationSet> skillsets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillRealizationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.SKILL_REALIZATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SkillRealizationSet> getSkillsets() {
		if (skillsets == null) {
			skillsets = new EObjectContainmentEList<SkillRealizationSet>(SkillRealizationSet.class, this,
					SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS);
		}
		return skillsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS:
			return ((InternalEList<?>) getSkillsets()).basicRemove(otherEnd, msgs);
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS:
			return getSkillsets();
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS:
			getSkillsets().clear();
			getSkillsets().addAll((Collection<? extends SkillRealizationSet>) newValue);
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS:
			getSkillsets().clear();
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__SKILLSETS:
			return skillsets != null && !skillsets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkillRealizationModelImpl
