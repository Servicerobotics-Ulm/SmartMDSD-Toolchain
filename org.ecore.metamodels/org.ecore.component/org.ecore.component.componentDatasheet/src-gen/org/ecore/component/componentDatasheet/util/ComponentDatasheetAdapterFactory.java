/**
 */
package org.ecore.component.componentDatasheet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.genericDatasheet.AbstractDatasheetElement;
import org.ecore.base.genericDatasheet.GenericDatasheetModel;

import org.ecore.component.componentDatasheet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage
 * @generated
 */
public class ComponentDatasheetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentDatasheetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDatasheetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentDatasheetPackage.eINSTANCE;
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
	protected ComponentDatasheetSwitch<Adapter> modelSwitch = new ComponentDatasheetSwitch<Adapter>() {
		@Override
		public Adapter caseComponentDatasheet(ComponentDatasheet object) {
			return createComponentDatasheetAdapter();
		}

		@Override
		public Adapter caseComponentPortDatasheet(ComponentPortDatasheet object) {
			return createComponentPortDatasheetAdapter();
		}

		@Override
		public Adapter caseGenericDatasheetModel(GenericDatasheetModel object) {
			return createGenericDatasheetModelAdapter();
		}

		@Override
		public Adapter caseAbstractDatasheetElement(AbstractDatasheetElement object) {
			return createAbstractDatasheetElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDatasheet.ComponentDatasheet <em>Component Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet
	 * @generated
	 */
	public Adapter createComponentDatasheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet <em>Component Port Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDatasheet.ComponentPortDatasheet
	 * @generated
	 */
	public Adapter createComponentPortDatasheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.genericDatasheet.GenericDatasheetModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetModel
	 * @generated
	 */
	public Adapter createGenericDatasheetModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.genericDatasheet.AbstractDatasheetElement <em>Abstract Datasheet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.genericDatasheet.AbstractDatasheetElement
	 * @generated
	 */
	public Adapter createAbstractDatasheetElementAdapter() {
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

} //ComponentDatasheetAdapterFactory
