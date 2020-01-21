/**
 */
package org.eclipse.smartmdsd.ecore.system.targetPlatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage
 * @generated
 */
public interface TargetPlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetPlatformFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.targetPlatform.impl.TargetPlatformFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	TargetPlatformModel createTargetPlatformModel();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	TargetPlatformDefinition createTargetPlatformDefinition();

	/**
	 * Returns a new object of class '<em>Network Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Connection</em>'.
	 * @generated
	 */
	NetworkConnection createNetworkConnection();

	/**
	 * Returns a new object of class '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Interface</em>'.
	 * @generated
	 */
	NetworkInterface createNetworkInterface();

	/**
	 * Returns a new object of class '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU</em>'.
	 * @generated
	 */
	CPU createCPU();

	/**
	 * Returns a new object of class '<em>Login Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Account</em>'.
	 * @generated
	 */
	LoginAccount createLoginAccount();

	/**
	 * Returns a new object of class '<em>Windows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Windows</em>'.
	 * @generated
	 */
	Windows createWindows();

	/**
	 * Returns a new object of class '<em>Linux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linux</em>'.
	 * @generated
	 */
	Linux createLinux();

	/**
	 * Returns a new object of class '<em>Mac OS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mac OS</em>'.
	 * @generated
	 */
	MacOS createMacOS();

	/**
	 * Returns a new object of class '<em>Target Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Middleware</em>'.
	 * @generated
	 */
	TargetMiddleware createTargetMiddleware();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetPlatformPackage getTargetPlatformPackage();

} //TargetPlatformFactory
