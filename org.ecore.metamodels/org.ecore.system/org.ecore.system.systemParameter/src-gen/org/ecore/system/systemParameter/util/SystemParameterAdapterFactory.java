/**
 */
package org.ecore.system.systemParameter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.ecore.system.systemParameter.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.systemParameter.SystemParameterPackage
 * @generated
 */
public class SystemParameterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemParameterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParameterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemParameterPackage.eINSTANCE;
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
	protected SystemParameterSwitch<Adapter> modelSwitch = new SystemParameterSwitch<Adapter>() {
		@Override
		public Adapter caseSystemParamModel(SystemParamModel object) {
			return createSystemParamModelAdapter();
		}

		@Override
		public Adapter caseComponentParameterInstance(ComponentParameterInstance object) {
			return createComponentParameterInstanceAdapter();
		}

		@Override
		public Adapter caseParameterRefinement(ParameterRefinement object) {
			return createParameterRefinementAdapter();
		}

		@Override
		public Adapter caseParameterStructInstance(ParameterStructInstance object) {
			return createParameterStructInstanceAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentedElement(AbstractDocumentedElement object) {
			return createAbstractDocumentedElementAdapter();
		}

		@Override
		public Adapter caseComponentInstanceExtension(ComponentInstanceExtension object) {
			return createComponentInstanceExtensionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.system.systemParameter.SystemParamModel <em>System Param Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.systemParameter.SystemParamModel
	 * @generated
	 */
	public Adapter createSystemParamModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.systemParameter.ComponentParameterInstance <em>Component Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance
	 * @generated
	 */
	public Adapter createComponentParameterInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.systemParameter.ParameterRefinement <em>Parameter Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.systemParameter.ParameterRefinement
	 * @generated
	 */
	public Adapter createParameterRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.systemParameter.ParameterStructInstance <em>Parameter Struct Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.systemParameter.ParameterStructInstance
	 * @generated
	 */
	public Adapter createParameterStructInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.documentation.AbstractDocumentedElement <em>Abstract Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.documentation.AbstractDocumentedElement
	 * @generated
	 */
	public Adapter createAbstractDocumentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.system.componentArchitecture.ComponentInstanceExtension <em>Component Instance Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.system.componentArchitecture.ComponentInstanceExtension
	 * @generated
	 */
	public Adapter createComponentInstanceExtensionAdapter() {
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

} //SystemParameterAdapterFactory
