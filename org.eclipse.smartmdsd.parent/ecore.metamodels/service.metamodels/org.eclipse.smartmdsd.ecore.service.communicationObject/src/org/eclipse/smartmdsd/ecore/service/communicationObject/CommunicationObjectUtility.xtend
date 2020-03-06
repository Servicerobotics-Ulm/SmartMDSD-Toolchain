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
