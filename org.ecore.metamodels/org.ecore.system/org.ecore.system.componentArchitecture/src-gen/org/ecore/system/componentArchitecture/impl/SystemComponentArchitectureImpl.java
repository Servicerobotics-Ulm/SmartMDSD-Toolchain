/**
 */
package org.ecore.system.componentArchitecture.impl;

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

import org.ecore.system.activityArchitecture.ActivityArchitectureModel;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.ecore.system.componentArchitecture.ComponentInstance;
import org.ecore.system.componentArchitecture.Connection;
import org.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Component Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl#getActivityArch <em>Activity Arch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemComponentArchitectureImpl extends MinimalEObjectImpl.Container
		implements SystemComponentArchitecture {
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> components;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemExtension> extensions;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getActivityArch() <em>Activity Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityArch()
	 * @generated
	 * @ordered
	 */
	protected ActivityArchitectureModel activityArch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemComponentArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.SYSTEM_COMPONENT_ARCHITECTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this,
					ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<SystemExtension>(SystemExtension.class, this,
					ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this,
					ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureModel getActivityArch() {
		if (activityArch != null && activityArch.eIsProxy()) {
			InternalEObject oldActivityArch = (InternalEObject) activityArch;
			activityArch = (ActivityArchitectureModel) eResolveProxy(oldActivityArch);
			if (activityArch != oldActivityArch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH, oldActivityArch,
							activityArch));
			}
		}
		return activityArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureModel basicGetActivityArch() {
		return activityArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityArch(ActivityArchitectureModel newActivityArch) {
		ActivityArchitectureModel oldActivityArch = activityArch;
		activityArch = newActivityArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH, oldActivityArch,
					activityArch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS:
			return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd, msgs);
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__NAME:
			return getName();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS:
			return getComponents();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS:
			return getExtensions();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS:
			return getConnections();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH:
			if (resolve)
				return getActivityArch();
			return basicGetActivityArch();
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__NAME:
			setName((String) newValue);
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends ComponentInstance>) newValue);
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends SystemExtension>) newValue);
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH:
			setActivityArch((ActivityArchitectureModel) newValue);
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS:
			getComponents().clear();
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS:
			getExtensions().clear();
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS:
			getConnections().clear();
			return;
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH:
			setActivityArch((ActivityArchitectureModel) null);
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS:
			return components != null && !components.isEmpty();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS:
			return extensions != null && !extensions.isEmpty();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH:
			return activityArch != null;
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

} //SystemComponentArchitectureImpl
