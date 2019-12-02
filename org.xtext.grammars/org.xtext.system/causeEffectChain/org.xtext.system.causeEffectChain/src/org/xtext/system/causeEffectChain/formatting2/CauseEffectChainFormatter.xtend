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
package org.xtext.system.causeEffectChain.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.causeEffectChain.AbstractChainLink
import org.ecore.system.causeEffectChain.ActivityChain
import org.ecore.system.causeEffectChain.CuaseEffectChainModel
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess

class CauseEffectChainFormatter extends AbstractFormatter2 {
	
	@Inject extension CauseEffectChainGrammarAccess

	def dispatch void format(CuaseEffectChainModel cuaseEffectChainModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ActivityChain activityChain : cuaseEffectChainModel.getChains()) {
			activityChain.format;
		}
	}

	def dispatch void format(ActivityChain activityChain, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (AbstractChainLink abstractChainLink : activityChain.getChainLinks()) {
			abstractChainLink.format;
		}
		activityChain.getDesiredMinResponse.format;
		activityChain.getDesiredMaxResponse.format;
	}
	
	// TODO: implement for 
}
