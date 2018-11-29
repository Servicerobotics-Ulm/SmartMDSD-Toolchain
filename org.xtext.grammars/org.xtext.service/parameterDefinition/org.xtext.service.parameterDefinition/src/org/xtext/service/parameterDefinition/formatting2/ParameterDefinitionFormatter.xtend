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
package org.xtext.service.parameterDefinition.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.service.parameterDefinition.ParamDefModel
import org.ecore.service.parameterDefinition.ParameterSetDefinition
import org.ecore.service.parameterDefinition.ParameterSetRepository
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage

class ParameterDefinitionFormatter extends AbstractFormatter2 {
	
//	@Inject extension ParameterDefinitionGrammarAccess

	def dispatch void format(ParamDefModel paramDefModel, extension IFormattableDocument document) {
		for(import: paramDefModel.imports) {
			import.format
			import.append[newLine]
		}
		
		paramDefModel.getRepository?.format;
	}

	def dispatch void format(ParameterSetRepository parameterSetRepository, extension IFormattableDocument document) {
		val ropen = parameterSetRepository.regionFor.keyword("{")
		val rclose = parameterSetRepository.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]

		for (ParameterSetDefinition parameterSetDefinition : parameterSetRepository.getSets()) {
			parameterSetDefinition.format;
			parameterSetDefinition.regionFor.feature(ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION__NAME).surround[oneSpace]
			parameterSetDefinition.append[setNewLines(1,1,2)]
			val open = parameterSetDefinition.regionFor.keyword("{")
			val close = parameterSetDefinition.regionFor.keyword("}")
			open.prepend[newLine]
			open.append[newLine]
			interior(open, close)[indent]
		}
	}
}
