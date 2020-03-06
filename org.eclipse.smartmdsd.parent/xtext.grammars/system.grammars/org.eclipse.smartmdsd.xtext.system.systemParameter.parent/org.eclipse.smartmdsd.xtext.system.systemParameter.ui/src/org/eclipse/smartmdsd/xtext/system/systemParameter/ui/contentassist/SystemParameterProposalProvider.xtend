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
package org.eclipse.smartmdsd.xtext.system.systemParameter.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SystemParameterProposalProvider extends AbstractSystemParameterProposalProvider {
	@Inject BasicAttributesModelUtility util;
	
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
