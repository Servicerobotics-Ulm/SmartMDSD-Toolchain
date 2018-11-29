/**
 */
package org.ecore.component.componentDefinition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage
 * @generated
 */
public class ComponentDefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentDefinitionPackage.eINSTANCE;
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
	protected ComponentDefinitionSwitch<Adapter> modelSwitch = new ComponentDefinitionSwitch<Adapter>() {
		@Override
		public Adapter caseComponentDefModel(ComponentDefModel object) {
			return createComponentDefModelAdapter();
		}

		@Override
		public Adapter caseComponentDefinition(ComponentDefinition object) {
			return createComponentDefinitionAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseActivityExtension(ActivityExtension object) {
			return createActivityExtensionAdapter();
		}

		@Override
		public Adapter caseInputHandler(InputHandler object) {
			return createInputHandlerAdapter();
		}

		@Override
		public Adapter caseServiceRepoImport(ServiceRepoImport object) {
			return createServiceRepoImportAdapter();
		}

		@Override
		public Adapter caseOutputPort(OutputPort object) {
			return createOutputPortAdapter();
		}

		@Override
		public Adapter caseRequestPort(RequestPort object) {
			return createRequestPortAdapter();
		}

		@Override
		public Adapter caseInputPort(InputPort object) {
			return createInputPortAdapter();
		}

		@Override
		public Adapter caseAnswerPort(AnswerPort object) {
			return createAnswerPortAdapter();
		}

		@Override
		public Adapter caseComponentPort(ComponentPort object) {
			return createComponentPortAdapter();
		}

		@Override
		public Adapter caseComponentPortExtension(ComponentPortExtension object) {
			return createComponentPortExtensionAdapter();
		}

		@Override
		public Adapter caseRequestHandler(RequestHandler object) {
			return createRequestHandlerAdapter();
		}

		@Override
		public Adapter caseAbstractComponentElement(AbstractComponentElement object) {
			return createAbstractComponentElementAdapter();
		}

		@Override
		public Adapter caseComponentSubNode(ComponentSubNode object) {
			return createComponentSubNodeAdapter();
		}

		@Override
		public Adapter caseComponentSubNodeObserver(ComponentSubNodeObserver object) {
			return createComponentSubNodeObserverAdapter();
		}

		@Override
		public Adapter caseInputPortLink(InputPortLink object) {
			return createInputPortLinkAdapter();
		}

		@Override
		public Adapter caseRequestPortLink(RequestPortLink object) {
			return createRequestPortLinkAdapter();
		}

		@Override
		public Adapter caseAbstractComponentLink(AbstractComponentLink object) {
			return createAbstractComponentLinkAdapter();
		}

		@Override
		public Adapter caseNamedComponentElement(NamedComponentElement object) {
			return createNamedComponentElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentDefModel <em>Component Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentDefModel
	 * @generated
	 */
	public Adapter createComponentDefModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentDefinition
	 * @generated
	 */
	public Adapter createComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.InputHandler <em>Input Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.InputHandler
	 * @generated
	 */
	public Adapter createInputHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ServiceRepoImport <em>Service Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ServiceRepoImport
	 * @generated
	 */
	public Adapter createServiceRepoImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.RequestPort <em>Request Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.RequestPort
	 * @generated
	 */
	public Adapter createRequestPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.AnswerPort <em>Answer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.AnswerPort
	 * @generated
	 */
	public Adapter createAnswerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentPort
	 * @generated
	 */
	public Adapter createComponentPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentPortExtension <em>Component Port Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentPortExtension
	 * @generated
	 */
	public Adapter createComponentPortExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.RequestHandler <em>Request Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.RequestHandler
	 * @generated
	 */
	public Adapter createRequestHandlerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentSubNode <em>Component Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentSubNode
	 * @generated
	 */
	public Adapter createComponentSubNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.ComponentSubNodeObserver <em>Component Sub Node Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.ComponentSubNodeObserver
	 * @generated
	 */
	public Adapter createComponentSubNodeObserverAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.RequestPortLink <em>Request Port Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.RequestPortLink
	 * @generated
	 */
	public Adapter createRequestPortLinkAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ecore.component.componentDefinition.NamedComponentElement <em>Named Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.component.componentDefinition.NamedComponentElement
	 * @generated
	 */
	public Adapter createNamedComponentElementAdapter() {
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

} //ComponentDefinitionAdapterFactory
