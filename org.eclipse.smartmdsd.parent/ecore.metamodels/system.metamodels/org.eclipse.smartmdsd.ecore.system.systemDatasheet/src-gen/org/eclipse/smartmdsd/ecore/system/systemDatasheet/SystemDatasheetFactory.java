/**
 */
package org.eclipse.smartmdsd.ecore.system.systemDatasheet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetPackage
 * @generated
 */
public interface SystemDatasheetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemDatasheetFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.systemDatasheet.impl.SystemDatasheetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>System Datasheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Datasheet</em>'.
	 * @generated
	 */
	SystemDatasheet createSystemDatasheet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemDatasheetPackage getSystemDatasheetPackage();

} //SystemDatasheetFactory
