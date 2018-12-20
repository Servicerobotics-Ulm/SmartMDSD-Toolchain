/**
 */
package org.ecore.behavior.skillRealization;

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
 * @see org.ecore.behavior.skillRealization.SkillRealizationFactory
 * @model kind="package"
 * @generated
 */
public interface SkillRealizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skillRealization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/behavior/SkillRealization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SkillRealization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkillRealizationPackage eINSTANCE = org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationModel()
	 * @generated
	 */
	int SKILL_REALIZATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Skillsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL__SKILLSETS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationSet()
	 * @generated
	 */
	int SKILL_REALIZATION_SET = 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_SET__SKILLS = 0;

	/**
	 * The feature id for the '<em><b>Skill Def Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_SET__SKILL_DEF_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_SET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationImpl <em>Skill Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationImpl
	 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealization()
	 * @generated
	 */
	int SKILL_REALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Skill Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION__SKILL_DEF = 0;

	/**
	 * The number of structural features of the '<em>Skill Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Skill Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.behavior.skillRealization.SkillRealizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationModel
	 * @generated
	 */
	EClass getSkillRealizationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.behavior.skillRealization.SkillRealizationModel#getSkillsets <em>Skillsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skillsets</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationModel#getSkillsets()
	 * @see #getSkillRealizationModel()
	 * @generated
	 */
	EReference getSkillRealizationModel_Skillsets();

	/**
	 * Returns the meta object for class '{@link org.ecore.behavior.skillRealization.SkillRealizationSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationSet
	 * @generated
	 */
	EClass getSkillRealizationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationSet#getSkills()
	 * @see #getSkillRealizationSet()
	 * @generated
	 */
	EReference getSkillRealizationSet_Skills();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getSkillDefSet <em>Skill Def Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Def Set</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationSet#getSkillDefSet()
	 * @see #getSkillRealizationSet()
	 * @generated
	 */
	EReference getSkillRealizationSet_SkillDefSet();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationSet#getName()
	 * @see #getSkillRealizationSet()
	 * @generated
	 */
	EAttribute getSkillRealizationSet_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.behavior.skillRealization.SkillRealization <em>Skill Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Realization</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealization
	 * @generated
	 */
	EClass getSkillRealization();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.behavior.skillRealization.SkillRealization#getSkillDef <em>Skill Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Def</em>'.
	 * @see org.ecore.behavior.skillRealization.SkillRealization#getSkillDef()
	 * @see #getSkillRealization()
	 * @generated
	 */
	EReference getSkillRealization_SkillDef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkillRealizationFactory getSkillRealizationFactory();

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
		 * The meta object literal for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationModel()
		 * @generated
		 */
		EClass SKILL_REALIZATION_MODEL = eINSTANCE.getSkillRealizationModel();

		/**
		 * The meta object literal for the '<em><b>Skillsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION_MODEL__SKILLSETS = eINSTANCE.getSkillRealizationModel_Skillsets();

		/**
		 * The meta object literal for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationSetImpl
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationSet()
		 * @generated
		 */
		EClass SKILL_REALIZATION_SET = eINSTANCE.getSkillRealizationSet();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION_SET__SKILLS = eINSTANCE.getSkillRealizationSet_Skills();

		/**
		 * The meta object literal for the '<em><b>Skill Def Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION_SET__SKILL_DEF_SET = eINSTANCE.getSkillRealizationSet_SkillDefSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_REALIZATION_SET__NAME = eINSTANCE.getSkillRealizationSet_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.behavior.skillRealization.impl.SkillRealizationImpl <em>Skill Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationImpl
		 * @see org.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealization()
		 * @generated
		 */
		EClass SKILL_REALIZATION = eINSTANCE.getSkillRealization();

		/**
		 * The meta object literal for the '<em><b>Skill Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION__SKILL_DEF = eINSTANCE.getSkillRealization_SkillDef();

	}

} //SkillRealizationPackage
