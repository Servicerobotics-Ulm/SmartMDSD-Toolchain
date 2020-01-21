/**
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage
 * @generated
 */
public class CauseEffectChainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CauseEffectChainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseEffectChainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CauseEffectChainPackage.eINSTANCE;
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
	protected CauseEffectChainSwitch<Adapter> modelSwitch = new CauseEffectChainSwitch<Adapter>() {
		@Override
		public Adapter caseCuaseEffectChainModel(CuaseEffectChainModel object) {
			return createCuaseEffectChainModelAdapter();
		}

		@Override
		public Adapter caseActivityChain(ActivityChain object) {
			return createActivityChainAdapter();
		}

		@Override
		public Adapter caseAbstractChainLink(AbstractChainLink object) {
			return createAbstractChainLinkAdapter();
		}

		@Override
		public Adapter caseActivityLink(ActivityLink object) {
			return createActivityLinkAdapter();
		}

		@Override
		public Adapter caseInputHandlerLink(InputHandlerLink object) {
			return createInputHandlerLinkAdapter();
		}

		@Override
		public Adapter caseMaxResponseTime(MaxResponseTime object) {
			return createMaxResponseTimeAdapter();
		}

		@Override
		public Adapter caseMinResponseTime(MinResponseTime object) {
			return createMinResponseTimeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.CuaseEffectChainModel <em>Cuase Effect Chain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CuaseEffectChainModel
	 * @generated
	 */
	public Adapter createCuaseEffectChainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityChain <em>Activity Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityChain
	 * @generated
	 */
	public Adapter createActivityChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.AbstractChainLink <em>Abstract Chain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.AbstractChainLink
	 * @generated
	 */
	public Adapter createAbstractChainLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink <em>Activity Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink
	 * @generated
	 */
	public Adapter createActivityLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.InputHandlerLink <em>Input Handler Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.InputHandlerLink
	 * @generated
	 */
	public Adapter createInputHandlerLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime <em>Max Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime
	 * @generated
	 */
	public Adapter createMaxResponseTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MinResponseTime <em>Min Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.MinResponseTime
	 * @generated
	 */
	public Adapter createMinResponseTimeAdapter() {
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

} //CauseEffectChainAdapterFactory
