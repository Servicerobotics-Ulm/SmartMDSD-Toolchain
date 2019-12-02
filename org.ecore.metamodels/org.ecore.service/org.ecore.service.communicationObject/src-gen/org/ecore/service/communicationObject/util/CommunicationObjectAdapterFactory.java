/**
 */
package org.ecore.service.communicationObject.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.basicAttributes.AbstractAttributeType;
import org.ecore.base.basicAttributes.AbstractValue;
import org.ecore.base.basicAttributes.SingleValue;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.service.communicationObject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.service.communicationObject.CommunicationObjectPackage
 * @generated
 */
public class CommunicationObjectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationObjectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObjectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationObjectPackage.eINSTANCE;
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
	protected CommunicationObjectSwitch<Adapter> modelSwitch = new CommunicationObjectSwitch<Adapter>() {
		@Override
		public Adapter caseCommObjectModel(CommObjectModel object) {
			return createCommObjectModelAdapter();
		}

		@Override
		public Adapter caseCommObjectsRepository(CommObjectsRepository object) {
			return createCommObjectsRepositoryAdapter();
		}

		@Override
		public Adapter caseAbstractCommElement(AbstractCommElement object) {
			return createAbstractCommElementAdapter();
		}

		@Override
		public Adapter caseCommRepositoryImport(CommRepositoryImport object) {
			return createCommRepositoryImportAdapter();
		}

		@Override
		public Adapter caseVersion(Version object) {
			return createVersionAdapter();
		}

		@Override
		public Adapter caseEnumeration(Enumeration object) {
			return createEnumerationAdapter();
		}

		@Override
		public Adapter caseCommunicationObject(CommunicationObject object) {
			return createCommunicationObjectAdapter();
		}

		@Override
		public Adapter caseCommElementValue(CommElementValue object) {
			return createCommElementValueAdapter();
		}

		@Override
		public Adapter caseCommElementReference(CommElementReference object) {
			return createCommElementReferenceAdapter();
		}

		@Override
		public Adapter caseAbstractDocumentedElement(AbstractDocumentedElement object) {
			return createAbstractDocumentedElementAdapter();
		}

		@Override
		public Adapter caseAbstractValue(AbstractValue object) {
			return createAbstractValueAdapter();
		}

		@Override
		public Adapter caseSingleValue(SingleValue object) {
			return createSingleValueAdapter();
		}

		@Override
		public Adapter caseAbstractAttributeType(AbstractAttributeType object) {
			return createAbstractAttributeTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommObjectModel <em>Comm Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommObjectModel
	 * @generated
	 */
	public Adapter createCommObjectModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommObjectsRepository <em>Comm Objects Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository
	 * @generated
	 */
	public Adapter createCommObjectsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.AbstractCommElement <em>Abstract Comm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.AbstractCommElement
	 * @generated
	 */
	public Adapter createAbstractCommElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommRepositoryImport <em>Comm Repository Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommRepositoryImport
	 * @generated
	 */
	public Adapter createCommRepositoryImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommunicationObject <em>Communication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommunicationObject
	 * @generated
	 */
	public Adapter createCommunicationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommElementValue <em>Comm Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommElementValue
	 * @generated
	 */
	public Adapter createCommElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.service.communicationObject.CommElementReference <em>Comm Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.service.communicationObject.CommElementReference
	 * @generated
	 */
	public Adapter createCommElementReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.ecore.base.basicAttributes.AbstractValue <em>Abstract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.basicAttributes.AbstractValue
	 * @generated
	 */
	public Adapter createAbstractValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.basicAttributes.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.basicAttributes.SingleValue
	 * @generated
	 */
	public Adapter createSingleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ecore.base.basicAttributes.AbstractAttributeType <em>Abstract Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ecore.base.basicAttributes.AbstractAttributeType
	 * @generated
	 */
	public Adapter createAbstractAttributeTypeAdapter() {
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

} //CommunicationObjectAdapterFactory
