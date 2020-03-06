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
package org.eclipse.smartmdsd.xtext.component.componentDefinition.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
import org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CommunicationServiceUsageRealization
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import static extension org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentDefinitionScopeProvider extends AbstractComponentDefinitionScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		if(reference == SeronetExtensionPackage.eINSTANCE.opcUaReadServer_OutPort) {
			val parent = context.eContainer
			if(parent instanceof ComponentDefinition) {
				return Scopes.scopeFor(parent.elements.filter(OutputPort));
			}
		} else if(reference == CoordinationExtensionPackage.eINSTANCE.communicationServiceUsageRealization_ServiceUsage) {
			val parent = context.eContainer
			if(parent instanceof CoordinationSlavePort) {
				return Scopes.scopeFor(parent.service.services);
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
