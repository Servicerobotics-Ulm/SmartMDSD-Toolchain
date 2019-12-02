/**
 */
package org.ecore.service.communicationObject.impl;

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

import org.ecore.service.communicationObject.CommObjectModel;
import org.ecore.service.communicationObject.CommObjectsRepository;
import org.ecore.service.communicationObject.CommRepositoryImport;
import org.ecore.service.communicationObject.CommunicationObjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Object Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.impl.CommObjectModelImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.ecore.service.communicationObject.impl.CommObjectModelImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommObjectModelImpl extends MinimalEObjectImpl.Container implements CommObjectModel {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected CommObjectsRepository repository;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<CommRepositoryImport> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommObjectModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationObjectPackage.Literals.COMM_OBJECT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommObjectsRepository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(CommObjectsRepository newRepository, NotificationChain msgs) {
		CommObjectsRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(CommObjectsRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommRepositoryImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<CommRepositoryImport>(CommRepositoryImport.class, this,
					CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY:
			return basicSetRepository(null, msgs);
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY:
			return getRepository();
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS:
			return getImports();
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
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY:
			setRepository((CommObjectsRepository) newValue);
			return;
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends CommRepositoryImport>) newValue);
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
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY:
			setRepository((CommObjectsRepository) null);
			return;
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS:
			getImports().clear();
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
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__REPOSITORY:
			return repository != null;
		case CommunicationObjectPackage.COMM_OBJECT_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommObjectModelImpl
