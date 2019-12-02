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
package org.xtext.system.systemParameter.validation

import org.eclipse.xtext.validation.Check
import org.ecore.system.systemParameter.ComponentParameterInstance
import org.ecore.component.componentParameter.ComponentParametersRef
import org.ecore.system.systemParameter.SystemParameterPackage

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
