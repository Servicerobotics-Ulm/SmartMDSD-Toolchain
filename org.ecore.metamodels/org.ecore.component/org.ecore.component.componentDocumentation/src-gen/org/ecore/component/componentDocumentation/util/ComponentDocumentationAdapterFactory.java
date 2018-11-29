/**
 */
package org.ecore.component.componentDocumentation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDocumentation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage
 * @generated
 */
public class ComponentDocumentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentDocumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentDocumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDocumentationSwitch<Adapter> modelSwitch = new ComponentDocumentationSwitch<Adapter>() {
		@Override
		public Adapter caseComponentDocumentation(ComponentDocumentation object) {
			return createComponentDocumentationAdapter();
		}

		@Override
		public Adapter caseAbstractComponentDocuElement(AbstractComponentDocuElement object) {
			return createAbstractComponentDocuElementAdapter();
		}

		@Override
		public Adapter caseComponentServiceDocu(ComponentServiceDocu object) {
			return createComponentServiceDocuAdapter();
		}

		@Override
		public Adapter caseAbstractModeDocu(AbstractModeDocu object) {
			return createAbstractModeDocuAdapter();
		}

		@Override
		public Adapter caseComponentModeDocu(ComponentModeDocu object) {
			return createComponentModeDocuAdapter();
		}

		@Override
		public Adapter caseNeutralModeDocu(NeutralModeDocu object) {
			return createNeutralModeDocuAdapter();
		}

		@Override
		public Adapter caseCoordinationSlavePortDocu(CoordinationSlavePortDocu object) {
			return createCoordinationSlavePortDocuAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.ComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation
	 * @generated
	 */
	public Adapter createComponentDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement <em>Abstract Component Docu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.AbstractComponentDocuElement
	 * @generated
	 */
	public Adapter createAbstractComponentDocuElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.ComponentServiceDocu <em>Component Service Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.ComponentServiceDocu
	 * @generated
	 */
	public Adapter createComponentServiceDocuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.AbstractModeDocu <em>Abstract Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.AbstractModeDocu
	 * @generated
	 */
	public Adapter createAbstractModeDocuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.ComponentModeDocu <em>Component Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.ComponentModeDocu
	 * @generated
	 */
	public Adapter createComponentModeDocuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.NeutralModeDocu <em>Neutral Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.NeutralModeDocu
	 * @generated
	 */
	public Adapter createNeutralModeDocuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu <em>Coordination Slave Port Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu
	 * @generated
	 */
	public Adapter createCoordinationSlavePortDocuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentDocumentationAdapterFactory
