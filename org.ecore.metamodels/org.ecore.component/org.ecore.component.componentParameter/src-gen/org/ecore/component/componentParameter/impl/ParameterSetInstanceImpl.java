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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.component.componentParameter.AbstractParameterInstance;
import org.ecore.component.componentParameter.ComponentParameterPackage;
import org.ecore.component.componentParameter.ParameterSetInstance;

import org.ecore.service.parameterDefinition.ParameterSetDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Set Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.impl.ParameterSetInstanceImpl#getParameterInstances <em>Parameter Instances</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.impl.ParameterSetInstanceImpl#getParamSet <em>Param Set</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.impl.ParameterSetInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSetInstanceImpl extends AbstractComponentParameterImpl implements ParameterSetInstance {
	/**
	 * The cached value of the '{@link #getParameterInstances() <em>Parameter Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractParameterInstance> parameterInstances;

	/**
	 * The cached value of the '{@link #getParamSet() <em>Param Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSetDefinition paramSet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSetInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.PARAMETER_SET_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractParameterInstance> getParameterInstances() {
		if (parameterInstances == null) {
			parameterInstances = new EObjectContainmentEList<AbstractParameterInstance>(AbstractParameterInstance.class,
					this, ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES);
		}
		return parameterInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSetDefinition getParamSet() {
		if (paramSet != null && paramSet.eIsProxy()) {
			InternalEObject oldParamSet = (InternalEObject) paramSet;
			paramSet = (ParameterSetDefinition) eResolveProxy(oldParamSet);
			if (paramSet != oldParamSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET, oldParamSet, paramSet));
			}
		}
		return paramSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetDefinition basicGetParamSet() {
		return paramSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParamSet(ParameterSetDefinition newParamSet) {
		ParameterSetDefinition oldParamSet = paramSet;
		paramSet = newParamSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET, oldParamSet, paramSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (paramSet != null) {
			return getParamSet().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (paramSet != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES:
			return ((InternalEList<?>) getParameterInstances()).basicRemove(otherEnd, msgs);
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
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES:
			return getParameterInstances();
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET:
			if (resolve)
				return getParamSet();
			return basicGetParamSet();
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__NAME:
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
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES:
			getParameterInstances().clear();
			getParameterInstances().addAll((Collection<? extends AbstractParameterInstance>) newValue);
			return;
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET:
			setParamSet((ParameterSetDefinition) newValue);
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
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES:
			getParameterInstances().clear();
			return;
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET:
			setParamSet((ParameterSetDefinition) null);
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
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES:
			return parameterInstances != null && !parameterInstances.isEmpty();
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__PARAM_SET:
			return paramSet != null;
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //ParameterSetInstanceImpl
