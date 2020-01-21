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
package org.eclipse.smartmdsd.xtext.service.skillDefinition.formatting2

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository
import org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class SkillDefinitionFormatter extends BasicAttributesFormatter {
	
//	@Inject extension SkillDefinitionGrammarAccess

	def dispatch void format(SkillDefinitionModel skillDefinitionModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		skillDefinitionModel.repository.format
	}

	def dispatch void format(SkillDefinitionRepository skillDefinitionRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (coordinationModuleDefinition : skillDefinitionRepository.modules) {
			coordinationModuleDefinition.format
		}
	}
	
	// TODO: implement for CoordinationModuleDefinition, SkillDefinition
}
