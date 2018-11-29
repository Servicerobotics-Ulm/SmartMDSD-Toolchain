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
package org.xtext.system.causeEffectChain.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.causeEffectChain.ide.contentassist.antlr.internal.InternalCauseEffectChainParser;
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;

public class CauseEffectChainParser extends AbstractContentAssistParser {

	@Inject
	private CauseEffectChainGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCauseEffectChainParser createParser() {
		InternalCauseEffectChainParser result = new InternalCauseEffectChainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractChainLinkAccess().getAlternatives(), "rule__AbstractChainLink__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getCuaseEffectChainModelAccess().getGroup(), "rule__CuaseEffectChainModel__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getActivityChainAccess().getGroup(), "rule__ActivityChain__Group__0");
					put(grammarAccess.getActivityChainAccess().getGroup_4(), "rule__ActivityChain__Group_4__0");
					put(grammarAccess.getActivityChainAccess().getGroup_4_3(), "rule__ActivityChain__Group_4_3__0");
					put(grammarAccess.getActivityLinkAccess().getGroup(), "rule__ActivityLink__Group__0");
					put(grammarAccess.getInputHandlerLinkAccess().getGroup(), "rule__InputHandlerLink__Group__0");
					put(grammarAccess.getMinResponseTimeAccess().getGroup(), "rule__MinResponseTime__Group__0");
					put(grammarAccess.getMaxResponseTimeAccess().getGroup(), "rule__MaxResponseTime__Group__0");
					put(grammarAccess.getCuaseEffectChainModelAccess().getNameAssignment_1(), "rule__CuaseEffectChainModel__NameAssignment_1");
					put(grammarAccess.getCuaseEffectChainModelAccess().getActArchAssignment_3(), "rule__CuaseEffectChainModel__ActArchAssignment_3");
					put(grammarAccess.getCuaseEffectChainModelAccess().getChainsAssignment_5(), "rule__CuaseEffectChainModel__ChainsAssignment_5");
					put(grammarAccess.getActivityChainAccess().getNameAssignment_2(), "rule__ActivityChain__NameAssignment_2");
					put(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_2(), "rule__ActivityChain__ChainLinksAssignment_4_2");
					put(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_3_1(), "rule__ActivityChain__ChainLinksAssignment_4_3_1");
					put(grammarAccess.getActivityChainAccess().getDesiredMinResponseAssignment_5_0(), "rule__ActivityChain__DesiredMinResponseAssignment_5_0");
					put(grammarAccess.getActivityChainAccess().getDesiredMaxResponseAssignment_5_1(), "rule__ActivityChain__DesiredMaxResponseAssignment_5_1");
					put(grammarAccess.getActivityLinkAccess().getRefAssignment_1(), "rule__ActivityLink__RefAssignment_1");
					put(grammarAccess.getInputHandlerLinkAccess().getRefAssignment_1(), "rule__InputHandlerLink__RefAssignment_1");
					put(grammarAccess.getMinResponseTimeAccess().getValueAssignment_1(), "rule__MinResponseTime__ValueAssignment_1");
					put(grammarAccess.getMinResponseTimeAccess().getUnitAssignment_2(), "rule__MinResponseTime__UnitAssignment_2");
					put(grammarAccess.getMaxResponseTimeAccess().getValueAssignment_1(), "rule__MaxResponseTime__ValueAssignment_1");
					put(grammarAccess.getMaxResponseTimeAccess().getUnitAssignment_2(), "rule__MaxResponseTime__UnitAssignment_2");
					put(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), "rule__ActivityChain__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CauseEffectChainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CauseEffectChainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
