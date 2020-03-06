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
package org.eclipse.smartmdsd.xtext.system.systemParameter.formatting2

import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel
import org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class SystemParameterFormatter extends BasicAttributesFormatter {
	
//	@Inject extension SystemParameterGrammarAccess

	def dispatch void format(SystemParamModel systemParamModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (componentParameterInstance : systemParamModel.components) {
			componentParameterInstance.format
		}
	}

	def dispatch void format(ComponentParameterInstance componentParameterInstance, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (parameterRefinement : componentParameterInstance.parameters) {
			parameterRefinement.format
		}
	}
	
	// TODO: implement for ParameterRefinement
}
