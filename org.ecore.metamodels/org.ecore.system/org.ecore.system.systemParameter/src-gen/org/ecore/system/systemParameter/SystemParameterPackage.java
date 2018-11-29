/**
 */
package org.ecore.system.systemParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.system.systemParameter.SystemParameterFactory
 * @model kind="package"
 * @generated
 */
public interface SystemParameterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systemParameter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/SystemParameter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SystemParameter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemParameterPackage eINSTANCE = org.ecore.system.systemParameter.impl.SystemParameterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.systemParameter.impl.SystemParamModelImpl <em>System Param Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.systemParameter.impl.SystemParamModelImpl
	 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getSystemParamModel()
	 * @generated
	 */
	int SYSTEM_PARAM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_MODEL__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>System Param Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl <em>Component Parameter Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl
	 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getComponentParameterInstance()
	 * @generated
	 */
	int COMPONENT_PARAMETER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_INSTANCE__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_INSTANCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Component Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM = 3;

	/**
	 * The number of structural features of the '<em>Component Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ecore.system.systemParameter.impl.ParameterRefinementImpl <em>Parameter Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.systemParameter.impl.ParameterRefinementImpl
	 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getParameterRefinement()
	 * @generated
	 */
	int PARAMETER_REFINEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFINEMENT__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFINEMENT__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Parameter Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFINEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl <em>Parameter Struct Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl
	 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getParameterStructInstance()
	 * @generated
	 */
	int PARAMETER_STRUCT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_INSTANCE__PARAMETER = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_INSTANCE__NAME = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Struct Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_INSTANCE_FEATURE_COUNT = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 2;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.systemParameter.SystemParamModel <em>System Param Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Param Model</em>'.
	 * @see org.ecore.system.systemParameter.SystemParamModel
	 * @generated
	 */
	EClass getSystemParamModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.systemParameter.SystemParamModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.ecore.system.systemParameter.SystemParamModel#getComponents()
	 * @see #getSystemParamModel()
	 * @generated
	 */
	EReference getSystemParamModel_Components();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.systemParameter.SystemParamModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.ecore.system.systemParameter.SystemParamModel#getSystem()
	 * @see #getSystemParamModel()
	 * @generated
	 */
	EReference getSystemParamModel_System();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.systemParameter.SystemParamModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.systemParameter.SystemParamModel#getName()
	 * @see #getSystemParamModel()
	 * @generated
	 */
	EAttribute getSystemParamModel_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.systemParameter.ComponentParameterInstance <em>Component Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Parameter Instance</em>'.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance
	 * @generated
	 */
	EClass getComponentParameterInstance();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.systemParameter.ComponentParameterInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance#getComponentInstance()
	 * @see #getComponentParameterInstance()
	 * @generated
	 */
	EReference getComponentParameterInstance_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.systemParameter.ComponentParameterInstance#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance#getParameters()
	 * @see #getComponentParameterInstance()
	 * @generated
	 */
	EReference getComponentParameterInstance_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.systemParameter.ComponentParameterInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance#getName()
	 * @see #getComponentParameterInstance()
	 * @generated
	 */
	EAttribute getComponentParameterInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.systemParameter.ComponentParameterInstance#getComponentParam <em>Component Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Param</em>'.
	 * @see org.ecore.system.systemParameter.ComponentParameterInstance#getComponentParam()
	 * @see #getComponentParameterInstance()
	 * @generated
	 */
	EReference getComponentParameterInstance_ComponentParam();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.systemParameter.ParameterRefinement <em>Parameter Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Refinement</em>'.
	 * @see org.ecore.system.systemParameter.ParameterRefinement
	 * @generated
	 */
	EClass getParameterRefinement();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.systemParameter.ParameterRefinement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.ecore.system.systemParameter.ParameterRefinement#getParameter()
	 * @see #getParameterRefinement()
	 * @generated
	 */
	EReference getParameterRefinement_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.systemParameter.ParameterRefinement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.ecore.system.systemParameter.ParameterRefinement#getAttributes()
	 * @see #getParameterRefinement()
	 * @generated
	 */
	EReference getParameterRefinement_Attributes();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.systemParameter.ParameterStructInstance <em>Parameter Struct Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Instance</em>'.
	 * @see org.ecore.system.systemParameter.ParameterStructInstance
	 * @generated
	 */
	EClass getParameterStructInstance();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.systemParameter.ParameterStructInstance#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.ecore.system.systemParameter.ParameterStructInstance#getParameter()
	 * @see #getParameterStructInstance()
	 * @generated
	 */
	EReference getParameterStructInstance_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.systemParameter.ParameterStructInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.systemParameter.ParameterStructInstance#getName()
	 * @see #getParameterStructInstance()
	 * @generated
	 */
	EAttribute getParameterStructInstance_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemParameterFactory getSystemParameterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.system.systemParameter.impl.SystemParamModelImpl <em>System Param Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.systemParameter.impl.SystemParamModelImpl
		 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getSystemParamModel()
		 * @generated
		 */
		EClass SYSTEM_PARAM_MODEL = eINSTANCE.getSystemParamModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PARAM_MODEL__COMPONENTS = eINSTANCE.getSystemParamModel_Components();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PARAM_MODEL__SYSTEM = eINSTANCE.getSystemParamModel_System();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PARAM_MODEL__NAME = eINSTANCE.getSystemParamModel_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl <em>Component Parameter Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.systemParameter.impl.ComponentParameterInstanceImpl
		 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getComponentParameterInstance()
		 * @generated
		 */
		EClass COMPONENT_PARAMETER_INSTANCE = eINSTANCE.getComponentParameterInstance();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE = eINSTANCE
				.getComponentParameterInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_INSTANCE__PARAMETERS = eINSTANCE.getComponentParameterInstance_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PARAMETER_INSTANCE__NAME = eINSTANCE.getComponentParameterInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM = eINSTANCE
				.getComponentParameterInstance_ComponentParam();

		/**
		 * The meta object literal for the '{@link org.ecore.system.systemParameter.impl.ParameterRefinementImpl <em>Parameter Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.systemParameter.impl.ParameterRefinementImpl
		 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getParameterRefinement()
		 * @generated
		 */
		EClass PARAMETER_REFINEMENT = eINSTANCE.getParameterRefinement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFINEMENT__PARAMETER = eINSTANCE.getParameterRefinement_Parameter();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFINEMENT__ATTRIBUTES = eINSTANCE.getParameterRefinement_Attributes();

		/**
		 * The meta object literal for the '{@link org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl <em>Parameter Struct Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.systemParameter.impl.ParameterStructInstanceImpl
		 * @see org.ecore.system.systemParameter.impl.SystemParameterPackageImpl#getParameterStructInstance()
		 * @generated
		 */
		EClass PARAMETER_STRUCT_INSTANCE = eINSTANCE.getParameterStructInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT_INSTANCE__PARAMETER = eINSTANCE.getParameterStructInstance_Parameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRUCT_INSTANCE__NAME = eINSTANCE.getParameterStructInstance_Name();

	}

} //SystemParameterPackage
