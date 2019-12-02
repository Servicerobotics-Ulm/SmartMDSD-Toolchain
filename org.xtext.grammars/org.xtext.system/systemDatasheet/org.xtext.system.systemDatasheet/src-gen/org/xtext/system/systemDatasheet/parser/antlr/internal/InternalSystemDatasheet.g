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
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.systemDatasheet.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.systemDatasheet.parser.antlr.internal;

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
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess;

}

@parser::members {

 	private SystemDatasheetGrammarAccess grammarAccess;

    public InternalSystemDatasheetParser(TokenStream input, SystemDatasheetGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SystemDatasheet";
   	}

   	@Override
   	protected SystemDatasheetGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystemDatasheet
entryRuleSystemDatasheet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemDatasheetRule()); }
	iv_ruleSystemDatasheet=ruleSystemDatasheet
	{ $current=$iv_ruleSystemDatasheet.current; }
	EOF;

// Rule SystemDatasheet
ruleSystemDatasheet returns [EObject current=null]
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
					grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0(),
					$current);
			}
		)
		otherlv_1='SystemDatasheet'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemDatasheetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3());
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getSystemDatasheetRule());
			}
			newCompositeNode(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4());
		}
		this_GenericDatasheetModel_4=ruleGenericDatasheetModel[$current]
		{
			$current = $this_GenericDatasheetModel_4.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5());
		}
	)
;


// Rule GenericDatasheetModel
ruleGenericDatasheetModel[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractDatasheetElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getGenericDatasheetModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.base.genericDatasheet.GenericDatasheet.AbstractDatasheetElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractDatasheetElement
entryRuleAbstractDatasheetElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractDatasheetElementRule()); }
	iv_ruleAbstractDatasheetElement=ruleAbstractDatasheetElement
	{ $current=$iv_ruleAbstractDatasheetElement.current; }
	EOF;

// Rule AbstractDatasheetElement
ruleAbstractDatasheetElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0());
		}
		this_DatasheetProperty_0=ruleDatasheetProperty
		{
			$current = $this_DatasheetProperty_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1());
		}
		this_MandatoryDatasheetElement_1=ruleMandatoryDatasheetElement
		{
			$current = $this_MandatoryDatasheetElement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDatasheetProperty
entryRuleDatasheetProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatasheetPropertyRule()); }
	iv_ruleDatasheetProperty=ruleDatasheetProperty
	{ $current=$iv_ruleDatasheetProperty.current; }
	EOF;

// Rule DatasheetProperty
ruleDatasheetProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DatasheetProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasheetPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='value'
								{
									newLeafNode(otherlv_4, grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0());
								}
								(
									(
										lv_value_5_0=RULE_STRING
										{
											newLeafNode(lv_value_5_0, grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getDatasheetPropertyRule());
											}
											setWithLastConsumed(
												$current,
												"value",
												lv_value_5_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								(
									otherlv_6='unit'
									{
										newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0());
									}
									(
										(
											lv_unit_7_0=RULE_STRING
											{
												newLeafNode(lv_unit_7_0, grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getDatasheetPropertyRule());
												}
												setWithLastConsumed(
													$current,
													"unit",
													lv_unit_7_0,
													"org.eclipse.xtext.common.Terminals.STRING");
											}
										)
									)
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='shortDescription'
								{
									newLeafNode(otherlv_8, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0());
								}
								(
									(
										lv_shortDescription_9_0=RULE_STRING
										{
											newLeafNode(lv_shortDescription_9_0, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getDatasheetPropertyRule());
											}
											setWithLastConsumed(
												$current,
												"shortDescription",
												lv_shortDescription_9_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_10='semanticID'
								{
									newLeafNode(otherlv_10, grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0());
								}
								(
									(
										lv_semanticID_11_0=RULE_STRING
										{
											newLeafNode(lv_semanticID_11_0, grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getDatasheetPropertyRule());
											}
											setWithLastConsumed(
												$current,
												"semanticID",
												lv_semanticID_11_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleMandatoryDatasheetElement
entryRuleMandatoryDatasheetElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMandatoryDatasheetElementRule()); }
	iv_ruleMandatoryDatasheetElement=ruleMandatoryDatasheetElement
	{ $current=$iv_ruleMandatoryDatasheetElement.current; }
	EOF;

// Rule MandatoryDatasheetElement
ruleMandatoryDatasheetElement returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0());
				}
				lv_name_0_0=ruleMandatoryDatasheetElementNames
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMandatoryDatasheetElementRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.base.genericDatasheet.GenericDatasheet.MandatoryDatasheetElementNames");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMandatoryDatasheetElementRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Rule MandatoryDatasheetElementNames
ruleMandatoryDatasheetElementNames returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BaseURI'
			{
				$current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ShortDescription'
			{
				$current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
