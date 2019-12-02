/**
 */
package org.ecore.component.coordinationExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.ComponentPort;

import org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;

import org.ecore.service.serviceDefinition.CommunicationServiceUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Service Usage Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl#getServiceUsage <em>Service Usage</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl#getComponentPort <em>Component Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationServiceUsageRealizationImpl extends AbstractCoordinationElementImpl
		implements CommunicationServiceUsageRealization {
	/**
	 * The cached value of the '{@link #getServiceUsage() <em>Service Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUsage()
	 * @generated
	 * @ordered
	 */
	protected CommunicationServiceUsage serviceUsage;

	/**
	 * The cached value of the '{@link #getComponentPort() <em>Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPort()
	 * @generated
	 * @ordered
	 */
	protected ComponentPort componentPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationServiceUsageRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServiceUsage getServiceUsage() {
		if (serviceUsage != null && serviceUsage.eIsProxy()) {
			InternalEObject oldServiceUsage = (InternalEObject) serviceUsage;
			serviceUsage = (CommunicationServiceUsage) eResolveProxy(oldServiceUsage);
			if (serviceUsage != oldServiceUsage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE,
							oldServiceUsage, serviceUsage));
			}
		}
		return serviceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationServiceUsage basicGetServiceUsage() {
		return serviceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceUsage(CommunicationServiceUsage newServiceUsage) {
		CommunicationServiceUsage oldServiceUsage = serviceUsage;
		serviceUsage = newServiceUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE,
					oldServiceUsage, serviceUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPort getComponentPort() {
		if (componentPort != null && componentPort.eIsProxy()) {
			InternalEObject oldComponentPort = (InternalEObject) componentPort;
			componentPort = (ComponentPort) eResolveProxy(oldComponentPort);
			if (componentPort != oldComponentPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT,
							oldComponentPort, componentPort));
			}
		}
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPort basicGetComponentPort() {
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentPort(ComponentPort newComponentPort) {
		ComponentPort oldComponentPort = componentPort;
		componentPort = newComponentPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT,
					oldComponentPort, componentPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE:
			if (resolve)
				return getServiceUsage();
			return basicGetServiceUsage();
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT:
			if (resolve)
				return getComponentPort();
			return basicGetComponentPort();
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
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE:
			setServiceUsage((CommunicationServiceUsage) newValue);
			return;
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT:
			setComponentPort((ComponentPort) newValue);
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
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE:
			setServiceUsage((CommunicationServiceUsage) null);
			return;
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT:
			setComponentPort((ComponentPort) null);
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
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE:
			return serviceUsage != null;
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT:
			return componentPort != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationServiceUsageRealizationImpl
