/**
 */
package org.ecore.system.datasheetPropertyChecks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.datasheetPropertyChecks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasheetPropertyChecksFactoryImpl extends EFactoryImpl implements DatasheetPropertyChecksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasheetPropertyChecksFactory init() {
		try {
			DatasheetPropertyChecksFactory theDatasheetPropertyChecksFactory = (DatasheetPropertyChecksFactory) EPackage.Registry.INSTANCE
					.getEFactory(DatasheetPropertyChecksPackage.eNS_URI);
			if (theDatasheetPropertyChecksFactory != null) {
				return theDatasheetPropertyChecksFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasheetPropertyChecksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasheetPropertyChecksFactoryImpl() {
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
		case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL:
			return createSystemDatasheetPropertyChecksModel();
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK:
			return createDatasheetPropertyCheck();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DatasheetPropertyChecksPackage.EVALUATION_FUNCTION:
			return createEvaluationFunctionFromString(eDataType, initialValue);
		case DatasheetPropertyChecksPackage.EVALUATION_OPERATOR:
			return createEvaluationOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DatasheetPropertyChecksPackage.EVALUATION_FUNCTION:
			return convertEvaluationFunctionToString(eDataType, instanceValue);
		case DatasheetPropertyChecksPackage.EVALUATION_OPERATOR:
			return convertEvaluationOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemDatasheetPropertyChecksModel createSystemDatasheetPropertyChecksModel() {
		SystemDatasheetPropertyChecksModelImpl systemDatasheetPropertyChecksModel = new SystemDatasheetPropertyChecksModelImpl();
		return systemDatasheetPropertyChecksModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasheetPropertyCheck createDatasheetPropertyCheck() {
		DatasheetPropertyCheckImpl datasheetPropertyCheck = new DatasheetPropertyCheckImpl();
		return datasheetPropertyCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationFunction createEvaluationFunctionFromString(EDataType eDataType, String initialValue) {
		EvaluationFunction result = EvaluationFunction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationOperator createEvaluationOperatorFromString(EDataType eDataType, String initialValue) {
		EvaluationOperator result = EvaluationOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasheetPropertyChecksPackage getDatasheetPropertyChecksPackage() {
		return (DatasheetPropertyChecksPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasheetPropertyChecksPackage getPackage() {
		return DatasheetPropertyChecksPackage.eINSTANCE;
	}

} //DatasheetPropertyChecksFactoryImpl
