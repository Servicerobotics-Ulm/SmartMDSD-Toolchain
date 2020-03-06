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
package org.eclipse.smartmdsd.ecore.system.componentArchitecture

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import java.util.List
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition

class ComponentArchitectureModelUtility extends ComponentDefinitionModelUtility {
	// This method checks two sides of a port-connection. The two sides (i.e. ports) can be 
	// source+sink or requestor+replier or any other pair-relation (therefore the neutral
	// names left and right whatever left and right means in detail). At the moment, 
	// port compatibility is assumed if both sides reference a different component port, but
	// use the very same service definition. This implicitly assumes a directed connection 
	// (which might be too restrictive for the future). At the moment, it is allowed to connect 
	// two ports from the same component which in some cases might lead to deadlocks. This is 
	// on purpose though, because such deadlocks should be detected over a triggering chain 
	// (and depending on the definition of the triggering-chain, there might be valid use-cases 
	// that do not lead to a deadlock, despite of a connection between two ports of the same component).
	// 
	// TODO: as soon as service-properties will be introduced, this check might need to be
	// extended by probably implementing a run-time interpreter
	def static boolean servicePortsCompatible(ServiceInstance left, ServiceInstance right) {
		if(left.port != right.port) {
			return (left.port.service == right.port.service)
		}
		return false;
	}
	
	def static Iterable<ComponentPort> getAllClientPorts(ComponentInstance instance) {
		var List<ComponentPort> services = newArrayList()
		// PushClients and EventClients
		services.addAll(instance.component.inputPorts.filter[it.service instanceof ForkingServiceDefinition])
		// SendClients
		services.addAll(instance.component.outputPorts.filter[it.service instanceof JoiningServiceDefinition])
		// QueryClients
		services.addAll(instance.component.requestPorts)
		return services
	}
	
	def static Iterable<ComponentPort> getNonOptionalClientPorts(ComponentInstance instance) {
		var List<ComponentPort> services = newArrayList()
		// PushClients and EventClients
		services.addAll(instance.component.inputPorts.filter[it.service instanceof ForkingServiceDefinition])
		// SendClients
		services.addAll(instance.component.outputPorts.filter[it.service instanceof JoiningServiceDefinition])
		// QueryClients
		services.addAll(instance.component.requestPorts)
		return services
	}
	
//	def static Boolean isOptional(RequiredService svc) {
//		return svc.port.optional
//	}
	
	def static Iterable<ComponentPort> getAllServerPorts(ComponentInstance instance) {
		var List<ComponentPort> services = newArrayList()
		// PushServers and EventServers
		services.addAll(instance.component.outputPorts.filter[it.service instanceof ForkingServiceDefinition])
		// SendServers
		services.addAll(instance.component.inputPorts.filter[it.service instanceof JoiningServiceDefinition])
		// QueryServers
		services.addAll(instance.component.answerPorts)
		return services
	}
}
