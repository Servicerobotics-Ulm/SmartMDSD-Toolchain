/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.smartsoft.generator.basicAttributes

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition

abstract class BasicAttributesGenHelpers {
	
	def String compileCppType(AbstractAttributeType type) {
		if(type instanceof PrimitiveType) {
			switch (type) {
				case type.typeName == PRIMITIVE_TYPE_NAME.INT8: "char"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT16: "short"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT32: "int"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT64: "long int"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT8: "unsigned char"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT16: "unsigned short"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT32: "unsigned int"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT64: "unsigned long int"
				case type.typeName == PRIMITIVE_TYPE_NAME.FLOAT: "float"
				case type.typeName == PRIMITIVE_TYPE_NAME.DOUBLE: "double"
				case type.typeName == PRIMITIVE_TYPE_NAME.STRING: "std::string"
				case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: "bool"
			}
		} else if(type instanceof InlineEnumerationType) {
			type.compileInlineEnumCppType
		}
	}
	
	def String compileInlineEnumCppType(InlineEnumerationType en) {
		var attribute = en.eContainer
		if(attribute instanceof AttributeDefinition) {
			val parentName = attribute.compileAttributeParentTypeName
			return '''«parentName»Type::«attribute.name»Type'''
		}
		return '''#warning "type InlineEnumerationType is not (yet) implemented"'''
	}
	
	def String compileCppType(AttributeDefinition attr) {
		return attr.type.compileCppType
	}
	
	def abstract String compileAttributeParentTypeName(AttributeDefinition attr);	
}