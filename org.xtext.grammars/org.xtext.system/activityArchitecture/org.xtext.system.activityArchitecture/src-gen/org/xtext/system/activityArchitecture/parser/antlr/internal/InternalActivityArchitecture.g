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
grammar InternalActivityArchitecture;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.activityArchitecture.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.activityArchitecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

}

@parser::members {

 	private ActivityArchitectureGrammarAccess grammarAccess;

    public InternalActivityArchitectureParser(TokenStream input, ActivityArchitectureGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ActivityArchitectureModel";
   	}

   	@Override
   	protected ActivityArchitectureGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleActivityArchitectureModel
entryRuleActivityArchitectureModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityArchitectureModelRule()); }
	iv_ruleActivityArchitectureModel=ruleActivityArchitectureModel
	{ $current=$iv_ruleActivityArchitectureModel.current; }
	EOF;

// Rule ActivityArchitectureModel
ruleActivityArchitectureModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0(),
					$current);
			}
		)
		otherlv_1='ActivityArchitectureModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityArchitectureModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0());
				}
				lv_elements_4_0=ruleAbstractActivityArchitectureElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivityArchitectureModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractActivityArchitectureElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleAbstractActivityArchitectureElement
entryRuleAbstractActivityArchitectureElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementRule()); }
	iv_ruleAbstractActivityArchitectureElement=ruleAbstractActivityArchitectureElement
	{ $current=$iv_ruleAbstractActivityArchitectureElement.current; }
	EOF;

// Rule AbstractActivityArchitectureElement
ruleAbstractActivityArchitectureElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0());
		}
		this_CPUCore_0=ruleCPUCore
		{
			$current = $this_CPUCore_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1());
		}
		this_AbstractSourceNode_1=ruleAbstractSourceNode
		{
			$current = $this_AbstractSourceNode_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2());
		}
		this_DataFlow_2=ruleDataFlow
		{
			$current = $this_DataFlow_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataFlow
entryRuleDataFlow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataFlowRule()); }
	iv_ruleDataFlow=ruleDataFlow
	{ $current=$iv_ruleDataFlow.current; }
	EOF;

// Rule DataFlow
ruleDataFlow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataFlow'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataFlowAccess().getDataFlowKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='source'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataFlowAccess().getSourceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataFlowRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='destination'
		{
			newLeafNode(otherlv_4, grammarAccess.getDataFlowAccess().getDestinationKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataFlowRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAbstractSourceNode
entryRuleAbstractSourceNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractSourceNodeRule()); }
	iv_ruleAbstractSourceNode=ruleAbstractSourceNode
	{ $current=$iv_ruleAbstractSourceNode.current; }
	EOF;

// Rule AbstractSourceNode
ruleAbstractSourceNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0());
		}
		this_ActivityNode_0=ruleActivityNode
		{
			$current = $this_ActivityNode_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1());
		}
		this_InputHandlerNode_1=ruleInputHandlerNode
		{
			$current = $this_InputHandlerNode_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInputHandlerNode
entryRuleInputHandlerNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputHandlerNodeRule()); }
	iv_ruleInputHandlerNode=ruleInputHandlerNode
	{ $current=$iv_ruleInputHandlerNode.current; }
	EOF;

// Rule InputHandlerNode
ruleInputHandlerNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0(),
					$current);
			}
		)
		otherlv_1='InputHandlerNode'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='input'
			{
				newLeafNode(otherlv_4, grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0());
					}
					lv_inputNode_5_0=ruleHandlerTriggerInputNode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInputHandlerNodeRule());
						}
						set(
							$current,
							"inputNode",
							lv_inputNode_5_0,
							"org.xtext.system.activityArchitecture.ActivityArchitecture.HandlerTriggerInputNode");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='prescale'
			{
				newLeafNode(otherlv_6, grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0());
					}
					lv_prescale_7_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInputHandlerNodeRule());
						}
						set(
							$current,
							"prescale",
							lv_prescale_7_0,
							"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleHandlerTriggerInputNode
entryRuleHandlerTriggerInputNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHandlerTriggerInputNodeRule()); }
	iv_ruleHandlerTriggerInputNode=ruleHandlerTriggerInputNode
	{ $current=$iv_ruleHandlerTriggerInputNode.current; }
	EOF;

// Rule HandlerTriggerInputNode
ruleHandlerTriggerInputNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0(),
					$current);
			}
		)
		otherlv_1='TriggerInputNode'
		{
			newLeafNode(otherlv_1, grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHandlerTriggerInputNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleActivityNode
entryRuleActivityNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityNodeRule()); }
	iv_ruleActivityNode=ruleActivityNode
	{ $current=$iv_ruleActivityNode.current; }
	EOF;

// Rule ActivityNode
ruleActivityNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActivityNodeAccess().getActivityNodeAction_0(),
					$current);
			}
		)
		otherlv_1='ActivityNode'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='inputs'
			{
				newLeafNode(otherlv_4, grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0());
					}
					lv_inputs_6_0=ruleAbstractInputNode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActivityNodeRule());
						}
						add(
							$current,
							"inputs",
							lv_inputs_6_0,
							"org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractInputNode");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0);
					}
								({true}?=>(otherlv_9='cpuAffinity'
								{
									newLeafNode(otherlv_9, grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getActivityNodeRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									otherlv_11=';'
									{
										newLeafNode(otherlv_11, grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1);
					}
								({true}?=>(otherlv_12='activationSource'
								{
									newLeafNode(otherlv_12, grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0());
										}
										lv_activationSource_13_0=ruleActivationSource
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActivityNodeRule());
											}
											set(
												$current,
												"activationSource",
												lv_activationSource_13_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.ActivationSource");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2);
					}
								({true}?=>(otherlv_14='executionTime'
								{
									newLeafNode(otherlv_14, grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0());
										}
										lv_executionTime_15_0=ruleExecutionTime
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActivityNodeRule());
											}
											set(
												$current,
												"executionTime",
												lv_executionTime_15_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.ExecutionTime");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3);
					}
								({true}?=>(otherlv_16='scheduler'
								{
									newLeafNode(otherlv_16, grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0());
										}
										lv_scheduler_17_0=ruleScheduler
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActivityNodeRule());
											}
											set(
												$current,
												"scheduler",
												lv_scheduler_17_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.Scheduler");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
				}
		)
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAbstractInputNode
entryRuleAbstractInputNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractInputNodeRule()); }
	iv_ruleAbstractInputNode=ruleAbstractInputNode
	{ $current=$iv_ruleAbstractInputNode.current; }
	EOF;

// Rule AbstractInputNode
ruleAbstractInputNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0());
		}
		this_RegisterInputNode_0=ruleRegisterInputNode
		{
			$current = $this_RegisterInputNode_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1());
		}
		this_TriggerInputNode_1=ruleTriggerInputNode
		{
			$current = $this_TriggerInputNode_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRegisterInputNode
entryRuleRegisterInputNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegisterInputNodeRule()); }
	iv_ruleRegisterInputNode=ruleRegisterInputNode
	{ $current=$iv_ruleRegisterInputNode.current; }
	EOF;

// Rule RegisterInputNode
ruleRegisterInputNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0(),
					$current);
			}
		)
		otherlv_1='RegisterInputNode'
		{
			newLeafNode(otherlv_1, grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegisterInputNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleTriggerInputNode
entryRuleTriggerInputNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriggerInputNodeRule()); }
	iv_ruleTriggerInputNode=ruleTriggerInputNode
	{ $current=$iv_ruleTriggerInputNode.current; }
	EOF;

// Rule TriggerInputNode
ruleTriggerInputNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0(),
					$current);
			}
		)
		otherlv_1='TriggerInputNode'
		{
			newLeafNode(otherlv_1, grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerInputNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleActivationSource
entryRuleActivationSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivationSourceRule()); }
	iv_ruleActivationSource=ruleActivationSource
	{ $current=$iv_ruleActivationSource.current; }
	EOF;

// Rule ActivationSource
ruleActivationSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0());
		}
		this_Sporadic_0=ruleSporadic
		{
			$current = $this_Sporadic_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1());
		}
		this_DataTriggered_1=ruleDataTriggered
		{
			$current = $this_DataTriggered_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2());
		}
		this_PeriodicTimer_2=rulePeriodicTimer
		{
			$current = $this_PeriodicTimer_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSporadic
entryRuleSporadic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSporadicRule()); }
	iv_ruleSporadic=ruleSporadic
	{ $current=$iv_ruleSporadic.current; }
	EOF;

// Rule Sporadic
ruleSporadic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSporadicAccess().getSporadicAction_0(),
					$current);
			}
		)
		otherlv_1='Sporadic'
		{
			newLeafNode(otherlv_1, grammarAccess.getSporadicAccess().getSporadicKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='minActFreq'
								{
									newLeafNode(otherlv_4, grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0());
										}
										lv_minActFreq_5_0=ruleEDouble
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getSporadicRule());
											}
											set(
												$current,
												"minActFreq",
												lv_minActFreq_5_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_6='Hz'
								{
									newLeafNode(otherlv_6, grammarAccess.getSporadicAccess().getHzKeyword_3_0_2());
								}
								(
									otherlv_7=';'
									{
										newLeafNode(otherlv_7, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='maxActFreq'
								{
									newLeafNode(otherlv_8, grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0());
										}
										lv_maxActFreq_9_0=ruleEDouble
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getSporadicRule());
											}
											set(
												$current,
												"maxActFreq",
												lv_maxActFreq_9_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_10='Hz'
								{
									newLeafNode(otherlv_10, grammarAccess.getSporadicAccess().getHzKeyword_3_1_2());
								}
								(
									otherlv_11=';'
									{
										newLeafNode(otherlv_11, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDataTriggered
entryRuleDataTriggered returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTriggeredRule()); }
	iv_ruleDataTriggered=ruleDataTriggered
	{ $current=$iv_ruleDataTriggered.current; }
	EOF;

// Rule DataTriggered
ruleDataTriggered returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataTriggered'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTriggeredRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='prescale'
		{
			newLeafNode(otherlv_3, grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0());
				}
				lv_prescale_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataTriggeredRule());
					}
					set(
						$current,
						"prescale",
						lv_prescale_4_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5());
			}
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRulePeriodicTimer
entryRulePeriodicTimer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPeriodicTimerRule()); }
	iv_rulePeriodicTimer=rulePeriodicTimer
	{ $current=$iv_rulePeriodicTimer.current; }
	EOF;

// Rule PeriodicTimer
rulePeriodicTimer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PeriodicTimer'
		{
			newLeafNode(otherlv_0, grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='periodicActFreq'
		{
			newLeafNode(otherlv_2, grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0());
				}
				lv_periodicActFreq_3_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPeriodicTimerRule());
					}
					set(
						$current,
						"periodicActFreq",
						lv_periodicActFreq_3_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='Hz'
		{
			newLeafNode(otherlv_4, grammarAccess.getPeriodicTimerAccess().getHzKeyword_4());
		}
		(
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5());
			}
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleScheduler
entryRuleScheduler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSchedulerRule()); }
	iv_ruleScheduler=ruleScheduler
	{ $current=$iv_ruleScheduler.current; }
	EOF;

// Rule Scheduler
ruleScheduler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSchedulerAccess().getSchedulerAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>(otherlv_3='type'
								{
									newLeafNode(otherlv_3, grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0());
										}
										lv_type_4_0=ruleSchedulerType
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getSchedulerRule());
											}
											set(
												$current,
												"type",
												lv_type_4_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.SchedulerType");
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									otherlv_5=';'
									{
										newLeafNode(otherlv_5, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>(otherlv_6='priority'
								{
									newLeafNode(otherlv_6, grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0());
										}
										lv_priority_7_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getSchedulerRule());
											}
											set(
												$current,
												"priority",
												lv_priority_7_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									otherlv_8=';'
									{
										newLeafNode(otherlv_8, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
				}
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleCPUCore
entryRuleCPUCore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCPUCoreRule()); }
	iv_ruleCPUCore=ruleCPUCore
	{ $current=$iv_ruleCPUCore.current; }
	EOF;

// Rule CPUCore
ruleCPUCore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CPUCore'
		{
			newLeafNode(otherlv_0, grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCPUCoreRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='coreNumber'
		{
			newLeafNode(otherlv_3, grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0());
				}
				lv_coreNumber_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCPUCoreRule());
					}
					set(
						$current,
						"coreNumber",
						lv_coreNumber_4_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5());
			}
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleExecutionTime
entryRuleExecutionTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExecutionTimeRule()); }
	iv_ruleExecutionTime=ruleExecutionTime
	{ $current=$iv_ruleExecutionTime.current; }
	EOF;

// Rule ExecutionTime
ruleExecutionTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0);
					}
								({true}?=>(otherlv_2='minTime'
								{
									newLeafNode(otherlv_2, grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0());
										}
										lv_minTime_3_0=ruleTimeValue
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getExecutionTimeRule());
											}
											set(
												$current,
												"minTime",
												lv_minTime_3_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeValue");
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									otherlv_4=';'
									{
										newLeafNode(otherlv_4, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1);
					}
								({true}?=>(otherlv_5='maxTime'
								{
									newLeafNode(otherlv_5, grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0());
										}
										lv_maxTime_6_0=ruleTimeValue
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getExecutionTimeRule());
											}
											set(
												$current,
												"maxTime",
												lv_maxTime_6_0,
												"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeValue");
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									otherlv_7=';'
									{
										newLeafNode(otherlv_7, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
				}
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleTimeValue
entryRuleTimeValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeValueRule()); }
	iv_ruleTimeValue=ruleTimeValue
	{ $current=$iv_ruleTimeValue.current; }
	EOF;

// Rule TimeValue
ruleTimeValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0());
				}
				lv_value_0_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTimeValueRule());
					}
					set(
						$current,
						"value",
						lv_value_0_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0());
				}
				lv_unit_1_0=ruleTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTimeValueRule());
					}
					set(
						$current,
						"unit",
						lv_unit_1_0,
						"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule SchedulerType
ruleSchedulerType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DEFAULT'
			{
				$current = grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='FIFO'
			{
				$current = grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RR'
			{
				$current = grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TimeUnit
ruleTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='sec'
			{
				$current = grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ms'
			{
				$current = grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='us'
			{
				$current = grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
