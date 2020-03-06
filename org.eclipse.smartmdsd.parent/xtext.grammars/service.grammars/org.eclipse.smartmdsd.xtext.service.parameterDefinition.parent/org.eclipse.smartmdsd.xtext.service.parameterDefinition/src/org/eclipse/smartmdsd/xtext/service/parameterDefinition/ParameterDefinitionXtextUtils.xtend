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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionModelUtility
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition

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