//================================================================
//
//  Copyright (C) 2019 Matthias Lutz, Alex Lotz, Dennis Stampfer
//
//        lutz@hs-ulm.de
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//================================================================
package org.xtend.coordinationInterface.generator

import org.ecore.service.serviceDefinition.ServiceDefinitionModelUtility
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.ecore.service.communicationObject.CommunicationObject
import java.util.Collection
import java.util.HashSet
import org.ecore.service.serviceDefinition.CommunicationServiceUsage

class CoordinationInterfaceModelUtility extends ServiceDefinitionModelUtility {
	
	def static Collection<CommunicationObject> getAllCommObjects(CommunicationServiceUsage commServiceUsage) {
		return commServiceUsage.uses.allCommObjects
	}
		
	def static Collection<CommunicationObject> getAllCommObjects(CoordinationServiceDefinition coordServiceDef) {
		val objects = new HashSet<CommunicationObject>();
		coordServiceDef.services.forEach[objects.addAll(it.allCommObjects)]
		return objects
	}
		
}
