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

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternModelUtility
import java.util.Collection
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern

class ServiceDefinitionModelUtility extends CommunicationPatternModelUtility {
	def static Collection<CommunicationObject> getAllCommObjects(CommunicationServiceDefinition service) {
		return service.pattern.allCommObjects
	}
	
	def static CommunicationPattern getPattern(CommunicationServiceDefinition service) {
		switch (service) {
			ForkingServiceDefinition: service.pattern
			JoiningServiceDefinition: service.pattern
			RequestAnswerServiceDefinition: service.pattern
		}
	}
}