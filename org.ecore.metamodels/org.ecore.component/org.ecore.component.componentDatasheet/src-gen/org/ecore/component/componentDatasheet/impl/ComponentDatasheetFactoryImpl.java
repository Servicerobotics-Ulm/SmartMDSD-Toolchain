/**
 */
package org.ecore.component.componentDatasheet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.component.componentDatasheet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDatasheetFactoryImpl extends EFactoryImpl implements ComponentDatasheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentDatasheetFactory init() {
		try {
			ComponentDatasheetFactory theComponentDatasheetFactory = (ComponentDatasheetFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentDatasheetPackage.eNS_URI);
			if (theComponentDatasheetFactory != null) {
				return theComponentDatasheetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentDatasheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDatasheetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentDatasheetPackage.COMPONENT_DATASHEET:
			return createComponentDatasheet();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDatasheet createComponentDatasheet() {
		ComponentDatasheetImpl componentDatasheet = new ComponentDatasheetImpl();
		return componentDatasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDatasheetPackage getComponentDatasheetPackage() {
		return (ComponentDatasheetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentDatasheetPackage getPackage() {
		return ComponentDatasheetPackage.eINSTANCE;
	}

} //ComponentDatasheetFactoryImpl
