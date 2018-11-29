/**
 */
package org.ecore.system.causeEffectChain;

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
 * @see org.ecore.system.causeEffectChain.CauseEffectChainFactory
 * @model kind="package"
 * @generated
 */
public interface CauseEffectChainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "causeEffectChain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/CauseEffectChain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CauseEffectChain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CauseEffectChainPackage eINSTANCE = org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl <em>Cuase Effect Chain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getCuaseEffectChainModel()
	 * @generated
	 */
	int CUASE_EFFECT_CHAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUASE_EFFECT_CHAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUASE_EFFECT_CHAIN_MODEL__CHAINS = 1;

	/**
	 * The feature id for the '<em><b>Act Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH = 2;

	/**
	 * The number of structural features of the '<em>Cuase Effect Chain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUASE_EFFECT_CHAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cuase Effect Chain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUASE_EFFECT_CHAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.ActivityChainImpl <em>Activity Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.ActivityChainImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getActivityChain()
	 * @generated
	 */
	int ACTIVITY_CHAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chain Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN__CHAIN_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Desired Min Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Desired Max Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE = 3;

	/**
	 * The number of structural features of the '<em>Activity Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.AbstractChainLinkImpl <em>Abstract Chain Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.AbstractChainLinkImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getAbstractChainLink()
	 * @generated
	 */
	int ABSTRACT_CHAIN_LINK = 2;

	/**
	 * The number of structural features of the '<em>Abstract Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHAIN_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHAIN_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.ActivityLinkImpl <em>Activity Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.ActivityLinkImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getActivityLink()
	 * @generated
	 */
	int ACTIVITY_LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LINK__NAME = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LINK__REF = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LINK_FEATURE_COUNT = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LINK_OPERATION_COUNT = ABSTRACT_CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.InputHandlerLinkImpl <em>Input Handler Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.InputHandlerLinkImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getInputHandlerLink()
	 * @generated
	 */
	int INPUT_HANDLER_LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_LINK__NAME = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_LINK__REF = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Handler Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_LINK_FEATURE_COUNT = ABSTRACT_CHAIN_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Handler Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_LINK_OPERATION_COUNT = ABSTRACT_CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl <em>Max Response Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getMaxResponseTime()
	 * @generated
	 */
	int MAX_RESPONSE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_RESPONSE_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_RESPONSE_TIME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Max Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_RESPONSE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Max Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_RESPONSE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.causeEffectChain.impl.MinResponseTimeImpl <em>Min Response Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.causeEffectChain.impl.MinResponseTimeImpl
	 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getMinResponseTime()
	 * @generated
	 */
	int MIN_RESPONSE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_RESPONSE_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_RESPONSE_TIME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Min Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_RESPONSE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Min Response Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_RESPONSE_TIME_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel <em>Cuase Effect Chain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuase Effect Chain Model</em>'.
	 * @see org.ecore.system.causeEffectChain.CuaseEffectChainModel
	 * @generated
	 */
	EClass getCuaseEffectChainModel();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.causeEffectChain.CuaseEffectChainModel#getName()
	 * @see #getCuaseEffectChainModel()
	 * @generated
	 */
	EAttribute getCuaseEffectChainModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chains</em>'.
	 * @see org.ecore.system.causeEffectChain.CuaseEffectChainModel#getChains()
	 * @see #getCuaseEffectChainModel()
	 * @generated
	 */
	EReference getCuaseEffectChainModel_Chains();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getActArch <em>Act Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Act Arch</em>'.
	 * @see org.ecore.system.causeEffectChain.CuaseEffectChainModel#getActArch()
	 * @see #getCuaseEffectChainModel()
	 * @generated
	 */
	EReference getCuaseEffectChainModel_ActArch();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.ActivityChain <em>Activity Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Chain</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityChain
	 * @generated
	 */
	EClass getActivityChain();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.ActivityChain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityChain#getName()
	 * @see #getActivityChain()
	 * @generated
	 */
	EAttribute getActivityChain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.causeEffectChain.ActivityChain#getChainLinks <em>Chain Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chain Links</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityChain#getChainLinks()
	 * @see #getActivityChain()
	 * @generated
	 */
	EReference getActivityChain_ChainLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.causeEffectChain.ActivityChain#getDesiredMinResponse <em>Desired Min Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desired Min Response</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityChain#getDesiredMinResponse()
	 * @see #getActivityChain()
	 * @generated
	 */
	EReference getActivityChain_DesiredMinResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.causeEffectChain.ActivityChain#getDesiredMaxResponse <em>Desired Max Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desired Max Response</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityChain#getDesiredMaxResponse()
	 * @see #getActivityChain()
	 * @generated
	 */
	EReference getActivityChain_DesiredMaxResponse();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.AbstractChainLink <em>Abstract Chain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Chain Link</em>'.
	 * @see org.ecore.system.causeEffectChain.AbstractChainLink
	 * @generated
	 */
	EClass getAbstractChainLink();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.ActivityLink <em>Activity Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Link</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityLink
	 * @generated
	 */
	EClass getActivityLink();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.ActivityLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityLink#getName()
	 * @see #getActivityLink()
	 * @generated
	 */
	EAttribute getActivityLink_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.causeEffectChain.ActivityLink#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.ecore.system.causeEffectChain.ActivityLink#getRef()
	 * @see #getActivityLink()
	 * @generated
	 */
	EReference getActivityLink_Ref();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.InputHandlerLink <em>Input Handler Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Handler Link</em>'.
	 * @see org.ecore.system.causeEffectChain.InputHandlerLink
	 * @generated
	 */
	EClass getInputHandlerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.InputHandlerLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.causeEffectChain.InputHandlerLink#getName()
	 * @see #getInputHandlerLink()
	 * @generated
	 */
	EAttribute getInputHandlerLink_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.causeEffectChain.InputHandlerLink#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.ecore.system.causeEffectChain.InputHandlerLink#getRef()
	 * @see #getInputHandlerLink()
	 * @generated
	 */
	EReference getInputHandlerLink_Ref();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.MaxResponseTime <em>Max Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Response Time</em>'.
	 * @see org.ecore.system.causeEffectChain.MaxResponseTime
	 * @generated
	 */
	EClass getMaxResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.MaxResponseTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ecore.system.causeEffectChain.MaxResponseTime#getValue()
	 * @see #getMaxResponseTime()
	 * @generated
	 */
	EAttribute getMaxResponseTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.MaxResponseTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.ecore.system.causeEffectChain.MaxResponseTime#getUnit()
	 * @see #getMaxResponseTime()
	 * @generated
	 */
	EAttribute getMaxResponseTime_Unit();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.causeEffectChain.MinResponseTime <em>Min Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Response Time</em>'.
	 * @see org.ecore.system.causeEffectChain.MinResponseTime
	 * @generated
	 */
	EClass getMinResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.MinResponseTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ecore.system.causeEffectChain.MinResponseTime#getValue()
	 * @see #getMinResponseTime()
	 * @generated
	 */
	EAttribute getMinResponseTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.causeEffectChain.MinResponseTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.ecore.system.causeEffectChain.MinResponseTime#getUnit()
	 * @see #getMinResponseTime()
	 * @generated
	 */
	EAttribute getMinResponseTime_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CauseEffectChainFactory getCauseEffectChainFactory();

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
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl <em>Cuase Effect Chain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.CuaseEffectChainModelImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getCuaseEffectChainModel()
		 * @generated
		 */
		EClass CUASE_EFFECT_CHAIN_MODEL = eINSTANCE.getCuaseEffectChainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUASE_EFFECT_CHAIN_MODEL__NAME = eINSTANCE.getCuaseEffectChainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUASE_EFFECT_CHAIN_MODEL__CHAINS = eINSTANCE.getCuaseEffectChainModel_Chains();

		/**
		 * The meta object literal for the '<em><b>Act Arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUASE_EFFECT_CHAIN_MODEL__ACT_ARCH = eINSTANCE.getCuaseEffectChainModel_ActArch();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.ActivityChainImpl <em>Activity Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.ActivityChainImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getActivityChain()
		 * @generated
		 */
		EClass ACTIVITY_CHAIN = eINSTANCE.getActivityChain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_CHAIN__NAME = eINSTANCE.getActivityChain_Name();

		/**
		 * The meta object literal for the '<em><b>Chain Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CHAIN__CHAIN_LINKS = eINSTANCE.getActivityChain_ChainLinks();

		/**
		 * The meta object literal for the '<em><b>Desired Min Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CHAIN__DESIRED_MIN_RESPONSE = eINSTANCE.getActivityChain_DesiredMinResponse();

		/**
		 * The meta object literal for the '<em><b>Desired Max Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CHAIN__DESIRED_MAX_RESPONSE = eINSTANCE.getActivityChain_DesiredMaxResponse();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.AbstractChainLinkImpl <em>Abstract Chain Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.AbstractChainLinkImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getAbstractChainLink()
		 * @generated
		 */
		EClass ABSTRACT_CHAIN_LINK = eINSTANCE.getAbstractChainLink();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.ActivityLinkImpl <em>Activity Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.ActivityLinkImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getActivityLink()
		 * @generated
		 */
		EClass ACTIVITY_LINK = eINSTANCE.getActivityLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LINK__NAME = eINSTANCE.getActivityLink_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LINK__REF = eINSTANCE.getActivityLink_Ref();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.InputHandlerLinkImpl <em>Input Handler Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.InputHandlerLinkImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getInputHandlerLink()
		 * @generated
		 */
		EClass INPUT_HANDLER_LINK = eINSTANCE.getInputHandlerLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_HANDLER_LINK__NAME = eINSTANCE.getInputHandlerLink_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_HANDLER_LINK__REF = eINSTANCE.getInputHandlerLink_Ref();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl <em>Max Response Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.MaxResponseTimeImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getMaxResponseTime()
		 * @generated
		 */
		EClass MAX_RESPONSE_TIME = eINSTANCE.getMaxResponseTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_RESPONSE_TIME__VALUE = eINSTANCE.getMaxResponseTime_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_RESPONSE_TIME__UNIT = eINSTANCE.getMaxResponseTime_Unit();

		/**
		 * The meta object literal for the '{@link org.ecore.system.causeEffectChain.impl.MinResponseTimeImpl <em>Min Response Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.causeEffectChain.impl.MinResponseTimeImpl
		 * @see org.ecore.system.causeEffectChain.impl.CauseEffectChainPackageImpl#getMinResponseTime()
		 * @generated
		 */
		EClass MIN_RESPONSE_TIME = eINSTANCE.getMinResponseTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_RESPONSE_TIME__VALUE = eINSTANCE.getMinResponseTime_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_RESPONSE_TIME__UNIT = eINSTANCE.getMinResponseTime_Unit();

	}

} //CauseEffectChainPackage
