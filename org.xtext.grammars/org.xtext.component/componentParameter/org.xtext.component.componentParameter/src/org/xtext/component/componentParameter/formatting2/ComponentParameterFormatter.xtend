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
package org.xtext.component.componentParameter.formatting2

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.component.componentParameter.AbstractComponentParameter
import org.ecore.component.componentParameter.ComponentParamModel
import org.ecore.service.parameterDefinition.ParamDefRepoImport
import org.xtext.service.parameterDefinition.formatting2.ParameterDefinitionFormatter
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.component.componentParameter.ComponentParameter

class ComponentParameterFormatter extends ParameterDefinitionFormatter {
	

	def dispatch void format(ComponentParamModel componentParamModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ParamDefRepoImport paramDefRepoImport : componentParamModel.getImports()) {
			paramDefRepoImport.append[newLine]
			paramDefRepoImport.format;
		}
		componentParamModel.getParametrization.format;
	}

	def dispatch void format(ComponentParameter componentParameter, extension IFormattableDocument document) {
		val ropen = componentParameter.regionFor.keyword("{")
		val rclose = componentParameter.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		for (AbstractComponentParameter abstractComponentParameter : componentParameter.getParameters()) {
			abstractComponentParameter.format;
			abstractComponentParameter.append[setNewLines(1,1,2)]
			val open = abstractComponentParameter.regionFor.keyword("{")
			val close = abstractComponentParameter.regionFor.keyword("}")
			open.prepend[newLine]
			open.append[newLine]
			interior(open, close)[indent]
		}
	}
	
	def dispatch void format(ParameterSetInstance paramSet, extension IFormattableDocument document) {
		for(param: paramSet.parameterInstances) {
			param.format
			param.append[setNewLines(1,1,2)]
		}
	}
	
	def dispatch void format(ParameterInstance param, extension IFormattableDocument document) {
		val open = param.regionFor.keyword("{")
		val close = param.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
		
		for(attr: param.attributes) {
			attr.regionFor.keyword("=").surround[oneSpace]
			attr.append[setNewLines(1,1,2)]
			attr.format
		}
	}
}
