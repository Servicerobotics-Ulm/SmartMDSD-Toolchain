/**
 */
package org.ecore.component.performanceExtension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

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
 * @see org.ecore.component.performanceExtension.PerformanceExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface PerformanceExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "performanceExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/component/PerformanceExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PerformanceExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformanceExtensionPackage eINSTANCE = org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.ActivationConstraintsImpl <em>Activation Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.ActivationConstraintsImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getActivationConstraints()
	 * @generated
	 */
	int ACTIVATION_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONSTRAINTS__CONFIGURABLE = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activation Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONSTRAINTS_FEATURE_COUNT = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.InputLinkExtensionImpl <em>Input Link Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.InputLinkExtensionImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getInputLinkExtension()
	 * @generated
	 */
	int INPUT_LINK_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION__NAME = ComponentDefinitionPackage.INPUT_PORT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION__OPTIONAL = ComponentDefinitionPackage.INPUT_PORT_LINK__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION__INPUT_PORT = ComponentDefinitionPackage.INPUT_PORT_LINK__INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Oversampling Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION__OVERSAMPLING_OK = ComponentDefinitionPackage.INPUT_PORT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undersampling Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION__UNDERSAMPLING_OK = ComponentDefinitionPackage.INPUT_PORT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Link Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_LINK_EXTENSION_FEATURE_COUNT = ComponentDefinitionPackage.INPUT_PORT_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.DefaultTriggerImpl <em>Default Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.DefaultTriggerImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultTrigger()
	 * @generated
	 */
	int DEFAULT_TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Default Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_TRIGGER_FEATURE_COUNT = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl <em>Default Input Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultInputTrigger()
	 * @generated
	 */
	int DEFAULT_INPUT_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Input Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INPUT_TRIGGER__INPUT_LINK = DEFAULT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INPUT_TRIGGER__PRESCALE = DEFAULT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Input Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INPUT_TRIGGER_FEATURE_COUNT = DEFAULT_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.DefaultPeriodicTimerImpl <em>Default Periodic Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.DefaultPeriodicTimerImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultPeriodicTimer()
	 * @generated
	 */
	int DEFAULT_PERIODIC_TIMER = 4;

	/**
	 * The feature id for the '<em><b>Periodic Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PERIODIC_TIMER__PERIODIC_ACT_FREQ = DEFAULT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Periodic Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PERIODIC_TIMER_FEATURE_COUNT = DEFAULT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.component.performanceExtension.impl.DefaultObservedElementTriggerImpl <em>Default Observed Element Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.performanceExtension.impl.DefaultObservedElementTriggerImpl
	 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultObservedElementTrigger()
	 * @generated
	 */
	int DEFAULT_OBSERVED_ELEMENT_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT = DEFAULT_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Observed Element Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_OBSERVED_ELEMENT_TRIGGER_FEATURE_COUNT = DEFAULT_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.ActivationConstraints <em>Activation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Constraints</em>'.
	 * @see org.ecore.component.performanceExtension.ActivationConstraints
	 * @generated
	 */
	EClass getActivationConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.ActivationConstraints#isConfigurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configurable</em>'.
	 * @see org.ecore.component.performanceExtension.ActivationConstraints#isConfigurable()
	 * @see #getActivationConstraints()
	 * @generated
	 */
	EAttribute getActivationConstraints_Configurable();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.ActivationConstraints#getMinActFreq <em>Min Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Act Freq</em>'.
	 * @see org.ecore.component.performanceExtension.ActivationConstraints#getMinActFreq()
	 * @see #getActivationConstraints()
	 * @generated
	 */
	EAttribute getActivationConstraints_MinActFreq();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.ActivationConstraints#getMaxActFreq <em>Max Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Act Freq</em>'.
	 * @see org.ecore.component.performanceExtension.ActivationConstraints#getMaxActFreq()
	 * @see #getActivationConstraints()
	 * @generated
	 */
	EAttribute getActivationConstraints_MaxActFreq();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.InputLinkExtension <em>Input Link Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Link Extension</em>'.
	 * @see org.ecore.component.performanceExtension.InputLinkExtension
	 * @generated
	 */
	EClass getInputLinkExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.InputLinkExtension#isOversamplingOk <em>Oversampling Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oversampling Ok</em>'.
	 * @see org.ecore.component.performanceExtension.InputLinkExtension#isOversamplingOk()
	 * @see #getInputLinkExtension()
	 * @generated
	 */
	EAttribute getInputLinkExtension_OversamplingOk();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.InputLinkExtension#isUndersamplingOk <em>Undersampling Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undersampling Ok</em>'.
	 * @see org.ecore.component.performanceExtension.InputLinkExtension#isUndersamplingOk()
	 * @see #getInputLinkExtension()
	 * @generated
	 */
	EAttribute getInputLinkExtension_UndersamplingOk();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.DefaultTrigger <em>Default Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Trigger</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultTrigger
	 * @generated
	 */
	EClass getDefaultTrigger();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.DefaultInputTrigger <em>Default Input Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Input Trigger</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultInputTrigger
	 * @generated
	 */
	EClass getDefaultInputTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.performanceExtension.DefaultInputTrigger#getInputLink <em>Input Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Link</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultInputTrigger#getInputLink()
	 * @see #getDefaultInputTrigger()
	 * @generated
	 */
	EReference getDefaultInputTrigger_InputLink();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.DefaultInputTrigger#getPrescale <em>Prescale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescale</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultInputTrigger#getPrescale()
	 * @see #getDefaultInputTrigger()
	 * @generated
	 */
	EAttribute getDefaultInputTrigger_Prescale();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.DefaultPeriodicTimer <em>Default Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Periodic Timer</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultPeriodicTimer
	 * @generated
	 */
	EClass getDefaultPeriodicTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.performanceExtension.DefaultPeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodic Act Freq</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultPeriodicTimer#getPeriodicActFreq()
	 * @see #getDefaultPeriodicTimer()
	 * @generated
	 */
	EAttribute getDefaultPeriodicTimer_PeriodicActFreq();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.performanceExtension.DefaultObservedElementTrigger <em>Default Observed Element Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Observed Element Trigger</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultObservedElementTrigger
	 * @generated
	 */
	EClass getDefaultObservedElementTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement()
	 * @see #getDefaultObservedElementTrigger()
	 * @generated
	 */
	EReference getDefaultObservedElementTrigger_Element();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PerformanceExtensionFactory getPerformanceExtensionFactory();

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
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.ActivationConstraintsImpl <em>Activation Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.ActivationConstraintsImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getActivationConstraints()
		 * @generated
		 */
		EClass ACTIVATION_CONSTRAINTS = eINSTANCE.getActivationConstraints();

		/**
		 * The meta object literal for the '<em><b>Configurable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONSTRAINTS__CONFIGURABLE = eINSTANCE.getActivationConstraints_Configurable();

		/**
		 * The meta object literal for the '<em><b>Min Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ = eINSTANCE.getActivationConstraints_MinActFreq();

		/**
		 * The meta object literal for the '<em><b>Max Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ = eINSTANCE.getActivationConstraints_MaxActFreq();

		/**
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.InputLinkExtensionImpl <em>Input Link Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.InputLinkExtensionImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getInputLinkExtension()
		 * @generated
		 */
		EClass INPUT_LINK_EXTENSION = eINSTANCE.getInputLinkExtension();

		/**
		 * The meta object literal for the '<em><b>Oversampling Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_LINK_EXTENSION__OVERSAMPLING_OK = eINSTANCE.getInputLinkExtension_OversamplingOk();

		/**
		 * The meta object literal for the '<em><b>Undersampling Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_LINK_EXTENSION__UNDERSAMPLING_OK = eINSTANCE.getInputLinkExtension_UndersamplingOk();

		/**
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.DefaultTriggerImpl <em>Default Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.DefaultTriggerImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultTrigger()
		 * @generated
		 */
		EClass DEFAULT_TRIGGER = eINSTANCE.getDefaultTrigger();

		/**
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl <em>Default Input Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.DefaultInputTriggerImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultInputTrigger()
		 * @generated
		 */
		EClass DEFAULT_INPUT_TRIGGER = eINSTANCE.getDefaultInputTrigger();

		/**
		 * The meta object literal for the '<em><b>Input Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_INPUT_TRIGGER__INPUT_LINK = eINSTANCE.getDefaultInputTrigger_InputLink();

		/**
		 * The meta object literal for the '<em><b>Prescale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_INPUT_TRIGGER__PRESCALE = eINSTANCE.getDefaultInputTrigger_Prescale();

		/**
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.DefaultPeriodicTimerImpl <em>Default Periodic Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.DefaultPeriodicTimerImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultPeriodicTimer()
		 * @generated
		 */
		EClass DEFAULT_PERIODIC_TIMER = eINSTANCE.getDefaultPeriodicTimer();

		/**
		 * The meta object literal for the '<em><b>Periodic Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PERIODIC_TIMER__PERIODIC_ACT_FREQ = eINSTANCE.getDefaultPeriodicTimer_PeriodicActFreq();

		/**
		 * The meta object literal for the '{@link org.ecore.component.performanceExtension.impl.DefaultObservedElementTriggerImpl <em>Default Observed Element Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.performanceExtension.impl.DefaultObservedElementTriggerImpl
		 * @see org.ecore.component.performanceExtension.impl.PerformanceExtensionPackageImpl#getDefaultObservedElementTrigger()
		 * @generated
		 */
		EClass DEFAULT_OBSERVED_ELEMENT_TRIGGER = eINSTANCE.getDefaultObservedElementTrigger();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT = eINSTANCE.getDefaultObservedElementTrigger_Element();

	}

} //PerformanceExtensionPackage
