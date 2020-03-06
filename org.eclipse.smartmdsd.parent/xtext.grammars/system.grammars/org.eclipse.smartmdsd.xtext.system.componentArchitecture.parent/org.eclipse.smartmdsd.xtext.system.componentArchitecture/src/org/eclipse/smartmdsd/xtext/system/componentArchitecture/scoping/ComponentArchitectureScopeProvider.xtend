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
package org.eclipse.smartmdsd.xtext.system.componentArchitecture.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitectureModelUtility
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef
import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition
import java.util.List
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentArchitectureScopeProvider extends AbstractComponentArchitectureScopeProvider {
	
	def static Iterable<ComponentInstance> getAllMatchingComponentInstances(SystemComponentArchitecture sysArch,
		CoordinationServiceDefinition coordInterDef) {
		var List<ComponentInstance> result = newArrayList()

		for (compInst : sysArch.components) {
			var compCoordinationSlavePorts = compInst.component.elements.filter(typeof(CoordinationSlavePort))

			if (compCoordinationSlavePorts !== null) {

				// only a single coordinationSlavePort is allowed for a component
				for (compCoordinationSlavePort : compCoordinationSlavePorts) {
					
					var coordInterDef2 = compCoordinationSlavePort.service 
					if (coordInterDef == coordInterDef2)
					{
						result.add(compInst);
					}

//					// get all skillRealizationsRefs
//					var skillRealizationsRefs = compCoordinationSlavePort.elements.filter(typeof(SkillRealizationsRef))
//					for (skillRealizationsRef : skillRealizationsRefs) {
//						var coordModuleDef2 = skillRealizationsRef.skillRealizationCoordModuleRef.coordinationModuleDef
//						if (coordModDef == coordModuleDef2) {
//							result.add(compInst);
//						}
//					}
				}
			}
		}
		return result
	}
	
	def static Iterable<CoordinationModuleRealization> getAllMatchingCoordinationModuleRealizations(SystemComponentArchitecture sysArch,
		CoordinationModuleDefinition coordModDef) {
		var List<CoordinationModuleRealization> result = newArrayList()

		for (compInst : sysArch.components) {
			var compCoordinationSlavePorts = compInst.component.elements.filter(typeof(CoordinationSlavePort))

			if (compCoordinationSlavePorts !== null) {

				// only a single coordinationSlavePort is allowed for a component
				for (compCoordinationSlavePort : compCoordinationSlavePorts) {

					// get all skillRealizationsRefs
					var skillRealizationsRefs = compCoordinationSlavePort.elements.filter(typeof(SkillRealizationsRef))
					for (skillRealizationsRef : skillRealizationsRefs) {
						var coordinatioModuleRealization = skillRealizationsRef.skillRealizationCoordModuleRef
						var coordModuleDef2 = skillRealizationsRef.skillRealizationCoordModuleRef.coordinationModuleDef
						if (coordModDef == coordModuleDef2) {
							result.add(coordinatioModuleRealization);
						}
					}
				}
			}
		}
		return result
	}
	
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
		} else if(reference == CompArchBehaviorExtensionPackage.eINSTANCE.coordinationModuleMapping_CoordModReal){
			if(context instanceof CoordinationModuleMapping)
			{
				var coordModuleDef1 = context.coordModuleInst.coordModuleDef
				val parent = context.eContainer
				if(parent instanceof SystemComponentArchitecture) {
					//find the matching (same coordination module def) component instance
					return Scopes.scopeFor(parent.getAllMatchingCoordinationModuleRealizations(coordModuleDef1))
				}
				
			}
			
		} else if(reference == CompArchBehaviorExtensionPackage.eINSTANCE.coordinationInterfaceComponentInstanceMapping_CoordInterInst){
			val parent = context.eContainer
			if(parent instanceof CoordinationModuleMapping) {
				return Scopes.scopeFor(parent.coordModReal.coordInterfaceInsts);
			}
		} else if(reference == CompArchBehaviorExtensionPackage.eINSTANCE.coordinationInterfaceComponentInstanceMapping_CompInst){
			//get coordination module definition via the coordintion module instance
			if(context instanceof CoordinationInterfaceComponentInstanceMapping)
			{
				var coordInterfaceDef1 = context.coordInterInst.coordinationInterfaceDef				
				val parent = context.eContainer.eContainer
				if(parent instanceof SystemComponentArchitecture) {
					//find the matching (same coordination module def) component instance
					return Scopes.scopeFor(parent.getAllMatchingComponentInstances(coordInterfaceDef1))
					
				}
				
			}
				
			
		}
		
//		else if(reference == CompArchBehaviorExtensionPackage.eINSTANCE.coordinationModuleMapping_CompInst) {
//			if(context instanceof CoordinationModuleMapping)
//			{
//				//get coordination module definition via the coordintion module instance
//				var coordModuleDef1 = context.coordModuleInst.coordModuleDef			
//				
//				val parent = context.eContainer
//				if(parent instanceof SystemComponentArchitecture) {
//					//find the matching (same coordination module def) component instance
//					return Scopes.scopeFor(parent.getAllMatchingComponentInstnaces(coordModuleDef1))
//				}				
//			}
//		}

		
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
