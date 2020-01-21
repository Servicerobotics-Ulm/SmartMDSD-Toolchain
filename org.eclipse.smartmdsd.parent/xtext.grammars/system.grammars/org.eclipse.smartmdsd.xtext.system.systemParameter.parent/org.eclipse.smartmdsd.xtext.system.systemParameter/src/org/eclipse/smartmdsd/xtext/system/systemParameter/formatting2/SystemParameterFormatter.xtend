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
