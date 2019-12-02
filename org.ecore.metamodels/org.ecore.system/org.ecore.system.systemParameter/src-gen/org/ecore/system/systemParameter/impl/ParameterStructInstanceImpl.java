/**
 */
package org.ecore.system.systemParameter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl;

import org.ecore.system.systemParameter.ComponentParameterInstance;
import org.ecore.system.systemParameter.ParameterStructInstance;
import org.ecore.system.systemParameter.SystemParameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Struct Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterStructInstanceImpl extends ComponentInstanceExtensionImpl implements ParameterStructInstance {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ComponentParameterInstance parameter;

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
	protected ParameterStructInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentParameterInstance getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (ComponentParameterInstance) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterInstance basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(ComponentParameterInstance newParameter) {
		ComponentParameterInstance oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (parameter != null) {
			return getParameter().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (parameter != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__NAME:
			return getName();
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
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER:
			setParameter((ComponentParameterInstance) newValue);
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
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER:
			setParameter((ComponentParameterInstance) null);
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
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__PARAMETER:
			return parameter != null;
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //ParameterStructInstanceImpl
