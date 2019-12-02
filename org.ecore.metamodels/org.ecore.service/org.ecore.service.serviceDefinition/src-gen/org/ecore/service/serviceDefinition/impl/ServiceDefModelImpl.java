/**
 */
package org.ecore.service.serviceDefinition.impl;

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

import org.ecore.service.serviceDefinition.CommRepoImport;
import org.ecore.service.serviceDefinition.ServiceDefModel;
import org.ecore.service.serviceDefinition.ServiceDefRepository;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Def Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.ServiceDefModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.ServiceDefModelImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDefModelImpl extends MinimalEObjectImpl.Container implements ServiceDefModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<CommRepoImport> imports;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected ServiceDefRepository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.SERVICE_DEF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommRepoImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<CommRepoImport>(CommRepoImport.class, this,
					ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefRepository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(ServiceDefRepository newRepository, NotificationChain msgs) {
		ServiceDefRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(ServiceDefRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY:
			return basicSetRepository(null, msgs);
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
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS:
			return getImports();
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY:
			return getRepository();
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
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends CommRepoImport>) newValue);
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY:
			setRepository((ServiceDefRepository) newValue);
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
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS:
			getImports().clear();
			return;
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY:
			setRepository((ServiceDefRepository) null);
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
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		case ServiceDefinitionPackage.SERVICE_DEF_MODEL__REPOSITORY:
			return repository != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceDefModelImpl
