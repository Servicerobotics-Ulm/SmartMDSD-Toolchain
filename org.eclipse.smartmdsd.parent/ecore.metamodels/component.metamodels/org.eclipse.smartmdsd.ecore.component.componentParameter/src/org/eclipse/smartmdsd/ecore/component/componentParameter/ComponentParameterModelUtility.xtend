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
package org.eclipse.smartmdsd.ecore.component.componentParameter

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionModelUtility

class ComponentParameterModelUtility extends ParameterDefinitionModelUtility {
	def getReferencedAttributes(AbstractParameterInstance instance) {
		if(instance instanceof ParameterInstance) {
			return instance.parameterDef?.attributes
		} else if(instance instanceof TriggerInstance) {
			return instance.triggerDef?.attributes
		}
	}
	
	def Iterable<AttributeDefinition> getAttributeDefs(ComponentParameterBase param) {
		switch(param) {
			InternalParameter: param.attributes
			ExtendedParameter: param.attributes
			ParameterInstance: param.attributes.map[attribute]
		}
	}
}
