/**
 */
package org.ecore.base.documentation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.base.documentation.DocumentationFactory;
import org.ecore.base.documentation.DocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationPackageImpl extends EPackageImpl implements DocumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDocumentedElementEClass = null;

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
	 * @see org.ecore.base.documentation.DocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentationPackageImpl() {
		super(eNS_URI, DocumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentationPackage init() {
		if (isInited)
			return (DocumentationPackage) EPackage.Registry.INSTANCE.getEPackage(DocumentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDocumentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DocumentationPackageImpl theDocumentationPackage = registeredDocumentationPackage instanceof DocumentationPackageImpl
				? (DocumentationPackageImpl) registeredDocumentationPackage
				: new DocumentationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentationPackage.eNS_URI, theDocumentationPackage);
		return theDocumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDocumentedElement() {
		return abstractDocumentedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDocumentedElement_Documentation() {
		return (EAttribute) abstractDocumentedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractDocumentedElement__GetMultilineHtmlDocumentation() {
		return abstractDocumentedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractDocumentedElement__GetFirstDocumentationLine() {
		return abstractDocumentedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationFactory getDocumentationFactory() {
		return (DocumentationFactory) getEFactoryInstance();
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
		abstractDocumentedElementEClass = createEClass(ABSTRACT_DOCUMENTED_ELEMENT);
		createEAttribute(abstractDocumentedElementEClass, ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION);
		createEOperation(abstractDocumentedElementEClass,
				ABSTRACT_DOCUMENTED_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION);
		createEOperation(abstractDocumentedElementEClass, ABSTRACT_DOCUMENTED_ELEMENT___GET_FIRST_DOCUMENTATION_LINE);
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
		initEClass(abstractDocumentedElementEClass, AbstractDocumentedElement.class, "AbstractDocumentedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDocumentedElement_Documentation(), ecorePackage.getEString(), "documentation", null,
				0, 1, AbstractDocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractDocumentedElement__GetMultilineHtmlDocumentation(), ecorePackage.getEString(),
				"getMultilineHtmlDocumentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDocumentedElement__GetFirstDocumentationLine(), ecorePackage.getEString(),
				"getFirstDocumentationLine", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DocumentationPackageImpl
