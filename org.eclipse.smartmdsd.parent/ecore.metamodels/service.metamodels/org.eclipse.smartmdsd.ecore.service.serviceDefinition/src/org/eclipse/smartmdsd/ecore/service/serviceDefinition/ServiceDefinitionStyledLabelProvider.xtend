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
package org.eclipse.smartmdsd.ecore.service.serviceDefinition

import org.eclipse.jface.viewers.StyledString
import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternStyledLabelProvider

class ServiceDefinitionStyledLabelProvider extends CommunicationPatternStyledLabelProvider {
	def dispatch getStyledServiceString(ForkingServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(JoiningServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(RequestAnswerServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(CoordinationServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		return text
	}
}
