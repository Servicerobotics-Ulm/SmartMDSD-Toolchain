//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
grammar InternalSystemDatasheetPropertyChecks;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.datasheetPropertyChecks.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.datasheetPropertyChecks.parser.antlr.internal;

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
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;

}

@parser::members {

 	private SystemDatasheetPropertyChecksGrammarAccess grammarAccess;

    public InternalSystemDatasheetPropertyChecksParser(TokenStream input, SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SystemDatasheetPropertyChecksModel";
   	}

   	@Override
   	protected SystemDatasheetPropertyChecksGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystemDatasheetPropertyChecksModel
entryRuleSystemDatasheetPropertyChecksModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemDatasheetPropertyChecksModelRule()); }
	iv_ruleSystemDatasheetPropertyChecksModel=ruleSystemDatasheetPropertyChecksModel
	{ $current=$iv_ruleSystemDatasheetPropertyChecksModel.current; }
	EOF;

// Rule SystemDatasheetPropertyChecksModel
ruleSystemDatasheetPropertyChecksModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SystemDatasheetPropertyChecksModel'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemDatasheetPropertyChecksModelKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemDatasheetPropertyChecksModelRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureCrossReference_1_0());
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksDatasheetPropertyCheckParserRuleCall_3_0());
				}
				lv_checks_3_0=ruleDatasheetPropertyCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemDatasheetPropertyChecksModelRule());
					}
					add(
						$current,
						"checks",
						lv_checks_3_0,
						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.DatasheetPropertyCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDatasheetPropertyCheck
entryRuleDatasheetPropertyCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatasheetPropertyCheckRule()); }
	iv_ruleDatasheetPropertyCheck=ruleDatasheetPropertyCheck
	{ $current=$iv_ruleDatasheetPropertyCheck.current; }
	EOF;

// Rule DatasheetPropertyCheck
ruleDatasheetPropertyCheck returns [EObject current=null]
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
					grammarAccess.getDatasheetPropertyCheckAccess().getDatasheetPropertyCheckAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionEvaluationFunctionEnumRuleCall_1_0());
				}
				lv_function_1_0=ruleEvaluationFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatasheetPropertyCheckRule());
					}
					set(
						$current,
						"function",
						lv_function_1_0,
						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationFunction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_propertyName_2_0=RULE_ID
				{
					newLeafNode(lv_propertyName_2_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
					}
					setWithLastConsumed(
						$current,
						"propertyName",
						lv_propertyName_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorEvaluationOperatorEnumRuleCall_3_0());
				}
				lv_operator_3_0=ruleEvaluationOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatasheetPropertyCheckRule());
					}
					set(
						$current,
						"operator",
						lv_operator_3_0,
						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_propertyValue_4_0=RULE_STRING
				{
					newLeafNode(lv_propertyValue_4_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
					}
					setWithLastConsumed(
						$current,
						"propertyValue",
						lv_propertyValue_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_propertyUnit_5_0=RULE_STRING
				{
					newLeafNode(lv_propertyUnit_5_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
					}
					setWithLastConsumed(
						$current,
						"propertyUnit",
						lv_propertyUnit_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyCheckAccess().getSemicolonKeyword_6());
			}
		)?
	)
;

// Rule EvaluationFunction
ruleEvaluationFunction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='\u2200'
			{
				$current = grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\u03A3'
			{
				$current = grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\u2203'
			{
				$current = grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule EvaluationOperator
ruleEvaluationOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='=='
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='<'
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='<='
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='>='
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='>'
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='compatible_to'
			{
				$current = grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6());
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
