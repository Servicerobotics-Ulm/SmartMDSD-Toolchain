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
package org.xtext.base.basicAttributes.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BasicAttributesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AttributeDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeAbstractAttributeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDefaultvalueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDefaultvalueAbstractValueParserRuleCall_3_1_0 = (RuleCall)cDefaultvalueAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//AttributeDefinition attr::AttributeDefinition:
		//	name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=AbstractAttributeType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//AbstractAttributeType
		public RuleCall getTypeAbstractAttributeTypeParserRuleCall_2_0() { return cTypeAbstractAttributeTypeParserRuleCall_2_0; }
		
		//('=' defaultvalue=AbstractValue)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//defaultvalue=AbstractValue
		public Assignment getDefaultvalueAssignment_3_1() { return cDefaultvalueAssignment_3_1; }
		
		//AbstractValue
		public RuleCall getDefaultvalueAbstractValueParserRuleCall_3_1_0() { return cDefaultvalueAbstractValueParserRuleCall_3_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class AttributeRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.AttributeRefinement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttributeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cAttributeAttributeDefinitionCrossReference_0_0 = (CrossReference)cAttributeAssignment_0.eContents().get(0);
		private final RuleCall cAttributeAttributeDefinitionFQNParserRuleCall_0_0_1 = (RuleCall)cAttributeAttributeDefinitionCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueAbstractValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AttributeRefinement attr::AttributeRefinement:
		//	attribute=[attr::AttributeDefinition|FQN] '=' value=AbstractValue ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//attribute=[attr::AttributeDefinition|FQN] '=' value=AbstractValue ';'?
		public Group getGroup() { return cGroup; }
		
		//attribute=[attr::AttributeDefinition|FQN]
		public Assignment getAttributeAssignment_0() { return cAttributeAssignment_0; }
		
		//[attr::AttributeDefinition|FQN]
		public CrossReference getAttributeAttributeDefinitionCrossReference_0_0() { return cAttributeAttributeDefinitionCrossReference_0_0; }
		
		//FQN
		public RuleCall getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1() { return cAttributeAttributeDefinitionFQNParserRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//value=AbstractValue
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//AbstractValue
		public RuleCall getValueAbstractValueParserRuleCall_2_0() { return cValueAbstractValueParserRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//// parser rules for names
		//FQN:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble ecore::EDouble:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class EnumerationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//EnumerationElement attr::EnumerationElement:
		//	name=ID ('=' value=EInt)? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('=' value=EInt)? ';'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('=' value=EInt)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//value=EInt
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_1_1_0() { return cValueEIntParserRuleCall_1_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class AbstractAttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInlineEnumerationTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractAttributeType attr::AbstractAttributeType:
		//	PrimitiveType | InlineEnumerationType;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimitiveType | InlineEnumerationType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrimitiveType
		public RuleCall getPrimitiveTypeParserRuleCall_0() { return cPrimitiveTypeParserRuleCall_0; }
		
		//InlineEnumerationType
		public RuleCall getInlineEnumerationTypeParserRuleCall_1() { return cInlineEnumerationTypeParserRuleCall_1; }
	}
	public class InlineEnumerationTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.InlineEnumerationType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInlineEnumerationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cArrayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArrayArrayTypeParserRuleCall_1_0 = (RuleCall)cArrayAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEnumsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEnumsEnumerationElementParserRuleCall_3_0 = (RuleCall)cEnumsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InlineEnumerationType attr::InlineEnumerationType:
		//	'InlineEnumeration' array=ArrayType? '{' enums+=EnumerationElement+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'InlineEnumeration' array=ArrayType? '{' enums+=EnumerationElement+ '}'
		public Group getGroup() { return cGroup; }
		
		//'InlineEnumeration'
		public Keyword getInlineEnumerationKeyword_0() { return cInlineEnumerationKeyword_0; }
		
		//array=ArrayType?
		public Assignment getArrayAssignment_1() { return cArrayAssignment_1; }
		
		//ArrayType
		public RuleCall getArrayArrayTypeParserRuleCall_1_0() { return cArrayArrayTypeParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//enums+=EnumerationElement+
		public Assignment getEnumsAssignment_3() { return cEnumsAssignment_3; }
		
		//EnumerationElement
		public RuleCall getEnumsEnumerationElementParserRuleCall_3_0() { return cEnumsEnumerationElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ArrayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLengthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLengthCardinalityParserRuleCall_2_0 = (RuleCall)cLengthAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ArrayType attr::ArrayType:
		//	{attr::ArrayType}
		//	'[' length=Cardinality? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//{attr::ArrayType} '[' length=Cardinality? ']'
		public Group getGroup() { return cGroup; }
		
		//{attr::ArrayType}
		public Action getArrayTypeAction_0() { return cArrayTypeAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//length=Cardinality?
		public Assignment getLengthAssignment_2() { return cLengthAssignment_2; }
		
		//Cardinality
		public RuleCall getLengthCardinalityParserRuleCall_2_0() { return cLengthCardinalityParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class CardinalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.Cardinality");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Cardinality:
		//	INT | '*';
		@Override public ParserRule getRule() { return rule; }
		
		//INT | '*'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }
	}
	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.PrimitiveType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0 = (RuleCall)cTypeNameAssignment_0.eContents().get(0);
		private final Assignment cArrayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArrayArrayTypeParserRuleCall_1_0 = (RuleCall)cArrayAssignment_1.eContents().get(0);
		
		//PrimitiveType attr::PrimitiveType:
		//	typeName=PRIMITIVE_TYPE_NAME array=ArrayType?;
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=PRIMITIVE_TYPE_NAME array=ArrayType?
		public Group getGroup() { return cGroup; }
		
		//typeName=PRIMITIVE_TYPE_NAME
		public Assignment getTypeNameAssignment_0() { return cTypeNameAssignment_0; }
		
		//PRIMITIVE_TYPE_NAME
		public RuleCall getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0() { return cTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0; }
		
		//array=ArrayType?
		public Assignment getArrayAssignment_1() { return cArrayAssignment_1; }
		
		//ArrayType
		public RuleCall getArrayArrayTypeParserRuleCall_1_0() { return cArrayArrayTypeParserRuleCall_1_0; }
	}
	public class AbstractValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSingleValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractValue attr::AbstractValue:
		//	SingleValue | ArrayValue;
		@Override public ParserRule getRule() { return rule; }
		
		//SingleValue | ArrayValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SingleValue
		public RuleCall getSingleValueParserRuleCall_0() { return cSingleValueParserRuleCall_0; }
		
		//ArrayValue
		public RuleCall getArrayValueParserRuleCall_1() { return cArrayValueParserRuleCall_1; }
	}
	public class ArrayValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.ArrayValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesSingleValueParserRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesSingleValueParserRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ArrayValue attr::ArrayValue:
		//	'[' values+=SingleValue (',' values+=SingleValue)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' values+=SingleValue (',' values+=SingleValue)* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//values+=SingleValue
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }
		
		//SingleValue
		public RuleCall getValuesSingleValueParserRuleCall_1_0() { return cValuesSingleValueParserRuleCall_1_0; }
		
		//(',' values+=SingleValue)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//values+=SingleValue
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }
		
		//SingleValue
		public RuleCall getValuesSingleValueParserRuleCall_2_1_0() { return cValuesSingleValueParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class SingleValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIntValueAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cFloatingPointValueAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueEDoubleParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cStringValueAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cBoolValueAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cEnumerationValueAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cValueEnumerationElementCrossReference_4_1_0 = (CrossReference)cValueAssignment_4_1.eContents().get(0);
		private final RuleCall cValueEnumerationElementFQNParserRuleCall_4_1_0_1 = (RuleCall)cValueEnumerationElementCrossReference_4_1_0.eContents().get(1);
		
		//SingleValue attr::SingleValue:
		//	{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
		//	{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
		//{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{attr::IntValue} value=EInt
		public Group getGroup_0() { return cGroup_0; }
		
		//{attr::IntValue}
		public Action getIntValueAction_0_0() { return cIntValueAction_0_0; }
		
		//value=EInt
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_0_1_0() { return cValueEIntParserRuleCall_0_1_0; }
		
		//{attr::FloatingPointValue} value=EDouble
		public Group getGroup_1() { return cGroup_1; }
		
		//{attr::FloatingPointValue}
		public Action getFloatingPointValueAction_1_0() { return cFloatingPointValueAction_1_0; }
		
		//value=EDouble
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//EDouble
		public RuleCall getValueEDoubleParserRuleCall_1_1_0() { return cValueEDoubleParserRuleCall_1_1_0; }
		
		//{attr::StringValue} value=EString
		public Group getGroup_2() { return cGroup_2; }
		
		//{attr::StringValue}
		public Action getStringValueAction_2_0() { return cStringValueAction_2_0; }
		
		//value=EString
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_2_1_0() { return cValueEStringParserRuleCall_2_1_0; }
		
		//{attr::BoolValue} value=EBoolean
		public Group getGroup_3() { return cGroup_3; }
		
		//{attr::BoolValue}
		public Action getBoolValueAction_3_0() { return cBoolValueAction_3_0; }
		
		//value=EBoolean
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_3_1_0() { return cValueEBooleanParserRuleCall_3_1_0; }
		
		//{attr::EnumerationValue} value=[attr::EnumerationElement|FQN]
		public Group getGroup_4() { return cGroup_4; }
		
		//{attr::EnumerationValue}
		public Action getEnumerationValueAction_4_0() { return cEnumerationValueAction_4_0; }
		
		//value=[attr::EnumerationElement|FQN]
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//[attr::EnumerationElement|FQN]
		public CrossReference getValueEnumerationElementCrossReference_4_1_0() { return cValueEnumerationElementCrossReference_4_1_0; }
		
		//FQN
		public RuleCall getValueEnumerationElementFQNParserRuleCall_4_1_0_1() { return cValueEnumerationElementFQNParserRuleCall_4_1_0_1; }
	}
	
	public class PRIMITIVE_TYPE_NAMEElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.basicAttributes.BasicAttributes.PRIMITIVE_TYPE_NAME");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cInt8EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cInt8Int8Keyword_0_0 = (Keyword)cInt8EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInt16EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInt16Int16Keyword_1_0 = (Keyword)cInt16EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cInt32EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cInt32Int32Keyword_2_0 = (Keyword)cInt32EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cInt64EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cInt64Int64Keyword_3_0 = (Keyword)cInt64EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cUInt8EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cUInt8UInt8Keyword_4_0 = (Keyword)cUInt8EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cUInt16EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cUInt16UInt16Keyword_5_0 = (Keyword)cUInt16EnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cUInt32EnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cUInt32UInt32Keyword_6_0 = (Keyword)cUInt32EnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cUInt64EnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cUInt64UInt64Keyword_7_0 = (Keyword)cUInt64EnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cFloatFloatKeyword_8_0 = (Keyword)cFloatEnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cDoubleDoubleKeyword_9_0 = (Keyword)cDoubleEnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cStringStringKeyword_10_0 = (Keyword)cStringEnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cBooleanBooleanKeyword_11_0 = (Keyword)cBooleanEnumLiteralDeclaration_11.eContents().get(0);
		
		//enum PRIMITIVE_TYPE_NAME returns attr::PRIMITIVE_TYPE_NAME:
		//	Int8 | Int16 | Int32 | Int64 |
		//	UInt8 | UInt16 | UInt32 | UInt64 |
		//	Float | Double | String | Boolean;
		public EnumRule getRule() { return rule; }
		
		//Int8 | Int16 | Int32 | Int64 | UInt8 | UInt16 | UInt32 | UInt64 | Float | Double | String | Boolean
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Int8
		public EnumLiteralDeclaration getInt8EnumLiteralDeclaration_0() { return cInt8EnumLiteralDeclaration_0; }
		
		//"Int8"
		public Keyword getInt8Int8Keyword_0_0() { return cInt8Int8Keyword_0_0; }
		
		//Int16
		public EnumLiteralDeclaration getInt16EnumLiteralDeclaration_1() { return cInt16EnumLiteralDeclaration_1; }
		
		//"Int16"
		public Keyword getInt16Int16Keyword_1_0() { return cInt16Int16Keyword_1_0; }
		
		//Int32
		public EnumLiteralDeclaration getInt32EnumLiteralDeclaration_2() { return cInt32EnumLiteralDeclaration_2; }
		
		//"Int32"
		public Keyword getInt32Int32Keyword_2_0() { return cInt32Int32Keyword_2_0; }
		
		//Int64
		public EnumLiteralDeclaration getInt64EnumLiteralDeclaration_3() { return cInt64EnumLiteralDeclaration_3; }
		
		//"Int64"
		public Keyword getInt64Int64Keyword_3_0() { return cInt64Int64Keyword_3_0; }
		
		//UInt8
		public EnumLiteralDeclaration getUInt8EnumLiteralDeclaration_4() { return cUInt8EnumLiteralDeclaration_4; }
		
		//"UInt8"
		public Keyword getUInt8UInt8Keyword_4_0() { return cUInt8UInt8Keyword_4_0; }
		
		//UInt16
		public EnumLiteralDeclaration getUInt16EnumLiteralDeclaration_5() { return cUInt16EnumLiteralDeclaration_5; }
		
		//"UInt16"
		public Keyword getUInt16UInt16Keyword_5_0() { return cUInt16UInt16Keyword_5_0; }
		
		//UInt32
		public EnumLiteralDeclaration getUInt32EnumLiteralDeclaration_6() { return cUInt32EnumLiteralDeclaration_6; }
		
		//"UInt32"
		public Keyword getUInt32UInt32Keyword_6_0() { return cUInt32UInt32Keyword_6_0; }
		
		//UInt64
		public EnumLiteralDeclaration getUInt64EnumLiteralDeclaration_7() { return cUInt64EnumLiteralDeclaration_7; }
		
		//"UInt64"
		public Keyword getUInt64UInt64Keyword_7_0() { return cUInt64UInt64Keyword_7_0; }
		
		//Float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_8() { return cFloatEnumLiteralDeclaration_8; }
		
		//"Float"
		public Keyword getFloatFloatKeyword_8_0() { return cFloatFloatKeyword_8_0; }
		
		//Double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_9() { return cDoubleEnumLiteralDeclaration_9; }
		
		//"Double"
		public Keyword getDoubleDoubleKeyword_9_0() { return cDoubleDoubleKeyword_9_0; }
		
		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_10() { return cStringEnumLiteralDeclaration_10; }
		
		//"String"
		public Keyword getStringStringKeyword_10_0() { return cStringStringKeyword_10_0; }
		
		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_11() { return cBooleanEnumLiteralDeclaration_11; }
		
		//"Boolean"
		public Keyword getBooleanBooleanKeyword_11_0() { return cBooleanBooleanKeyword_11_0; }
	}
	
	private final AttributeDefinitionElements pAttributeDefinition;
	private final AttributeRefinementElements pAttributeRefinement;
	private final FQNElements pFQN;
	private final EBooleanElements pEBoolean;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EDoubleElements pEDouble;
	private final EnumerationElementElements pEnumerationElement;
	private final AbstractAttributeTypeElements pAbstractAttributeType;
	private final InlineEnumerationTypeElements pInlineEnumerationType;
	private final ArrayTypeElements pArrayType;
	private final CardinalityElements pCardinality;
	private final PRIMITIVE_TYPE_NAMEElements ePRIMITIVE_TYPE_NAME;
	private final PrimitiveTypeElements pPrimitiveType;
	private final AbstractValueElements pAbstractValue;
	private final ArrayValueElements pArrayValue;
	private final SingleValueElements pSingleValue;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BasicAttributesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAttributeDefinition = new AttributeDefinitionElements();
		this.pAttributeRefinement = new AttributeRefinementElements();
		this.pFQN = new FQNElements();
		this.pEBoolean = new EBooleanElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEDouble = new EDoubleElements();
		this.pEnumerationElement = new EnumerationElementElements();
		this.pAbstractAttributeType = new AbstractAttributeTypeElements();
		this.pInlineEnumerationType = new InlineEnumerationTypeElements();
		this.pArrayType = new ArrayTypeElements();
		this.pCardinality = new CardinalityElements();
		this.ePRIMITIVE_TYPE_NAME = new PRIMITIVE_TYPE_NAMEElements();
		this.pPrimitiveType = new PrimitiveTypeElements();
		this.pAbstractValue = new AbstractValueElements();
		this.pArrayValue = new ArrayValueElements();
		this.pSingleValue = new SingleValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.base.basicAttributes.BasicAttributes".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AttributeDefinition attr::AttributeDefinition:
	//	name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
	public AttributeDefinitionElements getAttributeDefinitionAccess() {
		return pAttributeDefinition;
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}
	
	//AttributeRefinement attr::AttributeRefinement:
	//	attribute=[attr::AttributeDefinition|FQN] '=' value=AbstractValue ';'?;
	public AttributeRefinementElements getAttributeRefinementAccess() {
		return pAttributeRefinement;
	}
	
	public ParserRule getAttributeRefinementRule() {
		return getAttributeRefinementAccess().getRule();
	}
	
	//// parser rules for names
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EnumerationElement attr::EnumerationElement:
	//	name=ID ('=' value=EInt)? ';'?;
	public EnumerationElementElements getEnumerationElementAccess() {
		return pEnumerationElement;
	}
	
	public ParserRule getEnumerationElementRule() {
		return getEnumerationElementAccess().getRule();
	}
	
	//AbstractAttributeType attr::AbstractAttributeType:
	//	PrimitiveType | InlineEnumerationType;
	public AbstractAttributeTypeElements getAbstractAttributeTypeAccess() {
		return pAbstractAttributeType;
	}
	
	public ParserRule getAbstractAttributeTypeRule() {
		return getAbstractAttributeTypeAccess().getRule();
	}
	
	//InlineEnumerationType attr::InlineEnumerationType:
	//	'InlineEnumeration' array=ArrayType? '{' enums+=EnumerationElement+ '}';
	public InlineEnumerationTypeElements getInlineEnumerationTypeAccess() {
		return pInlineEnumerationType;
	}
	
	public ParserRule getInlineEnumerationTypeRule() {
		return getInlineEnumerationTypeAccess().getRule();
	}
	
	//ArrayType attr::ArrayType:
	//	{attr::ArrayType}
	//	'[' length=Cardinality? ']';
	public ArrayTypeElements getArrayTypeAccess() {
		return pArrayType;
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}
	
	//Cardinality:
	//	INT | '*';
	public CardinalityElements getCardinalityAccess() {
		return pCardinality;
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//enum PRIMITIVE_TYPE_NAME returns attr::PRIMITIVE_TYPE_NAME:
	//	Int8 | Int16 | Int32 | Int64 |
	//	UInt8 | UInt16 | UInt32 | UInt64 |
	//	Float | Double | String | Boolean;
	public PRIMITIVE_TYPE_NAMEElements getPRIMITIVE_TYPE_NAMEAccess() {
		return ePRIMITIVE_TYPE_NAME;
	}
	
	public EnumRule getPRIMITIVE_TYPE_NAMERule() {
		return getPRIMITIVE_TYPE_NAMEAccess().getRule();
	}
	
	//PrimitiveType attr::PrimitiveType:
	//	typeName=PRIMITIVE_TYPE_NAME array=ArrayType?;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return pPrimitiveType;
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//AbstractValue attr::AbstractValue:
	//	SingleValue | ArrayValue;
	public AbstractValueElements getAbstractValueAccess() {
		return pAbstractValue;
	}
	
	public ParserRule getAbstractValueRule() {
		return getAbstractValueAccess().getRule();
	}
	
	//ArrayValue attr::ArrayValue:
	//	'[' values+=SingleValue (',' values+=SingleValue)* ']';
	public ArrayValueElements getArrayValueAccess() {
		return pArrayValue;
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}
	
	//SingleValue attr::SingleValue:
	//	{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
	//	{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN];
	public SingleValueElements getSingleValueAccess() {
		return pSingleValue;
	}
	
	public ParserRule getSingleValueRule() {
		return getSingleValueAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
