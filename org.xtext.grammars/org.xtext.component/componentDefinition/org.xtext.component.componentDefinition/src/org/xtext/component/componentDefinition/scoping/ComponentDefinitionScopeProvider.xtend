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
		if(reference == SeronetExtensionPackage.eINSTANCE.opcUaReadServer_OutPort) {
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
