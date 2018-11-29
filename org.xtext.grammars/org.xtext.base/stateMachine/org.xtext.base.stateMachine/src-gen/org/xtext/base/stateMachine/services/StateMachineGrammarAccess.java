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
package org.xtext.base.stateMachine.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class StateMachineGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateMachineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractMachineElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StateMachine mach::StateMachine:
		//	'StateMachine' name=ID '{'
		//	elements+=AbstractMachineElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'StateMachine' name=ID '{' elements+=AbstractMachineElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'StateMachine'
		public Keyword getStateMachineKeyword_0() { return cStateMachineKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractMachineElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractMachineElement
		public RuleCall getElementsAbstractMachineElementParserRuleCall_3_0() { return cElementsAbstractMachineElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class AbstractMachineElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.AbstractMachineElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractStateElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStateTransitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractMachineElement mach::AbstractMachineElement:
		//	AbstractStateElement | StateTransition;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractStateElement | StateTransition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AbstractStateElement
		public RuleCall getAbstractStateElementParserRuleCall_0() { return cAbstractStateElementParserRuleCall_0; }
		
		//StateTransition
		public RuleCall getStateTransitionParserRuleCall_1() { return cStateTransitionParserRuleCall_1; }
	}
	public class AbstractStateElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.AbstractStateElement");
		private final RuleCall cStateParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AbstractStateElement mach::AbstractStateElement:
		//	State;
		@Override public ParserRule getRule() { return rule; }
		
		//State
		public RuleCall getStateParserRuleCall() { return cStateParserRuleCall; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//State mach::State:
		//	'State' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'State' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//'State'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class StateTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.StateTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVisibilityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVisibilityVisibilityTypeEnumRuleCall_0_0 = (RuleCall)cVisibilityAssignment_0.eContents().get(0);
		private final Keyword cStateTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFromAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFromAbstractStateElementCrossReference_2_0 = (CrossReference)cFromAssignment_2.eContents().get(0);
		private final RuleCall cFromAbstractStateElementFQNParserRuleCall_2_0_1 = (RuleCall)cFromAbstractStateElementCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cToAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cToAbstractStateElementCrossReference_4_0 = (CrossReference)cToAssignment_4.eContents().get(0);
		private final RuleCall cToAbstractStateElementFQNParserRuleCall_4_0_1 = (RuleCall)cToAbstractStateElementCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//StateTransition mach::StateTransition:
		//	visibility=VisibilityType?
		//	'StateTransition' from=[mach::AbstractStateElement|FQN] '->' to=[mach::AbstractStateElement|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//visibility=VisibilityType? 'StateTransition' from=[mach::AbstractStateElement|FQN] '->'
		//to=[mach::AbstractStateElement|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//visibility=VisibilityType?
		public Assignment getVisibilityAssignment_0() { return cVisibilityAssignment_0; }
		
		//VisibilityType
		public RuleCall getVisibilityVisibilityTypeEnumRuleCall_0_0() { return cVisibilityVisibilityTypeEnumRuleCall_0_0; }
		
		//'StateTransition'
		public Keyword getStateTransitionKeyword_1() { return cStateTransitionKeyword_1; }
		
		//from=[mach::AbstractStateElement|FQN]
		public Assignment getFromAssignment_2() { return cFromAssignment_2; }
		
		//[mach::AbstractStateElement|FQN]
		public CrossReference getFromAbstractStateElementCrossReference_2_0() { return cFromAbstractStateElementCrossReference_2_0; }
		
		//FQN
		public RuleCall getFromAbstractStateElementFQNParserRuleCall_2_0_1() { return cFromAbstractStateElementFQNParserRuleCall_2_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//to=[mach::AbstractStateElement|FQN]
		public Assignment getToAssignment_4() { return cToAssignment_4; }
		
		//[mach::AbstractStateElement|FQN]
		public CrossReference getToAbstractStateElementCrossReference_4_0() { return cToAbstractStateElementCrossReference_4_0; }
		
		//FQN
		public RuleCall getToAbstractStateElementFQNParserRuleCall_4_0_1() { return cToAbstractStateElementFQNParserRuleCall_4_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	
	public class VisibilityTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.stateMachine.StateMachine.VisibilityType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPUBLICEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRIVATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VisibilityType returns mach::VisibilityType:
		//	PUBLIC='public' | PRIVATE='private';
		public EnumRule getRule() { return rule; }
		
		//PUBLIC='public' | PRIVATE='private'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PUBLIC='public'
		public EnumLiteralDeclaration getPUBLICEnumLiteralDeclaration_0() { return cPUBLICEnumLiteralDeclaration_0; }
		
		//'public'
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }
		
		//PRIVATE='private'
		public EnumLiteralDeclaration getPRIVATEEnumLiteralDeclaration_1() { return cPRIVATEEnumLiteralDeclaration_1; }
		
		//'private'
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }
	}
	
	private final StateMachineElements pStateMachine;
	private final FQNElements pFQN;
	private final VisibilityTypeElements eVisibilityType;
	private final AbstractMachineElementElements pAbstractMachineElement;
	private final AbstractStateElementElements pAbstractStateElement;
	private final StateElements pState;
	private final StateTransitionElements pStateTransition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StateMachineGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStateMachine = new StateMachineElements();
		this.pFQN = new FQNElements();
		this.eVisibilityType = new VisibilityTypeElements();
		this.pAbstractMachineElement = new AbstractMachineElementElements();
		this.pAbstractStateElement = new AbstractStateElementElements();
		this.pState = new StateElements();
		this.pStateTransition = new StateTransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.base.stateMachine.StateMachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StateMachine mach::StateMachine:
	//	'StateMachine' name=ID '{'
	//	elements+=AbstractMachineElement*
	//	'}';
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//enum VisibilityType returns mach::VisibilityType:
	//	PUBLIC='public' | PRIVATE='private';
	public VisibilityTypeElements getVisibilityTypeAccess() {
		return eVisibilityType;
	}
	
	public EnumRule getVisibilityTypeRule() {
		return getVisibilityTypeAccess().getRule();
	}
	
	//AbstractMachineElement mach::AbstractMachineElement:
	//	AbstractStateElement | StateTransition;
	public AbstractMachineElementElements getAbstractMachineElementAccess() {
		return pAbstractMachineElement;
	}
	
	public ParserRule getAbstractMachineElementRule() {
		return getAbstractMachineElementAccess().getRule();
	}
	
	//AbstractStateElement mach::AbstractStateElement:
	//	State;
	public AbstractStateElementElements getAbstractStateElementAccess() {
		return pAbstractStateElement;
	}
	
	public ParserRule getAbstractStateElementRule() {
		return getAbstractStateElementAccess().getRule();
	}
	
	//State mach::State:
	//	'State' name=ID ';'?;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//StateTransition mach::StateTransition:
	//	visibility=VisibilityType?
	//	'StateTransition' from=[mach::AbstractStateElement|FQN] '->' to=[mach::AbstractStateElement|FQN] ';'?;
	public StateTransitionElements getStateTransitionAccess() {
		return pStateTransition;
	}
	
	public ParserRule getStateTransitionRule() {
		return getStateTransitionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
