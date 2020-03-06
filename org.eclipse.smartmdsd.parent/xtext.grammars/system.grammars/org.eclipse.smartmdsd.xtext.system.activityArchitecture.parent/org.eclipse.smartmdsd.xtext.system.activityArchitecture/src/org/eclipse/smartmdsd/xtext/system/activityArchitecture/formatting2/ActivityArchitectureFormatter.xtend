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
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.formatting2

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ActivityArchitectureFormatter extends AbstractFormatter2 {
	
//	@Inject extension ActivityArchitectureGrammarAccess

	def dispatch void format(ActivityArchitectureModel activityArchitectureModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractActivityArchitectureElement : activityArchitectureModel.elements) {
			abstractActivityArchitectureElement.format
		}
	}

	def dispatch void format(InputHandlerNode inputHandlerNode, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		inputHandlerNode.inputNode.format
	}
	
	// TODO: implement for ActivityNode, ExecutionTime
}
