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
package org.ecore.service.communicationObject

import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.AbstractValue
import org.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.ecore.base.basicAttributes.EnumerationValue
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.SingleValue
import org.ecore.base.basicAttributes.BasicAttributesFactory

class CommunicationObjectTypeConformance extends BasicAttributesTypeConformance {
	
	override createPrimitiveDefaultValue(AbstractAttributeType attrType) {
		var SingleValue value = null
		if(attrType instanceof CommElementReference) {
			val typeName = attrType.typeName
			if(typeName instanceof CommunicationObject) {
				val commElemValue = CommunicationObjectFactory.eINSTANCE.createCommElementValue
				commElemValue.value = typeName
				value = commElemValue
			} else if(typeName instanceof Enumeration) {
				val en = BasicAttributesFactory.eINSTANCE.createEnumerationValue
				en.value = typeName.enums.head
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
		} else {
			super.createPrimitiveDefaultValue(attrType)
		}
	}
	
	override protected checkCompatibility(AbstractAttributeType attrType, AbstractValue av) {
		// check if basic types match
		var compatible = false;
		if(attrType instanceof CommElementReference) {
			val refType = attrType.typeName
			if(refType instanceof Enumeration) {
				if(av instanceof EnumerationValue) {
					compatible = refType.enums.exists[it.name==av.value.name]
				}
			} else if(refType instanceof CommunicationObject) {
				if(av instanceof CommElementValue) {
					compatible = (av.value.name == attrType.typeName.name)
				}	
			}
		} else {
			compatible = super.checkCompatibility(attrType, av)
		}
		return compatible;
	}
	
	override getValueTypeName(AbstractValue av) {
		var arrayPrefix = "a value-type "
		if(av.eContainer instanceof ArrayValue) arrayPrefix = "an array value-type "
		if(av instanceof CommElementValue) {
			"'"+av.value.name+"'"
		} else {
			super.getValueTypeName(av)
		}
	}
	
	override getCardinalityName(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			if(attrType.array !== null) {
				"an array of type '"+attrType.typeName.name+"'"
			} else {
				"an element of type '"+attrType.typeName.name+"'"
			}
		} else {
			super.getCardinalityName(attrType)
		}
	}
	
}