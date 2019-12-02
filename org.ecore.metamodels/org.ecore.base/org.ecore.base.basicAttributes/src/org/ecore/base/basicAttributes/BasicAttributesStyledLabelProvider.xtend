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

import org.eclipse.jface.viewers.StyledString

class BasicAttributesStyledLabelProvider {
	def String getValueString(AbstractValue av) {
		switch (av) {
			IntValue: av.value.toString
			FloatingPointValue: av.value.toString
			StringValue: av.value
			BoolValue: av.value.toString
			EnumerationValue: av.value.name
			ArrayValue: "["+av.values?.map[it.valueString].join(", ")+"]"
		}
	}
	
	def getTypeName(AbstractAttributeType attrType) {
		switch (attrType) {
			PrimitiveType: attrType.typeName.literal
			InlineEnumerationType: "InlineEnumeration"
		}
	}
	
	def getEnumerationElementStyledString(EnumerationElement en) {
		val text = new StyledString(en.name, StyledString.QUALIFIER_STYLER)
		if(en.value != 0) {
			text.append(new StyledString(" = "+en.value.toString, StyledString.DECORATIONS_STYLER))
		}
		return text
	}
	
	def getAttributeStyledString(AttributeDefinition attr) {
		var text = new StyledString(attr.name, StyledString.QUALIFIER_STYLER)
		if(attr.type !== null) {
			val typeString = new StyledString(
				": " + attr.type.typeName,
				StyledString.DECORATIONS_STYLER
			)
			text.append(typeString)
			if(attr.type.array !== null) {
				var arrayString = " ["
				if(attr.type.array.length !== null) {
					arrayString += attr.type.array.length
				}
				arrayString += "]"
				text.append(new StyledString(arrayString, StyledString.DECORATIONS_STYLER))
			}
		}
		if(attr.defaultvalue !== null) {
			val attrValueString = new StyledString(
				" = "+attr.defaultvalue.valueString,
				StyledString.QUALIFIER_STYLER
			)
			text.append(attrValueString)
		}
		return text
	}
}
