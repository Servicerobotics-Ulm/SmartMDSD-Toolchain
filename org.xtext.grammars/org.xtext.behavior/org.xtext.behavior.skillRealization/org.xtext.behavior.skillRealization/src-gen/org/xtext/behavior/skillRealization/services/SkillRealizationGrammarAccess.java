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
package org.xtext.behavior.skillRealization.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SkillRealizationGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SkillRealizationModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.SkillRealizationModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSkillRealizationModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSkillRealizationModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSkillsetsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSkillsetsSkillRealizationSetParserRuleCall_3_0 = (RuleCall)cSkillsetsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SkillRealizationModel:
		//	{SkillRealizationModel}
		//	'SkillRealizationModel'
		//	'{'
		//	skillsets+=SkillRealizationSet*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SkillRealizationModel} 'SkillRealizationModel' '{' skillsets+=SkillRealizationSet* '}'
		public Group getGroup() { return cGroup; }
		
		//{SkillRealizationModel}
		public Action getSkillRealizationModelAction_0() { return cSkillRealizationModelAction_0; }
		
		//'SkillRealizationModel'
		public Keyword getSkillRealizationModelKeyword_1() { return cSkillRealizationModelKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//skillsets+=SkillRealizationSet*
		public Assignment getSkillsetsAssignment_3() { return cSkillsetsAssignment_3; }
		
		//SkillRealizationSet
		public RuleCall getSkillsetsSkillRealizationSetParserRuleCall_3_0() { return cSkillsetsSkillRealizationSetParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.FQN");
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
	public class SkillRealizationSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.SkillRealizationSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillSetRealizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSkillSetDefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSkillDefSetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSkillDefSetSkillDefinitionSetCrossReference_3_0 = (CrossReference)cSkillDefSetAssignment_3.eContents().get(0);
		private final RuleCall cSkillDefSetSkillDefinitionSetFQNParserRuleCall_3_0_1 = (RuleCall)cSkillDefSetSkillDefinitionSetCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSkillsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSkillsSkillRealizationParserRuleCall_5_0 = (RuleCall)cSkillsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SkillRealizationSet:
		//	'SkillSetRealization' name=ID 'skillSetDef' skillDefSet=[skillDefinition::SkillDefinitionSet|FQN]
		//	'{'
		//	skills+=SkillRealization*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillSetRealization' name=ID 'skillSetDef' skillDefSet=[skillDefinition::SkillDefinitionSet|FQN] '{'
		//skills+=SkillRealization* '}'
		public Group getGroup() { return cGroup; }
		
		//'SkillSetRealization'
		public Keyword getSkillSetRealizationKeyword_0() { return cSkillSetRealizationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'skillSetDef'
		public Keyword getSkillSetDefKeyword_2() { return cSkillSetDefKeyword_2; }
		
		//skillDefSet=[skillDefinition::SkillDefinitionSet|FQN]
		public Assignment getSkillDefSetAssignment_3() { return cSkillDefSetAssignment_3; }
		
		//[skillDefinition::SkillDefinitionSet|FQN]
		public CrossReference getSkillDefSetSkillDefinitionSetCrossReference_3_0() { return cSkillDefSetSkillDefinitionSetCrossReference_3_0; }
		
		//FQN
		public RuleCall getSkillDefSetSkillDefinitionSetFQNParserRuleCall_3_0_1() { return cSkillDefSetSkillDefinitionSetFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//skills+=SkillRealization*
		public Assignment getSkillsAssignment_5() { return cSkillsAssignment_5; }
		
		//SkillRealization
		public RuleCall getSkillsSkillRealizationParserRuleCall_5_0() { return cSkillsSkillRealizationParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SkillRealizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillRealizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSkillDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSkillDefSkillDefinitionCrossReference_1_0 = (CrossReference)cSkillDefAssignment_1.eContents().get(0);
		private final RuleCall cSkillDefSkillDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cSkillDefSkillDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SkillRealization:
		//	'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN]
		//	'{'
		//	//FIXME: add implementation
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN] '{' //FIXME: add implementation
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'SkillRealization'
		public Keyword getSkillRealizationKeyword_0() { return cSkillRealizationKeyword_0; }
		
		//skillDef=[skillDefinition::SkillDefinition|FQN]
		public Assignment getSkillDefAssignment_1() { return cSkillDefAssignment_1; }
		
		//[skillDefinition::SkillDefinition|FQN]
		public CrossReference getSkillDefSkillDefinitionCrossReference_1_0() { return cSkillDefSkillDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getSkillDefSkillDefinitionFQNParserRuleCall_1_0_1() { return cSkillDefSkillDefinitionFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		////FIXME: add implementation
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	
	
	private final SkillRealizationModelElements pSkillRealizationModel;
	private final FQNElements pFQN;
	private final SkillRealizationSetElements pSkillRealizationSet;
	private final SkillRealizationElements pSkillRealization;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SkillRealizationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSkillRealizationModel = new SkillRealizationModelElements();
		this.pFQN = new FQNElements();
		this.pSkillRealizationSet = new SkillRealizationSetElements();
		this.pSkillRealization = new SkillRealizationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.behavior.skillRealization.SkillRealization".equals(grammar.getName())) {
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

	
	//SkillRealizationModel:
	//	{SkillRealizationModel}
	//	'SkillRealizationModel'
	//	'{'
	//	skillsets+=SkillRealizationSet*
	//	'}';
	public SkillRealizationModelElements getSkillRealizationModelAccess() {
		return pSkillRealizationModel;
	}
	
	public ParserRule getSkillRealizationModelRule() {
		return getSkillRealizationModelAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//SkillRealizationSet:
	//	'SkillSetRealization' name=ID 'skillSetDef' skillDefSet=[skillDefinition::SkillDefinitionSet|FQN]
	//	'{'
	//	skills+=SkillRealization*
	//	'}';
	public SkillRealizationSetElements getSkillRealizationSetAccess() {
		return pSkillRealizationSet;
	}
	
	public ParserRule getSkillRealizationSetRule() {
		return getSkillRealizationSetAccess().getRule();
	}
	
	//SkillRealization:
	//	'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN]
	//	'{'
	//	//FIXME: add implementation
	//	'}';
	public SkillRealizationElements getSkillRealizationAccess() {
		return pSkillRealization;
	}
	
	public ParserRule getSkillRealizationRule() {
		return getSkillRealizationAccess().getRule();
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
