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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.behavior.taskRealization.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.behavior.taskRealization.ide.contentassist.antlr.internal;

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
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;

}
@parser::members {
	private TaskRealizationGrammarAccess grammarAccess;

	public void setGrammarAccess(TaskRealizationGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTaskRealizationModel
entryRuleTaskRealizationModel
:
{ before(grammarAccess.getTaskRealizationModelRule()); }
	 ruleTaskRealizationModel
{ after(grammarAccess.getTaskRealizationModelRule()); } 
	 EOF 
;

// Rule TaskRealizationModel
ruleTaskRealizationModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskRealizationModelAccess().getGroup()); }
		(rule__TaskRealizationModel__Group__0)
		{ after(grammarAccess.getTaskRealizationModelAccess().getGroup()); }
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

// Entry rule entryRuleTaskRealization
entryRuleTaskRealization
:
{ before(grammarAccess.getTaskRealizationRule()); }
	 ruleTaskRealization
{ after(grammarAccess.getTaskRealizationRule()); } 
	 EOF 
;

// Rule TaskRealization
ruleTaskRealization 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskRealizationAccess().getGroup()); }
		(rule__TaskRealization__Group__0)
		{ after(grammarAccess.getTaskRealizationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractCoordinationModuleInstance
entryRuleAbstractCoordinationModuleInstance
:
{ before(grammarAccess.getAbstractCoordinationModuleInstanceRule()); }
	 ruleAbstractCoordinationModuleInstance
{ after(grammarAccess.getAbstractCoordinationModuleInstanceRule()); } 
	 EOF 
;

// Rule AbstractCoordinationModuleInstance
ruleAbstractCoordinationModuleInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getGroup()); }
		(rule__AbstractCoordinationModuleInstance__Group__0)
		{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__0__Impl
	rule__TaskRealizationModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0()); }
	()
	{ after(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__1__Impl
	rule__TaskRealizationModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1()); }
	'TaskRealizationModel'
	{ after(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__2__Impl
	rule__TaskRealizationModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getNameAssignment_2()); }
	(rule__TaskRealizationModel__NameAssignment_2)
	{ after(grammarAccess.getTaskRealizationModelAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__3__Impl
	rule__TaskRealizationModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__4__Impl
	rule__TaskRealizationModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAssignment_4()); }
	(rule__TaskRealizationModel__AbstCoordInstAssignment_4)*
	{ after(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__5__Impl
	rule__TaskRealizationModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getTasksAssignment_5()); }
	(rule__TaskRealizationModel__TasksAssignment_5)*
	{ after(grammarAccess.getTaskRealizationModelAccess().getTasksAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModel__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6()); }
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


rule__TaskRealization__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealization__Group__0__Impl
	rule__TaskRealization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0()); }
	'TaskRealization'
	{ after(grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealization__Group__1__Impl
	rule__TaskRealization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationAccess().getTaskDefAssignment_1()); }
	(rule__TaskRealization__TaskDefAssignment_1)
	{ after(grammarAccess.getTaskRealizationAccess().getTaskDefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealization__Group__2__Impl
	rule__TaskRealization__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealization__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractCoordinationModuleInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractCoordinationModuleInstance__Group__0__Impl
	rule__AbstractCoordinationModuleInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0()); }
	'AbstractCoordinationModuleInstance'
	{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractCoordinationModuleInstance__Group__1__Impl
	rule__AbstractCoordinationModuleInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameAssignment_1()); }
	(rule__AbstractCoordinationModuleInstance__NameAssignment_1)
	{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractCoordinationModuleInstance__Group__2__Impl
	rule__AbstractCoordinationModuleInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2()); }
	'coordModuleDef'
	{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractCoordinationModuleInstance__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefAssignment_3()); }
	(rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3)
	{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskRealizationModel__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__AbstCoordInstAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0()); }
		ruleAbstractCoordinationModuleInstance
		{ after(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModel__TasksAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0()); }
		ruleTaskRealization
		{ after(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealization__TaskDefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0()); }
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
