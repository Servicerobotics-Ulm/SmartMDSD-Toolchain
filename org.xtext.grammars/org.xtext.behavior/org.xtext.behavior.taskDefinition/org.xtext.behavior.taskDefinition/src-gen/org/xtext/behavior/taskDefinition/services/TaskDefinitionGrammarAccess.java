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
package org.xtext.behavior.taskDefinition.services;

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
public class TaskDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TaskDefinitionModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskDefinition.TaskDefinition.TaskDefinitionModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTaskDefinitionModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRepositoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRepositoryTaskDefinitionRepositoryParserRuleCall_1_0 = (RuleCall)cRepositoryAssignment_1.eContents().get(0);
		
		//TaskDefinitionModel task::TaskDefinitionModel:
		//	{task::TaskDefinitionModel} repository=TaskDefinitionRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//{task::TaskDefinitionModel} repository=TaskDefinitionRepository?
		public Group getGroup() { return cGroup; }
		
		//{task::TaskDefinitionModel}
		public Action getTaskDefinitionModelAction_0() { return cTaskDefinitionModelAction_0; }
		
		//repository=TaskDefinitionRepository?
		public Assignment getRepositoryAssignment_1() { return cRepositoryAssignment_1; }
		
		//TaskDefinitionRepository
		public RuleCall getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0() { return cRepositoryTaskDefinitionRepositoryParserRuleCall_1_0; }
	}
	public class TaskDefinitionRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskDefinition.TaskDefinition.TaskDefinitionRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskDefinitionRepositoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTasksAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTasksTaskDefinitionParserRuleCall_3_0 = (RuleCall)cTasksAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TaskDefinitionRepository task::TaskDefinitionRepository:
		//	'TaskDefinitionRepository' name=ID
		//	'{'
		//	tasks+=TaskDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TaskDefinitionRepository' name=ID '{' tasks+=TaskDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'TaskDefinitionRepository'
		public Keyword getTaskDefinitionRepositoryKeyword_0() { return cTaskDefinitionRepositoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//tasks+=TaskDefinition*
		public Assignment getTasksAssignment_3() { return cTasksAssignment_3; }
		
		//TaskDefinition
		public RuleCall getTasksTaskDefinitionParserRuleCall_3_0() { return cTasksTaskDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TaskDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskDefinition.TaskDefinition.TaskDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cResultsTaskResultParserRuleCall_7_0 = (RuleCall)cResultsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//TaskDefinition task::TaskDefinition:
		//	'TaskDefinition' name=ID
		//	'{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{' outAttribute+=AttributeDefinition* '}')?
		//	'results' '{' results+=TaskResult+ '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TaskDefinition' name=ID '{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{'
		//outAttribute+=AttributeDefinition* '}')? 'results' '{' results+=TaskResult+ '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'TaskDefinition'
		public Keyword getTaskDefinitionKeyword_0() { return cTaskDefinitionKeyword_0; }
		
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
		
		//results+=TaskResult+
		public Assignment getResultsAssignment_7() { return cResultsAssignment_7; }
		
		//TaskResult
		public RuleCall getResultsTaskResultParserRuleCall_7_0() { return cResultsTaskResultParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class TaskResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskDefinition.TaskDefinition.TaskResult");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cResultAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cResultTASK_RESULT_TYPESEnumRuleCall_0_0 = (RuleCall)cResultAssignment_0.eContents().get(0);
		private final Keyword cValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResultValueEStringParserRuleCall_3_0 = (RuleCall)cResultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TaskResult task::TaskResult:
		//	result=TASK_RESULT_TYPES 'value' '=' resultValue=EString ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//result=TASK_RESULT_TYPES 'value' '=' resultValue=EString ';'?
		public Group getGroup() { return cGroup; }
		
		//result=TASK_RESULT_TYPES
		public Assignment getResultAssignment_0() { return cResultAssignment_0; }
		
		//TASK_RESULT_TYPES
		public RuleCall getResultTASK_RESULT_TYPESEnumRuleCall_0_0() { return cResultTASK_RESULT_TYPESEnumRuleCall_0_0; }
		
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
	
	public class TASK_RESULT_TYPESElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskDefinition.TaskDefinition.TASK_RESULT_TYPES");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSUCCESSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSUCCESSSUCCESSKeyword_0_0 = (Keyword)cSUCCESSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cERROREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cERRORERRORKeyword_1_0 = (Keyword)cERROREnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TASK_RESULT_TYPES returns task::TASK_RESULT_TYPES:
		//	SUCCESS | ERROR;
		public EnumRule getRule() { return rule; }
		
		//SUCCESS | ERROR
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SUCCESS
		public EnumLiteralDeclaration getSUCCESSEnumLiteralDeclaration_0() { return cSUCCESSEnumLiteralDeclaration_0; }
		
		//'SUCCESS'
		public Keyword getSUCCESSSUCCESSKeyword_0_0() { return cSUCCESSSUCCESSKeyword_0_0; }
		
		//ERROR
		public EnumLiteralDeclaration getERROREnumLiteralDeclaration_1() { return cERROREnumLiteralDeclaration_1; }
		
		//'ERROR'
		public Keyword getERRORERRORKeyword_1_0() { return cERRORERRORKeyword_1_0; }
	}
	
	private final TaskDefinitionModelElements pTaskDefinitionModel;
	private final TaskDefinitionRepositoryElements pTaskDefinitionRepository;
	private final TaskDefinitionElements pTaskDefinition;
	private final TaskResultElements pTaskResult;
	private final TASK_RESULT_TYPESElements eTASK_RESULT_TYPES;
	
	private final Grammar grammar;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TaskDefinitionGrammarAccess(GrammarProvider grammarProvider,
			BasicAttributesGrammarAccess gaBasicAttributes,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaTerminals = gaTerminals;
		this.pTaskDefinitionModel = new TaskDefinitionModelElements();
		this.pTaskDefinitionRepository = new TaskDefinitionRepositoryElements();
		this.pTaskDefinition = new TaskDefinitionElements();
		this.pTaskResult = new TaskResultElements();
		this.eTASK_RESULT_TYPES = new TASK_RESULT_TYPESElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.behavior.taskDefinition.TaskDefinition".equals(grammar.getName())) {
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

	
	//TaskDefinitionModel task::TaskDefinitionModel:
	//	{task::TaskDefinitionModel} repository=TaskDefinitionRepository?;
	public TaskDefinitionModelElements getTaskDefinitionModelAccess() {
		return pTaskDefinitionModel;
	}
	
	public ParserRule getTaskDefinitionModelRule() {
		return getTaskDefinitionModelAccess().getRule();
	}
	
	//TaskDefinitionRepository task::TaskDefinitionRepository:
	//	'TaskDefinitionRepository' name=ID
	//	'{'
	//	tasks+=TaskDefinition*
	//	'}';
	public TaskDefinitionRepositoryElements getTaskDefinitionRepositoryAccess() {
		return pTaskDefinitionRepository;
	}
	
	public ParserRule getTaskDefinitionRepositoryRule() {
		return getTaskDefinitionRepositoryAccess().getRule();
	}
	
	//TaskDefinition task::TaskDefinition:
	//	'TaskDefinition' name=ID
	//	'{' ('in' '{' inAttribute+=AttributeDefinition* '}')? ('out' '{' outAttribute+=AttributeDefinition* '}')?
	//	'results' '{' results+=TaskResult+ '}'
	//	'}';
	public TaskDefinitionElements getTaskDefinitionAccess() {
		return pTaskDefinition;
	}
	
	public ParserRule getTaskDefinitionRule() {
		return getTaskDefinitionAccess().getRule();
	}
	
	//TaskResult task::TaskResult:
	//	result=TASK_RESULT_TYPES 'value' '=' resultValue=EString ';'?;
	public TaskResultElements getTaskResultAccess() {
		return pTaskResult;
	}
	
	public ParserRule getTaskResultRule() {
		return getTaskResultAccess().getRule();
	}
	
	//enum TASK_RESULT_TYPES returns task::TASK_RESULT_TYPES:
	//	SUCCESS | ERROR;
	public TASK_RESULT_TYPESElements getTASK_RESULT_TYPESAccess() {
		return eTASK_RESULT_TYPES;
	}
	
	public EnumRule getTASK_RESULT_TYPESRule() {
		return getTASK_RESULT_TYPESAccess().getRule();
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
