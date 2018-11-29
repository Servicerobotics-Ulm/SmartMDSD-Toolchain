/**
 */
package org.ecore.component.performanceExtension.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.AbstractComponentLink;
import org.ecore.component.componentDefinition.ActivityExtension;
import org.ecore.component.componentDefinition.InputPortLink;

import org.ecore.component.performanceExtension.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage
 * @generated
 */
public class PerformanceExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformanceExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PerformanceExtensionPackage.eINSTANCE;
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
	protected PerformanceExtensionSwitch<Adapter> modelSwitch = new PerformanceExtensionSwitch<Adapter>() {
		@Override
		public Adapter caseActivationConstraints(ActivationConstraints object) {
			return createActivationConstraintsAdapter();
		}

		@Override
		public Adapter caseInputLinkExtension(InputLinkExtension object) {
			return createInputLinkExtensionAdapter();
		}

		@Override
		public Adapter caseDefaultTrigger(DefaultTrigger object) {
			return createDefaultTriggerAdapter();
		}

		@Override
		public Adapter caseDefaultInputTrigger(DefaultInputTrigger object) {
			return createDefaultInputTriggerAdapter();
		}

		@Override
		public Adapter caseDefaultPeriodicTimer(DefaultPeriodicTimer object) {
			return createDefaultPeriodicTimerAdapter();
		}

		@Override
		public Adapter caseDefaultObservedElementTrigger(DefaultObservedElementTrigger object) {
			return createDefaultObservedElementTriggerAdapter();
		}

		@Override
		public Adapter caseActivityExtension(ActivityExtension object) {
			return createActivityExtensionAdapter();
		}

		@Override
		public Adapter caseAbstractComponentLink(AbstractComponentLink object) {
			return createAbstractComponentLinkAdapter();
		}

		@Override
		public Adapter caseInputPortLink(InputPortLink object) {
			return createInputPortLinkAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.ActivationConstraints <em>Activation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.ActivationConstraints
	 * @generated
	 */
	public Adapter createActivationConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.InputLinkExtension <em>Input Link Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.InputLinkExtension
	 * @generated
	 */
	public Adapter createInputLinkExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.DefaultTrigger <em>Default Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.DefaultTrigger
	 * @generated
	 */
	public Adapter createDefaultTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.DefaultInputTrigger <em>Default Input Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.DefaultInputTrigger
	 * @generated
	 */
	public Adapter createDefaultInputTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.DefaultPeriodicTimer <em>Default Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.DefaultPeriodicTimer
	 * @generated
	 */
	public Adapter createDefaultPeriodicTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.performanceExtension.DefaultObservedElementTrigger <em>Default Observed Element Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.performanceExtension.DefaultObservedElementTrigger
	 * @generated
	 */
	public Adapter createDefaultObservedElementTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ActivityExtension <em>Activity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ActivityExtension
	 * @generated
	 */
	public Adapter createActivityExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.AbstractComponentLink <em>Abstract Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.AbstractComponentLink
	 * @generated
	 */
	public Adapter createAbstractComponentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.InputPortLink <em>Input Port Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.InputPortLink
	 * @generated
	 */
	public Adapter createInputPortLinkAdapter() {
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

} //PerformanceExtensionAdapterFactory
