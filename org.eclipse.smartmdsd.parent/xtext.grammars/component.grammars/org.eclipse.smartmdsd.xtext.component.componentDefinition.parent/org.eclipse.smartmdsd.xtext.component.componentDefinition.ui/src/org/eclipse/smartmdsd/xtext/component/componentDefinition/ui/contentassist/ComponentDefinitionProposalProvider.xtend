//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
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
//================================================================
package org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage
import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ComponentDefinitionProposalProvider extends AbstractComponentDefinitionProposalProvider {
	
	@Inject XtextResourceIndex index;
	
	override completeComponentDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeComponentDefinition_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}

	override completeServiceRepoImport_ImportedNamespace(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeServiceRepoImport_ImportedNamespace(model, assignment, context, acceptor)
		val repos = index.getVisibleEObjectDescriptions(model, ServiceDefinitionPackage.eINSTANCE.serviceDefRepository)
		repos.forEach[
			repo |
			val name = repo.name.toString
			val text = name+".*;"
			acceptor.accept(createCompletionProposal(text, name+" - ServiceRepositoryImport", repo.image, context))
		]
	}
	
	override completeDefaultPeriodicTimer_PeriodicActFreq(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDefaultPeriodicTimer_PeriodicActFreq(model, assignment, context, acceptor)
		if(model instanceof DefaultPeriodicTimer) {
			val parent = model.eContainer
			if(parent instanceof Activity) {
				for(ac: parent.extensions.filter(ActivationConstraints)) {
					if(ac.minActFreq > 0.0) {
						acceptor.accept(createCompletionProposal(ac.minActFreq.toString+" Hz", context))
					}
					if(ac.maxActFreq > 0.0) {
						acceptor.accept(createCompletionProposal(ac.maxActFreq.toString+" Hz", context))
					}
				}
			}
		} else {
			acceptor.accept(createCompletionProposal("10.0 Hz", context))
		}
	}
	
}
