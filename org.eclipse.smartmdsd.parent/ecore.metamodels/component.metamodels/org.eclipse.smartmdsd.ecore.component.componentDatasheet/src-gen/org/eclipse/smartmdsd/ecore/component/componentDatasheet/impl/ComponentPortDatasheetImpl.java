/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.AbstractDatasheetElementImpl;

import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port Datasheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPortDatasheetImpl extends AbstractDatasheetElementImpl implements ComponentPortDatasheet {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasheetProperty> properties;

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
	protected ComponentPortDatasheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDatasheetPackage.Literals.COMPONENT_PORT_DATASHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (ComponentPort) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT, oldPort, port));
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
	@Override
	public void setPort(ComponentPort newPort) {
		ComponentPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasheetProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DatasheetProperty>(DatasheetProperty.class, this,
					ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (port != null) {
			return getPort().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES:
			return getProperties();
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__NAME:
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
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT:
			setPort((ComponentPort) newValue);
			return;
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends DatasheetProperty>) newValue);
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
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT:
			setPort((ComponentPort) null);
			return;
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES:
			getProperties().clear();
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
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PORT:
			return port != null;
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //ComponentPortDatasheetImpl
