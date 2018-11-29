/**
 */
package org.ecore.system.activityArchitecture.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.system.activityArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage
 * @generated
 */
public class ActivityArchitectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityArchitecturePackage.eINSTANCE;
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
	protected ActivityArchitectureSwitch<Adapter> modelSwitch = new ActivityArchitectureSwitch<Adapter>() {
		@Override
		public Adapter caseActivityArchitectureModel(ActivityArchitectureModel object) {
			return createActivityArchitectureModelAdapter();
		}

		@Override
		public Adapter caseAbstractSourceNode(AbstractSourceNode object) {
			return createAbstractSourceNodeAdapter();
		}

		@Override
		public Adapter caseActivityNode(ActivityNode object) {
			return createActivityNodeAdapter();
		}

		@Override
		public Adapter caseInputHandlerNode(InputHandlerNode object) {
			return createInputHandlerNodeAdapter();
		}

		@Override
		public Adapter caseAbstractInputNode(AbstractInputNode object) {
			return createAbstractInputNodeAdapter();
		}

		@Override
		public Adapter caseRegisterInputNode(RegisterInputNode object) {
			return createRegisterInputNodeAdapter();
		}

		@Override
		public Adapter caseTriggerInputNode(TriggerInputNode object) {
			return createTriggerInputNodeAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseActivationSource(ActivationSource object) {
			return createActivationSourceAdapter();
		}

		@Override
		public Adapter caseSporadic(Sporadic object) {
			return createSporadicAdapter();
		}

		@Override
		public Adapter caseDataTriggered(DataTriggered object) {
			return createDataTriggeredAdapter();
		}

		@Override
		public Adapter casePeriodicTimer(PeriodicTimer object) {
			return createPeriodicTimerAdapter();
		}

		@Override
		public Adapter caseCPUCore(CPUCore object) {
			return createCPUCoreAdapter();
		}

		@Override
		public Adapter caseScheduler(Scheduler object) {
			return createSchedulerAdapter();
		}

		@Override
		public Adapter caseExecutionTime(ExecutionTime object) {
			return createExecutionTimeAdapter();
		}

		@Override
		public Adapter caseTimeValue(TimeValue object) {
			return createTimeValueAdapter();
		}

		@Override
		public Adapter caseAbstractActivityArchitectureElement(AbstractActivityArchitectureElement object) {
			return createAbstractActivityArchitectureElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.ActivityArchitectureModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.ActivityArchitectureModel
	 * @generated
	 */
	public Adapter createActivityArchitectureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.AbstractSourceNode <em>Abstract Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.AbstractSourceNode
	 * @generated
	 */
	public Adapter createAbstractSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.InputHandlerNode <em>Input Handler Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.InputHandlerNode
	 * @generated
	 */
	public Adapter createInputHandlerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.AbstractInputNode <em>Abstract Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.AbstractInputNode
	 * @generated
	 */
	public Adapter createAbstractInputNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.RegisterInputNode <em>Register Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.RegisterInputNode
	 * @generated
	 */
	public Adapter createRegisterInputNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.TriggerInputNode <em>Trigger Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.TriggerInputNode
	 * @generated
	 */
	public Adapter createTriggerInputNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.ActivationSource <em>Activation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.ActivationSource
	 * @generated
	 */
	public Adapter createActivationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.Sporadic <em>Sporadic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.Sporadic
	 * @generated
	 */
	public Adapter createSporadicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.DataTriggered <em>Data Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.DataTriggered
	 * @generated
	 */
	public Adapter createDataTriggeredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.PeriodicTimer <em>Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.PeriodicTimer
	 * @generated
	 */
	public Adapter createPeriodicTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.CPUCore <em>CPU Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.CPUCore
	 * @generated
	 */
	public Adapter createCPUCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.ExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.ExecutionTime
	 * @generated
	 */
	public Adapter createExecutionTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.TimeValue
	 * @generated
	 */
	public Adapter createTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.activityArchitecture.AbstractActivityArchitectureElement <em>Abstract Activity Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.activityArchitecture.AbstractActivityArchitectureElement
	 * @generated
	 */
	public Adapter createAbstractActivityArchitectureElementAdapter() {
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

} //ActivityArchitectureAdapterFactory
