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
package org.eclipse.smartmdsd.xtext.base.basicAttributes.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.RuleCall
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesModelUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class BasicAttributesProposalProvider extends AbstractBasicAttributesProposalProvider {
	@Inject BasicAttributesModelUtility util;
	
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
