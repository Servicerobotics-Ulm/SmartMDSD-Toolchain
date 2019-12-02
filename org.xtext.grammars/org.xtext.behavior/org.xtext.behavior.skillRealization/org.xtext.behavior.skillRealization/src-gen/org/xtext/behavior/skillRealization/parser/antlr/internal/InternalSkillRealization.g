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
grammar InternalSkillRealization;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.behavior.skillRealization.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.behavior.skillRealization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

}

@parser::members {

 	private SkillRealizationGrammarAccess grammarAccess;

    public InternalSkillRealizationParser(TokenStream input, SkillRealizationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SkillRealizationModel";
   	}

   	@Override
   	protected SkillRealizationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSkillRealizationModel
entryRuleSkillRealizationModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationModelRule()); }
	iv_ruleSkillRealizationModel=ruleSkillRealizationModel
	{ $current=$iv_ruleSkillRealizationModel.current; }
	EOF;

// Rule SkillRealizationModel
ruleSkillRealizationModel returns [EObject current=null]
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
					grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelAction_0(),
					$current);
			}
		)
		otherlv_1='SkillRealizationModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkillRealizationModelAccess().getModulesCoordinationModuleRealizationParserRuleCall_3_0());
				}
				lv_modules_3_0=ruleCoordinationModuleRealization
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkillRealizationModelRule());
					}
					add(
						$current,
						"modules",
						lv_modules_3_0,
						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationModuleRealization");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationModelAccess().getRightCurlyBracketKeyword_4());
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

// Entry rule entryRuleCoordinationModuleRealization
entryRuleCoordinationModuleRealization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationModuleRealizationRule()); }
	iv_ruleCoordinationModuleRealization=ruleCoordinationModuleRealization
	{ $current=$iv_ruleCoordinationModuleRealization.current; }
	EOF;

// Rule CoordinationModuleRealization
ruleCoordinationModuleRealization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationModuleRealization'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleRealizationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationModuleRealizationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationModuleRealizationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='coordModuleDef'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationModuleRealizationAccess().getCoordModuleDefKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationModuleRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='uses'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinationModuleRealizationAccess().getUsesKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0());
				}
				lv_coordInterfaceInsts_6_0=ruleCoordinationInterfaceInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationModuleRealizationRule());
					}
					add(
						$current,
						"coordInterfaceInsts",
						lv_coordInterfaceInsts_6_0,
						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationInterfaceInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsSkillRealizationParserRuleCall_9_0());
				}
				lv_skills_9_0=ruleSkillRealization
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationModuleRealizationRule());
					}
					add(
						$current,
						"skills",
						lv_skills_9_0,
						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleCoordinationInterfaceInstance
entryRuleCoordinationInterfaceInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationInterfaceInstanceRule()); }
	iv_ruleCoordinationInterfaceInstance=ruleCoordinationInterfaceInstance
	{ $current=$iv_ruleCoordinationInterfaceInstance.current; }
	EOF;

// Rule CoordinationInterfaceInstance
ruleCoordinationInterfaceInstance returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationInterfaceInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='intsName'
		{
			newLeafNode(otherlv_1, grammarAccess.getCoordinationInterfaceInstanceAccess().getIntsNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCoordinationInterfaceInstanceAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationInterfaceInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSkillRealization
entryRuleSkillRealization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationRule()); }
	iv_ruleSkillRealization=ruleSkillRealization
	{ $current=$iv_ruleSkillRealization.current; }
	EOF;

// Rule SkillRealization
ruleSkillRealization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SkillRealization'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='action'
		{
			newLeafNode(otherlv_3, grammarAccess.getSkillRealizationAccess().getActionKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkillRealizationAccess().getActionCoordinationActionBlockParserRuleCall_5_0());
				}
				lv_action_5_0=ruleCoordinationActionBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
					}
					set(
						$current,
						"action",
						lv_action_5_0,
						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationActionBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getSkillRealizationAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleCoordinationActionBlock
entryRuleCoordinationActionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationActionBlockRule()); }
	iv_ruleCoordinationActionBlock=ruleCoordinationActionBlock
	{ $current=$iv_ruleCoordinationActionBlock.current; }
	EOF;

// Rule CoordinationActionBlock
ruleCoordinationActionBlock returns [EObject current=null]
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
					grammarAccess.getCoordinationActionBlockAccess().getCoordinationActionBlockAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationActionBlockAccess().getActionsAbstractCoordinationActionParserRuleCall_1_0());
				}
				lv_actions_1_0=ruleAbstractCoordinationAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationActionBlockRule());
					}
					add(
						$current,
						"actions",
						lv_actions_1_0,
						"org.xtext.behavior.skillRealization.SkillRealization.AbstractCoordinationAction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractCoordinationAction
entryRuleAbstractCoordinationAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractCoordinationActionRule()); }
	iv_ruleAbstractCoordinationAction=ruleAbstractCoordinationAction
	{ $current=$iv_ruleAbstractCoordinationAction.current; }
	EOF;

// Rule AbstractCoordinationAction
ruleAbstractCoordinationAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getAbstractCoordinationActionAccess().getAbstractComponentCoordinationActionParserRuleCall());
	}
	this_AbstractComponentCoordinationAction_0=ruleAbstractComponentCoordinationAction
	{
		$current = $this_AbstractComponentCoordinationAction_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAbstractComponentCoordinationAction
entryRuleAbstractComponentCoordinationAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionRule()); }
	iv_ruleAbstractComponentCoordinationAction=ruleAbstractComponentCoordinationAction
	{ $current=$iv_ruleAbstractComponentCoordinationAction.current; }
	EOF;

// Rule AbstractComponentCoordinationAction
ruleAbstractComponentCoordinationAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionParameterParserRuleCall_0());
		}
		this_ComponentCoordinationActionParameter_0=ruleComponentCoordinationActionParameter
		{
			$current = $this_ComponentCoordinationActionParameter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionActivationParserRuleCall_1());
		}
		this_ComponentCoordinationActionActivation_1=ruleComponentCoordinationActionActivation
		{
			$current = $this_ComponentCoordinationActionActivation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionEventParserRuleCall_2());
		}
		this_ComponentCoordinationActionEvent_2=ruleComponentCoordinationActionEvent
		{
			$current = $this_ComponentCoordinationActionEvent_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponentCoordinationActionParameter
entryRuleComponentCoordinationActionParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentCoordinationActionParameterRule()); }
	iv_ruleComponentCoordinationActionParameter=ruleComponentCoordinationActionParameter
	{ $current=$iv_ruleComponentCoordinationActionParameter.current; }
	EOF;

// Rule ComponentCoordinationActionParameter
ruleComponentCoordinationActionParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tcl-param'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionParameterAccess().getTclParamKeyword_0());
		}
		otherlv_1=':server'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionParameterAccess().getServerKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3=':param'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionParameterAccess().getParamKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=':paramvalue'
			{
				newLeafNode(otherlv_5, grammarAccess.getComponentCoordinationActionParameterAccess().getParamvalueKeyword_5_0());
			}
			(
				(
					lv_value_6_0=RULE_STRING
					{
						newLeafNode(lv_value_6_0, grammarAccess.getComponentCoordinationActionParameterAccess().getValueSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleComponentCoordinationActionActivation
entryRuleComponentCoordinationActionActivation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentCoordinationActionActivationRule()); }
	iv_ruleComponentCoordinationActionActivation=ruleComponentCoordinationActionActivation
	{ $current=$iv_ruleComponentCoordinationActionActivation.current; }
	EOF;

// Rule ComponentCoordinationActionActivation
ruleComponentCoordinationActionActivation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tcl-state'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionActivationAccess().getTclStateKeyword_0());
		}
		otherlv_1=':server'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionActivationAccess().getServerKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentCoordinationActionActivationRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3=':state'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionActivationAccess().getStateKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentCoordinationActionActivationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComponentCoordinationActionEvent
entryRuleComponentCoordinationActionEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentCoordinationActionEventRule()); }
	iv_ruleComponentCoordinationActionEvent=ruleComponentCoordinationActionEvent
	{ $current=$iv_ruleComponentCoordinationActionEvent.current; }
	EOF;

// Rule ComponentCoordinationActionEvent
ruleComponentCoordinationActionEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tcl-activate-event'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionEventAccess().getTclActivateEventKeyword_0());
		}
		otherlv_1=':name'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionEventAccess().getNameKeyword_1());
		}
		otherlv_2=':server'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionEventAccess().getServerKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentCoordinationActionEventRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0());
				}
			)
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
