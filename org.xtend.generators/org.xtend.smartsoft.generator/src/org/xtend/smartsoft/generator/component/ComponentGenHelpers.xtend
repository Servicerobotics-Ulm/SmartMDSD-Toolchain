//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.xtend.smartsoft.generator.component

import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.performanceExtension.ActivationConstraints
import org.ecore.service.communicationPattern.PushPattern
import org.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import com.google.inject.Inject
import org.ecore.service.communicationPattern.CommunicationPattern
import org.ecore.service.communicationPattern.SendPattern
import org.ecore.service.communicationPattern.QueryPattern
import org.ecore.service.communicationPattern.EventPattern
import java.util.Collection
import org.ecore.service.communicationObject.CommunicationObject
import java.util.HashSet
import org.ecore.service.communicationObject.CommObjectsRepository
import java.util.HashMap
import java.util.Map
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDefinition.InputPort
import org.ecore.service.serviceDefinition.ForkingServiceDefinition
import org.ecore.component.componentDefinition.RequestPort
import org.ecore.component.componentDefinition.OutputPort
import org.ecore.service.serviceDefinition.JoiningServiceDefinition
import org.ecore.component.componentDefinition.AnswerPort
import org.ecore.component.componentDefinition.ComponentSubNodeObserver

import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.ecore.component.componentDefinition.AbstractComponentElement
import org.ecore.component.componentParameter.ComponentParametersRef
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.NamedComponentElement
import org.ecore.component.componentDefinition.DerivedComponentElement
import org.ecore.component.seronetExtension.SupportedMiddleware
import org.ecore.service.roboticMiddleware.ACE_SmartSoft
import java.util.ArrayList
import org.eclipse.core.runtime.Platform

class ComponentGenHelpers {
	@Inject CommObjectGenHelpers comm;
//	@Inject extension ComponentDefinitionModelUtility;
	
	//////////////////////////////
	// name definitions
	//////////////////////////////
	def nameClass(ComponentDefinition c) { c.name.toFirstUpper }
	def nameClass(AbstractComponentElement elem) { 
		switch(elem) {
			NamedComponentElement: elem.name.toFirstUpper
			DerivedComponentElement: elem.name.toFirstUpper
		}
	}
	def nameClass(SmartTimerDummy p) { p.name.toFirstUpper }
	def getNameClass(ComponentSubNodeObserver obs) {
		obs.subject.name.toFirstUpper
	}
	
	def nameInstance(ComponentDefinition c) { c.name.toFirstLower }
	def nameInstance(AbstractComponentElement elem) { 
		switch(elem) {
			NamedComponentElement: elem.name.toFirstLower
			DerivedComponentElement: elem.name.toFirstLower
		}
	}
	def nameInstance(SmartTimerDummy p) { p.name.toFirstLower }
	def nameInstance(ComponentSubNodeObserver obs) {
		obs.subject.name.toFirstLower
	}

	def nameOriginal(ComponentDefinition c) { c.name }
	def nameOriginal(AbstractComponentElement elem) {
		switch(elem) {
			NamedComponentElement: elem.name
			DerivedComponentElement: elem.name
		}
	}
	def nameOriginal(SmartTimerDummy p) { p.name }
	def nameOriginal(ComponentSubNodeObserver obs) {
		obs.subject.name
	}
	
	def getPattern(ComponentPort port) {
		val service = ComponentDefinitionModelUtility.getService(port)
		return ComponentDefinitionModelUtility.getPattern(service)
	}
	
	def Double getMinActFreq(Activity task) {
		if(task.extensions.filter(typeof(ActivationConstraints)).size == 0) {
			return 0.0
		} else {
			return task.extensions.filter(typeof(ActivationConstraints)).get(0).minActFreq
		}
	}
	def Double getMaxActFreq(Activity task) {
		if(task.extensions.filter(typeof(ActivationConstraints)).size == 0) {
			return 0.0
		} else {
			return task.extensions.filter(typeof(ActivationConstraints)).get(0).maxActFreq
		}
	}
	def Double getUpdateRate(Activity task) {
		if(task.minActFreq > 0.0) {
			return task.minActFreq
		} else if(task.maxActFreq > 0.0) {
			return task.maxActFreq
		} else {
			return 1.0
		}
	}
	
	def Boolean hasParameters(ComponentDefinition component) {
		return (component.elements.filter(ComponentParametersRef).size > 0)
	}
	
	def CharSequence getCommObjectCppList(CommunicationPattern pattern, Boolean isSource) {
		if(pattern instanceof PushPattern) {
			return comm.getFullyQualifiedNameCpp(pattern.dataType)
		} else if(pattern instanceof SendPattern) {
			return comm.getFullyQualifiedNameCpp(pattern.dataType)
		} else if(pattern instanceof QueryPattern) {
			var String name = comm.getFullyQualifiedNameCpp(pattern.requestType).toString
			name += ", " + comm.getFullyQualifiedNameCpp(pattern.answerType).toString
			return name
		} else if(pattern instanceof EventPattern) {
			var String name = comm.getFullyQualifiedNameCpp(pattern.activationType).toString
			name += ", " + comm.getFullyQualifiedNameCpp(pattern.eventType).toString
			if(isSource) {
				name += ", " + comm.getFullyQualifiedNameCpp(pattern.eventStateType).toString	
			}
			return name
		}
	}
	
	def isEventServer(AbstractComponentElement element) {
		if(element instanceof OutputPort) {
			val pattern = element.pattern
			return (pattern instanceof EventPattern)
		}
		return false
	}
	
	def getEventServerStateObject(AbstractComponentElement element) {
		if(element instanceof OutputPort) {
			val pattern = element.pattern
			return comm.getFullyQualifiedNameCpp((pattern as EventPattern).eventStateType)
		}
		return ""
	}
	
	def getInputHandlerCommObject(ComponentPort service) {
		if(service instanceof InputPort) {
			val pattern = service.pattern
			if(pattern instanceof EventPattern) {
				return "Smart::EventInputType<"+comm.getFullyQualifiedNameCpp(pattern.eventType)+",SmartACE::EventId>"
			}
		}
		return service.getCommObjectCppList(false)
	}
	
	def getCommObjectCppList(ComponentPort service, Boolean isSource) {
		val pattern = service.pattern
		return pattern.getCommObjectCppList(isSource)
	}
	
	def dispatch String getPortDefinition(OutputPort port) {
		val pattern = port.pattern
		switch(pattern) {
			PushPattern: '''Smart::IPushServerPattern<«pattern.getCommObjectCppList(true)»>'''
			EventPattern: '''Smart::IEventServerPattern<«pattern.getCommObjectCppList(true)»,SmartACE::EventId>'''
			SendPattern: '''Smart::ISendClientPattern<«pattern.getCommObjectCppList(true)»>'''
			default: ""
		}
	}
	
	def dispatch String getPortDefinition(InputPort port) {
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: '''Smart::IPushClientPattern<«pattern.getCommObjectCppList(false)»>'''
			EventPattern: '''Smart::IEventClientPattern<«pattern.getCommObjectCppList(false)»,SmartACE::EventId>'''
			SendPattern: '''Smart::ISendServerPattern<«pattern.getCommObjectCppList(false)»>'''
			default: ""
		}
	}
	
	def dispatch String getPortDefinition(RequestPort port) {
		val pattern = port.pattern
		'''Smart::IQueryClientPattern<«pattern.getCommObjectCppList(true)»,SmartACE::QueryId>'''
	}
	
	def dispatch String getPortDefinition(AnswerPort port) {
		val pattern = port.pattern
		'''Smart::IQueryServerPattern<«pattern.getCommObjectCppList(false)»,SmartACE::QueryId>'''
	}
	
	def dispatch String getPortImplementation(OutputPort port) {
		val pattern = port.pattern
		switch(pattern) {
			PushPattern: '''SmartACE::PushServer<«pattern.getCommObjectCppList(true)»>'''
			EventPattern: '''SmartACE::EventServer<«pattern.getCommObjectCppList(true)»>'''
			SendPattern: '''SmartACE::SendClient<«pattern.getCommObjectCppList(true)»>'''
			default: ""
		}
	}
	
	def dispatch String getPortImplementation(InputPort port) {
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: '''SmartACE::PushClient<«pattern.getCommObjectCppList(false)»>'''
			EventPattern: '''SmartACE::EventClient<«pattern.getCommObjectCppList(false)»>'''
			SendPattern: '''SmartACE::SendServer<«pattern.getCommObjectCppList(false)»>'''
			default: ""
		}
	}
	
	
	
	def dispatch String getPortImplementation(RequestPort port) {
		val pattern = port.pattern
		'''SmartACE::QueryClient<«pattern.getCommObjectCppList(true)»>'''
	}
	
	def dispatch String getPortImplementation(AnswerPort port) {
		val pattern = port.pattern
		'''SmartACE::QueryServer<«pattern.getCommObjectCppList(false)»>'''
	}
	
	
	
	
	def dispatch Map<String,CommunicationObject> getCommunicationObjects(OutputPort port) {
		val objects = new HashMap<String,CommunicationObject>()
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: objects.put("Data", pattern.dataType)
			EventPattern: {
				objects.put("Activation", pattern.activationType)
				objects.put("Event", pattern.eventType) 
				objects.put("EventState", pattern.eventStateType)
			}
			SendPattern: objects.put("Data", pattern.dataType)
		}
		return objects
	}
	def dispatch Map<String,CommunicationObject> getCommunicationObjects(InputPort port) {
		val objects = new HashMap<String,CommunicationObject>()
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: objects.put("Data", pattern.dataType)
			EventPattern: { 
				objects.put("Activation", pattern.activationType)
				objects.put("Event", pattern.eventType) 
				//objects.put("EventState", pattern.eventStateType)
			}
			SendPattern: objects.put("Data", pattern.dataType)
		}
		return objects
	}
	
	def dispatch Map<String,CommunicationObject> getCommunicationObjects(RequestPort port) {
		val objects = new HashMap<String,CommunicationObject>()
		val pattern = port.pattern
		switch (pattern) {
			QueryPattern: { 
				objects.put("Request", pattern.requestType) 
				objects.put("Answer", pattern.answerType)
			}
		}
		return objects
	}
	def dispatch Map<String,CommunicationObject> getCommunicationObjects(AnswerPort port) {
		val objects = new HashMap<String,CommunicationObject>()
		val pattern = port.pattern
		switch (pattern) {
			QueryPattern: { 
				objects.put("Request", pattern.requestType) 
				objects.put("Answer", pattern.answerType)
			}
		}
		return objects
	}
	
	def String getSourceMainMethod(ComponentPort port) {
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: "put"
			EventPattern: "put"
			SendPattern: "send"
			QueryPattern: "query"
		}
	}
	
	def String getCommObjectsParameterList(OutputPort port) {
		var String result = ""
		val entrySet = port.communicationObjects.entrySet 
		for(obj: entrySet) {
			if(obj !== entrySet.head) {
				result += ", "
			}
			result += comm.getFullyQualifiedNameCpp(obj.value) + " &" + port.nameInstance+obj.key+"Object"
		}
		return result;
	}
	
	def String getCommObjectsParameterList(InputPort port) {
		var String result = ""
		val pattern = port.pattern
		switch (pattern) {
			PushPattern: result = "const " + comm.getFullyQualifiedNameCpp(pattern.dataType) + " &" + port.nameInstance+"DataObject"
			SendPattern: result = "const " + comm.getFullyQualifiedNameCpp(pattern.dataType) + " &" + port.nameInstance+"DataObject"
			QueryPattern: {
				result = "const " + comm.getFullyQualifiedNameCpp(pattern.requestType) + " &" + port.nameInstance+pattern.requestType.name+"RequestObject, "
				result += "const " + comm.getFullyQualifiedNameCpp(pattern.answerType) + " &" + port.nameInstance+pattern.answerType.name+"AnswerObject"
			}
			EventPattern: {
				result = comm.getFullyQualifiedNameCpp(pattern.activationType) + " &parameter, "
				result += comm.getFullyQualifiedNameCpp(pattern.eventType) + " &event, "
				result += "const " + comm.getFullyQualifiedNameCpp(pattern.eventStateType) + " &state"
			}
		}
		return result;
	}
	
	def String getCommObjectsCallerList(ComponentPort port) {
		var String result = ""
		val entrySet = port.communicationObjects.entrySet 
		for(obj: entrySet) {
			if(obj !== entrySet.head) {
				result += ", "
			}
			result += port.nameInstance+obj.key+"Object"
		}
		return result;
	}
		
	def getReferencedCommObjRepos(Collection<CommunicationObject> comms) {
		var repoNames = new HashSet<CommObjectsRepository>
		for(co: comms) {
			repoNames.add((co.eContainer as CommObjectsRepository));
		}
		return repoNames
	}
	
	def getAllClientPorts(ComponentDefinition comp) {
		val clients = new HashSet<ComponentPort>
		clients.addAll(comp.elements.filter(InputPort).filter[it.service instanceof ForkingServiceDefinition])
		clients.addAll(comp.elements.filter(RequestPort))
		clients.addAll(comp.elements.filter(OutputPort).filter[it.service instanceof JoiningServiceDefinition])
		return clients
	}
	
	def isSubscriber(ComponentPort svc) {
		if(svc instanceof InputPort) {
			val sdef = svc.service
			if(sdef instanceof ForkingServiceDefinition) {
				if(sdef.pattern instanceof PushPattern) {
					return true
				}
			}
		}
		return false
	}
	
	def getAllPushClients(ComponentDefinition comp) {
		return comp.elements.filter(InputPort).filter[it.pattern instanceof PushPattern]
	}
	
	def getAllServerPorts(ComponentDefinition comp) {
		val servers = new HashSet<ComponentPort>
		servers.addAll(comp.elements.filter(InputPort).filter[it.service instanceof JoiningServiceDefinition])
		servers.addAll(comp.elements.filter(AnswerPort))
		servers.addAll(comp.elements.filter(OutputPort).filter[it.service instanceof ForkingServiceDefinition])		
		return servers
	}
	
	def String getDefaultMiddlewareString(ComponentPort port) {
		for(mw: port.extensions.filter(SupportedMiddleware)) {
			if(mw.^default) {
				return mw.middleware.eClass.name
			}
		}
		return ACE_SmartSoft.simpleName
	}
	
	def Collection<ComponentGeneratorExtension> getComponentGeneratorExtensions() {
		val result = new ArrayList<ComponentGeneratorExtension>();
		// get all generators plugged-in as extensions
		val config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.xtend.smartsoft.generator.ComponentGeneratorExtension")
		// for each extension
		for(ext: config) {
			// get the "class" object from the extension (which should implement the AbstractGenerator interface)
			val obj = ext.createExecutableExtension("class")
			if(obj instanceof ComponentGeneratorExtension) {
				result.add(obj);
			}
		}
		return result;
	}
	
	def Collection<ActivityGeneratorExtension> getActivityGeneratorExtensions() {
		val result = new ArrayList<ActivityGeneratorExtension>();
		// get all generators plugged-in as extensions
		val config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.xtend.smartsoft.generator.ComponentGeneratorExtension")
		// for each extension
		for(ext: config) {
			// get the "class" object from the extension (which should implement the AbstractGenerator interface)
			val obj = ext.createExecutableExtension("class")
			if(obj instanceof ActivityGeneratorExtension) {
				result.add(obj);
			}
		}
		return result;
	}
}