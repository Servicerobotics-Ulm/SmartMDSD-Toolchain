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
grammar InternalTaskRealization;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.behavior.taskRealization.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.behavior.taskRealization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;

}

@parser::members {

 	private TaskRealizationGrammarAccess grammarAccess;

    public InternalTaskRealizationParser(TokenStream input, TaskRealizationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TaskRealizationModel";
   	}

   	@Override
   	protected TaskRealizationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTaskRealizationModel
entryRuleTaskRealizationModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRealizationModelRule()); }
	iv_ruleTaskRealizationModel=ruleTaskRealizationModel
	{ $current=$iv_ruleTaskRealizationModel.current; }
	EOF;

// Rule TaskRealizationModel
ruleTaskRealizationModel returns [EObject current=null]
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
					grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0(),
					$current);
			}
		)
		otherlv_1='TaskRealizationModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRealizationModelRule());
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
			newLeafNode(otherlv_3, grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0());
				}
				lv_abstCoordInst_4_0=ruleAbstractCoordinationModuleInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRealizationModelRule());
					}
					add(
						$current,
						"abstCoordInst",
						lv_abstCoordInst_4_0,
						"org.xtext.behavior.taskRealization.TaskRealization.AbstractCoordinationModuleInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0());
				}
				lv_tasks_5_0=ruleTaskRealization
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRealizationModelRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_5_0,
						"org.xtext.behavior.taskRealization.TaskRealization.TaskRealization");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6());
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

// Entry rule entryRuleTaskRealization
entryRuleTaskRealization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRealizationRule()); }
	iv_ruleTaskRealization=ruleTaskRealization
	{ $current=$iv_ruleTaskRealization.current; }
	EOF;

// Rule TaskRealization
ruleTaskRealization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TaskRealization'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAbstractCoordinationModuleInstance
entryRuleAbstractCoordinationModuleInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractCoordinationModuleInstanceRule()); }
	iv_ruleAbstractCoordinationModuleInstance=ruleAbstractCoordinationModuleInstance
	{ $current=$iv_ruleAbstractCoordinationModuleInstance.current; }
	EOF;

// Rule AbstractCoordinationModuleInstance
ruleAbstractCoordinationModuleInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AbstractCoordinationModuleInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractCoordinationModuleInstanceRule());
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
			newLeafNode(otherlv_2, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractCoordinationModuleInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
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
