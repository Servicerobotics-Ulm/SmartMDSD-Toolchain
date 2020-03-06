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
 * A representation of the literals of the enumeration '<em><b>Default Datasheet Properties</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage#getDefaultDatasheetProperties()
 * @model
 * @generated
 */
public enum DefaultDatasheetProperties implements Enumerator {
	/**
	 * The '<em><b>Homepage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMEPAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HOMEPAGE(0, "Homepage", "Homepage"),

	/**
	 * The '<em><b>Spdx License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPDX_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	SPDX_LICENSE(1, "SpdxLicense", "SpdxLicense"),

	/**
	 * The '<em><b>Proprietary License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIETARY_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	PROPRIETARY_LICENSE(2, "ProprietaryLicense", "ProprietaryLicense"),

	/**
	 * The '<em><b>Purpose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPOSE(3, "Purpose", "Purpose"),

	/**
	 * The '<em><b>Technology Readiness Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_READINESS_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGY_READINESS_LEVEL(5, "TechnologyReadinessLevel", "TechnologyReadinessLevel"),

	/**
	 * The '<em><b>Supplier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLIER_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLIER(5, "Supplier", "Supplier");

	/**
	 * The '<em><b>Homepage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMEPAGE
	 * @model name="Homepage"
	 * @generated
	 * @ordered
	 */
	public static final int HOMEPAGE_VALUE = 0;

	/**
	 * The '<em><b>Spdx License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPDX_LICENSE
	 * @model name="SpdxLicense"
	 * @generated
	 * @ordered
	 */
	public static final int SPDX_LICENSE_VALUE = 1;

	/**
	 * The '<em><b>Proprietary License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIETARY_LICENSE
	 * @model name="ProprietaryLicense"
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETARY_LICENSE_VALUE = 2;

	/**
	 * The '<em><b>Purpose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPOSE
	 * @model name="Purpose"
	 * @generated
	 * @ordered
	 */
	public static final int PURPOSE_VALUE = 3;

	/**
	 * The '<em><b>Technology Readiness Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_READINESS_LEVEL
	 * @model name="TechnologyReadinessLevel"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGY_READINESS_LEVEL_VALUE = 5;

	/**
	 * The '<em><b>Supplier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLIER
	 * @model name="Supplier"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLIER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Default Datasheet Properties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefaultDatasheetProperties[] VALUES_ARRAY = new DefaultDatasheetProperties[] { HOMEPAGE,
			SPDX_LICENSE, PROPRIETARY_LICENSE, PURPOSE, TECHNOLOGY_READINESS_LEVEL, SUPPLIER, };

	/**
	 * A public read-only list of all the '<em><b>Default Datasheet Properties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefaultDatasheetProperties> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Default Datasheet Properties</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultDatasheetProperties get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultDatasheetProperties result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Datasheet Properties</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultDatasheetProperties getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultDatasheetProperties result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Datasheet Properties</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DefaultDatasheetProperties get(int value) {
		switch (value) {
		case HOMEPAGE_VALUE:
			return HOMEPAGE;
		case SPDX_LICENSE_VALUE:
			return SPDX_LICENSE;
		case PROPRIETARY_LICENSE_VALUE:
			return PROPRIETARY_LICENSE;
		case PURPOSE_VALUE:
			return PURPOSE;
		case TECHNOLOGY_READINESS_LEVEL_VALUE:
			return TECHNOLOGY_READINESS_LEVEL;
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
	private DefaultDatasheetProperties(int value, String name, String literal) {
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

} //DefaultDatasheetProperties
