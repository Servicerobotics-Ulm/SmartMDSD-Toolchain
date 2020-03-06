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

import org.eclipse.smartmdsd.ecore.system.deployment.Deployment;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage;
import org.eclipse.smartmdsd.ecore.system.deployment.NamingService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl#getPortNr <em>Port Nr</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamingServiceImpl extends AbstractDeploymentElementImpl implements NamingService {
	/**
	 * The default value of the '{@link #getPortNr() <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNr()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NR_EDEFAULT = 20002;

	/**
	 * The cached value of the '{@link #getPortNr() <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNr()
	 * @generated
	 * @ordered
	 */
	protected int portNr = PORT_NR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.NAMING_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPortNr() {
		return portNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortNr(int newPortNr) {
		int oldPortNr = portNr;
		portNr = newPortNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.NAMING_SERVICE__PORT_NR, oldPortNr,
					portNr));
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
					DeploymentPackage.NAMING_SERVICE__DEPLOY, oldDeploy, newDeploy);
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
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.NAMING_SERVICE__DEPLOY, null, msgs);
			if (newDeploy != null)
				msgs = ((InternalEObject) newDeploy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.NAMING_SERVICE__DEPLOY, null, msgs);
			msgs = basicSetDeploy(newDeploy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.NAMING_SERVICE__DEPLOY, newDeploy,
					newDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.NAMING_SERVICE__DEPLOY:
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
		case DeploymentPackage.NAMING_SERVICE__PORT_NR:
			return getPortNr();
		case DeploymentPackage.NAMING_SERVICE__DEPLOY:
			return getDeploy();
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
		case DeploymentPackage.NAMING_SERVICE__PORT_NR:
			setPortNr((Integer) newValue);
			return;
		case DeploymentPackage.NAMING_SERVICE__DEPLOY:
			setDeploy((Deployment) newValue);
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
		case DeploymentPackage.NAMING_SERVICE__PORT_NR:
			setPortNr(PORT_NR_EDEFAULT);
			return;
		case DeploymentPackage.NAMING_SERVICE__DEPLOY:
			setDeploy((Deployment) null);
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
		case DeploymentPackage.NAMING_SERVICE__PORT_NR:
			return portNr != PORT_NR_EDEFAULT;
		case DeploymentPackage.NAMING_SERVICE__DEPLOY:
			return deploy != null;
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
		result.append(" (portNr: ");
		result.append(portNr);
		result.append(')');
		return result.toString();
	}

} //NamingServiceImpl
