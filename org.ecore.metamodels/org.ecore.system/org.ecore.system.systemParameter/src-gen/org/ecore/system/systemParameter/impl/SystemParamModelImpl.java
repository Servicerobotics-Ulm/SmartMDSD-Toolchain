/**
 */
package org.ecore.system.systemParameter.impl;

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

import org.ecore.system.componentArchitecture.SystemComponentArchitecture;

import org.ecore.system.systemParameter.ComponentParameterInstance;
import org.ecore.system.systemParameter.SystemParamModel;
import org.ecore.system.systemParameter.SystemParameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Param Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.systemParameter.impl.SystemParamModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.ecore.system.systemParameter.impl.SystemParamModelImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.ecore.system.systemParameter.impl.SystemParamModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemParamModelImpl extends MinimalEObjectImpl.Container implements SystemParamModel {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentParameterInstance> components;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentArchitecture system;

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
	protected SystemParamModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemParameterPackage.Literals.SYSTEM_PARAM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentParameterInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentParameterInstance>(ComponentParameterInstance.class, this,
					SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentArchitecture getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject) system;
			system = (SystemComponentArchitecture) eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentArchitecture basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemComponentArchitecture newSystem) {
		SystemComponentArchitecture oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM,
					oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemParameterPackage.SYSTEM_PARAM_MODEL__NAME,
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS:
			return getComponents();
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__NAME:
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends ComponentParameterInstance>) newValue);
			return;
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM:
			setSystem((SystemComponentArchitecture) newValue);
			return;
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__NAME:
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS:
			getComponents().clear();
			return;
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM:
			setSystem((SystemComponentArchitecture) null);
			return;
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__NAME:
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__COMPONENTS:
			return components != null && !components.isEmpty();
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__SYSTEM:
			return system != null;
		case SystemParameterPackage.SYSTEM_PARAM_MODEL__NAME:
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

} //SystemParamModelImpl
