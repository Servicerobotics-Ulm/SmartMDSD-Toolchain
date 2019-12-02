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
grammar InternalStateMachine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.base.stateMachine.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.base.stateMachine.parser.antlr.internal;

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
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;

}

@parser::members {

 	private StateMachineGrammarAccess grammarAccess;

    public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "StateMachine";
   	}

   	@Override
   	protected StateMachineGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StateMachine'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
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
			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleAbstractMachineElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.xtext.base.stateMachine.StateMachine.AbstractMachineElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4());
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

// Entry rule entryRuleAbstractMachineElement
entryRuleAbstractMachineElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractMachineElementRule()); }
	iv_ruleAbstractMachineElement=ruleAbstractMachineElement
	{ $current=$iv_ruleAbstractMachineElement.current; }
	EOF;

// Rule AbstractMachineElement
ruleAbstractMachineElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0());
		}
		this_AbstractStateElement_0=ruleAbstractStateElement
		{
			$current = $this_AbstractStateElement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1());
		}
		this_StateTransition_1=ruleStateTransition
		{
			$current = $this_StateTransition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAbstractStateElement
entryRuleAbstractStateElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractStateElementRule()); }
	iv_ruleAbstractStateElement=ruleAbstractStateElement
	{ $current=$iv_ruleAbstractStateElement.current; }
	EOF;

// Rule AbstractStateElement
ruleAbstractStateElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall());
	}
	this_State_0=ruleState
	{
		$current = $this_State_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='State'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleStateTransition
entryRuleStateTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateTransitionRule()); }
	iv_ruleStateTransition=ruleStateTransition
	{ $current=$iv_ruleStateTransition.current; }
	EOF;

// Rule StateTransition
ruleStateTransition returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibilityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateTransitionRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.xtext.base.stateMachine.StateMachine.VisibilityType");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='StateTransition'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5());
			}
		)?
	)
;

// Rule VisibilityType
ruleVisibilityType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='public'
			{
				$current = grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='private'
			{
				$current = grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1());
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
