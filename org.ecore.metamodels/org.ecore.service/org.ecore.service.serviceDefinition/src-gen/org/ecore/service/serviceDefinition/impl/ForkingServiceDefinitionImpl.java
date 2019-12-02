/**
 */
package org.ecore.service.serviceDefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.service.communicationPattern.ForkingPattern;

import org.ecore.service.serviceDefinition.ForkingServiceDefinition;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forking Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.ForkingServiceDefinitionImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkingServiceDefinitionImpl extends OneWayCommunicationServiceImpl implements ForkingServiceDefinition {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected ForkingPattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkingServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.FORKING_SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkingPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(ForkingPattern newPattern, NotificationChain msgs) {
		ForkingPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN, oldPattern, newPattern);
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
	public void setPattern(ForkingPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject) pattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN, null,
						msgs);
			if (newPattern != null)
				msgs = ((InternalEObject) newPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN, null,
						msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN:
			return basicSetPattern(null, msgs);
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
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN:
			return getPattern();
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
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN:
			setPattern((ForkingPattern) newValue);
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
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN:
			setPattern((ForkingPattern) null);
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
		case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION__PATTERN:
			return pattern != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkingServiceDefinitionImpl
