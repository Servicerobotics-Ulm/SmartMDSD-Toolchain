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
grammar InternalComponentDocumentation;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.component.componentDocumentation.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.component.componentDocumentation.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;

}
@parser::members {
	private ComponentDocumentationGrammarAccess grammarAccess;

	public void setGrammarAccess(ComponentDocumentationGrammarAccess grammarAccess) {
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

// Entry rule entryRuleComponentDocumentation
entryRuleComponentDocumentation
:
{ before(grammarAccess.getComponentDocumentationRule()); }
	 ruleComponentDocumentation
{ after(grammarAccess.getComponentDocumentationRule()); } 
	 EOF 
;

// Rule ComponentDocumentation
ruleComponentDocumentation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getGroup()); }
		(rule__ComponentDocumentation__Group__0)
		{ after(grammarAccess.getComponentDocumentationAccess().getGroup()); }
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

// Entry rule entryRuleAbstractComponentDocuElement
entryRuleAbstractComponentDocuElement
:
{ before(grammarAccess.getAbstractComponentDocuElementRule()); }
	 ruleAbstractComponentDocuElement
{ after(grammarAccess.getAbstractComponentDocuElementRule()); } 
	 EOF 
;

// Rule AbstractComponentDocuElement
ruleAbstractComponentDocuElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractComponentDocuElementAccess().getAlternatives()); }
		(rule__AbstractComponentDocuElement__Alternatives)
		{ after(grammarAccess.getAbstractComponentDocuElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationSlavePortDocu
entryRuleCoordinationSlavePortDocu
:
{ before(grammarAccess.getCoordinationSlavePortDocuRule()); }
	 ruleCoordinationSlavePortDocu
{ after(grammarAccess.getCoordinationSlavePortDocuRule()); } 
	 EOF 
;

// Rule CoordinationSlavePortDocu
ruleCoordinationSlavePortDocu 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup()); }
		(rule__CoordinationSlavePortDocu__Group__0)
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentServiceDocu
entryRuleComponentServiceDocu
:
{ before(grammarAccess.getComponentServiceDocuRule()); }
	 ruleComponentServiceDocu
{ after(grammarAccess.getComponentServiceDocuRule()); } 
	 EOF 
;

// Rule ComponentServiceDocu
ruleComponentServiceDocu 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentServiceDocuAccess().getGroup()); }
		(rule__ComponentServiceDocu__Group__0)
		{ after(grammarAccess.getComponentServiceDocuAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractModeDocu
entryRuleAbstractModeDocu
:
{ before(grammarAccess.getAbstractModeDocuRule()); }
	 ruleAbstractModeDocu
{ after(grammarAccess.getAbstractModeDocuRule()); } 
	 EOF 
;

// Rule AbstractModeDocu
ruleAbstractModeDocu 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractModeDocuAccess().getAlternatives()); }
		(rule__AbstractModeDocu__Alternatives)
		{ after(grammarAccess.getAbstractModeDocuAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentModeDocu
entryRuleComponentModeDocu
:
{ before(grammarAccess.getComponentModeDocuRule()); }
	 ruleComponentModeDocu
{ after(grammarAccess.getComponentModeDocuRule()); } 
	 EOF 
;

// Rule ComponentModeDocu
ruleComponentModeDocu 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentModeDocuAccess().getGroup()); }
		(rule__ComponentModeDocu__Group__0)
		{ after(grammarAccess.getComponentModeDocuAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNeutralModeDocu
entryRuleNeutralModeDocu
:
{ before(grammarAccess.getNeutralModeDocuRule()); }
	 ruleNeutralModeDocu
{ after(grammarAccess.getNeutralModeDocuRule()); } 
	 EOF 
;

// Rule NeutralModeDocu
ruleNeutralModeDocu 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNeutralModeDocuAccess().getGroup()); }
		(rule__NeutralModeDocu__Group__0)
		{ after(grammarAccess.getNeutralModeDocuAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractComponentDocuElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0()); }
		ruleCoordinationSlavePortDocu
		{ after(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1()); }
		ruleComponentServiceDocu
		{ after(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2()); }
		ruleAbstractModeDocu
		{ after(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractModeDocu__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0()); }
		ruleComponentModeDocu
		{ after(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1()); }
		ruleNeutralModeDocu
		{ after(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__0__Impl
	rule__ComponentDocumentation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0()); }
	'ComponentDocumentation'
	{ after(grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__1__Impl
	rule__ComponentDocumentation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getComponentAssignment_1()); }
	(rule__ComponentDocumentation__ComponentAssignment_1)
	{ after(grammarAccess.getComponentDocumentationAccess().getComponentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__2__Impl
	rule__ComponentDocumentation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__3__Impl
	rule__ComponentDocumentation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3()); }
	(rule__ComponentDocumentation__UnorderedGroup_3)
	{ after(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__4__Impl
	rule__ComponentDocumentation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getElementsAssignment_4()); }
	(rule__ComponentDocumentation__ElementsAssignment_4)*
	{ after(grammarAccess.getComponentDocumentationAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_0__0__Impl
	rule__ComponentDocumentation__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0()); }
	'Description'
	{ after(grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_0__1__Impl
	rule__ComponentDocumentation__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1()); }
	':'
	{ after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getDescriptionAssignment_3_0_2()); }
	(rule__ComponentDocumentation__DescriptionAssignment_3_0_2)
	{ after(grammarAccess.getComponentDocumentationAccess().getDescriptionAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_1__0__Impl
	rule__ComponentDocumentation__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0()); }
	'Purpose'
	{ after(grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_1__1__Impl
	rule__ComponentDocumentation__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1()); }
	':'
	{ after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getPurposeAssignment_3_1_2()); }
	(rule__ComponentDocumentation__PurposeAssignment_3_1_2)
	{ after(grammarAccess.getComponentDocumentationAccess().getPurposeAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_2__0__Impl
	rule__ComponentDocumentation__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0()); }
	'License'
	{ after(grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_2__1__Impl
	rule__ComponentDocumentation__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1()); }
	':'
	{ after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getLicenseAssignment_3_2_2()); }
	(rule__ComponentDocumentation__LicenseAssignment_3_2_2)
	{ after(grammarAccess.getComponentDocumentationAccess().getLicenseAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_3__0__Impl
	rule__ComponentDocumentation__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0()); }
	'HardwareRequirements'
	{ after(grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_3__1__Impl
	rule__ComponentDocumentation__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1()); }
	':'
	{ after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__Group_3_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__Group_3_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDocumentationAccess().getHardwareAssignment_3_3_2()); }
	(rule__ComponentDocumentation__HardwareAssignment_3_3_2)
	{ after(grammarAccess.getComponentDocumentationAccess().getHardwareAssignment_3_3_2()); }
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


rule__CoordinationSlavePortDocu__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group__0__Impl
	rule__CoordinationSlavePortDocu__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0()); }
	'CoordinationSlavePort'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group__1__Impl
	rule__CoordinationSlavePortDocu__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortAssignment_1()); }
	(rule__CoordinationSlavePortDocu__PortAssignment_1)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group__2__Impl
	rule__CoordinationSlavePortDocu__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group__3__Impl
	rule__CoordinationSlavePortDocu__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3()); }
	(rule__CoordinationSlavePortDocu__UnorderedGroup_3)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePortDocu__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_0__0__Impl
	rule__CoordinationSlavePortDocu__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0()); }
	'SlavePortDescription'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_0__1__Impl
	rule__CoordinationSlavePortDocu__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1()); }
	':'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionAssignment_3_0_2()); }
	(rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePortDocu__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_1__0__Impl
	rule__CoordinationSlavePortDocu__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0()); }
	'DynamicWiringPort'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_1__1__Impl
	rule__CoordinationSlavePortDocu__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1()); }
	':'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringAssignment_3_1_2()); }
	(rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePortDocu__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_2__0__Impl
	rule__CoordinationSlavePortDocu__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0()); }
	'StatePort'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_2__1__Impl
	rule__CoordinationSlavePortDocu__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1()); }
	':'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getStateAssignment_3_2_2()); }
	(rule__CoordinationSlavePortDocu__StateAssignment_3_2_2)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getStateAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePortDocu__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_3__0__Impl
	rule__CoordinationSlavePortDocu__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0()); }
	'ParameterPort'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_3__1__Impl
	rule__CoordinationSlavePortDocu__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1()); }
	':'
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__Group_3_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__Group_3_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterAssignment_3_3_2()); }
	(rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2)
	{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterAssignment_3_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentServiceDocu__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__0__Impl
	rule__ComponentServiceDocu__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0()); }
	'ComponentPort'
	{ after(grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__1__Impl
	rule__ComponentServiceDocu__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getPortAssignment_1()); }
	(rule__ComponentServiceDocu__PortAssignment_1)
	{ after(grammarAccess.getComponentServiceDocuAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__2__Impl
	rule__ComponentServiceDocu__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__3__Impl
	rule__ComponentServiceDocu__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getGroup_3()); }
	(rule__ComponentServiceDocu__Group_3__0)?
	{ after(grammarAccess.getComponentServiceDocuAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__4__Impl
	rule__ComponentServiceDocu__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getStatesAssignment_4()); }
	(rule__ComponentServiceDocu__StatesAssignment_4)*
	{ after(grammarAccess.getComponentServiceDocuAccess().getStatesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentServiceDocu__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group_3__0__Impl
	rule__ComponentServiceDocu__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0()); }
	'Description'
	{ after(grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group_3__1__Impl
	rule__ComponentServiceDocu__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1()); }
	':'
	{ after(grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentServiceDocu__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentServiceDocuAccess().getDescriptionAssignment_3_2()); }
	(rule__ComponentServiceDocu__DescriptionAssignment_3_2)
	{ after(grammarAccess.getComponentServiceDocuAccess().getDescriptionAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentModeDocu__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDocu__Group__0__Impl
	rule__ComponentModeDocu__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0()); }
	'ComponentMode'
	{ after(grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDocu__Group__1__Impl
	rule__ComponentModeDocu__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDocuAccess().getModeAssignment_1()); }
	(rule__ComponentModeDocu__ModeAssignment_1)
	{ after(grammarAccess.getComponentModeDocuAccess().getModeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDocu__Group__2__Impl
	rule__ComponentModeDocu__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDocuAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getComponentModeDocuAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDocu__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDocuAccess().getDescriptionAssignment_3()); }
	(rule__ComponentModeDocu__DescriptionAssignment_3)
	{ after(grammarAccess.getComponentModeDocuAccess().getDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NeutralModeDocu__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NeutralModeDocu__Group__0__Impl
	rule__NeutralModeDocu__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0()); }
	()
	{ after(grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NeutralModeDocu__Group__1__Impl
	rule__NeutralModeDocu__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1()); }
	'NeutralMode'
	{ after(grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NeutralModeDocu__Group__2__Impl
	rule__NeutralModeDocu__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NeutralModeDocu__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNeutralModeDocuAccess().getDescriptionAssignment_3()); }
	(rule__NeutralModeDocu__DescriptionAssignment_3)
	{ after(grammarAccess.getNeutralModeDocuAccess().getDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
	}
:
	rule__ComponentDocumentation__UnorderedGroup_3__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getComponentDocumentationAccess().getGroup_3_0()); }
					(rule__ComponentDocumentation__Group_3_0__0)
					{ after(grammarAccess.getComponentDocumentationAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getComponentDocumentationAccess().getGroup_3_1()); }
					(rule__ComponentDocumentation__Group_3_1__0)
					{ after(grammarAccess.getComponentDocumentationAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getComponentDocumentationAccess().getGroup_3_2()); }
					(rule__ComponentDocumentation__Group_3_2__0)
					{ after(grammarAccess.getComponentDocumentationAccess().getGroup_3_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getComponentDocumentationAccess().getGroup_3_3()); }
					(rule__ComponentDocumentation__Group_3_3__0)
					{ after(grammarAccess.getComponentDocumentationAccess().getGroup_3_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__UnorderedGroup_3__Impl
	rule__ComponentDocumentation__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__UnorderedGroup_3__Impl
	rule__ComponentDocumentation__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__UnorderedGroup_3__Impl
	rule__ComponentDocumentation__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__UnorderedGroup_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDocumentation__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePortDocu__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
	}
:
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_0()); }
					(rule__CoordinationSlavePortDocu__Group_3_0__0)
					{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_1()); }
					(rule__CoordinationSlavePortDocu__Group_3_1__0)
					{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_2()); }
					(rule__CoordinationSlavePortDocu__Group_3_2__0)
					{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_3()); }
					(rule__CoordinationSlavePortDocu__Group_3_3__0)
					{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__UnorderedGroup_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDocumentation__ComponentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__DescriptionAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); }
		ruleEString
		{ after(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__PurposeAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0()); }
		ruleEString
		{ after(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__LicenseAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0()); }
		ruleEString
		{ after(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__HardwareAssignment_3_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0()); }
		ruleEString
		{ after(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDocumentation__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0()); }
		ruleAbstractComponentDocuElement
		{ after(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); }
		ruleEString
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0()); }
		ruleEString
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__StateAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0()); }
		ruleEString
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0()); }
		ruleEString
		{ after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__DescriptionAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0()); }
		ruleEString
		{ after(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentServiceDocu__StatesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0()); }
		ruleAbstractModeDocu
		{ after(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__ModeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDocu__DescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NeutralModeDocu__DescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); }
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
