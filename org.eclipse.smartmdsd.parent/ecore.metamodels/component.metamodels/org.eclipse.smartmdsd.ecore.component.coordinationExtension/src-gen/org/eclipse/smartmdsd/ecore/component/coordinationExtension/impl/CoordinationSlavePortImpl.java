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
package org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl;

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
import org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.NamedComponentElementImpl;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.AbstractCoordinationElement;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Slave Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationSlavePortImpl extends NamedComponentElementImpl implements CoordinationSlavePort {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCoordinationElement> elements;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected CoordinationServiceDefinition service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSlavePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT;
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
					CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION, oldDocumentation,
					documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCoordinationElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractCoordinationElement>(AbstractCoordinationElement.class, this,
					CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationServiceDefinition getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject) service;
			service = (CoordinationServiceDefinition) eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationServiceDefinition basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(CoordinationServiceDefinition newService) {
		CoordinationServiceDefinition oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE, oldService, service));
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
			return getDocumentation();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return getElements();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			if (resolve)
				return getService();
			return basicGetService();
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractCoordinationElement>) newValue);
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			setService((CoordinationServiceDefinition) newValue);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			getElements().clear();
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			setService((CoordinationServiceDefinition) null);
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__SERVICE:
			return service != null;
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
			case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
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
				return CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION;
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
				return CoordinationExtensionPackage.COORDINATION_SLAVE_PORT___GET_MULTILINE_HTML_DOCUMENTATION;
			case DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE:
				return CoordinationExtensionPackage.COORDINATION_SLAVE_PORT___GET_FIRST_DOCUMENTATION_LINE;
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
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT___GET_MULTILINE_HTML_DOCUMENTATION:
			return getMultilineHtmlDocumentation();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT___GET_FIRST_DOCUMENTATION_LINE:
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

} //CoordinationSlavePortImpl
