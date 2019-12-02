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
grammar InternalCommunicationObject;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.communicationObject.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.communicationObject.ide.contentassist.antlr.internal;

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
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;

}
@parser::members {
	private CommunicationObjectGrammarAccess grammarAccess;

	public void setGrammarAccess(CommunicationObjectGrammarAccess grammarAccess) {
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

// Entry rule entryRuleCommObjectModel
entryRuleCommObjectModel
:
{ before(grammarAccess.getCommObjectModelRule()); }
	 ruleCommObjectModel
{ after(grammarAccess.getCommObjectModelRule()); } 
	 EOF 
;

// Rule CommObjectModel
ruleCommObjectModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommObjectModelAccess().getGroup()); }
		(rule__CommObjectModel__Group__0)
		{ after(grammarAccess.getCommObjectModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFQNW
entryRuleFQNW
:
{ before(grammarAccess.getFQNWRule()); }
	 ruleFQNW
{ after(grammarAccess.getFQNWRule()); } 
	 EOF 
;

// Rule FQNW
ruleFQNW 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNWAccess().getGroup()); }
		(rule__FQNW__Group__0)
		{ after(grammarAccess.getFQNWAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommRepositoryImport
entryRuleCommRepositoryImport
:
{ before(grammarAccess.getCommRepositoryImportRule()); }
	 ruleCommRepositoryImport
{ after(grammarAccess.getCommRepositoryImportRule()); } 
	 EOF 
;

// Rule CommRepositoryImport
ruleCommRepositoryImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommRepositoryImportAccess().getGroup()); }
		(rule__CommRepositoryImport__Group__0)
		{ after(grammarAccess.getCommRepositoryImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommObjectsRepository
entryRuleCommObjectsRepository
:
{ before(grammarAccess.getCommObjectsRepositoryRule()); }
	 ruleCommObjectsRepository
{ after(grammarAccess.getCommObjectsRepositoryRule()); } 
	 EOF 
;

// Rule CommObjectsRepository
ruleCommObjectsRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getGroup()); }
		(rule__CommObjectsRepository__Group__0)
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getGroup()); }
		(rule__Version__Group__0)
		{ after(grammarAccess.getVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractCommElement
entryRuleAbstractCommElement
:
{ before(grammarAccess.getAbstractCommElementRule()); }
	 ruleAbstractCommElement
{ after(grammarAccess.getAbstractCommElementRule()); } 
	 EOF 
;

// Rule AbstractCommElement
ruleAbstractCommElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractCommElementAccess().getAlternatives()); }
		(rule__AbstractCommElement__Alternatives)
		{ after(grammarAccess.getAbstractCommElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommunicationObject
entryRuleCommunicationObject
:
{ before(grammarAccess.getCommunicationObjectRule()); }
	 ruleCommunicationObject
{ after(grammarAccess.getCommunicationObjectRule()); } 
	 EOF 
;

// Rule CommunicationObject
ruleCommunicationObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommunicationObjectAccess().getGroup()); }
		(rule__CommunicationObject__Group__0)
		{ after(grammarAccess.getCommunicationObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumeration
entryRuleEnumeration
:
{ before(grammarAccess.getEnumerationRule()); }
	 ruleEnumeration
{ after(grammarAccess.getEnumerationRule()); } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationAccess().getGroup()); }
		(rule__Enumeration__Group__0)
		{ after(grammarAccess.getEnumerationAccess().getGroup()); }
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

// Entry rule entryRuleCommElementReference
entryRuleCommElementReference
:
{ before(grammarAccess.getCommElementReferenceRule()); }
	 ruleCommElementReference
{ after(grammarAccess.getCommElementReferenceRule()); } 
	 EOF 
;

// Rule CommElementReference
ruleCommElementReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommElementReferenceAccess().getGroup()); }
		(rule__CommElementReference__Group__0)
		{ after(grammarAccess.getCommElementReferenceAccess().getGroup()); }
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

// Entry rule entrySuperAbstractAttributeType
entrySuperAbstractAttributeType
:
{ before(grammarAccess.getBasicAttributesAbstractAttributeTypeRule()); }
	 superAbstractAttributeType
{ after(grammarAccess.getBasicAttributesAbstractAttributeTypeRule()); } 
	 EOF 
;

// Rule AbstractAttributeType
superAbstractAttributeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives()); }
		(superAbstractAttributeType__Alternatives)
		{ after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives()); }
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

// Entry rule entrySuperSingleValue
entrySuperSingleValue
:
{ before(grammarAccess.getBasicAttributesSingleValueRule()); }
	 superSingleValue
{ after(grammarAccess.getBasicAttributesSingleValueRule()); } 
	 EOF 
;

// Rule SingleValue
superSingleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives()); }
		(superSingleValue__Alternatives)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives()); }
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

rule__AbstractCommElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractCommElementAccess().getEnumerationParserRuleCall_0()); }
		ruleEnumeration
		{ after(grammarAccess.getAbstractCommElementAccess().getEnumerationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractCommElementAccess().getCommunicationObjectParserRuleCall_1()); }
		ruleCommunicationObject
		{ after(grammarAccess.getAbstractCommElementAccess().getCommunicationObjectParserRuleCall_1()); }
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
		{ before(grammarAccess.getAbstractAttributeTypeAccess().getCommElementReferenceParserRuleCall_0()); }
		ruleCommElementReference
		{ after(grammarAccess.getAbstractAttributeTypeAccess().getCommElementReferenceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractAttributeTypeAccess().getAbstractAttributeTypeParserRuleCall_1()); }
		superAbstractAttributeType
		{ after(grammarAccess.getAbstractAttributeTypeAccess().getAbstractAttributeTypeParserRuleCall_1()); }
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
		{ before(grammarAccess.getSingleValueAccess().getSingleValueParserRuleCall_1()); }
		superSingleValue
		{ after(grammarAccess.getSingleValueAccess().getSingleValueParserRuleCall_1()); }
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

superAbstractAttributeType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
		rulePrimitiveType
		{ after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); }
		ruleInlineEnumerationType
		{ after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); }
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

superSingleValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0()); }
		(superSingleValue__Group_0__0)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1()); }
		(superSingleValue__Group_1__0)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2()); }
		(superSingleValue__Group_2__0)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3()); }
		(superSingleValue__Group_3__0)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4()); }
		(superSingleValue__Group_4__0)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4()); }
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

rule__CommObjectModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectModel__Group__0__Impl
	rule__CommObjectModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0()); }
	(rule__CommObjectModel__ImportsAssignment_0)*
	{ after(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1()); }
	(rule__CommObjectModel__RepositoryAssignment_1)?
	{ after(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQNW__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQNW__Group__0__Impl
	rule__FQNW__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); }
	ruleFQN
	{ after(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQNW__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommRepositoryImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepositoryImport__Group__0__Impl
	rule__CommRepositoryImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0()); }
	'#import'
	{ after(grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepositoryImport__Group__1__Impl
	rule__CommRepositoryImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__CommRepositoryImport__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepositoryImport__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommObjectsRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__0__Impl
	rule__CommObjectsRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationAssignment_0()); }
	(rule__CommObjectsRepository__DocumentationAssignment_0)?
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__1__Impl
	rule__CommObjectsRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_1()); }
	'CommObjectsRepository'
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__2__Impl
	rule__CommObjectsRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_2()); }
	(rule__CommObjectsRepository__NameAssignment_2)
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__3__Impl
	rule__CommObjectsRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_3()); }
	(rule__CommObjectsRepository__Group_3__0)?
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__4__Impl
	rule__CommObjectsRepository__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__5__Impl
	rule__CommObjectsRepository__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_5()); }
	(rule__CommObjectsRepository__Group_5__0)?
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__6__Impl
	rule__CommObjectsRepository__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_6()); }
	(rule__CommObjectsRepository__ElementsAssignment_6)*
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommObjectsRepository__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group_3__0__Impl
	rule__CommObjectsRepository__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_3_0()); }
	'version'
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_3_1()); }
	(rule__CommObjectsRepository__VersionAssignment_3_1)
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommObjectsRepository__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group_5__0__Impl
	rule__CommObjectsRepository__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_5_0()); }
	'Dependency'
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group_5__1__Impl
	rule__CommObjectsRepository__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_5_1()); }
	(rule__CommObjectsRepository__DependencyAssignment_5_1)
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommObjectsRepository__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_5_2()); }
	(';')?
	{ after(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMajorAssignment_0()); }
	(rule__Version__MajorAssignment_0)
	{ after(grammarAccess.getVersionAccess().getMajorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__1__Impl
	rule__Version__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__2__Impl
	rule__Version__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMinorAssignment_2()); }
	(rule__Version__MinorAssignment_2)
	{ after(grammarAccess.getVersionAccess().getMinorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getGroup_3()); }
	(rule__Version__Group_3__0)?
	{ after(grammarAccess.getVersionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_3__0__Impl
	rule__Version__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getFullStopKeyword_3_0()); }
	'.'
	{ after(grammarAccess.getVersionAccess().getFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getPatchAssignment_3_1()); }
	(rule__Version__PatchAssignment_3_1)
	{ after(grammarAccess.getVersionAccess().getPatchAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommunicationObject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__0__Impl
	rule__CommunicationObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getDocumentationAssignment_0()); }
	(rule__CommunicationObject__DocumentationAssignment_0)?
	{ after(grammarAccess.getCommunicationObjectAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__1__Impl
	rule__CommunicationObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_1()); }
	'CommObject'
	{ after(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__2__Impl
	rule__CommunicationObject__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getNameAssignment_2()); }
	(rule__CommunicationObject__NameAssignment_2)
	{ after(grammarAccess.getCommunicationObjectAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__3__Impl
	rule__CommunicationObject__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__4__Impl
	rule__CommunicationObject__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_4()); }
	(rule__CommunicationObject__AttributesAssignment_4)*
	{ after(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationObject__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__0__Impl
	rule__Enumeration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getDocumentationAssignment_0()); }
	(rule__Enumeration__DocumentationAssignment_0)?
	{ after(grammarAccess.getEnumerationAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__1__Impl
	rule__Enumeration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); }
	'Enumeration'
	{ after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__2__Impl
	rule__Enumeration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); }
	(rule__Enumeration__NameAssignment_2)
	{ after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__3__Impl
	rule__Enumeration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__4__Impl
	rule__Enumeration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getEnumsAssignment_4()); }
	(rule__Enumeration__EnumsAssignment_4)*
	{ after(grammarAccess.getEnumerationAccess().getEnumsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommElementReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommElementReference__Group__0__Impl
	rule__CommElementReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommElementReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0()); }
	(rule__CommElementReference__TypeNameAssignment_0)
	{ after(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommElementReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommElementReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommElementReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1()); }
	(rule__CommElementReference__ArrayAssignment_1)?
	{ after(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1()); }
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
	{ before(grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0()); }
	()
	{ after(grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0()); }
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
	rule__SingleValue__Group_0__2
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

rule__SingleValue__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_0__2__Impl
	rule__SingleValue__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2()); }
	'('
	{ after(grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleValue__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValue__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3()); }
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


superSingleValue__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_0__0__Impl
	superSingleValue__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0()); }
	()
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1()); }
	(superSingleValue__ValueAssignment_0_1)
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


superSingleValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_1__0__Impl
	superSingleValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0()); }
	()
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1()); }
	(superSingleValue__ValueAssignment_1_1)
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


superSingleValue__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_2__0__Impl
	superSingleValue__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0()); }
	()
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1()); }
	(superSingleValue__ValueAssignment_2_1)
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


superSingleValue__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_3__0__Impl
	superSingleValue__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0()); }
	()
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1()); }
	(superSingleValue__ValueAssignment_3_1)
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


superSingleValue__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_4__0__Impl
	superSingleValue__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0()); }
	()
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	superSingleValue__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1()); }
	(superSingleValue__ValueAssignment_4_1)
	{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommObjectModel__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectModelAccess().getImportsCommRepositoryImportParserRuleCall_0_0()); }
		ruleCommRepositoryImport
		{ after(grammarAccess.getCommObjectModelAccess().getImportsCommRepositoryImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectModel__RepositoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectModelAccess().getRepositoryCommObjectsRepositoryParserRuleCall_1_0()); }
		ruleCommObjectsRepository
		{ after(grammarAccess.getCommObjectModelAccess().getRepositoryCommObjectsRepositoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepositoryImport__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
		ruleFQNW
		{ after(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__VersionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_3_1_0()); }
		ruleVersion
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__DependencyAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_5_1_0()); }
		ruleEString
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommObjectsRepository__ElementsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_6_0()); }
		ruleAbstractCommElement
		{ after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__MajorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__MinorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__PatchAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getPatchINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getPatchINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationObjectAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getCommunicationObjectAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationObject__AttributesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getEnumerationAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__EnumsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_4_0()); }
		ruleEnumerationElement
		{ after(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommElementReference__TypeNameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0()); }
		(
			{ before(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementFQNParserRuleCall_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementFQNParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommElementReference__ArrayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommElementReferenceAccess().getArrayArrayTypeParserRuleCall_1_0()); }
		ruleArrayType
		{ after(grammarAccess.getCommElementReferenceAccess().getArrayArrayTypeParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0()); }
		(
			{ before(grammarAccess.getSingleValueAccess().getValueAbstractCommElementFQNParserRuleCall_0_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSingleValueAccess().getValueAbstractCommElementFQNParserRuleCall_0_1_0_1()); }
		)
		{ after(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0()); }
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

superSingleValue__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); }
		ruleEInt
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); }
		ruleEDouble
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__ValueAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); }
		ruleEBoolean
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

superSingleValue__ValueAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); }
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
