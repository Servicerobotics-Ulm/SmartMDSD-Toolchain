/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl#getInputPort <em>Input Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortLinkImpl extends AbstractComponentLinkImpl implements InputPortLink {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.INPUT_PORT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (inputPort != null) {
			return getInputPort().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL,
					oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject) inputPort;
			inputPort = (InputPort) eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT, oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputPort(InputPort newInputPort) {
		InputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT, oldInputPort, inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL:
			return isOptional();
		case ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT:
			if (resolve)
				return getInputPort();
			return basicGetInputPort();
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
		case ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL:
			setOptional((Boolean) newValue);
			return;
		case ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT:
			setInputPort((InputPort) newValue);
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
		case ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
			return;
		case ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT:
			setInputPort((InputPort) null);
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
		case ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL:
			return optional != OPTIONAL_EDEFAULT;
		case ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT:
			return inputPort != null;
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
		result.append(" (optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //InputPortLinkImpl
