/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ecore.behavior.skillRealization.CoordinationInterfaceInstance;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl#getCoordinationInterfaceDef <em>Coordination Interface Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationInterfaceInstanceImpl extends MinimalEObjectImpl.Container
		implements CoordinationInterfaceInstance {
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
	 * The cached value of the '{@link #getCoordinationInterfaceDef() <em>Coordination Interface Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationInterfaceDef()
	 * @generated
	 * @ordered
	 */
	protected CoordinationServiceDefinition coordinationInterfaceDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationInterfaceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE;
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
					SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationServiceDefinition getCoordinationInterfaceDef() {
		if (coordinationInterfaceDef != null && coordinationInterfaceDef.eIsProxy()) {
			InternalEObject oldCoordinationInterfaceDef = (InternalEObject) coordinationInterfaceDef;
			coordinationInterfaceDef = (CoordinationServiceDefinition) eResolveProxy(oldCoordinationInterfaceDef);
			if (coordinationInterfaceDef != oldCoordinationInterfaceDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF,
							oldCoordinationInterfaceDef, coordinationInterfaceDef));
			}
		}
		return coordinationInterfaceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationServiceDefinition basicGetCoordinationInterfaceDef() {
		return coordinationInterfaceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinationInterfaceDef(CoordinationServiceDefinition newCoordinationInterfaceDef) {
		CoordinationServiceDefinition oldCoordinationInterfaceDef = coordinationInterfaceDef;
		coordinationInterfaceDef = newCoordinationInterfaceDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF,
					oldCoordinationInterfaceDef, coordinationInterfaceDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__NAME:
			return getName();
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF:
			if (resolve)
				return getCoordinationInterfaceDef();
			return basicGetCoordinationInterfaceDef();
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
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF:
			setCoordinationInterfaceDef((CoordinationServiceDefinition) newValue);
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
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF:
			setCoordinationInterfaceDef((CoordinationServiceDefinition) null);
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
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF:
			return coordinationInterfaceDef != null;
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

} //CoordinationInterfaceInstanceImpl
