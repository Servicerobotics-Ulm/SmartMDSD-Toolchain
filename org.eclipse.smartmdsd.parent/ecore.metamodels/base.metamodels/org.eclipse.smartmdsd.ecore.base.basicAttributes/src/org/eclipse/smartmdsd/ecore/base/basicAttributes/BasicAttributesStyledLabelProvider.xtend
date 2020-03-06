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
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.ecore.base.basicAttributes

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
					arrayString = arrayString + attr.type.array.length
				}
				arrayString = arrayString + "]"
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
