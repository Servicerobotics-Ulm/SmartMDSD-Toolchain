/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.component.componentDatasheet.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ComponentDatasheetProposalProvider extends AbstractComponentDatasheetProposalProvider {
	
	override completeDatasheetProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for(property: ComponentDatasheetDefaultProperties.VALUES) {
			val proposal = property.literal
			val text = proposal + " - component property"
			acceptor.accept(createCompletionProposal(proposal, text, null, context))
		}
		super.completeDatasheetProperty_Name(model, assignment, context, acceptor)
	}
}
