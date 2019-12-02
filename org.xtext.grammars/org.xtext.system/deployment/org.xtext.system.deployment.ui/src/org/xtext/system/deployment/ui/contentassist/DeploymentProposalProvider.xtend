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
package org.xtext.system.deployment.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.ui.PlatformUI
import org.eclipse.core.resources.IResource
import com.google.inject.Inject
import org.xtext.base.utils.XtextResourceIndex
import org.ecore.system.targetPlatform.TargetPlatformPackage

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DeploymentProposalProvider extends AbstractDeploymentProposalProvider {
	
	@Inject private XtextResourceIndex index;
	
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
