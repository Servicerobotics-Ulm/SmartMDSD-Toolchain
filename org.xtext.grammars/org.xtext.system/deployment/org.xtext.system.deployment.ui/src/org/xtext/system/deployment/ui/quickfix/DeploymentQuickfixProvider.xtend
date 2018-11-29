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
package org.xtext.system.deployment.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.system.deployment.validation.DeploymentValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.system.deployment.DeploymentModel
import org.ecore.system.deployment.TargetPlatformReference
import org.ecore.system.deployment.DeploymentFactory
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.EObject
import org.ecore.system.targetPlatform.NetworkInterface

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class DeploymentQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(DeploymentValidator.MULTIPLE_NAMING_SERVICES)
	def fixDuplicateOperationModeBinding(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate NamingService', 
			'Remove duplicate NamingService.', '') [
			element, context |
			val model = (element.eContainer as DeploymentModel)
			model.elements.remove(element)
		]
	}
	
	@Fix(DeploymentValidator.MISSING_UPLOAD_DIRECTORY)
	def fixMissingUploadDirectoy(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Create a default UploadDirectory', 
			'Create a default UploadDirectory', '') [
			element, context |
			val platform = (element as TargetPlatformReference)
			platform.directory = DeploymentFactory.eINSTANCE.createUploadDirectory
			platform.directory.path = "/tmp"
		]
	}
	
	@Fix(DeploymentValidator.MISSING_NETWORK_INTERFACE)
	def fixMissingNetworkInterface(Issue issue, IssueResolutionAcceptor acceptor) {
		val object = issue.EObject
		if(object instanceof TargetPlatformReference) {
			for(network: object.platform.elements.filter(NetworkInterface)) {
				acceptor.accept(issue, 
					'Use the NetworkInterface '+network.name, 
					'Use the NetworkInterface '+network.name, '') [
					element, context |
					val platform = (element as TargetPlatformReference)
					platform.host = DeploymentFactory.eINSTANCE.createNetworkInterfaceSelection
					platform.host.network = network
				]
			}
		}
	}
	
//	@Fix(DeploymentValidator.MISSING_LOGIN_ACCOUNT)
//	def fixMissingLoginAccount(Issue issue, IssueResolutionAcceptor acceptor) {
//		val object = issue.EObject
//		if(object instanceof TargetPlatformReference) {
//			for(login: object.platform.elements.filter(LoginAccount)) {
//				acceptor.accept(issue, 
//					'Use the LoginAccount '+login.name, 
//					'Use the LoginAccount '+login.name, '') [
//					element, context |
//					val platform = (element as TargetPlatformReference)
//					platform.login = DeploymentFactory.eINSTANCE.createLoginAccountSelection
//					platform.login.login = login
//				]
//			}
//		}
//	}
	
	def private EObject getEObject(Issue issue) {
		val modificationContext = modificationContextFactory.createModificationContext(issue);
		val xtextDocument = modificationContext.getXtextDocument();
		val object = xtextDocument.readOnly(new IUnitOfWork<EObject, XtextResource>() {
				override exec(XtextResource state) throws Exception {
					return state.getEObject(issue.uriToProblem.fragment());
				}
			});
		return object;
	}
}
