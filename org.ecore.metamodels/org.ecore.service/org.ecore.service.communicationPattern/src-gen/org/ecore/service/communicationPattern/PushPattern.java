/**
 */
package org.ecore.service.communicationPattern;

import org.ecore.service.communicationObject.CommunicationObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationPattern.PushPattern#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getPushPattern()
 * @model
 * @generated
 */
public interface PushPattern extends ForkingPattern {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(CommunicationObject)
	 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage#getPushPattern_DataType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getDataType();

	/**
	 * Sets the value of the '{@link org.ecore.service.communicationPattern.PushPattern#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(CommunicationObject value);

} // PushPattern
