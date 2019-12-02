/**
 */
package org.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.InputHandler;

import org.ecore.system.activityArchitecture.InputHandlerNode;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.ecore.system.componentArchitecture.InputHandlerConfigurationMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Handler Configuration Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputHandlerConfigurationMappingImpl extends ComponentInstanceConfigurationElementImpl
		implements InputHandlerConfigurationMapping {
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
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected InputHandler handler;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected InputHandlerNode config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputHandlerConfigurationMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (handler != null) {
			return getHandler().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (handler != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputHandler getHandler() {
		if (handler != null && handler.eIsProxy()) {
			InternalEObject oldHandler = (InternalEObject) handler;
			handler = (InputHandler) eResolveProxy(oldHandler);
			if (handler != oldHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER, oldHandler,
							handler));
			}
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputHandler basicGetHandler() {
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandler(InputHandler newHandler) {
		InputHandler oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER, oldHandler, handler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputHandlerNode getConfig() {
		if (config != null && config.eIsProxy()) {
			InternalEObject oldConfig = (InternalEObject) config;
			config = (InputHandlerNode) eResolveProxy(oldConfig);
			if (config != oldConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG, oldConfig,
							config));
			}
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputHandlerNode basicGetConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(InputHandlerNode newConfig) {
		InputHandlerNode oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG, oldConfig, config));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__NAME:
			return getName();
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER:
			if (resolve)
				return getHandler();
			return basicGetHandler();
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG:
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
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER:
			setHandler((InputHandler) newValue);
			return;
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG:
			setConfig((InputHandlerNode) newValue);
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
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER:
			setHandler((InputHandler) null);
			return;
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG:
			setConfig((InputHandlerNode) null);
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
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__NAME:
			return isSetName();
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER:
			return handler != null;
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG:
			return config != null;
		}
		return super.eIsSet(featureID);
	}

} //InputHandlerConfigurationMappingImpl
