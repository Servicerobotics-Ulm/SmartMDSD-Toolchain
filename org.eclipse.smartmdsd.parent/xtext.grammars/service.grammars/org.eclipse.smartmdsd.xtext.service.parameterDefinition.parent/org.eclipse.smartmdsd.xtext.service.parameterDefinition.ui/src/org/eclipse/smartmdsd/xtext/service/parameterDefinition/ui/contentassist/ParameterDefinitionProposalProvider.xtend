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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class ParameterDefinitionProposalProvider extends AbstractParameterDefinitionProposalProvider {
	@Inject XtextResourceIndex index;
	
	override completeParameterSetRepository_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeParameterSetRepository_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeParamDefRepoImport_ImportedNamespace(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeParamDefRepoImport_ImportedNamespace(model, assignment, context, acceptor)
		val repos = index.getVisibleEObjectDescriptions(model, ParameterDefinitionPackage.eINSTANCE.parameterSetRepository)
		repos.forEach[
			repo |
			val name = repo.name.toString
			val text = name+".*;"
			acceptor.accept(createCompletionProposal(text, name+" - CommRepositoryImport", repo.image, context))
		]
	}
}
