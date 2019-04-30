/**
 */
package org.ecore.base.mixedport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.ecore.base.mixedport.MixedportFactory
 * @model kind="package"
 * @generated
 */
public interface MixedportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mixedport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/base/mixedport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mixedport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MixedportPackage eINSTANCE = org.ecore.base.mixedport.impl.MixedportPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.base.mixedport.impl.AbstractMixedPortDefinitionImpl <em>Abstract Mixed Port Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.mixedport.impl.AbstractMixedPortDefinitionImpl
	 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getAbstractMixedPortDefinition()
	 * @generated
	 */
	int ABSTRACT_MIXED_PORT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXED_PORT_DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Mixed Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXED_PORT_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Mixed Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXED_PORT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.mixedport.impl.MixedPortOpcUaBaseImpl <em>Mixed Port Opc Ua Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.mixedport.impl.MixedPortOpcUaBaseImpl
	 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortOpcUaBase()
	 * @generated
	 */
	int MIXED_PORT_OPC_UA_BASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_OPC_UA_BASE__NAME = ABSTRACT_MIXED_PORT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Mixed Port Opc Ua Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_OPC_UA_BASE_FEATURE_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mixed Port Opc Ua Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_OPC_UA_BASE_OPERATION_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.mixedport.impl.MixedPortROSBaseImpl <em>Mixed Port ROS Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.mixedport.impl.MixedPortROSBaseImpl
	 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortROSBase()
	 * @generated
	 */
	int MIXED_PORT_ROS_BASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_BASE__NAME = ABSTRACT_MIXED_PORT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Mixed Port ROS Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_BASE_FEATURE_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mixed Port ROS Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_BASE_OPERATION_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.mixedport.impl.MixedPortYARPBaseImpl <em>Mixed Port YARP Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.mixedport.impl.MixedPortYARPBaseImpl
	 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortYARPBase()
	 * @generated
	 */
	int MIXED_PORT_YARP_BASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP_BASE__NAME = ABSTRACT_MIXED_PORT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Mixed Port YARP Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP_BASE_FEATURE_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mixed Port YARP Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP_BASE_OPERATION_COUNT = ABSTRACT_MIXED_PORT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.base.mixedport.AbstractMixedPortDefinition <em>Abstract Mixed Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mixed Port Definition</em>'.
	 * @see org.ecore.base.mixedport.AbstractMixedPortDefinition
	 * @generated
	 */
	EClass getAbstractMixedPortDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.mixedport.AbstractMixedPortDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.base.mixedport.AbstractMixedPortDefinition#getName()
	 * @see #getAbstractMixedPortDefinition()
	 * @generated
	 */
	EAttribute getAbstractMixedPortDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.mixedport.MixedPortOpcUaBase <em>Mixed Port Opc Ua Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port Opc Ua Base</em>'.
	 * @see org.ecore.base.mixedport.MixedPortOpcUaBase
	 * @generated
	 */
	EClass getMixedPortOpcUaBase();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.mixedport.MixedPortROSBase <em>Mixed Port ROS Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port ROS Base</em>'.
	 * @see org.ecore.base.mixedport.MixedPortROSBase
	 * @generated
	 */
	EClass getMixedPortROSBase();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.mixedport.MixedPortYARPBase <em>Mixed Port YARP Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port YARP Base</em>'.
	 * @see org.ecore.base.mixedport.MixedPortYARPBase
	 * @generated
	 */
	EClass getMixedPortYARPBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MixedportFactory getMixedportFactory();

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
		 * The meta object literal for the '{@link org.ecore.base.mixedport.impl.AbstractMixedPortDefinitionImpl <em>Abstract Mixed Port Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.mixedport.impl.AbstractMixedPortDefinitionImpl
		 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getAbstractMixedPortDefinition()
		 * @generated
		 */
		EClass ABSTRACT_MIXED_PORT_DEFINITION = eINSTANCE.getAbstractMixedPortDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIXED_PORT_DEFINITION__NAME = eINSTANCE.getAbstractMixedPortDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.base.mixedport.impl.MixedPortOpcUaBaseImpl <em>Mixed Port Opc Ua Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.mixedport.impl.MixedPortOpcUaBaseImpl
		 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortOpcUaBase()
		 * @generated
		 */
		EClass MIXED_PORT_OPC_UA_BASE = eINSTANCE.getMixedPortOpcUaBase();

		/**
		 * The meta object literal for the '{@link org.ecore.base.mixedport.impl.MixedPortROSBaseImpl <em>Mixed Port ROS Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.mixedport.impl.MixedPortROSBaseImpl
		 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortROSBase()
		 * @generated
		 */
		EClass MIXED_PORT_ROS_BASE = eINSTANCE.getMixedPortROSBase();

		/**
		 * The meta object literal for the '{@link org.ecore.base.mixedport.impl.MixedPortYARPBaseImpl <em>Mixed Port YARP Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.mixedport.impl.MixedPortYARPBaseImpl
		 * @see org.ecore.base.mixedport.impl.MixedportPackageImpl#getMixedPortYARPBase()
		 * @generated
		 */
		EClass MIXED_PORT_YARP_BASE = eINSTANCE.getMixedPortYARPBase();

	}

} //MixedportPackage
