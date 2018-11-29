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

import org.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.AbstractValue
import org.ecore.base.basicAttributes.EnumerationValue

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