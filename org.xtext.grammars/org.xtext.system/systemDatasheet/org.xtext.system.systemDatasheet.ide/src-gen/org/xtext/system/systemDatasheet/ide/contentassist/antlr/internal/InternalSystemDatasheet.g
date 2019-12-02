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
grammar InternalSystemDatasheet;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.systemDatasheet.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.systemDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess;

}
@parser::members {
	private SystemDatasheetGrammarAccess grammarAccess;

	public void setGrammarAccess(SystemDatasheetGrammarAccess grammarAccess) {
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

// Entry rule entryRuleSystemDatasheet
entryRuleSystemDatasheet
:
{ before(grammarAccess.getSystemDatasheetRule()); }
	 ruleSystemDatasheet
{ after(grammarAccess.getSystemDatasheetRule()); } 
	 EOF 
;

// Rule SystemDatasheet
ruleSystemDatasheet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSystemDatasheetAccess().getGroup()); }
		(rule__SystemDatasheet__Group__0)
		{ after(grammarAccess.getSystemDatasheetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}


// Rule GenericDatasheetModel
ruleGenericDatasheetModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); }
		(rule__GenericDatasheetModel__ElementsAssignment)*
		{ after(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractDatasheetElement
entryRuleAbstractDatasheetElement
:
{ before(grammarAccess.getAbstractDatasheetElementRule()); }
	 ruleAbstractDatasheetElement
{ after(grammarAccess.getAbstractDatasheetElementRule()); } 
	 EOF 
;

// Rule AbstractDatasheetElement
ruleAbstractDatasheetElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); }
		(rule__AbstractDatasheetElement__Alternatives)
		{ after(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDatasheetProperty
entryRuleDatasheetProperty
:
{ before(grammarAccess.getDatasheetPropertyRule()); }
	 ruleDatasheetProperty
{ after(grammarAccess.getDatasheetPropertyRule()); } 
	 EOF 
;

// Rule DatasheetProperty
ruleDatasheetProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getGroup()); }
		(rule__DatasheetProperty__Group__0)
		{ after(grammarAccess.getDatasheetPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMandatoryDatasheetElement
entryRuleMandatoryDatasheetElement
:
{ before(grammarAccess.getMandatoryDatasheetElementRule()); }
	 ruleMandatoryDatasheetElement
{ after(grammarAccess.getMandatoryDatasheetElementRule()); } 
	 EOF 
;

// Rule MandatoryDatasheetElement
ruleMandatoryDatasheetElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); }
		(rule__MandatoryDatasheetElement__Group__0)
		{ after(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule MandatoryDatasheetElementNames
ruleMandatoryDatasheetElementNames
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); }
		(rule__MandatoryDatasheetElementNames__Alternatives)
		{ after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDatasheetElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); }
		ruleDatasheetProperty
		{ after(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); }
		ruleMandatoryDatasheetElement
		{ after(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElementNames__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); }
		('BaseURI')
		{ after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); }
		('ShortDescription')
		{ after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__0__Impl
	rule__SystemDatasheet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0()); }
	()
	{ after(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__1__Impl
	rule__SystemDatasheet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1()); }
	'SystemDatasheet'
	{ after(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__2__Impl
	rule__SystemDatasheet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getNameAssignment_2()); }
	(rule__SystemDatasheet__NameAssignment_2)
	{ after(grammarAccess.getSystemDatasheetAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__3__Impl
	rule__SystemDatasheet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__4__Impl
	rule__SystemDatasheet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4()); }
	ruleGenericDatasheetModel
	{ after(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemDatasheet__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemDatasheet__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group__0__Impl
	rule__DatasheetProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); }
	'DatasheetProperty'
	{ after(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group__1__Impl
	rule__DatasheetProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); }
	(rule__DatasheetProperty__NameAssignment_1)
	{ after(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group__2__Impl
	rule__DatasheetProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group__3__Impl
	rule__DatasheetProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); }
	(rule__DatasheetProperty__UnorderedGroup_3)
	{ after(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_0__0__Impl
	rule__DatasheetProperty__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); }
	'value'
	{ after(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_0__1__Impl
	rule__DatasheetProperty__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); }
	(rule__DatasheetProperty__ValueAssignment_3_0_1)
	{ after(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); }
	(rule__DatasheetProperty__Group_3_0_2__0)?
	{ after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__Group_3_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_0_2__0__Impl
	rule__DatasheetProperty__Group_3_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); }
	'unit'
	{ after(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); }
	(rule__DatasheetProperty__UnitAssignment_3_0_2_1)
	{ after(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_1__0__Impl
	rule__DatasheetProperty__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); }
	'shortDescription'
	{ after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); }
	(rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1)
	{ after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_2__0__Impl
	rule__DatasheetProperty__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); }
	'semanticID'
	{ after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); }
	(rule__DatasheetProperty__SemanticIDAssignment_3_2_1)
	{ after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MandatoryDatasheetElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MandatoryDatasheetElement__Group__0__Impl
	rule__MandatoryDatasheetElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); }
	(rule__MandatoryDatasheetElement__NameAssignment_0)
	{ after(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MandatoryDatasheetElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); }
	(rule__MandatoryDatasheetElement__ValueAssignment_1)
	{ after(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DatasheetProperty__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
	}
:
	rule__DatasheetProperty__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); }
					(rule__DatasheetProperty__Group_3_0__0)
					{ after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); }
					(rule__DatasheetProperty__Group_3_1__0)
					{ after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); }
					(rule__DatasheetProperty__Group_3_2__0)
					{ after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__UnorderedGroup_3__Impl
	rule__DatasheetProperty__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__UnorderedGroup_3__Impl
	rule__DatasheetProperty__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DatasheetProperty__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__SystemDatasheet__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GenericDatasheetModel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0()); }
		ruleAbstractDatasheetElement
		{ after(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__ValueAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__UnitAssignment_3_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DatasheetProperty__SemanticIDAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElement__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0()); }
		ruleMandatoryDatasheetElementNames
		{ after(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryDatasheetElement__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0()); }
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
