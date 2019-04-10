/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.ecore.service.skillDefinition.CoordinationModuleDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Module Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordinationModuleDef <em>Coordination Module Def</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordInterfaceInsts <em>Coord Interface Insts</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationModuleRealization()
 * @model
 * @generated
 */
public interface CoordinationModuleRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.behavior.skillRealization.SkillRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationModuleRealization_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillRealization> getSkills();

	/**
	 * Returns the value of the '<em><b>Coordination Module Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Module Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Module Def</em>' reference.
	 * @see #setCoordinationModuleDef(CoordinationModuleDefinition)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationModuleRealization_CoordinationModuleDef()
	 * @model required="true"
	 * @generated
	 */
	CoordinationModuleDefinition getCoordinationModuleDef();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordinationModuleDef <em>Coordination Module Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Module Def</em>' reference.
	 * @see #getCoordinationModuleDef()
	 * @generated
	 */
	void setCoordinationModuleDef(CoordinationModuleDefinition value);

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
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationModuleRealization_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.CoordinationModuleRealization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coord Interface Insts</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.behavior.skillRealization.CoordinationInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Interface Insts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Interface Insts</em>' containment reference list.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationModuleRealization_CoordInterfaceInsts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CoordinationInterfaceInstance> getCoordInterfaceInsts();

} // CoordinationModuleRealization
