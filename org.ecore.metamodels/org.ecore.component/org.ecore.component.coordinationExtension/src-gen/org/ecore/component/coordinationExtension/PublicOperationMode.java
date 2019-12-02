/**
 */
package org.ecore.component.coordinationExtension;

import org.eclipse.emf.common.util.EList;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.service.componentMode.ComponentModeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Operation Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.PublicOperationMode#getActivates <em>Activates</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.PublicOperationMode#getMode <em>Mode</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.PublicOperationMode#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.component.coordinationExtension.PublicOperationMode#isIsDefaultInit <em>Is Default Init</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getPublicOperationMode()
 * @model
 * @generated
 */
public interface PublicOperationMode extends AbstractCoordinationElement, AbstractDocumentedElement {
	/**
	 * Returns the value of the '<em><b>Activates</b></em>' reference list.
	 * The list contents are of type {@link org.ecore.component.coordinationExtension.PrivateOperationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activates</em>' reference list.
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getPublicOperationMode_Activates()
	 * @model
	 * @generated
	 */
	EList<PrivateOperationMode> getActivates();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(ComponentModeDefinition)
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getPublicOperationMode_Mode()
	 * @model required="true"
	 * @generated
	 */
	ComponentModeDefinition getMode();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.PublicOperationMode#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ComponentModeDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getPublicOperationMode_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.component.coordinationExtension.PublicOperationMode#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Is Default Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Init</em>' attribute.
	 * @see #setIsDefaultInit(boolean)
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getPublicOperationMode_IsDefaultInit()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsDefaultInit();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.PublicOperationMode#isIsDefaultInit <em>Is Default Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Init</em>' attribute.
	 * @see #isIsDefaultInit()
	 * @generated
	 */
	void setIsDefaultInit(boolean value);

} // PublicOperationMode
