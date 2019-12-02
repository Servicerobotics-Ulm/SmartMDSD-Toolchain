/**
 */
package org.ecore.base.documentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.base.documentation.DocumentationFactory
 * @model kind="package"
 * @generated
 */
public interface DocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "documentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/base/documentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "documentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentationPackage eINSTANCE = org.ecore.base.documentation.impl.DocumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.base.documentation.impl.AbstractDocumentedElementImpl <em>Abstract Documented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.documentation.impl.AbstractDocumentedElementImpl
	 * @see org.ecore.base.documentation.impl.DocumentationPackageImpl#getAbstractDocumentedElement()
	 * @generated
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION = 0;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT___GET_FIRST_DOCUMENTATION_LINE = 1;

	/**
	 * The number of operations of the '<em>Abstract Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTED_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.ecore.base.documentation.AbstractDocumentedElement <em>Abstract Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Documented Element</em>'.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement
	 * @generated
	 */
	EClass getAbstractDocumentedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.documentation.AbstractDocumentedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement#getDocumentation()
	 * @see #getAbstractDocumentedElement()
	 * @generated
	 */
	EAttribute getAbstractDocumentedElement_Documentation();

	/**
	 * Returns the meta object for the '{@link org.ecore.base.documentation.AbstractDocumentedElement#getMultilineHtmlDocumentation() <em>Get Multiline Html Documentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Multiline Html Documentation</em>' operation.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement#getMultilineHtmlDocumentation()
	 * @generated
	 */
	EOperation getAbstractDocumentedElement__GetMultilineHtmlDocumentation();

	/**
	 * Returns the meta object for the '{@link org.ecore.base.documentation.AbstractDocumentedElement#getFirstDocumentationLine() <em>Get First Documentation Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Documentation Line</em>' operation.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement#getFirstDocumentationLine()
	 * @generated
	 */
	EOperation getAbstractDocumentedElement__GetFirstDocumentationLine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentationFactory getDocumentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.base.documentation.impl.AbstractDocumentedElementImpl <em>Abstract Documented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.documentation.impl.AbstractDocumentedElementImpl
		 * @see org.ecore.base.documentation.impl.DocumentationPackageImpl#getAbstractDocumentedElement()
		 * @generated
		 */
		EClass ABSTRACT_DOCUMENTED_ELEMENT = eINSTANCE.getAbstractDocumentedElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION = eINSTANCE.getAbstractDocumentedElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Get Multiline Html Documentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DOCUMENTED_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION = eINSTANCE
				.getAbstractDocumentedElement__GetMultilineHtmlDocumentation();

		/**
		 * The meta object literal for the '<em><b>Get First Documentation Line</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DOCUMENTED_ELEMENT___GET_FIRST_DOCUMENTATION_LINE = eINSTANCE
				.getAbstractDocumentedElement__GetFirstDocumentationLine();

	}

} //DocumentationPackage
