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
package org.eclipse.smartmdsd.xtext.system.deployment.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.system.deployment.NamingService
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel
import org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DeploymentValidator extends AbstractDeploymentValidator {
	
	protected static val DEPLOYMENT_ISSUE_PREFIX = "org.xtext.system.deployment."
	public static val MULTIPLE_NAMING_SERVICES = DEPLOYMENT_ISSUE_PREFIX + "MultipleNamingServices"
	public static val MISSING_NETWORK_INTERFACE = DEPLOYMENT_ISSUE_PREFIX + "MissingNetworkInterface"
	public static val MISSING_UPLOAD_DIRECTORY = DEPLOYMENT_ISSUE_PREFIX + "MissingUploadDirectory"
//	public static val MISSING_LOGIN_ACCOUNT = DEPLOYMENT_ISSUE_PREFIX + "MissingLoginAccount"
	
	@Check
	def checkSingleNamingService(NamingService ns) {
		val parent = ns.eContainer
		if(parent instanceof DeploymentModel) {
			if(parent.elements.filter(NamingService).size > 1) {
				error("Multiple NamingService-elements found, but (at most) one is allowed.",
					null, MULTIPLE_NAMING_SERVICES
				)
			}
		}
	}
	
	@Check
	def checkMissingElements(TargetPlatformReference ref) {
		if(ref.host === null) {
			warning("Missing NetworkInterfaceInstance.",
				null, MISSING_NETWORK_INTERFACE
			)
		}
		if(ref.directory === null) {
			warning("Missing UploadDirectory.",
				null, MISSING_UPLOAD_DIRECTORY
			)
		}
//		if(ref.login === null) {
//			warning("Missing LoginAccount.",
//				null, MISSING_LOGIN_ACCOUNT
//			)
//		}
	}
}
