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
package org.xtext.service.skillDefinition.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

@Singleton
public class SkillDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SkillDefinitionModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SkillDefinitionModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSkillDefinitionModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRepositoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRepositorySkillDefinitionRepositoryParserRuleCall_1_0 = (RuleCall)cRepositoryAssignment_1.eContents().get(0);
		
		//SkillDefinitionModel skill::SkillDefinitionModel:
		//	{skill::SkillDefinitionModel} repository=SkillDefinitionRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//{skill::SkillDefinitionModel} repository=SkillDefinitionRepository?
		public Group getGroup() { return cGroup; }
		
		//{skill::SkillDefinitionModel}
		public Action getSkillDefinitionModelAction_0() { return cSkillDefinitionModelAction_0; }
		
		//repository=SkillDefinitionRepository?
		public Assignment getRepositoryAssignment_1() { return cRepositoryAssignment_1; }
		
		//SkillDefinitionRepository
		public RuleCall getRepositorySkillDefinitionRepositoryParserRuleCall_1_0() { return cRepositorySkillDefinitionRepositoryParserRuleCall_1_0; }
	}
	public class SkillDefinitionRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SkillDefinitionRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillDefinitionRepositoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSetsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSetsSkillDefinitionSetParserRuleCall_3_0 = (RuleCall)cSetsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SkillDefinitionRepository skill::SkillDefinitionRepository:
		//	'SkillDefinitionRepository' name=ID
		//	'{'
		//	sets+=SkillDefinitionSet*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillDefinitionRepository' name=ID '{' sets+=SkillDefinitionSet* '}'
		public Group getGroup() { return cGroup; }
		
		//'SkillDefinitionRepository'
		public Keyword getSkillDefinitionRepositoryKeyword_0() { return cSkillDefinitionRepositoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//sets+=SkillDefinitionSet*
		public Assignment getSetsAssignment_3() { return cSetsAssignment_3; }
		
		//SkillDefinitionSet
		public RuleCall getSetsSkillDefinitionSetParserRuleCall_3_0() { return cSetsSkillDefinitionSetParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class SkillDefinitionSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SkillDefinitionSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillDefinitionSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSkillsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSkillsSkillDefinitionParserRuleCall_3_0 = (RuleCall)cSkillsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SkillDefinitionSet skill::SkillDefinitionSet:
		//	'SkillDefinitionSet' name=ID
		//	'{'
		//	skills+=SkillDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillDefinitionSet' name=ID '{' skills+=SkillDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'SkillDefinitionSet'
		public Keyword getSkillDefinitionSetKeyword_0() { return cSkillDefinitionSetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//skills+=SkillDefinition*
		public Assignment getSkillsAssignment_3() { return cSkillsAssignment_3; }
		
		//SkillDefinition
		public RuleCall getSkillsSkillDefinitionParserRuleCall_3_0() { return cSkillsSkillDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class SkillDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SkillDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cInAttributeAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cInAttributeAttributeDefinitionParserRuleCall_3_2_0 = (RuleCall)cInAttributeAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOutKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cOutAttributeAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cOutAttributeAttributeDefinitionParserRuleCall_4_2_0 = (RuleCall)cOutAttributeAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Keyword cResultsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cResultsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cResultsSkillResultParserRuleCall_7_0 = (RuleCall)cResultsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//SkillDefinition skill::SkillDefinition: //'SkillDefinition' name=EString
		//	'SkillDefinition' name=ID '{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{'
		//	outAttribute+=AttributeDefinition* '}')? 'results' '{' results+=SkillResult+ '}' '}';
		@Override public ParserRule getRule() { return rule; }
		
		////'SkillDefinition' name=EString
		//'SkillDefinition' name=ID '{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{'
		//outAttribute+=AttributeDefinition* '}')? 'results' '{' results+=SkillResult+ '}' '}'
		public Group getGroup() { return cGroup; }
		
		////'SkillDefinition' name=EString
		//'SkillDefinition'
		public Keyword getSkillDefinitionKeyword_0() { return cSkillDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('in' '{' inAttribute+=AttributeDefinition* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'in'
		public Keyword getInKeyword_3_0() { return cInKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//inAttribute+=AttributeDefinition*
		public Assignment getInAttributeAssignment_3_2() { return cInAttributeAssignment_3_2; }
		
		//AttributeDefinition
		public RuleCall getInAttributeAttributeDefinitionParserRuleCall_3_2_0() { return cInAttributeAttributeDefinitionParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
		
		//('out' '{' outAttribute+=AttributeDefinition* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'out'
		public Keyword getOutKeyword_4_0() { return cOutKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//outAttribute+=AttributeDefinition*
		public Assignment getOutAttributeAssignment_4_2() { return cOutAttributeAssignment_4_2; }
		
		//AttributeDefinition
		public RuleCall getOutAttributeAttributeDefinitionParserRuleCall_4_2_0() { return cOutAttributeAttributeDefinitionParserRuleCall_4_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }
		
		//'results'
		public Keyword getResultsKeyword_5() { return cResultsKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//results+=SkillResult+
		public Assignment getResultsAssignment_7() { return cResultsAssignment_7; }
		
		//SkillResult
		public RuleCall getResultsSkillResultParserRuleCall_7_0() { return cResultsSkillResultParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class SkillResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SkillResult");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cResultAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cResultSKILL_RESULT_TYPESEnumRuleCall_0_0 = (RuleCall)cResultAssignment_0.eContents().get(0);
		private final Keyword cValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResultValueEStringParserRuleCall_3_0 = (RuleCall)cResultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SkillResult skill::SkillResult:
		//	result=SKILL_RESULT_TYPES 'value' '=' resultValue=EString ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//result=SKILL_RESULT_TYPES 'value' '=' resultValue=EString ';'?
		public Group getGroup() { return cGroup; }
		
		//result=SKILL_RESULT_TYPES
		public Assignment getResultAssignment_0() { return cResultAssignment_0; }
		
		//SKILL_RESULT_TYPES
		public RuleCall getResultSKILL_RESULT_TYPESEnumRuleCall_0_0() { return cResultSKILL_RESULT_TYPESEnumRuleCall_0_0; }
		
		//'value'
		public Keyword getValueKeyword_1() { return cValueKeyword_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//resultValue=EString
		public Assignment getResultValueAssignment_3() { return cResultValueAssignment_3; }
		
		//EString
		public RuleCall getResultValueEStringParserRuleCall_3_0() { return cResultValueEStringParserRuleCall_3_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	
	public class SKILL_RESULT_TYPESElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.skillDefinition.SkillDefinition.SKILL_RESULT_TYPES");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cERROREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cERRORERRORKeyword_0_0 = (Keyword)cERROREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSUCCESSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSUCCESSSUCCESSKeyword_1_0 = (Keyword)cSUCCESSEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum SKILL_RESULT_TYPES returns skill::SKILL_RESULT_TYPES:
		//	ERROR | SUCCESS;
		public EnumRule getRule() { return rule; }
		
		//ERROR | SUCCESS
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ERROR
		public EnumLiteralDeclaration getERROREnumLiteralDeclaration_0() { return cERROREnumLiteralDeclaration_0; }
		
		//"ERROR"
		public Keyword getERRORERRORKeyword_0_0() { return cERRORERRORKeyword_0_0; }
		
		//SUCCESS
		public EnumLiteralDeclaration getSUCCESSEnumLiteralDeclaration_1() { return cSUCCESSEnumLiteralDeclaration_1; }
		
		//"SUCCESS"
		public Keyword getSUCCESSSUCCESSKeyword_1_0() { return cSUCCESSSUCCESSKeyword_1_0; }
	}
	
	private final SkillDefinitionModelElements pSkillDefinitionModel;
	private final SkillDefinitionRepositoryElements pSkillDefinitionRepository;
	private final SkillDefinitionSetElements pSkillDefinitionSet;
	private final SkillDefinitionElements pSkillDefinition;
	private final SkillResultElements pSkillResult;
	private final SKILL_RESULT_TYPESElements eSKILL_RESULT_TYPES;
	
	private final Grammar grammar;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SkillDefinitionGrammarAccess(GrammarProvider grammarProvider,
			BasicAttributesGrammarAccess gaBasicAttributes,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaTerminals = gaTerminals;
		this.pSkillDefinitionModel = new SkillDefinitionModelElements();
		this.pSkillDefinitionRepository = new SkillDefinitionRepositoryElements();
		this.pSkillDefinitionSet = new SkillDefinitionSetElements();
		this.pSkillDefinition = new SkillDefinitionElements();
		this.pSkillResult = new SkillResultElements();
		this.eSKILL_RESULT_TYPES = new SKILL_RESULT_TYPESElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.skillDefinition.SkillDefinition".equals(grammar.getName())) {
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
	
	
	public BasicAttributesGrammarAccess getBasicAttributesGrammarAccess() {
		return gaBasicAttributes;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SkillDefinitionModel skill::SkillDefinitionModel:
	//	{skill::SkillDefinitionModel} repository=SkillDefinitionRepository?;
	public SkillDefinitionModelElements getSkillDefinitionModelAccess() {
		return pSkillDefinitionModel;
	}
	
	public ParserRule getSkillDefinitionModelRule() {
		return getSkillDefinitionModelAccess().getRule();
	}
	
	//SkillDefinitionRepository skill::SkillDefinitionRepository:
	//	'SkillDefinitionRepository' name=ID
	//	'{'
	//	sets+=SkillDefinitionSet*
	//	'}';
	public SkillDefinitionRepositoryElements getSkillDefinitionRepositoryAccess() {
		return pSkillDefinitionRepository;
	}
	
	public ParserRule getSkillDefinitionRepositoryRule() {
		return getSkillDefinitionRepositoryAccess().getRule();
	}
	
	//SkillDefinitionSet skill::SkillDefinitionSet:
	//	'SkillDefinitionSet' name=ID
	//	'{'
	//	skills+=SkillDefinition*
	//	'}';
	public SkillDefinitionSetElements getSkillDefinitionSetAccess() {
		return pSkillDefinitionSet;
	}
	
	public ParserRule getSkillDefinitionSetRule() {
		return getSkillDefinitionSetAccess().getRule();
	}
	
	//SkillDefinition skill::SkillDefinition: //'SkillDefinition' name=EString
	//	'SkillDefinition' name=ID '{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{'
	//	outAttribute+=AttributeDefinition* '}')? 'results' '{' results+=SkillResult+ '}' '}';
	public SkillDefinitionElements getSkillDefinitionAccess() {
		return pSkillDefinition;
	}
	
	public ParserRule getSkillDefinitionRule() {
		return getSkillDefinitionAccess().getRule();
	}
	
	//SkillResult skill::SkillResult:
	//	result=SKILL_RESULT_TYPES 'value' '=' resultValue=EString ';'?;
	public SkillResultElements getSkillResultAccess() {
		return pSkillResult;
	}
	
	public ParserRule getSkillResultRule() {
		return getSkillResultAccess().getRule();
	}
	
	//enum SKILL_RESULT_TYPES returns skill::SKILL_RESULT_TYPES:
	//	ERROR | SUCCESS;
	public SKILL_RESULT_TYPESElements getSKILL_RESULT_TYPESAccess() {
		return eSKILL_RESULT_TYPES;
	}
	
	public EnumRule getSKILL_RESULT_TYPESRule() {
		return getSKILL_RESULT_TYPESAccess().getRule();
	}
	
	//AttributeDefinition attr::AttributeDefinition:
	//	name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
	public BasicAttributesGrammarAccess.AttributeDefinitionElements getAttributeDefinitionAccess() {
		return gaBasicAttributes.getAttributeDefinitionAccess();
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}
	
	//AttributeRefinement attr::AttributeRefinement:
	//	attribute=[attr::AttributeDefinition|FQN] '=' value=AbstractValue ';'?;
	public BasicAttributesGrammarAccess.AttributeRefinementElements getAttributeRefinementAccess() {
		return gaBasicAttributes.getAttributeRefinementAccess();
	}
	
	public ParserRule getAttributeRefinementRule() {
		return getAttributeRefinementAccess().getRule();
	}
	
	//// parser rules for names
	//FQN:
	//	ID ('.' ID)*;
	public BasicAttributesGrammarAccess.FQNElements getFQNAccess() {
		return gaBasicAttributes.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public BasicAttributesGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaBasicAttributes.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public BasicAttributesGrammarAccess.EStringElements getEStringAccess() {
		return gaBasicAttributes.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public BasicAttributesGrammarAccess.EIntElements getEIntAccess() {
		return gaBasicAttributes.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public BasicAttributesGrammarAccess.EDoubleElements getEDoubleAccess() {
		return gaBasicAttributes.getEDoubleAccess();
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EnumerationElement attr::EnumerationElement:
	//	name=ID ('=' value=EInt)? ';'?;
	public BasicAttributesGrammarAccess.EnumerationElementElements getEnumerationElementAccess() {
		return gaBasicAttributes.getEnumerationElementAccess();
	}
	
	public ParserRule getEnumerationElementRule() {
		return getEnumerationElementAccess().getRule();
	}
	
	//AbstractAttributeType attr::AbstractAttributeType:
	//	PrimitiveType | InlineEnumerationType;
	public BasicAttributesGrammarAccess.AbstractAttributeTypeElements getAbstractAttributeTypeAccess() {
		return gaBasicAttributes.getAbstractAttributeTypeAccess();
	}
	
	public ParserRule getAbstractAttributeTypeRule() {
		return getAbstractAttributeTypeAccess().getRule();
	}
	
	//InlineEnumerationType attr::InlineEnumerationType:
	//	'InlineEnumeration' array=ArrayType? '{' enums+=EnumerationElement+ '}';
	public BasicAttributesGrammarAccess.InlineEnumerationTypeElements getInlineEnumerationTypeAccess() {
		return gaBasicAttributes.getInlineEnumerationTypeAccess();
	}
	
	public ParserRule getInlineEnumerationTypeRule() {
		return getInlineEnumerationTypeAccess().getRule();
	}
	
	//ArrayType attr::ArrayType:
	//	{attr::ArrayType}
	//	'[' length=Cardinality? ']';
	public BasicAttributesGrammarAccess.ArrayTypeElements getArrayTypeAccess() {
		return gaBasicAttributes.getArrayTypeAccess();
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}
	
	//Cardinality:
	//	INT | '*';
	public BasicAttributesGrammarAccess.CardinalityElements getCardinalityAccess() {
		return gaBasicAttributes.getCardinalityAccess();
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//enum PRIMITIVE_TYPE_NAME returns attr::PRIMITIVE_TYPE_NAME:
	//	Int8 | Int16 | Int32 | Int64 |
	//	UInt8 | UInt16 | UInt32 | UInt64 |
	//	Float | Double | String | Boolean;
	public BasicAttributesGrammarAccess.PRIMITIVE_TYPE_NAMEElements getPRIMITIVE_TYPE_NAMEAccess() {
		return gaBasicAttributes.getPRIMITIVE_TYPE_NAMEAccess();
	}
	
	public EnumRule getPRIMITIVE_TYPE_NAMERule() {
		return getPRIMITIVE_TYPE_NAMEAccess().getRule();
	}
	
	//PrimitiveType attr::PrimitiveType:
	//	typeName=PRIMITIVE_TYPE_NAME array=ArrayType?;
	public BasicAttributesGrammarAccess.PrimitiveTypeElements getPrimitiveTypeAccess() {
		return gaBasicAttributes.getPrimitiveTypeAccess();
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//AbstractValue attr::AbstractValue:
	//	SingleValue | ArrayValue;
	public BasicAttributesGrammarAccess.AbstractValueElements getAbstractValueAccess() {
		return gaBasicAttributes.getAbstractValueAccess();
	}
	
	public ParserRule getAbstractValueRule() {
		return getAbstractValueAccess().getRule();
	}
	
	//ArrayValue attr::ArrayValue:
	//	'[' values+=SingleValue (',' values+=SingleValue)* ']';
	public BasicAttributesGrammarAccess.ArrayValueElements getArrayValueAccess() {
		return gaBasicAttributes.getArrayValueAccess();
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}
	
	//SingleValue attr::SingleValue:
	//	{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
	//	{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN];
	public BasicAttributesGrammarAccess.SingleValueElements getSingleValueAccess() {
		return gaBasicAttributes.getSingleValueAccess();
	}
	
	public ParserRule getSingleValueRule() {
		return getSingleValueAccess().getRule();
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
