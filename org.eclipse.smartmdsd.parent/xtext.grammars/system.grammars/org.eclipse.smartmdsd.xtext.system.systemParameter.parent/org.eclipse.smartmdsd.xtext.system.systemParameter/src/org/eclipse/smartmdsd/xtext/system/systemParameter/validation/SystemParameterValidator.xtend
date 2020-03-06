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
package org.eclipse.smartmdsd.xtext.system.systemParameter.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SystemParameterValidator extends AbstractSystemParameterValidator {
	protected static val SYS_PARAM_ISSUE_PREFIX = "org.xtext.system.systemParameter."
	public static val INVALID_COMP_PARAM = SYS_PARAM_ISSUE_PREFIX+"InvalidComponentParameter"
	
	
	@Check
	def checkComponentParameter(ComponentParameterInstance instance) {
		val componentParams = instance.componentInstance.component.elements.filter(ComponentParametersRef).head
		if(componentParams !== null) {
			if(!instance.componentParam.equals(componentParams.parameter)) {
				error("Invalid ComponentParameter",
					SystemParameterPackage.Literals.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM,
					INVALID_COMP_PARAM,
					componentParams.parameter.name
				)
			}
		}
	}
	
}
