/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

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
 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/component/componentDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDefinitionPackage eINSTANCE = org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefModelImpl <em>Component Def Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefModelImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentDefModel()
	 * @generated
	 */
	int COMPONENT_DEF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF_MODEL__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF_MODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Component Def Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Def Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentDefinition()
	 * @generated
	 */
	int COMPONENT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__NAME = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__ELEMENTS = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__LOGO = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentElementImpl <em>Abstract Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentElementImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAbstractComponentElement()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Abstract Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.NamedComponentElementImpl <em>Named Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.NamedComponentElementImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getNamedComponentElement()
	 * @generated
	 */
	int NAMED_COMPONENT_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COMPONENT_ELEMENT__NAME = ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COMPONENT_ELEMENT_FEATURE_COUNT = ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COMPONENT_ELEMENT_OPERATION_COUNT = ABSTRACT_COMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeImpl <em>Component Sub Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentSubNode()
	 * @generated
	 */
	int COMPONENT_SUB_NODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE__NAME = NAMED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE__LINKS = NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Sub Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_FEATURE_COUNT = NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Sub Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_OPERATION_COUNT = NAMED_COMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = COMPONENT_SUB_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINKS = COMPONENT_SUB_NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSIONS = COMPONENT_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = COMPONENT_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = COMPONENT_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityExtensionImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getActivityExtension()
	 * @generated
	 */
	int ACTIVITY_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Activity Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activity Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputHandlerImpl <em>Input Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputHandlerImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputHandler()
	 * @generated
	 */
	int INPUT_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER__NAME = COMPONENT_SUB_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER__LINKS = COMPONENT_SUB_NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Active Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER__ACTIVE_QUEUE = COMPONENT_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER__INPUT_PORT = COMPONENT_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_FEATURE_COUNT = COMPONENT_SUB_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_OPERATION_COUNT = COMPONENT_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ServiceRepoImportImpl <em>Service Repo Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ServiceRepoImportImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getServiceRepoImport()
	 * @generated
	 */
	int SERVICE_REPO_IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Service Repo Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Repo Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl <em>Component Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentPort()
	 * @generated
	 */
	int COMPONENT_PORT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__NAME = NAMED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__DOCUMENTATION = NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT__EXTENSIONS = NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_FEATURE_COUNT = NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION = NAMED_COMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE = NAMED_COMPONENT_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_OPERATION_COUNT = NAMED_COMPONENT_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.OutputPortImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = COMPONENT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DOCUMENTATION = COMPONENT_PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__EXTENSIONS = COMPONENT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__SERVICE = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ACTIVITY = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT___GET_MULTILINE_HTML_DOCUMENTATION = COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT___GET_FIRST_DOCUMENTATION_LINE = COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortImpl <em>Request Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestPort()
	 * @generated
	 */
	int REQUEST_PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT__NAME = COMPONENT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT__DOCUMENTATION = COMPONENT_PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT__EXTENSIONS = COMPONENT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT__SERVICE = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT___GET_MULTILINE_HTML_DOCUMENTATION = COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT___GET_FIRST_DOCUMENTATION_LINE = COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Request Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = COMPONENT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DOCUMENTATION = COMPONENT_PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__EXTENSIONS = COMPONENT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SERVICE = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT___GET_MULTILINE_HTML_DOCUMENTATION = COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT___GET_FIRST_DOCUMENTATION_LINE = COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AnswerPortImpl <em>Answer Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AnswerPortImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAnswerPort()
	 * @generated
	 */
	int ANSWER_PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT__NAME = COMPONENT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT__DOCUMENTATION = COMPONENT_PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT__EXTENSIONS = COMPONENT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT__SERVICE = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT___GET_MULTILINE_HTML_DOCUMENTATION = COMPONENT_PORT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT___GET_FIRST_DOCUMENTATION_LINE = COMPONENT_PORT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Answer Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortExtensionImpl <em>Component Port Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortExtensionImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentPortExtension()
	 * @generated
	 */
	int COMPONENT_PORT_EXTENSION = 11;

	/**
	 * The number of structural features of the '<em>Component Port Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Port Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestHandlerImpl <em>Request Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestHandlerImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestHandler()
	 * @generated
	 */
	int REQUEST_HANDLER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER__NAME = COMPONENT_SUB_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER__LINKS = COMPONENT_SUB_NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Active Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER__ACTIVE_QUEUE = COMPONENT_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answer Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER__ANSWER_PORT = COMPONENT_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER_FEATURE_COUNT = COMPONENT_SUB_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Request Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_HANDLER_OPERATION_COUNT = COMPONENT_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl <em>Abstract Component Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAbstractComponentLink()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_LINK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Component Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeObserverImpl <em>Component Sub Node Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeObserverImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentSubNodeObserver()
	 * @generated
	 */
	int COMPONENT_SUB_NODE_OBSERVER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_OBSERVER__NAME = ABSTRACT_COMPONENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_OBSERVER__SUBJECT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Sub Node Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_OBSERVER_FEATURE_COUNT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Sub Node Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_NODE_OBSERVER_OPERATION_COUNT = ABSTRACT_COMPONENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl <em>Input Port Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputPortLink()
	 * @generated
	 */
	int INPUT_PORT_LINK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_LINK__NAME = ABSTRACT_COMPONENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_LINK__OPTIONAL = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_LINK__INPUT_PORT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Port Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_LINK_FEATURE_COUNT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Port Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_LINK_OPERATION_COUNT = ABSTRACT_COMPONENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortLinkImpl <em>Request Port Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortLinkImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestPortLink()
	 * @generated
	 */
	int REQUEST_PORT_LINK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_LINK__NAME = ABSTRACT_COMPONENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Request Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_LINK__REQUEST_PORT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Port Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_LINK_FEATURE_COUNT = ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Port Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PORT_LINK_OPERATION_COUNT = ABSTRACT_COMPONENT_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.DerivedComponentElementImpl <em>Derived Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.DerivedComponentElementImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getDerivedComponentElement()
	 * @generated
	 */
	int DERIVED_COMPONENT_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COMPONENT_ELEMENT__NAME = ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT = ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COMPONENT_ELEMENT_OPERATION_COUNT = ABSTRACT_COMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel <em>Component Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Def Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel
	 * @generated
	 */
	EClass getComponentDefModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel#getComponent()
	 * @see #getComponentDefModel()
	 * @generated
	 */
	EReference getComponentDefModel_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel#getImports()
	 * @see #getComponentDefModel()
	 * @generated
	 */
	EReference getComponentDefModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
	 * @generated
	 */
	EClass getComponentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getName()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EAttribute getComponentDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getElements()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition#getLogo()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EAttribute getComponentDefinition_Logo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity#getExtensions()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Extensions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension <em>Activity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Extension</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension
	 * @generated
	 */
	EClass getActivityExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler <em>Input Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Handler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler
	 * @generated
	 */
	EClass getInputHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler#isActiveQueue <em>Active Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Queue</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler#isActiveQueue()
	 * @see #getInputHandler()
	 * @generated
	 */
	EAttribute getInputHandler_ActiveQueue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler#getInputPort()
	 * @see #getInputHandler()
	 * @generated
	 */
	EReference getInputHandler_InputPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ServiceRepoImport <em>Service Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Repo Import</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ServiceRepoImport
	 * @generated
	 */
	EClass getServiceRepoImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ServiceRepoImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ServiceRepoImport#getImportedNamespace()
	 * @see #getServiceRepoImport()
	 * @generated
	 */
	EAttribute getServiceRepoImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort#getService()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Service();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort#getActivity()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort <em>Request Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort
	 * @generated
	 */
	EClass getRequestPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort#getService()
	 * @see #getRequestPort()
	 * @generated
	 */
	EReference getRequestPort_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort#getService()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort <em>Answer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort
	 * @generated
	 */
	EClass getAnswerPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort#getService()
	 * @see #getAnswerPort()
	 * @generated
	 */
	EReference getAnswerPort_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
	 * @generated
	 */
	EClass getComponentPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort#getExtensions()
	 * @see #getComponentPort()
	 * @generated
	 */
	EReference getComponentPort_Extensions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension <em>Component Port Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Port Extension</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension
	 * @generated
	 */
	EClass getComponentPortExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler <em>Request Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Handler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler
	 * @generated
	 */
	EClass getRequestHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler#isActiveQueue <em>Active Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Queue</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler#isActiveQueue()
	 * @see #getRequestHandler()
	 * @generated
	 */
	EAttribute getRequestHandler_ActiveQueue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler#getAnswerPort <em>Answer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answer Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler#getAnswerPort()
	 * @see #getRequestHandler()
	 * @generated
	 */
	EReference getRequestHandler_AnswerPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement <em>Abstract Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement
	 * @generated
	 */
	EClass getAbstractComponentElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode <em>Component Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sub Node</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode
	 * @generated
	 */
	EClass getComponentSubNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode#getLinks()
	 * @see #getComponentSubNode()
	 * @generated
	 */
	EReference getComponentSubNode_Links();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver <em>Component Sub Node Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sub Node Observer</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver
	 * @generated
	 */
	EClass getComponentSubNodeObserver();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver#getSubject()
	 * @see #getComponentSubNodeObserver()
	 * @generated
	 */
	EReference getComponentSubNodeObserver_Subject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink <em>Input Port Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port Link</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink
	 * @generated
	 */
	EClass getInputPortLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink#isOptional()
	 * @see #getInputPortLink()
	 * @generated
	 */
	EAttribute getInputPortLink_Optional();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink#getInputPort()
	 * @see #getInputPortLink()
	 * @generated
	 */
	EReference getInputPortLink_InputPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink <em>Request Port Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Port Link</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink
	 * @generated
	 */
	EClass getRequestPortLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink#getRequestPort <em>Request Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink#getRequestPort()
	 * @see #getRequestPortLink()
	 * @generated
	 */
	EReference getRequestPortLink_RequestPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink <em>Abstract Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Link</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink
	 * @generated
	 */
	EClass getAbstractComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink#getName()
	 * @see #getAbstractComponentLink()
	 * @generated
	 */
	EAttribute getAbstractComponentLink_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement <em>Named Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Component Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement
	 * @generated
	 */
	EClass getNamedComponentElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement#getName()
	 * @see #getNamedComponentElement()
	 * @generated
	 */
	EAttribute getNamedComponentElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement <em>Derived Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Component Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement
	 * @generated
	 */
	EClass getDerivedComponentElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement#getName()
	 * @see #getDerivedComponentElement()
	 * @generated
	 */
	EAttribute getDerivedComponentElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentDefinitionFactory getComponentDefinitionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefModelImpl <em>Component Def Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefModelImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentDefModel()
		 * @generated
		 */
		EClass COMPONENT_DEF_MODEL = eINSTANCE.getComponentDefModel();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEF_MODEL__COMPONENT = eINSTANCE.getComponentDefModel_Component();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEF_MODEL__IMPORTS = eINSTANCE.getComponentDefModel_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentDefinition()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__ELEMENTS = eINSTANCE.getComponentDefinition_Elements();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION__LOGO = eINSTANCE.getComponentDefinition_Logo();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EXTENSIONS = eINSTANCE.getActivity_Extensions();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ActivityExtensionImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getActivityExtension()
		 * @generated
		 */
		EClass ACTIVITY_EXTENSION = eINSTANCE.getActivityExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputHandlerImpl <em>Input Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputHandlerImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputHandler()
		 * @generated
		 */
		EClass INPUT_HANDLER = eINSTANCE.getInputHandler();

		/**
		 * The meta object literal for the '<em><b>Active Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_HANDLER__ACTIVE_QUEUE = eINSTANCE.getInputHandler_ActiveQueue();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_HANDLER__INPUT_PORT = eINSTANCE.getInputHandler_InputPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ServiceRepoImportImpl <em>Service Repo Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ServiceRepoImportImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getServiceRepoImport()
		 * @generated
		 */
		EClass SERVICE_REPO_IMPORT = eINSTANCE.getServiceRepoImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPO_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getServiceRepoImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.OutputPortImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__SERVICE = eINSTANCE.getOutputPort_Service();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__ACTIVITY = eINSTANCE.getOutputPort_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortImpl <em>Request Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestPort()
		 * @generated
		 */
		EClass REQUEST_PORT = eINSTANCE.getRequestPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_PORT__SERVICE = eINSTANCE.getRequestPort_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__SERVICE = eINSTANCE.getInputPort_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AnswerPortImpl <em>Answer Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AnswerPortImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAnswerPort()
		 * @generated
		 */
		EClass ANSWER_PORT = eINSTANCE.getAnswerPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_PORT__SERVICE = eINSTANCE.getAnswerPort_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl <em>Component Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentPort()
		 * @generated
		 */
		EClass COMPONENT_PORT = eINSTANCE.getComponentPort();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT__EXTENSIONS = eINSTANCE.getComponentPort_Extensions();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortExtensionImpl <em>Component Port Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentPortExtensionImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentPortExtension()
		 * @generated
		 */
		EClass COMPONENT_PORT_EXTENSION = eINSTANCE.getComponentPortExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestHandlerImpl <em>Request Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestHandlerImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestHandler()
		 * @generated
		 */
		EClass REQUEST_HANDLER = eINSTANCE.getRequestHandler();

		/**
		 * The meta object literal for the '<em><b>Active Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_HANDLER__ACTIVE_QUEUE = eINSTANCE.getRequestHandler_ActiveQueue();

		/**
		 * The meta object literal for the '<em><b>Answer Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_HANDLER__ANSWER_PORT = eINSTANCE.getRequestHandler_AnswerPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentElementImpl <em>Abstract Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentElementImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAbstractComponentElement()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_ELEMENT = eINSTANCE.getAbstractComponentElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeImpl <em>Component Sub Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentSubNode()
		 * @generated
		 */
		EClass COMPONENT_SUB_NODE = eINSTANCE.getComponentSubNode();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUB_NODE__LINKS = eINSTANCE.getComponentSubNode_Links();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeObserverImpl <em>Component Sub Node Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentSubNodeObserverImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getComponentSubNodeObserver()
		 * @generated
		 */
		EClass COMPONENT_SUB_NODE_OBSERVER = eINSTANCE.getComponentSubNodeObserver();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUB_NODE_OBSERVER__SUBJECT = eINSTANCE.getComponentSubNodeObserver_Subject();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl <em>Input Port Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.InputPortLinkImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getInputPortLink()
		 * @generated
		 */
		EClass INPUT_PORT_LINK = eINSTANCE.getInputPortLink();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PORT_LINK__OPTIONAL = eINSTANCE.getInputPortLink_Optional();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT_LINK__INPUT_PORT = eINSTANCE.getInputPortLink_InputPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortLinkImpl <em>Request Port Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.RequestPortLinkImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getRequestPortLink()
		 * @generated
		 */
		EClass REQUEST_PORT_LINK = eINSTANCE.getRequestPortLink();

		/**
		 * The meta object literal for the '<em><b>Request Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_PORT_LINK__REQUEST_PORT = eINSTANCE.getRequestPortLink_RequestPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl <em>Abstract Component Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.AbstractComponentLinkImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getAbstractComponentLink()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_LINK = eINSTANCE.getAbstractComponentLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_LINK__NAME = eINSTANCE.getAbstractComponentLink_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.NamedComponentElementImpl <em>Named Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.NamedComponentElementImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getNamedComponentElement()
		 * @generated
		 */
		EClass NAMED_COMPONENT_ELEMENT = eINSTANCE.getNamedComponentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_COMPONENT_ELEMENT__NAME = eINSTANCE.getNamedComponentElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.DerivedComponentElementImpl <em>Derived Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.DerivedComponentElementImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.impl.ComponentDefinitionPackageImpl#getDerivedComponentElement()
		 * @generated
		 */
		EClass DERIVED_COMPONENT_ELEMENT = eINSTANCE.getDerivedComponentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_COMPONENT_ELEMENT__NAME = eINSTANCE.getDerivedComponentElement_Name();

	}

} //ComponentDefinitionPackage
