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
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware;

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
 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewareFactory
 * @model kind="package"
 * @generated
 */
public interface RoboticMiddlewarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roboticMiddleware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/service/roboticMiddleware";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roboticMiddleware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboticMiddlewarePackage eINSTANCE = org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewareImpl <em>Robotic Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewareImpl
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getRoboticMiddleware()
	 * @generated
	 */
	int ROBOTIC_MIDDLEWARE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_MIDDLEWARE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Robotic Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_MIDDLEWARE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Robotic Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_MIDDLEWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.ACE_SmartSoftImpl <em>ACE Smart Soft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.ACE_SmartSoftImpl
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getACE_SmartSoft()
	 * @generated
	 */
	int ACE_SMART_SOFT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACE_SMART_SOFT__DESCRIPTION = ROBOTIC_MIDDLEWARE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>ACE Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACE_SMART_SOFT_FEATURE_COUNT = ROBOTIC_MIDDLEWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ACE Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACE_SMART_SOFT_OPERATION_COUNT = ROBOTIC_MIDDLEWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.OpcUa_SeRoNetImpl <em>Opc Ua Se Ro Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.OpcUa_SeRoNetImpl
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getOpcUa_SeRoNet()
	 * @generated
	 */
	int OPC_UA_SE_RO_NET = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_SE_RO_NET__DESCRIPTION = ROBOTIC_MIDDLEWARE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Opc Ua Se Ro Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_SE_RO_NET_FEATURE_COUNT = ROBOTIC_MIDDLEWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opc Ua Se Ro Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_SE_RO_NET_OPERATION_COUNT = ROBOTIC_MIDDLEWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.CORBA_SmartSoftImpl <em>CORBA Smart Soft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.CORBA_SmartSoftImpl
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getCORBA_SmartSoft()
	 * @generated
	 */
	int CORBA_SMART_SOFT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORBA_SMART_SOFT__DESCRIPTION = ROBOTIC_MIDDLEWARE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>CORBA Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORBA_SMART_SOFT_FEATURE_COUNT = ROBOTIC_MIDDLEWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CORBA Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORBA_SMART_SOFT_OPERATION_COUNT = ROBOTIC_MIDDLEWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.DDS_SmartSoftImpl <em>DDS Smart Soft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.DDS_SmartSoftImpl
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getDDS_SmartSoft()
	 * @generated
	 */
	int DDS_SMART_SOFT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SMART_SOFT__DESCRIPTION = ROBOTIC_MIDDLEWARE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DDS Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SMART_SOFT_FEATURE_COUNT = ROBOTIC_MIDDLEWARE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DDS Smart Soft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDS_SMART_SOFT_OPERATION_COUNT = ROBOTIC_MIDDLEWARE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware <em>Robotic Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Middleware</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware
	 * @generated
	 */
	EClass getRoboticMiddleware();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware#getDescription()
	 * @see #getRoboticMiddleware()
	 * @generated
	 */
	EAttribute getRoboticMiddleware_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft <em>ACE Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACE Smart Soft</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft
	 * @generated
	 */
	EClass getACE_SmartSoft();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet <em>Opc Ua Se Ro Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opc Ua Se Ro Net</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet
	 * @generated
	 */
	EClass getOpcUa_SeRoNet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.CORBA_SmartSoft <em>CORBA Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORBA Smart Soft</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.CORBA_SmartSoft
	 * @generated
	 */
	EClass getCORBA_SmartSoft();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft <em>DDS Smart Soft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDS Smart Soft</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft
	 * @generated
	 */
	EClass getDDS_SmartSoft();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoboticMiddlewareFactory getRoboticMiddlewareFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewareImpl <em>Robotic Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewareImpl
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getRoboticMiddleware()
		 * @generated
		 */
		EClass ROBOTIC_MIDDLEWARE = eINSTANCE.getRoboticMiddleware();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_MIDDLEWARE__DESCRIPTION = eINSTANCE.getRoboticMiddleware_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.ACE_SmartSoftImpl <em>ACE Smart Soft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.ACE_SmartSoftImpl
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getACE_SmartSoft()
		 * @generated
		 */
		EClass ACE_SMART_SOFT = eINSTANCE.getACE_SmartSoft();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.OpcUa_SeRoNetImpl <em>Opc Ua Se Ro Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.OpcUa_SeRoNetImpl
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getOpcUa_SeRoNet()
		 * @generated
		 */
		EClass OPC_UA_SE_RO_NET = eINSTANCE.getOpcUa_SeRoNet();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.CORBA_SmartSoftImpl <em>CORBA Smart Soft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.CORBA_SmartSoftImpl
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getCORBA_SmartSoft()
		 * @generated
		 */
		EClass CORBA_SMART_SOFT = eINSTANCE.getCORBA_SmartSoft();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.DDS_SmartSoftImpl <em>DDS Smart Soft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.DDS_SmartSoftImpl
		 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl.RoboticMiddlewarePackageImpl#getDDS_SmartSoft()
		 * @generated
		 */
		EClass DDS_SMART_SOFT = eINSTANCE.getDDS_SmartSoft();

	}

} //RoboticMiddlewarePackage
