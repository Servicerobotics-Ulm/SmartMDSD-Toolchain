/**
 */
package org.ecore.base.basicAttributes;

import org.ecore.base.documentation.AbstractDocumentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.AttributeRefinement#getValue <em>Value</em>}</li>
 *   <li>{@link org.ecore.base.basicAttributes.AttributeRefinement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement()
 * @model
 * @generated
 */
public interface AttributeRefinement extends AbstractDocumentedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AbstractValue)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractValue getValue();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.AttributeRefinement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AbstractValue value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeDefinition)
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AttributeDefinition getAttribute();

	/**
	 * Sets the value of the '{@link org.ecore.base.basicAttributes.AttributeRefinement#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeDefinition value);

} // AttributeRefinement
