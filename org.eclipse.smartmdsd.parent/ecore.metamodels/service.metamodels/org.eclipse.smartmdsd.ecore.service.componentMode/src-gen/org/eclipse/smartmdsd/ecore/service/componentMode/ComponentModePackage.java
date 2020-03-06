/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.service.componentMode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentModePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentMode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/service/componentMode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentMode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentModePackage eINSTANCE = org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeModelImpl
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeModel()
	 * @generated
	 */
	int COMPONENT_MODE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_MODEL__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeRepositoryImpl
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeRepository()
	 * @generated
	 */
	int COMPONENT_MODE_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_REPOSITORY__COLLECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeCollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeCollectionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeCollection()
	 * @generated
	 */
	int COMPONENT_MODE_COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_COLLECTION__MODES = 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeDefinition()
	 * @generated
	 */
	int COMPONENT_MODE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel
	 * @generated
	 */
	EClass getComponentModeModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository()
	 * @see #getComponentModeModel()
	 * @generated
	 */
	EReference getComponentModeModel_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository
	 * @generated
	 */
	EClass getComponentModeRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository#getName()
	 * @see #getComponentModeRepository()
	 * @generated
	 */
	EAttribute getComponentModeRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository#getCollections()
	 * @see #getComponentModeRepository()
	 * @generated
	 */
	EReference getComponentModeRepository_Collections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection
	 * @generated
	 */
	EClass getComponentModeCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection#getName()
	 * @see #getComponentModeCollection()
	 * @generated
	 */
	EAttribute getComponentModeCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection#getModes()
	 * @see #getComponentModeCollection()
	 * @generated
	 */
	EReference getComponentModeCollection_Modes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition
	 * @generated
	 */
	EClass getComponentModeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition#getName()
	 * @see #getComponentModeDefinition()
	 * @generated
	 */
	EAttribute getComponentModeDefinition_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentModeFactory getComponentModeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeModelImpl
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeModel()
		 * @generated
		 */
		EClass COMPONENT_MODE_MODEL = eINSTANCE.getComponentModeModel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODE_MODEL__REPOSITORY = eINSTANCE.getComponentModeModel_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeRepositoryImpl
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeRepository()
		 * @generated
		 */
		EClass COMPONENT_MODE_REPOSITORY = eINSTANCE.getComponentModeRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_MODE_REPOSITORY__NAME = eINSTANCE.getComponentModeRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODE_REPOSITORY__COLLECTIONS = eINSTANCE.getComponentModeRepository_Collections();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeCollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeCollectionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeCollection()
		 * @generated
		 */
		EClass COMPONENT_MODE_COLLECTION = eINSTANCE.getComponentModeCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_MODE_COLLECTION__NAME = eINSTANCE.getComponentModeCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODE_COLLECTION__MODES = eINSTANCE.getComponentModeCollection_Modes();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModeDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.componentMode.impl.ComponentModePackageImpl#getComponentModeDefinition()
		 * @generated
		 */
		EClass COMPONENT_MODE_DEFINITION = eINSTANCE.getComponentModeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_MODE_DEFINITION__NAME = eINSTANCE.getComponentModeDefinition_Name();

	}

} //ComponentModePackage
