/**
 */
package org.ecore.component.componentParameter.impl;

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

import org.ecore.component.componentParameter.ComponentParamModel;
import org.ecore.component.componentParameter.ComponentParameter;
import org.ecore.component.componentParameter.ComponentParameterPackage;

import org.ecore.service.parameterDefinition.ParamDefRepoImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Param Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.impl.ComponentParamModelImpl#getParametrization <em>Parametrization</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.impl.ComponentParamModelImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentParamModelImpl extends MinimalEObjectImpl.Container implements ComponentParamModel {
	/**
	 * The cached value of the '{@link #getParametrization() <em>Parametrization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametrization()
	 * @generated
	 * @ordered
	 */
	protected ComponentParameter parametrization;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamDefRepoImport> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParamModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.COMPONENT_PARAM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentParameter getParametrization() {
		return parametrization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametrization(ComponentParameter newParametrization, NotificationChain msgs) {
		ComponentParameter oldParametrization = parametrization;
		parametrization = newParametrization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION, oldParametrization,
					newParametrization);
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
	public void setParametrization(ComponentParameter newParametrization) {
		if (newParametrization != parametrization) {
			NotificationChain msgs = null;
			if (parametrization != null)
				msgs = ((InternalEObject) parametrization).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION, null,
						msgs);
			if (newParametrization != null)
				msgs = ((InternalEObject) newParametrization).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION, null,
						msgs);
			msgs = basicSetParametrization(newParametrization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION, newParametrization,
					newParametrization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParamDefRepoImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ParamDefRepoImport>(ParamDefRepoImport.class, this,
					ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION:
			return basicSetParametrization(null, msgs);
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION:
			return getParametrization();
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS:
			return getImports();
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
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION:
			setParametrization((ComponentParameter) newValue);
			return;
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends ParamDefRepoImport>) newValue);
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
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION:
			setParametrization((ComponentParameter) null);
			return;
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS:
			getImports().clear();
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
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__PARAMETRIZATION:
			return parametrization != null;
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentParamModelImpl
