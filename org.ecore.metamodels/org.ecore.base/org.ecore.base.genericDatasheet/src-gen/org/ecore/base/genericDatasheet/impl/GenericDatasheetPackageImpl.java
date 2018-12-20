/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.genericDatasheet.AbstractLicense;
import org.ecore.base.genericDatasheet.GenericDatasheet;
import org.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.ProprietaryLicense;
import org.ecore.base.genericDatasheet.SpdxLicense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDatasheetPackageImpl extends EPackageImpl implements GenericDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDatasheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLicenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdxLicenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprietaryLicenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trlEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericDatasheetPackageImpl() {
		super(eNS_URI, GenericDatasheetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GenericDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericDatasheetPackage init() {
		if (isInited)
			return (GenericDatasheetPackage) EPackage.Registry.INSTANCE.getEPackage(GenericDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		GenericDatasheetPackageImpl theGenericDatasheetPackage = (GenericDatasheetPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GenericDatasheetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GenericDatasheetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGenericDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theGenericDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericDatasheetPackage.eNS_URI, theGenericDatasheetPackage);
		return theGenericDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDatasheet() {
		return genericDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDatasheet_License() {
		return (EReference) genericDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_ShortDescrition() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_LongDescription() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_SupplierDescription() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_Homepage() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_BaseURI() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDatasheet_Trl() {
		return (EAttribute) genericDatasheetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLicense() {
		return abstractLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpdxLicense() {
		return spdxLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpdxLicense_LicenseID() {
		return (EAttribute) spdxLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProprietaryLicense() {
		return proprietaryLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProprietaryLicense_FullText() {
		return (EAttribute) proprietaryLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProprietaryLicense_Name() {
		return (EAttribute) proprietaryLicenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProprietaryLicense_Url() {
		return (EAttribute) proprietaryLicenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRL() {
		return trlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDatasheetFactory getGenericDatasheetFactory() {
		return (GenericDatasheetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		genericDatasheetEClass = createEClass(GENERIC_DATASHEET);
		createEReference(genericDatasheetEClass, GENERIC_DATASHEET__LICENSE);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__SHORT_DESCRITION);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__LONG_DESCRIPTION);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__SUPPLIER_DESCRIPTION);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__HOMEPAGE);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__BASE_URI);
		createEAttribute(genericDatasheetEClass, GENERIC_DATASHEET__TRL);

		abstractLicenseEClass = createEClass(ABSTRACT_LICENSE);

		spdxLicenseEClass = createEClass(SPDX_LICENSE);
		createEAttribute(spdxLicenseEClass, SPDX_LICENSE__LICENSE_ID);

		proprietaryLicenseEClass = createEClass(PROPRIETARY_LICENSE);
		createEAttribute(proprietaryLicenseEClass, PROPRIETARY_LICENSE__FULL_TEXT);
		createEAttribute(proprietaryLicenseEClass, PROPRIETARY_LICENSE__NAME);
		createEAttribute(proprietaryLicenseEClass, PROPRIETARY_LICENSE__URL);

		// Create enums
		trlEEnum = createEEnum(TRL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spdxLicenseEClass.getESuperTypes().add(this.getAbstractLicense());
		proprietaryLicenseEClass.getESuperTypes().add(this.getAbstractLicense());

		// Initialize classes, features, and operations; add parameters
		initEClass(genericDatasheetEClass, GenericDatasheet.class, "GenericDatasheet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericDatasheet_License(), this.getAbstractLicense(), null, "license", null, 0, 1,
				GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_ShortDescrition(), ecorePackage.getEString(), "shortDescrition", null, 1, 1,
				GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_LongDescription(), ecorePackage.getEString(), "longDescription", null, 0, 1,
				GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_SupplierDescription(), ecorePackage.getEString(), "supplierDescription",
				null, 0, 1, GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_Homepage(), ecorePackage.getEString(), "homepage", null, 0, 1,
				GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_BaseURI(), ecorePackage.getEString(), "baseURI", null, 1, 1,
				GenericDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDatasheet_Trl(), this.getTRL(), "trl", "Undefined", 0, 1, GenericDatasheet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLicenseEClass, AbstractLicense.class, "AbstractLicense", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(spdxLicenseEClass, SpdxLicense.class, "SpdxLicense", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpdxLicense_LicenseID(), ecorePackage.getEString(), "licenseID", null, 1, 1,
				SpdxLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(proprietaryLicenseEClass, ProprietaryLicense.class, "ProprietaryLicense", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProprietaryLicense_FullText(), ecorePackage.getEString(), "fullText", null, 0, 1,
				ProprietaryLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProprietaryLicense_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ProprietaryLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProprietaryLicense_Url(), ecorePackage.getEString(), "url", null, 0, 1,
				ProprietaryLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(trlEEnum, org.ecore.base.genericDatasheet.TRL.class, "TRL");
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL1);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL2);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL3);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL4);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL5);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL6);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL7);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL8);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.LEVEL9);
		addEEnumLiteral(trlEEnum, org.ecore.base.genericDatasheet.TRL.UNDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericDatasheetPackageImpl
