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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.formatting2

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetRepository
import org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage

class ParameterDefinitionFormatter extends BasicAttributesFormatter {
	
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
