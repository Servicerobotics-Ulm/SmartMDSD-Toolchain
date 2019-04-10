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
package org.xtext.behavior.skillRealization.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.behavior.skillRealization.SkillRealizationPackage
import org.ecore.behavior.skillRealization.CoordinationModuleRealization
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import org.ecore.behavior.skillRealization.ComponentCoordinationActionParameter
import org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation


/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SkillRealizationScopeProvider extends AbstractSkillRealizationScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(reference == SkillRealizationPackage.eINSTANCE.skillRealization_SkillDef) {
			val parent = context.eContainer
			if(parent instanceof CoordinationModuleRealization) {
				return Scopes.scopeFor(parent.coordinationModuleDef.skills);
			}
		} else if(reference == SkillRealizationPackage.eINSTANCE.componentCoordinationActionParameter_Parameter) {
			if(context instanceof ComponentCoordinationActionParameter) {
				if(context.coordinationService !== null) {
					//this was the scope for the component parameter
					//return Scopes.scopeFor(context.coordinationService.elements.filter(ComponentParametersRef)?.get(0).parameter.eAllContents.toIterable.filter(ComponentRunTimeParameterBase))
					return Scopes.scopeFor(context.coordinationService.coordinationInterfaceDef.parameterPattern.parameterSet.parameters);
				} else {
					return IScope.NULLSCOPE;
				}
			}
		} else if(reference == SkillRealizationPackage.eINSTANCE.componentCoordinationActionActivation_State) {
			if(context instanceof ComponentCoordinationActionActivation) {
				if(context.coordinationService !== null) {
					//this was the scope for the component parameter
					//return Scopes.scopeFor(context.coordinationService.elements.filter(CoordinationSlavePort)?.get(0).elements.filter(PublicOperationMode));
					return Scopes.scopeFor(context.coordinationService.coordinationInterfaceDef.statePattern.modes.modes);
				} else {
					return IScope.NULLSCOPE;
				}
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE
	}
}
