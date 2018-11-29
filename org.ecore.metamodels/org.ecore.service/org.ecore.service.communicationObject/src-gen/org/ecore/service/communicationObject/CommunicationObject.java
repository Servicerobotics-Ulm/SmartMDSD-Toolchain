/**
 */
package org.ecore.service.communicationObject;

import org.eclipse.emf.common.util.EList;

import org.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.CommunicationObject#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommunicationObject()
 * @model
 * @generated
 */
public interface CommunicationObject extends AbstractCommElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommunicationObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributes();

} // CommunicationObject
