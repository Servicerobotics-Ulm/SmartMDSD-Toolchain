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
package org.eclipse.smartmdsd.ecore.component.componentParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

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
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentParameterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentParameter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/component/componentParameter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentParameter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentParameterPackage eINSTANCE = org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterImpl <em>Component Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParameter()
	 * @generated
	 */
	int COMPONENT_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Component Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractComponentParameterImpl <em>Abstract Component Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractComponentParameterImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getAbstractComponentParameter()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PARAMETER__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Abstract Component Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PARAMETER___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Abstract Component Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PARAMETER_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterBaseImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParameterBase()
	 * @generated
	 */
	int COMPONENT_PARAMETER_BASE = 2;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.InternalParameterImpl <em>Internal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.InternalParameterImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getInternalParameter()
	 * @generated
	 */
	int INTERNAL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER__DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER__NAME = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER__ATTRIBUTES = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER_FEATURE_COUNT = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_COMPONENT_PARAMETER___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Internal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARAMETER_OPERATION_COUNT = ABSTRACT_COMPONENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedParameterImpl <em>Extended Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedParameterImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getExtendedParameter()
	 * @generated
	 */
	int EXTENDED_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__NAME = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER__ATTRIBUTES = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_FEATURE_COUNT = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_COMPONENT_PARAMETER___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Extended Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PARAMETER_OPERATION_COUNT = ABSTRACT_COMPONENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedTriggerImpl <em>Extended Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedTriggerImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getExtendedTrigger()
	 * @generated
	 */
	int EXTENDED_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER__DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER__NAME = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER__ACTIVE = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER__ATTRIBUTES = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extended Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER_FEATURE_COUNT = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_COMPONENT_PARAMETER___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Extended Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TRIGGER_OPERATION_COUNT = ABSTRACT_COMPONENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterSetInstanceImpl <em>Parameter Set Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterSetInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getParameterSetInstance()
	 * @generated
	 */
	int PARAMETER_SET_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE__DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Parameter Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE__PARAM_SET = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE__NAME = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Set Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE_FEATURE_COUNT = ABSTRACT_COMPONENT_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_COMPONENT_PARAMETER___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_COMPONENT_PARAMETER___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Parameter Set Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_INSTANCE_OPERATION_COUNT = ABSTRACT_COMPONENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractParameterInstanceImpl <em>Abstract Parameter Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractParameterInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getAbstractParameterInstance()
	 * @generated
	 */
	int ABSTRACT_PARAMETER_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_INSTANCE__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Abstract Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_INSTANCE___GET_FIRST_DOCUMENTATION_LINE = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Abstract Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_INSTANCE_OPERATION_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTATION_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getTriggerInstance()
	 * @generated
	 */
	int TRIGGER_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__DOCUMENTATION = ABSTRACT_PARAMETER_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Trigger Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__TRIGGER_DEF = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__ACTIVE = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE__NAME = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_FEATURE_COUNT = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_PARAMETER_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_PARAMETER_INSTANCE___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Trigger Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INSTANCE_OPERATION_COUNT = ABSTRACT_PARAMETER_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl <em>Parameter Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getParameterInstance()
	 * @generated
	 */
	int PARAMETER_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__DOCUMENTATION = ABSTRACT_PARAMETER_INSTANCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Parameter Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__PARAMETER_DEF = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__ATTRIBUTES = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__NAME = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_FEATURE_COUNT = ABSTRACT_PARAMETER_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Multiline Html Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION = ABSTRACT_PARAMETER_INSTANCE___GET_MULTILINE_HTML_DOCUMENTATION;

	/**
	 * The operation id for the '<em>Get First Documentation Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE___GET_FIRST_DOCUMENTATION_LINE = ABSTRACT_PARAMETER_INSTANCE___GET_FIRST_DOCUMENTATION_LINE;

	/**
	 * The number of operations of the '<em>Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_OPERATION_COUNT = ABSTRACT_PARAMETER_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParamModelImpl <em>Component Param Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParamModelImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParamModel()
	 * @generated
	 */
	int COMPONENT_PARAM_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Parametrization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAM_MODEL__PARAMETRIZATION = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAM_MODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Component Param Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAM_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Param Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParametersRefImpl <em>Component Parameters Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParametersRefImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParametersRef()
	 * @generated
	 */
	int COMPONENT_PARAMETERS_REF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETERS_REF__NAME = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETERS_REF__PARAMETER = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETERS_REF__SLAVE = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Parameters Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETERS_REF_FEATURE_COUNT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Parameters Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETERS_REF_OPERATION_COUNT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentRunTimeParameterBaseImpl <em>Component Run Time Parameter Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentRunTimeParameterBaseImpl
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentRunTimeParameterBase()
	 * @generated
	 */
	int COMPONENT_RUN_TIME_PARAMETER_BASE = 12;

	/**
	 * The number of structural features of the '<em>Component Run Time Parameter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUN_TIME_PARAMETER_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Run Time Parameter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUN_TIME_PARAMETER_BASE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter <em>Component Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter
	 * @generated
	 */
	EClass getComponentParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getParameters()
	 * @see #getComponentParameter()
	 * @generated
	 */
	EReference getComponentParameter_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getComponent()
	 * @see #getComponentParameter()
	 * @generated
	 */
	EReference getComponentParameter_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter#getName()
	 * @see #getComponentParameter()
	 * @generated
	 */
	EAttribute getComponentParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractComponentParameter <em>Abstract Component Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractComponentParameter
	 * @generated
	 */
	EClass getAbstractComponentParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterBase
	 * @generated
	 */
	EClass getComponentParameterBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter <em>Internal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter
	 * @generated
	 */
	EClass getInternalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getName()
	 * @see #getInternalParameter()
	 * @generated
	 */
	EAttribute getInternalParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter#getAttributes()
	 * @see #getInternalParameter()
	 * @generated
	 */
	EReference getInternalParameter_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter <em>Extended Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter
	 * @generated
	 */
	EClass getExtendedParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter#getName()
	 * @see #getExtendedParameter()
	 * @generated
	 */
	EAttribute getExtendedParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter#getAttributes()
	 * @see #getExtendedParameter()
	 * @generated
	 */
	EReference getExtendedParameter_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger <em>Extended Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Trigger</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger
	 * @generated
	 */
	EClass getExtendedTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#getName()
	 * @see #getExtendedTrigger()
	 * @generated
	 */
	EAttribute getExtendedTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#isActive()
	 * @see #getExtendedTrigger()
	 * @generated
	 */
	EAttribute getExtendedTrigger_Active();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger#getAttributes()
	 * @see #getExtendedTrigger()
	 * @generated
	 */
	EReference getExtendedTrigger_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance <em>Parameter Set Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
	 * @generated
	 */
	EClass getParameterSetInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getParameterInstances <em>Parameter Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Instances</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getParameterInstances()
	 * @see #getParameterSetInstance()
	 * @generated
	 */
	EReference getParameterSetInstance_ParameterInstances();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getParamSet <em>Param Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param Set</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getParamSet()
	 * @see #getParameterSetInstance()
	 * @generated
	 */
	EReference getParameterSetInstance_ParamSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance#getName()
	 * @see #getParameterSetInstance()
	 * @generated
	 */
	EAttribute getParameterSetInstance_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractParameterInstance <em>Abstract Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parameter Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractParameterInstance
	 * @generated
	 */
	EClass getAbstractParameterInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance <em>Trigger Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance
	 * @generated
	 */
	EClass getTriggerInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getTriggerDef <em>Trigger Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getTriggerDef()
	 * @see #getTriggerInstance()
	 * @generated
	 */
	EReference getTriggerInstance_TriggerDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#isActive()
	 * @see #getTriggerInstance()
	 * @generated
	 */
	EAttribute getTriggerInstance_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getName()
	 * @see #getTriggerInstance()
	 * @generated
	 */
	EAttribute getTriggerInstance_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance <em>Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
	 * @generated
	 */
	EClass getParameterInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getParameterDef()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EReference getParameterInstance_ParameterDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getAttributes()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EReference getParameterInstance_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getName()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EAttribute getParameterInstance_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel <em>Component Param Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Param Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel
	 * @generated
	 */
	EClass getComponentParamModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel#getParametrization <em>Parametrization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametrization</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel#getParametrization()
	 * @see #getComponentParamModel()
	 * @generated
	 */
	EReference getComponentParamModel_Parametrization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel#getImports()
	 * @see #getComponentParamModel()
	 * @generated
	 */
	EReference getComponentParamModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef <em>Component Parameters Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Parameters Ref</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef
	 * @generated
	 */
	EClass getComponentParametersRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getParameter()
	 * @see #getComponentParametersRef()
	 * @generated
	 */
	EReference getComponentParametersRef_Parameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getSlave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slave</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getSlave()
	 * @see #getComponentParametersRef()
	 * @generated
	 */
	EReference getComponentParametersRef_Slave();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentRunTimeParameterBase <em>Component Run Time Parameter Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Run Time Parameter Base</em>'.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentRunTimeParameterBase
	 * @generated
	 */
	EClass getComponentRunTimeParameterBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentParameterFactory getComponentParameterFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterImpl <em>Component Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParameter()
		 * @generated
		 */
		EClass COMPONENT_PARAMETER = eINSTANCE.getComponentParameter();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER__PARAMETERS = eINSTANCE.getComponentParameter_Parameters();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER__COMPONENT = eINSTANCE.getComponentParameter_Component();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PARAMETER__NAME = eINSTANCE.getComponentParameter_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractComponentParameterImpl <em>Abstract Component Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractComponentParameterImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getAbstractComponentParameter()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_PARAMETER = eINSTANCE.getAbstractComponentParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterBaseImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParameterBase()
		 * @generated
		 */
		EClass COMPONENT_PARAMETER_BASE = eINSTANCE.getComponentParameterBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.InternalParameterImpl <em>Internal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.InternalParameterImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getInternalParameter()
		 * @generated
		 */
		EClass INTERNAL_PARAMETER = eINSTANCE.getInternalParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_PARAMETER__NAME = eINSTANCE.getInternalParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_PARAMETER__ATTRIBUTES = eINSTANCE.getInternalParameter_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedParameterImpl <em>Extended Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedParameterImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getExtendedParameter()
		 * @generated
		 */
		EClass EXTENDED_PARAMETER = eINSTANCE.getExtendedParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_PARAMETER__NAME = eINSTANCE.getExtendedParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PARAMETER__ATTRIBUTES = eINSTANCE.getExtendedParameter_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedTriggerImpl <em>Extended Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ExtendedTriggerImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getExtendedTrigger()
		 * @generated
		 */
		EClass EXTENDED_TRIGGER = eINSTANCE.getExtendedTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TRIGGER__NAME = eINSTANCE.getExtendedTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TRIGGER__ACTIVE = eINSTANCE.getExtendedTrigger_Active();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_TRIGGER__ATTRIBUTES = eINSTANCE.getExtendedTrigger_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterSetInstanceImpl <em>Parameter Set Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterSetInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getParameterSetInstance()
		 * @generated
		 */
		EClass PARAMETER_SET_INSTANCE = eINSTANCE.getParameterSetInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET_INSTANCE__PARAMETER_INSTANCES = eINSTANCE.getParameterSetInstance_ParameterInstances();

		/**
		 * The meta object literal for the '<em><b>Param Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET_INSTANCE__PARAM_SET = eINSTANCE.getParameterSetInstance_ParamSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SET_INSTANCE__NAME = eINSTANCE.getParameterSetInstance_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractParameterInstanceImpl <em>Abstract Parameter Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.AbstractParameterInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getAbstractParameterInstance()
		 * @generated
		 */
		EClass ABSTRACT_PARAMETER_INSTANCE = eINSTANCE.getAbstractParameterInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl <em>Trigger Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.TriggerInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getTriggerInstance()
		 * @generated
		 */
		EClass TRIGGER_INSTANCE = eINSTANCE.getTriggerInstance();

		/**
		 * The meta object literal for the '<em><b>Trigger Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_INSTANCE__TRIGGER_DEF = eINSTANCE.getTriggerInstance_TriggerDef();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_INSTANCE__ACTIVE = eINSTANCE.getTriggerInstance_Active();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_INSTANCE__NAME = eINSTANCE.getTriggerInstance_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl <em>Parameter Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ParameterInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getParameterInstance()
		 * @generated
		 */
		EClass PARAMETER_INSTANCE = eINSTANCE.getParameterInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INSTANCE__PARAMETER_DEF = eINSTANCE.getParameterInstance_ParameterDef();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INSTANCE__ATTRIBUTES = eINSTANCE.getParameterInstance_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_INSTANCE__NAME = eINSTANCE.getParameterInstance_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParamModelImpl <em>Component Param Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParamModelImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParamModel()
		 * @generated
		 */
		EClass COMPONENT_PARAM_MODEL = eINSTANCE.getComponentParamModel();

		/**
		 * The meta object literal for the '<em><b>Parametrization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAM_MODEL__PARAMETRIZATION = eINSTANCE.getComponentParamModel_Parametrization();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAM_MODEL__IMPORTS = eINSTANCE.getComponentParamModel_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParametersRefImpl <em>Component Parameters Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParametersRefImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentParametersRef()
		 * @generated
		 */
		EClass COMPONENT_PARAMETERS_REF = eINSTANCE.getComponentParametersRef();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETERS_REF__PARAMETER = eINSTANCE.getComponentParametersRef_Parameter();

		/**
		 * The meta object literal for the '<em><b>Slave</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETERS_REF__SLAVE = eINSTANCE.getComponentParametersRef_Slave();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentRunTimeParameterBaseImpl <em>Component Run Time Parameter Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentRunTimeParameterBaseImpl
		 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterPackageImpl#getComponentRunTimeParameterBase()
		 * @generated
		 */
		EClass COMPONENT_RUN_TIME_PARAMETER_BASE = eINSTANCE.getComponentRunTimeParameterBase();

	}

} //ComponentParameterPackage
