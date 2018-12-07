/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EClass;
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
	public GenericDatasheet createGenericDatasheet() {
		GenericDatasheetImpl genericDatasheet = new GenericDatasheetImpl();
		return genericDatasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdxLicense createSpdxLicense() {
		SpdxLicenseImpl spdxLicense = new SpdxLicenseImpl();
		return spdxLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprietaryLicense createProprietaryLicense() {
		ProprietaryLicenseImpl proprietaryLicense = new ProprietaryLicenseImpl();
		return proprietaryLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
