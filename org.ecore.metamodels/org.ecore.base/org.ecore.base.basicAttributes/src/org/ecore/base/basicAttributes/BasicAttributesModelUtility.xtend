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
