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

import org.ecore.component.componentDefinition.ComponentDefinition;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.ecore.system.componentArchitecture.ComponentInstance;
import org.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.ecore.system.componentArchitecture.ServiceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ComponentInstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ComponentInstanceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.impl.ComponentInstanceImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends MinimalEObjectImpl.Container implements ComponentInstance {
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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition component;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInstance> ports;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstanceExtension> extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentArchitecturePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentArchitecturePackage.COMPONENT_INSTANCE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (ComponentDefinition) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(ComponentDefinition newComponent) {
		ComponentDefinition oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInstance> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<ServiceInstance>(ServiceInstance.class, this,
					ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentInstanceExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<ComponentInstanceExtension>(ComponentInstanceExtension.class, this,
					ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS:
			return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd, msgs);
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
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__NAME:
			return getName();
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS:
			return getPorts();
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS:
			return getExtensions();
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
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((ComponentDefinition) newValue);
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends ServiceInstance>) newValue);
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends ComponentInstanceExtension>) newValue);
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
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT:
			setComponent((ComponentDefinition) null);
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS:
			getPorts().clear();
			return;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS:
			getExtensions().clear();
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
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__COMPONENT:
			return component != null;
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__PORTS:
			return ports != null && !ports.isEmpty();
		case ComponentArchitecturePackage.COMPONENT_INSTANCE__EXTENSIONS:
			return extensions != null && !extensions.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
