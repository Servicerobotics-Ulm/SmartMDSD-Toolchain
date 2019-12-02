/**
 */
package org.ecore.component.componentDatasheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Default Properties</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheetDefaultProperties()
 * @model
 * @generated
 */
public enum ComponentDatasheetDefaultProperties implements Enumerator {
	/**
	 * The '<em><b>Hardware Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE_REQUIREMENT(1, "HardwareRequirement", "HardwareRequirement");

	/**
	 * The '<em><b>Hardware Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hardware Requirement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_REQUIREMENT
	 * @model name="HardwareRequirement"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_REQUIREMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Default Properties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentDatasheetDefaultProperties[] VALUES_ARRAY = new ComponentDatasheetDefaultProperties[] {
			HARDWARE_REQUIREMENT, };

	/**
	 * A public read-only list of all the '<em><b>Default Properties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentDatasheetDefaultProperties> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Default Properties</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDatasheetDefaultProperties get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentDatasheetDefaultProperties result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Properties</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDatasheetDefaultProperties getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentDatasheetDefaultProperties result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Properties</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDatasheetDefaultProperties get(int value) {
		switch (value) {
		case HARDWARE_REQUIREMENT_VALUE:
			return HARDWARE_REQUIREMENT;
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
	private ComponentDatasheetDefaultProperties(int value, String name, String literal) {
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

} //ComponentDatasheetDefaultProperties
