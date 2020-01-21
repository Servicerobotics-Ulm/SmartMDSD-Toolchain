/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Interface Component Instance Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl#getCoordInterInst <em>Coord Inter Inst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationInterfaceComponentInstanceMappingImpl extends MinimalEObjectImpl.Container
		implements CoordinationInterfaceComponentInstanceMapping {
	/**
	 * The cached value of the '{@link #getCompInst() <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompInst()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance compInst;

	/**
	 * The cached value of the '{@link #getCoordInterInst() <em>Coord Inter Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordInterInst()
	 * @generated
	 * @ordered
	 */
	protected CoordinationInterfaceInstance coordInterInst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationInterfaceComponentInstanceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance getCompInst() {
		if (compInst != null && compInst.eIsProxy()) {
			InternalEObject oldCompInst = (InternalEObject) compInst;
			compInst = (ComponentInstance) eResolveProxy(oldCompInst);
			if (compInst != oldCompInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST,
							oldCompInst, compInst));
			}
		}
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetCompInst() {
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompInst(ComponentInstance newCompInst) {
		ComponentInstance oldCompInst = compInst;
		compInst = newCompInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST,
					oldCompInst, compInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationInterfaceInstance getCoordInterInst() {
		if (coordInterInst != null && coordInterInst.eIsProxy()) {
			InternalEObject oldCoordInterInst = (InternalEObject) coordInterInst;
			coordInterInst = (CoordinationInterfaceInstance) eResolveProxy(oldCoordInterInst);
			if (coordInterInst != oldCoordInterInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST,
							oldCoordInterInst, coordInterInst));
			}
		}
		return coordInterInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationInterfaceInstance basicGetCoordInterInst() {
		return coordInterInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordInterInst(CoordinationInterfaceInstance newCoordInterInst) {
		CoordinationInterfaceInstance oldCoordInterInst = coordInterInst;
		coordInterInst = newCoordInterInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST,
					oldCoordInterInst, coordInterInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST:
			if (resolve)
				return getCompInst();
			return basicGetCompInst();
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST:
			if (resolve)
				return getCoordInterInst();
			return basicGetCoordInterInst();
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
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST:
			setCompInst((ComponentInstance) newValue);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST:
			setCoordInterInst((CoordinationInterfaceInstance) newValue);
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
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST:
			setCompInst((ComponentInstance) null);
			return;
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST:
			setCoordInterInst((CoordinationInterfaceInstance) null);
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
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST:
			return compInst != null;
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST:
			return coordInterInst != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationInterfaceComponentInstanceMappingImpl
