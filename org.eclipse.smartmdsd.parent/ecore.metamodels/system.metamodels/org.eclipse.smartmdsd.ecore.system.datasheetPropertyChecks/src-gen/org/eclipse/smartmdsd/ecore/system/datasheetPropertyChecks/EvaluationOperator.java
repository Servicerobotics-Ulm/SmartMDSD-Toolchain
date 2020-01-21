/**
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#getEvaluationOperator()
 * @model
 * @generated
 */
public enum EvaluationOperator implements Enumerator {
	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(0, "EQ", "=="),

	/**
	 * The '<em><b>NEQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEQ_VALUE
	 * @generated
	 * @ordered
	 */
	NEQ(1, "NEQ", "!="),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(2, "LT", "<"),

	/**
	 * The '<em><b>LET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LET_VALUE
	 * @generated
	 * @ordered
	 */
	LET(3, "LET", "<="),

	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(4, "GET", ">="),

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(5, "GT", ">"),

	/**
	 * The '<em><b>COMPATIBLE TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPATIBLE_TO_VALUE
	 * @generated
	 * @ordered
	 */
	COMPATIBLE_TO(6, "COMPATIBLE_TO", "COMPATIBLE_TO");

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model literal="=="
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 0;

	/**
	 * The '<em><b>NEQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEQ
	 * @model literal="!="
	 * @generated
	 * @ordered
	 */
	public static final int NEQ_VALUE = 1;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 2;

	/**
	 * The '<em><b>LET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LET
	 * @model literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int LET_VALUE = 3;

	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 4;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 5;

	/**
	 * The '<em><b>COMPATIBLE TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPATIBLE_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_TO_VALUE = 6;

	/**
	 * An array of all the '<em><b>Evaluation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationOperator[] VALUES_ARRAY = new EvaluationOperator[] { EQ, NEQ, LT, LET, GET, GT,
			COMPATIBLE_TO, };

	/**
	 * A public read-only list of all the '<em><b>Evaluation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator get(int value) {
		switch (value) {
		case EQ_VALUE:
			return EQ;
		case NEQ_VALUE:
			return NEQ;
		case LT_VALUE:
			return LT;
		case LET_VALUE:
			return LET;
		case GET_VALUE:
			return GET;
		case GT_VALUE:
			return GT;
		case COMPATIBLE_TO_VALUE:
			return COMPATIBLE_TO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaluationOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EvaluationOperator
