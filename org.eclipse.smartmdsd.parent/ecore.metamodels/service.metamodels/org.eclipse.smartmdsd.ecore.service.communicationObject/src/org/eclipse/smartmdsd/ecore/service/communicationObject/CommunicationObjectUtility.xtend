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

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue

class CommunicationObjectUtility extends BasicAttributesModelUtility {
	
	override getValueString(AbstractValue av) {
		if(av instanceof EnumerationValue) {
			return av.value.name
		} else if(av instanceof CommElementValue) {
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
	
	def isComposedType(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			return (attrType.typeName instanceof CommunicationObject)
		}
		return false
	}
	
	def isCommunicationObject(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			switch(attrType.typeName) {
				CommunicationObject: return true
			}
		}
		return false
	}
	
	def isEnumeration(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			switch(attrType.typeName) {
				Enumeration: return true
			}
		}
		return false
	}
	
	def CommunicationObject getCommunicationObjectRef(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			val typeName = attrType.typeName
			switch(typeName) {
				CommunicationObject: return typeName
			}
		}
		return null
	}
	
	def getCommunicationObjects(CommObjectsRepository repo) {
		repo.elements.filter(typeof(CommunicationObject))
	}
	def getEnumerations(CommObjectsRepository repo) {
		repo.elements.filter(typeof(Enumeration))
	}
}
