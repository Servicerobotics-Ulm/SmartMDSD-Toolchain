/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.RuleCall
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class ServiceDefinitionProposalProvider extends AbstractServiceDefinitionProposalProvider {
	override completeServiceDefRepository_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeServiceDefRepository_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeServiceRepoVersion_Major(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeServiceRepoVersion_Major(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("1.0", "1.0 - Version", model.image, context))
	}
	
	override completeCommRepoImport_ImportedNamespace(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeCommRepoImport_ImportedNamespace(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			val name = projectName
			val text = name+".*;"
			acceptor.accept(createCompletionProposal(text, name+" - CommRepositoryImport", model.image, context))
		}
	}

	override complete_ParameterPattern(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_ParameterPattern(model, ruleCall, context, acceptor)
		val proposalText = ruleCall.rule.name + " < " + ParameterDefinitionDefaultLib.DEFAULT_PARAMETR_SET_SIMPLE + " >"
		acceptor.accept(createCompletionProposal(proposalText, "add default "+ruleCall.rule.name, model.image, context))
	}
}
