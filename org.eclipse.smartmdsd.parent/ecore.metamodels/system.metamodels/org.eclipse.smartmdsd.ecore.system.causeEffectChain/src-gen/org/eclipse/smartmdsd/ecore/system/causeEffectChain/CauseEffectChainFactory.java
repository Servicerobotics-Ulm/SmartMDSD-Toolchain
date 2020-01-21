/**
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage
 * @generated
 */
public interface CauseEffectChainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CauseEffectChainFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.causeEffectChain.impl.CauseEffectChainFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Cuase Effect Chain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuase Effect Chain Model</em>'.
	 * @generated
	 */
	CuaseEffectChainModel createCuaseEffectChainModel();

	/**
	 * Returns a new object of class '<em>Activity Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Chain</em>'.
	 * @generated
	 */
	ActivityChain createActivityChain();

	/**
	 * Returns a new object of class '<em>Activity Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Link</em>'.
	 * @generated
	 */
	ActivityLink createActivityLink();

	/**
	 * Returns a new object of class '<em>Input Handler Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Handler Link</em>'.
	 * @generated
	 */
	InputHandlerLink createInputHandlerLink();

	/**
	 * Returns a new object of class '<em>Max Response Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Response Time</em>'.
	 * @generated
	 */
	MaxResponseTime createMaxResponseTime();

	/**
	 * Returns a new object of class '<em>Min Response Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Response Time</em>'.
	 * @generated
	 */
	MinResponseTime createMinResponseTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CauseEffectChainPackage getCauseEffectChainPackage();

} //CauseEffectChainFactory
