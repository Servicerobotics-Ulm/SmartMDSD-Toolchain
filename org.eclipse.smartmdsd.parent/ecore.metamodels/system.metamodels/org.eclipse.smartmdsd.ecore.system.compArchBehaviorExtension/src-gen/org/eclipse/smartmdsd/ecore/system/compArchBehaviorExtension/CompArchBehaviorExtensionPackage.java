/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;

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
 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface CompArchBehaviorExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compArchBehaviorExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/system/compArchBehaviorExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compArchBehaviorExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompArchBehaviorExtensionPackage eINSTANCE = org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl <em>Coordination Module Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getCoordinationModuleMapping()
	 * @generated
	 */
	int COORDINATION_MODULE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Coord Module Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_MAPPING__COORD_MODULE_INST = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Coord Mod Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_MAPPING__COORD_MOD_REAL = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coord Inter Comp Inst Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Coordination Module Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_MAPPING_FEATURE_COUNT = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Coordination Module Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_MAPPING_OPERATION_COUNT = ComponentArchitecturePackage.SYSTEM_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl <em>Coordination Interface Component Instance Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getCoordinationInterfaceComponentInstanceMapping()
	 * @generated
	 */
	int COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST = 0;

	/**
	 * The feature id for the '<em><b>Coord Inter Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST = 1;

	/**
	 * The number of structural features of the '<em>Coordination Interface Component Instance Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordination Interface Component Instance Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.TaskRealizationModelRefImpl <em>Task Realization Model Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.TaskRealizationModelRefImpl
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getTaskRealizationModelRef()
	 * @generated
	 */
	int TASK_REALIZATION_MODEL_REF = 2;

	/**
	 * The feature id for the '<em><b>Task Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Realization Model Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL_REF_FEATURE_COUNT = ComponentArchitecturePackage.SYSTEM_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Realization Model Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL_REF_OPERATION_COUNT = ComponentArchitecturePackage.SYSTEM_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping <em>Coordination Module Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Module Mapping</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping
	 * @generated
	 */
	EClass getCoordinationModuleMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModuleInst <em>Coord Module Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Module Inst</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModuleInst()
	 * @see #getCoordinationModuleMapping()
	 * @generated
	 */
	EReference getCoordinationModuleMapping_CoordModuleInst();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModReal <em>Coord Mod Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Mod Real</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordModReal()
	 * @see #getCoordinationModuleMapping()
	 * @generated
	 */
	EReference getCoordinationModuleMapping_CoordModReal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordInterCompInstMapping <em>Coord Inter Comp Inst Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coord Inter Comp Inst Mapping</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping#getCoordInterCompInstMapping()
	 * @see #getCoordinationModuleMapping()
	 * @generated
	 */
	EReference getCoordinationModuleMapping_CoordInterCompInstMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping <em>Coordination Interface Component Instance Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Interface Component Instance Mapping</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping
	 * @generated
	 */
	EClass getCoordinationInterfaceComponentInstanceMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCompInst <em>Comp Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Inst</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCompInst()
	 * @see #getCoordinationInterfaceComponentInstanceMapping()
	 * @generated
	 */
	EReference getCoordinationInterfaceComponentInstanceMapping_CompInst();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCoordInterInst <em>Coord Inter Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Inter Inst</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCoordInterInst()
	 * @see #getCoordinationInterfaceComponentInstanceMapping()
	 * @generated
	 */
	EReference getCoordinationInterfaceComponentInstanceMapping_CoordInterInst();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef <em>Task Realization Model Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Realization Model Ref</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef
	 * @generated
	 */
	EClass getTaskRealizationModelRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef <em>Task Model Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Model Ref</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef()
	 * @see #getTaskRealizationModelRef()
	 * @generated
	 */
	EReference getTaskRealizationModelRef_TaskModelRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompArchBehaviorExtensionFactory getCompArchBehaviorExtensionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl <em>Coordination Module Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationModuleMappingImpl
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getCoordinationModuleMapping()
		 * @generated
		 */
		EClass COORDINATION_MODULE_MAPPING = eINSTANCE.getCoordinationModuleMapping();

		/**
		 * The meta object literal for the '<em><b>Coord Module Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_MAPPING__COORD_MODULE_INST = eINSTANCE
				.getCoordinationModuleMapping_CoordModuleInst();

		/**
		 * The meta object literal for the '<em><b>Coord Mod Real</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_MAPPING__COORD_MOD_REAL = eINSTANCE.getCoordinationModuleMapping_CoordModReal();

		/**
		 * The meta object literal for the '<em><b>Coord Inter Comp Inst Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING = eINSTANCE
				.getCoordinationModuleMapping_CoordInterCompInstMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl <em>Coordination Interface Component Instance Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CoordinationInterfaceComponentInstanceMappingImpl
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getCoordinationInterfaceComponentInstanceMapping()
		 * @generated
		 */
		EClass COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING = eINSTANCE
				.getCoordinationInterfaceComponentInstanceMapping();

		/**
		 * The meta object literal for the '<em><b>Comp Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST = eINSTANCE
				.getCoordinationInterfaceComponentInstanceMapping_CompInst();

		/**
		 * The meta object literal for the '<em><b>Coord Inter Inst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST = eINSTANCE
				.getCoordinationInterfaceComponentInstanceMapping_CoordInterInst();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.TaskRealizationModelRefImpl <em>Task Realization Model Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.TaskRealizationModelRefImpl
		 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionPackageImpl#getTaskRealizationModelRef()
		 * @generated
		 */
		EClass TASK_REALIZATION_MODEL_REF = eINSTANCE.getTaskRealizationModelRef();

		/**
		 * The meta object literal for the '<em><b>Task Model Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF = eINSTANCE.getTaskRealizationModelRef_TaskModelRef();

	}

} //CompArchBehaviorExtensionPackage
