/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.ecore.EObject;

import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getCoordinationInterfaceDef <em>Coordination Interface Def</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationInterfaceInstance()
 * @model
 * @generated
 */
public interface CoordinationInterfaceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationInterfaceInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coordination Interface Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Interface Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Interface Def</em>' reference.
	 * @see #setCoordinationInterfaceDef(CoordinationServiceDefinition)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationInterfaceInstance_CoordinationInterfaceDef()
	 * @model required="true"
	 * @generated
	 */
	CoordinationServiceDefinition getCoordinationInterfaceDef();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getCoordinationInterfaceDef <em>Coordination Interface Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Interface Def</em>' reference.
	 * @see #getCoordinationInterfaceDef()
	 * @generated
	 */
	void setCoordinationInterfaceDef(CoordinationServiceDefinition value);

} // CoordinationInterfaceInstance
