/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Module Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModuleInst <em>Coord Module Inst</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModReal <em>Coord Mod Real</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordInterCompInstMapping <em>Coord Inter Comp Inst Mapping</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationModuleMapping()
 * @model
 * @generated
 */
public interface CoordinationModuleMapping extends SystemExtension {
	/**
	 * Returns the value of the '<em><b>Coord Module Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Module Inst</em>' reference.
	 * @see #setCoordModuleInst(AbstractCoordinationModuleInstance)
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationModuleMapping_CoordModuleInst()
	 * @model required="true"
	 * @generated
	 */
	AbstractCoordinationModuleInstance getCoordModuleInst();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModuleInst <em>Coord Module Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Module Inst</em>' reference.
	 * @see #getCoordModuleInst()
	 * @generated
	 */
	void setCoordModuleInst(AbstractCoordinationModuleInstance value);

	/**
	 * Returns the value of the '<em><b>Coord Mod Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Mod Real</em>' reference.
	 * @see #setCoordModReal(CoordinationModuleRealization)
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationModuleMapping_CoordModReal()
	 * @model
	 * @generated
	 */
	CoordinationModuleRealization getCoordModReal();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModReal <em>Coord Mod Real</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Mod Real</em>' reference.
	 * @see #getCoordModReal()
	 * @generated
	 */
	void setCoordModReal(CoordinationModuleRealization value);

	/**
	 * Returns the value of the '<em><b>Coord Inter Comp Inst Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Inter Comp Inst Mapping</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationModuleMapping_CoordInterCompInstMapping()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CoordinationInterfaceComponentInstanceMapping> getCoordInterCompInstMapping();

} // CoordinationModuleMapping
