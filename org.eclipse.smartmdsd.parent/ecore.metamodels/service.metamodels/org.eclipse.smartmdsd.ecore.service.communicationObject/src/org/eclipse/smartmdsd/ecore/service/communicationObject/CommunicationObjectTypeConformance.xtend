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
package org.eclipse.smartmdsd.ecore.service.communicationObject

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesFactory
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue

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
//		var arrayPrefix = "a value-type "
//		if(av.eContainer instanceof ArrayValue) arrayPrefix = "an array value-type "
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
