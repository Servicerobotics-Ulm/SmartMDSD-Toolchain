/**
 */
package org.ecore.system.datasheetPropertyChecks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage
 * @generated
 */
public interface DatasheetPropertyChecksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasheetPropertyChecksFactory eINSTANCE = org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>System Datasheet Property Checks Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Datasheet Property Checks Model</em>'.
	 * @generated
	 */
	SystemDatasheetPropertyChecksModel createSystemDatasheetPropertyChecksModel();

	/**
	 * Returns a new object of class '<em>Datasheet Property Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasheet Property Check</em>'.
	 * @generated
	 */
	DatasheetPropertyCheck createDatasheetPropertyCheck();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasheetPropertyChecksPackage getDatasheetPropertyChecksPackage();

} //DatasheetPropertyChecksFactory
