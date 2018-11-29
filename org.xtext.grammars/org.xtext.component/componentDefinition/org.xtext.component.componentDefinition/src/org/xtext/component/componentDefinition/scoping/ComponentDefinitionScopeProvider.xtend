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
package org.xtext.component.componentDefinition.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.ecore.component.seronetExtension.SeronetExtensionPackage
import org.ecore.component.componentDefinition.OutputPort
import org.ecore.component.performanceExtension.PerformanceExtensionPackage
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.InputPortLink
import org.ecore.component.componentDefinition.ComponentSubNodeObserver
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization
import org.ecore.component.componentDefinition.ComponentPort
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentDefinitionScopeProvider extends AbstractComponentDefinitionScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		if(reference == SeronetExtensionPackage.eINSTANCE.opcUaStatusServer_OutPort) {
			val parent = context.eContainer
			if(parent instanceof ComponentDefinition) {
				return Scopes.scopeFor(parent.elements.filter(OutputPort));
			}
		} else if(reference == CoordinationExtensionPackage.eINSTANCE.communicationServiceUsageRealization_ServiceUsage) {
			val parent = context.eContainer
			if(parent instanceof CoordinationSlavePort) {
				val coordinationServiceDef = parent.service
				if(coordinationServiceDef instanceof CoordinationServiceDefinition)
				{
					return Scopes.scopeFor(coordinationServiceDef.services);
				}
			}
		} else if (reference == CoordinationExtensionPackage.eINSTANCE.communicationServiceUsageRealization_ComponentPort) {
			val parent = context.eContainer.eContainer
			if(parent instanceof ComponentDefinition) {
				val serviceDefRef = context as CommunicationServiceUsageRealization
				return Scopes.scopeFor(parent.elements.filter(ComponentPort).filter[it.service == serviceDefRef.serviceUsage.uses])
			}
//		} else if(reference == StateExtensionPackage.eINSTANCE.subStateBinding_Substate) {
//			val component = EcoreUtil2.getContainerOfType(context, ComponentDefinition)
//			if(component !== null) {
//				val automaton = component.extensions.filter(ComponentStates).head
//				if(automaton !== null) {
//					//FIXME: include ComponentLifecycle states
//					return Scopes.scopeFor(automaton.substates)
//				}
//			}
		} else if(reference == PerformanceExtensionPackage.eINSTANCE.defaultInputTrigger_InputLink) {
			val parent = context.eContainer
			if(parent instanceof Activity) {
				return Scopes.scopeFor(parent.links.filter(InputPortLink))
			}
		} else if(reference == PerformanceExtensionPackage.eINSTANCE.defaultObservedElementTrigger_Element) {
			val parent = context.eContainer
			if(parent instanceof Activity) {
				return Scopes.scopeFor(parent.links.filter(ComponentSubNodeObserver).map[it.subject])
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE
	}
	
}
