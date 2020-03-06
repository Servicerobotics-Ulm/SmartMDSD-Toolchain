/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.deployment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;

import org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact;
import org.eclipse.smartmdsd.ecore.system.deployment.Deployment;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentArtefactImpl extends AbstractDeploymentElementImpl implements ComponentArtefact {
	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected Deployment deploy;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance component;

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
	protected ComponentArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPONENT_ARTEFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment getDeploy() {
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploy(Deployment newDeploy, NotificationChain msgs) {
		Deployment oldDeploy = deploy;
		deploy = newDeploy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY, oldDeploy, newDeploy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploy(Deployment newDeploy) {
		if (newDeploy != deploy) {
			NotificationChain msgs = null;
			if (deploy != null)
				msgs = ((InternalEObject) deploy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY, null, msgs);
			if (newDeploy != null)
				msgs = ((InternalEObject) newDeploy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY, null, msgs);
			msgs = basicSetDeploy(newDeploy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY,
					newDeploy, newDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (ComponentInstance) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(ComponentInstance newComponent) {
		ComponentInstance oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (component != null) {
			return getComponent().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetName() {
		return (component != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY:
			return basicSetDeploy(null, msgs);
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
		case DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY:
			return getDeploy();
		case DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case DeploymentPackage.COMPONENT_ARTEFACT__NAME:
			return getName();
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
		case DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY:
			setDeploy((Deployment) newValue);
			return;
		case DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT:
			setComponent((ComponentInstance) newValue);
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
		case DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY:
			setDeploy((Deployment) null);
			return;
		case DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT:
			setComponent((ComponentInstance) null);
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
		case DeploymentPackage.COMPONENT_ARTEFACT__DEPLOY:
			return deploy != null;
		case DeploymentPackage.COMPONENT_ARTEFACT__COMPONENT:
			return component != null;
		case DeploymentPackage.COMPONENT_ARTEFACT__NAME:
			return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //ComponentArtefactImpl
