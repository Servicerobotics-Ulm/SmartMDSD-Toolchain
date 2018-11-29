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
package org.xtext.system.componentArchitecture.validation

import org.eclipse.xtext.validation.Check
import org.ecore.system.componentArchitecture.ComponentInstance
import org.ecore.system.componentArchitecture.ComponentArchitecturePackage
import org.ecore.system.componentArchitecture.Connection
import org.ecore.system.componentArchitecture.ComponentArchitectureModelUtility
import org.ecore.system.componentArchitecture.RequiredService
import org.ecore.component.seronetExtension.SupportedMiddleware
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.system.systemParameter.ParameterStructInstance
import org.ecore.system.systemParameter.SystemParameterPackage
import org.ecore.system.systemParameter.SystemParamModel
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ComponentArchitectureValidator extends AbstractComponentArchitectureValidator {
	@Inject IQualifiedNameProvider fqn_provider;
	
	protected static val COMP_ARCH_ISSUE_PREFIX = "org.xtext.system.componentArchitecture."
	public static val INVALID_COMP_NAME = COMP_ARCH_ISSUE_PREFIX+"InvalidName"
	public static val INCOMPATIBLE_SERVICE = COMP_ARCH_ISSUE_PREFIX+"IncompatibleService"
	public static val MISSING_PORTS = COMP_ARCH_ISSUE_PREFIX+"MissingPorts"
	public static val NOT_CONNECTED_SERVICE = COMP_ARCH_ISSUE_PREFIX+"NotConenctedService"
	
	public static val MIDDLWARE_SELECTION_NOT_SUPPORTED = COMP_ARCH_ISSUE_PREFIX+"MiddlewareSelectionNotSupported"
	public static val CONFLICTING_MIDDLWARE_SELECTION = COMP_ARCH_ISSUE_PREFIX+"ConflictingMiddlewareSelection"
	public static val DUPLICATE_PARAMETER_STRUCT = COMP_ARCH_ISSUE_PREFIX+"DuplicateParameterStruct"
	public static val INVALID_PARAMETER_STRUCT = COMP_ARCH_ISSUE_PREFIX+"InvalidParameterStruct"

	@Check
	def checkCompNameStartsWithCapital(ComponentInstance comp) {
		if (!Character.isUpperCase(comp.name.charAt(0))) {
			warning('Name should start with a capital', 
					ComponentArchitecturePackage.Literals.COMPONENT_INSTANCE__NAME,
					INVALID_COMP_NAME)
		}
	}
	
	
	@Check
	def checkServiceCompatibility(Connection connection) {
		if(ComponentArchitectureModelUtility.servicePortsCompatible(connection.from, connection.to) == false) {
			error("Connected to an incompatible service provider.",
				ComponentArchitecturePackage.Literals.CONNECTION__TO,
				INCOMPATIBLE_SERVICE
			)
		}
	}
	
	@Check
	def checkAllRequiredPortsInstantiated(ComponentInstance component) {
		val services = ComponentArchitectureModelUtility.getNonOptionalClientPorts(component)
		if(!services.forall[svc|component.ports.exists[it.port==svc]]) {
				warning("Some non-optional component-ports have not been instantiated!",
					ComponentArchitecturePackage.Literals.COMPONENT_INSTANCE__NAME,
					MISSING_PORTS
				)
		}
	}
	
	@Check
	def checkRequiredPortConnected(RequiredService svc) {
		val parent = svc.eContainer.eContainer
		if(parent instanceof SystemComponentArchitecture) {
			if(!parent.connections.exists[it.from==svc]) {
				warning("RequiredService has not yet been connected to any ProvidedService!",
					ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT,
					NOT_CONNECTED_SERVICE
				)
			}
		}
	}
	
	@Check
	def checkSupportedMiddlewareSelection(Connection connection) {
		if(connection.middlewareSelection !== null) {
			if(!connection.from.port.extensions.filter(SupportedMiddleware).exists[it.middleware.eClass==connection.middlewareSelection.eClass]) {
				error("Selected middleware "+connection.middlewareSelection.eClass.name+" is not supported by the required service "+connection.from.name,
					ComponentArchitecturePackage.Literals.CONNECTION__MIDDLEWARE_SELECTION,
					MIDDLWARE_SELECTION_NOT_SUPPORTED
				)
			}
			if(!connection.to.port.extensions.filter(SupportedMiddleware).exists[it.middleware.eClass==connection.middlewareSelection.eClass]) {
				error("Selected middleware "+connection.middlewareSelection.eClass.name+" is not supported by the provided service "+connection.to.name,
					ComponentArchitecturePackage.Literals.CONNECTION__MIDDLEWARE_SELECTION,
					MIDDLWARE_SELECTION_NOT_SUPPORTED
				)
			}
		}
	}
	
	@Check
	def checkConflictingMiddlewareSelection(Connection connection) {
		if(connection.middlewareSelection !== null) {
			val parent = connection.eContainer
			if(parent instanceof SystemComponentArchitecture) {
				for(other: parent.connections) {
					if(connection != other) {
						if(connection.to == other.to) {
							if(other.middlewareSelection !== null) {
								if(connection.middlewareSelection != other.middlewareSelection) {
									error("Selected middleware "+connection.middlewareSelection.eClass.name+" conflicts with another selection for the same service "+connection.to.name,
										ComponentArchitecturePackage.Literals.CONNECTION__MIDDLEWARE_SELECTION,
										CONFLICTING_MIDDLWARE_SELECTION
									)
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Check
	def checkSingleParamStruct(ParameterStructInstance param) {
		val parent = param.eContainer
		if(parent instanceof ComponentInstance) {
			if(parent.extensions.filter(ParameterStructInstance).size > 1) {
				error("Multiple ParameterStructs defined, but at most one is allowed.",
					SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER,
					DUPLICATE_PARAMETER_STRUCT
				)
			}
		}
	}
	
	@Check
	def checkCompatibleParamStruct(ParameterStructInstance paramInstance) {
		val compInstance = paramInstance.eContainer
		if(compInstance instanceof ComponentInstance) {
			val paramModel = paramInstance.parameter.eContainer
			var fqn = ""
			if(paramModel instanceof SystemParamModel) {
				for(param: paramModel.components) {
					if(param.componentInstance.equals(compInstance)) {
						fqn = fqn_provider.getFullyQualifiedName(param).toString
					}
				}
			}
			if(!paramInstance.parameter.componentInstance.equals(compInstance)) {
				error("Invalid ComponentParameterInstance.",
					SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER,
					INVALID_PARAMETER_STRUCT,
					fqn
				)
			}			
		}
	}
}
