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
grammar InternalRoboticMiddleware;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.roboticMiddleware.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.roboticMiddleware.ide.contentassist.antlr.internal;

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
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

}
@parser::members {
	private RoboticMiddlewareGrammarAccess grammarAccess;

	public void setGrammarAccess(RoboticMiddlewareGrammarAccess grammarAccess) {
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

// Entry rule entryRuleRoboticMiddleware
entryRuleRoboticMiddleware
:
{ before(grammarAccess.getRoboticMiddlewareRule()); }
	 ruleRoboticMiddleware
{ after(grammarAccess.getRoboticMiddlewareRule()); } 
	 EOF 
;

// Rule RoboticMiddleware
ruleRoboticMiddleware 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); }
		(rule__RoboticMiddleware__Alternatives)
		{ after(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); }
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

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleACE_SmartSoft
entryRuleACE_SmartSoft
:
{ before(grammarAccess.getACE_SmartSoftRule()); }
	 ruleACE_SmartSoft
{ after(grammarAccess.getACE_SmartSoftRule()); } 
	 EOF 
;

// Rule ACE_SmartSoft
ruleACE_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getACE_SmartSoftAccess().getGroup()); }
		(rule__ACE_SmartSoft__Group__0)
		{ after(grammarAccess.getACE_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUa_SeRoNet
entryRuleOpcUa_SeRoNet
:
{ before(grammarAccess.getOpcUa_SeRoNetRule()); }
	 ruleOpcUa_SeRoNet
{ after(grammarAccess.getOpcUa_SeRoNetRule()); } 
	 EOF 
;

// Rule OpcUa_SeRoNet
ruleOpcUa_SeRoNet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); }
		(rule__OpcUa_SeRoNet__Group__0)
		{ after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCORBA_SmartSoft
entryRuleCORBA_SmartSoft
:
{ before(grammarAccess.getCORBA_SmartSoftRule()); }
	 ruleCORBA_SmartSoft
{ after(grammarAccess.getCORBA_SmartSoftRule()); } 
	 EOF 
;

// Rule CORBA_SmartSoft
ruleCORBA_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); }
		(rule__CORBA_SmartSoft__Group__0)
		{ after(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDDS_SmartSoft
entryRuleDDS_SmartSoft
:
{ before(grammarAccess.getDDS_SmartSoftRule()); }
	 ruleDDS_SmartSoft
{ after(grammarAccess.getDDS_SmartSoftRule()); } 
	 EOF 
;

// Rule DDS_SmartSoft
ruleDDS_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); }
		(rule__DDS_SmartSoft__Group__0)
		{ after(grammarAccess.getDDS_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoboticMiddleware__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); }
		ruleACE_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); }
		ruleOpcUa_SeRoNet
		{ after(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); }
		ruleCORBA_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); }
		ruleDDS_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); }
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


rule__ACE_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__0__Impl
	rule__ACE_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__1__Impl
	rule__ACE_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); }
	'ACE_SmartSoft'
	{ after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); }
	(rule__ACE_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ACE_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group_2__0__Impl
	rule__ACE_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__ACE_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUa_SeRoNet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__0__Impl
	rule__OpcUa_SeRoNet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); }
	()
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__1__Impl
	rule__OpcUa_SeRoNet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); }
	'OpcUa_SeRoNet'
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); }
	(rule__OpcUa_SeRoNet__Group_2__0)?
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUa_SeRoNet__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group_2__0__Impl
	rule__OpcUa_SeRoNet__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); }
	(rule__OpcUa_SeRoNet__DescriptionAssignment_2_1)
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CORBA_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__0__Impl
	rule__CORBA_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__1__Impl
	rule__CORBA_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); }
	'CORBA_SmartSoft'
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); }
	(rule__CORBA_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CORBA_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group_2__0__Impl
	rule__CORBA_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__CORBA_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DDS_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__0__Impl
	rule__DDS_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__1__Impl
	rule__DDS_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); }
	'DDS_SmartSoft'
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); }
	(rule__DDS_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DDS_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group_2__0__Impl
	rule__DDS_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__DDS_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ACE_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

fragment RULE_ML_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~('/') ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_SL_DOCUMENTATION : '///' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_DOCU_COMMENT : (RULE_ML_DOCUMENTATION|RULE_SL_DOCUMENTATION);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
