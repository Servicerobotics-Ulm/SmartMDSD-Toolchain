/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.base.documentation;

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
 * @see org.eclipse.smartmdsd.ecore.base.documentation.DocumentationFactory
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
	String eNS_URI = "http://www.eclipse.org/smartmdsd/base/documentation";

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
	DocumentationPackage eINSTANCE = org.eclipse.smartmdsd.ecore.base.documentation.impl.DocumentationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl <em>Abstract Documentation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.impl.DocumentationPackageImpl#getAbstractDocumentationElement()
	 * @generated
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Documentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION = 0;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE = 1;

	/**
	 * The number of operations of the '<em>Abstract Documentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement <em>Abstract Documentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Documentation Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement
	 * @generated
	 */
	EClass getAbstractDocumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getDocumentation()
	 * @see #getAbstractDocumentationElement()
	 * @generated
	 */
	EAttribute getAbstractDocumentationElement_Documentation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getMultilineHtmlDocumentation() <em>Get Multiline Html Documentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Multiline Html Documentation</em>' operation.
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getMultilineHtmlDocumentation()
	 * @generated
	 */
	EOperation getAbstractDocumentationElement__GetMultilineHtmlDocumentation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getFirstDocumentationLine() <em>Get First Documentation Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Documentation Line</em>' operation.
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getFirstDocumentationLine()
	 * @generated
	 */
	EOperation getAbstractDocumentationElement__GetFirstDocumentationLine();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl <em>Abstract Documentation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.documentation.impl.DocumentationPackageImpl#getAbstractDocumentationElement()
		 * @generated
		 */
		EClass ABSTRACT_DOCUMENTATION_ELEMENT = eINSTANCE.getAbstractDocumentationElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION = eINSTANCE
				.getAbstractDocumentationElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Get Multiline Html Documentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION = eINSTANCE
				.getAbstractDocumentationElement__GetMultilineHtmlDocumentation();

		/**
		 * The meta object literal for the '<em><b>Get First Documentation Line</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE = eINSTANCE
				.getAbstractDocumentationElement__GetFirstDocumentationLine();

	}

} //DocumentationPackage
