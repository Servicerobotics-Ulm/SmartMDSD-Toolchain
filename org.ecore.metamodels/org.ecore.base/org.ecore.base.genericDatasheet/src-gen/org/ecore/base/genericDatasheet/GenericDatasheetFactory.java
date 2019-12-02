/**
 */
package org.ecore.base.genericDatasheet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage
 * @generated
 */
public interface GenericDatasheetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDatasheetFactory eINSTANCE = org.ecore.base.genericDatasheet.impl.GenericDatasheetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Datasheet Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasheet Property</em>'.
	 * @generated
	 */
	DatasheetProperty createDatasheetProperty();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	GenericDatasheetModel createGenericDatasheetModel();

	/**
	 * Returns a new object of class '<em>Mandatory Datasheet Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Datasheet Element</em>'.
	 * @generated
	 */
	MandatoryDatasheetElement createMandatoryDatasheetElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericDatasheetPackage getGenericDatasheetPackage();

} //GenericDatasheetFactory
