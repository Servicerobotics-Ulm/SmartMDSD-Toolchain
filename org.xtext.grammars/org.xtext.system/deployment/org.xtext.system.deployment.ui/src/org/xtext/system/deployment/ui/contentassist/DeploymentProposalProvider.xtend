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
