/**
 */
package org.ecore.component.componentDocumentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.component.componentDocumentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDocumentationFactoryImpl extends EFactoryImpl implements ComponentDocumentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentDocumentationFactory init() {
		try {
			ComponentDocumentationFactory theComponentDocumentationFactory = (ComponentDocumentationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentDocumentationPackage.eNS_URI);
			if (theComponentDocumentationFactory != null) {
				return theComponentDocumentationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentDocumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationFactoryImpl() {
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION:
			return createComponentDocumentation();
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU:
			return createComponentServiceDocu();
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU:
			return createComponentModeDocu();
		case ComponentDocumentationPackage.NEUTRAL_MODE_DOCU:
			return createNeutralModeDocu();
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU:
			return createCoordinationSlavePortDocu();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentation createComponentDocumentation() {
		ComponentDocumentationImpl componentDocumentation = new ComponentDocumentationImpl();
		return componentDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentServiceDocu createComponentServiceDocu() {
		ComponentServiceDocuImpl componentServiceDocu = new ComponentServiceDocuImpl();
		return componentServiceDocu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModeDocu createComponentModeDocu() {
		ComponentModeDocuImpl componentModeDocu = new ComponentModeDocuImpl();
		return componentModeDocu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutralModeDocu createNeutralModeDocu() {
		NeutralModeDocuImpl neutralModeDocu = new NeutralModeDocuImpl();
		return neutralModeDocu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePortDocu createCoordinationSlavePortDocu() {
		CoordinationSlavePortDocuImpl coordinationSlavePortDocu = new CoordinationSlavePortDocuImpl();
		return coordinationSlavePortDocu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationPackage getComponentDocumentationPackage() {
		return (ComponentDocumentationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentDocumentationPackage getPackage() {
		return ComponentDocumentationPackage.eINSTANCE;
	}

} //ComponentDocumentationFactoryImpl
