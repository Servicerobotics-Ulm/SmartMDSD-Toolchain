//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
grammar InternalSystemDatasheetPropertyChecks;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.datasheetPropertyChecks.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.datasheetPropertyChecks.ide.contentassist.antlr.internal;

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
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;

}
@parser::members {
	private SystemDatasheetPropertyChecksGrammarAccess grammarAccess;

	public void setGrammarAccess(SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
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

// Entry rule entryRuleSystemDatasheetPropertyChecksModel
entryRuleSystemDatasheetPropertyChecksModel
:
{ before(grammarAccess.getSystemDatasheetPropertyChecksModelRule()); }
	 ruleSystemDatasheetPropertyChecksModel
{ after(grammarAccess.getSystemDatasheetPropertyChecksModelRule()); } 
	 EOF 
;

// Rule SystemDatasheetPropertyChecksModel
ruleSystemDatasheetPropertyChecksModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getGroup()); }
		(rule__SystemDatasheetPropertyChecksModel__Group__0)
		{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDatasheetPropertyCheck
entryRuleDatasheetPropertyCheck
:
{ before(grammarAccess.getDatasheetPropertyCheckRule()); }
	 ruleDatasheetPropertyCheck
{ after(grammarAccess.getDatasheetPropertyCheckRule()); } 
	 EOF 
;

// Rule DatasheetPropertyCheck
ruleDatasheetPropertyCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getGroup()); }
		(rule__DatasheetPropertyCheck__Group__0)
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EvaluationFunction
ruleEvaluationFunction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluationFunctionAccess().getAlternatives()); }
		(rule__EvaluationFunction__Alternatives)
		{ after(grammarAccess.getEvaluationFunctionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EvaluationOperator
ruleEvaluationOperator
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getAlternatives()); }
		(rule__EvaluationOperator__Alternatives)
		{ after(grammarAccess.getEvaluationOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluationFunction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0()); }
		('\u2200')
		{ after(grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1()); }
		('\u03A3')
		{ after(grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2()); }
		('\u2203')
		{ after(grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EvaluationOperator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0()); }
		('==')
		{ after(grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1()); }
		('!=')
		{ after(grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2()); }
		('<')
		{ after(grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3()); }
		('<=')
		{ after(grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4()); }
		('>=')
		{ after(grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5()); }
		('>')
		{ after(grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6()); }
		('compatible_to')
		{ after(grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheetPropertyChecksModel__Group__0__Impl
	rule__SystemDatasheetPropertyChecksModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemDatasheetPropertyChecksModelKeyword_0()); }
	'SystemDatasheetPropertyChecksModel'
	{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemDatasheetPropertyChecksModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheetPropertyChecksModel__Group__1__Impl
	rule__SystemDatasheetPropertyChecksModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemAssignment_1()); }
	(rule__SystemDatasheetPropertyChecksModel__SystemAssignment_1)
	{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheetPropertyChecksModel__Group__2__Impl
	rule__SystemDatasheetPropertyChecksModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheetPropertyChecksModel__Group__3__Impl
	rule__SystemDatasheetPropertyChecksModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksAssignment_3()); }
	(rule__SystemDatasheetPropertyChecksModel__ChecksAssignment_3)*
	{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheetPropertyChecksModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetPropertyCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__0__Impl
	rule__DatasheetPropertyCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getDatasheetPropertyCheckAction_0()); }
	()
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getDatasheetPropertyCheckAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__1__Impl
	rule__DatasheetPropertyCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionAssignment_1()); }
	(rule__DatasheetPropertyCheck__FunctionAssignment_1)
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__2__Impl
	rule__DatasheetPropertyCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameAssignment_2()); }
	(rule__DatasheetPropertyCheck__PropertyNameAssignment_2)
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__3__Impl
	rule__DatasheetPropertyCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorAssignment_3()); }
	(rule__DatasheetPropertyCheck__OperatorAssignment_3)
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__4__Impl
	rule__DatasheetPropertyCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueAssignment_4()); }
	(rule__DatasheetPropertyCheck__PropertyValueAssignment_4)
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__5__Impl
	rule__DatasheetPropertyCheck__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitAssignment_5()); }
	(rule__DatasheetPropertyCheck__PropertyUnitAssignment_5)?
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetPropertyCheck__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyCheckAccess().getSemicolonKeyword_6()); }
	(';')?
	{ after(grammarAccess.getDatasheetPropertyCheckAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SystemDatasheetPropertyChecksModel__SystemAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheetPropertyChecksModel__ChecksAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksDatasheetPropertyCheckParserRuleCall_3_0()); }
		ruleDatasheetPropertyCheck
		{ after(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksDatasheetPropertyCheckParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__FunctionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionEvaluationFunctionEnumRuleCall_1_0()); }
		ruleEvaluationFunction
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionEvaluationFunctionEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__PropertyNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__OperatorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorEvaluationOperatorEnumRuleCall_3_0()); }
		ruleEvaluationOperator
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorEvaluationOperatorEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__PropertyValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetPropertyCheck__PropertyUnitAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitSTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitSTRINGTerminalRuleCall_5_0()); }
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
