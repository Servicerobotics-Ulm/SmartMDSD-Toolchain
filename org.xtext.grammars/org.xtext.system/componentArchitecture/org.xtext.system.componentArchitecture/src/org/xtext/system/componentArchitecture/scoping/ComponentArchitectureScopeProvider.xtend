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
package org.xtext.system.componentArchitecture.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.system.componentArchitecture.ComponentArchitecturePackage
import org.ecore.system.componentArchitecture.ComponentArchitectureModelUtility
import org.eclipse.xtext.scoping.Scopes
import org.ecore.system.componentArchitecture.ComponentInstance
import org.ecore.system.componentArchitecture.RequiredService
import org.ecore.system.componentArchitecture.ProvidedService
import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage
import org.ecore.component.seronetExtension.OpcUaDeviceClient
import org.ecore.component.componentDefinition.Activity
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.system.activityArchitecture.ActivityNode
import org.ecore.component.componentDefinition.InputHandler
import org.ecore.system.activityArchitecture.InputHandlerNode
import org.ecore.component.seronetExtension.OpcUaReadServer

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentArchitectureScopeProvider extends AbstractComponentArchitectureScopeProvider {
//	@Inject IQualifiedNameProvider name_provider;
	
	override getScope(EObject context, EReference reference) {
		if(reference == ComponentArchitecturePackage.eINSTANCE.serviceInstance_Port) {
			if(context instanceof RequiredService) {
				return Scopes.scopeFor(ComponentArchitectureModelUtility.getAllClientPorts(context.eContainer as ComponentInstance))
			} else if(context instanceof ProvidedService) {
				return Scopes.scopeFor(ComponentArchitectureModelUtility.getAllServerPorts(context.eContainer as ComponentInstance))
			}
//		} else if(reference == SystemParameterPackage.eINSTANCE.parameterStructInstance_Parameter) {
//			// see implementation below
//			return getParamStructInstanceScope(context, reference)
		} else if(reference == CompArchSeronetExtensionPackage.eINSTANCE.opcUaDeviceClientInstance_DeviceClient) {
			val parent = context.eContainer
			if(parent instanceof ComponentInstance) {
				return Scopes.scopeFor(parent.component.elements.filter(OpcUaDeviceClient))
			} 
		} else if(reference == CompArchSeronetExtensionPackage.eINSTANCE.opcUaReadServerInstance_ReadServer) {
			val parent = context.eContainer
			if(parent instanceof ComponentInstance) {
				return Scopes.scopeFor(parent.component.elements.filter(OpcUaReadServer))
			} 
		} else if(reference == ComponentArchitecturePackage.eINSTANCE.activityConfigurationMapping_Activity) {
			val parent = context.eContainer
			if(parent instanceof ComponentInstance) {
				return Scopes.scopeFor(parent.component.elements.filter(Activity))
			}
		} else if(reference == ComponentArchitecturePackage.eINSTANCE.activityConfigurationMapping_Config) {
			val parent = context.eContainer.eContainer
			if(parent instanceof SystemComponentArchitecture) {
				if(parent.activityArch !== null) {
					return Scopes.scopeFor(parent.activityArch.elements.filter(ActivityNode))
				}
			}
		} else if(reference == ComponentArchitecturePackage.eINSTANCE.inputHandlerConfigurationMapping_Handler) {
			val parent = context.eContainer
			if(parent instanceof ComponentInstance) {
				return Scopes.scopeFor(parent.component.elements.filter(InputHandler))
			}
		} else if(reference == ComponentArchitecturePackage.eINSTANCE.inputHandlerConfigurationMapping_Config) {
			val parent = context.eContainer.eContainer
			if(parent instanceof SystemComponentArchitecture) {
				if(parent.activityArch !== null) {
					return Scopes.scopeFor(parent.activityArch.elements.filter(InputHandlerNode))
				}
			}
		}
		return super.getScope(context, reference)
	}
	
//	def IScope getParamStructInstanceScope(EObject context, EReference reference) {
//		val parent = context.eContainer
//		if(parent instanceof ComponentInstance) {
//			val fullScope = delegate.getScope(context, reference)
//			val qualifiedName = name_provider.getFullyQualifiedName(parent)
//			val filteredScope = new FilteringScope(fullScope,
//				new Predicate<IEObjectDescription>() {
//					override apply(IEObjectDescription descr) {
//						if(descr.name==qualifiedName) {
//							return true
//						}
//						return false
//					}
//				}
//			)
//			val hasWhildecard = true;
//			val ignoreCase = false;
//			val normalizer = new ImportNormalizer(qualifiedName.skipLast(1), hasWhildecard, ignoreCase);
//			val selectable = new ScopeBasedSelectable(filteredScope);
//			val importScope = new ImportScope(
//					Arrays.asList(normalizer), filteredScope, 
//					selectable, filteredScope.allElements.head.EClass, ignoreCase
//					);
//			return importScope
////			return fullScope
//		}
//		return IScope.NULLSCOPE
//	}
}
