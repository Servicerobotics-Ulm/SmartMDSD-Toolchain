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
package org.xtext.system.deployment.validation

import org.eclipse.xtext.validation.Check
import org.ecore.system.deployment.NamingService
import org.ecore.system.deployment.DeploymentModel
import org.ecore.system.deployment.TargetPlatformReference

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
