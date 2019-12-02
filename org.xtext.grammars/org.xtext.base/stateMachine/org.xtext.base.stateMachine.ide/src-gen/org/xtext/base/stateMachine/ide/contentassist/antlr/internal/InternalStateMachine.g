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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.base.stateMachine.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.base.stateMachine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;

}
@parser::members {
	private StateMachineGrammarAccess grammarAccess;

	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine
:
{ before(grammarAccess.getStateMachineRule()); }
	 ruleStateMachine
{ after(grammarAccess.getStateMachineRule()); } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateMachineAccess().getGroup()); }
		(rule__StateMachine__Group__0)
		{ after(grammarAccess.getStateMachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFQN
entryRuleFQN
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNAccess().getGroup()); }
		(rule__FQN__Group__0)
		{ after(grammarAccess.getFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractMachineElement
entryRuleAbstractMachineElement
:
{ before(grammarAccess.getAbstractMachineElementRule()); }
	 ruleAbstractMachineElement
{ after(grammarAccess.getAbstractMachineElementRule()); } 
	 EOF 
;

// Rule AbstractMachineElement
ruleAbstractMachineElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractMachineElementAccess().getAlternatives()); }
		(rule__AbstractMachineElement__Alternatives)
		{ after(grammarAccess.getAbstractMachineElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractStateElement
entryRuleAbstractStateElement
:
{ before(grammarAccess.getAbstractStateElementRule()); }
	 ruleAbstractStateElement
{ after(grammarAccess.getAbstractStateElementRule()); } 
	 EOF 
;

// Rule AbstractStateElement
ruleAbstractStateElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall()); }
		ruleState
		{ after(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateTransition
entryRuleStateTransition
:
{ before(grammarAccess.getStateTransitionRule()); }
	 ruleStateTransition
{ after(grammarAccess.getStateTransitionRule()); } 
	 EOF 
;

// Rule StateTransition
ruleStateTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateTransitionAccess().getGroup()); }
		(rule__StateTransition__Group__0)
		{ after(grammarAccess.getStateTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VisibilityType
ruleVisibilityType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVisibilityTypeAccess().getAlternatives()); }
		(rule__VisibilityType__Alternatives)
		{ after(grammarAccess.getVisibilityTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractMachineElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0()); }
		ruleAbstractStateElement
		{ after(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1()); }
		ruleStateTransition
		{ after(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VisibilityType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0()); }
		('public')
		{ after(grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1()); }
		('private')
		{ after(grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__0__Impl
	rule__StateMachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); }
	'StateMachine'
	{ after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__1__Impl
	rule__StateMachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); }
	(rule__StateMachine__NameAssignment_1)
	{ after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__2__Impl
	rule__StateMachine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__3__Impl
	rule__StateMachine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getElementsAssignment_3()); }
	(rule__StateMachine__ElementsAssignment_3)*
	{ after(grammarAccess.getStateMachineAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getGroup_1()); }
	(rule__FQN__Group_1__0)*
	{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_0()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_1()); }
	(rule__State__NameAssignment_1)
	{ after(grammarAccess.getStateAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getStateAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateTransition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__0__Impl
	rule__StateTransition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0()); }
	(rule__StateTransition__VisibilityAssignment_0)?
	{ after(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__1__Impl
	rule__StateTransition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1()); }
	'StateTransition'
	{ after(grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__2__Impl
	rule__StateTransition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getFromAssignment_2()); }
	(rule__StateTransition__FromAssignment_2)
	{ after(grammarAccess.getStateTransitionAccess().getFromAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__3__Impl
	rule__StateTransition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__4__Impl
	rule__StateTransition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getToAssignment_4()); }
	(rule__StateTransition__ToAssignment_4)
	{ after(grammarAccess.getStateTransitionAccess().getToAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateTransition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0()); }
		ruleAbstractMachineElement
		{ after(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__VisibilityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0()); }
		ruleVisibilityType
		{ after(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__FromAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0()); }
		(
			{ before(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementFQNParserRuleCall_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementFQNParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateTransition__ToAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0()); }
		(
			{ before(grammarAccess.getStateTransitionAccess().getToAbstractStateElementFQNParserRuleCall_4_0_1()); }
			ruleFQN
			{ after(grammarAccess.getStateTransitionAccess().getToAbstractStateElementFQNParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
