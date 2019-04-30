/**
 */
package org.ecore.base.mixedport.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.mixedport.AbstractMixedPortDefinition;
import org.ecore.base.mixedport.MixedPortOpcUaBase;
import org.ecore.base.mixedport.MixedPortROSBase;
import org.ecore.base.mixedport.MixedPortYARPBase;
import org.ecore.base.mixedport.MixedportFactory;
import org.ecore.base.mixedport.MixedportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MixedportPackageImpl extends EPackageImpl implements MixedportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMixedPortDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortOpcUaBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortROSBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortYARPBaseEClass = null;

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
	 * @see org.ecore.base.mixedport.MixedportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MixedportPackageImpl() {
		super(eNS_URI, MixedportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MixedportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MixedportPackage init() {
		if (isInited)
			return (MixedportPackage) EPackage.Registry.INSTANCE.getEPackage(MixedportPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMixedportPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MixedportPackageImpl theMixedportPackage = registeredMixedportPackage instanceof MixedportPackageImpl
				? (MixedportPackageImpl) registeredMixedportPackage
				: new MixedportPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMixedportPackage.createPackageContents();

		// Initialize created meta-data
		theMixedportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMixedportPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MixedportPackage.eNS_URI, theMixedportPackage);
		return theMixedportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMixedPortDefinition() {
		return abstractMixedPortDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractMixedPortDefinition_Name() {
		return (EAttribute) abstractMixedPortDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortOpcUaBase() {
		return mixedPortOpcUaBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortROSBase() {
		return mixedPortROSBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortYARPBase() {
		return mixedPortYARPBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedportFactory getMixedportFactory() {
		return (MixedportFactory) getEFactoryInstance();
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
		abstractMixedPortDefinitionEClass = createEClass(ABSTRACT_MIXED_PORT_DEFINITION);
		createEAttribute(abstractMixedPortDefinitionEClass, ABSTRACT_MIXED_PORT_DEFINITION__NAME);

		mixedPortOpcUaBaseEClass = createEClass(MIXED_PORT_OPC_UA_BASE);

		mixedPortROSBaseEClass = createEClass(MIXED_PORT_ROS_BASE);

		mixedPortYARPBaseEClass = createEClass(MIXED_PORT_YARP_BASE);
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
		mixedPortOpcUaBaseEClass.getESuperTypes().add(this.getAbstractMixedPortDefinition());
		mixedPortROSBaseEClass.getESuperTypes().add(this.getAbstractMixedPortDefinition());
		mixedPortYARPBaseEClass.getESuperTypes().add(this.getAbstractMixedPortDefinition());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractMixedPortDefinitionEClass, AbstractMixedPortDefinition.class, "AbstractMixedPortDefinition",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMixedPortDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractMixedPortDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixedPortOpcUaBaseEClass, MixedPortOpcUaBase.class, "MixedPortOpcUaBase", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mixedPortROSBaseEClass, MixedPortROSBase.class, "MixedPortROSBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mixedPortYARPBaseEClass, MixedPortYARPBase.class, "MixedPortYARPBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MixedportPackageImpl
