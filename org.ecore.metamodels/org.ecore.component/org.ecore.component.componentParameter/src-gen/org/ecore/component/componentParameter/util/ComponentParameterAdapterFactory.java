/**
 */
package org.ecore.component.componentParameter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.AbstractComponentElement;
import org.ecore.component.componentDefinition.DerivedComponentElement;
import org.ecore.component.componentParameter.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentParameter.ComponentParameterPackage
 * @generated
 */
public class ComponentParameterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentParameterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentParameterPackage.eINSTANCE;
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
	protected ComponentParameterSwitch<Adapter> modelSwitch = new ComponentParameterSwitch<Adapter>() {
		@Override
		public Adapter caseComponentParameter(ComponentParameter object) {
			return createComponentParameterAdapter();
		}

		@Override
		public Adapter caseAbstractComponentParameter(AbstractComponentParameter object) {
			return createAbstractComponentParameterAdapter();
		}

		@Override
		public Adapter caseComponentParameterBase(ComponentParameterBase object) {
			return createComponentParameterBaseAdapter();
		}

		@Override
		public Adapter caseInternalParameter(InternalParameter object) {
			return createInternalParameterAdapter();
		}

		@Override
		public Adapter caseExtendedParameter(ExtendedParameter object) {
			return createExtendedParameterAdapter();
		}

		@Override
		public Adapter caseExtendedTrigger(ExtendedTrigger object) {
			return createExtendedTriggerAdapter();
		}

		@Override
		public Adapter caseParameterSetInstance(ParameterSetInstance object) {
			return createParameterSetInstanceAdapter();
		}

		@Override
		public Adapter caseAbstractParameterInstance(AbstractParameterInstance object) {
			return createAbstractParameterInstanceAdapter();
		}

		@Override
		public Adapter caseTriggerInstance(TriggerInstance object) {
			return createTriggerInstanceAdapter();
		}

		@Override
		public Adapter caseParameterInstance(ParameterInstance object) {
			return createParameterInstanceAdapter();
		}

		@Override
		public Adapter caseComponentParamModel(ComponentParamModel object) {
			return createComponentParamModelAdapter();
		}

		@Override
		public Adapter caseComponentParametersRef(ComponentParametersRef object) {
			return createComponentParametersRefAdapter();
		}

		@Override
		public Adapter caseAbstractComponentElement(AbstractComponentElement object) {
			return createAbstractComponentElementAdapter();
		}

		@Override
		public Adapter caseDerivedComponentElement(DerivedComponentElement object) {
			return createDerivedComponentElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ComponentParameter <em>Component Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ComponentParameter
	 * @generated
	 */
	public Adapter createComponentParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.AbstractComponentParameter <em>Abstract Component Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.AbstractComponentParameter
	 * @generated
	 */
	public Adapter createAbstractComponentParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ComponentParameterBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ComponentParameterBase
	 * @generated
	 */
	public Adapter createComponentParameterBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.InternalParameter <em>Internal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.InternalParameter
	 * @generated
	 */
	public Adapter createInternalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ExtendedParameter <em>Extended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ExtendedParameter
	 * @generated
	 */
	public Adapter createExtendedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ExtendedTrigger <em>Extended Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ExtendedTrigger
	 * @generated
	 */
	public Adapter createExtendedTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ParameterSetInstance <em>Parameter Set Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ParameterSetInstance
	 * @generated
	 */
	public Adapter createParameterSetInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.AbstractParameterInstance <em>Abstract Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.AbstractParameterInstance
	 * @generated
	 */
	public Adapter createAbstractParameterInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.TriggerInstance
	 * @generated
	 */
	public Adapter createTriggerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ParameterInstance <em>Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ParameterInstance
	 * @generated
	 */
	public Adapter createParameterInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ComponentParamModel <em>Component Param Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ComponentParamModel
	 * @generated
	 */
	public Adapter createComponentParamModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentParameter.ComponentParametersRef <em>Component Parameters Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentParameter.ComponentParametersRef
	 * @generated
	 */
	public Adapter createComponentParametersRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.AbstractComponentElement <em>Abstract Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.AbstractComponentElement
	 * @generated
	 */
	public Adapter createAbstractComponentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.DerivedComponentElement <em>Derived Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.DerivedComponentElement
	 * @generated
	 */
	public Adapter createDerivedComponentElementAdapter() {
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

} //ComponentParameterAdapterFactory
