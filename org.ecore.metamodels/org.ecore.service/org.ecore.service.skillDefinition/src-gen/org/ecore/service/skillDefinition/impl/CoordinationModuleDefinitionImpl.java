/**
 */
package org.ecore.service.skillDefinition.impl;

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

import org.ecore.service.skillDefinition.CoordinationModuleDefinition;
import org.ecore.service.skillDefinition.SkillDefinition;
import org.ecore.service.skillDefinition.SkillDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationModuleDefinitionImpl extends MinimalEObjectImpl.Container
		implements CoordinationModuleDefinition {
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
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<SkillDefinition> skills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillDefinitionPackage.Literals.COORDINATION_MODULE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SkillDefinition> getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList<SkillDefinition>(SkillDefinition.class, this,
					SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS:
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
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__NAME:
			return getName();
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS:
			return getSkills();
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
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS:
			getSkills().clear();
			getSkills().addAll((Collection<? extends SkillDefinition>) newValue);
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
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS:
			getSkills().clear();
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
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION__SKILLS:
			return skills != null && !skills.isEmpty();
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

} //CoordinationModuleDefinitionImpl
