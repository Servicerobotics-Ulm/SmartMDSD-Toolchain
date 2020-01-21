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
