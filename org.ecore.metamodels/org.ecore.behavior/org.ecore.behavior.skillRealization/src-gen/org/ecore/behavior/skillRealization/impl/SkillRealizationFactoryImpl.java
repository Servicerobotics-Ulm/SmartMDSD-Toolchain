/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.behavior.skillRealization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillRealizationFactoryImpl extends EFactoryImpl implements SkillRealizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SkillRealizationFactory init() {
		try {
			SkillRealizationFactory theSkillRealizationFactory = (SkillRealizationFactory) EPackage.Registry.INSTANCE
					.getEFactory(SkillRealizationPackage.eNS_URI);
			if (theSkillRealizationFactory != null) {
				return theSkillRealizationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SkillRealizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL:
			return createSkillRealizationModel();
		case SkillRealizationPackage.SKILL_REALIZATION_SET:
			return createSkillRealizationSet();
		case SkillRealizationPackage.SKILL_REALIZATION:
			return createSkillRealization();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationModel createSkillRealizationModel() {
		SkillRealizationModelImpl skillRealizationModel = new SkillRealizationModelImpl();
		return skillRealizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationSet createSkillRealizationSet() {
		SkillRealizationSetImpl skillRealizationSet = new SkillRealizationSetImpl();
		return skillRealizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealization createSkillRealization() {
		SkillRealizationImpl skillRealization = new SkillRealizationImpl();
		return skillRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationPackage getSkillRealizationPackage() {
		return (SkillRealizationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SkillRealizationPackage getPackage() {
		return SkillRealizationPackage.eINSTANCE;
	}

} //SkillRealizationFactoryImpl
