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
import org.eclipse.xtext.Alternatives;
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
		private final Assignment cModulesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModulesCoordinationModuleRealizationParserRuleCall_3_0 = (RuleCall)cModulesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SkillRealizationModel:
		//	{SkillRealizationModel}
		//	'SkillRealizationModel'
		//	'{'
		//	modules+=CoordinationModuleRealization*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SkillRealizationModel} 'SkillRealizationModel' '{' modules+=CoordinationModuleRealization* '}'
		public Group getGroup() { return cGroup; }
		
		//{SkillRealizationModel}
		public Action getSkillRealizationModelAction_0() { return cSkillRealizationModelAction_0; }
		
		//'SkillRealizationModel'
		public Keyword getSkillRealizationModelKeyword_1() { return cSkillRealizationModelKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//modules+=CoordinationModuleRealization*
		public Assignment getModulesAssignment_3() { return cModulesAssignment_3; }
		
		//CoordinationModuleRealization
		public RuleCall getModulesCoordinationModuleRealizationParserRuleCall_3_0() { return cModulesCoordinationModuleRealizationParserRuleCall_3_0; }
		
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
	public class CoordinationModuleRealizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.CoordinationModuleRealization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinationModuleRealizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCoordModuleDefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCoordinationModuleDefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0 = (CrossReference)cCoordinationModuleDefAssignment_3.eContents().get(0);
		private final RuleCall cCoordinationModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cUsesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCoordInterfaceInstsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0 = (RuleCall)cCoordInterfaceInstsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cSkillsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cSkillsSkillRealizationParserRuleCall_9_0 = (RuleCall)cSkillsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//CoordinationModuleRealization:
		//	'CoordinationModuleRealization' name=ID 'coordModuleDef'
		//	coordinationModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN]
		//	'uses' '{' coordInterfaceInsts+=CoordinationInterfaceInstance* '}'
		//	'{'
		//	skills+=SkillRealization*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinationModuleRealization' name=ID 'coordModuleDef'
		//coordinationModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN] 'uses' '{'
		//coordInterfaceInsts+=CoordinationInterfaceInstance* '}' '{' skills+=SkillRealization* '}'
		public Group getGroup() { return cGroup; }
		
		//'CoordinationModuleRealization'
		public Keyword getCoordinationModuleRealizationKeyword_0() { return cCoordinationModuleRealizationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'coordModuleDef'
		public Keyword getCoordModuleDefKeyword_2() { return cCoordModuleDefKeyword_2; }
		
		//coordinationModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN]
		public Assignment getCoordinationModuleDefAssignment_3() { return cCoordinationModuleDefAssignment_3; }
		
		//[skillDefinition::CoordinationModuleDefinition|FQN]
		public CrossReference getCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0() { return cCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getCoordinationModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1() { return cCoordinationModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1; }
		
		//'uses'
		public Keyword getUsesKeyword_4() { return cUsesKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//coordInterfaceInsts+=CoordinationInterfaceInstance*
		public Assignment getCoordInterfaceInstsAssignment_6() { return cCoordInterfaceInstsAssignment_6; }
		
		//CoordinationInterfaceInstance
		public RuleCall getCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0() { return cCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }
		
		//skills+=SkillRealization*
		public Assignment getSkillsAssignment_9() { return cSkillsAssignment_9; }
		
		//SkillRealization
		public RuleCall getSkillsSkillRealizationParserRuleCall_9_0() { return cSkillsSkillRealizationParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class CoordinationInterfaceInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.CoordinationInterfaceInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCoordinationInterfaceDefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0 = (CrossReference)cCoordinationInterfaceDefAssignment_0.eContents().get(0);
		private final RuleCall cCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1 = (RuleCall)cCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0.eContents().get(1);
		private final Keyword cIntsNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//CoordinationInterfaceInstance:
		//	coordinationInterfaceDef=[serviceDefinition::CoordinationServiceDefinition|FQN] 'intsName' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//coordinationInterfaceDef=[serviceDefinition::CoordinationServiceDefinition|FQN] 'intsName' name=ID
		public Group getGroup() { return cGroup; }
		
		//coordinationInterfaceDef=[serviceDefinition::CoordinationServiceDefinition|FQN]
		public Assignment getCoordinationInterfaceDefAssignment_0() { return cCoordinationInterfaceDefAssignment_0; }
		
		//[serviceDefinition::CoordinationServiceDefinition|FQN]
		public CrossReference getCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0() { return cCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0; }
		
		//FQN
		public RuleCall getCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1() { return cCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1; }
		
		//'intsName'
		public Keyword getIntsNameKeyword_1() { return cIntsNameKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class SkillRealizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillRealizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSkillDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSkillDefSkillDefinitionCrossReference_1_0 = (CrossReference)cSkillDefAssignment_1.eContents().get(0);
		private final RuleCall cSkillDefSkillDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cSkillDefSkillDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cActionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cActionCoordinationActionBlockParserRuleCall_5_0 = (RuleCall)cActionAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SkillRealization:
		//	'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN]
		//	'{'
		//	//FIXME: add implementation
		//	'action' '(' action=CoordinationActionBlock ')'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN] '{' //FIXME: add implementation
		//'action' '(' action=CoordinationActionBlock ')' '}'
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
		//'action'
		public Keyword getActionKeyword_3() { return cActionKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//action=CoordinationActionBlock
		public Assignment getActionAssignment_5() { return cActionAssignment_5; }
		
		//CoordinationActionBlock
		public RuleCall getActionCoordinationActionBlockParserRuleCall_5_0() { return cActionCoordinationActionBlockParserRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class CoordinationActionBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.CoordinationActionBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCoordinationActionBlockAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cActionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionsAbstractCoordinationActionParserRuleCall_1_0 = (RuleCall)cActionsAssignment_1.eContents().get(0);
		
		//CoordinationActionBlock:
		//	{CoordinationActionBlock} actions+=AbstractCoordinationAction*;
		@Override public ParserRule getRule() { return rule; }
		
		//{CoordinationActionBlock} actions+=AbstractCoordinationAction*
		public Group getGroup() { return cGroup; }
		
		//{CoordinationActionBlock}
		public Action getCoordinationActionBlockAction_0() { return cCoordinationActionBlockAction_0; }
		
		//actions+=AbstractCoordinationAction*
		public Assignment getActionsAssignment_1() { return cActionsAssignment_1; }
		
		//AbstractCoordinationAction
		public RuleCall getActionsAbstractCoordinationActionParserRuleCall_1_0() { return cActionsAbstractCoordinationActionParserRuleCall_1_0; }
	}
	public class AbstractCoordinationActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.AbstractCoordinationAction");
		private final RuleCall cAbstractComponentCoordinationActionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AbstractCoordinationAction:
		//	AbstractComponentCoordinationAction;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractComponentCoordinationAction
		public RuleCall getAbstractComponentCoordinationActionParserRuleCall() { return cAbstractComponentCoordinationActionParserRuleCall; }
	}
	public class AbstractComponentCoordinationActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.AbstractComponentCoordinationAction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentCoordinationActionParameterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComponentCoordinationActionActivationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComponentCoordinationActionEventParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractComponentCoordinationAction:
		//	ComponentCoordinationActionParameter | ComponentCoordinationActionActivation | ComponentCoordinationActionEvent;
		@Override public ParserRule getRule() { return rule; }
		
		//ComponentCoordinationActionParameter | ComponentCoordinationActionActivation | ComponentCoordinationActionEvent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComponentCoordinationActionParameter
		public RuleCall getComponentCoordinationActionParameterParserRuleCall_0() { return cComponentCoordinationActionParameterParserRuleCall_0; }
		
		//ComponentCoordinationActionActivation
		public RuleCall getComponentCoordinationActionActivationParserRuleCall_1() { return cComponentCoordinationActionActivationParserRuleCall_1; }
		
		//ComponentCoordinationActionEvent
		public RuleCall getComponentCoordinationActionEventParserRuleCall_2() { return cComponentCoordinationActionEventParserRuleCall_2; }
	}
	public class ComponentCoordinationActionParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.ComponentCoordinationActionParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTclParamKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCoordinationServiceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0 = (CrossReference)cCoordinationServiceAssignment_2.eContents().get(0);
		private final RuleCall cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cParamKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParameterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cParameterAbstractParameterCrossReference_4_0 = (CrossReference)cParameterAssignment_4.eContents().get(0);
		private final RuleCall cParameterAbstractParameterFQNParserRuleCall_4_0_1 = (RuleCall)cParameterAbstractParameterCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cParamvalueKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cValueAssignment_5_1.eContents().get(0);
		
		//ComponentCoordinationActionParameter: //(hasValue?=':paramvalue' values+=ExpressionSimple )?
		//	'tcl-param' ':server' coordinationService=[CoordinationInterfaceInstance] ':param'
		//	parameter=[parameterDefinition::AbstractParameter|FQN] (':paramvalue' value=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		////(hasValue?=':paramvalue' values+=ExpressionSimple )?
		//'tcl-param' ':server' coordinationService=[CoordinationInterfaceInstance] ':param'
		//parameter=[parameterDefinition::AbstractParameter|FQN] (':paramvalue' value=STRING)?
		public Group getGroup() { return cGroup; }
		
		////(hasValue?=':paramvalue' values+=ExpressionSimple )?
		//'tcl-param'
		public Keyword getTclParamKeyword_0() { return cTclParamKeyword_0; }
		
		//':server'
		public Keyword getServerKeyword_1() { return cServerKeyword_1; }
		
		//coordinationService=[CoordinationInterfaceInstance]
		public Assignment getCoordinationServiceAssignment_2() { return cCoordinationServiceAssignment_2; }
		
		//[CoordinationInterfaceInstance]
		public CrossReference getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0() { return cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0; }
		
		//ID
		public RuleCall getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1() { return cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1; }
		
		//':param'
		public Keyword getParamKeyword_3() { return cParamKeyword_3; }
		
		//parameter=[parameterDefinition::AbstractParameter|FQN]
		public Assignment getParameterAssignment_4() { return cParameterAssignment_4; }
		
		//[parameterDefinition::AbstractParameter|FQN]
		public CrossReference getParameterAbstractParameterCrossReference_4_0() { return cParameterAbstractParameterCrossReference_4_0; }
		
		//FQN
		public RuleCall getParameterAbstractParameterFQNParserRuleCall_4_0_1() { return cParameterAbstractParameterFQNParserRuleCall_4_0_1; }
		
		//(':paramvalue' value=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//':paramvalue'
		public Keyword getParamvalueKeyword_5_0() { return cParamvalueKeyword_5_0; }
		
		//value=STRING
		public Assignment getValueAssignment_5_1() { return cValueAssignment_5_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_5_1_0() { return cValueSTRINGTerminalRuleCall_5_1_0; }
	}
	public class ComponentCoordinationActionActivationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.ComponentCoordinationActionActivation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTclStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCoordinationServiceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0 = (CrossReference)cCoordinationServiceAssignment_2.eContents().get(0);
		private final RuleCall cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cStateKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cStateComponentModeDefinitionCrossReference_4_0 = (CrossReference)cStateAssignment_4.eContents().get(0);
		private final RuleCall cStateComponentModeDefinitionFQNParserRuleCall_4_0_1 = (RuleCall)cStateComponentModeDefinitionCrossReference_4_0.eContents().get(1);
		
		//ComponentCoordinationActionActivation:
		//	'tcl-state' ':server' coordinationService=[CoordinationInterfaceInstance] ':state'
		//	state=[componentMode::ComponentModeDefinition|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'tcl-state' ':server' coordinationService=[CoordinationInterfaceInstance] ':state'
		//state=[componentMode::ComponentModeDefinition|FQN]
		public Group getGroup() { return cGroup; }
		
		//'tcl-state'
		public Keyword getTclStateKeyword_0() { return cTclStateKeyword_0; }
		
		//':server'
		public Keyword getServerKeyword_1() { return cServerKeyword_1; }
		
		//coordinationService=[CoordinationInterfaceInstance]
		public Assignment getCoordinationServiceAssignment_2() { return cCoordinationServiceAssignment_2; }
		
		//[CoordinationInterfaceInstance]
		public CrossReference getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0() { return cCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0; }
		
		//ID
		public RuleCall getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1() { return cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1; }
		
		//':state'
		public Keyword getStateKeyword_3() { return cStateKeyword_3; }
		
		//state=[componentMode::ComponentModeDefinition|FQN]
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }
		
		//[componentMode::ComponentModeDefinition|FQN]
		public CrossReference getStateComponentModeDefinitionCrossReference_4_0() { return cStateComponentModeDefinitionCrossReference_4_0; }
		
		//FQN
		public RuleCall getStateComponentModeDefinitionFQNParserRuleCall_4_0_1() { return cStateComponentModeDefinitionFQNParserRuleCall_4_0_1; }
	}
	public class ComponentCoordinationActionEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.skillRealization.SkillRealization.ComponentCoordinationActionEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTclActivateEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cServerKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCoordinationServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0 = (CrossReference)cCoordinationServiceAssignment_3.eContents().get(0);
		private final RuleCall cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1 = (RuleCall)cCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0.eContents().get(1);
		
		//ComponentCoordinationActionEvent:
		//	'tcl-activate-event' ':name' ':server' coordinationService=[CoordinationInterfaceInstance];
		@Override public ParserRule getRule() { return rule; }
		
		//'tcl-activate-event' ':name' ':server' coordinationService=[CoordinationInterfaceInstance]
		public Group getGroup() { return cGroup; }
		
		//'tcl-activate-event'
		public Keyword getTclActivateEventKeyword_0() { return cTclActivateEventKeyword_0; }
		
		//':name'
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//':server'
		public Keyword getServerKeyword_2() { return cServerKeyword_2; }
		
		//coordinationService=[CoordinationInterfaceInstance]
		public Assignment getCoordinationServiceAssignment_3() { return cCoordinationServiceAssignment_3; }
		
		//[CoordinationInterfaceInstance]
		public CrossReference getCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0() { return cCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0; }
		
		//ID
		public RuleCall getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1() { return cCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1; }
	}
	
	
	private final SkillRealizationModelElements pSkillRealizationModel;
	private final FQNElements pFQN;
	private final CoordinationModuleRealizationElements pCoordinationModuleRealization;
	private final CoordinationInterfaceInstanceElements pCoordinationInterfaceInstance;
	private final SkillRealizationElements pSkillRealization;
	private final CoordinationActionBlockElements pCoordinationActionBlock;
	private final AbstractCoordinationActionElements pAbstractCoordinationAction;
	private final AbstractComponentCoordinationActionElements pAbstractComponentCoordinationAction;
	private final ComponentCoordinationActionParameterElements pComponentCoordinationActionParameter;
	private final ComponentCoordinationActionActivationElements pComponentCoordinationActionActivation;
	private final ComponentCoordinationActionEventElements pComponentCoordinationActionEvent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SkillRealizationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSkillRealizationModel = new SkillRealizationModelElements();
		this.pFQN = new FQNElements();
		this.pCoordinationModuleRealization = new CoordinationModuleRealizationElements();
		this.pCoordinationInterfaceInstance = new CoordinationInterfaceInstanceElements();
		this.pSkillRealization = new SkillRealizationElements();
		this.pCoordinationActionBlock = new CoordinationActionBlockElements();
		this.pAbstractCoordinationAction = new AbstractCoordinationActionElements();
		this.pAbstractComponentCoordinationAction = new AbstractComponentCoordinationActionElements();
		this.pComponentCoordinationActionParameter = new ComponentCoordinationActionParameterElements();
		this.pComponentCoordinationActionActivation = new ComponentCoordinationActionActivationElements();
		this.pComponentCoordinationActionEvent = new ComponentCoordinationActionEventElements();
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
	//	modules+=CoordinationModuleRealization*
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
	
	//CoordinationModuleRealization:
	//	'CoordinationModuleRealization' name=ID 'coordModuleDef'
	//	coordinationModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN]
	//	'uses' '{' coordInterfaceInsts+=CoordinationInterfaceInstance* '}'
	//	'{'
	//	skills+=SkillRealization*
	//	'}';
	public CoordinationModuleRealizationElements getCoordinationModuleRealizationAccess() {
		return pCoordinationModuleRealization;
	}
	
	public ParserRule getCoordinationModuleRealizationRule() {
		return getCoordinationModuleRealizationAccess().getRule();
	}
	
	//CoordinationInterfaceInstance:
	//	coordinationInterfaceDef=[serviceDefinition::CoordinationServiceDefinition|FQN] 'intsName' name=ID;
	public CoordinationInterfaceInstanceElements getCoordinationInterfaceInstanceAccess() {
		return pCoordinationInterfaceInstance;
	}
	
	public ParserRule getCoordinationInterfaceInstanceRule() {
		return getCoordinationInterfaceInstanceAccess().getRule();
	}
	
	//SkillRealization:
	//	'SkillRealization' skillDef=[skillDefinition::SkillDefinition|FQN]
	//	'{'
	//	//FIXME: add implementation
	//	'action' '(' action=CoordinationActionBlock ')'
	//	'}';
	public SkillRealizationElements getSkillRealizationAccess() {
		return pSkillRealization;
	}
	
	public ParserRule getSkillRealizationRule() {
		return getSkillRealizationAccess().getRule();
	}
	
	//CoordinationActionBlock:
	//	{CoordinationActionBlock} actions+=AbstractCoordinationAction*;
	public CoordinationActionBlockElements getCoordinationActionBlockAccess() {
		return pCoordinationActionBlock;
	}
	
	public ParserRule getCoordinationActionBlockRule() {
		return getCoordinationActionBlockAccess().getRule();
	}
	
	//AbstractCoordinationAction:
	//	AbstractComponentCoordinationAction;
	public AbstractCoordinationActionElements getAbstractCoordinationActionAccess() {
		return pAbstractCoordinationAction;
	}
	
	public ParserRule getAbstractCoordinationActionRule() {
		return getAbstractCoordinationActionAccess().getRule();
	}
	
	//AbstractComponentCoordinationAction:
	//	ComponentCoordinationActionParameter | ComponentCoordinationActionActivation | ComponentCoordinationActionEvent;
	public AbstractComponentCoordinationActionElements getAbstractComponentCoordinationActionAccess() {
		return pAbstractComponentCoordinationAction;
	}
	
	public ParserRule getAbstractComponentCoordinationActionRule() {
		return getAbstractComponentCoordinationActionAccess().getRule();
	}
	
	//ComponentCoordinationActionParameter: //(hasValue?=':paramvalue' values+=ExpressionSimple )?
	//	'tcl-param' ':server' coordinationService=[CoordinationInterfaceInstance] ':param'
	//	parameter=[parameterDefinition::AbstractParameter|FQN] (':paramvalue' value=STRING)?;
	public ComponentCoordinationActionParameterElements getComponentCoordinationActionParameterAccess() {
		return pComponentCoordinationActionParameter;
	}
	
	public ParserRule getComponentCoordinationActionParameterRule() {
		return getComponentCoordinationActionParameterAccess().getRule();
	}
	
	//ComponentCoordinationActionActivation:
	//	'tcl-state' ':server' coordinationService=[CoordinationInterfaceInstance] ':state'
	//	state=[componentMode::ComponentModeDefinition|FQN];
	public ComponentCoordinationActionActivationElements getComponentCoordinationActionActivationAccess() {
		return pComponentCoordinationActionActivation;
	}
	
	public ParserRule getComponentCoordinationActionActivationRule() {
		return getComponentCoordinationActionActivationAccess().getRule();
	}
	
	//ComponentCoordinationActionEvent:
	//	'tcl-activate-event' ':name' ':server' coordinationService=[CoordinationInterfaceInstance];
	public ComponentCoordinationActionEventElements getComponentCoordinationActionEventAccess() {
		return pComponentCoordinationActionEvent;
	}
	
	public ParserRule getComponentCoordinationActionEventRule() {
		return getComponentCoordinationActionEventAccess().getRule();
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
