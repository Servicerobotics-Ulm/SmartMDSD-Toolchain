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

import org.ecore.behavior.skillRealization.CoordinationModuleRealization;
import org.ecore.behavior.skillRealization.EventHandler;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl#getEventhandler <em>Eventhandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationModelImpl extends MinimalEObjectImpl.Container implements SkillRealizationModel {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationModuleRealization> modules;

	/**
	 * The cached value of the '{@link #getEventhandler() <em>Eventhandler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventhandler()
	 * @generated
	 * @ordered
	 */
	protected EList<EventHandler> eventhandler;

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
	@Override
	public EList<CoordinationModuleRealization> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<CoordinationModuleRealization>(CoordinationModuleRealization.class,
					this, SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventHandler> getEventhandler() {
		if (eventhandler == null) {
			eventhandler = new EObjectContainmentEList<EventHandler>(EventHandler.class, this,
					SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER);
		}
		return eventhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES:
			return ((InternalEList<?>) getModules()).basicRemove(otherEnd, msgs);
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER:
			return ((InternalEList<?>) getEventhandler()).basicRemove(otherEnd, msgs);
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES:
			return getModules();
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER:
			return getEventhandler();
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES:
			getModules().clear();
			getModules().addAll((Collection<? extends CoordinationModuleRealization>) newValue);
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER:
			getEventhandler().clear();
			getEventhandler().addAll((Collection<? extends EventHandler>) newValue);
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES:
			getModules().clear();
			return;
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER:
			getEventhandler().clear();
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__MODULES:
			return modules != null && !modules.isEmpty();
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL__EVENTHANDLER:
			return eventhandler != null && !eventhandler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkillRealizationModelImpl
