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
package org.xtext.system.deployment

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.ecore.system.deployment.ComponentArtefact
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.system.deployment.DeploymentPackage
import org.ecore.system.deployment.NetworkInterfaceSelection
import org.ecore.system.deployment.LoginAccountSelection

class DeploymentQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(ComponentArtefact artefact) {
		val parent = super.getFullyQualifiedName(artefact.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(artefact, DeploymentPackage.Literals.COMPONENT_ARTEFACT__COMPONENT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(artefact.eIsSet(DeploymentPackage.Literals.COMPONENT_ARTEFACT__COMPONENT)) {
				return parent.append(artefact.component.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
   	def QualifiedName qualifiedName(NetworkInterfaceSelection selection) {
		val parent = super.getFullyQualifiedName(selection.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(selection, DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION__NETWORK)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(selection.eIsSet(DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION__NETWORK)) {
				return parent.append(selection.network.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
    def QualifiedName qualifiedName(LoginAccountSelection selection) {
		val parent = super.getFullyQualifiedName(selection.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(selection, DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION__LOGIN)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(selection.eIsSet(DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION__LOGIN)) {
				return parent.append(selection.login.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
//   	def QualifiedName qualifiedName(TargetPlatformReference platform) {
//		val parent = super.getFullyQualifiedName(platform.eContainer());
//		val platformNodes = NodeModelUtils.findNodesForFeature(platform, DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__PLATFORM)
//		if(!platformNodes.empty) {
//			return parent.append(NodeModelUtils.getTokenText(platformNodes.get(0)))				
//		} else {
//			if(platform.eIsSet(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__PLATFORM)) {
//				return parent.append(platform.name);
//			}
//		}
//        return QualifiedName.EMPTY;
//    }
}