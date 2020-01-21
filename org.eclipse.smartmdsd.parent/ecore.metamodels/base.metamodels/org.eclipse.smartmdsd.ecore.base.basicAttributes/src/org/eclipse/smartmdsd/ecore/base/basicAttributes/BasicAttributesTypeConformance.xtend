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
package org.eclipse.smartmdsd.ecore.base.basicAttributes

class BasicAttributesTypeConformance {
	public static val IMLICIT_DEFAULT_ENUM = "ENUM_VALUE_UNDEFINED"
	
	// list of reserved C++ Keywords taken from:
	// http://de.cppreference.com/w/cpp/keyword
	public static val cppKeywords = 
		#["alignas", "alignof", "and", "and_eq", "asm", "auto", "bitand", "bitor", "bool", "break",
			"case", "catch", "char", "char16_t", "char32_t", "class", "compl", "const", "constexpr",
			"const_cast", "continue", "decltype", "default", "delete", "do", "double", "dynamic_cast",
			"else", "enum", "explicit", "export", "extern", "false", "float", "for", "friend", "goto",
			"if", "inline", "int", "long", "mutable", "namespace", "new", "noexcept", "not", "not_eq",
			"nullptr", "operator", "or", "or_eq", "private", "protected", "public", "register", 
			"reinterpret_cast", "return", "short", "signed", "sizeof", "static", "static_assert",
			"static_cast", "struct", "switch", "template", "this", "thread_local", "throw", "true",
			"try", "typedef", "typeid", "typename", "union", "unsigned", "using", "virtual", "void",
			"volatile", "wchar_t", "while", "xor", "xor_eq"
		]
	
	
	def AbstractValue createPrimitiveDefaultValue(AbstractAttributeType attrType) {
		var SingleValue value= null;
		if(attrType instanceof PrimitiveType) {
			val typeName = attrType.typeName
			if(typeName <= PRIMITIVE_TYPE_NAME.INT64) {
				val intVal = BasicAttributesFactory.eINSTANCE.createIntValue
				intVal.value = 0;
				value = intVal
			} else if(typeName <= PRIMITIVE_TYPE_NAME.DOUBLE) {
				val dblVal = BasicAttributesFactory.eINSTANCE.createFloatingPointValue
				dblVal.value = 0.0
				value =dblVal
			} else if(typeName == PRIMITIVE_TYPE_NAME.STRING) {
				val strVal = BasicAttributesFactory.eINSTANCE.createStringValue
				strVal.value = "Text"
				value = strVal
			} else if(typeName == PRIMITIVE_TYPE_NAME.BOOLEAN) {
				val boolVal = BasicAttributesFactory.eINSTANCE.createBoolValue
				boolVal.value = false
				value = boolVal
			}
		} else if(attrType instanceof InlineEnumerationType) {
			val en = BasicAttributesFactory.eINSTANCE.createEnumerationValue
			en.value = attrType.enums.head
			value = en
		}
		if(attrType.array !== null) {
			val arrayValue = BasicAttributesFactory.eINSTANCE.createArrayValue
			if(value !== null) {
				arrayValue.values.add(value)
			}
			return arrayValue
		} else {
			return value
		}
	}
	
	def isCompatible(AbstractValue av, AbstractAttributeType attrType) {
		if(attrType.array !== null) {
			if(av instanceof ArrayValue) {
				// skip checking compatibility for the array-value because individual 
				// elements of that array will be checked in the next runs anyway
				return true
			} else if(av.eContainer instanceof ArrayValue) {
				return attrType.checkCompatibility(av)
			}
		} else {
			// not array-type
			return attrType.checkCompatibility(av)
		}
		return false
	}
	
	def protected checkCompatibility(AbstractAttributeType attrType, AbstractValue av) {
		// check if basic types match
		var compatible = false;
		if(attrType instanceof PrimitiveType) {
			val typeName = attrType.typeName
			if(typeName <= PRIMITIVE_TYPE_NAME.UINT64) {
				if(av instanceof IntValue) {
					compatible = (av.value >= 0)
				}
			} else if(typeName <= PRIMITIVE_TYPE_NAME.INT64) {
				compatible = (av instanceof IntValue)
			} else if(typeName <= PRIMITIVE_TYPE_NAME.DOUBLE) {
				// int-value is also compatible with a double-type 
				compatible = (
					(av instanceof FloatingPointValue) ||
					(av instanceof IntValue)
				)
			} else if(typeName == PRIMITIVE_TYPE_NAME.STRING) {
				compatible = (av instanceof StringValue)
			} else if(typeName == PRIMITIVE_TYPE_NAME.BOOLEAN) {
				compatible = (av instanceof BoolValue)
			}			
		} else if(attrType instanceof InlineEnumerationType) {
			if(av instanceof EnumerationValue) {
				compatible = attrType.enums.exists[en|en.name==av.value.name]
			} else {
				compatible = false
			}
		}
		return compatible;
	}
	
	def String getValueTypeName(AbstractValue av) {
		var arrayPrefix = "a value-type "
		if(av.eContainer instanceof ArrayValue) arrayPrefix = "an array value-type "
		switch (av) {
			IntValue case av.value < 0: arrayPrefix+"'negative number'"
			IntValue case av.value >= 0: arrayPrefix+"'number'"
			FloatingPointValue: arrayPrefix+"'floating point'"
			StringValue: arrayPrefix+"'string'"
			BoolValue: arrayPrefix+"'boolean'"
			EnumerationValue: arrayPrefix+"'EnumerationValue'"
			ArrayValue: av.values.head?.valueTypeName
		}
	}
	
	def String getCardinalityName(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType case attrType.array !== null: "an array of type '"+attrType.typeName+"'"
			PrimitiveType case attrType.array === null: "an element of type '"+attrType.typeName+"'"
			InlineEnumerationType case attrType.array !== null: "an array of type 'InlineEnumeration'"
			InlineEnumerationType case attrType.array === null: "an element of type 'InlineEnumeration'"
		}
	}
}
