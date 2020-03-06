/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDatasheetFactoryImpl extends EFactoryImpl implements GenericDatasheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericDatasheetFactory init() {
		try {
			GenericDatasheetFactory theGenericDatasheetFactory = (GenericDatasheetFactory) EPackage.Registry.INSTANCE
					.getEFactory(GenericDatasheetPackage.eNS_URI);
			if (theGenericDatasheetFactory != null) {
				return theGenericDatasheetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericDatasheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDatasheetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GenericDatasheetPackage.DATASHEET_PROPERTY:
			return createDatasheetProperty();
		case GenericDatasheetPackage.GENERIC_DATASHEET_MODEL:
			return createGenericDatasheetModel();
		case GenericDatasheetPackage.MANDATORY_DATASHEET_ELEMENT:
			return createMandatoryDatasheetElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GenericDatasheetPackage.DEFAULT_DATASHEET_PROPERTIES:
			return createDefaultDatasheetPropertiesFromString(eDataType, initialValue);
		case GenericDatasheetPackage.TECHNOLOGY_READINESS_LEVEL:
			return createTechnologyReadinessLevelFromString(eDataType, initialValue);
		case GenericDatasheetPackage.MANDATORY_DATASHEET_ELEMENT_NAMES:
			return createMandatoryDatasheetElementNamesFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GenericDatasheetPackage.DEFAULT_DATASHEET_PROPERTIES:
			return convertDefaultDatasheetPropertiesToString(eDataType, instanceValue);
		case GenericDatasheetPackage.TECHNOLOGY_READINESS_LEVEL:
			return convertTechnologyReadinessLevelToString(eDataType, instanceValue);
		case GenericDatasheetPackage.MANDATORY_DATASHEET_ELEMENT_NAMES:
			return convertMandatoryDatasheetElementNamesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasheetProperty createDatasheetProperty() {
		DatasheetPropertyImpl datasheetProperty = new DatasheetPropertyImpl();
		return datasheetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericDatasheetModel createGenericDatasheetModel() {
		GenericDatasheetModelImpl genericDatasheetModel = new GenericDatasheetModelImpl();
		return genericDatasheetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryDatasheetElement createMandatoryDatasheetElement() {
		MandatoryDatasheetElementImpl mandatoryDatasheetElement = new MandatoryDatasheetElementImpl();
		return mandatoryDatasheetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDatasheetProperties createDefaultDatasheetPropertiesFromString(EDataType eDataType,
			String initialValue) {
		DefaultDatasheetProperties result = DefaultDatasheetProperties.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultDatasheetPropertiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyReadinessLevel createTechnologyReadinessLevelFromString(EDataType eDataType, String initialValue) {
		TechnologyReadinessLevel result = TechnologyReadinessLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTechnologyReadinessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryDatasheetElementNames createMandatoryDatasheetElementNamesFromString(EDataType eDataType,
			String initialValue) {
		MandatoryDatasheetElementNames result = MandatoryDatasheetElementNames.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMandatoryDatasheetElementNamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericDatasheetPackage getGenericDatasheetPackage() {
		return (GenericDatasheetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericDatasheetPackage getPackage() {
		return GenericDatasheetPackage.eINSTANCE;
	}

} //GenericDatasheetFactoryImpl
