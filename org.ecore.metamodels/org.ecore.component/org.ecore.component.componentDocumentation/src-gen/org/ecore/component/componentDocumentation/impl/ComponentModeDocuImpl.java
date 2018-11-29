/**
 */
package org.ecore.component.componentDocumentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.ComponentModeDocu;

import org.ecore.component.coordinationExtension.PublicOperationMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Mode Docu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentModeDocuImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentModeDocuImpl extends AbstractModeDocuImpl implements ComponentModeDocu {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected PublicOperationMode mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModeDocuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDocumentationPackage.Literals.COMPONENT_MODE_DOCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicOperationMode getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject) mode;
			mode = (PublicOperationMode) eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicOperationMode basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(PublicOperationMode newMode) {
		PublicOperationMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE:
			if (resolve)
				return getMode();
			return basicGetMode();
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
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE:
			setMode((PublicOperationMode) newValue);
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
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE:
			setMode((PublicOperationMode) null);
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
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU__MODE:
			return mode != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentModeDocuImpl
