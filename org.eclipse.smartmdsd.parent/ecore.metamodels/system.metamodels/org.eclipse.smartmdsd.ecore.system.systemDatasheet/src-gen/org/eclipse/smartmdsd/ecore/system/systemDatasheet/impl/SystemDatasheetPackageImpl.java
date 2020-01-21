/**
 */
package org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet;
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetFactory;
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemDatasheetPackageImpl extends EPackageImpl implements SystemDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDatasheetEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemDatasheetPackageImpl() {
		super(eNS_URI, SystemDatasheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemDatasheetPackage init() {
		if (isInited)
			return (SystemDatasheetPackage) EPackage.Registry.INSTANCE.getEPackage(SystemDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemDatasheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemDatasheetPackageImpl theSystemDatasheetPackage = registeredSystemDatasheetPackage instanceof SystemDatasheetPackageImpl
				? (SystemDatasheetPackageImpl) registeredSystemDatasheetPackage
				: new SystemDatasheetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GenericDatasheetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSystemDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theSystemDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemDatasheetPackage.eNS_URI, theSystemDatasheetPackage);
		return theSystemDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemDatasheet() {
		return systemDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDatasheet_Name() {
		return (EAttribute) systemDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDatasheetFactory getSystemDatasheetFactory() {
		return (SystemDatasheetFactory) getEFactoryInstance();
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
		systemDatasheetEClass = createEClass(SYSTEM_DATASHEET);
		createEAttribute(systemDatasheetEClass, SYSTEM_DATASHEET__NAME);
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

		// Obtain other dependent packages
		GenericDatasheetPackage theGenericDatasheetPackage = (GenericDatasheetPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericDatasheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemDatasheetEClass.getESuperTypes().add(theGenericDatasheetPackage.getGenericDatasheetModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemDatasheetEClass, SystemDatasheet.class, "SystemDatasheet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemDatasheet_Name(), ecorePackage.getEString(), "name", null, 1, 1, SystemDatasheet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemDatasheetPackageImpl
