/**
 */
package org.ecore.service.communicationObject;

import org.ecore.base.basicAttributes.AbstractAttributeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationObject.CommElementReference#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementReference()
 * @model
 * @generated
 */
public interface CommElementReference extends AbstractAttributeType {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference.
	 * @see #setTypeName(AbstractCommElement)
	 * @see org.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementReference_TypeName()
	 * @model required="true"
	 * @generated
	 */
	AbstractCommElement getTypeName();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationObject.CommElementReference#getTypeName <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(AbstractCommElement value);

} // CommElementReference
