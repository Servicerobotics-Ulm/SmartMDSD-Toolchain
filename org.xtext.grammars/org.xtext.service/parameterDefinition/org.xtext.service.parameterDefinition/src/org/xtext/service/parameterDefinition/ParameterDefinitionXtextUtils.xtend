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
package org.xtext.service.parameterDefinition

import org.ecore.service.parameterDefinition.ParameterDefinitionModelUtility
import com.google.inject.Inject
import org.ecore.service.parameterDefinition.ParameterSetDefinition

class ParameterDefinitionXtextUtils extends ParameterDefinitionModelUtility {
	@Inject extension ParameterDefinitionDefaultLib lib;
	
	override getParameterSetHierarchy(ParameterSetDefinition param) {
		val visited = super.getParameterSetHierarchy(param)
		// add the default StateSet library
		val object = lib.getDefaultParameterSetObject(param)
		if(object !== null) {
			visited.add(object)
		}
		return visited;
	}
}