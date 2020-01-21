/**
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition.impl;

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

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl#getOutAttribute <em>Out Attribute</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillDefinitionImpl extends MinimalEObjectImpl.Container implements SkillDefinition {
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
	 * The cached value of the '{@link #getInAttribute() <em>In Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> inAttribute;

	/**
	 * The cached value of the '{@link #getOutAttribute() <em>Out Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> outAttribute;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<SkillResult> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillDefinitionPackage.Literals.SKILL_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SkillDefinitionPackage.SKILL_DEFINITION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeDefinition> getInAttribute() {
		if (inAttribute == null) {
			inAttribute = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this,
					SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE);
		}
		return inAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeDefinition> getOutAttribute() {
		if (outAttribute == null) {
			outAttribute = new EObjectContainmentEList<AttributeDefinition>(AttributeDefinition.class, this,
					SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE);
		}
		return outAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SkillResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<SkillResult>(SkillResult.class, this,
					SkillDefinitionPackage.SKILL_DEFINITION__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE:
			return ((InternalEList<?>) getInAttribute()).basicRemove(otherEnd, msgs);
		case SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE:
			return ((InternalEList<?>) getOutAttribute()).basicRemove(otherEnd, msgs);
		case SkillDefinitionPackage.SKILL_DEFINITION__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
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
		case SkillDefinitionPackage.SKILL_DEFINITION__NAME:
			return getName();
		case SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE:
			return getInAttribute();
		case SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE:
			return getOutAttribute();
		case SkillDefinitionPackage.SKILL_DEFINITION__RESULTS:
			return getResults();
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
		case SkillDefinitionPackage.SKILL_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE:
			getInAttribute().clear();
			getInAttribute().addAll((Collection<? extends AttributeDefinition>) newValue);
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE:
			getOutAttribute().clear();
			getOutAttribute().addAll((Collection<? extends AttributeDefinition>) newValue);
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends SkillResult>) newValue);
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
		case SkillDefinitionPackage.SKILL_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE:
			getInAttribute().clear();
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE:
			getOutAttribute().clear();
			return;
		case SkillDefinitionPackage.SKILL_DEFINITION__RESULTS:
			getResults().clear();
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
		case SkillDefinitionPackage.SKILL_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SkillDefinitionPackage.SKILL_DEFINITION__IN_ATTRIBUTE:
			return inAttribute != null && !inAttribute.isEmpty();
		case SkillDefinitionPackage.SKILL_DEFINITION__OUT_ATTRIBUTE:
			return outAttribute != null && !outAttribute.isEmpty();
		case SkillDefinitionPackage.SKILL_DEFINITION__RESULTS:
			return results != null && !results.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SkillDefinitionImpl
