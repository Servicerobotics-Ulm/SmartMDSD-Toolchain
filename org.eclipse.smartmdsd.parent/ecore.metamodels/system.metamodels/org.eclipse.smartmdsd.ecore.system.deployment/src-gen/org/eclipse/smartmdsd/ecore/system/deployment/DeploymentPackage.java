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
package org.eclipse.smartmdsd.ecore.system.deployment;

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
 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/system/deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getDeploymentModel()
	 * @generated
	 */
	int DEPLOYMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Component Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__COMPONENT_ARCH = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.AbstractDeploymentElementImpl <em>Abstract Deployment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.AbstractDeploymentElementImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getAbstractDeploymentElement()
	 * @generated
	 */
	int ABSTRACT_DEPLOYMENT_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Abstract Deployment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Deployment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DEPLOYMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetPlatformReferenceImpl <em>Target Platform Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetPlatformReferenceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getTargetPlatformReference()
	 * @generated
	 */
	int TARGET_PLATFORM_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE__PLATFORM = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE__NAME = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE__DIRECTORY = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE__LOGIN = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE__HOST = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Target Platform Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE_FEATURE_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Target Platform Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_REFERENCE_OPERATION_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl <em>Component Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getComponentArtefact()
	 * @generated
	 */
	int COMPONENT_ARTEFACT = 3;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ARTEFACT__DEPLOY = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ARTEFACT__COMPONENT = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ARTEFACT__NAME = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ARTEFACT_FEATURE_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ARTEFACT_OPERATION_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl <em>Naming Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getNamingService()
	 * @generated
	 */
	int NAMING_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Port Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE__PORT_NR = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE__DEPLOY = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Naming Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE_FEATURE_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Naming Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMING_SERVICE_OPERATION_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__TO = 0;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.UploadDirectoryImpl <em>Upload Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.UploadDirectoryImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getUploadDirectory()
	 * @generated
	 */
	int UPLOAD_DIRECTORY = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_DIRECTORY__PATH = 0;

	/**
	 * The number of structural features of the '<em>Upload Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_DIRECTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Upload Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_DIRECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetModelIncludeImpl <em>Target Model Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetModelIncludeImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getTargetModelInclude()
	 * @generated
	 */
	int TARGET_MODEL_INCLUDE = 7;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_INCLUDE__IMPORTED_NAMESPACE = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Model Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_INCLUDE_FEATURE_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Model Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_INCLUDE_OPERATION_COUNT = ABSTRACT_DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.LoginAccountSelectionImpl <em>Login Account Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.LoginAccountSelectionImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getLoginAccountSelection()
	 * @generated
	 */
	int LOGIN_ACCOUNT_SELECTION = 8;

	/**
	 * The feature id for the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_SELECTION__LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_SELECTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Login Account Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_SELECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Login Account Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl <em>Network Interface Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getNetworkInterfaceSelection()
	 * @generated
	 */
	int NETWORK_INTERFACE_SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_SELECTION__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_SELECTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Network Interface Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_SELECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Interface Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_SELECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel
	 * @generated
	 */
	EClass getDeploymentModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getName()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EAttribute getDeploymentModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getElements()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getComponentArch <em>Component Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Arch</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel#getComponentArch()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_ComponentArch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement <em>Abstract Deployment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Deployment Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement
	 * @generated
	 */
	EClass getAbstractDeploymentElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference <em>Target Platform Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Platform Reference</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference
	 * @generated
	 */
	EClass getTargetPlatformReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getPlatform()
	 * @see #getTargetPlatformReference()
	 * @generated
	 */
	EReference getTargetPlatformReference_Platform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getName()
	 * @see #getTargetPlatformReference()
	 * @generated
	 */
	EAttribute getTargetPlatformReference_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directory</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getDirectory()
	 * @see #getTargetPlatformReference()
	 * @generated
	 */
	EReference getTargetPlatformReference_Directory();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getLogin()
	 * @see #getTargetPlatformReference()
	 * @generated
	 */
	EReference getTargetPlatformReference_Login();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Host</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference#getHost()
	 * @see #getTargetPlatformReference()
	 * @generated
	 */
	EReference getTargetPlatformReference_Host();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact <em>Component Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Artefact</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact
	 * @generated
	 */
	EClass getComponentArtefact();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getDeploy()
	 * @see #getComponentArtefact()
	 * @generated
	 */
	EReference getComponentArtefact_Deploy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getComponent()
	 * @see #getComponentArtefact()
	 * @generated
	 */
	EReference getComponentArtefact_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact#getName()
	 * @see #getComponentArtefact()
	 * @generated
	 */
	EAttribute getComponentArtefact_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Naming Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NamingService
	 * @generated
	 */
	EClass getNamingService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getPortNr <em>Port Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Nr</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getPortNr()
	 * @see #getNamingService()
	 * @generated
	 */
	EAttribute getNamingService_PortNr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NamingService#getDeploy()
	 * @see #getNamingService()
	 * @generated
	 */
	EReference getNamingService_Deploy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.Deployment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.Deployment#getTo()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.UploadDirectory <em>Upload Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upload Directory</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.UploadDirectory
	 * @generated
	 */
	EClass getUploadDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.UploadDirectory#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.UploadDirectory#getPath()
	 * @see #getUploadDirectory()
	 * @generated
	 */
	EAttribute getUploadDirectory_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetModelInclude <em>Target Model Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model Include</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetModelInclude
	 * @generated
	 */
	EClass getTargetModelInclude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.TargetModelInclude#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.TargetModelInclude#getImportedNamespace()
	 * @see #getTargetModelInclude()
	 * @generated
	 */
	EAttribute getTargetModelInclude_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection <em>Login Account Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Account Selection</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection
	 * @generated
	 */
	EClass getLoginAccountSelection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection#getLogin()
	 * @see #getLoginAccountSelection()
	 * @generated
	 */
	EReference getLoginAccountSelection_Login();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection#getName()
	 * @see #getLoginAccountSelection()
	 * @generated
	 */
	EAttribute getLoginAccountSelection_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection <em>Network Interface Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface Selection</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection
	 * @generated
	 */
	EClass getNetworkInterfaceSelection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getNetwork()
	 * @see #getNetworkInterfaceSelection()
	 * @generated
	 */
	EReference getNetworkInterfaceSelection_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection#getName()
	 * @see #getNetworkInterfaceSelection()
	 * @generated
	 */
	EAttribute getNetworkInterfaceSelection_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentModelImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getDeploymentModel()
		 * @generated
		 */
		EClass DEPLOYMENT_MODEL = eINSTANCE.getDeploymentModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_MODEL__NAME = eINSTANCE.getDeploymentModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__ELEMENTS = eINSTANCE.getDeploymentModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Component Arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__COMPONENT_ARCH = eINSTANCE.getDeploymentModel_ComponentArch();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.AbstractDeploymentElementImpl <em>Abstract Deployment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.AbstractDeploymentElementImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getAbstractDeploymentElement()
		 * @generated
		 */
		EClass ABSTRACT_DEPLOYMENT_ELEMENT = eINSTANCE.getAbstractDeploymentElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetPlatformReferenceImpl <em>Target Platform Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetPlatformReferenceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getTargetPlatformReference()
		 * @generated
		 */
		EClass TARGET_PLATFORM_REFERENCE = eINSTANCE.getTargetPlatformReference();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_REFERENCE__PLATFORM = eINSTANCE.getTargetPlatformReference_Platform();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM_REFERENCE__NAME = eINSTANCE.getTargetPlatformReference_Name();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_REFERENCE__DIRECTORY = eINSTANCE.getTargetPlatformReference_Directory();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_REFERENCE__LOGIN = eINSTANCE.getTargetPlatformReference_Login();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_REFERENCE__HOST = eINSTANCE.getTargetPlatformReference_Host();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl <em>Component Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.ComponentArtefactImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getComponentArtefact()
		 * @generated
		 */
		EClass COMPONENT_ARTEFACT = eINSTANCE.getComponentArtefact();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ARTEFACT__DEPLOY = eINSTANCE.getComponentArtefact_Deploy();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ARTEFACT__COMPONENT = eINSTANCE.getComponentArtefact_Component();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ARTEFACT__NAME = eINSTANCE.getComponentArtefact_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl <em>Naming Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.NamingServiceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getNamingService()
		 * @generated
		 */
		EClass NAMING_SERVICE = eINSTANCE.getNamingService();

		/**
		 * The meta object literal for the '<em><b>Port Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMING_SERVICE__PORT_NR = eINSTANCE.getNamingService_PortNr();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMING_SERVICE__DEPLOY = eINSTANCE.getNamingService_Deploy();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__TO = eINSTANCE.getDeployment_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.UploadDirectoryImpl <em>Upload Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.UploadDirectoryImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getUploadDirectory()
		 * @generated
		 */
		EClass UPLOAD_DIRECTORY = eINSTANCE.getUploadDirectory();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOAD_DIRECTORY__PATH = eINSTANCE.getUploadDirectory_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetModelIncludeImpl <em>Target Model Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.TargetModelIncludeImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getTargetModelInclude()
		 * @generated
		 */
		EClass TARGET_MODEL_INCLUDE = eINSTANCE.getTargetModelInclude();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_MODEL_INCLUDE__IMPORTED_NAMESPACE = eINSTANCE.getTargetModelInclude_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.LoginAccountSelectionImpl <em>Login Account Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.LoginAccountSelectionImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getLoginAccountSelection()
		 * @generated
		 */
		EClass LOGIN_ACCOUNT_SELECTION = eINSTANCE.getLoginAccountSelection();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_ACCOUNT_SELECTION__LOGIN = eINSTANCE.getLoginAccountSelection_Login();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ACCOUNT_SELECTION__NAME = eINSTANCE.getLoginAccountSelection_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl <em>Network Interface Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.NetworkInterfaceSelectionImpl
		 * @see org.eclipse.smartmdsd.ecore.system.deployment.impl.DeploymentPackageImpl#getNetworkInterfaceSelection()
		 * @generated
		 */
		EClass NETWORK_INTERFACE_SELECTION = eINSTANCE.getNetworkInterfaceSelection();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_SELECTION__NETWORK = eINSTANCE.getNetworkInterfaceSelection_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE_SELECTION__NAME = eINSTANCE.getNetworkInterfaceSelection_Name();

	}

} //DeploymentPackage
