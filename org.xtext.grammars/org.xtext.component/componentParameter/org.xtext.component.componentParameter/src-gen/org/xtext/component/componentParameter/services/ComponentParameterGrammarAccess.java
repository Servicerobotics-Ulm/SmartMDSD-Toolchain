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
package org.xtext.component.componentParameter.services;

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
import org.xtext.service.parameterDefinition.services.ParameterDefinitionGrammarAccess;

@Singleton
public class ComponentParameterGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentParamModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ComponentParamModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentParamModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsParamDefRepoImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cParametrizationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParametrizationComponentParameterParserRuleCall_2_0 = (RuleCall)cParametrizationAssignment_2.eContents().get(0);
		
		//ComponentParamModel componentParam::ComponentParamModel:
		//	{componentParam::ComponentParamModel} imports+=super::ParamDefRepoImport*
		//	parametrization=ComponentParameter?;
		@Override public ParserRule getRule() { return rule; }
		
		//{componentParam::ComponentParamModel} imports+=super::ParamDefRepoImport* parametrization=ComponentParameter?
		public Group getGroup() { return cGroup; }
		
		//{componentParam::ComponentParamModel}
		public Action getComponentParamModelAction_0() { return cComponentParamModelAction_0; }
		
		//imports+=super::ParamDefRepoImport*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }
		
		//super::ParamDefRepoImport
		public RuleCall getImportsParamDefRepoImportParserRuleCall_1_0() { return cImportsParamDefRepoImportParserRuleCall_1_0; }
		
		//parametrization=ComponentParameter?
		public Assignment getParametrizationAssignment_2() { return cParametrizationAssignment_2; }
		
		//ComponentParameter
		public RuleCall getParametrizationComponentParameterParserRuleCall_2_0() { return cParametrizationComponentParameterParserRuleCall_2_0; }
	}
	public class ComponentParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ComponentParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cComponentKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cComponentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cComponentComponentDefinitionCrossReference_2_1_0 = (CrossReference)cComponentAssignment_2_1.eContents().get(0);
		private final RuleCall cComponentComponentDefinitionFQNParserRuleCall_2_1_0_1 = (RuleCall)cComponentComponentDefinitionCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersAbstractComponentParameterParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentParameter componentParam::ComponentParameter:
		//	'ComponentParameter' name=ID ('component' component=[componentDefinition::ComponentDefinition|FQN])?
		//	'{'
		//	parameters+=AbstractComponentParameter*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentParameter' name=ID ('component' component=[componentDefinition::ComponentDefinition|FQN])? '{'
		//parameters+=AbstractComponentParameter* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentParameter'
		public Keyword getComponentParameterKeyword_0() { return cComponentParameterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('component' component=[componentDefinition::ComponentDefinition|FQN])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'component'
		public Keyword getComponentKeyword_2_0() { return cComponentKeyword_2_0; }
		
		//component=[componentDefinition::ComponentDefinition|FQN]
		public Assignment getComponentAssignment_2_1() { return cComponentAssignment_2_1; }
		
		//[componentDefinition::ComponentDefinition|FQN]
		public CrossReference getComponentComponentDefinitionCrossReference_2_1_0() { return cComponentComponentDefinitionCrossReference_2_1_0; }
		
		//FQN
		public RuleCall getComponentComponentDefinitionFQNParserRuleCall_2_1_0_1() { return cComponentComponentDefinitionFQNParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//parameters+=AbstractComponentParameter*
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }
		
		//AbstractComponentParameter
		public RuleCall getParametersAbstractComponentParameterParserRuleCall_4_0() { return cParametersAbstractComponentParameterParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AbstractComponentParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.AbstractComponentParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInternalParameterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExtendedParameterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cExtendedTriggerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cParameterSetInstanceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractComponentParameter componentParam::AbstractComponentParameter:
		//	InternalParameter | ExtendedParameter | ExtendedTrigger | ParameterSetInstance;
		@Override public ParserRule getRule() { return rule; }
		
		//InternalParameter | ExtendedParameter | ExtendedTrigger | ParameterSetInstance
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//InternalParameter
		public RuleCall getInternalParameterParserRuleCall_0() { return cInternalParameterParserRuleCall_0; }
		
		//ExtendedParameter
		public RuleCall getExtendedParameterParserRuleCall_1() { return cExtendedParameterParserRuleCall_1; }
		
		//ExtendedTrigger
		public RuleCall getExtendedTriggerParserRuleCall_2() { return cExtendedTriggerParserRuleCall_2; }
		
		//ParameterSetInstance
		public RuleCall getParameterSetInstanceParserRuleCall_3() { return cParameterSetInstanceParserRuleCall_3; }
	}
	public class InternalParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.InternalParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInternalParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InternalParameter componentParam::InternalParameter:
		//	'InternalParameter' name=ID
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'InternalParameter' name=ID '{' attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'InternalParameter'
		public Keyword getInternalParameterKeyword_0() { return cInternalParameterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_3_0() { return cAttributesAttributeDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ExtendedParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ExtendedParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendedParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExtendedParameter componentParam::ExtendedParameter:
		//	'ExtendedParameter' name=ID
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendedParameter' name=ID '{' attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'ExtendedParameter'
		public Keyword getExtendedParameterKeyword_0() { return cExtendedParameterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_3_0() { return cAttributesAttributeDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ExtendedTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ExtendedTrigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendedTriggerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cActiveAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final Keyword cActiveActiveKeyword_2_0_0 = (Keyword)cActiveAssignment_2_0.eContents().get(0);
		private final Keyword cPassiveKeyword_2_1 = (Keyword)cAlternatives_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ExtendedTrigger componentParam::ExtendedTrigger:
		//	'ExtendedTrigger' name=ID (active?='active' | 'passive')
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendedTrigger' name=ID (active?='active' | 'passive') '{' attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'ExtendedTrigger'
		public Keyword getExtendedTriggerKeyword_0() { return cExtendedTriggerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//active?='active' | 'passive'
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//active?='active'
		public Assignment getActiveAssignment_2_0() { return cActiveAssignment_2_0; }
		
		//'active'
		public Keyword getActiveActiveKeyword_2_0_0() { return cActiveActiveKeyword_2_0_0; }
		
		//'passive'
		public Keyword getPassiveKeyword_2_1() { return cPassiveKeyword_2_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_4_0() { return cAttributesAttributeDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ParameterSetInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ParameterSetInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterSetInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParamSetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParamSetParameterSetDefinitionCrossReference_1_0 = (CrossReference)cParamSetAssignment_1.eContents().get(0);
		private final RuleCall cParamSetParameterSetDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cParamSetParameterSetDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterInstancesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterInstancesAbstractParameterInstanceParserRuleCall_3_0 = (RuleCall)cParameterInstancesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParameterSetInstance componentParam::ParameterSetInstance:
		//	'ParameterSetInstance' paramSet=[parameterDefinition::ParameterSetDefinition|FQN]
		//	'{'
		//	parameterInstances+=AbstractParameterInstance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ParameterSetInstance' paramSet=[parameterDefinition::ParameterSetDefinition|FQN] '{'
		//parameterInstances+=AbstractParameterInstance* '}'
		public Group getGroup() { return cGroup; }
		
		//'ParameterSetInstance'
		public Keyword getParameterSetInstanceKeyword_0() { return cParameterSetInstanceKeyword_0; }
		
		//paramSet=[parameterDefinition::ParameterSetDefinition|FQN]
		public Assignment getParamSetAssignment_1() { return cParamSetAssignment_1; }
		
		//[parameterDefinition::ParameterSetDefinition|FQN]
		public CrossReference getParamSetParameterSetDefinitionCrossReference_1_0() { return cParamSetParameterSetDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getParamSetParameterSetDefinitionFQNParserRuleCall_1_0_1() { return cParamSetParameterSetDefinitionFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//parameterInstances+=AbstractParameterInstance*
		public Assignment getParameterInstancesAssignment_3() { return cParameterInstancesAssignment_3; }
		
		//AbstractParameterInstance
		public RuleCall getParameterInstancesAbstractParameterInstanceParserRuleCall_3_0() { return cParameterInstancesAbstractParameterInstanceParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractParameterInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.AbstractParameterInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTriggerInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParameterInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractParameterInstance componentParam::AbstractParameterInstance:
		//	TriggerInstance | ParameterInstance;
		@Override public ParserRule getRule() { return rule; }
		
		//TriggerInstance | ParameterInstance
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TriggerInstance
		public RuleCall getTriggerInstanceParserRuleCall_0() { return cTriggerInstanceParserRuleCall_0; }
		
		//ParameterInstance
		public RuleCall getParameterInstanceParserRuleCall_1() { return cParameterInstanceParserRuleCall_1; }
	}
	public class TriggerInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.TriggerInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTriggerInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTriggerDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTriggerDefTriggerDefinitionCrossReference_1_0 = (CrossReference)cTriggerDefAssignment_1.eContents().get(0);
		private final RuleCall cTriggerDefTriggerDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cTriggerDefTriggerDefinitionCrossReference_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cActiveAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final Keyword cActiveActiveKeyword_2_0_0 = (Keyword)cActiveAssignment_2_0.eContents().get(0);
		private final Keyword cPassiveKeyword_2_1 = (Keyword)cAlternatives_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TriggerInstance componentParam::TriggerInstance:
		//	'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active' | 'passive') ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active' | 'passive') ';'?
		public Group getGroup() { return cGroup; }
		
		//'TriggerInstance'
		public Keyword getTriggerInstanceKeyword_0() { return cTriggerInstanceKeyword_0; }
		
		//triggerDef=[parameterDefinition::TriggerDefinition|FQN]
		public Assignment getTriggerDefAssignment_1() { return cTriggerDefAssignment_1; }
		
		//[parameterDefinition::TriggerDefinition|FQN]
		public CrossReference getTriggerDefTriggerDefinitionCrossReference_1_0() { return cTriggerDefTriggerDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getTriggerDefTriggerDefinitionFQNParserRuleCall_1_0_1() { return cTriggerDefTriggerDefinitionFQNParserRuleCall_1_0_1; }
		
		//active?='active' | 'passive'
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//active?='active'
		public Assignment getActiveAssignment_2_0() { return cActiveAssignment_2_0; }
		
		//'active'
		public Keyword getActiveActiveKeyword_2_0_0() { return cActiveActiveKeyword_2_0_0; }
		
		//'passive'
		public Keyword getPassiveKeyword_2_1() { return cPassiveKeyword_2_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ParameterInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ParameterInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterDefParameterDefinitionCrossReference_1_0 = (CrossReference)cParameterDefAssignment_1.eContents().get(0);
		private final RuleCall cParameterDefParameterDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cParameterDefParameterDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeRefinementParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParameterInstance componentParam::ParameterInstance:
		//	'ParameterInstance' parameterDef=[parameterDefinition::ParameterDefinition|FQN]
		//	'{'
		//	attributes+=BasicAttributes::AttributeRefinement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ParameterInstance' parameterDef=[parameterDefinition::ParameterDefinition|FQN] '{'
		//attributes+=BasicAttributes::AttributeRefinement* '}'
		public Group getGroup() { return cGroup; }
		
		//'ParameterInstance'
		public Keyword getParameterInstanceKeyword_0() { return cParameterInstanceKeyword_0; }
		
		//parameterDef=[parameterDefinition::ParameterDefinition|FQN]
		public Assignment getParameterDefAssignment_1() { return cParameterDefAssignment_1; }
		
		//[parameterDefinition::ParameterDefinition|FQN]
		public CrossReference getParameterDefParameterDefinitionCrossReference_1_0() { return cParameterDefParameterDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getParameterDefParameterDefinitionFQNParserRuleCall_1_0_1() { return cParameterDefParameterDefinitionFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=BasicAttributes::AttributeRefinement*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//BasicAttributes::AttributeRefinement
		public RuleCall getAttributesAttributeRefinementParserRuleCall_3_0() { return cAttributesAttributeRefinementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ComponentParamModelElements pComponentParamModel;
	private final ComponentParameterElements pComponentParameter;
	private final AbstractComponentParameterElements pAbstractComponentParameter;
	private final InternalParameterElements pInternalParameter;
	private final ExtendedParameterElements pExtendedParameter;
	private final ExtendedTriggerElements pExtendedTrigger;
	private final ParameterSetInstanceElements pParameterSetInstance;
	private final AbstractParameterInstanceElements pAbstractParameterInstance;
	private final TriggerInstanceElements pTriggerInstance;
	private final ParameterInstanceElements pParameterInstance;
	
	private final Grammar grammar;
	
	private final ParameterDefinitionGrammarAccess gaParameterDefinition;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentParameterGrammarAccess(GrammarProvider grammarProvider,
			ParameterDefinitionGrammarAccess gaParameterDefinition,
			BasicAttributesGrammarAccess gaBasicAttributes,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParameterDefinition = gaParameterDefinition;
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaTerminals = gaTerminals;
		this.pComponentParamModel = new ComponentParamModelElements();
		this.pComponentParameter = new ComponentParameterElements();
		this.pAbstractComponentParameter = new AbstractComponentParameterElements();
		this.pInternalParameter = new InternalParameterElements();
		this.pExtendedParameter = new ExtendedParameterElements();
		this.pExtendedTrigger = new ExtendedTriggerElements();
		this.pParameterSetInstance = new ParameterSetInstanceElements();
		this.pAbstractParameterInstance = new AbstractParameterInstanceElements();
		this.pTriggerInstance = new TriggerInstanceElements();
		this.pParameterInstance = new ParameterInstanceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.component.componentParameter.ComponentParameter".equals(grammar.getName())) {
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
	
	
	public ParameterDefinitionGrammarAccess getParameterDefinitionGrammarAccess() {
		return gaParameterDefinition;
	}
	
	public BasicAttributesGrammarAccess getBasicAttributesGrammarAccess() {
		return gaBasicAttributes;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ComponentParamModel componentParam::ComponentParamModel:
	//	{componentParam::ComponentParamModel} imports+=super::ParamDefRepoImport*
	//	parametrization=ComponentParameter?;
	public ComponentParamModelElements getComponentParamModelAccess() {
		return pComponentParamModel;
	}
	
	public ParserRule getComponentParamModelRule() {
		return getComponentParamModelAccess().getRule();
	}
	
	//ComponentParameter componentParam::ComponentParameter:
	//	'ComponentParameter' name=ID ('component' component=[componentDefinition::ComponentDefinition|FQN])?
	//	'{'
	//	parameters+=AbstractComponentParameter*
	//	'}';
	public ComponentParameterElements getComponentParameterAccess() {
		return pComponentParameter;
	}
	
	public ParserRule getComponentParameterRule() {
		return getComponentParameterAccess().getRule();
	}
	
	//AbstractComponentParameter componentParam::AbstractComponentParameter:
	//	InternalParameter | ExtendedParameter | ExtendedTrigger | ParameterSetInstance;
	public AbstractComponentParameterElements getAbstractComponentParameterAccess() {
		return pAbstractComponentParameter;
	}
	
	public ParserRule getAbstractComponentParameterRule() {
		return getAbstractComponentParameterAccess().getRule();
	}
	
	//InternalParameter componentParam::InternalParameter:
	//	'InternalParameter' name=ID
	//	'{'
	//	attributes+=BasicAttributes::AttributeDefinition*
	//	'}';
	public InternalParameterElements getInternalParameterAccess() {
		return pInternalParameter;
	}
	
	public ParserRule getInternalParameterRule() {
		return getInternalParameterAccess().getRule();
	}
	
	//ExtendedParameter componentParam::ExtendedParameter:
	//	'ExtendedParameter' name=ID
	//	'{'
	//	attributes+=BasicAttributes::AttributeDefinition*
	//	'}';
	public ExtendedParameterElements getExtendedParameterAccess() {
		return pExtendedParameter;
	}
	
	public ParserRule getExtendedParameterRule() {
		return getExtendedParameterAccess().getRule();
	}
	
	//ExtendedTrigger componentParam::ExtendedTrigger:
	//	'ExtendedTrigger' name=ID (active?='active' | 'passive')
	//	'{'
	//	attributes+=BasicAttributes::AttributeDefinition*
	//	'}';
	public ExtendedTriggerElements getExtendedTriggerAccess() {
		return pExtendedTrigger;
	}
	
	public ParserRule getExtendedTriggerRule() {
		return getExtendedTriggerAccess().getRule();
	}
	
	//ParameterSetInstance componentParam::ParameterSetInstance:
	//	'ParameterSetInstance' paramSet=[parameterDefinition::ParameterSetDefinition|FQN]
	//	'{'
	//	parameterInstances+=AbstractParameterInstance*
	//	'}';
	public ParameterSetInstanceElements getParameterSetInstanceAccess() {
		return pParameterSetInstance;
	}
	
	public ParserRule getParameterSetInstanceRule() {
		return getParameterSetInstanceAccess().getRule();
	}
	
	//AbstractParameterInstance componentParam::AbstractParameterInstance:
	//	TriggerInstance | ParameterInstance;
	public AbstractParameterInstanceElements getAbstractParameterInstanceAccess() {
		return pAbstractParameterInstance;
	}
	
	public ParserRule getAbstractParameterInstanceRule() {
		return getAbstractParameterInstanceAccess().getRule();
	}
	
	//TriggerInstance componentParam::TriggerInstance:
	//	'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active' | 'passive') ';'?;
	public TriggerInstanceElements getTriggerInstanceAccess() {
		return pTriggerInstance;
	}
	
	public ParserRule getTriggerInstanceRule() {
		return getTriggerInstanceAccess().getRule();
	}
	
	//ParameterInstance componentParam::ParameterInstance:
	//	'ParameterInstance' parameterDef=[parameterDefinition::ParameterDefinition|FQN]
	//	'{'
	//	attributes+=BasicAttributes::AttributeRefinement*
	//	'}';
	public ParameterInstanceElements getParameterInstanceAccess() {
		return pParameterInstance;
	}
	
	public ParserRule getParameterInstanceRule() {
		return getParameterInstanceAccess().getRule();
	}
	
	//ParamDefModel param::ParamDefModel:
	//	{param::ParamDefModel} imports+=ParamDefRepoImport*
	//	repository=ParameterSetRepository?;
	public ParameterDefinitionGrammarAccess.ParamDefModelElements getParamDefModelAccess() {
		return gaParameterDefinition.getParamDefModelAccess();
	}
	
	public ParserRule getParamDefModelRule() {
		return getParamDefModelAccess().getRule();
	}
	
	//// parser rules for names
	//FQNW:
	//	FQN '.*'?;
	public ParameterDefinitionGrammarAccess.FQNWElements getFQNWAccess() {
		return gaParameterDefinition.getFQNWAccess();
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
	}
	
	//ParamDefRepoImport param::ParamDefRepoImport:
	//	'#import' importedNamespace=FQNW ';'?;
	public ParameterDefinitionGrammarAccess.ParamDefRepoImportElements getParamDefRepoImportAccess() {
		return gaParameterDefinition.getParamDefRepoImportAccess();
	}
	
	public ParserRule getParamDefRepoImportRule() {
		return getParamDefRepoImportAccess().getRule();
	}
	
	//ParameterSetRepository param::ParameterSetRepository:
	//	'ParameterSetRepository' name=ID
	//	'{'
	//	sets+=ParameterSetDefinition*
	//	'}';
	public ParameterDefinitionGrammarAccess.ParameterSetRepositoryElements getParameterSetRepositoryAccess() {
		return gaParameterDefinition.getParameterSetRepositoryAccess();
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
	public ParameterDefinitionGrammarAccess.ParameterSetDefinitionElements getParameterSetDefinitionAccess() {
		return gaParameterDefinition.getParameterSetDefinitionAccess();
	}
	
	public ParserRule getParameterSetDefinitionRule() {
		return getParameterSetDefinitionAccess().getRule();
	}
	
	//AbstractParameter param::AbstractParameter:
	//	ParameterDefinition | TriggerDefinition;
	public ParameterDefinitionGrammarAccess.AbstractParameterElements getAbstractParameterAccess() {
		return gaParameterDefinition.getAbstractParameterAccess();
	}
	
	public ParserRule getAbstractParameterRule() {
		return getAbstractParameterAccess().getRule();
	}
	
	//ParameterDefinition param::ParameterDefinition:
	//	'Parameter' name=ID
	//	'{'
	//	attributes+=AttributeDefinition*
	//	'}';
	public ParameterDefinitionGrammarAccess.ParameterDefinitionElements getParameterDefinitionAccess() {
		return gaParameterDefinition.getParameterDefinitionAccess();
	}
	
	public ParserRule getParameterDefinitionRule() {
		return getParameterDefinitionAccess().getRule();
	}
	
	//TriggerDefinition param::TriggerDefinition:
	//	'Trigger' name=ID
	//	'{'
	//	attributes+=AttributeDefinition*
	//	'}';
	public ParameterDefinitionGrammarAccess.TriggerDefinitionElements getTriggerDefinitionAccess() {
		return gaParameterDefinition.getTriggerDefinitionAccess();
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
