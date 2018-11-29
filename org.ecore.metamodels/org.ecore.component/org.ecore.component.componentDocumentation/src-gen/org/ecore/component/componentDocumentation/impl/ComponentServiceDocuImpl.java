/**
 */
package org.ecore.component.componentDocumentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.component.componentDefinition.ComponentPort;

import org.ecore.component.componentDocumentation.AbstractModeDocu;
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.ComponentServiceDocu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Service Docu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentServiceDocuImpl extends AbstractComponentDocuElementImpl implements ComponentServiceDocu {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractModeDocu> states;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected ComponentPort port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentServiceDocuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDocumentationPackage.Literals.COMPONENT_SERVICE_DOCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModeDocu> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<AbstractModeDocu>(AbstractModeDocu.class, this,
					ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (ComponentPort) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPort basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(ComponentPort newPort) {
		ComponentPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
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
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES:
			return getStates();
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
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
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends AbstractModeDocu>) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT:
			setPort((ComponentPort) newValue);
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
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES:
			getStates().clear();
			return;
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT:
			setPort((ComponentPort) null);
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
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__STATES:
			return states != null && !states.isEmpty();
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU__PORT:
			return port != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentServiceDocuImpl
