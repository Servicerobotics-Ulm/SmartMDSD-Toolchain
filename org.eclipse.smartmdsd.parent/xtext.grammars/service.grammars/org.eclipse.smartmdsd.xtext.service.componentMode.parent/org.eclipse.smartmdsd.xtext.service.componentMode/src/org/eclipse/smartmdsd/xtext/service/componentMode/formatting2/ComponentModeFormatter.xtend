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
package org.eclipse.smartmdsd.xtext.service.componentMode.formatting2

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentModeFormatter extends AbstractFormatter2 {
	
//	@Inject extension ComponentModeGrammarAccess

	def dispatch void format(ComponentModeModel componentModeModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentModeModel.repository.format
	}

	def dispatch void format(ComponentModeRepository componentModeRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (componentModeCollection : componentModeRepository.collections) {
			componentModeCollection.format
		}
	}
	
	// TODO: implement for ComponentModeCollection
}
