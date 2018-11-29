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
grammar InternalComponentParameter;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.component.componentParameter.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.component.componentParameter.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentParameter.services.ComponentParameterGrammarAccess;

}
@parser::members {
	private ComponentParameterGrammarAccess grammarAccess;

	public void setGrammarAccess(ComponentParameterGrammarAccess grammarAccess) {
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

// Entry rule entryRuleComponentParamModel
entryRuleComponentParamModel
:
{ before(grammarAccess.getComponentParamModelRule()); }
	 ruleComponentParamModel
{ after(grammarAccess.getComponentParamModelRule()); } 
	 EOF 
;

// Rule ComponentParamModel
ruleComponentParamModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentParamModelAccess().getGroup()); }
		(rule__ComponentParamModel__Group__0)
		{ after(grammarAccess.getComponentParamModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentParameter
entryRuleComponentParameter
:
{ before(grammarAccess.getComponentParameterRule()); }
	 ruleComponentParameter
{ after(grammarAccess.getComponentParameterRule()); } 
	 EOF 
;

// Rule ComponentParameter
ruleComponentParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentParameterAccess().getGroup()); }
		(rule__ComponentParameter__Group__0)
		{ after(grammarAccess.getComponentParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractComponentParameter
entryRuleAbstractComponentParameter
:
{ before(grammarAccess.getAbstractComponentParameterRule()); }
	 ruleAbstractComponentParameter
{ after(grammarAccess.getAbstractComponentParameterRule()); } 
	 EOF 
;

// Rule AbstractComponentParameter
ruleAbstractComponentParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractComponentParameterAccess().getAlternatives()); }
		(rule__AbstractComponentParameter__Alternatives)
		{ after(grammarAccess.getAbstractComponentParameterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInternalParameter
entryRuleInternalParameter
:
{ before(grammarAccess.getInternalParameterRule()); }
	 ruleInternalParameter
{ after(grammarAccess.getInternalParameterRule()); } 
	 EOF 
;

// Rule InternalParameter
ruleInternalParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInternalParameterAccess().getGroup()); }
		(rule__InternalParameter__Group__0)
		{ after(grammarAccess.getInternalParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExtendedParameter
entryRuleExtendedParameter
:
{ before(grammarAccess.getExtendedParameterRule()); }
	 ruleExtendedParameter
{ after(grammarAccess.getExtendedParameterRule()); } 
	 EOF 
;

// Rule ExtendedParameter
ruleExtendedParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExtendedParameterAccess().getGroup()); }
		(rule__ExtendedParameter__Group__0)
		{ after(grammarAccess.getExtendedParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExtendedTrigger
entryRuleExtendedTrigger
:
{ before(grammarAccess.getExtendedTriggerRule()); }
	 ruleExtendedTrigger
{ after(grammarAccess.getExtendedTriggerRule()); } 
	 EOF 
;

// Rule ExtendedTrigger
ruleExtendedTrigger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getGroup()); }
		(rule__ExtendedTrigger__Group__0)
		{ after(grammarAccess.getExtendedTriggerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterSetInstance
entryRuleParameterSetInstance
:
{ before(grammarAccess.getParameterSetInstanceRule()); }
	 ruleParameterSetInstance
{ after(grammarAccess.getParameterSetInstanceRule()); } 
	 EOF 
;

// Rule ParameterSetInstance
ruleParameterSetInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterSetInstanceAccess().getGroup()); }
		(rule__ParameterSetInstance__Group__0)
		{ after(grammarAccess.getParameterSetInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractParameterInstance
entryRuleAbstractParameterInstance
:
{ before(grammarAccess.getAbstractParameterInstanceRule()); }
	 ruleAbstractParameterInstance
{ after(grammarAccess.getAbstractParameterInstanceRule()); } 
	 EOF 
;

// Rule AbstractParameterInstance
ruleAbstractParameterInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractParameterInstanceAccess().getAlternatives()); }
		(rule__AbstractParameterInstance__Alternatives)
		{ after(grammarAccess.getAbstractParameterInstanceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTriggerInstance
entryRuleTriggerInstance
:
{ before(grammarAccess.getTriggerInstanceRule()); }
	 ruleTriggerInstance
{ after(grammarAccess.getTriggerInstanceRule()); } 
	 EOF 
;

// Rule TriggerInstance
ruleTriggerInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTriggerInstanceAccess().getGroup()); }
		(rule__TriggerInstance__Group__0)
		{ after(grammarAccess.getTriggerInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterInstance
entryRuleParameterInstance
:
{ before(grammarAccess.getParameterInstanceRule()); }
	 ruleParameterInstance
{ after(grammarAccess.getParameterInstanceRule()); } 
	 EOF 
;

// Rule ParameterInstance
ruleParameterInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterInstanceAccess().getGroup()); }
		(rule__ParameterInstance__Group__0)
		{ after(grammarAccess.getParameterInstanceAccess().getGroup()); }
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

// Entry rule entryRuleParamDefRepoImport
entryRuleParamDefRepoImport
:
{ before(grammarAccess.getParamDefRepoImportRule()); }
	 ruleParamDefRepoImport
{ after(grammarAccess.getParamDefRepoImportRule()); } 
	 EOF 
;

// Rule ParamDefRepoImport
ruleParamDefRepoImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParamDefRepoImportAccess().getGroup()); }
		(rule__ParamDefRepoImport__Group__0)
		{ after(grammarAccess.getParamDefRepoImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterSetRepository
entryRuleParameterSetRepository
:
{ before(grammarAccess.getParameterSetRepositoryRule()); }
	 ruleParameterSetRepository
{ after(grammarAccess.getParameterSetRepositoryRule()); } 
	 EOF 
;

// Rule ParameterSetRepository
ruleParameterSetRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterSetRepositoryAccess().getGroup()); }
		(rule__ParameterSetRepository__Group__0)
		{ after(grammarAccess.getParameterSetRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterSetDefinition
entryRuleParameterSetDefinition
:
{ before(grammarAccess.getParameterSetDefinitionRule()); }
	 ruleParameterSetDefinition
{ after(grammarAccess.getParameterSetDefinitionRule()); } 
	 EOF 
;

// Rule ParameterSetDefinition
ruleParameterSetDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterSetDefinitionAccess().getGroup()); }
		(rule__ParameterSetDefinition__Group__0)
		{ after(grammarAccess.getParameterSetDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractParameter
entryRuleAbstractParameter
:
{ before(grammarAccess.getAbstractParameterRule()); }
	 ruleAbstractParameter
{ after(grammarAccess.getAbstractParameterRule()); } 
	 EOF 
;

// Rule AbstractParameter
ruleAbstractParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractParameterAccess().getAlternatives()); }
		(rule__AbstractParameter__Alternatives)
		{ after(grammarAccess.getAbstractParameterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterDefinition
entryRuleParameterDefinition
:
{ before(grammarAccess.getParameterDefinitionRule()); }
	 ruleParameterDefinition
{ after(grammarAccess.getParameterDefinitionRule()); } 
	 EOF 
;

// Rule ParameterDefinition
ruleParameterDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterDefinitionAccess().getGroup()); }
		(rule__ParameterDefinition__Group__0)
		{ after(grammarAccess.getParameterDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTriggerDefinition
entryRuleTriggerDefinition
:
{ before(grammarAccess.getTriggerDefinitionRule()); }
	 ruleTriggerDefinition
{ after(grammarAccess.getTriggerDefinitionRule()); } 
	 EOF 
;

// Rule TriggerDefinition
ruleTriggerDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTriggerDefinitionAccess().getGroup()); }
		(rule__TriggerDefinition__Group__0)
		{ after(grammarAccess.getTriggerDefinitionAccess().getGroup()); }
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

// Entry rule entryRuleAttributeRefinement
entryRuleAttributeRefinement
:
{ before(grammarAccess.getAttributeRefinementRule()); }
	 ruleAttributeRefinement
{ after(grammarAccess.getAttributeRefinementRule()); } 
	 EOF 
;

// Rule AttributeRefinement
ruleAttributeRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeRefinementAccess().getGroup()); }
		(rule__AttributeRefinement__Group__0)
		{ after(grammarAccess.getAttributeRefinementAccess().getGroup()); }
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

rule__AbstractComponentParameter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractComponentParameterAccess().getInternalParameterParserRuleCall_0()); }
		ruleInternalParameter
		{ after(grammarAccess.getAbstractComponentParameterAccess().getInternalParameterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentParameterAccess().getExtendedParameterParserRuleCall_1()); }
		ruleExtendedParameter
		{ after(grammarAccess.getAbstractComponentParameterAccess().getExtendedParameterParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentParameterAccess().getExtendedTriggerParserRuleCall_2()); }
		ruleExtendedTrigger
		{ after(grammarAccess.getAbstractComponentParameterAccess().getExtendedTriggerParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentParameterAccess().getParameterSetInstanceParserRuleCall_3()); }
		ruleParameterSetInstance
		{ after(grammarAccess.getAbstractComponentParameterAccess().getParameterSetInstanceParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getActiveAssignment_2_0()); }
		(rule__ExtendedTrigger__ActiveAssignment_2_0)
		{ after(grammarAccess.getExtendedTriggerAccess().getActiveAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getPassiveKeyword_2_1()); }
		'passive'
		{ after(grammarAccess.getExtendedTriggerAccess().getPassiveKeyword_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractParameterInstance__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractParameterInstanceAccess().getTriggerInstanceParserRuleCall_0()); }
		ruleTriggerInstance
		{ after(grammarAccess.getAbstractParameterInstanceAccess().getTriggerInstanceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractParameterInstanceAccess().getParameterInstanceParserRuleCall_1()); }
		ruleParameterInstance
		{ after(grammarAccess.getAbstractParameterInstanceAccess().getParameterInstanceParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerInstanceAccess().getActiveAssignment_2_0()); }
		(rule__TriggerInstance__ActiveAssignment_2_0)
		{ after(grammarAccess.getTriggerInstanceAccess().getActiveAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getTriggerInstanceAccess().getPassiveKeyword_2_1()); }
		'passive'
		{ after(grammarAccess.getTriggerInstanceAccess().getPassiveKeyword_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractParameter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0()); }
		ruleParameterDefinition
		{ after(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1()); }
		ruleTriggerDefinition
		{ after(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1()); }
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

rule__ComponentParamModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParamModel__Group__0__Impl
	rule__ComponentParamModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParamModelAccess().getComponentParamModelAction_0()); }
	()
	{ after(grammarAccess.getComponentParamModelAccess().getComponentParamModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParamModel__Group__1__Impl
	rule__ComponentParamModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParamModelAccess().getImportsAssignment_1()); }
	(rule__ComponentParamModel__ImportsAssignment_1)*
	{ after(grammarAccess.getComponentParamModelAccess().getImportsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParamModel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParamModelAccess().getParametrizationAssignment_2()); }
	(rule__ComponentParamModel__ParametrizationAssignment_2)?
	{ after(grammarAccess.getComponentParamModelAccess().getParametrizationAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__0__Impl
	rule__ComponentParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getComponentParameterKeyword_0()); }
	'ComponentParameter'
	{ after(grammarAccess.getComponentParameterAccess().getComponentParameterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__1__Impl
	rule__ComponentParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getNameAssignment_1()); }
	(rule__ComponentParameter__NameAssignment_1)
	{ after(grammarAccess.getComponentParameterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__2__Impl
	rule__ComponentParameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getGroup_2()); }
	(rule__ComponentParameter__Group_2__0)?
	{ after(grammarAccess.getComponentParameterAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__3__Impl
	rule__ComponentParameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComponentParameterAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__4__Impl
	rule__ComponentParameter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getParametersAssignment_4()); }
	(rule__ComponentParameter__ParametersAssignment_4)*
	{ after(grammarAccess.getComponentParameterAccess().getParametersAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentParameterAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentParameter__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group_2__0__Impl
	rule__ComponentParameter__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getComponentKeyword_2_0()); }
	'component'
	{ after(grammarAccess.getComponentParameterAccess().getComponentKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParameter__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParameterAccess().getComponentAssignment_2_1()); }
	(rule__ComponentParameter__ComponentAssignment_2_1)
	{ after(grammarAccess.getComponentParameterAccess().getComponentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalParameter__Group__0__Impl
	rule__InternalParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalParameterAccess().getInternalParameterKeyword_0()); }
	'InternalParameter'
	{ after(grammarAccess.getInternalParameterAccess().getInternalParameterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalParameter__Group__1__Impl
	rule__InternalParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalParameterAccess().getNameAssignment_1()); }
	(rule__InternalParameter__NameAssignment_1)
	{ after(grammarAccess.getInternalParameterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalParameter__Group__2__Impl
	rule__InternalParameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalParameterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getInternalParameterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalParameter__Group__3__Impl
	rule__InternalParameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalParameterAccess().getAttributesAssignment_3()); }
	(rule__InternalParameter__AttributesAssignment_3)*
	{ after(grammarAccess.getInternalParameterAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalParameter__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalParameterAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getInternalParameterAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExtendedParameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedParameter__Group__0__Impl
	rule__ExtendedParameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedParameterAccess().getExtendedParameterKeyword_0()); }
	'ExtendedParameter'
	{ after(grammarAccess.getExtendedParameterAccess().getExtendedParameterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedParameter__Group__1__Impl
	rule__ExtendedParameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedParameterAccess().getNameAssignment_1()); }
	(rule__ExtendedParameter__NameAssignment_1)
	{ after(grammarAccess.getExtendedParameterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedParameter__Group__2__Impl
	rule__ExtendedParameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedParameterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getExtendedParameterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedParameter__Group__3__Impl
	rule__ExtendedParameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedParameterAccess().getAttributesAssignment_3()); }
	(rule__ExtendedParameter__AttributesAssignment_3)*
	{ after(grammarAccess.getExtendedParameterAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedParameter__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedParameterAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getExtendedParameterAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExtendedTrigger__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__0__Impl
	rule__ExtendedTrigger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getExtendedTriggerKeyword_0()); }
	'ExtendedTrigger'
	{ after(grammarAccess.getExtendedTriggerAccess().getExtendedTriggerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__1__Impl
	rule__ExtendedTrigger__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getNameAssignment_1()); }
	(rule__ExtendedTrigger__NameAssignment_1)
	{ after(grammarAccess.getExtendedTriggerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__2__Impl
	rule__ExtendedTrigger__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getAlternatives_2()); }
	(rule__ExtendedTrigger__Alternatives_2)
	{ after(grammarAccess.getExtendedTriggerAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__3__Impl
	rule__ExtendedTrigger__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getExtendedTriggerAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__4__Impl
	rule__ExtendedTrigger__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getAttributesAssignment_4()); }
	(rule__ExtendedTrigger__AttributesAssignment_4)*
	{ after(grammarAccess.getExtendedTriggerAccess().getAttributesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendedTrigger__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendedTriggerAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getExtendedTriggerAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSetInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetInstance__Group__0__Impl
	rule__ParameterSetInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetInstanceAccess().getParameterSetInstanceKeyword_0()); }
	'ParameterSetInstance'
	{ after(grammarAccess.getParameterSetInstanceAccess().getParameterSetInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetInstance__Group__1__Impl
	rule__ParameterSetInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetInstanceAccess().getParamSetAssignment_1()); }
	(rule__ParameterSetInstance__ParamSetAssignment_1)
	{ after(grammarAccess.getParameterSetInstanceAccess().getParamSetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetInstance__Group__2__Impl
	rule__ParameterSetInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetInstanceAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getParameterSetInstanceAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetInstance__Group__3__Impl
	rule__ParameterSetInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAssignment_3()); }
	(rule__ParameterSetInstance__ParameterInstancesAssignment_3)*
	{ after(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetInstance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetInstanceAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getParameterSetInstanceAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TriggerInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInstance__Group__0__Impl
	rule__TriggerInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInstanceAccess().getTriggerInstanceKeyword_0()); }
	'TriggerInstance'
	{ after(grammarAccess.getTriggerInstanceAccess().getTriggerInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInstance__Group__1__Impl
	rule__TriggerInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInstanceAccess().getTriggerDefAssignment_1()); }
	(rule__TriggerInstance__TriggerDefAssignment_1)
	{ after(grammarAccess.getTriggerInstanceAccess().getTriggerDefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInstance__Group__2__Impl
	rule__TriggerInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInstanceAccess().getAlternatives_2()); }
	(rule__TriggerInstance__Alternatives_2)
	{ after(grammarAccess.getTriggerInstanceAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInstance__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInstanceAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getTriggerInstanceAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterInstance__Group__0__Impl
	rule__ParameterInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0()); }
	'ParameterInstance'
	{ after(grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterInstance__Group__1__Impl
	rule__ParameterInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterInstanceAccess().getParameterDefAssignment_1()); }
	(rule__ParameterInstance__ParameterDefAssignment_1)
	{ after(grammarAccess.getParameterInstanceAccess().getParameterDefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterInstance__Group__2__Impl
	rule__ParameterInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterInstance__Group__3__Impl
	rule__ParameterInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterInstanceAccess().getAttributesAssignment_3()); }
	(rule__ParameterInstance__AttributesAssignment_3)*
	{ after(grammarAccess.getParameterInstanceAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterInstance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_4()); }
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


rule__ParamDefRepoImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamDefRepoImport__Group__0__Impl
	rule__ParamDefRepoImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0()); }
	'#import'
	{ after(grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamDefRepoImport__Group__1__Impl
	rule__ParamDefRepoImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__ParamDefRepoImport__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamDefRepoImport__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSetRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetRepository__Group__0__Impl
	rule__ParameterSetRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0()); }
	'ParameterSetRepository'
	{ after(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetRepository__Group__1__Impl
	rule__ParameterSetRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_1()); }
	(rule__ParameterSetRepository__NameAssignment_1)
	{ after(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetRepository__Group__2__Impl
	rule__ParameterSetRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetRepository__Group__3__Impl
	rule__ParameterSetRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_3()); }
	(rule__ParameterSetRepository__SetsAssignment_3)*
	{ after(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetRepository__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSetDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__0__Impl
	rule__ParameterSetDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0()); }
	'ParameterSet'
	{ after(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__1__Impl
	rule__ParameterSetDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_1()); }
	(rule__ParameterSetDefinition__NameAssignment_1)
	{ after(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__2__Impl
	rule__ParameterSetDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getGroup_2()); }
	(rule__ParameterSetDefinition__Group_2__0)?
	{ after(grammarAccess.getParameterSetDefinitionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__3__Impl
	rule__ParameterSetDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__4__Impl
	rule__ParameterSetDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_4()); }
	(rule__ParameterSetDefinition__ParametersAssignment_4)*
	{ after(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSetDefinition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group_2__0__Impl
	rule__ParameterSetDefinition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group_2__1__Impl
	rule__ParameterSetDefinition__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_1()); }
	(rule__ParameterSetDefinition__ExtendsAssignment_2_1)
	{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getGroup_2_2()); }
	(rule__ParameterSetDefinition__Group_2_2__0)*
	{ after(grammarAccess.getParameterSetDefinitionAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSetDefinition__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group_2_2__0__Impl
	rule__ParameterSetDefinition__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterSetDefinition__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_2_1()); }
	(rule__ParameterSetDefinition__ExtendsAssignment_2_2_1)
	{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDefinition__Group__0__Impl
	rule__ParameterDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0()); }
	'Parameter'
	{ after(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDefinition__Group__1__Impl
	rule__ParameterDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDefinitionAccess().getNameAssignment_1()); }
	(rule__ParameterDefinition__NameAssignment_1)
	{ after(grammarAccess.getParameterDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDefinition__Group__2__Impl
	rule__ParameterDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDefinition__Group__3__Impl
	rule__ParameterDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_3()); }
	(rule__ParameterDefinition__AttributesAssignment_3)*
	{ after(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TriggerDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerDefinition__Group__0__Impl
	rule__TriggerDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0()); }
	'Trigger'
	{ after(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerDefinition__Group__1__Impl
	rule__TriggerDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_1()); }
	(rule__TriggerDefinition__NameAssignment_1)
	{ after(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerDefinition__Group__2__Impl
	rule__TriggerDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerDefinition__Group__3__Impl
	rule__TriggerDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_3()); }
	(rule__TriggerDefinition__AttributesAssignment_3)*
	{ after(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4()); }
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


rule__AttributeRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeRefinement__Group__0__Impl
	rule__AttributeRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0()); }
	(rule__AttributeRefinement__AttributeAssignment_0)
	{ after(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeRefinement__Group__1__Impl
	rule__AttributeRefinement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeRefinement__Group__2__Impl
	rule__AttributeRefinement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2()); }
	(rule__AttributeRefinement__ValueAssignment_2)
	{ after(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeRefinement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_3()); }
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


rule__ComponentParamModel__ImportsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParamModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0()); }
		ruleParamDefRepoImport
		{ after(grammarAccess.getComponentParamModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParamModel__ParametrizationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParamModelAccess().getParametrizationComponentParameterParserRuleCall_2_0()); }
		ruleComponentParameter
		{ after(grammarAccess.getComponentParamModelAccess().getParametrizationComponentParameterParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParameterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__ComponentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParameterAccess().getComponentComponentDefinitionCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getComponentParameterAccess().getComponentComponentDefinitionFQNParserRuleCall_2_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentParameterAccess().getComponentComponentDefinitionFQNParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getComponentParameterAccess().getComponentComponentDefinitionCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParameter__ParametersAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParameterAccess().getParametersAbstractComponentParameterParserRuleCall_4_0()); }
		ruleAbstractComponentParameter
		{ after(grammarAccess.getComponentParameterAccess().getParametersAbstractComponentParameterParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalParameterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInternalParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalParameter__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getInternalParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedParameterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getExtendedParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedParameter__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getExtendedParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getExtendedTriggerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__ActiveAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_2_0_0()); }
			'active'
			{ after(grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendedTrigger__AttributesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendedTriggerAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getExtendedTriggerAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__ParamSetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetInstance__ParameterInstancesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAbstractParameterInstanceParserRuleCall_3_0()); }
		ruleAbstractParameterInstance
		{ after(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAbstractParameterInstanceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__TriggerDefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInstance__ActiveAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_2_0_0()); }
			'active'
			{ after(grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__ParameterDefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterInstance__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterInstanceAccess().getAttributesAttributeRefinementParserRuleCall_3_0()); }
		ruleAttributeRefinement
		{ after(grammarAccess.getParameterInstanceAccess().getAttributesAttributeRefinementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamDefRepoImport__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
		ruleFQNW
		{ after(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetRepository__SetsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0()); }
		ruleParameterSetDefinition
		{ after(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__ExtendsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__ExtendsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSetDefinition__ParametersAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0()); }
		ruleAbstractParameter
		{ after(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDefinition__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerDefinition__AttributesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
		ruleAttributeDefinition
		{ after(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); }
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

rule__AttributeRefinement__AttributeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1()); }
			ruleFQN
			{ after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeRefinement__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0()); }
		ruleAbstractValue
		{ after(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0()); }
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
