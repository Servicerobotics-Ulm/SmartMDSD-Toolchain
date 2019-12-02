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
package org.ecore.service.communicationObject

import org.ecore.base.basicAttributes.BasicAttributesStyledLabelProvider
import org.ecore.base.basicAttributes.AbstractValue
import org.ecore.base.basicAttributes.AbstractAttributeType

class CommunicationObjectStyledLabelProvider extends BasicAttributesStyledLabelProvider {
	override getValueString(AbstractValue av) {
		if(av instanceof CommElementValue) {
			return av.value.name
		} else {
			super.getValueString(av)
		}
	}


	override getTypeName(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			return attrType.typeName.name
		} else {
			super.getTypeName(attrType)
		}
	}
}
