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
grammar InternalSkillDefinition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.skillDefinition.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.skillDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.service.skillDefinition.services.SkillDefinitionGrammarAccess;

}
@parser::members {
	private SkillDefinitionGrammarAccess grammarAccess;

	public void setGrammarAccess(SkillDefinitionGrammarAccess grammarAccess) {
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

// Entry rule entryRuleSkillDefinitionModel
entryRuleSkillDefinitionModel
:
{ before(grammarAccess.getSkillDefinitionModelRule()); }
	 ruleSkillDefinitionModel
{ after(grammarAccess.getSkillDefinitionModelRule()); } 
	 EOF 
;

// Rule SkillDefinitionModel
ruleSkillDefinitionModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillDefinitionModelAccess().getGroup()); }
		(rule__SkillDefinitionModel__Group__0)
		{ after(grammarAccess.getSkillDefinitionModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSkillDefinitionRepository
entryRuleSkillDefinitionRepository
:
{ before(grammarAccess.getSkillDefinitionRepositoryRule()); }
	 ruleSkillDefinitionRepository
{ after(grammarAccess.getSkillDefinitionRepositoryRule()); } 
	 EOF 
;

// Rule SkillDefinitionRepository
ruleSkillDefinitionRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getGroup()); }
		(rule__SkillDefinitionRepository__Group__0)
		{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationModuleDefinition
entryRuleCoordinationModuleDefinition
:
{ before(grammarAccess.getCoordinationModuleDefinitionRule()); }
	 ruleCoordinationModuleDefinition
{ after(grammarAccess.getCoordinationModuleDefinitionRule()); } 
	 EOF 
;

// Rule CoordinationModuleDefinition
ruleCoordinationModuleDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getGroup()); }
		(rule__CoordinationModuleDefinition__Group__0)
		{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSkillDefinition
entryRuleSkillDefinition
:
{ before(grammarAccess.getSkillDefinitionRule()); }
	 ruleSkillDefinition
{ after(grammarAccess.getSkillDefinitionRule()); } 
	 EOF 
;

// Rule SkillDefinition
ruleSkillDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getGroup()); }
		(rule__SkillDefinition__Group__0)
		{ after(grammarAccess.getSkillDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSkillResult
entryRuleSkillResult
:
{ before(grammarAccess.getSkillResultRule()); }
	 ruleSkillResult
{ after(grammarAccess.getSkillResultRule()); } 
	 EOF 
;

// Rule SkillResult
ruleSkillResult 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillResultAccess().getGroup()); }
		(rule__SkillResult__Group__0)
		{ after(grammarAccess.getSkillResultAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeDefinition
entryRuleAttributeDefinition
:
{ before(grammarAccess.getAttributeDefinitionRule()); }
	 ruleAttributeDefinition
{ after(grammarAccess.getAttributeDefinitionRule()); } 
	 EOF 
;

// Rule AttributeDefinition
ruleAttributeDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getGroup()); }
		(rule__AttributeDefinition__Group__0)
		{ after(grammarAccess.getAttributeDefinitionAccess().getGroup()); }
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

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
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

// Entry rule entryRuleEDouble
entryRuleEDouble
:
{ before(grammarAccess.getEDoubleRule()); }
	 ruleEDouble
{ after(grammarAccess.getEDoubleRule()); } 
	 EOF 
;

// Rule EDouble
ruleEDouble 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDoubleAccess().getGroup()); }
		(rule__EDouble__Group__0)
		{ after(grammarAccess.getEDoubleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationElement
entryRuleEnumerationElement
:
{ before(grammarAccess.getEnumerationElementRule()); }
	 ruleEnumerationElement
{ after(grammarAccess.getEnumerationElementRule()); } 
	 EOF 
;

// Rule EnumerationElement
ruleEnumerationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationElementAccess().getGroup()); }
		(rule__EnumerationElement__Group__0)
		{ after(grammarAccess.getEnumerationElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractAttributeType
entryRuleAbstractAttributeType
:
{ before(grammarAccess.getAbstractAttributeTypeRule()); }
	 ruleAbstractAttributeType
{ after(grammarAccess.getAbstractAttributeTypeRule()); } 
	 EOF 
;

// Rule AbstractAttributeType
ruleAbstractAttributeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); }
		(rule__AbstractAttributeType__Alternatives)
		{ after(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInlineEnumerationType
entryRuleInlineEnumerationType
:
{ before(grammarAccess.getInlineEnumerationTypeRule()); }
	 ruleInlineEnumerationType
{ after(grammarAccess.getInlineEnumerationTypeRule()); } 
	 EOF 
;

// Rule InlineEnumerationType
ruleInlineEnumerationType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); }
		(rule__InlineEnumerationType__Group__0)
		{ after(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayType
entryRuleArrayType
:
{ before(grammarAccess.getArrayTypeRule()); }
	 ruleArrayType
{ after(grammarAccess.getArrayTypeRule()); } 
	 EOF 
;

// Rule ArrayType
ruleArrayType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayTypeAccess().getGroup()); }
		(rule__ArrayType__Group__0)
		{ after(grammarAccess.getArrayTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCardinality
entryRuleCardinality
:
{ before(grammarAccess.getCardinalityRule()); }
	 ruleCardinality
{ after(grammarAccess.getCardinalityRule()); } 
	 EOF 
;

// Rule Cardinality
ruleCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCardinalityAccess().getAlternatives()); }
		(rule__Cardinality__Alternatives)
		{ after(grammarAccess.getCardinalityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType
:
{ before(grammarAccess.getPrimitiveTypeRule()); }
	 rulePrimitiveType
{ after(grammarAccess.getPrimitiveTypeRule()); } 
	 EOF 
;

// Rule PrimitiveType
rulePrimitiveType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
		(rule__PrimitiveType__Group__0)
		{ after(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractValue
entryRuleAbstractValue
:
{ before(grammarAccess.getAbstractValueRule()); }
	 ruleAbstractValue
{ after(grammarAccess.getAbstractValueRule()); } 
	 EOF 
;

// Rule AbstractValue
ruleAbstractValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractValueAccess().getAlternatives()); }
		(rule__AbstractValue__Alternatives)
		{ after(grammarAccess.getAbstractValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayValue
entryRuleArrayValue
:
{ before(grammarAccess.getArrayValueRule()); }
	 ruleArrayValue
{ after(grammarAccess.getArrayValueRule()); } 
	 EOF 
;

// Rule ArrayValue
ruleArrayValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayValueAccess().getGroup()); }
		(rule__ArrayValue__Group__0)
		{ after(grammarAccess.getArrayValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSingleValue
entryRuleSingleValue
:
{ before(grammarAccess.getSingleValueRule()); }
	 ruleSingleValue
{ after(grammarAccess.getSingleValueRule()); } 
	 EOF 
;

// Rule SingleValue
ruleSingleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSingleValueAccess().getAlternatives()); }
		(rule__SingleValue__Alternatives)
		{ after(grammarAccess.getSingleValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule SKILL_RESULT_TYPES
ruleSKILL_RESULT_TYPES
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSKILL_RESULT_TYPESAccess().getAlternatives()); }
		(rule__SKILL_RESULT_TYPES__Alternatives)
		{ after(grammarAccess.getSKILL_RESULT_TYPESAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule PRIMITIVE_TYPE_NAME
rulePRIMITIVE_TYPE_NAME
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); }
		(rule__PRIMITIVE_TYPE_NAME__Alternatives)
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Alternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); }
		'E'
		{ after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); }
		'e'
		{ after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractAttributeType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
		rulePrimitiveType
		{ after(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); }
		ruleInlineEnumerationType
		{ after(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); }
		'*'
		{ after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0()); }
		ruleSingleValue
		{ after(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1()); }
		ruleArrayValue
		{ after(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getGroup_0()); }
		(rule__SingleValue__Group_0__0)
		{ after(grammarAccess.getSingleValueAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getSingleValueAccess().getGroup_1()); }
		(rule__SingleValue__Group_1__0)
		{ after(grammarAccess.getSingleValueAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getSingleValueAccess().getGroup_2()); }
		(rule__SingleValue__Group_2__0)
		{ after(grammarAccess.getSingleValueAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getSingleValueAccess().getGroup_3()); }
		(rule__SingleValue__Group_3__0)
		{ after(grammarAccess.getSingleValueAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getSingleValueAccess().getGroup_4()); }
		(rule__SingleValue__Group_4__0)
		{ after(grammarAccess.getSingleValueAccess().getGroup_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SKILL_RESULT_TYPES__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); }
		('ERROR')
		{ after(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1()); }
		('SUCCESS')
		{ after(grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PRIMITIVE_TYPE_NAME__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); }
		('Int8')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); }
		('Int16')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); }
		('Int32')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); }
		('Int64')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); }
		('UInt8')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); }
		('UInt16')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); }
		('UInt32')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); }
		('UInt64')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); }
		('Float')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); }
		('Double')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); }
		('String')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); }
	)
	|
	(
		{ before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); }
		('Boolean')
		{ after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionModel__Group__0__Impl
	rule__SkillDefinitionModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0()); }
	()
	{ after(grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionModelAccess().getRepositoryAssignment_1()); }
	(rule__SkillDefinitionModel__RepositoryAssignment_1)?
	{ after(grammarAccess.getSkillDefinitionModelAccess().getRepositoryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillDefinitionRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionRepository__Group__0__Impl
	rule__SkillDefinitionRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0()); }
	'SkillDefinitionRepository'
	{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionRepository__Group__1__Impl
	rule__SkillDefinitionRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getNameAssignment_1()); }
	(rule__SkillDefinitionRepository__NameAssignment_1)
	{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionRepository__Group__2__Impl
	rule__SkillDefinitionRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionRepository__Group__3__Impl
	rule__SkillDefinitionRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesAssignment_3()); }
	(rule__SkillDefinitionRepository__ModulesAssignment_3)*
	{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinitionRepository__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationModuleDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleDefinition__Group__0__Impl
	rule__CoordinationModuleDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0()); }
	'CoordinationModuleDefinition'
	{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleDefinition__Group__1__Impl
	rule__CoordinationModuleDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getNameAssignment_1()); }
	(rule__CoordinationModuleDefinition__NameAssignment_1)
	{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleDefinition__Group__2__Impl
	rule__CoordinationModuleDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleDefinition__Group__3__Impl
	rule__CoordinationModuleDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsAssignment_3()); }
	(rule__CoordinationModuleDefinition__SkillsAssignment_3)*
	{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__0__Impl
	rule__SkillDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0()); }
	'SkillDefinition'
	{ after(grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__1__Impl
	rule__SkillDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); }
	(rule__SkillDefinition__NameAssignment_1)
	{ after(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__2__Impl
	rule__SkillDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__3__Impl
	rule__SkillDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getGroup_3()); }
	(rule__SkillDefinition__Group_3__0)?
	{ after(grammarAccess.getSkillDefinitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__4__Impl
	rule__SkillDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getGroup_4()); }
	(rule__SkillDefinition__Group_4__0)?
	{ after(grammarAccess.getSkillDefinitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__5__Impl
	rule__SkillDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5()); }
	'results'
	{ after(grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__6__Impl
	rule__SkillDefinition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__7__Impl
	rule__SkillDefinition__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); }
		(rule__SkillDefinition__ResultsAssignment_7)
		{ after(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); }
	)
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); }
		(rule__SkillDefinition__ResultsAssignment_7)*
		{ after(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__8__Impl
	rule__SkillDefinition__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillDefinition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_3__0__Impl
	rule__SkillDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0()); }
	'in'
	{ after(grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_3__1__Impl
	rule__SkillDefinition__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_3__2__Impl
	rule__SkillDefinition__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getInAttributeAssignment_3_2()); }
	(rule__SkillDefinition__InAttributeAssignment_3_2)*
	{ after(grammarAccess.getSkillDefinitionAccess().getInAttributeAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3()); }
	'}'
	{ after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillDefinition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_4__0__Impl
	rule__SkillDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0()); }
	'out'
	{ after(grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_4__1__Impl
	rule__SkillDefinition__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_4__2__Impl
	rule__SkillDefinition__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getOutAttributeAssignment_4_2()); }
	(rule__SkillDefinition__OutAttributeAssignment_4_2)*
	{ after(grammarAccess.getSkillDefinitionAccess().getOutAttributeAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillDefinition__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillResult__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillResult__Group__0__Impl
	rule__SkillResult__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillResultAccess().getResultAssignment_0()); }
	(rule__SkillResult__ResultAssignment_0)
	{ after(grammarAccess.getSkillResultAccess().getResultAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillResult__Group__1__Impl
	rule__SkillResult__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillResultAccess().getValueKeyword_1()); }
	'value'
	{ after(grammarAccess.getSkillResultAccess().getValueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillResult__Group__2__Impl
	rule__SkillResult__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillResult__Group__3__Impl
	rule__SkillResult__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillResultAccess().getResultValueAssignment_3()); }
	(rule__SkillResult__ResultValueAssignment_3)
	{ after(grammarAccess.getSkillResultAccess().getResultValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillResult__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillResultAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getSkillResultAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__0__Impl
	rule__AttributeDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); }
	(rule__AttributeDefinition__NameAssignment_0)
	{ after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__1__Impl
	rule__AttributeDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__2__Impl
	rule__AttributeDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); }
	(rule__AttributeDefinition__TypeAssignment_2)
	{ after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__3__Impl
	rule__AttributeDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); }
	(rule__AttributeDefinition__Group_3__0)?
	{ after(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeDefinition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group_3__0__Impl
	rule__AttributeDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); }
	(rule__AttributeDefinition__DefaultvalueAssignment_3_1)
	{ after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); }
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


rule__EDouble__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__0__Impl
	rule__EDouble__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__1__Impl
	rule__EDouble__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); }
	(RULE_INT)?
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__2__Impl
	rule__EDouble__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__3__Impl
	rule__EDouble__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); }
	RULE_INT
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getGroup_4()); }
	(rule__EDouble__Group_4__0)?
	{ after(grammarAccess.getEDoubleAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EDouble__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__0__Impl
	rule__EDouble__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); }
	(rule__EDouble__Alternatives_4_0)
	{ after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__1__Impl
	rule__EDouble__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); }
	('-')?
	{ after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); }
	RULE_INT
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationElement__Group__0__Impl
	rule__EnumerationElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); }
	(rule__EnumerationElement__NameAssignment_0)
	{ after(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationElement__Group__1__Impl
	rule__EnumerationElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationElementAccess().getGroup_1()); }
	(rule__EnumerationElement__Group_1__0)?
	{ after(grammarAccess.getEnumerationElementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationElement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationElement__Group_1__0__Impl
	rule__EnumerationElement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); }
	'='
	{ after(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationElement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); }
	(rule__EnumerationElement__ValueAssignment_1_1)
	{ after(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InlineEnumerationType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InlineEnumerationType__Group__0__Impl
	rule__InlineEnumerationType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); }
	'InlineEnumeration'
	{ after(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InlineEnumerationType__Group__1__Impl
	rule__InlineEnumerationType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); }
	(rule__InlineEnumerationType__ArrayAssignment_1)?
	{ after(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InlineEnumerationType__Group__2__Impl
	rule__InlineEnumerationType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InlineEnumerationType__Group__3__Impl
	rule__InlineEnumerationType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); }
		(rule__InlineEnumerationType__EnumsAssignment_3)
		{ after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); }
	)
	(
		{ before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); }
		(rule__InlineEnumerationType__EnumsAssignment_3)*
		{ after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InlineEnumerationType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayType__Group__0__Impl
	rule__ArrayType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); }
	()
	{ after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayType__Group__1__Impl
	rule__ArrayType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayType__Group__2__Impl
	rule__ArrayType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); }
	(rule__ArrayType__LengthAssignment_2)?
	{ after(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimitiveType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__0__Impl
	rule__PrimitiveType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); }
	(rule__PrimitiveType__TypeNameAssignment_0)
	{ after(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); }
	(rule__PrimitiveType__ArrayAssignment_1)?
	{ after(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__0__Impl
	rule__ArrayValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__1__Impl
	rule__ArrayValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); }
	(rule__ArrayValue__ValuesAssignment_1)
	{ after(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__2__Impl
	rule__ArrayValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getGroup_2()); }
	(rule__ArrayValue__Group_2__0)*
	{ after(grammarAccess.getArrayValueAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayValue__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2__0__Impl
	rule__ArrayValue__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); }
	(rule__ArrayValue__ValuesAssignment_2_1)
	{ after(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValue__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_0__0__Impl
	rule__SingleValue__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); }
	(rule__SingleValue__ValueAssignment_0_1)
	{ after(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_1__0__Impl
	rule__SingleValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); }
	(rule__SingleValue__ValueAssignment_1_1)
	{ after(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValue__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_2__0__Impl
	rule__SingleValue__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); }
	(rule__SingleValue__ValueAssignment_2_1)
	{ after(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValue__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_3__0__Impl
	rule__SingleValue__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); }
	(rule__SingleValue__ValueAssignment_3_1)
	{ after(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValue__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_4__0__Impl
	rule__SingleValue__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); }
	(rule__SingleValue__ValueAssignment_4_1)
	{ after(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillDefinitionModel__RepositoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionModelAccess().getRepositorySkillDefinitionRepositoryParserRuleCall_1_0()); }
		ruleSkillDefinitionRepository
		{ after(grammarAccess.getSkillDefinitionModelAccess().getRepositorySkillDefinitionRepositoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinitionRepository__ModulesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesCoordinationModuleDefinitionParserRuleCall_3_0()); }
		ruleCoordinationModuleDefinition
		{ after(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesCoordinationModuleDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleDefinition__SkillsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsSkillDefinitionParserRuleCall_3_0()); }
		ruleSkillDefinition
		{ after(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsSkillDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__InAttributeAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getSkillDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__OutAttributeAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getSkillDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillDefinition__ResultsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillDefinitionAccess().getResultsSkillResultParserRuleCall_7_0()); }
		ruleSkillResult
		{ after(grammarAccess.getSkillDefinitionAccess().getResultsSkillResultParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__ResultAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0()); }
		ruleSKILL_RESULT_TYPES
		{ after(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillResult__ResultValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); }
		ruleAbstractAttributeType
		{ after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__DefaultvalueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); }
		ruleAbstractValue
		{ after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationElement__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0()); }
		ruleEInt
		{ after(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__ArrayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); }
		ruleArrayType
		{ after(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InlineEnumerationType__EnumsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0()); }
		ruleEnumerationElement
		{ after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayType__LengthAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0()); }
		ruleCardinality
		{ after(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__TypeNameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0()); }
		rulePRIMITIVE_TYPE_NAME
		{ after(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__ArrayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); }
		ruleArrayType
		{ after(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__ValuesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0()); }
		ruleSingleValue
		{ after(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__ValuesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0()); }
		ruleSingleValue
		{ after(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); }
		ruleEInt
		{ after(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); }
		ruleEDouble
		{ after(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__ValueAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); }
		ruleEBoolean
		{ after(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__ValueAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); }
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
