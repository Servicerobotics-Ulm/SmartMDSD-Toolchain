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
package org.xtext.system.activityArchitecture.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ActivityArchitectureGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ActivityArchitectureModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.ActivityArchitectureModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityArchitectureModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActivityArchitectureModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsAbstractActivityArchitectureElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ActivityArchitectureModel:
		//	{ActivityArchitectureModel}
		//	'ActivityArchitectureModel' name=ID
		//	'{'
		//	elements+=AbstractActivityArchitectureElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ActivityArchitectureModel} 'ActivityArchitectureModel' name=ID '{' elements+=AbstractActivityArchitectureElement* '}'
		public Group getGroup() { return cGroup; }
		
		//{ActivityArchitectureModel}
		public Action getActivityArchitectureModelAction_0() { return cActivityArchitectureModelAction_0; }
		
		//'ActivityArchitectureModel'
		public Keyword getActivityArchitectureModelKeyword_1() { return cActivityArchitectureModelKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//elements+=AbstractActivityArchitectureElement*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//AbstractActivityArchitectureElement
		public RuleCall getElementsAbstractActivityArchitectureElementParserRuleCall_4_0() { return cElementsAbstractActivityArchitectureElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble ecore::EDouble:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.FQN");
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
	public class AbstractActivityArchitectureElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractActivityArchitectureElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCPUCoreParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAbstractSourceNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDataFlowParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractActivityArchitectureElement:
		//	CPUCore | AbstractSourceNode | DataFlow;
		@Override public ParserRule getRule() { return rule; }
		
		//CPUCore | AbstractSourceNode | DataFlow
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CPUCore
		public RuleCall getCPUCoreParserRuleCall_0() { return cCPUCoreParserRuleCall_0; }
		
		//AbstractSourceNode
		public RuleCall getAbstractSourceNodeParserRuleCall_1() { return cAbstractSourceNodeParserRuleCall_1; }
		
		//DataFlow
		public RuleCall getDataFlowParserRuleCall_2() { return cDataFlowParserRuleCall_2; }
	}
	public class DataFlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.DataFlow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataFlowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSourceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSourceAbstractSourceNodeCrossReference_3_0 = (CrossReference)cSourceAssignment_3.eContents().get(0);
		private final RuleCall cSourceAbstractSourceNodeFQNParserRuleCall_3_0_1 = (RuleCall)cSourceAbstractSourceNodeCrossReference_3_0.eContents().get(1);
		private final Keyword cDestinationKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDestinationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cDestinationAbstractInputNodeCrossReference_5_0 = (CrossReference)cDestinationAssignment_5.eContents().get(0);
		private final RuleCall cDestinationAbstractInputNodeFQNParserRuleCall_5_0_1 = (RuleCall)cDestinationAbstractInputNodeCrossReference_5_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DataFlow:
		//	'DataFlow'
		//	'{'
		//	'source' source=[AbstractSourceNode|FQN]
		//	'destination' destination=[AbstractInputNode|FQN]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DataFlow' '{' 'source' source=[AbstractSourceNode|FQN] 'destination' destination=[AbstractInputNode|FQN] '}'
		public Group getGroup() { return cGroup; }
		
		//'DataFlow'
		public Keyword getDataFlowKeyword_0() { return cDataFlowKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'source'
		public Keyword getSourceKeyword_2() { return cSourceKeyword_2; }
		
		//source=[AbstractSourceNode|FQN]
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//[AbstractSourceNode|FQN]
		public CrossReference getSourceAbstractSourceNodeCrossReference_3_0() { return cSourceAbstractSourceNodeCrossReference_3_0; }
		
		//FQN
		public RuleCall getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1() { return cSourceAbstractSourceNodeFQNParserRuleCall_3_0_1; }
		
		//'destination'
		public Keyword getDestinationKeyword_4() { return cDestinationKeyword_4; }
		
		//destination=[AbstractInputNode|FQN]
		public Assignment getDestinationAssignment_5() { return cDestinationAssignment_5; }
		
		//[AbstractInputNode|FQN]
		public CrossReference getDestinationAbstractInputNodeCrossReference_5_0() { return cDestinationAbstractInputNodeCrossReference_5_0; }
		
		//FQN
		public RuleCall getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1() { return cDestinationAbstractInputNodeFQNParserRuleCall_5_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AbstractSourceNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractSourceNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActivityNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputHandlerNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractSourceNode:
		//	ActivityNode | InputHandlerNode;
		@Override public ParserRule getRule() { return rule; }
		
		//ActivityNode | InputHandlerNode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActivityNode
		public RuleCall getActivityNodeParserRuleCall_0() { return cActivityNodeParserRuleCall_0; }
		
		//InputHandlerNode
		public RuleCall getInputHandlerNodeParserRuleCall_1() { return cInputHandlerNodeParserRuleCall_1; }
	}
	public class InputHandlerNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.InputHandlerNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputHandlerNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInputHandlerNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInputKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInputNodeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0 = (RuleCall)cInputNodeAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cPrescaleKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cPrescaleAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cPrescaleEIntParserRuleCall_5_1_0 = (RuleCall)cPrescaleAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//InputHandlerNode:
		//	{InputHandlerNode}
		//	'InputHandlerNode' name=ID
		//	'{' ('input' inputNode=HandlerTriggerInputNode)? ('prescale' prescale=EInt)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{InputHandlerNode} 'InputHandlerNode' name=ID '{' ('input' inputNode=HandlerTriggerInputNode)? ('prescale'
		//prescale=EInt)? '}'
		public Group getGroup() { return cGroup; }
		
		//{InputHandlerNode}
		public Action getInputHandlerNodeAction_0() { return cInputHandlerNodeAction_0; }
		
		//'InputHandlerNode'
		public Keyword getInputHandlerNodeKeyword_1() { return cInputHandlerNodeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('input' inputNode=HandlerTriggerInputNode)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'input'
		public Keyword getInputKeyword_4_0() { return cInputKeyword_4_0; }
		
		//inputNode=HandlerTriggerInputNode
		public Assignment getInputNodeAssignment_4_1() { return cInputNodeAssignment_4_1; }
		
		//HandlerTriggerInputNode
		public RuleCall getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0() { return cInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0; }
		
		//('prescale' prescale=EInt)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'prescale'
		public Keyword getPrescaleKeyword_5_0() { return cPrescaleKeyword_5_0; }
		
		//prescale=EInt
		public Assignment getPrescaleAssignment_5_1() { return cPrescaleAssignment_5_1; }
		
		//EInt
		public RuleCall getPrescaleEIntParserRuleCall_5_1_0() { return cPrescaleEIntParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class HandlerTriggerInputNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.HandlerTriggerInputNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTriggerInputNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTriggerInputNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//HandlerTriggerInputNode TriggerInputNode:
		//	{TriggerInputNode}
		//	'TriggerInputNode' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{TriggerInputNode} 'TriggerInputNode' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//{TriggerInputNode}
		public Action getTriggerInputNodeAction_0() { return cTriggerInputNodeAction_0; }
		
		//'TriggerInputNode'
		public Keyword getTriggerInputNodeKeyword_1() { return cTriggerInputNodeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ActivityNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.ActivityNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActivityNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInputsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cInputsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cInputsAbstractInputNodeParserRuleCall_4_2_0 = (RuleCall)cInputsAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cCpuAffinityKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cAffinityAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final CrossReference cAffinityCPUCoreCrossReference_5_0_1_0 = (CrossReference)cAffinityAssignment_5_0_1.eContents().get(0);
		private final RuleCall cAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1 = (RuleCall)cAffinityCPUCoreCrossReference_5_0_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cActivationSourceKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cActivationSourceAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cActivationSourceActivationSourceParserRuleCall_5_1_1_0 = (RuleCall)cActivationSourceAssignment_5_1_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cExecutionTimeKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cExecutionTimeAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cExecutionTimeExecutionTimeParserRuleCall_5_2_1_0 = (RuleCall)cExecutionTimeAssignment_5_2_1.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cSchedulerKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cSchedulerAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cSchedulerSchedulerParserRuleCall_5_3_1_0 = (RuleCall)cSchedulerAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ActivityNode:
		//	{ActivityNode}
		//	'ActivityNode' name=ID
		//	'{' ('inputs' '{' inputs+=AbstractInputNode* '}')? (('cpuAffinity' affinity=[CPUCore|FQN] ';'?)? & ('activationSource'
		//	activationSource=ActivationSource)? & ('executionTime' executionTime=ExecutionTime)? & ('scheduler'
		//	scheduler=Scheduler)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ActivityNode} 'ActivityNode' name=ID '{' ('inputs' '{' inputs+=AbstractInputNode* '}')? (('cpuAffinity'
		//affinity=[CPUCore|FQN] ';'?)? & ('activationSource' activationSource=ActivationSource)? & ('executionTime'
		//executionTime=ExecutionTime)? & ('scheduler' scheduler=Scheduler)?) '}'
		public Group getGroup() { return cGroup; }
		
		//{ActivityNode}
		public Action getActivityNodeAction_0() { return cActivityNodeAction_0; }
		
		//'ActivityNode'
		public Keyword getActivityNodeKeyword_1() { return cActivityNodeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('inputs' '{' inputs+=AbstractInputNode* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'inputs'
		public Keyword getInputsKeyword_4_0() { return cInputsKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//inputs+=AbstractInputNode*
		public Assignment getInputsAssignment_4_2() { return cInputsAssignment_4_2; }
		
		//AbstractInputNode
		public RuleCall getInputsAbstractInputNodeParserRuleCall_4_2_0() { return cInputsAbstractInputNodeParserRuleCall_4_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }
		
		//('cpuAffinity' affinity=[CPUCore|FQN] ';'?)? & ('activationSource' activationSource=ActivationSource)? &
		//('executionTime' executionTime=ExecutionTime)? & ('scheduler' scheduler=Scheduler)?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }
		
		//('cpuAffinity' affinity=[CPUCore|FQN] ';'?)?
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'cpuAffinity'
		public Keyword getCpuAffinityKeyword_5_0_0() { return cCpuAffinityKeyword_5_0_0; }
		
		//affinity=[CPUCore|FQN]
		public Assignment getAffinityAssignment_5_0_1() { return cAffinityAssignment_5_0_1; }
		
		//[CPUCore|FQN]
		public CrossReference getAffinityCPUCoreCrossReference_5_0_1_0() { return cAffinityCPUCoreCrossReference_5_0_1_0; }
		
		//FQN
		public RuleCall getAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1() { return cAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_5_0_2() { return cSemicolonKeyword_5_0_2; }
		
		//('activationSource' activationSource=ActivationSource)?
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'activationSource'
		public Keyword getActivationSourceKeyword_5_1_0() { return cActivationSourceKeyword_5_1_0; }
		
		//activationSource=ActivationSource
		public Assignment getActivationSourceAssignment_5_1_1() { return cActivationSourceAssignment_5_1_1; }
		
		//ActivationSource
		public RuleCall getActivationSourceActivationSourceParserRuleCall_5_1_1_0() { return cActivationSourceActivationSourceParserRuleCall_5_1_1_0; }
		
		//('executionTime' executionTime=ExecutionTime)?
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//'executionTime'
		public Keyword getExecutionTimeKeyword_5_2_0() { return cExecutionTimeKeyword_5_2_0; }
		
		//executionTime=ExecutionTime
		public Assignment getExecutionTimeAssignment_5_2_1() { return cExecutionTimeAssignment_5_2_1; }
		
		//ExecutionTime
		public RuleCall getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0() { return cExecutionTimeExecutionTimeParserRuleCall_5_2_1_0; }
		
		//('scheduler' scheduler=Scheduler)?
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//'scheduler'
		public Keyword getSchedulerKeyword_5_3_0() { return cSchedulerKeyword_5_3_0; }
		
		//scheduler=Scheduler
		public Assignment getSchedulerAssignment_5_3_1() { return cSchedulerAssignment_5_3_1; }
		
		//Scheduler
		public RuleCall getSchedulerSchedulerParserRuleCall_5_3_1_0() { return cSchedulerSchedulerParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AbstractInputNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractInputNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRegisterInputNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTriggerInputNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractInputNode:
		//	RegisterInputNode | TriggerInputNode;
		@Override public ParserRule getRule() { return rule; }
		
		//RegisterInputNode | TriggerInputNode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RegisterInputNode
		public RuleCall getRegisterInputNodeParserRuleCall_0() { return cRegisterInputNodeParserRuleCall_0; }
		
		//TriggerInputNode
		public RuleCall getTriggerInputNodeParserRuleCall_1() { return cTriggerInputNodeParserRuleCall_1; }
	}
	public class RegisterInputNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.RegisterInputNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRegisterInputNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRegisterInputNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//RegisterInputNode:
		//	{RegisterInputNode}
		//	'RegisterInputNode' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{RegisterInputNode} 'RegisterInputNode' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//{RegisterInputNode}
		public Action getRegisterInputNodeAction_0() { return cRegisterInputNodeAction_0; }
		
		//'RegisterInputNode'
		public Keyword getRegisterInputNodeKeyword_1() { return cRegisterInputNodeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class TriggerInputNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.TriggerInputNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTriggerInputNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTriggerInputNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TriggerInputNode:
		//	{TriggerInputNode}
		//	'TriggerInputNode' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{TriggerInputNode} 'TriggerInputNode' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//{TriggerInputNode}
		public Action getTriggerInputNodeAction_0() { return cTriggerInputNodeAction_0; }
		
		//'TriggerInputNode'
		public Keyword getTriggerInputNodeKeyword_1() { return cTriggerInputNodeKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ActivationSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.ActivationSource");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSporadicParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTriggeredParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPeriodicTimerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ActivationSource:
		//	Sporadic | DataTriggered | PeriodicTimer;
		@Override public ParserRule getRule() { return rule; }
		
		//Sporadic | DataTriggered | PeriodicTimer
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Sporadic
		public RuleCall getSporadicParserRuleCall_0() { return cSporadicParserRuleCall_0; }
		
		//DataTriggered
		public RuleCall getDataTriggeredParserRuleCall_1() { return cDataTriggeredParserRuleCall_1; }
		
		//PeriodicTimer
		public RuleCall getPeriodicTimerParserRuleCall_2() { return cPeriodicTimerParserRuleCall_2; }
	}
	public class SporadicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.Sporadic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSporadicAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSporadicKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cMinActFreqKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cMinActFreqAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cMinActFreqEDoubleParserRuleCall_3_0_1_0 = (RuleCall)cMinActFreqAssignment_3_0_1.eContents().get(0);
		private final Keyword cHzKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cMaxActFreqKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cMaxActFreqAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cMaxActFreqEDoubleParserRuleCall_3_1_1_0 = (RuleCall)cMaxActFreqAssignment_3_1_1.eContents().get(0);
		private final Keyword cHzKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Sporadic:
		//	{Sporadic}
		//	'Sporadic'
		//	'{' (('minActFreq' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' maxActFreq=EDouble 'Hz' ';'?)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Sporadic} 'Sporadic' '{' (('minActFreq' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' maxActFreq=EDouble 'Hz' ';'?)?)
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Sporadic}
		public Action getSporadicAction_0() { return cSporadicAction_0; }
		
		//'Sporadic'
		public Keyword getSporadicKeyword_1() { return cSporadicKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('minActFreq' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' maxActFreq=EDouble 'Hz' ';'?)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('minActFreq' minActFreq=EDouble 'Hz' ';'?)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'minActFreq'
		public Keyword getMinActFreqKeyword_3_0_0() { return cMinActFreqKeyword_3_0_0; }
		
		//minActFreq=EDouble
		public Assignment getMinActFreqAssignment_3_0_1() { return cMinActFreqAssignment_3_0_1; }
		
		//EDouble
		public RuleCall getMinActFreqEDoubleParserRuleCall_3_0_1_0() { return cMinActFreqEDoubleParserRuleCall_3_0_1_0; }
		
		//'Hz'
		public Keyword getHzKeyword_3_0_2() { return cHzKeyword_3_0_2; }
		
		//';'?
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//('maxActFreq' maxActFreq=EDouble 'Hz' ';'?)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'maxActFreq'
		public Keyword getMaxActFreqKeyword_3_1_0() { return cMaxActFreqKeyword_3_1_0; }
		
		//maxActFreq=EDouble
		public Assignment getMaxActFreqAssignment_3_1_1() { return cMaxActFreqAssignment_3_1_1; }
		
		//EDouble
		public RuleCall getMaxActFreqEDoubleParserRuleCall_3_1_1_0() { return cMaxActFreqEDoubleParserRuleCall_3_1_1_0; }
		
		//'Hz'
		public Keyword getHzKeyword_3_1_2() { return cHzKeyword_3_1_2; }
		
		//';'?
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DataTriggeredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.DataTriggered");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataTriggeredKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTriggerRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTriggerRefTriggerInputNodeCrossReference_1_0 = (CrossReference)cTriggerRefAssignment_1.eContents().get(0);
		private final RuleCall cTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1 = (RuleCall)cTriggerRefTriggerInputNodeCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPrescaleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPrescaleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPrescaleEIntParserRuleCall_4_0 = (RuleCall)cPrescaleAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DataTriggered:
		//	'DataTriggered' triggerRef=[TriggerInputNode|FQN]
		//	'{'
		//	'prescale' prescale=EInt ';'?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DataTriggered' triggerRef=[TriggerInputNode|FQN] '{' 'prescale' prescale=EInt ';'? '}'
		public Group getGroup() { return cGroup; }
		
		//'DataTriggered'
		public Keyword getDataTriggeredKeyword_0() { return cDataTriggeredKeyword_0; }
		
		//triggerRef=[TriggerInputNode|FQN]
		public Assignment getTriggerRefAssignment_1() { return cTriggerRefAssignment_1; }
		
		//[TriggerInputNode|FQN]
		public CrossReference getTriggerRefTriggerInputNodeCrossReference_1_0() { return cTriggerRefTriggerInputNodeCrossReference_1_0; }
		
		//FQN
		public RuleCall getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1() { return cTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'prescale'
		public Keyword getPrescaleKeyword_3() { return cPrescaleKeyword_3; }
		
		//prescale=EInt
		public Assignment getPrescaleAssignment_4() { return cPrescaleAssignment_4; }
		
		//EInt
		public RuleCall getPrescaleEIntParserRuleCall_4_0() { return cPrescaleEIntParserRuleCall_4_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PeriodicTimerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.PeriodicTimer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPeriodicTimerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPeriodicActFreqKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPeriodicActFreqAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPeriodicActFreqEDoubleParserRuleCall_3_0 = (RuleCall)cPeriodicActFreqAssignment_3.eContents().get(0);
		private final Keyword cHzKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PeriodicTimer:
		//	'PeriodicTimer'
		//	'{'
		//	'periodicActFreq' periodicActFreq=EDouble 'Hz' ';'?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'PeriodicTimer' '{' 'periodicActFreq' periodicActFreq=EDouble 'Hz' ';'? '}'
		public Group getGroup() { return cGroup; }
		
		//'PeriodicTimer'
		public Keyword getPeriodicTimerKeyword_0() { return cPeriodicTimerKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'periodicActFreq'
		public Keyword getPeriodicActFreqKeyword_2() { return cPeriodicActFreqKeyword_2; }
		
		//periodicActFreq=EDouble
		public Assignment getPeriodicActFreqAssignment_3() { return cPeriodicActFreqAssignment_3; }
		
		//EDouble
		public RuleCall getPeriodicActFreqEDoubleParserRuleCall_3_0() { return cPeriodicActFreqEDoubleParserRuleCall_3_0; }
		
		//'Hz'
		public Keyword getHzKeyword_4() { return cHzKeyword_4; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SchedulerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.Scheduler");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSchedulerAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cTypeKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cTypeAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cTypeSchedulerTypeEnumRuleCall_2_0_1_0 = (RuleCall)cTypeAssignment_2_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_2 = (Keyword)cGroup_2_0.eContents().get(2);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cPriorityKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cPriorityAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cPriorityEIntParserRuleCall_2_1_1_0 = (RuleCall)cPriorityAssignment_2_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_2 = (Keyword)cGroup_2_1.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Scheduler:
		//	{Scheduler}
		//	//	'Scheduler'
		//	'{' (('type' type=SchedulerType ';'?)? & ('priority' priority=EInt ';'?)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Scheduler} //	'Scheduler'
		//'{' (('type' type=SchedulerType ';'?)? & ('priority' priority=EInt ';'?)?) '}'
		public Group getGroup() { return cGroup; }
		
		//{Scheduler}
		public Action getSchedulerAction_0() { return cSchedulerAction_0; }
		
		////	'Scheduler'
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('type' type=SchedulerType ';'?)? & ('priority' priority=EInt ';'?)?
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//('type' type=SchedulerType ';'?)?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'type'
		public Keyword getTypeKeyword_2_0_0() { return cTypeKeyword_2_0_0; }
		
		//type=SchedulerType
		public Assignment getTypeAssignment_2_0_1() { return cTypeAssignment_2_0_1; }
		
		//SchedulerType
		public RuleCall getTypeSchedulerTypeEnumRuleCall_2_0_1_0() { return cTypeSchedulerTypeEnumRuleCall_2_0_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2_0_2() { return cSemicolonKeyword_2_0_2; }
		
		//('priority' priority=EInt ';'?)?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'priority'
		public Keyword getPriorityKeyword_2_1_0() { return cPriorityKeyword_2_1_0; }
		
		//priority=EInt
		public Assignment getPriorityAssignment_2_1_1() { return cPriorityAssignment_2_1_1; }
		
		//EInt
		public RuleCall getPriorityEIntParserRuleCall_2_1_1_0() { return cPriorityEIntParserRuleCall_2_1_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2_1_2() { return cSemicolonKeyword_2_1_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class CPUCoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.CPUCore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCPUCoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cCoreNumberKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCoreNumberAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCoreNumberEIntParserRuleCall_4_0 = (RuleCall)cCoreNumberAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//CPUCore:
		//	'CPUCore' name=ID
		//	'{'
		//	'coreNumber' coreNumber=EInt ';'?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CPUCore' name=ID '{' 'coreNumber' coreNumber=EInt ';'? '}'
		public Group getGroup() { return cGroup; }
		
		//'CPUCore'
		public Keyword getCPUCoreKeyword_0() { return cCPUCoreKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'coreNumber'
		public Keyword getCoreNumberKeyword_3() { return cCoreNumberKeyword_3; }
		
		//coreNumber=EInt
		public Assignment getCoreNumberAssignment_4() { return cCoreNumberAssignment_4; }
		
		//EInt
		public RuleCall getCoreNumberEIntParserRuleCall_4_0() { return cCoreNumberEIntParserRuleCall_4_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ExecutionTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.ExecutionTime");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cMinTimeKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cMinTimeAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cMinTimeTimeValueParserRuleCall_1_0_1_0 = (RuleCall)cMinTimeAssignment_1_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Group cGroup_1_1 = (Group)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cMaxTimeKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cMaxTimeAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cMaxTimeTimeValueParserRuleCall_1_1_1_0 = (RuleCall)cMaxTimeAssignment_1_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ExecutionTime: //	'ExecutionTime'
		//	'{' ('minTime' minTime=TimeValue ';'? & 'maxTime' maxTime=TimeValue ';'?) '}';
		@Override public ParserRule getRule() { return rule; }
		
		////	'ExecutionTime'
		//'{' ('minTime' minTime=TimeValue ';'? & 'maxTime' maxTime=TimeValue ';'?) '}'
		public Group getGroup() { return cGroup; }
		
		////	'ExecutionTime'
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'minTime' minTime=TimeValue ';'? & 'maxTime' maxTime=TimeValue ';'?
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }
		
		//'minTime' minTime=TimeValue ';'?
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'minTime'
		public Keyword getMinTimeKeyword_1_0_0() { return cMinTimeKeyword_1_0_0; }
		
		//minTime=TimeValue
		public Assignment getMinTimeAssignment_1_0_1() { return cMinTimeAssignment_1_0_1; }
		
		//TimeValue
		public RuleCall getMinTimeTimeValueParserRuleCall_1_0_1_0() { return cMinTimeTimeValueParserRuleCall_1_0_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_1_0_2() { return cSemicolonKeyword_1_0_2; }
		
		//'maxTime' maxTime=TimeValue ';'?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'maxTime'
		public Keyword getMaxTimeKeyword_1_1_0() { return cMaxTimeKeyword_1_1_0; }
		
		//maxTime=TimeValue
		public Assignment getMaxTimeAssignment_1_1_1() { return cMaxTimeAssignment_1_1_1; }
		
		//TimeValue
		public RuleCall getMaxTimeTimeValueParserRuleCall_1_1_1_0() { return cMaxTimeTimeValueParserRuleCall_1_1_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_1_1_2() { return cSemicolonKeyword_1_1_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class TimeValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.TimeValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueEIntParserRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnitTimeUnitEnumRuleCall_1_0 = (RuleCall)cUnitAssignment_1.eContents().get(0);
		
		//TimeValue:
		//	value=EInt unit=TimeUnit;
		@Override public ParserRule getRule() { return rule; }
		
		//value=EInt unit=TimeUnit
		public Group getGroup() { return cGroup; }
		
		//value=EInt
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_0_0() { return cValueEIntParserRuleCall_0_0; }
		
		//unit=TimeUnit
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }
		
		//TimeUnit
		public RuleCall getUnitTimeUnitEnumRuleCall_1_0() { return cUnitTimeUnitEnumRuleCall_1_0; }
	}
	
	public class SchedulerTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.SchedulerType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDEFAULTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDEFAULTDEFAULTKeyword_0_0 = (Keyword)cDEFAULTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFIFOEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFIFOFIFOKeyword_1_0 = (Keyword)cFIFOEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRREnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRRRRKeyword_2_0 = (Keyword)cRREnumLiteralDeclaration_2.eContents().get(0);
		
		//enum SchedulerType:
		//	DEFAULT | FIFO | RR;
		public EnumRule getRule() { return rule; }
		
		//DEFAULT | FIFO | RR
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DEFAULT
		public EnumLiteralDeclaration getDEFAULTEnumLiteralDeclaration_0() { return cDEFAULTEnumLiteralDeclaration_0; }
		
		//'DEFAULT'
		public Keyword getDEFAULTDEFAULTKeyword_0_0() { return cDEFAULTDEFAULTKeyword_0_0; }
		
		//FIFO
		public EnumLiteralDeclaration getFIFOEnumLiteralDeclaration_1() { return cFIFOEnumLiteralDeclaration_1; }
		
		//'FIFO'
		public Keyword getFIFOFIFOKeyword_1_0() { return cFIFOFIFOKeyword_1_0; }
		
		//RR
		public EnumLiteralDeclaration getRREnumLiteralDeclaration_2() { return cRREnumLiteralDeclaration_2; }
		
		//'RR'
		public Keyword getRRRRKeyword_2_0() { return cRRRRKeyword_2_0; }
	}
	public class TimeUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.activityArchitecture.ActivityArchitecture.TimeUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSECEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSECSecKeyword_0_0 = (Keyword)cSECEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMSECEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMSECMsKeyword_1_0 = (Keyword)cMSECEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUSECEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUSECUsKeyword_2_0 = (Keyword)cUSECEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TimeUnit:
		//	SEC='sec' | MSEC='ms' | USEC='us';
		public EnumRule getRule() { return rule; }
		
		//SEC='sec' | MSEC='ms' | USEC='us'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SEC='sec'
		public EnumLiteralDeclaration getSECEnumLiteralDeclaration_0() { return cSECEnumLiteralDeclaration_0; }
		
		//'sec'
		public Keyword getSECSecKeyword_0_0() { return cSECSecKeyword_0_0; }
		
		//MSEC='ms'
		public EnumLiteralDeclaration getMSECEnumLiteralDeclaration_1() { return cMSECEnumLiteralDeclaration_1; }
		
		//'ms'
		public Keyword getMSECMsKeyword_1_0() { return cMSECMsKeyword_1_0; }
		
		//USEC='us'
		public EnumLiteralDeclaration getUSECEnumLiteralDeclaration_2() { return cUSECEnumLiteralDeclaration_2; }
		
		//'us'
		public Keyword getUSECUsKeyword_2_0() { return cUSECUsKeyword_2_0; }
	}
	
	private final ActivityArchitectureModelElements pActivityArchitectureModel;
	private final EDoubleElements pEDouble;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	private final FQNElements pFQN;
	private final AbstractActivityArchitectureElementElements pAbstractActivityArchitectureElement;
	private final DataFlowElements pDataFlow;
	private final AbstractSourceNodeElements pAbstractSourceNode;
	private final InputHandlerNodeElements pInputHandlerNode;
	private final HandlerTriggerInputNodeElements pHandlerTriggerInputNode;
	private final ActivityNodeElements pActivityNode;
	private final AbstractInputNodeElements pAbstractInputNode;
	private final RegisterInputNodeElements pRegisterInputNode;
	private final TriggerInputNodeElements pTriggerInputNode;
	private final ActivationSourceElements pActivationSource;
	private final SporadicElements pSporadic;
	private final DataTriggeredElements pDataTriggered;
	private final PeriodicTimerElements pPeriodicTimer;
	private final SchedulerElements pScheduler;
	private final SchedulerTypeElements eSchedulerType;
	private final CPUCoreElements pCPUCore;
	private final ExecutionTimeElements pExecutionTime;
	private final TimeValueElements pTimeValue;
	private final TimeUnitElements eTimeUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ActivityArchitectureGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pActivityArchitectureModel = new ActivityArchitectureModelElements();
		this.pEDouble = new EDoubleElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
		this.pFQN = new FQNElements();
		this.pAbstractActivityArchitectureElement = new AbstractActivityArchitectureElementElements();
		this.pDataFlow = new DataFlowElements();
		this.pAbstractSourceNode = new AbstractSourceNodeElements();
		this.pInputHandlerNode = new InputHandlerNodeElements();
		this.pHandlerTriggerInputNode = new HandlerTriggerInputNodeElements();
		this.pActivityNode = new ActivityNodeElements();
		this.pAbstractInputNode = new AbstractInputNodeElements();
		this.pRegisterInputNode = new RegisterInputNodeElements();
		this.pTriggerInputNode = new TriggerInputNodeElements();
		this.pActivationSource = new ActivationSourceElements();
		this.pSporadic = new SporadicElements();
		this.pDataTriggered = new DataTriggeredElements();
		this.pPeriodicTimer = new PeriodicTimerElements();
		this.pScheduler = new SchedulerElements();
		this.eSchedulerType = new SchedulerTypeElements();
		this.pCPUCore = new CPUCoreElements();
		this.pExecutionTime = new ExecutionTimeElements();
		this.pTimeValue = new TimeValueElements();
		this.eTimeUnit = new TimeUnitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.activityArchitecture.ActivityArchitecture".equals(grammar.getName())) {
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

	
	//ActivityArchitectureModel:
	//	{ActivityArchitectureModel}
	//	'ActivityArchitectureModel' name=ID
	//	'{'
	//	elements+=AbstractActivityArchitectureElement*
	//	'}';
	public ActivityArchitectureModelElements getActivityArchitectureModelAccess() {
		return pActivityArchitectureModel;
	}
	
	public ParserRule getActivityArchitectureModelRule() {
		return getActivityArchitectureModelAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//AbstractActivityArchitectureElement:
	//	CPUCore | AbstractSourceNode | DataFlow;
	public AbstractActivityArchitectureElementElements getAbstractActivityArchitectureElementAccess() {
		return pAbstractActivityArchitectureElement;
	}
	
	public ParserRule getAbstractActivityArchitectureElementRule() {
		return getAbstractActivityArchitectureElementAccess().getRule();
	}
	
	//DataFlow:
	//	'DataFlow'
	//	'{'
	//	'source' source=[AbstractSourceNode|FQN]
	//	'destination' destination=[AbstractInputNode|FQN]
	//	'}';
	public DataFlowElements getDataFlowAccess() {
		return pDataFlow;
	}
	
	public ParserRule getDataFlowRule() {
		return getDataFlowAccess().getRule();
	}
	
	//AbstractSourceNode:
	//	ActivityNode | InputHandlerNode;
	public AbstractSourceNodeElements getAbstractSourceNodeAccess() {
		return pAbstractSourceNode;
	}
	
	public ParserRule getAbstractSourceNodeRule() {
		return getAbstractSourceNodeAccess().getRule();
	}
	
	//InputHandlerNode:
	//	{InputHandlerNode}
	//	'InputHandlerNode' name=ID
	//	'{' ('input' inputNode=HandlerTriggerInputNode)? ('prescale' prescale=EInt)?
	//	'}';
	public InputHandlerNodeElements getInputHandlerNodeAccess() {
		return pInputHandlerNode;
	}
	
	public ParserRule getInputHandlerNodeRule() {
		return getInputHandlerNodeAccess().getRule();
	}
	
	//HandlerTriggerInputNode TriggerInputNode:
	//	{TriggerInputNode}
	//	'TriggerInputNode' name=ID ';'?;
	public HandlerTriggerInputNodeElements getHandlerTriggerInputNodeAccess() {
		return pHandlerTriggerInputNode;
	}
	
	public ParserRule getHandlerTriggerInputNodeRule() {
		return getHandlerTriggerInputNodeAccess().getRule();
	}
	
	//ActivityNode:
	//	{ActivityNode}
	//	'ActivityNode' name=ID
	//	'{' ('inputs' '{' inputs+=AbstractInputNode* '}')? (('cpuAffinity' affinity=[CPUCore|FQN] ';'?)? & ('activationSource'
	//	activationSource=ActivationSource)? & ('executionTime' executionTime=ExecutionTime)? & ('scheduler'
	//	scheduler=Scheduler)?)
	//	'}';
	public ActivityNodeElements getActivityNodeAccess() {
		return pActivityNode;
	}
	
	public ParserRule getActivityNodeRule() {
		return getActivityNodeAccess().getRule();
	}
	
	//AbstractInputNode:
	//	RegisterInputNode | TriggerInputNode;
	public AbstractInputNodeElements getAbstractInputNodeAccess() {
		return pAbstractInputNode;
	}
	
	public ParserRule getAbstractInputNodeRule() {
		return getAbstractInputNodeAccess().getRule();
	}
	
	//RegisterInputNode:
	//	{RegisterInputNode}
	//	'RegisterInputNode' name=ID ';'?;
	public RegisterInputNodeElements getRegisterInputNodeAccess() {
		return pRegisterInputNode;
	}
	
	public ParserRule getRegisterInputNodeRule() {
		return getRegisterInputNodeAccess().getRule();
	}
	
	//TriggerInputNode:
	//	{TriggerInputNode}
	//	'TriggerInputNode' name=ID ';'?;
	public TriggerInputNodeElements getTriggerInputNodeAccess() {
		return pTriggerInputNode;
	}
	
	public ParserRule getTriggerInputNodeRule() {
		return getTriggerInputNodeAccess().getRule();
	}
	
	//ActivationSource:
	//	Sporadic | DataTriggered | PeriodicTimer;
	public ActivationSourceElements getActivationSourceAccess() {
		return pActivationSource;
	}
	
	public ParserRule getActivationSourceRule() {
		return getActivationSourceAccess().getRule();
	}
	
	//Sporadic:
	//	{Sporadic}
	//	'Sporadic'
	//	'{' (('minActFreq' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' maxActFreq=EDouble 'Hz' ';'?)?)
	//	'}';
	public SporadicElements getSporadicAccess() {
		return pSporadic;
	}
	
	public ParserRule getSporadicRule() {
		return getSporadicAccess().getRule();
	}
	
	//DataTriggered:
	//	'DataTriggered' triggerRef=[TriggerInputNode|FQN]
	//	'{'
	//	'prescale' prescale=EInt ';'?
	//	'}';
	public DataTriggeredElements getDataTriggeredAccess() {
		return pDataTriggered;
	}
	
	public ParserRule getDataTriggeredRule() {
		return getDataTriggeredAccess().getRule();
	}
	
	//PeriodicTimer:
	//	'PeriodicTimer'
	//	'{'
	//	'periodicActFreq' periodicActFreq=EDouble 'Hz' ';'?
	//	'}';
	public PeriodicTimerElements getPeriodicTimerAccess() {
		return pPeriodicTimer;
	}
	
	public ParserRule getPeriodicTimerRule() {
		return getPeriodicTimerAccess().getRule();
	}
	
	//Scheduler:
	//	{Scheduler}
	//	//	'Scheduler'
	//	'{' (('type' type=SchedulerType ';'?)? & ('priority' priority=EInt ';'?)?)
	//	'}';
	public SchedulerElements getSchedulerAccess() {
		return pScheduler;
	}
	
	public ParserRule getSchedulerRule() {
		return getSchedulerAccess().getRule();
	}
	
	//enum SchedulerType:
	//	DEFAULT | FIFO | RR;
	public SchedulerTypeElements getSchedulerTypeAccess() {
		return eSchedulerType;
	}
	
	public EnumRule getSchedulerTypeRule() {
		return getSchedulerTypeAccess().getRule();
	}
	
	//CPUCore:
	//	'CPUCore' name=ID
	//	'{'
	//	'coreNumber' coreNumber=EInt ';'?
	//	'}';
	public CPUCoreElements getCPUCoreAccess() {
		return pCPUCore;
	}
	
	public ParserRule getCPUCoreRule() {
		return getCPUCoreAccess().getRule();
	}
	
	//ExecutionTime: //	'ExecutionTime'
	//	'{' ('minTime' minTime=TimeValue ';'? & 'maxTime' maxTime=TimeValue ';'?) '}';
	public ExecutionTimeElements getExecutionTimeAccess() {
		return pExecutionTime;
	}
	
	public ParserRule getExecutionTimeRule() {
		return getExecutionTimeAccess().getRule();
	}
	
	//TimeValue:
	//	value=EInt unit=TimeUnit;
	public TimeValueElements getTimeValueAccess() {
		return pTimeValue;
	}
	
	public ParserRule getTimeValueRule() {
		return getTimeValueAccess().getRule();
	}
	
	//enum TimeUnit:
	//	SEC='sec' | MSEC='ms' | USEC='us';
	public TimeUnitElements getTimeUnitAccess() {
		return eTimeUnit;
	}
	
	public EnumRule getTimeUnitRule() {
		return getTimeUnitAccess().getRule();
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
