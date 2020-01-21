/**
 */
package org.eclipse.smartmdsd.ecore.service.communicationObject;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementValue()
 * @model
 * @generated
 */
public interface CommElementValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(AbstractCommElement)
	 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementValue_Value()
	 * @model required="true"
	 * @generated
	 */
	AbstractCommElement getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AbstractCommElement value);

} // CommElementValue
