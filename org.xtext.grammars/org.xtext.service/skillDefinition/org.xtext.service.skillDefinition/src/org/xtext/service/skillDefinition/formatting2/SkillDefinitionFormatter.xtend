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
package org.xtext.service.skillDefinition.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.service.skillDefinition.SkillDefinitionRepository
import org.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.xtext.service.skillDefinition.services.SkillDefinitionGrammarAccess
import org.ecore.service.skillDefinition.SkillDefinitionModel
import org.ecore.service.skillDefinition.CoordinationModuleDefinition

class SkillDefinitionFormatter extends BasicAttributesFormatter {
	
	@Inject extension SkillDefinitionGrammarAccess

	def dispatch void format(SkillDefinitionModel skillDefModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		skillDefModel.getRepository.format;
	}

	def dispatch void format(SkillDefinitionRepository skillDefinitionRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (CoordinationModuleDefinition coordinationModule : skillDefinitionRepository.getModules()) {
			coordinationModule.format;
		}
	}
	
	// TODO: implement for SkillDefinitionSet, SkillDefinition
}
