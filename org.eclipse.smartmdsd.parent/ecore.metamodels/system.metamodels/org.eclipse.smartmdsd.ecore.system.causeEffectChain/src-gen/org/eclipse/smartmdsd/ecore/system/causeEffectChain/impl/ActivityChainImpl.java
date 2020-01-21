/**
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl;

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

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.AbstractChainLink;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityChain;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.MinResponseTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.ActivityChainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.ActivityChainImpl#getChainLinks <em>Chain Links</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.ActivityChainImpl#getDesiredMinResponse <em>Desired Min Response</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.ActivityChainImpl#getDesiredMaxResponse <em>Desired Max Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityChainImpl extends MinimalEObjectImpl.Container implements ActivityChain {
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
	 * The cached value of the '{@link #getChainLinks() <em>Chain Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractChainLink> chainLinks;

	/**
	 * The cached value of the '{@link #getDesiredMinResponse() <em>Desired Min Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredMinResponse()
	 * @generated
	 * @ordered
	 */
	protected MinResponseTime desiredMinResponse;

	/**
	 * The cached value of the '{@link #getDesiredMaxResponse() <em>Desired Max Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredMaxResponse()
	 * @generated
	 * @ordered
	 */
	protected MaxResponseTime desiredMaxResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CauseEffectChainPackage.Literals.ACTIVITY_CHAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CauseEffectChainPackage.ACTIVITY_CHAIN__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractChainLink> getChainLinks() {
		if (chainLinks == null) {
			chainLinks = new EObjectContainmentEList<AbstractChainLink>(AbstractChainLink.class, this,
					CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS);
		}
		return chainLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinResponseTime getDesiredMinResponse() {
		return desiredMinResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesiredMinResponse(MinResponseTime newDesiredMinResponse, NotificationChain msgs) {
		MinResponseTime oldDesiredMinResponse = desiredMinResponse;
		desiredMinResponse = newDesiredMinResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE, oldDesiredMinResponse,
					newDesiredMinResponse);
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
	public void setDesiredMinResponse(MinResponseTime newDesiredMinResponse) {
		if (newDesiredMinResponse != desiredMinResponse) {
			NotificationChain msgs = null;
			if (desiredMinResponse != null)
				msgs = ((InternalEObject) desiredMinResponse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE, null,
						msgs);
			if (newDesiredMinResponse != null)
				msgs = ((InternalEObject) newDesiredMinResponse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE, null,
						msgs);
			msgs = basicSetDesiredMinResponse(newDesiredMinResponse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE, newDesiredMinResponse,
					newDesiredMinResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxResponseTime getDesiredMaxResponse() {
		return desiredMaxResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesiredMaxResponse(MaxResponseTime newDesiredMaxResponse, NotificationChain msgs) {
		MaxResponseTime oldDesiredMaxResponse = desiredMaxResponse;
		desiredMaxResponse = newDesiredMaxResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE, oldDesiredMaxResponse,
					newDesiredMaxResponse);
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
	public void setDesiredMaxResponse(MaxResponseTime newDesiredMaxResponse) {
		if (newDesiredMaxResponse != desiredMaxResponse) {
			NotificationChain msgs = null;
			if (desiredMaxResponse != null)
				msgs = ((InternalEObject) desiredMaxResponse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE, null,
						msgs);
			if (newDesiredMaxResponse != null)
				msgs = ((InternalEObject) newDesiredMaxResponse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE, null,
						msgs);
			msgs = basicSetDesiredMaxResponse(newDesiredMaxResponse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE, newDesiredMaxResponse,
					newDesiredMaxResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS:
			return ((InternalEList<?>) getChainLinks()).basicRemove(otherEnd, msgs);
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE:
			return basicSetDesiredMinResponse(null, msgs);
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE:
			return basicSetDesiredMaxResponse(null, msgs);
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
		case CauseEffectChainPackage.ACTIVITY_CHAIN__NAME:
			return getName();
		case CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS:
			return getChainLinks();
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE:
			return getDesiredMinResponse();
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE:
			return getDesiredMaxResponse();
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
		case CauseEffectChainPackage.ACTIVITY_CHAIN__NAME:
			setName((String) newValue);
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS:
			getChainLinks().clear();
			getChainLinks().addAll((Collection<? extends AbstractChainLink>) newValue);
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE:
			setDesiredMinResponse((MinResponseTime) newValue);
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE:
			setDesiredMaxResponse((MaxResponseTime) newValue);
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
		case CauseEffectChainPackage.ACTIVITY_CHAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS:
			getChainLinks().clear();
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE:
			setDesiredMinResponse((MinResponseTime) null);
			return;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE:
			setDesiredMaxResponse((MaxResponseTime) null);
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
		case CauseEffectChainPackage.ACTIVITY_CHAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CauseEffectChainPackage.ACTIVITY_CHAIN__CHAIN_LINKS:
			return chainLinks != null && !chainLinks.isEmpty();
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE:
			return desiredMinResponse != null;
		case CauseEffectChainPackage.ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE:
			return desiredMaxResponse != null;
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

} //ActivityChainImpl
