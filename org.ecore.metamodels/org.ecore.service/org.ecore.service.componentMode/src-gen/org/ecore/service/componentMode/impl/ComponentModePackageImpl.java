/**
 */
package org.ecore.service.componentMode.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.service.componentMode.ComponentModeCollection;
import org.ecore.service.componentMode.ComponentModeDefinition;
import org.ecore.service.componentMode.ComponentModeFactory;
import org.ecore.service.componentMode.ComponentModeModel;
import org.ecore.service.componentMode.ComponentModePackage;
import org.ecore.service.componentMode.ComponentModeRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentModePackageImpl extends EPackageImpl implements ComponentModePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModeCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModeDefinitionEClass = null;

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
	 * @see org.ecore.service.componentMode.ComponentModePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentModePackageImpl() {
		super(eNS_URI, ComponentModeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentModePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentModePackage init() {
		if (isInited)
			return (ComponentModePackage) EPackage.Registry.INSTANCE.getEPackage(ComponentModePackage.eNS_URI);

		// Obtain or create and register package
		ComponentModePackageImpl theComponentModePackage = (ComponentModePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentModePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentModePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComponentModePackage.createPackageContents();

		// Initialize created meta-data
		theComponentModePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentModePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentModePackage.eNS_URI, theComponentModePackage);
		return theComponentModePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModeModel() {
		return componentModeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModeModel_Repository() {
		return (EReference) componentModeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModeRepository() {
		return componentModeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentModeRepository_Name() {
		return (EAttribute) componentModeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModeRepository_Collections() {
		return (EReference) componentModeRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModeCollection() {
		return componentModeCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentModeCollection_Name() {
		return (EAttribute) componentModeCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModeCollection_Modes() {
		return (EReference) componentModeCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModeDefinition() {
		return componentModeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentModeDefinition_Name() {
		return (EAttribute) componentModeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeFactory getComponentModeFactory() {
		return (ComponentModeFactory) getEFactoryInstance();
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
		componentModeModelEClass = createEClass(COMPONENT_MODE_MODEL);
		createEReference(componentModeModelEClass, COMPONENT_MODE_MODEL__REPOSITORY);

		componentModeRepositoryEClass = createEClass(COMPONENT_MODE_REPOSITORY);
		createEAttribute(componentModeRepositoryEClass, COMPONENT_MODE_REPOSITORY__NAME);
		createEReference(componentModeRepositoryEClass, COMPONENT_MODE_REPOSITORY__COLLECTIONS);

		componentModeCollectionEClass = createEClass(COMPONENT_MODE_COLLECTION);
		createEAttribute(componentModeCollectionEClass, COMPONENT_MODE_COLLECTION__NAME);
		createEReference(componentModeCollectionEClass, COMPONENT_MODE_COLLECTION__MODES);

		componentModeDefinitionEClass = createEClass(COMPONENT_MODE_DEFINITION);
		createEAttribute(componentModeDefinitionEClass, COMPONENT_MODE_DEFINITION__NAME);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(componentModeModelEClass, ComponentModeModel.class, "ComponentModeModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModeModel_Repository(), this.getComponentModeRepository(), null, "repository", null,
				0, 1, ComponentModeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentModeRepositoryEClass, ComponentModeRepository.class, "ComponentModeRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentModeRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentModeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentModeRepository_Collections(), this.getComponentModeCollection(), null, "collections",
				null, 0, -1, ComponentModeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentModeCollectionEClass, ComponentModeCollection.class, "ComponentModeCollection",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentModeCollection_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentModeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentModeCollection_Modes(), this.getComponentModeDefinition(), null, "modes", null, 0,
				-1, ComponentModeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentModeDefinitionEClass, ComponentModeDefinition.class, "ComponentModeDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentModeDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentModeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentModePackageImpl
