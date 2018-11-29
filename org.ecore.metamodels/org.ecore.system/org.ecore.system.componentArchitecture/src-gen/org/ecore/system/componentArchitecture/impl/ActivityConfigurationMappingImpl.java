/**
 */
package org.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.Activity;

import org.ecore.system.activityArchitecture.ActivityNode;

import org.ecore.system.componentArchitecture.ActivityConfigurationMapping;
import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Configuration Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityConfigurationMappingImpl extends ComponentInstanceConfigurationElementImpl
		implements ActivityConfigurationMapping {
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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityConfigurationMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (activity != null) {
			return getActivity().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (activity != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject) activity;
			activity = (Activity) eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY, oldActivity,
							activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getConfig() {
		if (config != null && config.eIsProxy()) {
			InternalEObject oldConfig = (InternalEObject) config;
			config = (ActivityNode) eResolveProxy(oldConfig);
			if (config != oldConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG, oldConfig, config));
			}
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(ActivityNode newConfig) {
		ActivityNode oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG, oldConfig, config));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__NAME:
			return getName();
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY:
			if (resolve)
				return getActivity();
			return basicGetActivity();
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG:
			if (resolve)
				return getConfig();
			return basicGetConfig();
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
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY:
			setActivity((Activity) newValue);
			return;
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG:
			setConfig((ActivityNode) newValue);
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
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY:
			setActivity((Activity) null);
			return;
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG:
			setConfig((ActivityNode) null);
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
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__NAME:
			return isSetName();
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY:
			return activity != null;
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING__CONFIG:
			return config != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityConfigurationMappingImpl
