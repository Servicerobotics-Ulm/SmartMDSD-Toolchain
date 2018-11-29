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
package org.ecore.component.componentDefinition

import java.util.LinkedHashSet
import org.ecore.service.serviceDefinition.ServiceDefinitionModelUtility
import java.util.Collection
import org.ecore.service.communicationObject.CommunicationObject
import java.util.HashSet
import org.ecore.service.serviceDefinition.CommunicationServiceDefinition

class ComponentDefinitionModelUtility extends ServiceDefinitionModelUtility {
	def static LinkedHashSet<Activity> getActivityObservationHierarchy(Activity activity) {
		return activity.iterateObservers(newLinkedHashSet())
	}
	
	def static private LinkedHashSet<Activity> iterateObservers(Activity current, LinkedHashSet<Activity> visited) {
		for(observer: current.observers) {
			val subject = observer.subject
			if(subject instanceof Activity) {
				if(!visited.contains(subject)) {
					visited.add(subject)
					visited.addAll(subject.iterateObservers(visited))
				}
			} else if(subject instanceof RequestHandler) {
				
			}
		}
		return visited
	}
	
	def static getObservers(ComponentSubNode node) {
		return node.links.filter(ComponentSubNodeObserver)
	}
	
	def static getSubNodes(ComponentDefinition component) {
		return component.elements.filter(ComponentSubNode)
	}
	
	def static CommunicationServiceDefinition getService(ComponentPort port) {
		switch(port) {
			InputPort: return port.service
			AnswerPort: return port.service
			OutputPort: return port.service
			RequestPort: return port.service
		}
		
	}
	
	def static getInputLinks(ComponentSubNode node) {
		return node.links.filter(InputPortLink)
	}
	
	def static Boolean isOptional(ComponentPort port) {
		if(port instanceof InputPort) {
			val parent = port.eContainer
			if(parent instanceof ComponentDefinition) {
				if(!parent.activities.exists[it.inputLinks.exists[it.inputPort==port && it.optional==false]]) {
					if(!parent.inputHandlers.exists[it.inputLinks.exists[it.inputPort==port && it.optional==false]]) {
						return true;
					}
				}
			}
		}
		return false
	}
	
	def static Collection<CommunicationObject> getAllCommObjects(ComponentPort port) {
		port.service.allCommObjects
	}
	
	def static Collection<CommunicationObject> getAllCommObjects(RequestHandler handler) {
		handler.answerPort.service.allCommObjects
	}
	
	def static Collection<CommunicationObject> getAllCommObjects(Activity activity) {
		val objects = new HashSet<CommunicationObject>();
		activity.inputLinks.forEach[objects.addAll(it.inputPort.allCommObjects)]
		return objects
	}
	def static Collection<CommunicationObject> getAllCommObjects(ComponentDefinition component) {
		val objects = new HashSet<CommunicationObject>();
		component.elements.filter(ComponentPort).forEach[objects.addAll(it.allCommObjects)]
		return objects
	}
	
	def static Iterable<Activity> getActivities(ComponentDefinition component) {
		return component.elements.filter(Activity)
	}
	def static Iterable<InputHandler> getInputHandlers(ComponentDefinition component) {
		return component.elements.filter(InputHandler)
	}
	def static Iterable<RequestHandler> getRequestHandlers(ComponentDefinition component) {
		return component.elements.filter(RequestHandler)
	}
	def static Iterable<InputPort> getInputPorts(ComponentDefinition component) {
		return component.elements.filter(InputPort)
	}
	def static Iterable<AnswerPort> getAnswerPorts(ComponentDefinition component) {
		return component.elements.filter(AnswerPort)
	}
	def static Iterable<OutputPort> getOutputPorts(ComponentDefinition component) {
		return component.elements.filter(OutputPort)
	}
	def static Iterable<RequestPort> getRequestPorts(ComponentDefinition component) {
		return component.elements.filter(RequestPort)
	}
	
	def static Iterable<ComponentPort> getPorts(ComponentDefinition component) {
		return component.elements.filter(ComponentPort)
	}
}
