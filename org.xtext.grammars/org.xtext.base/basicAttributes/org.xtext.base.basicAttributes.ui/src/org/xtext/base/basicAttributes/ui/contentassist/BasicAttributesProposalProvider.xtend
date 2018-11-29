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
package org.xtext.base.basicAttributes.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.xtext.RuleCall
import com.google.inject.Inject
import org.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.AttributeRefinement

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class BasicAttributesProposalProvider extends AbstractBasicAttributesProposalProvider {
	@Inject private BasicAttributesModelUtility util;
	
	override complete_AttributeDefinition(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_AttributeDefinition(model, ruleCall, context, acceptor)
		if(model instanceof AttributeDefinition) {
			var proposalText = model.name + " : " + util.getTypeName(model.type)
			if(model.defaultvalue !== null) {
				proposalText += " = " + util.getValueString(model.defaultvalue)
			}
			acceptor.accept(createCompletionProposal(proposalText, "clone previous "+ruleCall.rule.name, model.image, context))
		}
	}

	override completeSingleValue_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeSingleValue_Value(model, assignment, context, acceptor)
		var attr = model
		if(model instanceof ArrayValue) {
			attr = model.eContainer
		}
		var AbstractAttributeType attrType = null
		if(attr instanceof AttributeDefinition) {
			attrType = attr.type
		} else if(attr instanceof AttributeRefinement) {
			attrType = attr.attribute.type
			if(attrType instanceof PrimitiveType) {
				val defVal = attr.attribute.defaultvalue 
				val text = util.getValueString(defVal)
				if(defVal !== null) {
					acceptor.accept(createCompletionProposal(text, text+" - "+attrType.typeName.literal, attrType.image, context))
				}
			}
		}
		if(attrType !== null) {
			val type = attrType // define final variable to use it in lambda expressions
			val textList = util.getDefaultValuesFor(attrType)
			textList.forEach[
				text |
				acceptor.accept(createCompletionProposal(text, text+" - "+util.getTypeName(type), type.image, context))
			]
		}
	}
}
