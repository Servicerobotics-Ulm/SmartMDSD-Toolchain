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
package org.xtext.base.stateMachine.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.base.stateMachine.ide.contentassist.antlr.internal.InternalStateMachineParser;
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;

public class StateMachineParser extends AbstractContentAssistParser {

	@Inject
	private StateMachineGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalStateMachineParser createParser() {
		InternalStateMachineParser result = new InternalStateMachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractMachineElementAccess().getAlternatives(), "rule__AbstractMachineElement__Alternatives");
					put(grammarAccess.getVisibilityTypeAccess().getAlternatives(), "rule__VisibilityType__Alternatives");
					put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateTransitionAccess().getGroup(), "rule__StateTransition__Group__0");
					put(grammarAccess.getStateMachineAccess().getNameAssignment_1(), "rule__StateMachine__NameAssignment_1");
					put(grammarAccess.getStateMachineAccess().getElementsAssignment_3(), "rule__StateMachine__ElementsAssignment_3");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0(), "rule__StateTransition__VisibilityAssignment_0");
					put(grammarAccess.getStateTransitionAccess().getFromAssignment_2(), "rule__StateTransition__FromAssignment_2");
					put(grammarAccess.getStateTransitionAccess().getToAssignment_4(), "rule__StateTransition__ToAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public StateMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
