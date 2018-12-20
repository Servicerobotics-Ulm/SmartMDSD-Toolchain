/**
 */
package org.ecore.behavior.skillRealization.impl;

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

import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.behavior.skillRealization.SkillRealizationSet;

import org.ecore.service.skillDefinition.SkillDefinitionSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl#getSkillDefSet <em>Skill Def Set</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationSetImpl extends MinimalEObjectImpl.Container implements SkillRealizationSet {
	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<SkillRealization> skills;

	/**
	 * The cached value of the '{@link #getSkillDefSet() <em>Skill Def Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillDefSet()
	 * @generated
	 * @ordered
	 */
	protected SkillDefinitionSet skillDefSet;

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
	protected SkillRealizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.SKILL_REALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SkillRealization> getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList<SkillRealization>(SkillRealization.class, this,
					SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillDefinitionSet getSkillDefSet() {
		if (skillDefSet != null && skillDefSet.eIsProxy()) {
			InternalEObject oldSkillDefSet = (InternalEObject) skillDefSet;
			skillDefSet = (SkillDefinitionSet) eResolveProxy(oldSkillDefSet);
			if (skillDefSet != oldSkillDefSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET, oldSkillDefSet, skillDefSet));
			}
		}
		return skillDefSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillDefinitionSet basicGetSkillDefSet() {
		return skillDefSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillDefSet(SkillDefinitionSet newSkillDefSet) {
		SkillDefinitionSet oldSkillDefSet = skillDefSet;
		skillDefSet = newSkillDefSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET, oldSkillDefSet, skillDefSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkillRealizationPackage.SKILL_REALIZATION_SET__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS:
			return ((InternalEList<?>) getSkills()).basicRemove(otherEnd, msgs);
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
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS:
			return getSkills();
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET:
			if (resolve)
				return getSkillDefSet();
			return basicGetSkillDefSet();
		case SkillRealizationPackage.SKILL_REALIZATION_SET__NAME:
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
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS:
			getSkills().clear();
			getSkills().addAll((Collection<? extends SkillRealization>) newValue);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET:
			setSkillDefSet((SkillDefinitionSet) newValue);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_SET__NAME:
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
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS:
			getSkills().clear();
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET:
			setSkillDefSet((SkillDefinitionSet) null);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_SET__NAME:
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
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILLS:
			return skills != null && !skills.isEmpty();
		case SkillRealizationPackage.SKILL_REALIZATION_SET__SKILL_DEF_SET:
			return skillDefSet != null;
		case SkillRealizationPackage.SKILL_REALIZATION_SET__NAME:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SkillRealizationSetImpl
