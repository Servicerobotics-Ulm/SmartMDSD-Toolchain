/**
 */
package org.ecore.base.basicAttributes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.InlineEnumerationType#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getInlineEnumerationType()
 * @model
 * @generated
 */
public interface InlineEnumerationType extends AbstractAttributeType {
	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.EnumerationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#getInlineEnumerationType_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationElement> getEnums();

} // InlineEnumerationType
