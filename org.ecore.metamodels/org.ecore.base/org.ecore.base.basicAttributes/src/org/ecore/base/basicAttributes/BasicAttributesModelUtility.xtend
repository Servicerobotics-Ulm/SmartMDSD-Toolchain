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
package org.ecore.base.basicAttributes

import java.util.Collection
import java.util.List

class BasicAttributesModelUtility {
	def String getValueString(AbstractValue av) {
		switch (av) {
			IntValue: av.value.toString
			FloatingPointValue: av.value.toString
			StringValue: '"'+av.value+'"'
			BoolValue: av.value.toString
			EnumerationValue: av.value.name
			ArrayValue: "["+av.values?.map[it.valueString].join(", ")+"]"
		}
	}
	
	def Iterable<String> getDefaultValuesFor(AbstractAttributeType type) {
		var List<String> textList = newArrayList
		if(type instanceof PrimitiveType) {
			switch(type.typeName) {
				case type.typeName <= PRIMITIVE_TYPE_NAME.INT64: textList.add("0")
				case type.typeName == PRIMITIVE_TYPE_NAME.FLOAT: textList.add("1.0")
				case type.typeName == PRIMITIVE_TYPE_NAME.DOUBLE: textList.addAll("1.0", "0")
				case type.typeName == PRIMITIVE_TYPE_NAME.STRING: textList.add('"Text"')
				case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: textList.addAll("true", "false")
			}
		} else if(type instanceof InlineEnumerationType) {
			for(en: type.enums) {
				textList.add(en.name)
			}
		}
		return textList
	}
	
	def getTypeName(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType: attrType.typeName.literal
			InlineEnumerationType: "InlineEnumeration"
		}
	}
	
	def isOctetType(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::UINT8: true
			default: false
		}
	}
	def isRealType(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::FLOAT: true
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::DOUBLE: true
			default: false
		}
	}
	def isBooleanType(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::BOOLEAN: true
			default: false
		}
	}
	def isStringType(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::STRING: true
			default: false
		}
	}
	
	def isLonglongType(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::INT64: true
			PrimitiveType case attrType.typeName == PRIMITIVE_TYPE_NAME::UINT64: true
			default: false
		}
	}
	
	def Boolean isArrayType(AttributeDefinition attr) {
		return (attr.type.array !== null)
	}
	def Boolean haveEnums(Collection<AttributeDefinition> attributes) {
		return attributes.exists[it.type instanceof InlineEnumerationType]
	}
}