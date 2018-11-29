//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.base.basicAttributes.validation

import com.google.inject.Inject
import org.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.eclipse.xtext.validation.Check
import org.ecore.base.basicAttributes.AbstractValue
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.BasicAttributesPackage
import org.ecore.base.basicAttributes.EnumerationElement
import org.ecore.base.basicAttributes.AttributeRefinement
import org.ecore.base.basicAttributes.AbstractAttributeType

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
