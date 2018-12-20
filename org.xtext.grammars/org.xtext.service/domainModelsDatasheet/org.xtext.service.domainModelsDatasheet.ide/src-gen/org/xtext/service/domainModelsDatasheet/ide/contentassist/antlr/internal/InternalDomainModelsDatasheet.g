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
grammar InternalDomainModelsDatasheet;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.domainModelsDatasheet.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.domainModelsDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;

}
@parser::members {
	private DomainModelsDatasheetGrammarAccess grammarAccess;

	public void setGrammarAccess(DomainModelsDatasheetGrammarAccess grammarAccess) {
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

// Entry rule entryRuleDomainModelsDatasheet
entryRuleDomainModelsDatasheet
:
{ before(grammarAccess.getDomainModelsDatasheetRule()); }
	 ruleDomainModelsDatasheet
{ after(grammarAccess.getDomainModelsDatasheetRule()); } 
	 EOF 
;

// Rule DomainModelsDatasheet
ruleDomainModelsDatasheet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainModelsDatasheetAccess().getGroup()); }
		(rule__DomainModelsDatasheet__Group__0)
		{ after(grammarAccess.getDomainModelsDatasheetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule GenericDatasheet
ruleGenericDatasheet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); }
		(rule__GenericDatasheet__UnorderedGroup)
		{ after(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractLicense
entryRuleAbstractLicense
:
{ before(grammarAccess.getAbstractLicenseRule()); }
	 ruleAbstractLicense
{ after(grammarAccess.getAbstractLicenseRule()); } 
	 EOF 
;

// Rule AbstractLicense
ruleAbstractLicense 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractLicenseAccess().getAlternatives()); }
		(rule__AbstractLicense__Alternatives)
		{ after(grammarAccess.getAbstractLicenseAccess().getAlternatives()); }
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

// Entry rule entryRuleSpdxLicense
entryRuleSpdxLicense
:
{ before(grammarAccess.getSpdxLicenseRule()); }
	 ruleSpdxLicense
{ after(grammarAccess.getSpdxLicenseRule()); } 
	 EOF 
;

// Rule SpdxLicense
ruleSpdxLicense 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpdxLicenseAccess().getGroup()); }
		(rule__SpdxLicense__Group__0)
		{ after(grammarAccess.getSpdxLicenseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProprietaryLicense
entryRuleProprietaryLicense
:
{ before(grammarAccess.getProprietaryLicenseRule()); }
	 ruleProprietaryLicense
{ after(grammarAccess.getProprietaryLicenseRule()); } 
	 EOF 
;

// Rule ProprietaryLicense
ruleProprietaryLicense 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProprietaryLicenseAccess().getGroup()); }
		(rule__ProprietaryLicense__Group__0)
		{ after(grammarAccess.getProprietaryLicenseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TRL
ruleTRL
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTRLAccess().getAlternatives()); }
		(rule__TRL__Alternatives)
		{ after(grammarAccess.getTRLAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractLicense__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); }
		ruleSpdxLicense
		{ after(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1()); }
		ruleProprietaryLicense
		{ after(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TRL__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); }
		('Level1')
		{ after(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); }
		('Level2')
		{ after(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); }
		('Level3')
		{ after(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); }
		('Level4')
		{ after(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); }
		('Level5')
		{ after(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); }
		('Level6')
		{ after(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); }
		('Level7')
		{ after(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); }
		('Level8')
		{ after(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); }
		('Level9')
		{ after(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); }
		('Undefined')
		{ after(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainModelsDatasheet__Group__0__Impl
	rule__DomainModelsDatasheet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0()); }
	'DomainModelsDatasheet'
	{ after(grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainModelsDatasheet__Group__1__Impl
	rule__DomainModelsDatasheet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1()); }
	(rule__DomainModelsDatasheet__NameAssignment_1)
	{ after(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainModelsDatasheet__Group__2__Impl
	rule__DomainModelsDatasheet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainModelsDatasheet__Group__3__Impl
	rule__DomainModelsDatasheet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetParserRuleCall_3()); }
	ruleGenericDatasheet
	{ after(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainModelsDatasheet__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainModelsDatasheet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_0__0__Impl
	rule__GenericDatasheet__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); }
	'baseURI'
	{ after(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_0__1__Impl
	rule__GenericDatasheet__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); }
	(rule__GenericDatasheet__BaseURIAssignment_0_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_1__0__Impl
	rule__GenericDatasheet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getShortDescritionKeyword_1_0()); }
	'shortDescrition'
	{ after(grammarAccess.getGenericDatasheetAccess().getShortDescritionKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_1__1__Impl
	rule__GenericDatasheet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getShortDescritionAssignment_1_2()); }
	(rule__GenericDatasheet__ShortDescritionAssignment_1_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getShortDescritionAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_2__0__Impl
	rule__GenericDatasheet__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); }
	'longDescription'
	{ after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_2__1__Impl
	rule__GenericDatasheet__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); }
	(rule__GenericDatasheet__LongDescriptionAssignment_2_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_3__0__Impl
	rule__GenericDatasheet__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); }
	'supplierDescription'
	{ after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_3__1__Impl
	rule__GenericDatasheet__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); }
	(rule__GenericDatasheet__SupplierDescriptionAssignment_3_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_4__0__Impl
	rule__GenericDatasheet__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); }
	'homepage'
	{ after(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_4__1__Impl
	rule__GenericDatasheet__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); }
	(rule__GenericDatasheet__HomepageAssignment_4_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_5__0__Impl
	rule__GenericDatasheet__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); }
	'trl'
	{ after(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_5__1__Impl
	rule__GenericDatasheet__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); }
	(rule__GenericDatasheet__TrlAssignment_5_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_6__0__Impl
	rule__GenericDatasheet__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); }
	'license'
	{ after(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_6__1__Impl
	rule__GenericDatasheet__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); }
	(':')?
	{ after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); }
	(rule__GenericDatasheet__LicenseAssignment_6_2)
	{ after(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpdxLicense__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpdxLicense__Group__0__Impl
	rule__SpdxLicense__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); }
	'spdx'
	{ after(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpdxLicense__Group__1__Impl
	rule__SpdxLicense__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpdxLicense__Group__2__Impl
	rule__SpdxLicense__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); }
	(rule__SpdxLicense__LicenseIDAssignment_2)
	{ after(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpdxLicense__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProprietaryLicense__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group__0__Impl
	rule__ProprietaryLicense__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); }
	()
	{ after(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group__1__Impl
	rule__ProprietaryLicense__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); }
	'proprietary'
	{ after(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group__2__Impl
	rule__ProprietaryLicense__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group__3__Impl
	rule__ProprietaryLicense__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); }
	(rule__ProprietaryLicense__UnorderedGroup_3)
	{ after(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProprietaryLicense__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_0__0__Impl
	rule__ProprietaryLicense__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); }
	'name'
	{ after(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_0__1__Impl
	rule__ProprietaryLicense__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); }
	(':')?
	{ after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); }
	(rule__ProprietaryLicense__NameAssignment_3_0_2)
	{ after(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProprietaryLicense__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_1__0__Impl
	rule__ProprietaryLicense__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); }
	'fullText'
	{ after(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_1__1__Impl
	rule__ProprietaryLicense__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); }
	(':')?
	{ after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); }
	(rule__ProprietaryLicense__FullTextAssignment_3_1_2)
	{ after(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProprietaryLicense__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_2__0__Impl
	rule__ProprietaryLicense__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); }
	'URL'
	{ after(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_2__1__Impl
	rule__ProprietaryLicense__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); }
	(':')?
	{ after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); }
	(rule__ProprietaryLicense__UrlAssignment_3_2_2)
	{ after(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GenericDatasheet__UnorderedGroup
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
	}
:
	rule__GenericDatasheet__UnorderedGroup__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_0()); }
					(rule__GenericDatasheet__Group_0__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_1()); }
					(rule__GenericDatasheet__Group_1__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_2()); }
					(rule__GenericDatasheet__Group_2__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_3()); }
					(rule__GenericDatasheet__Group_3__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_4()); }
					(rule__GenericDatasheet__Group_4__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_4()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_5()); }
					(rule__GenericDatasheet__Group_5__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_5()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getGenericDatasheetAccess().getGroup_6()); }
					(rule__GenericDatasheet__Group_6__0)
					{ after(grammarAccess.getGenericDatasheetAccess().getGroup_6()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__5?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
	rule__GenericDatasheet__UnorderedGroup__6?
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__UnorderedGroup__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GenericDatasheet__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ProprietaryLicense__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
	}
:
	rule__ProprietaryLicense__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); }
					(rule__ProprietaryLicense__Group_3_0__0)
					{ after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); }
					(rule__ProprietaryLicense__Group_3_1__0)
					{ after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); }
					(rule__ProprietaryLicense__Group_3_2__0)
					{ after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__UnorderedGroup_3__Impl
	rule__ProprietaryLicense__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__UnorderedGroup_3__Impl
	rule__ProprietaryLicense__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProprietaryLicense__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__DomainModelsDatasheet__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainModelsDatasheetAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDomainModelsDatasheetAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__BaseURIAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0()); }
		ruleEString
		{ after(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__ShortDescritionAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getShortDescritionEStringParserRuleCall_1_2_0()); }
		ruleEString
		{ after(grammarAccess.getGenericDatasheetAccess().getShortDescritionEStringParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__LongDescriptionAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0()); }
		RULE_TEXT_BLOCK
		{ after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__SupplierDescriptionAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0()); }
		ruleEString
		{ after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__HomepageAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0()); }
		ruleEString
		{ after(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__TrlAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0()); }
		ruleTRL
		{ after(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheet__LicenseAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0()); }
		ruleAbstractLicense
		{ after(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpdxLicense__LicenseIDAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__NameAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0()); }
		ruleEString
		{ after(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__FullTextAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0()); }
		ruleEString
		{ after(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProprietaryLicense__UrlAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0()); }
		ruleEString
		{ after(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_TEXT_BLOCK : '$%' ( options {greedy=false;} : . )*'%$';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
