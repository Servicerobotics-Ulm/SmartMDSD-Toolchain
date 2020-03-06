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
package org.eclipse.smartmdsd.xtext.system.deployment.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.ui.PlatformUI
import org.eclipse.core.resources.IResource
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DeploymentProposalProvider extends AbstractDeploymentProposalProvider {
	
	@Inject XtextResourceIndex index;
	
	override completeDeploymentModel_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDeploymentModel_Name(model, assignment, context, acceptor)
		if(model !== null) {
			val uri = model.eResource.URI
			if(uri.platform) {
				val String projectName = uri.segment(1);
				acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
			}
		} else {
			val iworkbench = PlatformUI.getWorkbench();
			if (iworkbench !== null) {
				val iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
				val iworkbenchpage = iworkbenchwindow.getActivePage();
				val resourceName = iworkbenchpage.activeEditor.editorInput.getAdapter(IResource).name
				val projectName = resourceName.substring(0,resourceName.indexOf('.'))
				acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", null, context))
			}			
		}
	}
	
	override completeTargetPlatformReference_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeTargetPlatformReference_Name(model, assignment, context, acceptor)
		val platforms = index.getVisibleEObjectDescriptions(model, TargetPlatformPackage.eINSTANCE.targetPlatformDefinition)
		platforms.forEach[
			platform |
			val fqn = platform.name.toString
			val simpleName = platform.name.lastSegment
			val text = simpleName + " using " + fqn
			acceptor.accept(createCompletionProposal(text, fqn+" - TargetPlatform", platform.image, context))
		]
	}
	
//	override completeTargetPlatformReference_TargetModel(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
////		super.completeTargetPlatformReference_TargetModel(model, assignment, context, acceptor)
//		val platforms = index.getVisibleEObjectDescriptions(model, TargetPlatformPackage.eINSTANCE.targetPlatform)
//		platforms.forEach[
//			platform |
//			val name = platform.name.toString
//			val text = name.replace(".","::")
////			println("name: "+name)
//			acceptor.accept(createCompletionProposal(text, name+" - TargetPlatform", platform.image, context))
//		]
//	}
	
}