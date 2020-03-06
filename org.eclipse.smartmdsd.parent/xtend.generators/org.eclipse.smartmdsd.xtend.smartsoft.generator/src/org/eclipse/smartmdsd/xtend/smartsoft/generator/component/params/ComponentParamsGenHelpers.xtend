/********************************************************************************
 * Copyright (c) 2013 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component.params

import org.eclipse.smartmdsd.xtend.smartsoft.generator.basicAttributes.BasicAttributesGenHelpers
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.AbstractParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger
import org.eclipse.emf.common.util.EList
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue

class ComponentParamsGenHelpers extends BasicAttributesGenHelpers {
	
	override compileAttributeParentTypeName(AttributeDefinition attr) {
//		println("attr: "+attr)
		val parent = attr.eContainer
		switch (parent) {
			AbstractParameter: parent.name
			InternalParameter: parent.name
			ExtendedParameter: parent.name
			ExtendedTrigger: parent.name
			default: ""
		}
	}
	
	def getInternalNameValues(EList<AttributeRefinement> dvs, boolean isConst) {
		var result = ""
		for(dv: dvs) {
			if(isConst) {
				result = result + "const " + dv.attribute.compileCppType + " &" + dv.attribute.name
			} else {
				result = result + dv.attribute.compileCppType + " &" + dv.attribute.name
			}
			if(dv != dvs.last) {
				result = result + ", "
			}
		}
		return result
	}

	def getNameTypes(EList<AttributeDefinition> attrs, boolean isConst) {
		var result = ""
		for(attr: attrs) {
			if(isConst) {
				result = result + "const " + attr.compileCppType + " &" + attr.name
			} else {
				result = result + attr.compileCppType + " &" + attr.name
			}
			if(attr != attrs.last) {
				result = result + ", "
			}
		}
		return result
	}
	
	def getNames(EList<AttributeRefinement> dvs) {
		var result = ""
		for(dv: dvs) {
			result = result + dv.attribute.name
			if(dv != dvs.last) {
				result = result + ", "
			}
		}
		return result
	}
	def getNtNames(EList<AttributeDefinition> attrs) {
		var result = ""
		for(attr: attrs) {
			result = result + attr.name
			if(attr != attrs.last) {
				result = result + ", "
			}
		}
		return result
	}

	
	def compileParamHandlerCppType(AbstractAttributeType type) {
		if(type instanceof InlineEnumerationType) {
			return "std::string"
		} else {
			return type.compileCppType
		}
	}

	def String compileCommObjType(AttributeDefinition attr) {
		val type = attr.type
		switch(type) {
			PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.INT64: "Integer"
			PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.DOUBLE: "Double"
			PrimitiveType case type.typeName == PRIMITIVE_TYPE_NAME.STRING: "String"
			PrimitiveType case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: "Boolean"
			InlineEnumerationType: "String"
			default: "String"
		}
	}
	
	def compileContent(AbstractValue v) {
		var String result = ""
		switch(v) {
			IntValue: result = v.value.toString
			FloatingPointValue: result = v.value.toString
			BoolValue: result = v.value.toString
			StringValue: result = '''"«v.value»"'''
			EnumerationValue: {
				var parent = v.eContainer
				if(parent instanceof AttributeDefinition) {
					//result = parent.compileAttributeParentTypeName + "::"+v.value.name
					result = parent.compileCppType + "::"+v.value.name
//					println("attr-def result: "+result)
				} else if(parent instanceof AttributeRefinement) {
					result = parent.attribute.compileCppType + "::"+v.value.name
//					println("attr-ref result: "+result)
				}
			}
			ArrayValue: {
				result = '''#warning "array values are not implemented"'''
			}
		}
		return result
	}
	
	
	def getStandardValue(AttributeDefinition attr) 
	{
		if(attr.type.array !== null) {
			return '''std::list<«attr.compileCppType»>()'''
		} else {
			val type = attr.type
			switch(type) {
				PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.INT64: return '''0'''
				PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.DOUBLE: return '''0.0'''
				PrimitiveType case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: return '''false'''
				InlineEnumerationType: return '''""'''
				default: return '''""'''
			}
		}
	}
	
	def getValue(SingleValue v) {
		switch(v) {
			IntValue: v.value
			FloatingPointValue: v.value
			BoolValue: v.value
			StringValue: v.value
			EnumerationValue: v.value.name
		}
	}
	def getDefaultValue(AbstractAttributeType type) {
		switch(type) {
			PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.INT64: '''0'''
			PrimitiveType case type.typeName <= PRIMITIVE_TYPE_NAME.DOUBLE: '''0.0'''
			PrimitiveType case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: '''false'''
			InlineEnumerationType: '''ENUM_VALUE_UNDEFINED'''
			default: '''# empty string'''
		}
	}
}