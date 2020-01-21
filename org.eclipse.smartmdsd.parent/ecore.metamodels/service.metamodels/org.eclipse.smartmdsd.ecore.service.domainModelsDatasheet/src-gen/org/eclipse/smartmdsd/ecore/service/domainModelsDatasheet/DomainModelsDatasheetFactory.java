/**
 */
package org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage
 * @generated
 */
public interface DomainModelsDatasheetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainModelsDatasheetFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Domain Models Datasheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Models Datasheet</em>'.
	 * @generated
	 */
	DomainModelsDatasheet createDomainModelsDatasheet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainModelsDatasheetPackage getDomainModelsDatasheetPackage();

} //DomainModelsDatasheetFactory
