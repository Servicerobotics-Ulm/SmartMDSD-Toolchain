/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationFactory;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.behavior.skillRealization.SkillRealizationSet;

import org.ecore.service.skillDefinition.SkillDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillRealizationPackageImpl extends EPackageImpl implements SkillRealizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationEClass = null;

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
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkillRealizationPackageImpl() {
		super(eNS_URI, SkillRealizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SkillRealizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkillRealizationPackage init() {
		if (isInited)
			return (SkillRealizationPackage) EPackage.Registry.INSTANCE.getEPackage(SkillRealizationPackage.eNS_URI);

		// Obtain or create and register package
		SkillRealizationPackageImpl theSkillRealizationPackage = (SkillRealizationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SkillRealizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SkillRealizationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSkillRealizationPackage.createPackageContents();

		// Initialize created meta-data
		theSkillRealizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkillRealizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkillRealizationPackage.eNS_URI, theSkillRealizationPackage);
		return theSkillRealizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillRealizationModel() {
		return skillRealizationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillRealizationModel_Skillsets() {
		return (EReference) skillRealizationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillRealizationSet() {
		return skillRealizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillRealizationSet_Skills() {
		return (EReference) skillRealizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillRealizationSet_SkillDefSet() {
		return (EReference) skillRealizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkillRealizationSet_Name() {
		return (EAttribute) skillRealizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillRealization() {
		return skillRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillRealization_SkillDef() {
		return (EReference) skillRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationFactory getSkillRealizationFactory() {
		return (SkillRealizationFactory) getEFactoryInstance();
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
		skillRealizationModelEClass = createEClass(SKILL_REALIZATION_MODEL);
		createEReference(skillRealizationModelEClass, SKILL_REALIZATION_MODEL__SKILLSETS);

		skillRealizationSetEClass = createEClass(SKILL_REALIZATION_SET);
		createEReference(skillRealizationSetEClass, SKILL_REALIZATION_SET__SKILLS);
		createEReference(skillRealizationSetEClass, SKILL_REALIZATION_SET__SKILL_DEF_SET);
		createEAttribute(skillRealizationSetEClass, SKILL_REALIZATION_SET__NAME);

		skillRealizationEClass = createEClass(SKILL_REALIZATION);
		createEReference(skillRealizationEClass, SKILL_REALIZATION__SKILL_DEF);
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
		SkillDefinitionPackage theSkillDefinitionPackage = (SkillDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(SkillDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(skillRealizationModelEClass, SkillRealizationModel.class, "SkillRealizationModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealizationModel_Skillsets(), this.getSkillRealizationSet(), null, "skillsets", null, 0,
				-1, SkillRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillRealizationSetEClass, SkillRealizationSet.class, "SkillRealizationSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealizationSet_Skills(), this.getSkillRealization(), null, "skills", null, 0, -1,
				SkillRealizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillRealizationSet_SkillDefSet(), theSkillDefinitionPackage.getSkillDefinitionSet(), null,
				"skillDefSet", null, 1, 1, SkillRealizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkillRealizationSet_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SkillRealizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillRealizationEClass, SkillRealization.class, "SkillRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealization_SkillDef(), theSkillDefinitionPackage.getSkillDefinition(), null, "skillDef",
				null, 1, 1, SkillRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SkillRealizationPackageImpl
