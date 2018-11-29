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
package org.xtext.system.systemParameter.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.ecore.base.basicAttributes.AttributeRefinement
import org.ecore.system.systemParameter.ParameterRefinement
import org.ecore.component.componentParameter.ParameterInstance
import com.google.inject.Inject
import org.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.ecore.base.basicAttributes.PrimitiveType
import org.ecore.component.componentParameter.InternalParameter
import org.ecore.component.componentParameter.ExtendedParameter
import org.ecore.system.systemParameter.ComponentParameterInstance
import org.ecore.component.componentParameter.ComponentParametersRef

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SystemParameterProposalProvider extends AbstractSystemParameterProposalProvider {
	@Inject private BasicAttributesModelUtility util;
	
	override completeAttributeRefinement_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeAttributeRefinement_Value(model, assignment, context, acceptor)
		if(model instanceof AttributeRefinement) {
			val parent = model.eContainer
			if(parent instanceof ParameterRefinement) {
				val parameter = parent.parameter
				if(parameter instanceof ParameterInstance) {
					val origin = parameter.attributes.findFirst[it.attribute==model.attribute]
					if(origin !== null) {
						val attrType = model.attribute.type
						if(attrType instanceof PrimitiveType) {
							val text = util.getValueString(origin.value)
							acceptor.accept(createCompletionProposal(text, text+" - "+attrType.typeName.literal, attrType.image, context))
						}
					}
				}
			}
		}
	}
	
	override completeParameterRefinement_Attributes(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeParameterRefinement_Attributes(model, assignment, context, acceptor)
		var paramRefinement = model
		if(paramRefinement instanceof AttributeRefinement) {
			paramRefinement = model.eContainer
		} 
		if(paramRefinement instanceof ParameterRefinement) {
			val parameter = paramRefinement.parameter
			if(parameter instanceof ParameterInstance) {
				var String attributeEntries = ""
				for(attr: parameter.attributes) {
					if(!paramRefinement.attributes.exists[it.attribute==attr.attribute]) {
						attributeEntries += attr.attribute.name + " = " + util.getValueString(attr.value)
						if(attr != parameter.attributes.last) {
							attributeEntries += "\n\t\t\t"
						}
					}
				}
				acceptor.accept(createCompletionProposal(attributeEntries, "add all missing attribute entries", paramRefinement.image, context))
			} else if(parameter instanceof InternalParameter) {
				var String attributeEntries = ""
				for(attr: parameter.attributes) {
					if(!paramRefinement.attributes.exists[it.attribute==attr]) {
						attributeEntries += attr.name + " = " 
						if(attr.defaultvalue !== null) {
							attributeEntries += util.getValueString(attr.defaultvalue)
						} else {
							attributeEntries += util.getDefaultValuesFor(attr.type).get(0)
						}
						if(attr != parameter.attributes.last) {
							attributeEntries += "\n\t\t\t"
						}
					}
				}
				acceptor.accept(createCompletionProposal(attributeEntries, "add all missing attribute entries", paramRefinement.image, context))
			} else if(parameter instanceof ExtendedParameter) {
				var String attributeEntries = ""
				for(attr: parameter.attributes) {
					if(!paramRefinement.attributes.exists[it.attribute==attr]) {
						attributeEntries += attr.name + " = " 
						if(attr.defaultvalue !== null) {
							attributeEntries += util.getValueString(attr.defaultvalue)
						} else {
							attributeEntries += util.getDefaultValuesFor(attr.type).get(0)
						}
						if(attr != parameter.attributes.last) {
							attributeEntries += "\n\t\t\t"
						}
					}
				}
				acceptor.accept(createCompletionProposal(attributeEntries, "add all missing attribute entries", paramRefinement.image, context))
			}
		}
	}
	
	override completeComponentParameterInstance_ComponentParam(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeComponentParameterInstance_ComponentParam(model, assignment, context, acceptor)
		if(model instanceof ComponentParameterInstance) {
			val componentParams = model.componentInstance.component.elements.filter(ComponentParametersRef).head
			if(componentParams !== null) {
				val text = componentParams.parameter.name
				acceptor.accept(createCompletionProposal(text, text+" - ComponentParameter", componentParams.image, context))
			}
		}
	}
	
}
