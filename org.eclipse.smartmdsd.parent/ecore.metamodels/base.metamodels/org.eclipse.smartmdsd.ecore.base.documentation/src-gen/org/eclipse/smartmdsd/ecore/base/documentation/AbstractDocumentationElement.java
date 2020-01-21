/**
 */
package org.eclipse.smartmdsd.ecore.base.documentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Documentation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage#getAbstractDocumentationElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDocumentationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage#getAbstractDocumentationElement_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMultilineHtmlDocumentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFirstDocumentationLine();

} // AbstractDocumentationElement
