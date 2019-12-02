//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
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
//================================================================
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
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;
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
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cInternalParameterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//InternalParameter componentParam::InternalParameter:
		//	documentation=DOCU_COMMENT?
		//	'InternalParameter' name=ID
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'InternalParameter' name=ID '{' attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'InternalParameter'
		public Keyword getInternalParameterKeyword_1() { return cInternalParameterKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_4_0() { return cAttributesAttributeDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ExtendedParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ExtendedParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cExtendedParameterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ExtendedParameter componentParam::ExtendedParameter:
		//	documentation=DOCU_COMMENT?
		//	'ExtendedParameter' name=ID
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'ExtendedParameter' name=ID '{' attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'ExtendedParameter'
		public Keyword getExtendedParameterKeyword_1() { return cExtendedParameterKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_4_0() { return cAttributesAttributeDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ExtendedTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ExtendedTrigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cExtendedTriggerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cActiveAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final Keyword cActiveActiveKeyword_3_0_0 = (Keyword)cActiveAssignment_3_0.eContents().get(0);
		private final Keyword cPassiveKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_5_0 = (RuleCall)cAttributesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ExtendedTrigger componentParam::ExtendedTrigger:
		//	documentation=DOCU_COMMENT?
		//	'ExtendedTrigger' name=ID (active?='active' | 'passive')
		//	'{'
		//	attributes+=BasicAttributes::AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'ExtendedTrigger' name=ID (active?='active' | 'passive') '{'
		//attributes+=BasicAttributes::AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'ExtendedTrigger'
		public Keyword getExtendedTriggerKeyword_1() { return cExtendedTriggerKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//active?='active' | 'passive'
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//active?='active'
		public Assignment getActiveAssignment_3_0() { return cActiveAssignment_3_0; }
		
		//'active'
		public Keyword getActiveActiveKeyword_3_0_0() { return cActiveActiveKeyword_3_0_0; }
		
		//'passive'
		public Keyword getPassiveKeyword_3_1() { return cPassiveKeyword_3_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//attributes+=BasicAttributes::AttributeDefinition*
		public Assignment getAttributesAssignment_5() { return cAttributesAssignment_5; }
		
		//BasicAttributes::AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_5_0() { return cAttributesAttributeDefinitionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ParameterSetInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ParameterSetInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cParameterSetInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParamSetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParamSetParameterSetDefinitionCrossReference_2_0 = (CrossReference)cParamSetAssignment_2.eContents().get(0);
		private final RuleCall cParamSetParameterSetDefinitionFQNParserRuleCall_2_0_1 = (RuleCall)cParamSetParameterSetDefinitionCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParameterInstancesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParameterInstancesAbstractParameterInstanceParserRuleCall_4_0 = (RuleCall)cParameterInstancesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ParameterSetInstance componentParam::ParameterSetInstance:
		//	documentation=DOCU_COMMENT?
		//	'ParameterSetInstance' paramSet=[parameterDefinition::ParameterSetDefinition|FQN]
		//	'{'
		//	parameterInstances+=AbstractParameterInstance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'ParameterSetInstance' paramSet=[parameterDefinition::ParameterSetDefinition|FQN] '{'
		//parameterInstances+=AbstractParameterInstance* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'ParameterSetInstance'
		public Keyword getParameterSetInstanceKeyword_1() { return cParameterSetInstanceKeyword_1; }
		
		//paramSet=[parameterDefinition::ParameterSetDefinition|FQN]
		public Assignment getParamSetAssignment_2() { return cParamSetAssignment_2; }
		
		//[parameterDefinition::ParameterSetDefinition|FQN]
		public CrossReference getParamSetParameterSetDefinitionCrossReference_2_0() { return cParamSetParameterSetDefinitionCrossReference_2_0; }
		
		//FQN
		public RuleCall getParamSetParameterSetDefinitionFQNParserRuleCall_2_0_1() { return cParamSetParameterSetDefinitionFQNParserRuleCall_2_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//parameterInstances+=AbstractParameterInstance*
		public Assignment getParameterInstancesAssignment_4() { return cParameterInstancesAssignment_4; }
		
		//AbstractParameterInstance
		public RuleCall getParameterInstancesAbstractParameterInstanceParserRuleCall_4_0() { return cParameterInstancesAbstractParameterInstanceParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
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
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cTriggerInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTriggerDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTriggerDefTriggerDefinitionCrossReference_2_0 = (CrossReference)cTriggerDefAssignment_2.eContents().get(0);
		private final RuleCall cTriggerDefTriggerDefinitionFQNParserRuleCall_2_0_1 = (RuleCall)cTriggerDefTriggerDefinitionCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cActiveAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final Keyword cActiveActiveKeyword_3_0_0 = (Keyword)cActiveAssignment_3_0.eContents().get(0);
		private final Keyword cPassiveKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TriggerInstance componentParam::TriggerInstance:
		//	documentation=DOCU_COMMENT?
		//	'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active' | 'passive') ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active'
		//| 'passive') ';'?
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'TriggerInstance'
		public Keyword getTriggerInstanceKeyword_1() { return cTriggerInstanceKeyword_1; }
		
		//triggerDef=[parameterDefinition::TriggerDefinition|FQN]
		public Assignment getTriggerDefAssignment_2() { return cTriggerDefAssignment_2; }
		
		//[parameterDefinition::TriggerDefinition|FQN]
		public CrossReference getTriggerDefTriggerDefinitionCrossReference_2_0() { return cTriggerDefTriggerDefinitionCrossReference_2_0; }
		
		//FQN
		public RuleCall getTriggerDefTriggerDefinitionFQNParserRuleCall_2_0_1() { return cTriggerDefTriggerDefinitionFQNParserRuleCall_2_0_1; }
		
		//active?='active' | 'passive'
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//active?='active'
		public Assignment getActiveAssignment_3_0() { return cActiveAssignment_3_0; }
		
		//'active'
		public Keyword getActiveActiveKeyword_3_0_0() { return cActiveActiveKeyword_3_0_0; }
		
		//'passive'
		public Keyword getPassiveKeyword_3_1() { return cPassiveKeyword_3_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class ParameterInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentParameter.ComponentParameter.ParameterInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cParameterInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParameterDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParameterDefParameterDefinitionCrossReference_2_0 = (CrossReference)cParameterDefAssignment_2.eContents().get(0);
		private final RuleCall cParameterDefParameterDefinitionFQNParserRuleCall_2_0_1 = (RuleCall)cParameterDefParameterDefinitionCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeRefinementParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ParameterInstance componentParam::ParameterInstance:
		//	documentation=DOCU_COMMENT?
		//	'ParameterInstance' parameterDef=[parameterDefinition::ParameterDefinition|FQN]
		//	'{'
		//	attributes+=BasicAttributes::AttributeRefinement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'ParameterInstance' parameterDef=[parameterDefinition::ParameterDefinition|FQN] '{'
		//attributes+=BasicAttributes::AttributeRefinement* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'ParameterInstance'
		public Keyword getParameterInstanceKeyword_1() { return cParameterInstanceKeyword_1; }
		
		//parameterDef=[parameterDefinition::ParameterDefinition|FQN]
		public Assignment getParameterDefAssignment_2() { return cParameterDefAssignment_2; }
		
		//[parameterDefinition::ParameterDefinition|FQN]
		public CrossReference getParameterDefParameterDefinitionCrossReference_2_0() { return cParameterDefParameterDefinitionCrossReference_2_0; }
		
		//FQN
		public RuleCall getParameterDefParameterDefinitionFQNParserRuleCall_2_0_1() { return cParameterDefParameterDefinitionFQNParserRuleCall_2_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=BasicAttributes::AttributeRefinement*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//BasicAttributes::AttributeRefinement
		public RuleCall getAttributesAttributeRefinementParserRuleCall_4_0() { return cAttributesAttributeRefinementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
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
	
	private final DocuTerminalsGrammarAccess gaDocuTerminals;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentParameterGrammarAccess(GrammarProvider grammarProvider,
			ParameterDefinitionGrammarAccess gaParameterDefinition,
			BasicAttributesGrammarAccess gaBasicAttributes,
			DocuTerminalsGrammarAccess gaDocuTerminals,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParameterDefinition = gaParameterDefinition;
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaDocuTerminals = gaDocuTerminals;
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
	
	public DocuTerminalsGrammarAccess getDocuTerminalsGrammarAccess() {
		return gaDocuTerminals;
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
	//	'TriggerInstance' triggerDef=[parameterDefinition::TriggerDefinition|FQN] (active?='active' | 'passive') ';'?;
	public TriggerInstanceElements getTriggerInstanceAccess() {
		return pTriggerInstance;
	}
	
	public ParserRule getTriggerInstanceRule() {
		return getTriggerInstanceAccess().getRule();
	}
	
	//ParameterInstance componentParam::ParameterInstance:
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
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
	//	documentation=DOCU_COMMENT?
	//	name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
	public BasicAttributesGrammarAccess.AttributeDefinitionElements getAttributeDefinitionAccess() {
		return gaBasicAttributes.getAttributeDefinitionAccess();
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}
	
	//AttributeRefinement attr::AttributeRefinement:
	//	documentation=DOCU_COMMENT?
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
	
	//AbstractDocumentedElement:
	//	{AbstractDocumentedElement} documentation=DOCU_COMMENT?;
	public DocuTerminalsGrammarAccess.AbstractDocumentedElementElements getAbstractDocumentedElementAccess() {
		return gaDocuTerminals.getAbstractDocumentedElementAccess();
	}
	
	public ParserRule getAbstractDocumentedElementRule() {
		return getAbstractDocumentedElementAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*' !'*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaDocuTerminals.getML_COMMENTRule();
	}
	
	//terminal fragment ML_DOCUMENTATION:
	//	'/**'->'*/';
	public TerminalRule getML_DOCUMENTATIONRule() {
		return gaDocuTerminals.getML_DOCUMENTATIONRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !'/' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDocuTerminals.getSL_COMMENTRule();
	}
	
	//terminal fragment SL_DOCUMENTATION:
	//	'///' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_DOCUMENTATIONRule() {
		return gaDocuTerminals.getSL_DOCUMENTATIONRule();
	}
	
	//terminal DOCU_COMMENT:
	//	ML_DOCUMENTATION | SL_DOCUMENTATION;
	public TerminalRule getDOCU_COMMENTRule() {
		return gaDocuTerminals.getDOCU_COMMENTRule();
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
