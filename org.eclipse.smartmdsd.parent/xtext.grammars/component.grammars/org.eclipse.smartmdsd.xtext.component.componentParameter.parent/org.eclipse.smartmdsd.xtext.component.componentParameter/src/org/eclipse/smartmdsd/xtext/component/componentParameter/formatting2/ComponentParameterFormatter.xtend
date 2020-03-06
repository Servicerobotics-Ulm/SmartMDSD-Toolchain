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
package org.eclipse.smartmdsd.xtext.component.componentParameter.formatting2

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.component.componentParameter.AbstractComponentParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParamModel
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefRepoImport
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.formatting2.ParameterDefinitionFormatter

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
