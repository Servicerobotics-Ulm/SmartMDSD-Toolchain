/**
 */
package org.ecore.base.mixedport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.base.mixedport.MixedportPackage
 * @generated
 */
public interface MixedportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MixedportFactory eINSTANCE = org.ecore.base.mixedport.impl.MixedportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mixed Port Opc Ua Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port Opc Ua Base</em>'.
	 * @generated
	 */
	MixedPortOpcUaBase createMixedPortOpcUaBase();

	/**
	 * Returns a new object of class '<em>Mixed Port ROS Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port ROS Base</em>'.
	 * @generated
	 */
	MixedPortROSBase createMixedPortROSBase();

	/**
	 * Returns a new object of class '<em>Mixed Port YARP Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Port YARP Base</em>'.
	 * @generated
	 */
	MixedPortYARPBase createMixedPortYARPBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MixedportPackage getMixedportPackage();

} //MixedportFactory
