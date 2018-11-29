/**
 */
package org.ecore.component.componentDocumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage
 * @generated
 */
public interface ComponentDocumentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDocumentationFactory eINSTANCE = org.ecore.component.componentDocumentation.impl.ComponentDocumentationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Component Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Documentation</em>'.
	 * @generated
	 */
	ComponentDocumentation createComponentDocumentation();

	/**
	 * Returns a new object of class '<em>Component Service Docu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Service Docu</em>'.
	 * @generated
	 */
	ComponentServiceDocu createComponentServiceDocu();

	/**
	 * Returns a new object of class '<em>Component Mode Docu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Mode Docu</em>'.
	 * @generated
	 */
	ComponentModeDocu createComponentModeDocu();

	/**
	 * Returns a new object of class '<em>Neutral Mode Docu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neutral Mode Docu</em>'.
	 * @generated
	 */
	NeutralModeDocu createNeutralModeDocu();

	/**
	 * Returns a new object of class '<em>Coordination Slave Port Docu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Slave Port Docu</em>'.
	 * @generated
	 */
	CoordinationSlavePortDocu createCoordinationSlavePortDocu();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentDocumentationPackage getComponentDocumentationPackage();

} //ComponentDocumentationFactory
