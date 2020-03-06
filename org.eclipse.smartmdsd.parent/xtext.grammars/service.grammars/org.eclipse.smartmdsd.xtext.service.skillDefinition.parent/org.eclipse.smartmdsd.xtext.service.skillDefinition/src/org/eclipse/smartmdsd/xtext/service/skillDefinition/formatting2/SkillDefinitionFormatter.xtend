/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
