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
package org.xtext.component.componentParameter.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.xtext.scoping.IScope
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.service.parameterDefinition.TriggerDefinition
import org.eclipse.xtext.scoping.Scopes
import org.ecore.service.parameterDefinition.ParameterDefinition
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.base.basicAttributes.BasicAttributesPackage
import com.google.inject.Inject
import org.ecore.component.componentParameter.ComponentParameterModelUtility

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentParameterScopeProvider extends AbstractComponentParameterScopeProvider {
	@Inject ComponentParameterModelUtility util;
	
	override getScope(EObject context, EReference reference) {
		if(reference == ComponentParameterPackage.eINSTANCE.triggerInstance_TriggerDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(TriggerDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_ParameterDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(ParameterDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_Attributes) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(context.parameterDef?.attributes)
			}
		} else if(reference == BasicAttributesPackage.eINSTANCE.attributeRefinement_Attribute) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(util.getReferencedAttributes(context))
			} else {
				val parent = context.eContainer
				if(parent instanceof ParameterInstance) {
					return Scopes.scopeFor(util.getReferencedAttributes(parent))
				}
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE;
	}
}
