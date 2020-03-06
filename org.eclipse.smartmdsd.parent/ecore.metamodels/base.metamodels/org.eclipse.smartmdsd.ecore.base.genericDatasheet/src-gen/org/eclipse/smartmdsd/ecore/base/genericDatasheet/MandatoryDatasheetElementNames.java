/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.base.genericDatasheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mandatory Datasheet Element Names</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage#getMandatoryDatasheetElementNames()
 * @model
 * @generated
 */
public enum MandatoryDatasheetElementNames implements Enumerator {
	/**
	 * The '<em><b>Base URI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_URI_VALUE
	 * @generated
	 * @ordered
	 */
	BASE_URI(0, "BaseURI", "BaseURI"),

	/**
	 * The '<em><b>Short Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_DESCRIPTION(1, "ShortDescription", "ShortDescription");

	/**
	 * The '<em><b>Base URI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_URI
	 * @model name="BaseURI"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_URI_VALUE = 0;

	/**
	 * The '<em><b>Short Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_DESCRIPTION
	 * @model name="ShortDescription"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_DESCRIPTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Mandatory Datasheet Element Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MandatoryDatasheetElementNames[] VALUES_ARRAY = new MandatoryDatasheetElementNames[] {
			BASE_URI, SHORT_DESCRIPTION, };

	/**
	 * A public read-only list of all the '<em><b>Mandatory Datasheet Element Names</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MandatoryDatasheetElementNames> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mandatory Datasheet Element Names</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryDatasheetElementNames get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MandatoryDatasheetElementNames result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mandatory Datasheet Element Names</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryDatasheetElementNames getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MandatoryDatasheetElementNames result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mandatory Datasheet Element Names</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MandatoryDatasheetElementNames get(int value) {
		switch (value) {
		case BASE_URI_VALUE:
			return BASE_URI;
		case SHORT_DESCRIPTION_VALUE:
			return SHORT_DESCRIPTION;
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
	private MandatoryDatasheetElementNames(int value, String name, String literal) {
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

} //MandatoryDatasheetElementNames
