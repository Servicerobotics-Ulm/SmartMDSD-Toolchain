/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;
import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;
import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationUtility;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentPortImpl extends NamedComponentElementImpl implements ComponentPort {
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
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPortExtension> extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.COMPONENT_PORT;
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
					ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPortExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<ComponentPortExtension>(ComponentPortExtension.class, this,
					ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getMultilineHtmlDocumentation() {
		return DocumentationUtility.getMultilineHtmlText(documentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFirstDocumentationLine() {
		return DocumentationUtility.getFirstLine(documentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd, msgs);
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
		case ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION:
			return getDocumentation();
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			return getExtensions();
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
		case ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			getExtensions().clear();
			getExtensions().addAll((Collection<? extends ComponentPortExtension>) newValue);
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
		case ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			getExtensions().clear();
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
		case ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case ComponentDefinitionPackage.COMPONENT_PORT__EXTENSIONS:
			return extensions != null && !extensions.isEmpty();
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
			case ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION:
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
				return ComponentDefinitionPackage.COMPONENT_PORT__DOCUMENTATION;
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
				return ComponentDefinitionPackage.COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION;
			case DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE:
				return ComponentDefinitionPackage.COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE;
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
		case ComponentDefinitionPackage.COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION:
			return getMultilineHtmlDocumentation();
		case ComponentDefinitionPackage.COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE:
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
		result.append(')');
		return result.toString();
	}

} //ComponentPortImpl
