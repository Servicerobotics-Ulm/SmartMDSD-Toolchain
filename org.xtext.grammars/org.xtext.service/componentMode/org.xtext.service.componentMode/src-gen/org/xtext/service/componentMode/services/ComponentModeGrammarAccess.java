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
package org.xtext.service.componentMode.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
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
public class ComponentModeGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentModeModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.componentMode.ComponentMode.ComponentModeModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentModeModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRepositoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRepositoryComponentModeRepositoryParserRuleCall_1_0 = (RuleCall)cRepositoryAssignment_1.eContents().get(0);
		
		//ComponentModeModel:
		//	{ComponentModeModel} repository=ComponentModeRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ComponentModeModel} repository=ComponentModeRepository?
		public Group getGroup() { return cGroup; }
		
		//{ComponentModeModel}
		public Action getComponentModeModelAction_0() { return cComponentModeModelAction_0; }
		
		//repository=ComponentModeRepository?
		public Assignment getRepositoryAssignment_1() { return cRepositoryAssignment_1; }
		
		//ComponentModeRepository
		public RuleCall getRepositoryComponentModeRepositoryParserRuleCall_1_0() { return cRepositoryComponentModeRepositoryParserRuleCall_1_0; }
	}
	public class ComponentModeRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.componentMode.ComponentMode.ComponentModeRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentModeRepositoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComponentModeRepositoryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCollectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCollectionsComponentModeCollectionParserRuleCall_4_0 = (RuleCall)cCollectionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentModeRepository:
		//	{ComponentModeRepository}
		//	'ComponentModeRepository' name=ID
		//	'{'
		//	collections+=ComponentModeCollection*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ComponentModeRepository} 'ComponentModeRepository' name=ID '{' collections+=ComponentModeCollection* '}'
		public Group getGroup() { return cGroup; }
		
		//{ComponentModeRepository}
		public Action getComponentModeRepositoryAction_0() { return cComponentModeRepositoryAction_0; }
		
		//'ComponentModeRepository'
		public Keyword getComponentModeRepositoryKeyword_1() { return cComponentModeRepositoryKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//collections+=ComponentModeCollection*
		public Assignment getCollectionsAssignment_4() { return cCollectionsAssignment_4; }
		
		//ComponentModeCollection
		public RuleCall getCollectionsComponentModeCollectionParserRuleCall_4_0() { return cCollectionsComponentModeCollectionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ComponentModeCollectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.componentMode.ComponentMode.ComponentModeCollection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentModeCollectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComponentModeCollectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cModesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cModesComponentModeDefinitionParserRuleCall_4_0 = (RuleCall)cModesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentModeCollection:
		//	{ComponentModeCollection}
		//	'ComponentModeCollection' name=ID
		//	'{'
		//	modes+=ComponentModeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ComponentModeCollection} 'ComponentModeCollection' name=ID '{' modes+=ComponentModeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//{ComponentModeCollection}
		public Action getComponentModeCollectionAction_0() { return cComponentModeCollectionAction_0; }
		
		//'ComponentModeCollection'
		public Keyword getComponentModeCollectionKeyword_1() { return cComponentModeCollectionKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//modes+=ComponentModeDefinition*
		public Assignment getModesAssignment_4() { return cModesAssignment_4; }
		
		//ComponentModeDefinition
		public RuleCall getModesComponentModeDefinitionParserRuleCall_4_0() { return cModesComponentModeDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ComponentModeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.componentMode.ComponentMode.ComponentModeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentModeDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComponentModeDefinitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ComponentModeDefinition:
		//	{ComponentModeDefinition}
		//	'ComponentModeDefinition' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ComponentModeDefinition} 'ComponentModeDefinition' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//{ComponentModeDefinition}
		public Action getComponentModeDefinitionAction_0() { return cComponentModeDefinitionAction_0; }
		
		//'ComponentModeDefinition'
		public Keyword getComponentModeDefinitionKeyword_1() { return cComponentModeDefinitionKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final ComponentModeModelElements pComponentModeModel;
	private final ComponentModeRepositoryElements pComponentModeRepository;
	private final ComponentModeCollectionElements pComponentModeCollection;
	private final ComponentModeDefinitionElements pComponentModeDefinition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentModeGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pComponentModeModel = new ComponentModeModelElements();
		this.pComponentModeRepository = new ComponentModeRepositoryElements();
		this.pComponentModeCollection = new ComponentModeCollectionElements();
		this.pComponentModeDefinition = new ComponentModeDefinitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.componentMode.ComponentMode".equals(grammar.getName())) {
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

	
	//ComponentModeModel:
	//	{ComponentModeModel} repository=ComponentModeRepository?;
	public ComponentModeModelElements getComponentModeModelAccess() {
		return pComponentModeModel;
	}
	
	public ParserRule getComponentModeModelRule() {
		return getComponentModeModelAccess().getRule();
	}
	
	//ComponentModeRepository:
	//	{ComponentModeRepository}
	//	'ComponentModeRepository' name=ID
	//	'{'
	//	collections+=ComponentModeCollection*
	//	'}';
	public ComponentModeRepositoryElements getComponentModeRepositoryAccess() {
		return pComponentModeRepository;
	}
	
	public ParserRule getComponentModeRepositoryRule() {
		return getComponentModeRepositoryAccess().getRule();
	}
	
	//ComponentModeCollection:
	//	{ComponentModeCollection}
	//	'ComponentModeCollection' name=ID
	//	'{'
	//	modes+=ComponentModeDefinition*
	//	'}';
	public ComponentModeCollectionElements getComponentModeCollectionAccess() {
		return pComponentModeCollection;
	}
	
	public ParserRule getComponentModeCollectionRule() {
		return getComponentModeCollectionAccess().getRule();
	}
	
	//ComponentModeDefinition:
	//	{ComponentModeDefinition}
	//	'ComponentModeDefinition' name=ID ';'?;
	public ComponentModeDefinitionElements getComponentModeDefinitionAccess() {
		return pComponentModeDefinition;
	}
	
	public ParserRule getComponentModeDefinitionRule() {
		return getComponentModeDefinitionAccess().getRule();
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
