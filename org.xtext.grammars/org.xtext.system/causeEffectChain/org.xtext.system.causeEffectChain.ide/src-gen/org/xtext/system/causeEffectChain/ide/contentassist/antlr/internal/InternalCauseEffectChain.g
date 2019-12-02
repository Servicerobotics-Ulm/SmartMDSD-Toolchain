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
grammar InternalCauseEffectChain;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.causeEffectChain.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.causeEffectChain.ide.contentassist.antlr.internal;

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
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;

}
@parser::members {
	private CauseEffectChainGrammarAccess grammarAccess;

	public void setGrammarAccess(CauseEffectChainGrammarAccess grammarAccess) {
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

// Entry rule entryRuleCuaseEffectChainModel
entryRuleCuaseEffectChainModel
:
{ before(grammarAccess.getCuaseEffectChainModelRule()); }
	 ruleCuaseEffectChainModel
{ after(grammarAccess.getCuaseEffectChainModelRule()); } 
	 EOF 
;

// Rule CuaseEffectChainModel
ruleCuaseEffectChainModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCuaseEffectChainModelAccess().getGroup()); }
		(rule__CuaseEffectChainModel__Group__0)
		{ after(grammarAccess.getCuaseEffectChainModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
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

// Entry rule entryRuleActivityChain
entryRuleActivityChain
:
{ before(grammarAccess.getActivityChainRule()); }
	 ruleActivityChain
{ after(grammarAccess.getActivityChainRule()); } 
	 EOF 
;

// Rule ActivityChain
ruleActivityChain 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityChainAccess().getGroup()); }
		(rule__ActivityChain__Group__0)
		{ after(grammarAccess.getActivityChainAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractChainLink
entryRuleAbstractChainLink
:
{ before(grammarAccess.getAbstractChainLinkRule()); }
	 ruleAbstractChainLink
{ after(grammarAccess.getAbstractChainLinkRule()); } 
	 EOF 
;

// Rule AbstractChainLink
ruleAbstractChainLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractChainLinkAccess().getAlternatives()); }
		(rule__AbstractChainLink__Alternatives)
		{ after(grammarAccess.getAbstractChainLinkAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivityLink
entryRuleActivityLink
:
{ before(grammarAccess.getActivityLinkRule()); }
	 ruleActivityLink
{ after(grammarAccess.getActivityLinkRule()); } 
	 EOF 
;

// Rule ActivityLink
ruleActivityLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityLinkAccess().getGroup()); }
		(rule__ActivityLink__Group__0)
		{ after(grammarAccess.getActivityLinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputHandlerLink
entryRuleInputHandlerLink
:
{ before(grammarAccess.getInputHandlerLinkRule()); }
	 ruleInputHandlerLink
{ after(grammarAccess.getInputHandlerLinkRule()); } 
	 EOF 
;

// Rule InputHandlerLink
ruleInputHandlerLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputHandlerLinkAccess().getGroup()); }
		(rule__InputHandlerLink__Group__0)
		{ after(grammarAccess.getInputHandlerLinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMinResponseTime
entryRuleMinResponseTime
:
{ before(grammarAccess.getMinResponseTimeRule()); }
	 ruleMinResponseTime
{ after(grammarAccess.getMinResponseTimeRule()); } 
	 EOF 
;

// Rule MinResponseTime
ruleMinResponseTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMinResponseTimeAccess().getGroup()); }
		(rule__MinResponseTime__Group__0)
		{ after(grammarAccess.getMinResponseTimeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMaxResponseTime
entryRuleMaxResponseTime
:
{ before(grammarAccess.getMaxResponseTimeRule()); }
	 ruleMaxResponseTime
{ after(grammarAccess.getMaxResponseTimeRule()); } 
	 EOF 
;

// Rule MaxResponseTime
ruleMaxResponseTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaxResponseTimeAccess().getGroup()); }
		(rule__MaxResponseTime__Group__0)
		{ after(grammarAccess.getMaxResponseTimeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TimeUnit
ruleTimeUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getAlternatives()); }
		(rule__TimeUnit__Alternatives)
		{ after(grammarAccess.getTimeUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractChainLink__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractChainLinkAccess().getActivityLinkParserRuleCall_0()); }
		ruleActivityLink
		{ after(grammarAccess.getAbstractChainLinkAccess().getActivityLinkParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractChainLinkAccess().getInputHandlerLinkParserRuleCall_1()); }
		ruleInputHandlerLink
		{ after(grammarAccess.getAbstractChainLinkAccess().getInputHandlerLinkParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); }
		('sec')
		{ after(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); }
		('ms')
		{ after(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); }
		('us')
		{ after(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__0__Impl
	rule__CuaseEffectChainModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getCuaseEffectChainModelKeyword_0()); }
	'CuaseEffectChainModel'
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getCuaseEffectChainModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__1__Impl
	rule__CuaseEffectChainModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getNameAssignment_1()); }
	(rule__CuaseEffectChainModel__NameAssignment_1)
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__2__Impl
	rule__CuaseEffectChainModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getRefinesActivityArchKeyword_2()); }
	'refinesActivityArch'
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getRefinesActivityArchKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__3__Impl
	rule__CuaseEffectChainModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getActArchAssignment_3()); }
	(rule__CuaseEffectChainModel__ActArchAssignment_3)
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getActArchAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__4__Impl
	rule__CuaseEffectChainModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__5__Impl
	rule__CuaseEffectChainModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getChainsAssignment_5()); }
	(rule__CuaseEffectChainModel__ChainsAssignment_5)*
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getChainsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CuaseEffectChainModel__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCuaseEffectChainModelAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getCuaseEffectChainModelAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
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


rule__ActivityChain__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__0__Impl
	rule__ActivityChain__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getActivityChainAction_0()); }
	()
	{ after(grammarAccess.getActivityChainAccess().getActivityChainAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__1__Impl
	rule__ActivityChain__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getActivityChainKeyword_1()); }
	'ActivityChain'
	{ after(grammarAccess.getActivityChainAccess().getActivityChainKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__2__Impl
	rule__ActivityChain__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getNameAssignment_2()); }
	(rule__ActivityChain__NameAssignment_2)
	{ after(grammarAccess.getActivityChainAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__3__Impl
	rule__ActivityChain__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__4__Impl
	rule__ActivityChain__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getGroup_4()); }
	(rule__ActivityChain__Group_4__0)?
	{ after(grammarAccess.getActivityChainAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__5__Impl
	rule__ActivityChain__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getUnorderedGroup_5()); }
	(rule__ActivityChain__UnorderedGroup_5)
	{ after(grammarAccess.getActivityChainAccess().getUnorderedGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityChain__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4__0__Impl
	rule__ActivityChain__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getChainLinksKeyword_4_0()); }
	'chainLinks'
	{ after(grammarAccess.getActivityChainAccess().getChainLinksKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4__1__Impl
	rule__ActivityChain__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4__2__Impl
	rule__ActivityChain__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_2()); }
	(rule__ActivityChain__ChainLinksAssignment_4_2)
	{ after(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4__3__Impl
	rule__ActivityChain__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getGroup_4_3()); }
	(rule__ActivityChain__Group_4_3__0)*
	{ after(grammarAccess.getActivityChainAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityChain__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4_3__0__Impl
	rule__ActivityChain__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getHyphenMinusGreaterThanSignKeyword_4_3_0()); }
	'->'
	{ after(grammarAccess.getActivityChainAccess().getHyphenMinusGreaterThanSignKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_3_1()); }
	(rule__ActivityChain__ChainLinksAssignment_4_3_1)
	{ after(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityLink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityLink__Group__0__Impl
	rule__ActivityLink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityLink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityLinkAccess().getActKeyword_0()); }
	'act.'
	{ after(grammarAccess.getActivityLinkAccess().getActKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityLink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityLink__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityLink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityLinkAccess().getRefAssignment_1()); }
	(rule__ActivityLink__RefAssignment_1)
	{ after(grammarAccess.getActivityLinkAccess().getRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandlerLink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerLink__Group__0__Impl
	rule__InputHandlerLink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerLink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerLinkAccess().getHndKeyword_0()); }
	'hnd.'
	{ after(grammarAccess.getInputHandlerLinkAccess().getHndKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerLink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerLink__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerLink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerLinkAccess().getRefAssignment_1()); }
	(rule__InputHandlerLink__RefAssignment_1)
	{ after(grammarAccess.getInputHandlerLinkAccess().getRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MinResponseTime__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MinResponseTime__Group__0__Impl
	rule__MinResponseTime__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMinResponseTimeAccess().getDesiredMinResponseKeyword_0()); }
	'desiredMinResponse'
	{ after(grammarAccess.getMinResponseTimeAccess().getDesiredMinResponseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MinResponseTime__Group__1__Impl
	rule__MinResponseTime__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMinResponseTimeAccess().getValueAssignment_1()); }
	(rule__MinResponseTime__ValueAssignment_1)
	{ after(grammarAccess.getMinResponseTimeAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MinResponseTime__Group__2__Impl
	rule__MinResponseTime__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMinResponseTimeAccess().getUnitAssignment_2()); }
	(rule__MinResponseTime__UnitAssignment_2)
	{ after(grammarAccess.getMinResponseTimeAccess().getUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MinResponseTime__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMinResponseTimeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getMinResponseTimeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MaxResponseTime__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxResponseTime__Group__0__Impl
	rule__MaxResponseTime__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxResponseTimeAccess().getDesiredMaxResponseKeyword_0()); }
	'desiredMaxResponse'
	{ after(grammarAccess.getMaxResponseTimeAccess().getDesiredMaxResponseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxResponseTime__Group__1__Impl
	rule__MaxResponseTime__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxResponseTimeAccess().getValueAssignment_1()); }
	(rule__MaxResponseTime__ValueAssignment_1)
	{ after(grammarAccess.getMaxResponseTimeAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxResponseTime__Group__2__Impl
	rule__MaxResponseTime__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxResponseTimeAccess().getUnitAssignment_2()); }
	(rule__MaxResponseTime__UnitAssignment_2)
	{ after(grammarAccess.getMaxResponseTimeAccess().getUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MaxResponseTime__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMaxResponseTimeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getMaxResponseTimeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityChain__UnorderedGroup_5
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
	}
:
	rule__ActivityChain__UnorderedGroup_5__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__ActivityChain__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityChainAccess().getDesiredMinResponseAssignment_5_0()); }
					(rule__ActivityChain__DesiredMinResponseAssignment_5_0)
					{ after(grammarAccess.getActivityChainAccess().getDesiredMinResponseAssignment_5_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityChainAccess().getDesiredMaxResponseAssignment_5_1()); }
					(rule__ActivityChain__DesiredMaxResponseAssignment_5_1)
					{ after(grammarAccess.getActivityChainAccess().getDesiredMaxResponseAssignment_5_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__ActivityChain__UnorderedGroup_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__UnorderedGroup_5__Impl
	rule__ActivityChain__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__UnorderedGroup_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityChain__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__CuaseEffectChainModel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCuaseEffectChainModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCuaseEffectChainModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__ActArchAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CuaseEffectChainModel__ChainsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCuaseEffectChainModelAccess().getChainsActivityChainParserRuleCall_5_0()); }
		ruleActivityChain
		{ after(grammarAccess.getCuaseEffectChainModelAccess().getChainsActivityChainParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityChainAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getActivityChainAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__ChainLinksAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_2_0()); }
		ruleAbstractChainLink
		{ after(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__ChainLinksAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_3_1_0()); }
		ruleAbstractChainLink
		{ after(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__DesiredMinResponseAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityChainAccess().getDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0()); }
		ruleMinResponseTime
		{ after(grammarAccess.getActivityChainAccess().getDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityChain__DesiredMaxResponseAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityChainAccess().getDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0()); }
		ruleMaxResponseTime
		{ after(grammarAccess.getActivityChainAccess().getDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityLink__RefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityLinkAccess().getRefActivityNodeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getActivityLinkAccess().getRefActivityNodeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getActivityLinkAccess().getRefActivityNodeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getActivityLinkAccess().getRefActivityNodeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerLink__RefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMinResponseTimeAccess().getValueEIntParserRuleCall_1_0()); }
		ruleEInt
		{ after(grammarAccess.getMinResponseTimeAccess().getValueEIntParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MinResponseTime__UnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMinResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0()); }
		ruleTimeUnit
		{ after(grammarAccess.getMinResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxResponseTimeAccess().getValueEIntParserRuleCall_1_0()); }
		ruleEInt
		{ after(grammarAccess.getMaxResponseTimeAccess().getValueEIntParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxResponseTime__UnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0()); }
		ruleTimeUnit
		{ after(grammarAccess.getMaxResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0()); }
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
