/**
 */
package org.ecore.component.componentDefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.componentDefinition.ComponentPort;
import org.ecore.component.componentDefinition.ComponentPortExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.impl.ComponentPortImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentPortImpl extends NamedComponentElementImpl implements ComponentPort {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPortExtension> extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.COMPONENT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPortExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<ComponentPortExtension>(ComponentPortExtension.class, this,
					ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS);
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
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
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
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
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
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends ComponentPortExtension>) newValue);
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
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
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
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			return extensions != null && !extensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentPortImpl
