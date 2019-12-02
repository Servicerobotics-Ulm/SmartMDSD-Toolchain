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
package org.xtext.system.deployment.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.deployment.AbstractDeploymentElement
import org.ecore.system.deployment.ComponentArtefact
import org.ecore.system.deployment.DeploymentModel
import org.xtext.system.deployment.services.DeploymentGrammarAccess
import org.ecore.system.deployment.NamingService
import org.ecore.system.deployment.TargetPlatformReference

class DeploymentFormatter extends AbstractFormatter2 {
	
	@Inject extension DeploymentGrammarAccess

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
