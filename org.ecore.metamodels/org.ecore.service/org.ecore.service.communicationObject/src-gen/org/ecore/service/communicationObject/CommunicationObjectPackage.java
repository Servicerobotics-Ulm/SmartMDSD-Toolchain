/**
 */
package org.ecore.service.communicationObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

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
 * @see org.ecore.service.communicationObject.CommunicationObjectFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationObjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationObject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/service/CommunicationObject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CommunicationObject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationObjectPackage eINSTANCE = org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommObjectModelImpl <em>Comm Object Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommObjectModelImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommObjectModel()
	 * @generated
	 */
	int COMM_OBJECT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECT_MODEL__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECT_MODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Comm Object Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl <em>Comm Objects Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommObjectsRepository()
	 * @generated
	 */
	int COMM_OBJECTS_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECTS_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECTS_REPOSITORY__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECTS_REPOSITORY__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECTS_REPOSITORY__DEPENDENCY = 3;

	/**
	 * The number of structural features of the '<em>Comm Objects Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_OBJECTS_REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.AbstractCommElementImpl <em>Abstract Comm Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.AbstractCommElementImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getAbstractCommElement()
	 * @generated
	 */
	int ABSTRACT_COMM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMM_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Comm Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommRepositoryImportImpl <em>Comm Repository Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommRepositoryImportImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommRepositoryImport()
	 * @generated
	 */
	int COMM_REPOSITORY_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_REPOSITORY_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Comm Repository Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_REPOSITORY_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.VersionImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 4;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__PATCH = 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.EnumerationImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = ABSTRACT_COMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUMS = ABSTRACT_COMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ABSTRACT_COMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommunicationObjectImpl <em>Communication Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommunicationObject()
	 * @generated
	 */
	int COMMUNICATION_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OBJECT__NAME = ABSTRACT_COMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OBJECT__ATTRIBUTES = ABSTRACT_COMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OBJECT_FEATURE_COUNT = ABSTRACT_COMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommElementValueImpl <em>Comm Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommElementValueImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommElementValue()
	 * @generated
	 */
	int COMM_ELEMENT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ELEMENT_VALUE__VALUE = BasicAttributesPackage.SINGLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comm Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ELEMENT_VALUE_FEATURE_COUNT = BasicAttributesPackage.SINGLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.service.communicationObject.impl.CommElementReferenceImpl <em>Comm Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.communicationObject.impl.CommElementReferenceImpl
	 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommElementReference()
	 * @generated
	 */
	int COMM_ELEMENT_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ELEMENT_REFERENCE__ARRAY = BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ELEMENT_REFERENCE__TYPE_NAME = BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comm Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_ELEMENT_REFERENCE_FEATURE_COUNT = BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommObjectModel <em>Comm Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Object Model</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectModel
	 * @generated
	 */
	EClass getCommObjectModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.service.communicationObject.CommObjectModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectModel#getRepository()
	 * @see #getCommObjectModel()
	 * @generated
	 */
	EReference getCommObjectModel_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.communicationObject.CommObjectModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectModel#getImports()
	 * @see #getCommObjectModel()
	 * @generated
	 */
	EReference getCommObjectModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommObjectsRepository <em>Comm Objects Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Objects Repository</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository
	 * @generated
	 */
	EClass getCommObjectsRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.CommObjectsRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository#getName()
	 * @see #getCommObjectsRepository()
	 * @generated
	 */
	EAttribute getCommObjectsRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.communicationObject.CommObjectsRepository#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository#getElements()
	 * @see #getCommObjectsRepository()
	 * @generated
	 */
	EReference getCommObjectsRepository_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.service.communicationObject.CommObjectsRepository#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository#getVersion()
	 * @see #getCommObjectsRepository()
	 * @generated
	 */
	EReference getCommObjectsRepository_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.CommObjectsRepository#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency</em>'.
	 * @see org.ecore.service.communicationObject.CommObjectsRepository#getDependency()
	 * @see #getCommObjectsRepository()
	 * @generated
	 */
	EAttribute getCommObjectsRepository_Dependency();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.AbstractCommElement <em>Abstract Comm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Comm Element</em>'.
	 * @see org.ecore.service.communicationObject.AbstractCommElement
	 * @generated
	 */
	EClass getAbstractCommElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.AbstractCommElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.communicationObject.AbstractCommElement#getName()
	 * @see #getAbstractCommElement()
	 * @generated
	 */
	EAttribute getAbstractCommElement_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommRepositoryImport <em>Comm Repository Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Repository Import</em>'.
	 * @see org.ecore.service.communicationObject.CommRepositoryImport
	 * @generated
	 */
	EClass getCommRepositoryImport();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.CommRepositoryImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.ecore.service.communicationObject.CommRepositoryImport#getImportedNamespace()
	 * @see #getCommRepositoryImport()
	 * @generated
	 */
	EAttribute getCommRepositoryImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.ecore.service.communicationObject.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.Version#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see org.ecore.service.communicationObject.Version#getMajor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.Version#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see org.ecore.service.communicationObject.Version#getMinor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.communicationObject.Version#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patch</em>'.
	 * @see org.ecore.service.communicationObject.Version#getPatch()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Patch();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.ecore.service.communicationObject.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.communicationObject.Enumeration#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see org.ecore.service.communicationObject.Enumeration#getEnums()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Enums();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommunicationObject <em>Communication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Object</em>'.
	 * @see org.ecore.service.communicationObject.CommunicationObject
	 * @generated
	 */
	EClass getCommunicationObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.communicationObject.CommunicationObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.ecore.service.communicationObject.CommunicationObject#getAttributes()
	 * @see #getCommunicationObject()
	 * @generated
	 */
	EReference getCommunicationObject_Attributes();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommElementValue <em>Comm Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Element Value</em>'.
	 * @see org.ecore.service.communicationObject.CommElementValue
	 * @generated
	 */
	EClass getCommElementValue();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.service.communicationObject.CommElementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.ecore.service.communicationObject.CommElementValue#getValue()
	 * @see #getCommElementValue()
	 * @generated
	 */
	EReference getCommElementValue_Value();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.communicationObject.CommElementReference <em>Comm Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Element Reference</em>'.
	 * @see org.ecore.service.communicationObject.CommElementReference
	 * @generated
	 */
	EClass getCommElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.service.communicationObject.CommElementReference#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see org.ecore.service.communicationObject.CommElementReference#getTypeName()
	 * @see #getCommElementReference()
	 * @generated
	 */
	EReference getCommElementReference_TypeName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationObjectFactory getCommunicationObjectFactory();

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
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommObjectModelImpl <em>Comm Object Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommObjectModelImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommObjectModel()
		 * @generated
		 */
		EClass COMM_OBJECT_MODEL = eINSTANCE.getCommObjectModel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_OBJECT_MODEL__REPOSITORY = eINSTANCE.getCommObjectModel_Repository();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_OBJECT_MODEL__IMPORTS = eINSTANCE.getCommObjectModel_Imports();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl <em>Comm Objects Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommObjectsRepositoryImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommObjectsRepository()
		 * @generated
		 */
		EClass COMM_OBJECTS_REPOSITORY = eINSTANCE.getCommObjectsRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_OBJECTS_REPOSITORY__NAME = eINSTANCE.getCommObjectsRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_OBJECTS_REPOSITORY__ELEMENTS = eINSTANCE.getCommObjectsRepository_Elements();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_OBJECTS_REPOSITORY__VERSION = eINSTANCE.getCommObjectsRepository_Version();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_OBJECTS_REPOSITORY__DEPENDENCY = eINSTANCE.getCommObjectsRepository_Dependency();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.AbstractCommElementImpl <em>Abstract Comm Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.AbstractCommElementImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getAbstractCommElement()
		 * @generated
		 */
		EClass ABSTRACT_COMM_ELEMENT = eINSTANCE.getAbstractCommElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMM_ELEMENT__NAME = eINSTANCE.getAbstractCommElement_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommRepositoryImportImpl <em>Comm Repository Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommRepositoryImportImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommRepositoryImport()
		 * @generated
		 */
		EClass COMM_REPOSITORY_IMPORT = eINSTANCE.getCommRepositoryImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_REPOSITORY_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getCommRepositoryImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.VersionImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Patch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__PATCH = eINSTANCE.getVersion_Patch();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.EnumerationImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUMS = eINSTANCE.getEnumeration_Enums();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommunicationObjectImpl <em>Communication Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommunicationObject()
		 * @generated
		 */
		EClass COMMUNICATION_OBJECT = eINSTANCE.getCommunicationObject();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_OBJECT__ATTRIBUTES = eINSTANCE.getCommunicationObject_Attributes();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommElementValueImpl <em>Comm Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommElementValueImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommElementValue()
		 * @generated
		 */
		EClass COMM_ELEMENT_VALUE = eINSTANCE.getCommElementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ELEMENT_VALUE__VALUE = eINSTANCE.getCommElementValue_Value();

		/**
		 * The meta object literal for the '{@link org.ecore.service.communicationObject.impl.CommElementReferenceImpl <em>Comm Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.communicationObject.impl.CommElementReferenceImpl
		 * @see org.ecore.service.communicationObject.impl.CommunicationObjectPackageImpl#getCommElementReference()
		 * @generated
		 */
		EClass COMM_ELEMENT_REFERENCE = eINSTANCE.getCommElementReference();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_ELEMENT_REFERENCE__TYPE_NAME = eINSTANCE.getCommElementReference_TypeName();

	}

} //CommunicationObjectPackage
