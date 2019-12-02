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
grammar InternalBasicAttributes;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.base.basicAttributes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.base.basicAttributes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

}

@parser::members {

 	private BasicAttributesGrammarAccess grammarAccess;

    public InternalBasicAttributesParser(TokenStream input, BasicAttributesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AttributeDefinition";
   	}

   	@Override
   	protected BasicAttributesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAttributeDefinition
entryRuleAttributeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeDefinitionRule()); }
	iv_ruleAttributeDefinition=ruleAttributeDefinition
	{ $current=$iv_ruleAttributeDefinition.current; }
	EOF;

// Rule AttributeDefinition
ruleAttributeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_documentation_0_0=RULE_DOCU_COMMENT
				{
					newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"documentation",
						lv_documentation_0_0,
						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleAbstractAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0());
					}
					lv_defaultvalue_5_0=ruleAbstractValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
						}
						set(
							$current,
							"defaultvalue",
							lv_defaultvalue_5_0,
							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
			}
		)?
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleEnumerationElement
entryRuleEnumerationElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationElementRule()); }
	iv_ruleEnumerationElement=ruleEnumerationElement
	{ $current=$iv_ruleEnumerationElement.current; }
	EOF;

// Rule EnumerationElement
ruleEnumerationElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
					}
					lv_value_2_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationElementRule());
						}
						set(
							$current,
							"value",
							lv_value_2_0,
							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleAbstractAttributeType
entryRuleAbstractAttributeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); }
	iv_ruleAbstractAttributeType=ruleAbstractAttributeType
	{ $current=$iv_ruleAbstractAttributeType.current; }
	EOF;

// Rule AbstractAttributeType
ruleAbstractAttributeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
		}
		this_PrimitiveType_0=rulePrimitiveType
		{
			$current = $this_PrimitiveType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1());
		}
		this_InlineEnumerationType_1=ruleInlineEnumerationType
		{
			$current = $this_InlineEnumerationType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInlineEnumerationType
entryRuleInlineEnumerationType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInlineEnumerationTypeRule()); }
	iv_ruleInlineEnumerationType=ruleInlineEnumerationType
	{ $current=$iv_ruleInlineEnumerationType.current; }
	EOF;

// Rule InlineEnumerationType
ruleInlineEnumerationType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InlineEnumeration'
		{
			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
				}
				lv_array_1_0=ruleArrayType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
					}
					set(
						$current,
						"array",
						lv_array_1_0,
						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
				}
				lv_enums_3_0=ruleEnumerationElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
					}
					add(
						$current,
						"enums",
						lv_enums_3_0,
						"org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleArrayType
entryRuleArrayType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayTypeRule()); }
	iv_ruleArrayType=ruleArrayType
	{ $current=$iv_ruleArrayType.current; }
	EOF;

// Rule ArrayType
ruleArrayType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
				}
				lv_length_2_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayTypeRule());
					}
					set(
						$current,
						"length",
						lv_length_2_0,
						"org.xtext.base.basicAttributes.BasicAttributes.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current.getText(); }
	EOF;

// Rule Cardinality
ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1());
		}
	)
;

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeRule()); }
	iv_rulePrimitiveType=rulePrimitiveType
	{ $current=$iv_rulePrimitiveType.current; }
	EOF;

// Rule PrimitiveType
rulePrimitiveType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
				}
				lv_typeName_0_0=rulePRIMITIVE_TYPE_NAME
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
					}
					set(
						$current,
						"typeName",
						lv_typeName_0_0,
						"org.xtext.base.basicAttributes.BasicAttributes.PRIMITIVE_TYPE_NAME");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
				}
				lv_array_1_0=ruleArrayType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
					}
					set(
						$current,
						"array",
						lv_array_1_0,
						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleAbstractValue
entryRuleAbstractValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractValueRule()); }
	iv_ruleAbstractValue=ruleAbstractValue
	{ $current=$iv_ruleAbstractValue.current; }
	EOF;

// Rule AbstractValue
ruleAbstractValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0());
		}
		this_SingleValue_0=ruleSingleValue
		{
			$current = $this_SingleValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1());
		}
		this_ArrayValue_1=ruleArrayValue
		{
			$current = $this_ArrayValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleArrayValue
entryRuleArrayValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayValueRule()); }
	iv_ruleArrayValue=ruleArrayValue
	{ $current=$iv_ruleArrayValue.current; }
	EOF;

// Rule ArrayValue
ruleArrayValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
				}
				lv_values_1_0=ruleSingleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayValueRule());
					}
					add(
						$current,
						"values",
						lv_values_1_0,
						"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
					}
					lv_values_3_0=ruleSingleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayValueRule());
						}
						add(
							$current,
							"values",
							lv_values_3_0,
							"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSingleValue
entryRuleSingleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleValueRule()); }
	iv_ruleSingleValue=ruleSingleValue
	{ $current=$iv_ruleSingleValue.current; }
	EOF;

// Rule SingleValue
ruleSingleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0());
					}
					lv_value_1_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleValueRule());
						}
						set(
							$current,
							"value",
							lv_value_1_0,
							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0());
					}
					lv_value_3_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleValueRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"org.xtext.base.basicAttributes.BasicAttributes.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0());
					}
					lv_value_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleValueRule());
						}
						set(
							$current,
							"value",
							lv_value_5_0,
							"org.xtext.base.basicAttributes.BasicAttributes.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0());
					}
					lv_value_7_0=ruleEBoolean
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleValueRule());
						}
						set(
							$current,
							"value",
							lv_value_7_0,
							"org.xtext.base.basicAttributes.BasicAttributes.EBoolean");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleValueRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Rule PRIMITIVE_TYPE_NAME
rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Int8'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Int16'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Int32'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Int64'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='UInt8'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='UInt16'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='UInt32'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='UInt64'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='Float'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='Double'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='String'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='Boolean'
			{
				$current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11());
			}
		)
	)
;

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
