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
package org.eclipse.smartmdsd.xtext.system.targetPlatform.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.ui.PlatformUI
import org.eclipse.core.resources.IResource

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TargetPlatformProposalProvider extends AbstractTargetPlatformProposalProvider {
	
	override completeTargetPlatformModel_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeTargetPlatformModel_Name(model, assignment, context, acceptor)
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
	
}
