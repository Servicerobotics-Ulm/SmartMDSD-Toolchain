/**
 */
package org.eclipse.smartmdsd.ecore.base.documentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage
 * @generated
 */
public interface DocumentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentationFactory eINSTANCE = org.eclipse.smartmdsd.ecore.base.documentation.impl.DocumentationFactoryImpl
			.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocumentationPackage getDocumentationPackage();

} //DocumentationFactory
