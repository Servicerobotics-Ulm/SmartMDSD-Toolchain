/**
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;
import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.PrivateOperationMode;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.PublicOperationMode;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Operation Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.PublicOperationModeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.PublicOperationModeImpl#getActivates <em>Activates</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.PublicOperationModeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.PublicOperationModeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.PublicOperationModeImpl#isIsDefaultInit <em>Is Default Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicOperationModeImpl extends AbstractCoordinationElementImpl implements PublicOperationMode {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivates() <em>Activates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivates()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivateOperationMode> activates;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ComponentModeDefinition mode;

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
	 * The default value of the '{@link #isIsDefaultInit() <em>Is Default Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefaultInit() <em>Is Default Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultInit()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultInit = IS_DEFAULT_INIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicOperationModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION, oldDocumentation,
					documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrivateOperationMode> getActivates() {
		if (activates == null) {
			activates = new EObjectResolvingEList<PrivateOperationMode>(PrivateOperationMode.class, this,
					CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__ACTIVATES);
		}
		return activates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentModeDefinition getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject) mode;
			mode = (ComponentModeDefinition) eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeDefinition basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(ComponentModeDefinition newMode) {
		ComponentModeDefinition oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (mode != null) {
			return getMode().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetName() {
		return mode != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefaultInit() {
		return isDefaultInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefaultInit(boolean newIsDefaultInit) {
		boolean oldIsDefaultInit = isDefaultInit;
		isDefaultInit = newIsDefaultInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT, oldIsDefaultInit,
					isDefaultInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultilineHtmlDocumentation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstDocumentationLine() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION:
			return getDocumentation();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__ACTIVATES:
			return getActivates();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE:
			if (resolve)
				return getMode();
			return basicGetMode();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__NAME:
			return getName();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT:
			return isIsDefaultInit();
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
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__ACTIVATES:
			getActivates().clear();
			getActivates().addAll((Collection<? extends PrivateOperationMode>) newValue);
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE:
			setMode((ComponentModeDefinition) newValue);
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT:
			setIsDefaultInit((Boolean) newValue);
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
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__ACTIVATES:
			getActivates().clear();
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE:
			setMode((ComponentModeDefinition) null);
			return;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT:
			setIsDefaultInit(IS_DEFAULT_INIT_EDEFAULT);
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
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__ACTIVATES:
			return activates != null && !activates.isEmpty();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__MODE:
			return mode != null;
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__NAME:
			return isSetName();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT:
			return isDefaultInit != IS_DEFAULT_INIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractDocumentationElement.class) {
			switch (derivedFeatureID) {
			case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION:
				return DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractDocumentationElement.class) {
			switch (baseFeatureID) {
			case DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION:
				return CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractDocumentationElement.class) {
			switch (baseOperationID) {
			case DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION:
				return CoordinationExtensionPackage.PUBLIC_OPERATION_MODE___GET_MULTILINE_HTML_DOCUMENTATION;
			case DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE:
				return CoordinationExtensionPackage.PUBLIC_OPERATION_MODE___GET_FIRST_DOCUMENTATION_LINE;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE___GET_MULTILINE_HTML_DOCUMENTATION:
			return getMultilineHtmlDocumentation();
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE___GET_FIRST_DOCUMENTATION_LINE:
			return getFirstDocumentationLine();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", isDefaultInit: ");
		result.append(isDefaultInit);
		result.append(')');
		return result.toString();
	}

} //PublicOperationModeImpl
