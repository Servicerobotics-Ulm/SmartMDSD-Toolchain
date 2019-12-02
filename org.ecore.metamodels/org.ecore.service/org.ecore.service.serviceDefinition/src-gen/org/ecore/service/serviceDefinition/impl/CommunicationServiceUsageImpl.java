/**
 */
package org.ecore.service.serviceDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.service.serviceDefinition.CommunicationServiceDefinition;
import org.ecore.service.serviceDefinition.CommunicationServiceUsage;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Service Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationServiceUsageImpl extends MinimalEObjectImpl.Container implements CommunicationServiceUsage {
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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected CommunicationServiceDefinition uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationServiceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServiceDefinition getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject) uses;
			uses = (CommunicationServiceDefinition) eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationServiceDefinition basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUses(CommunicationServiceDefinition newUses) {
		CommunicationServiceDefinition oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__NAME:
			return getName();
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES:
			if (resolve)
				return getUses();
			return basicGetUses();
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
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__NAME:
			setName((String) newValue);
			return;
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES:
			setUses((CommunicationServiceDefinition) newValue);
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
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES:
			setUses((CommunicationServiceDefinition) null);
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
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE__USES:
			return uses != null;
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

} //CommunicationServiceUsageImpl
