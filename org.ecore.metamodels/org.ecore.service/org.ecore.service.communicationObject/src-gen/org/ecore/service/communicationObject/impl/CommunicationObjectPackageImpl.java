/**
 */
package org.ecore.service.communicationObject.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.service.communicationObject.AbstractCommElement;
import org.ecore.service.communicationObject.CommElementReference;
import org.ecore.service.communicationObject.CommElementValue;
import org.ecore.service.communicationObject.CommObjectModel;
import org.ecore.service.communicationObject.CommObjectsRepository;
import org.ecore.service.communicationObject.CommRepositoryImport;
import org.ecore.service.communicationObject.CommunicationObject;
import org.ecore.service.communicationObject.CommunicationObjectFactory;
import org.ecore.service.communicationObject.CommunicationObjectPackage;
import org.ecore.service.communicationObject.Enumeration;
import org.ecore.service.communicationObject.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationObjectPackageImpl extends EPackageImpl implements CommunicationObjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commObjectModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commObjectsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCommElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commRepositoryImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commElementReferenceEClass = null;

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
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationObjectPackageImpl() {
		super(eNS_URI, CommunicationObjectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationObjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationObjectPackage init() {
		if (isInited)
			return (CommunicationObjectPackage) EPackage.Registry.INSTANCE
					.getEPackage(CommunicationObjectPackage.eNS_URI);

		// Obtain or create and register package
		CommunicationObjectPackageImpl theCommunicationObjectPackage = (CommunicationObjectPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CommunicationObjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CommunicationObjectPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationObjectPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationObjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationObjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationObjectPackage.eNS_URI, theCommunicationObjectPackage);
		return theCommunicationObjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommObjectModel() {
		return commObjectModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommObjectModel_Repository() {
		return (EReference) commObjectModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommObjectModel_Imports() {
		return (EReference) commObjectModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommObjectsRepository() {
		return commObjectsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommObjectsRepository_Name() {
		return (EAttribute) commObjectsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommObjectsRepository_Elements() {
		return (EReference) commObjectsRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommObjectsRepository_Version() {
		return (EReference) commObjectsRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommObjectsRepository_Dependency() {
		return (EAttribute) commObjectsRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCommElement() {
		return abstractCommElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCommElement_Name() {
		return (EAttribute) abstractCommElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommRepositoryImport() {
		return commRepositoryImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommRepositoryImport_ImportedNamespace() {
		return (EAttribute) commRepositoryImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Major() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Minor() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Patch() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Enums() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationObject() {
		return communicationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationObject_Attributes() {
		return (EReference) communicationObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommElementValue() {
		return commElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommElementValue_Value() {
		return (EReference) commElementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommElementReference() {
		return commElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommElementReference_TypeName() {
		return (EReference) commElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObjectFactory getCommunicationObjectFactory() {
		return (CommunicationObjectFactory) getEFactoryInstance();
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
		commObjectModelEClass = createEClass(COMM_OBJECT_MODEL);
		createEReference(commObjectModelEClass, COMM_OBJECT_MODEL__REPOSITORY);
		createEReference(commObjectModelEClass, COMM_OBJECT_MODEL__IMPORTS);

		commObjectsRepositoryEClass = createEClass(COMM_OBJECTS_REPOSITORY);
		createEAttribute(commObjectsRepositoryEClass, COMM_OBJECTS_REPOSITORY__NAME);
		createEReference(commObjectsRepositoryEClass, COMM_OBJECTS_REPOSITORY__ELEMENTS);
		createEReference(commObjectsRepositoryEClass, COMM_OBJECTS_REPOSITORY__VERSION);
		createEAttribute(commObjectsRepositoryEClass, COMM_OBJECTS_REPOSITORY__DEPENDENCY);

		abstractCommElementEClass = createEClass(ABSTRACT_COMM_ELEMENT);
		createEAttribute(abstractCommElementEClass, ABSTRACT_COMM_ELEMENT__NAME);

		commRepositoryImportEClass = createEClass(COMM_REPOSITORY_IMPORT);
		createEAttribute(commRepositoryImportEClass, COMM_REPOSITORY_IMPORT__IMPORTED_NAMESPACE);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__MAJOR);
		createEAttribute(versionEClass, VERSION__MINOR);
		createEAttribute(versionEClass, VERSION__PATCH);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__ENUMS);

		communicationObjectEClass = createEClass(COMMUNICATION_OBJECT);
		createEReference(communicationObjectEClass, COMMUNICATION_OBJECT__ATTRIBUTES);

		commElementValueEClass = createEClass(COMM_ELEMENT_VALUE);
		createEReference(commElementValueEClass, COMM_ELEMENT_VALUE__VALUE);

		commElementReferenceEClass = createEClass(COMM_ELEMENT_REFERENCE);
		createEReference(commElementReferenceEClass, COMM_ELEMENT_REFERENCE__TYPE_NAME);
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
		BasicAttributesPackage theBasicAttributesPackage = (BasicAttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicAttributesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enumerationEClass.getESuperTypes().add(this.getAbstractCommElement());
		communicationObjectEClass.getESuperTypes().add(this.getAbstractCommElement());
		commElementValueEClass.getESuperTypes().add(theBasicAttributesPackage.getSingleValue());
		commElementReferenceEClass.getESuperTypes().add(theBasicAttributesPackage.getAbstractAttributeType());

		// Initialize classes and features; add operations and parameters
		initEClass(commObjectModelEClass, CommObjectModel.class, "CommObjectModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommObjectModel_Repository(), this.getCommObjectsRepository(), null, "repository", null, 0, 1,
				CommObjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommObjectModel_Imports(), this.getCommRepositoryImport(), null, "imports", null, 0, -1,
				CommObjectModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commObjectsRepositoryEClass, CommObjectsRepository.class, "CommObjectsRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommObjectsRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CommObjectsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommObjectsRepository_Elements(), this.getAbstractCommElement(), null, "elements", null, 0,
				-1, CommObjectsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommObjectsRepository_Version(), this.getVersion(), null, "version", null, 0, 1,
				CommObjectsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommObjectsRepository_Dependency(), ecorePackage.getEString(), "dependency", null, 0, 1,
				CommObjectsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCommElementEClass, AbstractCommElement.class, "AbstractCommElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCommElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractCommElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commRepositoryImportEClass, CommRepositoryImport.class, "CommRepositoryImport", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommRepositoryImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace",
				null, 1, 1, CommRepositoryImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Major(), ecorePackage.getEInt(), "major", null, 1, 1, Version.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Minor(), ecorePackage.getEInt(), "minor", null, 1, 1, Version.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Patch(), ecorePackage.getEInt(), "patch", null, 0, 1, Version.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Enums(), theBasicAttributesPackage.getEnumerationElement(), null, "enums", null,
				0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationObjectEClass, CommunicationObject.class, "CommunicationObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationObject_Attributes(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"attributes", null, 0, -1, CommunicationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commElementValueEClass, CommElementValue.class, "CommElementValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommElementValue_Value(), this.getAbstractCommElement(), null, "value", null, 1, 1,
				CommElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commElementReferenceEClass, CommElementReference.class, "CommElementReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommElementReference_TypeName(), this.getAbstractCommElement(), null, "typeName", null, 1, 1,
				CommElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationObjectPackageImpl
