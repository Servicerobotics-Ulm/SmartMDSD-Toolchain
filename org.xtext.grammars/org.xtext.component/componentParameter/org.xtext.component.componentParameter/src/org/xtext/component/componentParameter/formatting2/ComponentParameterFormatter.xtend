//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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
