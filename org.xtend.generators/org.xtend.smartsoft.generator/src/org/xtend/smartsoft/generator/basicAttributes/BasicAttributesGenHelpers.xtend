//--------------------------------------------------------------------------
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        ZAFH Servicerobotic Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------
package org.xtend.smartsoft.generator.basicAttributes

import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.PrimitiveType
import org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.ecore.base.basicAttributes.InlineEnumerationType
import org.ecore.base.basicAttributes.AttributeDefinition

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