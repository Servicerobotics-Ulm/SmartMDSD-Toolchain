/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.base.genericDatasheet.*;

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
		case GenericDatasheetPackage.GENERIC_DATASHEET:
			return createGenericDatasheet();
		case GenericDatasheetPackage.SPDX_LICENSE:
			return createSpdxLicense();
		case GenericDatasheetPackage.PROPRIETARY_LICENSE:
			return createProprietaryLicense();
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
		case GenericDatasheetPackage.TRL:
			return createTRLFromString(eDataType, initialValue);
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
		case GenericDatasheetPackage.TRL:
			return convertTRLToString(eDataType, instanceValue);
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
	public GenericDatasheet createGenericDatasheet() {
		GenericDatasheetImpl genericDatasheet = new GenericDatasheetImpl();
		return genericDatasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpdxLicense createSpdxLicense() {
		SpdxLicenseImpl spdxLicense = new SpdxLicenseImpl();
		return spdxLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProprietaryLicense createProprietaryLicense() {
		ProprietaryLicenseImpl proprietaryLicense = new ProprietaryLicenseImpl();
		return proprietaryLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRL createTRLFromString(EDataType eDataType, String initialValue) {
		TRL result = TRL.get(initialValue);
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
	public String convertTRLToString(EDataType eDataType, Object instanceValue) {
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
