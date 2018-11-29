/**
 */
package org.ecore.system.deployment.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.system.deployment.AbstractDeploymentElement;
import org.ecore.system.deployment.DeploymentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Deployment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractDeploymentElementImpl extends MinimalEObjectImpl.Container
		implements AbstractDeploymentElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDeploymentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.ABSTRACT_DEPLOYMENT_ELEMENT;
	}

} //AbstractDeploymentElementImpl
