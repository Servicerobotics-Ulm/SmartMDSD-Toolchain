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
package org.xtext.component.componentDocumentation.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage
import org.ecore.component.componentDocumentation.ComponentDocumentation
import org.eclipse.xtext.scoping.Scopes
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDocumentation.ComponentServiceDocu
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.component.coordinationExtension.PublicOperationMode

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentDocumentationScopeProvider extends AbstractComponentDocumentationScopeProvider {

	override getScope(EObject context, EReference reference) {
		if(reference == ComponentDocumentationPackage.eINSTANCE.componentServiceDocu_Port) {
			val parent = context.eContainer
			if(parent instanceof ComponentDocumentation) {
				return Scopes.scopeFor(parent.component.elements.filter(ComponentPort))
			}
		} else if(reference == ComponentDocumentationPackage.eINSTANCE.componentModeDocu_Mode) {
			val parent = context.eContainer
			if(parent instanceof ComponentDocumentation) {
				return Scopes.scopeFor(parent.component.elements.filter(CoordinationSlavePort).map[it.elements].flatten.filter(PublicOperationMode))
			} else if(parent instanceof ComponentServiceDocu) {
				val parent2 = parent.eContainer
				if(parent2 instanceof ComponentDocumentation) {
					return Scopes.scopeFor(parent2.component.elements.filter(CoordinationSlavePort).map[it.elements].flatten.filter(PublicOperationMode))
				}
			}
		} else if(reference == ComponentDocumentationPackage.eINSTANCE.coordinationSlavePortDocu_Port) {
			val parent = context.eContainer
			if(parent instanceof ComponentDocumentation) {
				return Scopes.scopeFor(parent.component.elements.filter(CoordinationSlavePort))
			}
		}
		super.getScope(context, reference)
	}
	
}
