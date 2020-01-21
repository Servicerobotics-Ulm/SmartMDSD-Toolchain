/**
 */
package org.eclipse.smartmdsd.ecore.service.communicationPattern;

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
 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationPatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicationPattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/service/communicationPattern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "communicationPattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPatternPackage eINSTANCE = org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternImpl <em>Communication Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getCommunicationPattern()
	 * @generated
	 */
	int COMMUNICATION_PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATTERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.OneWayCommunicationPatternImpl <em>One Way Communication Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.OneWayCommunicationPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getOneWayCommunicationPattern()
	 * @generated
	 */
	int ONE_WAY_COMMUNICATION_PATTERN = 8;

	/**
	 * The number of structural features of the '<em>One Way Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_PATTERN_FEATURE_COUNT = COMMUNICATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Way Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_COMMUNICATION_PATTERN_OPERATION_COUNT = COMMUNICATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.ForkingPatternImpl <em>Forking Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.ForkingPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getForkingPattern()
	 * @generated
	 */
	int FORKING_PATTERN = 5;

	/**
	 * The number of structural features of the '<em>Forking Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_PATTERN_FEATURE_COUNT = ONE_WAY_COMMUNICATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forking Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKING_PATTERN_OPERATION_COUNT = ONE_WAY_COMMUNICATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.PushPatternImpl <em>Push Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.PushPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getPushPattern()
	 * @generated
	 */
	int PUSH_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_PATTERN__DATA_TYPE = FORKING_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Push Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_PATTERN_FEATURE_COUNT = FORKING_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Push Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_PATTERN_OPERATION_COUNT = FORKING_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.TwoWayCommunicationPatternImpl <em>Two Way Communication Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.TwoWayCommunicationPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getTwoWayCommunicationPattern()
	 * @generated
	 */
	int TWO_WAY_COMMUNICATION_PATTERN = 9;

	/**
	 * The number of structural features of the '<em>Two Way Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_PATTERN_FEATURE_COUNT = COMMUNICATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Way Communication Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_COMMUNICATION_PATTERN_OPERATION_COUNT = COMMUNICATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.RequestAnswerPatternImpl <em>Request Answer Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.RequestAnswerPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getRequestAnswerPattern()
	 * @generated
	 */
	int REQUEST_ANSWER_PATTERN = 7;

	/**
	 * The number of structural features of the '<em>Request Answer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_PATTERN_FEATURE_COUNT = TWO_WAY_COMMUNICATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Answer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ANSWER_PATTERN_OPERATION_COUNT = TWO_WAY_COMMUNICATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.QueryPatternImpl <em>Query Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.QueryPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getQueryPattern()
	 * @generated
	 */
	int QUERY_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PATTERN__REQUEST_TYPE = REQUEST_ANSWER_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PATTERN__ANSWER_TYPE = REQUEST_ANSWER_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PATTERN_FEATURE_COUNT = REQUEST_ANSWER_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Query Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PATTERN_OPERATION_COUNT = REQUEST_ANSWER_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl <em>Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getEventPattern()
	 * @generated
	 */
	int EVENT_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__EVENT_TYPE = FORKING_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__ACTIVATION_TYPE = FORKING_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event State Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__EVENT_STATE_TYPE = FORKING_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN_FEATURE_COUNT = FORKING_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN_OPERATION_COUNT = FORKING_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.JoiningPatternImpl <em>Joining Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.JoiningPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getJoiningPattern()
	 * @generated
	 */
	int JOINING_PATTERN = 6;

	/**
	 * The number of structural features of the '<em>Joining Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_PATTERN_FEATURE_COUNT = ONE_WAY_COMMUNICATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Joining Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINING_PATTERN_OPERATION_COUNT = ONE_WAY_COMMUNICATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.SendPatternImpl <em>Send Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.SendPatternImpl
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getSendPattern()
	 * @generated
	 */
	int SEND_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PATTERN__DATA_TYPE = JOINING_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PATTERN_FEATURE_COUNT = JOINING_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PATTERN_OPERATION_COUNT = JOINING_PATTERN_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern <em>Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern
	 * @generated
	 */
	EClass getCommunicationPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern <em>Push Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern
	 * @generated
	 */
	EClass getPushPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern#getDataType()
	 * @see #getPushPattern()
	 * @generated
	 */
	EReference getPushPattern_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern <em>Query Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern
	 * @generated
	 */
	EClass getQueryPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern#getRequestType()
	 * @see #getQueryPattern()
	 * @generated
	 */
	EReference getQueryPattern_RequestType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern#getAnswerType <em>Answer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answer Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern#getAnswerType()
	 * @see #getQueryPattern()
	 * @generated
	 */
	EReference getQueryPattern_AnswerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern
	 * @generated
	 */
	EClass getEventPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getEventType()
	 * @see #getEventPattern()
	 * @generated
	 */
	EReference getEventPattern_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getActivationType()
	 * @see #getEventPattern()
	 * @generated
	 */
	EReference getEventPattern_ActivationType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getEventStateType <em>Event State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event State Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern#getEventStateType()
	 * @see #getEventPattern()
	 * @generated
	 */
	EReference getEventPattern_EventStateType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern <em>Send Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern
	 * @generated
	 */
	EClass getSendPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern#getDataType()
	 * @see #getSendPattern()
	 * @generated
	 */
	EReference getSendPattern_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern <em>Forking Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forking Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern
	 * @generated
	 */
	EClass getForkingPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.JoiningPattern <em>Joining Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joining Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.JoiningPattern
	 * @generated
	 */
	EClass getJoiningPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern <em>Request Answer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Answer Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern
	 * @generated
	 */
	EClass getRequestAnswerPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern <em>One Way Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Way Communication Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern
	 * @generated
	 */
	EClass getOneWayCommunicationPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.TwoWayCommunicationPattern <em>Two Way Communication Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Way Communication Pattern</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.TwoWayCommunicationPattern
	 * @generated
	 */
	EClass getTwoWayCommunicationPattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationPatternFactory getCommunicationPatternFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternImpl <em>Communication Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getCommunicationPattern()
		 * @generated
		 */
		EClass COMMUNICATION_PATTERN = eINSTANCE.getCommunicationPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.PushPatternImpl <em>Push Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.PushPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getPushPattern()
		 * @generated
		 */
		EClass PUSH_PATTERN = eINSTANCE.getPushPattern();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_PATTERN__DATA_TYPE = eINSTANCE.getPushPattern_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.QueryPatternImpl <em>Query Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.QueryPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getQueryPattern()
		 * @generated
		 */
		EClass QUERY_PATTERN = eINSTANCE.getQueryPattern();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PATTERN__REQUEST_TYPE = eINSTANCE.getQueryPattern_RequestType();

		/**
		 * The meta object literal for the '<em><b>Answer Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PATTERN__ANSWER_TYPE = eINSTANCE.getQueryPattern_AnswerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl <em>Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.EventPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getEventPattern()
		 * @generated
		 */
		EClass EVENT_PATTERN = eINSTANCE.getEventPattern();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PATTERN__EVENT_TYPE = eINSTANCE.getEventPattern_EventType();

		/**
		 * The meta object literal for the '<em><b>Activation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PATTERN__ACTIVATION_TYPE = eINSTANCE.getEventPattern_ActivationType();

		/**
		 * The meta object literal for the '<em><b>Event State Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PATTERN__EVENT_STATE_TYPE = eINSTANCE.getEventPattern_EventStateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.SendPatternImpl <em>Send Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.SendPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getSendPattern()
		 * @generated
		 */
		EClass SEND_PATTERN = eINSTANCE.getSendPattern();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PATTERN__DATA_TYPE = eINSTANCE.getSendPattern_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.ForkingPatternImpl <em>Forking Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.ForkingPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getForkingPattern()
		 * @generated
		 */
		EClass FORKING_PATTERN = eINSTANCE.getForkingPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.JoiningPatternImpl <em>Joining Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.JoiningPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getJoiningPattern()
		 * @generated
		 */
		EClass JOINING_PATTERN = eINSTANCE.getJoiningPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.RequestAnswerPatternImpl <em>Request Answer Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.RequestAnswerPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getRequestAnswerPattern()
		 * @generated
		 */
		EClass REQUEST_ANSWER_PATTERN = eINSTANCE.getRequestAnswerPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.OneWayCommunicationPatternImpl <em>One Way Communication Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.OneWayCommunicationPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getOneWayCommunicationPattern()
		 * @generated
		 */
		EClass ONE_WAY_COMMUNICATION_PATTERN = eINSTANCE.getOneWayCommunicationPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.TwoWayCommunicationPatternImpl <em>Two Way Communication Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.TwoWayCommunicationPatternImpl
		 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.impl.CommunicationPatternPackageImpl#getTwoWayCommunicationPattern()
		 * @generated
		 */
		EClass TWO_WAY_COMMUNICATION_PATTERN = eINSTANCE.getTwoWayCommunicationPattern();

	}

} //CommunicationPatternPackage
