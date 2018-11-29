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
package org.xtext.service.parameterDefinition.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
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
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

@Singleton
public class ParameterDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ParamDefModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.ParamDefModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParamDefModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsParamDefRepoImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cRepositoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRepositoryParameterSetRepositoryParserRuleCall_2_0 = (RuleCall)cRepositoryAssignment_2.eContents().get(0);
		
		//ParamDefModel param::ParamDefModel:
		//	{param::ParamDefModel} imports+=ParamDefRepoImport*
		//	repository=ParameterSetRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//{param::ParamDefModel} imports+=ParamDefRepoImport* repository=ParameterSetRepository?
		public Group getGroup() { return cGroup; }
		
		//{param::ParamDefModel}
		public Action getParamDefModelAction_0() { return cParamDefModelAction_0; }
		
		//imports+=ParamDefRepoImport*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }
		
		//ParamDefRepoImport
		public RuleCall getImportsParamDefRepoImportParserRuleCall_1_0() { return cImportsParamDefRepoImportParserRuleCall_1_0; }
		
		//repository=ParameterSetRepository?
		public Assignment getRepositoryAssignment_2() { return cRepositoryAssignment_2; }
		
		//ParameterSetRepository
		public RuleCall getRepositoryParameterSetRepositoryParserRuleCall_2_0() { return cRepositoryParameterSetRepositoryParserRuleCall_2_0; }
	}
	public class FQNWElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.FQNW");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//// parser rules for names
		//FQNW:
		//	FQN '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN '.*'?
		public Group getGroup() { return cGroup; }
		
		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class ParamDefRepoImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.ParamDefRepoImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNWParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParamDefRepoImport param::ParamDefRepoImport:
		//	'#import' importedNamespace=FQNW ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'#import' importedNamespace=FQNW ';'?
		public Group getGroup() { return cGroup; }
		
		//'#import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=FQNW
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//FQNW
		public RuleCall getImportedNamespaceFQNWParserRuleCall_1_0() { return cImportedNamespaceFQNWParserRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class ParameterSetRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterSetRepositoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSetsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSetsParameterSetDefinitionParserRuleCall_3_0 = (RuleCall)cSetsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParameterSetRepository param::ParameterSetRepository:
		//	'ParameterSetRepository' name=ID
		//	'{'
		//	sets+=ParameterSetDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ParameterSetRepository' name=ID '{' sets+=ParameterSetDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'ParameterSetRepository'
		public Keyword getParameterSetRepositoryKeyword_0() { return cParameterSetRepositoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//sets+=ParameterSetDefinition*
		public Assignment getSetsAssignment_3() { return cSetsAssignment_3; }
		
		//ParameterSetDefinition
		public RuleCall getSetsParameterSetDefinitionParserRuleCall_3_0() { return cSetsParameterSetDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ParameterSetDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsParameterSetDefinitionCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1 = (RuleCall)cExtendsParameterSetDefinitionCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsParameterSetDefinitionCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsParameterSetDefinitionCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersAbstractParameterParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ParameterSetDefinition param::ParameterSetDefinition:
		//	'ParameterSet' name=ID ('extends' extends+=[param::ParameterSetDefinition|FQN] (","
		//	extends+=[param::ParameterSetDefinition|FQN])*)?
		//	'{'
		//	parameters+=AbstractParameter*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ParameterSet' name=ID ('extends' extends+=[param::ParameterSetDefinition|FQN] (","
		//extends+=[param::ParameterSetDefinition|FQN])*)? '{' parameters+=AbstractParameter* '}'
		public Group getGroup() { return cGroup; }
		
		//'ParameterSet'
		public Keyword getParameterSetKeyword_0() { return cParameterSetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' extends+=[param::ParameterSetDefinition|FQN] ("," extends+=[param::ParameterSetDefinition|FQN])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//extends+=[param::ParameterSetDefinition|FQN]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }
		
		//[param::ParameterSetDefinition|FQN]
		public CrossReference getExtendsParameterSetDefinitionCrossReference_2_1_0() { return cExtendsParameterSetDefinitionCrossReference_2_1_0; }
		
		//FQN
		public RuleCall getExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1() { return cExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1; }
		
		//("," extends+=[param::ParameterSetDefinition|FQN])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//extends+=[param::ParameterSetDefinition|FQN]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }
		
		//[param::ParameterSetDefinition|FQN]
		public CrossReference getExtendsParameterSetDefinitionCrossReference_2_2_1_0() { return cExtendsParameterSetDefinitionCrossReference_2_2_1_0; }
		
		//FQN
		public RuleCall getExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1() { return cExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//parameters+=AbstractParameter*
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }
		
		//AbstractParameter
		public RuleCall getParametersAbstractParameterParserRuleCall_4_0() { return cParametersAbstractParameterParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AbstractParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.AbstractParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParameterDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTriggerDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractParameter param::AbstractParameter:
		//	ParameterDefinition | TriggerDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//ParameterDefinition | TriggerDefinition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParameterDefinition
		public RuleCall getParameterDefinitionParserRuleCall_0() { return cParameterDefinitionParserRuleCall_0; }
		
		//TriggerDefinition
		public RuleCall getTriggerDefinitionParserRuleCall_1() { return cTriggerDefinitionParserRuleCall_1; }
	}
	public class ParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.ParameterDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParameterDefinition param::ParameterDefinition:
		//	'Parameter' name=ID
		//	'{'
		//	attributes+=AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Parameter' name=ID '{' attributes+=AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'Parameter'
		public Keyword getParameterKeyword_0() { return cParameterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=AttributeDefinition*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_3_0() { return cAttributesAttributeDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TriggerDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.parameterDefinition.ParameterDefinition.TriggerDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTriggerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TriggerDefinition param::TriggerDefinition:
		//	'Trigger' name=ID
		//	'{'
		//	attributes+=AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Trigger' name=ID '{' attributes+=AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'Trigger'
		public Keyword getTriggerKeyword_0() { return cTriggerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=AttributeDefinition*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_3_0() { return cAttributesAttributeDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ParamDefModelElements pParamDefModel;
	private final FQNWElements pFQNW;
	private final ParamDefRepoImportElements pParamDefRepoImport;
	private final ParameterSetRepositoryElements pParameterSetRepository;
	private final ParameterSetDefinitionElements pParameterSetDefinition;
	private final AbstractParameterElements pAbstractParameter;
	private final ParameterDefinitionElements pParameterDefinition;
	private final TriggerDefinitionElements pTriggerDefinition;
	
	private final Grammar grammar;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ParameterDefinitionGrammarAccess(GrammarProvider grammarProvider,
			BasicAttributesGrammarAccess gaBasicAttributes,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaTerminals = gaTerminals;
		this.pParamDefModel = new ParamDefModelElements();
		this.pFQNW = new FQNWElements();
		this.pParamDefRepoImport = new ParamDefRepoImportElements();
		this.pParameterSetRepository = new ParameterSetRepositoryElements();
		this.pParameterSetDefinition = new ParameterSetDefinitionElements();
		this.pAbstractParameter = new AbstractParameterElements();
		this.pParameterDefinition = new ParameterDefinitionElements();
		this.pTriggerDefinition = new TriggerDefinitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.parameterDefinition.ParameterDefinition".equals(grammar.getName())) {
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

	
	//ParamDefModel param::ParamDefModel:
	//	{param::ParamDefModel} imports+=ParamDefRepoImport*
	//	repository=ParameterSetRepository?;
	public ParamDefModelElements getParamDefModelAccess() {
		return pParamDefModel;
	}
	
	public ParserRule getParamDefModelRule() {
		return getParamDefModelAccess().getRule();
	}
	
	//// parser rules for names
	//FQNW:
	//	FQN '.*'?;
	public FQNWElements getFQNWAccess() {
		return pFQNW;
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
	}
	
	//ParamDefRepoImport param::ParamDefRepoImport:
	//	'#import' importedNamespace=FQNW ';'?;
	public ParamDefRepoImportElements getParamDefRepoImportAccess() {
		return pParamDefRepoImport;
	}
	
	public ParserRule getParamDefRepoImportRule() {
		return getParamDefRepoImportAccess().getRule();
	}
	
	//ParameterSetRepository param::ParameterSetRepository:
	//	'ParameterSetRepository' name=ID
	//	'{'
	//	sets+=ParameterSetDefinition*
	//	'}';
	public ParameterSetRepositoryElements getParameterSetRepositoryAccess() {
		return pParameterSetRepository;
	}
	
	public ParserRule getParameterSetRepositoryRule() {
		return getParameterSetRepositoryAccess().getRule();
	}
	
	//ParameterSetDefinition param::ParameterSetDefinition:
	//	'ParameterSet' name=ID ('extends' extends+=[param::ParameterSetDefinition|FQN] (","
	//	extends+=[param::ParameterSetDefinition|FQN])*)?
	//	'{'
	//	parameters+=AbstractParameter*
	//	'}';
	public ParameterSetDefinitionElements getParameterSetDefinitionAccess() {
		return pParameterSetDefinition;
	}
	
	public ParserRule getParameterSetDefinitionRule() {
		return getParameterSetDefinitionAccess().getRule();
	}
	
	//AbstractParameter param::AbstractParameter:
	//	ParameterDefinition | TriggerDefinition;
	public AbstractParameterElements getAbstractParameterAccess() {
		return pAbstractParameter;
	}
	
	public ParserRule getAbstractParameterRule() {
		return getAbstractParameterAccess().getRule();
	}
	
	//ParameterDefinition param::ParameterDefinition:
	//	'Parameter' name=ID
	//	'{'
	//	attributes+=AttributeDefinition*
	//	'}';
	public ParameterDefinitionElements getParameterDefinitionAccess() {
		return pParameterDefinition;
	}
	
	public ParserRule getParameterDefinitionRule() {
		return getParameterDefinitionAccess().getRule();
	}
	
	//TriggerDefinition param::TriggerDefinition:
	//	'Trigger' name=ID
	//	'{'
	//	attributes+=AttributeDefinition*
	//	'}';
	public TriggerDefinitionElements getTriggerDefinitionAccess() {
		return pTriggerDefinition;
	}
	
	public ParserRule getTriggerDefinitionRule() {
		return getTriggerDefinitionAccess().getRule();
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
