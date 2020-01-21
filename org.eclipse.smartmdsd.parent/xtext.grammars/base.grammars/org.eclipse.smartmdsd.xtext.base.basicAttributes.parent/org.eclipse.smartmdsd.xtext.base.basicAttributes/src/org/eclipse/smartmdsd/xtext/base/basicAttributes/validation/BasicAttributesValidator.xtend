//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3.
//
//================================================================
package org.eclipse.smartmdsd.xtext.base.basicAttributes.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BasicAttributesValidator extends AbstractBasicAttributesValidator {
	
	@Inject BasicAttributesTypeConformance conf
	
	protected static val ISSUE_PREFIX = "org.xtext.service.communicationObject."
	public static val INCOMPATIBLE_TYPES = ISSUE_PREFIX + "IncompatibleTypes"
	public static val INCOMPATIBLE_CARDINALITY = ISSUE_PREFIX + "IncompatibleCardinality"
	public static val SMALL_ATTR_NAME = ISSUE_PREFIX + "SmallAttributeName"
	public static val CPP_KEYWORD_ATTR_NAME = ISSUE_PREFIX + "CppKeywordAttributeName"
	public static val RESERVED_ENUM_NAME = ISSUE_PREFIX + "ReservedEnumName"
	
	def Boolean isCompatible(AbstractValue av, AbstractAttributeType type) {
		return conf.isCompatible(av, type)
	}
	
	@Check
	def void checkTypeConformance(AbstractValue av) {
		var parent = av.eContainer
		if(parent instanceof ArrayValue) {
			parent = parent.eContainer
		}
		if(parent instanceof AttributeDefinition) {
			if(!av.isCompatible(parent.type)) {
				error("Incompatible types. Expected "+conf.getCardinalityName(parent.type)+
					", but assigned is "+conf.getValueTypeName(av)+".",
					null, INCOMPATIBLE_TYPES
				)	
			}
		} else if(parent instanceof AttributeRefinement) {
			if(!av.isCompatible(parent.attribute.type)) {
				error("Incompatible types. Expected "+conf.getCardinalityName(parent.attribute.type)+
					", but assigned is "+conf.getValueTypeName(av)+".",
					null, INCOMPATIBLE_TYPES
				)	
			}
		}
	}
	
	@Check
	def void checkCardinality(AbstractValue av) {
		var parent = av.eContainer
		if(parent instanceof ArrayValue) {
			parent = parent.eContainer
		}
		if(av instanceof ArrayValue) {
			var AbstractAttributeType type = null
			if(parent instanceof AttributeDefinition) {
				type = parent.type
			} else if(parent instanceof AttributeRefinement) {
				type = parent.attribute.type
			}
			if(type !== null && type.array !== null) {
				val numberValues = av.values.length
				val length = type.array.length
				if(length !== null && length != "*") {
					val arrayLength = Integer.valueOf(length)
					if(numberValues > arrayLength) {
						error("Array length mismatch. Assigned array-value of size "+numberValues+
							" to a static array-type of size "+length+".",
							null, INCOMPATIBLE_CARDINALITY
						)
					}
				}
			}
		}
	}
	
	@Check
	def checkAttributeStartsWithSmallLetter(AttributeDefinition attr) {
		if(!Character.isLowerCase(attr.getName().charAt(0))) {
			warning("Element name should start with a small letter!", 
				BasicAttributesPackage.Literals.ATTRIBUTE_DEFINITION__NAME,
				SMALL_ATTR_NAME
			);
		}
	}
	
	@Check
	def checkCppReservedKeywords(AttributeDefinition elem) {
		if(BasicAttributesTypeConformance.cppKeywords.contains(elem.name)) {
			error("Element name must not be a C++ reserved keyword.",
				BasicAttributesPackage.Literals.ATTRIBUTE_DEFINITION__NAME,
				CPP_KEYWORD_ATTR_NAME
			)
		}
	}
	
	@Check
	def checkEnumNameNotDefaultValue(EnumerationElement en) {
		if(en.name.equals("ENUM_VALUE_UNDEFINED")) {
			error("This EnumerationElement is not allowed (it is reserved for internal usage).", 
				BasicAttributesPackage.Literals.ENUMERATION_ELEMENT__NAME,
				RESERVED_ENUM_NAME
			);
		}
	}
	
}
