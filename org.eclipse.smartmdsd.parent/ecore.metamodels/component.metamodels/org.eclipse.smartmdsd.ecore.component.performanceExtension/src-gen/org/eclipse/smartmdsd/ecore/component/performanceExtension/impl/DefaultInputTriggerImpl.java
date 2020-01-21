/**
 */
package org.eclipse.smartmdsd.ecore.component.performanceExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger;
import org.eclipse.smartmdsd.ecore.component.performanceExtension.InputLinkExtension;
import org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Input Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl#getInputLink <em>Input Link</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl#getPrescale <em>Prescale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultInputTriggerImpl extends DefaultTriggerImpl implements DefaultInputTrigger {
	/**
	 * The cached value of the '{@link #getInputLink() <em>Input Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLink()
	 * @generated
	 * @ordered
	 */
	protected InputLinkExtension inputLink;

	/**
	 * The default value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESCALE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected int prescale = PRESCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultInputTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformanceExtensionPackage.Literals.DEFAULT_INPUT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputLinkExtension getInputLink() {
		if (inputLink != null && inputLink.eIsProxy()) {
			InternalEObject oldInputLink = (InternalEObject) inputLink;
			inputLink = (InputLinkExtension) eResolveProxy(oldInputLink);
			if (inputLink != oldInputLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK, oldInputLink, inputLink));
			}
		}
		return inputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputLinkExtension basicGetInputLink() {
		return inputLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputLink(InputLinkExtension newInputLink) {
		InputLinkExtension oldInputLink = inputLink;
		inputLink = newInputLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK, oldInputLink, inputLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrescale() {
		return prescale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrescale(int newPrescale) {
		int oldPrescale = prescale;
		prescale = newPrescale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__PRESCALE, oldPrescale, prescale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK:
			if (resolve)
				return getInputLink();
			return basicGetInputLink();
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__PRESCALE:
			return getPrescale();
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
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK:
			setInputLink((InputLinkExtension) newValue);
			return;
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__PRESCALE:
			setPrescale((Integer) newValue);
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
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK:
			setInputLink((InputLinkExtension) null);
			return;
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__PRESCALE:
			setPrescale(PRESCALE_EDEFAULT);
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
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__INPUT_LINK:
			return inputLink != null;
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER__PRESCALE:
			return prescale != PRESCALE_EDEFAULT;
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
		result.append(" (prescale: ");
		result.append(prescale);
		result.append(')');
		return result.toString();
	}

} //DefaultInputTriggerImpl
