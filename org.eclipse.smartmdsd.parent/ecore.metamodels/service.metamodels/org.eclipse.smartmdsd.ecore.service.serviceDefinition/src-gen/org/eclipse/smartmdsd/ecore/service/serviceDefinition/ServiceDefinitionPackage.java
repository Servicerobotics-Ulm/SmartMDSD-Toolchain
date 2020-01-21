/**
 */
package org.eclipse.smartmdsd.ecore.service.serviceDefinition;

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
 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "serviceDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/service/serviceDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "serviceDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceDefinitionPackage eINSTANCE = org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefModelImpl <em>Service Def Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefModelImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceDefModel()
	 * @generated
	 */
	int SERVICE_DEF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_MODEL__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Service Def Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Def Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl <em>Service Def Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceDefRepository()
	 * @generated
	 */
	int SERVICE_DEF_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY__NAME = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY__VERSION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY__SERVICES = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Def Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Service Def Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_REPOSITORY_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl <em>Abstract Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getAbstractServiceDefinition()
	 * @generated
	 */
	int ABSTRACT_SERVICE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION__NAME = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION__PROPERTIES = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Abstract Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICE_DEFINITION_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommRepoImportImpl <em>Comm Repo Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommRepoImportImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommRepoImport()
	 * @generated
	 */
	int COMM_REPO_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_REPO_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Comm Repo Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_REPO_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comm Repo Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_REPO_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceRepoVersionImpl <em>Service Repo Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceRepoVersionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceRepoVersion()
	 * @generated
	 */
	int SERVICE_REPO_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_VERSION__PATCH = 2;

	/**
	 * The number of structural features of the '<em>Service Repo Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_VERSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Repo Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REPO_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServicePropertyImpl <em>Service Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServicePropertyImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceProperty()
	 * @generated
	 */
	int SERVICE_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceDefinitionImpl <em>Communication Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommunicationServiceDefinition()
	 * @generated
	 */
	int COMMUNICATION_SERVICE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION__DOCUMENTATION = ABSTRACT_SERVICE_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION__NAME = ABSTRACT_SERVICE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION__PROPERTIES = ABSTRACT_SERVICE_DEFINITION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Communication Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION_FEATURE_COUNT = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Communication Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_DEFINITION_OPERATION_COUNT = ABSTRACT_SERVICE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl <em>Coordination Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCoordinationServiceDefinition()
	 * @generated
	 */
	int COORDINATION_SERVICE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__DOCUMENTATION = ABSTRACT_SERVICE_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__NAME = ABSTRACT_SERVICE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__PROPERTIES = ABSTRACT_SERVICE_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>State Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__STATE_PATTERN = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wiring Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitoring Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION__SERVICES = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coordination Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION_FEATURE_COUNT = ABSTRACT_SERVICE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Coordination Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SERVICE_DEFINITION_OPERATION_COUNT = ABSTRACT_SERVICE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.OneWayCommunicationServiceImpl <em>One Way Communication Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.OneWayCommunicationServiceImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getOneWayCommunicationService()
	 * @generated
	 */
	int ONE_WAY_COMMUNICATION_SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE__DOCUMENTATION = COMMUNICATION_SERVICE_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE__NAME = COMMUNICATION_SERVICE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE__PROPERTIES = COMMUNICATION_SERVICE_DEFINITION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>One Way Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT = COMMUNICATION_SERVICE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE___GET_MULTILINE_HTML_DOCUMENTATION = COMMUNICATION_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE___GET_FIRST_DOCUMENTATION_LINE = COMMUNICATION_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>One Way Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_SERVICE_OPERATION_COUNT = COMMUNICATION_SERVICE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ForkingServiceDefinitionImpl <em>Forking Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ForkingServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getForkingServiceDefinition()
	 * @generated
	 */
	int FORKING_SERVICE_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION__DOCUMENTATION = ONE_WAY_COMMUNICATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION__NAME = ONE_WAY_COMMUNICATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION__PROPERTIES = ONE_WAY_COMMUNICATION_SERVICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION__PATTERN = ONE_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forking Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION_FEATURE_COUNT = ONE_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = ONE_WAY_COMMUNICATION_SERVICE___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = ONE_WAY_COMMUNICATION_SERVICE___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Forking Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_SERVICE_DEFINITION_OPERATION_COUNT = ONE_WAY_COMMUNICATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.TwoWayCommunicationServiceImpl <em>Two Way Communication Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.TwoWayCommunicationServiceImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getTwoWayCommunicationService()
	 * @generated
	 */
	int TWO_WAY_COMMUNICATION_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE__DOCUMENTATION = COMMUNICATION_SERVICE_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE__NAME = COMMUNICATION_SERVICE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE__PROPERTIES = COMMUNICATION_SERVICE_DEFINITION__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Two Way Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT = COMMUNICATION_SERVICE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE___GET_MULTILINE_HTML_DOCUMENTATION = COMMUNICATION_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE___GET_FIRST_DOCUMENTATION_LINE = COMMUNICATION_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Two Way Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_SERVICE_OPERATION_COUNT = COMMUNICATION_SERVICE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.RequestAnswerServiceDefinitionImpl <em>Request Answer Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.RequestAnswerServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getRequestAnswerServiceDefinition()
	 * @generated
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION__DOCUMENTATION = TWO_WAY_COMMUNICATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION__NAME = TWO_WAY_COMMUNICATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION__PROPERTIES = TWO_WAY_COMMUNICATION_SERVICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION__PATTERN = TWO_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Answer Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION_FEATURE_COUNT = TWO_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = TWO_WAY_COMMUNICATION_SERVICE___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = TWO_WAY_COMMUNICATION_SERVICE___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Request Answer Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_SERVICE_DEFINITION_OPERATION_COUNT = TWO_WAY_COMMUNICATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl <em>Communication Service Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommunicationServiceUsage()
	 * @generated
	 */
	int COMMUNICATION_SERVICE_USAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE__USES = 1;

	/**
	 * The number of structural features of the '<em>Communication Service Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Communication Service Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.JoiningServiceDefinitionImpl <em>Joining Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.JoiningServiceDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getJoiningServiceDefinition()
	 * @generated
	 */
	int JOINING_SERVICE_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION__DOCUMENTATION = ONE_WAY_COMMUNICATION_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION__NAME = ONE_WAY_COMMUNICATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION__PROPERTIES = ONE_WAY_COMMUNICATION_SERVICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION__PATTERN = ONE_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Joining Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION_FEATURE_COUNT = ONE_WAY_COMMUNICATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION___GET_MULTILINE_HTML_DOCUMENTATION = ONE_WAY_COMMUNICATION_SERVICE___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION___GET_FIRST_DOCUMENTATION_LINE = ONE_WAY_COMMUNICATION_SERVICE___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Joining Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_SERVICE_DEFINITION_OPERATION_COUNT = ONE_WAY_COMMUNICATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel <em>Service Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Def Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel
	 * @generated
	 */
	EClass getServiceDefModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getImports()
	 * @see #getServiceDefModel()
	 * @generated
	 */
	EReference getServiceDefModel_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel#getRepository()
	 * @see #getServiceDefModel()
	 * @generated
	 */
	EReference getServiceDefModel_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository <em>Service Def Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Def Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository
	 * @generated
	 */
	EClass getServiceDefRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getName()
	 * @see #getServiceDefRepository()
	 * @generated
	 */
	EAttribute getServiceDefRepository_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getVersion()
	 * @see #getServiceDefRepository()
	 * @generated
	 */
	EReference getServiceDefRepository_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository#getServices()
	 * @see #getServiceDefRepository()
	 * @generated
	 */
	EReference getServiceDefRepository_Services();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition <em>Abstract Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition
	 * @generated
	 */
	EClass getAbstractServiceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition#getName()
	 * @see #getAbstractServiceDefinition()
	 * @generated
	 */
	EAttribute getAbstractServiceDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition#getProperties()
	 * @see #getAbstractServiceDefinition()
	 * @generated
	 */
	EReference getAbstractServiceDefinition_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport <em>Comm Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Repo Import</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport
	 * @generated
	 */
	EClass getCommRepoImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport#getImportedNamespace()
	 * @see #getCommRepoImport()
	 * @generated
	 */
	EAttribute getCommRepoImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion <em>Service Repo Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Repo Version</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion
	 * @generated
	 */
	EClass getServiceRepoVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getMajor()
	 * @see #getServiceRepoVersion()
	 * @generated
	 */
	EAttribute getServiceRepoVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getMinor()
	 * @see #getServiceRepoVersion()
	 * @generated
	 */
	EAttribute getServiceRepoVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patch</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion#getPatch()
	 * @see #getServiceRepoVersion()
	 * @generated
	 */
	EAttribute getServiceRepoVersion_Patch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceProperty <em>Service Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Property</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceProperty
	 * @generated
	 */
	EClass getServiceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceProperty#getName()
	 * @see #getServiceProperty()
	 * @generated
	 */
	EAttribute getServiceProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceDefinition <em>Communication Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceDefinition
	 * @generated
	 */
	EClass getCommunicationServiceDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition <em>Coordination Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition
	 * @generated
	 */
	EClass getCoordinationServiceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern <em>State Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern()
	 * @see #getCoordinationServiceDefinition()
	 * @generated
	 */
	EReference getCoordinationServiceDefinition_StatePattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern <em>Parameter Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern()
	 * @see #getCoordinationServiceDefinition()
	 * @generated
	 */
	EReference getCoordinationServiceDefinition_ParameterPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern <em>Wiring Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wiring Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern()
	 * @see #getCoordinationServiceDefinition()
	 * @generated
	 */
	EReference getCoordinationServiceDefinition_WiringPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern <em>Monitoring Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern()
	 * @see #getCoordinationServiceDefinition()
	 * @generated
	 */
	EReference getCoordinationServiceDefinition_MonitoringPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getServices()
	 * @see #getCoordinationServiceDefinition()
	 * @generated
	 */
	EReference getCoordinationServiceDefinition_Services();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition <em>Forking Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forking Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition
	 * @generated
	 */
	EClass getForkingServiceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition#getPattern()
	 * @see #getForkingServiceDefinition()
	 * @generated
	 */
	EReference getForkingServiceDefinition_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.RequestAnswerServiceDefinition <em>Request Answer Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Answer Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.RequestAnswerServiceDefinition
	 * @generated
	 */
	EClass getRequestAnswerServiceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.RequestAnswerServiceDefinition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.RequestAnswerServiceDefinition#getPattern()
	 * @see #getRequestAnswerServiceDefinition()
	 * @generated
	 */
	EReference getRequestAnswerServiceDefinition_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.OneWayCommunicationService <em>One Way Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Way Communication Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.OneWayCommunicationService
	 * @generated
	 */
	EClass getOneWayCommunicationService();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.TwoWayCommunicationService <em>Two Way Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Way Communication Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.TwoWayCommunicationService
	 * @generated
	 */
	EClass getTwoWayCommunicationService();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage <em>Communication Service Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Service Usage</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage
	 * @generated
	 */
	EClass getCommunicationServiceUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage#getName()
	 * @see #getCommunicationServiceUsage()
	 * @generated
	 */
	EAttribute getCommunicationServiceUsage_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage#getUses()
	 * @see #getCommunicationServiceUsage()
	 * @generated
	 */
	EReference getCommunicationServiceUsage_Uses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition <em>Joining Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joining Service Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition
	 * @generated
	 */
	EClass getJoiningServiceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition#getPattern()
	 * @see #getJoiningServiceDefinition()
	 * @generated
	 */
	EReference getJoiningServiceDefinition_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceDefinitionFactory getServiceDefinitionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefModelImpl <em>Service Def Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefModelImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceDefModel()
		 * @generated
		 */
		EClass SERVICE_DEF_MODEL = eINSTANCE.getServiceDefModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF_MODEL__IMPORTS = eINSTANCE.getServiceDefModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF_MODEL__REPOSITORY = eINSTANCE.getServiceDefModel_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl <em>Service Def Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefRepositoryImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceDefRepository()
		 * @generated
		 */
		EClass SERVICE_DEF_REPOSITORY = eINSTANCE.getServiceDefRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF_REPOSITORY__NAME = eINSTANCE.getServiceDefRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF_REPOSITORY__VERSION = eINSTANCE.getServiceDefRepository_Version();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF_REPOSITORY__SERVICES = eINSTANCE.getServiceDefRepository_Services();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl <em>Abstract Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getAbstractServiceDefinition()
		 * @generated
		 */
		EClass ABSTRACT_SERVICE_DEFINITION = eINSTANCE.getAbstractServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SERVICE_DEFINITION__NAME = eINSTANCE.getAbstractServiceDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SERVICE_DEFINITION__PROPERTIES = eINSTANCE.getAbstractServiceDefinition_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommRepoImportImpl <em>Comm Repo Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommRepoImportImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommRepoImport()
		 * @generated
		 */
		EClass COMM_REPO_IMPORT = eINSTANCE.getCommRepoImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_REPO_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getCommRepoImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceRepoVersionImpl <em>Service Repo Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceRepoVersionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceRepoVersion()
		 * @generated
		 */
		EClass SERVICE_REPO_VERSION = eINSTANCE.getServiceRepoVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPO_VERSION__MAJOR = eINSTANCE.getServiceRepoVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPO_VERSION__MINOR = eINSTANCE.getServiceRepoVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Patch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REPO_VERSION__PATCH = eINSTANCE.getServiceRepoVersion_Patch();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServicePropertyImpl <em>Service Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServicePropertyImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getServiceProperty()
		 * @generated
		 */
		EClass SERVICE_PROPERTY = eINSTANCE.getServiceProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROPERTY__NAME = eINSTANCE.getServiceProperty_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceDefinitionImpl <em>Communication Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommunicationServiceDefinition()
		 * @generated
		 */
		EClass COMMUNICATION_SERVICE_DEFINITION = eINSTANCE.getCommunicationServiceDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl <em>Coordination Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCoordinationServiceDefinition()
		 * @generated
		 */
		EClass COORDINATION_SERVICE_DEFINITION = eINSTANCE.getCoordinationServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>State Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SERVICE_DEFINITION__STATE_PATTERN = eINSTANCE
				.getCoordinationServiceDefinition_StatePattern();

		/**
		 * The meta object literal for the '<em><b>Parameter Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN = eINSTANCE
				.getCoordinationServiceDefinition_ParameterPattern();

		/**
		 * The meta object literal for the '<em><b>Wiring Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN = eINSTANCE
				.getCoordinationServiceDefinition_WiringPattern();

		/**
		 * The meta object literal for the '<em><b>Monitoring Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN = eINSTANCE
				.getCoordinationServiceDefinition_MonitoringPattern();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SERVICE_DEFINITION__SERVICES = eINSTANCE.getCoordinationServiceDefinition_Services();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ForkingServiceDefinitionImpl <em>Forking Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ForkingServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getForkingServiceDefinition()
		 * @generated
		 */
		EClass FORKING_SERVICE_DEFINITION = eINSTANCE.getForkingServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKING_SERVICE_DEFINITION__PATTERN = eINSTANCE.getForkingServiceDefinition_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.RequestAnswerServiceDefinitionImpl <em>Request Answer Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.RequestAnswerServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getRequestAnswerServiceDefinition()
		 * @generated
		 */
		EClass REQUEST_ANSWER_SERVICE_DEFINITION = eINSTANCE.getRequestAnswerServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_ANSWER_SERVICE_DEFINITION__PATTERN = eINSTANCE.getRequestAnswerServiceDefinition_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.OneWayCommunicationServiceImpl <em>One Way Communication Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.OneWayCommunicationServiceImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getOneWayCommunicationService()
		 * @generated
		 */
		EClass ONE_WAY_COMMUNICATION_SERVICE = eINSTANCE.getOneWayCommunicationService();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.TwoWayCommunicationServiceImpl <em>Two Way Communication Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.TwoWayCommunicationServiceImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getTwoWayCommunicationService()
		 * @generated
		 */
		EClass TWO_WAY_COMMUNICATION_SERVICE = eINSTANCE.getTwoWayCommunicationService();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl <em>Communication Service Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.CommunicationServiceUsageImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getCommunicationServiceUsage()
		 * @generated
		 */
		EClass COMMUNICATION_SERVICE_USAGE = eINSTANCE.getCommunicationServiceUsage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SERVICE_USAGE__NAME = eINSTANCE.getCommunicationServiceUsage_Name();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SERVICE_USAGE__USES = eINSTANCE.getCommunicationServiceUsage_Uses();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.JoiningServiceDefinitionImpl <em>Joining Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.JoiningServiceDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl.ServiceDefinitionPackageImpl#getJoiningServiceDefinition()
		 * @generated
		 */
		EClass JOINING_SERVICE_DEFINITION = eINSTANCE.getJoiningServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINING_SERVICE_DEFINITION__PATTERN = eINSTANCE.getJoiningServiceDefinition_Pattern();

	}

} //ServiceDefinitionPackage
