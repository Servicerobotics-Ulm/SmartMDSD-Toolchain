/**
 */
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage
 * @generated
 */
public class RoboticMiddlewareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboticMiddlewarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticMiddlewareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RoboticMiddlewarePackage.eINSTANCE;
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
	protected RoboticMiddlewareSwitch<Adapter> modelSwitch = new RoboticMiddlewareSwitch<Adapter>() {
		@Override
		public Adapter caseRoboticMiddleware(RoboticMiddleware object) {
			return createRoboticMiddlewareAdapter();
		}

		@Override
		public Adapter caseACE_SmartSoft(ACE_SmartSoft object) {
			return createACE_SmartSoftAdapter();
		}

		@Override
		public Adapter caseOpcUa_SeRoNet(OpcUa_SeRoNet object) {
			return createOpcUa_SeRoNetAdapter();
		}

		@Override
		public Adapter caseCORBA_SmartSoft(CORBA_SmartSoft object) {
			return createCORBA_SmartSoftAdapter();
		}

		@Override
		public Adapter caseDDS_SmartSoft(DDS_SmartSoft object) {
			return createDDS_SmartSoftAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware <em>Robotic Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware
	 * @generated
	 */
	public Adapter createRoboticMiddlewareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft <em>ACE Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft
	 * @generated
	 */
	public Adapter createACE_SmartSoftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet <em>Opc Ua Se Ro Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet
	 * @generated
	 */
	public Adapter createOpcUa_SeRoNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.CORBA_SmartSoft <em>CORBA Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.CORBA_SmartSoft
	 * @generated
	 */
	public Adapter createCORBA_SmartSoftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft <em>DDS Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft
	 * @generated
	 */
	public Adapter createDDS_SmartSoftAdapter() {
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

} //RoboticMiddlewareAdapterFactory
