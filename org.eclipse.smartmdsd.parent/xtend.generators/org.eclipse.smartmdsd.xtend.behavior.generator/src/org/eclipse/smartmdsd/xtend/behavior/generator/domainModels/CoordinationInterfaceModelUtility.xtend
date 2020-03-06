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
package org.eclipse.smartmdsd.xtend.behavior.generator.domainModels

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionModelUtility
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import java.util.Collection
import java.util.HashSet
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage

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
