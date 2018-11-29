/**
 */
package org.ecore.system.causeEffectChain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.activityArchitecture.ActivityNode;

import org.ecore.system.causeEffectChain.ActivityLink;
import org.ecore.system.causeEffectChain.CauseEffectChainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.causeEffectChain.impl.ActivityLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.impl.ActivityLinkImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityLinkImpl extends AbstractChainLinkImpl implements ActivityLink {
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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CauseEffectChainPackage.Literals.ACTIVITY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (ref != null) {
			return getRef().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetName() {
		return (ref != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject) ref;
			ref = (ActivityNode) eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CauseEffectChainPackage.ACTIVITY_LINK__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(ActivityNode newRef) {
		ActivityNode oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CauseEffectChainPackage.ACTIVITY_LINK__REF, oldRef,
					ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CauseEffectChainPackage.ACTIVITY_LINK__NAME:
			return getName();
		case CauseEffectChainPackage.ACTIVITY_LINK__REF:
			if (resolve)
				return getRef();
			return basicGetRef();
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
		case CauseEffectChainPackage.ACTIVITY_LINK__REF:
			setRef((ActivityNode) newValue);
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
		case CauseEffectChainPackage.ACTIVITY_LINK__REF:
			setRef((ActivityNode) null);
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
		case CauseEffectChainPackage.ACTIVITY_LINK__NAME:
			return isSetName();
		case CauseEffectChainPackage.ACTIVITY_LINK__REF:
			return ref != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityLinkImpl
