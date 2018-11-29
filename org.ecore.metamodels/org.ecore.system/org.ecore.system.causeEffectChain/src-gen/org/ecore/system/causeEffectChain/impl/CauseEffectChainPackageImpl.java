/**
 */
package org.ecore.system.causeEffectChain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.ecore.system.causeEffectChain.AbstractChainLink;
import org.ecore.system.causeEffectChain.ActivityChain;
import org.ecore.system.causeEffectChain.ActivityLink;
import org.ecore.system.causeEffectChain.CauseEffectChainFactory;
import org.ecore.system.causeEffectChain.CauseEffectChainPackage;
import org.ecore.system.causeEffectChain.CuaseEffectChainModel;
import org.ecore.system.causeEffectChain.InputHandlerLink;
import org.ecore.system.causeEffectChain.MaxResponseTime;
import org.ecore.system.causeEffectChain.MinResponseTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CauseEffectChainPackageImpl extends EPackageImpl implements CauseEffectChainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuaseEffectChainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractChainLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputHandlerLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxResponseTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minResponseTimeEClass = null;

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
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CauseEffectChainPackageImpl() {
		super(eNS_URI, CauseEffectChainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CauseEffectChainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CauseEffectChainPackage init() {
		if (isInited)
			return (CauseEffectChainPackage) EPackage.Registry.INSTANCE.getEPackage(CauseEffectChainPackage.eNS_URI);

		// Obtain or create and register package
		CauseEffectChainPackageImpl theCauseEffectChainPackage = (CauseEffectChainPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CauseEffectChainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CauseEffectChainPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivityArchitecturePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCauseEffectChainPackage.createPackageContents();

		// Initialize created meta-data
		theCauseEffectChainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCauseEffectChainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CauseEffectChainPackage.eNS_URI, theCauseEffectChainPackage);
		return theCauseEffectChainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuaseEffectChainModel() {
		return cuaseEffectChainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuaseEffectChainModel_Name() {
		return (EAttribute) cuaseEffectChainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuaseEffectChainModel_Chains() {
		return (EReference) cuaseEffectChainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuaseEffectChainModel_ActArch() {
		return (EReference) cuaseEffectChainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityChain() {
		return activityChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityChain_Name() {
		return (EAttribute) activityChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityChain_ChainLinks() {
		return (EReference) activityChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityChain_DesiredMinResponse() {
		return (EReference) activityChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityChain_DesiredMaxResponse() {
		return (EReference) activityChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractChainLink() {
		return abstractChainLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLink() {
		return activityLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLink_Name() {
		return (EAttribute) activityLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLink_Ref() {
		return (EReference) activityLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputHandlerLink() {
		return inputHandlerLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputHandlerLink_Name() {
		return (EAttribute) inputHandlerLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputHandlerLink_Ref() {
		return (EReference) inputHandlerLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxResponseTime() {
		return maxResponseTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxResponseTime_Value() {
		return (EAttribute) maxResponseTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxResponseTime_Unit() {
		return (EAttribute) maxResponseTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinResponseTime() {
		return minResponseTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinResponseTime_Value() {
		return (EAttribute) minResponseTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinResponseTime_Unit() {
		return (EAttribute) minResponseTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseEffectChainFactory getCauseEffectChainFactory() {
		return (CauseEffectChainFactory) getEFactoryInstance();
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
		cuaseEffectChainModelEClass = createEClass(CUASE_EFFECT_CHAIN_MODEL);
		createEAttribute(cuaseEffectChainModelEClass, CUASE_EFFECT_CHAIN_MODEL__NAME);
		createEReference(cuaseEffectChainModelEClass, CUASE_EFFECT_CHAIN_MODEL__CHAINS);
		createEReference(cuaseEffectChainModelEClass, CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH);

		activityChainEClass = createEClass(ACTIVITY_CHAIN);
		createEAttribute(activityChainEClass, ACTIVITY_CHAIN__NAME);
		createEReference(activityChainEClass, ACTIVITY_CHAIN__CHAIN_LINKS);
		createEReference(activityChainEClass, ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE);
		createEReference(activityChainEClass, ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE);

		abstractChainLinkEClass = createEClass(ABSTRACT_CHAIN_LINK);

		activityLinkEClass = createEClass(ACTIVITY_LINK);
		createEAttribute(activityLinkEClass, ACTIVITY_LINK__NAME);
		createEReference(activityLinkEClass, ACTIVITY_LINK__REF);

		inputHandlerLinkEClass = createEClass(INPUT_HANDLER_LINK);
		createEAttribute(inputHandlerLinkEClass, INPUT_HANDLER_LINK__NAME);
		createEReference(inputHandlerLinkEClass, INPUT_HANDLER_LINK__REF);

		maxResponseTimeEClass = createEClass(MAX_RESPONSE_TIME);
		createEAttribute(maxResponseTimeEClass, MAX_RESPONSE_TIME__VALUE);
		createEAttribute(maxResponseTimeEClass, MAX_RESPONSE_TIME__UNIT);

		minResponseTimeEClass = createEClass(MIN_RESPONSE_TIME);
		createEAttribute(minResponseTimeEClass, MIN_RESPONSE_TIME__VALUE);
		createEAttribute(minResponseTimeEClass, MIN_RESPONSE_TIME__UNIT);
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
		ActivityArchitecturePackage theActivityArchitecturePackage = (ActivityArchitecturePackage) EPackage.Registry.INSTANCE
				.getEPackage(ActivityArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityLinkEClass.getESuperTypes().add(this.getAbstractChainLink());
		inputHandlerLinkEClass.getESuperTypes().add(this.getAbstractChainLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(cuaseEffectChainModelEClass, CuaseEffectChainModel.class, "CuaseEffectChainModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCuaseEffectChainModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CuaseEffectChainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuaseEffectChainModel_Chains(), this.getActivityChain(), null, "chains", null, 0, -1,
				CuaseEffectChainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuaseEffectChainModel_ActArch(),
				theActivityArchitecturePackage.getActivityArchitectureModel(), null, "actArch", null, 1, 1,
				CuaseEffectChainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityChainEClass, ActivityChain.class, "ActivityChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityChain_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActivityChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityChain_ChainLinks(), this.getAbstractChainLink(), null, "chainLinks", null, 0, -1,
				ActivityChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityChain_DesiredMinResponse(), this.getMinResponseTime(), null, "desiredMinResponse",
				null, 0, 1, ActivityChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityChain_DesiredMaxResponse(), this.getMaxResponseTime(), null, "desiredMaxResponse",
				null, 0, 1, ActivityChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractChainLinkEClass, AbstractChainLink.class, "AbstractChainLink", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityLinkEClass, ActivityLink.class, "ActivityLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActivityLink.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityLink_Ref(), theActivityArchitecturePackage.getActivityNode(), null, "ref", null, 1, 1,
				ActivityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputHandlerLinkEClass, InputHandlerLink.class, "InputHandlerLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputHandlerLink_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				InputHandlerLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getInputHandlerLink_Ref(), theActivityArchitecturePackage.getInputHandlerNode(), null, "ref",
				null, 1, 1, InputHandlerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxResponseTimeEClass, MaxResponseTime.class, "MaxResponseTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxResponseTime_Value(), ecorePackage.getEInt(), "value", null, 1, 1, MaxResponseTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxResponseTime_Unit(), theActivityArchitecturePackage.getTimeUnit(), "unit", null, 1, 1,
				MaxResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(minResponseTimeEClass, MinResponseTime.class, "MinResponseTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinResponseTime_Value(), ecorePackage.getEInt(), "value", null, 1, 1, MinResponseTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinResponseTime_Unit(), theActivityArchitecturePackage.getTimeUnit(), "unit", null, 1, 1,
				MinResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CauseEffectChainPackageImpl
