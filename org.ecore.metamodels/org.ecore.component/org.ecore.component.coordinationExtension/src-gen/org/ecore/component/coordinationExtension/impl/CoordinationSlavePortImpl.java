/**
 */
package org.ecore.component.coordinationExtension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ecore.component.componentDefinition.impl.NamedComponentElementImpl;
import org.ecore.component.coordinationExtension.AbstractCoordinationElement;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.component.coordinationExtension.CoordinationSlavePort;

import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Slave Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationSlavePortImpl extends NamedComponentElementImpl implements CoordinationSlavePort {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCoordinationElement> elements;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected CoordinationServiceDefinition service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSlavePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCoordinationElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractCoordinationElement>(AbstractCoordinationElement.class, this,
					CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationServiceDefinition getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject) service;
			service = (CoordinationServiceDefinition) eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationServiceDefinition basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(CoordinationServiceDefinition newService) {
		CoordinationServiceDefinition oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return getElements();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			if (resolve)
				return getService();
			return basicGetService();
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractCoordinationElement>) newValue);
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			setService((CoordinationServiceDefinition) newValue);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			getElements().clear();
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			setService((CoordinationServiceDefinition) null);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			return service != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationSlavePortImpl
