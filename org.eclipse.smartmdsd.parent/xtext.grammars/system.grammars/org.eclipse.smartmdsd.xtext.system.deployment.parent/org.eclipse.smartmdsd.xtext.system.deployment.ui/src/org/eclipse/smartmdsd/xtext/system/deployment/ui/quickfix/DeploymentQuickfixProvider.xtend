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
package org.eclipse.smartmdsd.xtext.system.deployment.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel
import org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentFactory
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.EObject
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface
import org.eclipse.smartmdsd.xtext.system.deployment.validation.DeploymentValidator

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
