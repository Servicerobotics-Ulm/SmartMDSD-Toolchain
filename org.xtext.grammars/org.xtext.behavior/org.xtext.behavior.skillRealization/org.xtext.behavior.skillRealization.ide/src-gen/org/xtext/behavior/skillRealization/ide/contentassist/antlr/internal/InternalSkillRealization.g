//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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

// Entry rule entryRuleSkillRealizationSet
entryRuleSkillRealizationSet
:
{ before(grammarAccess.getSkillRealizationSetRule()); }
	 ruleSkillRealizationSet
{ after(grammarAccess.getSkillRealizationSetRule()); } 
	 EOF 
;

// Rule SkillRealizationSet
ruleSkillRealizationSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillRealizationSetAccess().getGroup()); }
		(rule__SkillRealizationSet__Group__0)
		{ after(grammarAccess.getSkillRealizationSetAccess().getGroup()); }
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
	{ before(grammarAccess.getSkillRealizationModelAccess().getSkillsetsAssignment_3()); }
	(rule__SkillRealizationModel__SkillsetsAssignment_3)*
	{ after(grammarAccess.getSkillRealizationModelAccess().getSkillsetsAssignment_3()); }
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


rule__SkillRealizationSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__0__Impl
	rule__SkillRealizationSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getSkillSetRealizationKeyword_0()); }
	'SkillSetRealization'
	{ after(grammarAccess.getSkillRealizationSetAccess().getSkillSetRealizationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__1__Impl
	rule__SkillRealizationSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getNameAssignment_1()); }
	(rule__SkillRealizationSet__NameAssignment_1)
	{ after(grammarAccess.getSkillRealizationSetAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__2__Impl
	rule__SkillRealizationSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getSkillSetDefKeyword_2()); }
	'skillSetDef'
	{ after(grammarAccess.getSkillRealizationSetAccess().getSkillSetDefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__3__Impl
	rule__SkillRealizationSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetAssignment_3()); }
	(rule__SkillRealizationSet__SkillDefSetAssignment_3)
	{ after(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__4__Impl
	rule__SkillRealizationSet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getSkillRealizationSetAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__5__Impl
	rule__SkillRealizationSet__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getSkillsAssignment_5()); }
	(rule__SkillRealizationSet__SkillsAssignment_5)*
	{ after(grammarAccess.getSkillRealizationSetAccess().getSkillsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationSet__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationSetAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getSkillRealizationSetAccess().getRightCurlyBracketKeyword_6()); }
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
	{ before(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillRealizationModel__SkillsetsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationModelAccess().getSkillsetsSkillRealizationSetParserRuleCall_3_0()); }
		ruleSkillRealizationSet
		{ after(grammarAccess.getSkillRealizationModelAccess().getSkillsetsSkillRealizationSetParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationSetAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSkillRealizationSetAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__SkillDefSetAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetCrossReference_3_0()); }
		(
			{ before(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationSet__SkillsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationSetAccess().getSkillsSkillRealizationParserRuleCall_5_0()); }
		ruleSkillRealization
		{ after(grammarAccess.getSkillRealizationSetAccess().getSkillsSkillRealizationParserRuleCall_5_0()); }
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
