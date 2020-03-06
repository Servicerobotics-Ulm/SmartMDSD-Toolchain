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
package org.eclipse.smartmdsd.xtext.system.deployment.formatting2

import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel
import org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement
import org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact
import org.eclipse.smartmdsd.ecore.system.deployment.NamingService

class DeploymentFormatter extends AbstractFormatter2 {
	
//	@Inject extension DeploymentGrammarAccess

	def dispatch void format(DeploymentModel deploymentModel, extension IFormattableDocument document) {
		val ropen = deploymentModel.regionFor.keyword("{")
		val rclose = deploymentModel.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		for (AbstractDeploymentElement abstractDeploymentElement : deploymentModel.getElements()) {
			abstractDeploymentElement.format;
		}
	}

	def dispatch void format(ComponentArtefact componentArtefact, extension IFormattableDocument document) {
		componentArtefact.append[setNewLines(1,1,2)]
	}
	
	def dispatch void format(NamingService ns, extension IFormattableDocument document) {
		val ropen = ns.regionFor.keyword("{")
		val rclose = ns.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		ns.append[setNewLines(1,1,2)]
	}
	
	def dispatch void format(TargetPlatformReference cpr, extension IFormattableDocument document) {
		val ropen = cpr.regionFor.keyword("{")
		val rclose = cpr.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		cpr.append[setNewLines(1,1,2)]
		cpr.login?.append[setNewLines(1,1,2)]
		cpr.host?.append[setNewLines(1,1,2)]
		cpr.directory?.append[setNewLines(1,1,2)]
	}

}
