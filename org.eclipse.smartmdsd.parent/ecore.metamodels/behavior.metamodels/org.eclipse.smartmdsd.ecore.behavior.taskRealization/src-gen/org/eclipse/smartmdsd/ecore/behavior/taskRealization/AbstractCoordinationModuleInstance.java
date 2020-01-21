/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskRealization;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordination Module Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getCoordModuleDef <em>Coord Module Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getAbstractCoordinationModuleInstance()
 * @model
 * @generated
 */
public interface AbstractCoordinationModuleInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Coord Module Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Module Def</em>' reference.
	 * @see #setCoordModuleDef(CoordinationModuleDefinition)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getAbstractCoordinationModuleInstance_CoordModuleDef()
	 * @model required="true"
	 * @generated
	 */
	CoordinationModuleDefinition getCoordModuleDef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getCoordModuleDef <em>Coord Module Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Module Def</em>' reference.
	 * @see #getCoordModuleDef()
	 * @generated
	 */
	void setCoordModuleDef(CoordinationModuleDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getAbstractCoordinationModuleInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractCoordinationModuleInstance
