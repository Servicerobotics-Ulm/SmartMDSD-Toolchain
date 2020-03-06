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
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ActivityArchitectureProposalProvider extends AbstractActivityArchitectureProposalProvider 
{
//	@Inject private XtextResourceIndex index;
	
	override completeActivityArchitectureModel_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeActivityArchitectureModel_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeDataTriggered_Prescale(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDataTriggered_Prescale(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("1", "1 - prescale factor", model.image, context))
	}
	
	override completeInputHandlerNode_Prescale(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInputHandlerNode_Prescale(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("1", "1 - prescale factor", model.image, context))
	}
	
	override completePeriodicTimer_PeriodicActFreq(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completePeriodicTimer_PeriodicActFreq(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("1.0 Hz", "1.0 Hz - activation frequency", model.image, context))
	}
	
	override completeTimeValue_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeTimeValue_Value(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("100 ms", "100 ms - time value", model.image, context))
	}
	
}
