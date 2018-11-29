/**
 */
package org.ecore.service.communicationObject;

import org.eclipse.emf.common.util.EList;

import org.ecore.base.basicAttributes.EnumerationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.Enumeration#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends AbstractCommElement {
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
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getEnumeration_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationElement> getEnums();

} // Enumeration
