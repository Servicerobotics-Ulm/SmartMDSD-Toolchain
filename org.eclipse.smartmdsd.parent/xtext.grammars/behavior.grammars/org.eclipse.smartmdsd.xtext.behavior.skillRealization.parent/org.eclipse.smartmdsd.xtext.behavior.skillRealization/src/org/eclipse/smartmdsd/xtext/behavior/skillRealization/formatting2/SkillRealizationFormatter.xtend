/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Matthias Lutz, Alex Lotz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.behavior.skillRealization.formatting2

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SkillRealizationFormatter extends AbstractFormatter2 {
	
//	@Inject extension SkillRealizationGrammarAccess

	def dispatch void format(SkillRealizationModel skillRealizationModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (coordinationModuleRealization : skillRealizationModel.modules) {
			coordinationModuleRealization.format
		}
	}

	def dispatch void format(CoordinationModuleRealization coordinationModuleRealization, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (coordinationInterfaceInstance : coordinationModuleRealization.coordInterfaceInsts) {
			coordinationInterfaceInstance.format
		}
		for (skillRealization : coordinationModuleRealization.skills) {
			skillRealization.format
		}
	}
	
	// TODO: implement for SkillRealization, CoordinationActionBlock
}
