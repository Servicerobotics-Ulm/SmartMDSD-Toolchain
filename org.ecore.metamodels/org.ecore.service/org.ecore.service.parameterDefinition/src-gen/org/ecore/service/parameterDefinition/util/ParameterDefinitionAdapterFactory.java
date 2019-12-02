/**
 */
package org.ecore.service.parameterDefinition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.service.parameterDefinition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage
 * @generated
 */
public class ParameterDefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParameterDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ParameterDefinitionPackage.eINSTANCE;
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
	protected ParameterDefinitionSwitch<Adapter> modelSwitch = new ParameterDefinitionSwitch<Adapter>() {
		@Override
		public Adapter caseParamDefModel(ParamDefModel object) {
			return createParamDefModelAdapter();
		}

		@Override
		public Adapter caseParameterSetRepository(ParameterSetRepository object) {
			return createParameterSetRepositoryAdapter();
		}

		@Override
		public Adapter caseParameterSetDefinition(ParameterSetDefinition object) {
			return createParameterSetDefinitionAdapter();
		}

		@Override
		public Adapter caseAbstractParameter(AbstractParameter object) {
			return createAbstractParameterAdapter();
		}

		@Override
		public Adapter caseParameterDefinition(ParameterDefinition object) {
			return createParameterDefinitionAdapter();
		}

		@Override
		public Adapter caseTriggerDefinition(TriggerDefinition object) {
			return createTriggerDefinitionAdapter();
		}

		@Override
		public Adapter caseParamDefRepoImport(ParamDefRepoImport object) {
			return createParamDefRepoImportAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentedElement(AbstractDocumentedElement object) {
			return createAbstractDocumentedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.ParamDefModel <em>Param Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.ParamDefModel
	 * @generated
	 */
	public Adapter createParamDefModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.ParameterSetRepository <em>Parameter Set Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.ParameterSetRepository
	 * @generated
	 */
	public Adapter createParameterSetRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition <em>Parameter Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.ParameterSetDefinition
	 * @generated
	 */
	public Adapter createParameterSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.AbstractParameter
	 * @generated
	 */
	public Adapter createAbstractParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.TriggerDefinition
	 * @generated
	 */
	public Adapter createTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.parameterDefinition.ParamDefRepoImport <em>Param Def Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.parameterDefinition.ParamDefRepoImport
	 * @generated
	 */
	public Adapter createParamDefRepoImportAdapter() {
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

} //ParameterDefinitionAdapterFactory
