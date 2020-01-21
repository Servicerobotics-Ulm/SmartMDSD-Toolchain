/**
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage
 * @generated
 */
public interface SkillRealizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkillRealizationFactory eINSTANCE = org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SkillRealizationModel createSkillRealizationModel();

	/**
	 * Returns a new object of class '<em>Coordination Module Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Module Realization</em>'.
	 * @generated
	 */
	CoordinationModuleRealization createCoordinationModuleRealization();

	/**
	 * Returns a new object of class '<em>Skill Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Realization</em>'.
	 * @generated
	 */
	SkillRealization createSkillRealization();

	/**
	 * Returns a new object of class '<em>Component Coordination Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Coordination Action Event</em>'.
	 * @generated
	 */
	ComponentCoordinationActionEvent createComponentCoordinationActionEvent();

	/**
	 * Returns a new object of class '<em>Component Coordination Action Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Coordination Action Wiring</em>'.
	 * @generated
	 */
	ComponentCoordinationActionWiring createComponentCoordinationActionWiring();

	/**
	 * Returns a new object of class '<em>Component Coordination Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Coordination Action Parameter</em>'.
	 * @generated
	 */
	ComponentCoordinationActionParameter createComponentCoordinationActionParameter();

	/**
	 * Returns a new object of class '<em>Component Coordination Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Coordination Action Activation</em>'.
	 * @generated
	 */
	ComponentCoordinationActionActivation createComponentCoordinationActionActivation();

	/**
	 * Returns a new object of class '<em>Coordination Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Action Block</em>'.
	 * @generated
	 */
	CoordinationActionBlock createCoordinationActionBlock();

	/**
	 * Returns a new object of class '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler</em>'.
	 * @generated
	 */
	EventHandler createEventHandler();

	/**
	 * Returns a new object of class '<em>Coordination Interface Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Interface Instance</em>'.
	 * @generated
	 */
	CoordinationInterfaceInstance createCoordinationInterfaceInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SkillRealizationPackage getSkillRealizationPackage();

} //SkillRealizationFactory
