/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Port Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortLinkImpl#getRequestPort <em>Request Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestPortLinkImpl extends AbstractComponentLinkImpl implements RequestPortLink {
	/**
	 * The cached value of the '{@link #getRequestPort() <em>Request Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPort()
	 * @generated
	 * @ordered
	 */
	protected RequestPort requestPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestPortLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (requestPort != null) {
			return getRequestPort().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPort getRequestPort() {
		if (requestPort != null && requestPort.eIsProxy()) {
			InternalEObject oldRequestPort = (InternalEObject) requestPort;
			requestPort = (RequestPort) eResolveProxy(oldRequestPort);
			if (requestPort != oldRequestPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT, oldRequestPort, requestPort));
			}
		}
		return requestPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPort basicGetRequestPort() {
		return requestPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestPort(RequestPort newRequestPort) {
		RequestPort oldRequestPort = requestPort;
		requestPort = newRequestPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT, oldRequestPort, requestPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT:
			if (resolve)
				return getRequestPort();
			return basicGetRequestPort();
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
		case ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT:
			setRequestPort((RequestPort) newValue);
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
		case ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT:
			setRequestPort((RequestPort) null);
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
		case ComponentDefinitionPackage.REQUEST_PORT_LINK__REQUEST_PORT:
			return requestPort != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestPortLinkImpl
