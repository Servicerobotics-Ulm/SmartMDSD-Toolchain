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
