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
package org.xtext.system.componentArchitecture.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.inject.Inject
import org.xtext.base.utils.XtextResourceIndex
import org.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.ecore.system.systemParameter.ParameterStructInstance
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.ecore.system.componentArchitecture.ComponentInstance
import org.eclipse.emf.ecore.util.EcoreUtil
import org.ecore.system.systemParameter.SystemParameterPackage
import org.ecore.system.systemParameter.ComponentParameterInstance

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ComponentArchitectureProposalProvider extends AbstractComponentArchitectureProposalProvider {
	
	@Inject private XtextResourceIndex index;
	@Inject private IQualifiedNameProvider fqn_provider;
	
	override completeSystemComponentArchitecture_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeSystemComponentArchitecture_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeComponentInstance_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeComponentInstance_Name(model, assignment, context, acceptor)
		val components = index.getVisibleEObjectDescriptions(model, ComponentDefinitionPackage.eINSTANCE.componentDefinition)
		components.forEach[
			component |
			val name = component.name.toString
			val text = name + " instantiates " + name + " {\n\n\t}"
			acceptor.accept(createCompletionProposal(text, name+" - ComponentDefinition", model.image, context))
		]
	}
	
	override completeParameterStructInstance_Parameter(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeParameterStructInstance_Parameter(model, assignment, context, acceptor)
		if(model instanceof ParameterStructInstance) {
			val compInstance = model.eContainer
			if(compInstance instanceof ComponentInstance) {
				val componentParams = index.getVisibleEObjectDescriptions(model, SystemParameterPackage.eINSTANCE.componentParameterInstance)
				for(componentParam: componentParams) {
					val componentParamObj = componentParam.EObjectOrProxy
					if(componentParamObj.eIsProxy) {
						val object = EcoreUtil.resolve(componentParamObj, compInstance);
						if(object instanceof ComponentParameterInstance) {
							if(object.componentInstance.equals(compInstance)) {
								val text = fqn_provider.getFullyQualifiedName(object).toString
								acceptor.accept(createCompletionProposal(text, text+" - ComponentParameterInstance", model.image, context))
							}
						}
					}
				}
			}
		}
	}
	
}
