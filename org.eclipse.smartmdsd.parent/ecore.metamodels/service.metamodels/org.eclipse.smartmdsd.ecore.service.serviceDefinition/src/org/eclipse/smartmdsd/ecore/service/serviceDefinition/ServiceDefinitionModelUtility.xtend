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