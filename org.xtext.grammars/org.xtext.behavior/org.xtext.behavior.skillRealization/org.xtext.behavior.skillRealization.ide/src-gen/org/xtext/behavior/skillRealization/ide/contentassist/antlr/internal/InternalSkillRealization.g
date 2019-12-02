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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.behavior.skillRealization.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.behavior.skillRealization.ide.contentassist.antlr.internal;

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
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

}
@parser::members {
	private SkillRealizationGrammarAccess grammarAccess;

	public void setGrammarAccess(SkillRealizationGrammarAccess grammarAccess) {
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

// Entry rule entryRuleSkillRealizationModel
entryRuleSkillRealizationModel
:
{ before(grammarAccess.getSkillRealizationModelRule()); }
	 ruleSkillRealizationModel
{ after(grammarAccess.getSkillRealizationModelRule()); } 
	 EOF 
;

// Rule SkillRealizationModel
ruleSkillRealizationModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillRealizationModelAccess().getGroup()); }
		(rule__SkillRealizationModel__Group__0)
		{ after(grammarAccess.getSkillRealizationModelAccess().getGroup()); }
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

// Entry rule entryRuleCoordinationModuleRealization
entryRuleCoordinationModuleRealization
:
{ before(grammarAccess.getCoordinationModuleRealizationRule()); }
	 ruleCoordinationModuleRealization
{ after(grammarAccess.getCoordinationModuleRealizationRule()); } 
	 EOF 
;

// Rule CoordinationModuleRealization
ruleCoordinationModuleRealization 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationModuleRealizationAccess().getGroup()); }
		(rule__CoordinationModuleRealization__Group__0)
		{ after(grammarAccess.getCoordinationModuleRealizationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationInterfaceInstance
entryRuleCoordinationInterfaceInstance
:
{ before(grammarAccess.getCoordinationInterfaceInstanceRule()); }
	 ruleCoordinationInterfaceInstance
{ after(grammarAccess.getCoordinationInterfaceInstanceRule()); } 
	 EOF 
;

// Rule CoordinationInterfaceInstance
ruleCoordinationInterfaceInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getGroup()); }
		(rule__CoordinationInterfaceInstance__Group__0)
		{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSkillRealization
entryRuleSkillRealization
:
{ before(grammarAccess.getSkillRealizationRule()); }
	 ruleSkillRealization
{ after(grammarAccess.getSkillRealizationRule()); } 
	 EOF 
;

// Rule SkillRealization
ruleSkillRealization 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillRealizationAccess().getGroup()); }
		(rule__SkillRealization__Group__0)
		{ after(grammarAccess.getSkillRealizationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationActionBlock
entryRuleCoordinationActionBlock
:
{ before(grammarAccess.getCoordinationActionBlockRule()); }
	 ruleCoordinationActionBlock
{ after(grammarAccess.getCoordinationActionBlockRule()); } 
	 EOF 
;

// Rule CoordinationActionBlock
ruleCoordinationActionBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationActionBlockAccess().getGroup()); }
		(rule__CoordinationActionBlock__Group__0)
		{ after(grammarAccess.getCoordinationActionBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractCoordinationAction
entryRuleAbstractCoordinationAction
:
{ before(grammarAccess.getAbstractCoordinationActionRule()); }
	 ruleAbstractCoordinationAction
{ after(grammarAccess.getAbstractCoordinationActionRule()); } 
	 EOF 
;

// Rule AbstractCoordinationAction
ruleAbstractCoordinationAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractCoordinationActionAccess().getAbstractComponentCoordinationActionParserRuleCall()); }
		ruleAbstractComponentCoordinationAction
		{ after(grammarAccess.getAbstractCoordinationActionAccess().getAbstractComponentCoordinationActionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractComponentCoordinationAction
entryRuleAbstractComponentCoordinationAction
:
{ before(grammarAccess.getAbstractComponentCoordinationActionRule()); }
	 ruleAbstractComponentCoordinationAction
{ after(grammarAccess.getAbstractComponentCoordinationActionRule()); } 
	 EOF 
;

// Rule AbstractComponentCoordinationAction
ruleAbstractComponentCoordinationAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractComponentCoordinationActionAccess().getAlternatives()); }
		(rule__AbstractComponentCoordinationAction__Alternatives)
		{ after(grammarAccess.getAbstractComponentCoordinationActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentCoordinationActionParameter
entryRuleComponentCoordinationActionParameter
:
{ before(grammarAccess.getComponentCoordinationActionParameterRule()); }
	 ruleComponentCoordinationActionParameter
{ after(grammarAccess.getComponentCoordinationActionParameterRule()); } 
	 EOF 
;

// Rule ComponentCoordinationActionParameter
ruleComponentCoordinationActionParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup()); }
		(rule__ComponentCoordinationActionParameter__Group__0)
		{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentCoordinationActionActivation
entryRuleComponentCoordinationActionActivation
:
{ before(grammarAccess.getComponentCoordinationActionActivationRule()); }
	 ruleComponentCoordinationActionActivation
{ after(grammarAccess.getComponentCoordinationActionActivationRule()); } 
	 EOF 
;

// Rule ComponentCoordinationActionActivation
ruleComponentCoordinationActionActivation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getGroup()); }
		(rule__ComponentCoordinationActionActivation__Group__0)
		{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentCoordinationActionEvent
entryRuleComponentCoordinationActionEvent
:
{ before(grammarAccess.getComponentCoordinationActionEventRule()); }
	 ruleComponentCoordinationActionEvent
{ after(grammarAccess.getComponentCoordinationActionEventRule()); } 
	 EOF 
;

// Rule ComponentCoordinationActionEvent
ruleComponentCoordinationActionEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentCoordinationActionEventAccess().getGroup()); }
		(rule__ComponentCoordinationActionEvent__Group__0)
		{ after(grammarAccess.getComponentCoordinationActionEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractComponentCoordinationAction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionParameterParserRuleCall_0()); }
		ruleComponentCoordinationActionParameter
		{ after(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionParameterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionActivationParserRuleCall_1()); }
		ruleComponentCoordinationActionActivation
		{ after(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionActivationParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionEventParserRuleCall_2()); }
		ruleComponentCoordinationActionEvent
		{ after(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionEventParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationModel__Group__0__Impl
	rule__SkillRealizationModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelAction_0()); }
	()
	{ after(grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationModel__Group__1__Impl
	rule__SkillRealizationModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelKeyword_1()); }
	'SkillRealizationModel'
	{ after(grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationModel__Group__2__Impl
	rule__SkillRealizationModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSkillRealizationModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationModel__Group__3__Impl
	rule__SkillRealizationModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationModelAccess().getModulesAssignment_3()); }
	(rule__SkillRealizationModel__ModulesAssignment_3)*
	{ after(grammarAccess.getSkillRealizationModelAccess().getModulesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationModelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getSkillRealizationModelAccess().getRightCurlyBracketKeyword_4()); }
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


rule__CoordinationModuleRealization__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__0__Impl
	rule__CoordinationModuleRealization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleRealizationKeyword_0()); }
	'CoordinationModuleRealization'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleRealizationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__1__Impl
	rule__CoordinationModuleRealization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getNameAssignment_1()); }
	(rule__CoordinationModuleRealization__NameAssignment_1)
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__2__Impl
	rule__CoordinationModuleRealization__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordModuleDefKeyword_2()); }
	'coordModuleDef'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordModuleDefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__3__Impl
	rule__CoordinationModuleRealization__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefAssignment_3()); }
	(rule__CoordinationModuleRealization__CoordinationModuleDefAssignment_3)
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__4__Impl
	rule__CoordinationModuleRealization__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getUsesKeyword_4()); }
	'uses'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getUsesKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__5__Impl
	rule__CoordinationModuleRealization__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__6__Impl
	rule__CoordinationModuleRealization__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsAssignment_6()); }
	(rule__CoordinationModuleRealization__CoordInterfaceInstsAssignment_6)*
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__7__Impl
	rule__CoordinationModuleRealization__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__8__Impl
	rule__CoordinationModuleRealization__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_8()); }
	'{'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__9__Impl
	rule__CoordinationModuleRealization__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsAssignment_9()); }
	(rule__CoordinationModuleRealization__SkillsAssignment_9)*
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleRealization__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationInterfaceInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceInstance__Group__0__Impl
	rule__CoordinationInterfaceInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefAssignment_0()); }
	(rule__CoordinationInterfaceInstance__CoordinationInterfaceDefAssignment_0)
	{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceInstance__Group__1__Impl
	rule__CoordinationInterfaceInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getIntsNameKeyword_1()); }
	'intsName'
	{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getIntsNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceInstance__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameAssignment_2()); }
	(rule__CoordinationInterfaceInstance__NameAssignment_2)
	{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillRealization__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__0__Impl
	rule__SkillRealization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0()); }
	'SkillRealization'
	{ after(grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__1__Impl
	rule__SkillRealization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getSkillDefAssignment_1()); }
	(rule__SkillRealization__SkillDefAssignment_1)
	{ after(grammarAccess.getSkillRealizationAccess().getSkillDefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__2__Impl
	rule__SkillRealization__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__3__Impl
	rule__SkillRealization__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getActionKeyword_3()); }
	'action'
	{ after(grammarAccess.getSkillRealizationAccess().getActionKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__4__Impl
	rule__SkillRealization__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getSkillRealizationAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__5__Impl
	rule__SkillRealization__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getActionAssignment_5()); }
	(rule__SkillRealization__ActionAssignment_5)
	{ after(grammarAccess.getSkillRealizationAccess().getActionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__6__Impl
	rule__SkillRealization__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getSkillRealizationAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealization__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationActionBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationActionBlock__Group__0__Impl
	rule__CoordinationActionBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationActionBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationActionBlockAccess().getCoordinationActionBlockAction_0()); }
	()
	{ after(grammarAccess.getCoordinationActionBlockAccess().getCoordinationActionBlockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationActionBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationActionBlock__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationActionBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationActionBlockAccess().getActionsAssignment_1()); }
	(rule__CoordinationActionBlock__ActionsAssignment_1)*
	{ after(grammarAccess.getCoordinationActionBlockAccess().getActionsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentCoordinationActionParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__0__Impl
	rule__ComponentCoordinationActionParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getTclParamKeyword_0()); }
	'tcl-param'
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getTclParamKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__1__Impl
	rule__ComponentCoordinationActionParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getServerKeyword_1()); }
	':server'
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getServerKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__2__Impl
	rule__ComponentCoordinationActionParameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceAssignment_2()); }
	(rule__ComponentCoordinationActionParameter__CoordinationServiceAssignment_2)
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__3__Impl
	rule__ComponentCoordinationActionParameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getParamKeyword_3()); }
	':param'
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getParamKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__4__Impl
	rule__ComponentCoordinationActionParameter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAssignment_4()); }
	(rule__ComponentCoordinationActionParameter__ParameterAssignment_4)
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup_5()); }
	(rule__ComponentCoordinationActionParameter__Group_5__0)?
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentCoordinationActionParameter__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group_5__0__Impl
	rule__ComponentCoordinationActionParameter__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getParamvalueKeyword_5_0()); }
	':paramvalue'
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getParamvalueKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionParameter__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getValueAssignment_5_1()); }
	(rule__ComponentCoordinationActionParameter__ValueAssignment_5_1)
	{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getValueAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentCoordinationActionActivation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionActivation__Group__0__Impl
	rule__ComponentCoordinationActionActivation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getTclStateKeyword_0()); }
	'tcl-state'
	{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getTclStateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionActivation__Group__1__Impl
	rule__ComponentCoordinationActionActivation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getServerKeyword_1()); }
	':server'
	{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getServerKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionActivation__Group__2__Impl
	rule__ComponentCoordinationActionActivation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceAssignment_2()); }
	(rule__ComponentCoordinationActionActivation__CoordinationServiceAssignment_2)
	{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionActivation__Group__3__Impl
	rule__ComponentCoordinationActionActivation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getStateKeyword_3()); }
	':state'
	{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getStateKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionActivation__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getStateAssignment_4()); }
	(rule__ComponentCoordinationActionActivation__StateAssignment_4)
	{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getStateAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentCoordinationActionEvent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionEvent__Group__0__Impl
	rule__ComponentCoordinationActionEvent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionEventAccess().getTclActivateEventKeyword_0()); }
	'tcl-activate-event'
	{ after(grammarAccess.getComponentCoordinationActionEventAccess().getTclActivateEventKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionEvent__Group__1__Impl
	rule__ComponentCoordinationActionEvent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionEventAccess().getNameKeyword_1()); }
	':name'
	{ after(grammarAccess.getComponentCoordinationActionEventAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionEvent__Group__2__Impl
	rule__ComponentCoordinationActionEvent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionEventAccess().getServerKeyword_2()); }
	':server'
	{ after(grammarAccess.getComponentCoordinationActionEventAccess().getServerKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentCoordinationActionEvent__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceAssignment_3()); }
	(rule__ComponentCoordinationActionEvent__CoordinationServiceAssignment_3)
	{ after(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillRealizationModel__ModulesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationModelAccess().getModulesCoordinationModuleRealizationParserRuleCall_3_0()); }
		ruleCoordinationModuleRealization
		{ after(grammarAccess.getSkillRealizationModelAccess().getModulesCoordinationModuleRealizationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleRealizationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationModuleRealizationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__CoordinationModuleDefAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__CoordInterfaceInstsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0()); }
		ruleCoordinationInterfaceInstance
		{ after(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleRealization__SkillsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsSkillRealizationParserRuleCall_9_0()); }
		ruleSkillRealization
		{ after(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsSkillRealizationParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__CoordinationInterfaceDefAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceInstance__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__SkillDefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealization__ActionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationAccess().getActionCoordinationActionBlockParserRuleCall_5_0()); }
		ruleCoordinationActionBlock
		{ after(grammarAccess.getSkillRealizationAccess().getActionCoordinationActionBlockParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationActionBlock__ActionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationActionBlockAccess().getActionsAbstractCoordinationActionParserRuleCall_1_0()); }
		ruleAbstractCoordinationAction
		{ after(grammarAccess.getCoordinationActionBlockAccess().getActionsAbstractCoordinationActionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__CoordinationServiceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__ParameterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterCrossReference_4_0()); }
		(
			{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterFQNParserRuleCall_4_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterFQNParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionParameter__ValueAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionParameterAccess().getValueSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getComponentCoordinationActionParameterAccess().getValueSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__CoordinationServiceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionActivation__StateAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionCrossReference_4_0()); }
		(
			{ before(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionFQNParserRuleCall_4_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionFQNParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentCoordinationActionEvent__CoordinationServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0()); }
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
