/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.causeEffectChain.formatting2

import org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityChain
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CuaseEffectChainModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class CauseEffectChainFormatter extends AbstractFormatter2 {
	
//	@Inject extension CauseEffectChainGrammarAccess

	def dispatch void format(CuaseEffectChainModel cuaseEffectChainModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (activityChain : cuaseEffectChainModel.chains) {
			activityChain.format
		}
	}

	def dispatch void format(ActivityChain activityChain, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractChainLink : activityChain.chainLinks) {
			abstractChainLink.format
		}
		activityChain.desiredMinResponse.format
		activityChain.desiredMaxResponse.format
	}
	
	// TODO: implement for 
}
