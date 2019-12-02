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
grammar InternalTaskDefinition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.behavior.taskDefinition.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.behavior.taskDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.behavior.taskDefinition.services.TaskDefinitionGrammarAccess;

}
@parser::members {
	private TaskDefinitionGrammarAccess grammarAccess;

	public void setGrammarAccess(TaskDefinitionGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTaskDefinitionModel
entryRuleTaskDefinitionModel
:
{ before(grammarAccess.getTaskDefinitionModelRule()); }
	 ruleTaskDefinitionModel
{ after(grammarAccess.getTaskDefinitionModelRule()); } 
	 EOF 
;

// Rule TaskDefinitionModel
ruleTaskDefinitionModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskDefinitionModelAccess().getGroup()); }
		(rule__TaskDefinitionModel__Group__0)
		{ after(grammarAccess.getTaskDefinitionModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTaskDefinitionRepository
entryRuleTaskDefinitionRepository
:
{ before(grammarAccess.getTaskDefinitionRepositoryRule()); }
	 ruleTaskDefinitionRepository
{ after(grammarAccess.getTaskDefinitionRepositoryRule()); } 
	 EOF 
;

// Rule TaskDefinitionRepository
ruleTaskDefinitionRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getGroup()); }
		(rule__TaskDefinitionRepository__Group__0)
		{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTaskDefinition
entryRuleTaskDefinition
:
{ before(grammarAccess.getTaskDefinitionRule()); }
	 ruleTaskDefinition
{ after(grammarAccess.getTaskDefinitionRule()); } 
	 EOF 
;

// Rule TaskDefinition
ruleTaskDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getGroup()); }
		(rule__TaskDefinition__Group__0)
		{ after(grammarAccess.getTaskDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTaskResult
entryRuleTaskResult
:
{ before(grammarAccess.getTaskResultRule()); }
	 ruleTaskResult
{ after(grammarAccess.getTaskResultRule()); } 
	 EOF 
;

// Rule TaskResult
ruleTaskResult 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskResultAccess().getGroup()); }
		(rule__TaskResult__Group__0)
		{ after(grammarAccess.getTaskResultAccess().getGroup()); }
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

// Rule TASK_RESULT_TYPES
ruleTASK_RESULT_TYPES
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTASK_RESULT_TYPESAccess().getAlternatives()); }
		(rule__TASK_RESULT_TYPES__Alternatives)
		{ after(grammarAccess.getTASK_RESULT_TYPESAccess().getAlternatives()); }
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

rule__TASK_RESULT_TYPES__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); }
		('SUCCESS')
		{ after(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1()); }
		('ERROR')
		{ after(grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1()); }
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

rule__TaskDefinitionModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionModel__Group__0__Impl
	rule__TaskDefinitionModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0()); }
	()
	{ after(grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionModelAccess().getRepositoryAssignment_1()); }
	(rule__TaskDefinitionModel__RepositoryAssignment_1)?
	{ after(grammarAccess.getTaskDefinitionModelAccess().getRepositoryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskDefinitionRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionRepository__Group__0__Impl
	rule__TaskDefinitionRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0()); }
	'TaskDefinitionRepository'
	{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionRepository__Group__1__Impl
	rule__TaskDefinitionRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getNameAssignment_1()); }
	(rule__TaskDefinitionRepository__NameAssignment_1)
	{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionRepository__Group__2__Impl
	rule__TaskDefinitionRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionRepository__Group__3__Impl
	rule__TaskDefinitionRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksAssignment_3()); }
	(rule__TaskDefinitionRepository__TasksAssignment_3)*
	{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinitionRepository__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__0__Impl
	rule__TaskDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0()); }
	'TaskDefinition'
	{ after(grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__1__Impl
	rule__TaskDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getNameAssignment_1()); }
	(rule__TaskDefinition__NameAssignment_1)
	{ after(grammarAccess.getTaskDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__2__Impl
	rule__TaskDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__3__Impl
	rule__TaskDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getGroup_3()); }
	(rule__TaskDefinition__Group_3__0)?
	{ after(grammarAccess.getTaskDefinitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__4__Impl
	rule__TaskDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getGroup_4()); }
	(rule__TaskDefinition__Group_4__0)?
	{ after(grammarAccess.getTaskDefinitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__5__Impl
	rule__TaskDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5()); }
	'results'
	{ after(grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__6__Impl
	rule__TaskDefinition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__7__Impl
	rule__TaskDefinition__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); }
		(rule__TaskDefinition__ResultsAssignment_7)
		{ after(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); }
	)
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); }
		(rule__TaskDefinition__ResultsAssignment_7)*
		{ after(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__8__Impl
	rule__TaskDefinition__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskDefinition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_3__0__Impl
	rule__TaskDefinition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0()); }
	'in'
	{ after(grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_3__1__Impl
	rule__TaskDefinition__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_3__2__Impl
	rule__TaskDefinition__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getInAttributeAssignment_3_2()); }
	(rule__TaskDefinition__InAttributeAssignment_3_2)*
	{ after(grammarAccess.getTaskDefinitionAccess().getInAttributeAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3()); }
	'}'
	{ after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskDefinition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_4__0__Impl
	rule__TaskDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0()); }
	'out'
	{ after(grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_4__1__Impl
	rule__TaskDefinition__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_4__2__Impl
	rule__TaskDefinition__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getOutAttributeAssignment_4_2()); }
	(rule__TaskDefinition__OutAttributeAssignment_4_2)*
	{ after(grammarAccess.getTaskDefinitionAccess().getOutAttributeAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskDefinition__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskResult__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskResult__Group__0__Impl
	rule__TaskResult__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskResultAccess().getResultAssignment_0()); }
	(rule__TaskResult__ResultAssignment_0)
	{ after(grammarAccess.getTaskResultAccess().getResultAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskResult__Group__1__Impl
	rule__TaskResult__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskResultAccess().getValueKeyword_1()); }
	'value'
	{ after(grammarAccess.getTaskResultAccess().getValueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskResult__Group__2__Impl
	rule__TaskResult__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskResult__Group__3__Impl
	rule__TaskResult__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskResultAccess().getResultValueAssignment_3()); }
	(rule__TaskResult__ResultValueAssignment_3)
	{ after(grammarAccess.getTaskResultAccess().getResultValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskResult__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskResultAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getTaskResultAccess().getSemicolonKeyword_4()); }
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
	{ before(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); }
	(rule__AttributeDefinition__DocumentationAssignment_0)?
	{ after(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); }
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
	{ before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); }
	(rule__AttributeDefinition__NameAssignment_1)
	{ after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); }
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
	{ before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); }
	(rule__AttributeDefinition__TypeAssignment_3)
	{ after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); }
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
	rule__AttributeDefinition__Group__5
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
	{ before(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); }
	(rule__AttributeDefinition__Group_4__0)?
	{ after(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeDefinition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group_4__0__Impl
	rule__AttributeDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); }
	'='
	{ after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeDefinition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); }
	(rule__AttributeDefinition__DefaultvalueAssignment_4_1)
	{ after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); }
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


rule__TaskDefinitionModel__RepositoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionModelAccess().getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0()); }
		ruleTaskDefinitionRepository
		{ after(grammarAccess.getTaskDefinitionModelAccess().getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinitionRepository__TasksAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksTaskDefinitionParserRuleCall_3_0()); }
		ruleTaskDefinition
		{ after(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksTaskDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__InAttributeAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getTaskDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__OutAttributeAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getTaskDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskDefinition__ResultsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskDefinitionAccess().getResultsTaskResultParserRuleCall_7_0()); }
		ruleTaskResult
		{ after(grammarAccess.getTaskDefinitionAccess().getResultsTaskResultParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__ResultAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskResultAccess().getResultTASK_RESULT_TYPESEnumRuleCall_0_0()); }
		ruleTASK_RESULT_TYPES
		{ after(grammarAccess.getTaskResultAccess().getResultTASK_RESULT_TYPESEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskResult__ResultValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskResultAccess().getResultValueEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getTaskResultAccess().getResultValueEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); }
		ruleAbstractAttributeType
		{ after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeDefinition__DefaultvalueAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); }
		ruleAbstractValue
		{ after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); }
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
