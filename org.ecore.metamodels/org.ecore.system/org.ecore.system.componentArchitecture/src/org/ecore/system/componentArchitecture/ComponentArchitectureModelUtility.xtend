//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.ecore.system.componentArchitecture

import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.service.serviceDefinition.ForkingServiceDefinition
import java.util.List
import org.ecore.service.serviceDefinition.JoiningServiceDefinition

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