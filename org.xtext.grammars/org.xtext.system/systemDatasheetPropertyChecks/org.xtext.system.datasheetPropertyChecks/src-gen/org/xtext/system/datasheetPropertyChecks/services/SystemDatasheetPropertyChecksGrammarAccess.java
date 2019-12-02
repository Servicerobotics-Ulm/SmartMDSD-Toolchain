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
package org.xtext.system.datasheetPropertyChecks.services;

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
public class SystemDatasheetPropertyChecksGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemDatasheetPropertyChecksModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.SystemDatasheetPropertyChecksModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemDatasheetPropertyChecksModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSystemAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSystemSystemComponentArchitectureCrossReference_1_0 = (CrossReference)cSystemAssignment_1.eContents().get(0);
		private final RuleCall cSystemSystemComponentArchitectureIDTerminalRuleCall_1_0_1 = (RuleCall)cSystemSystemComponentArchitectureCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cChecksAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cChecksDatasheetPropertyCheckParserRuleCall_3_0 = (RuleCall)cChecksAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SystemDatasheetPropertyChecksModel:
		//	'SystemDatasheetPropertyChecksModel' system=[componentArchitecture::SystemComponentArchitecture]
		//	'{'
		//	checks+=DatasheetPropertyCheck*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SystemDatasheetPropertyChecksModel' system=[componentArchitecture::SystemComponentArchitecture] '{'
		//checks+=DatasheetPropertyCheck* '}'
		public Group getGroup() { return cGroup; }
		
		//'SystemDatasheetPropertyChecksModel'
		public Keyword getSystemDatasheetPropertyChecksModelKeyword_0() { return cSystemDatasheetPropertyChecksModelKeyword_0; }
		
		//system=[componentArchitecture::SystemComponentArchitecture]
		public Assignment getSystemAssignment_1() { return cSystemAssignment_1; }
		
		//[componentArchitecture::SystemComponentArchitecture]
		public CrossReference getSystemSystemComponentArchitectureCrossReference_1_0() { return cSystemSystemComponentArchitectureCrossReference_1_0; }
		
		//ID
		public RuleCall getSystemSystemComponentArchitectureIDTerminalRuleCall_1_0_1() { return cSystemSystemComponentArchitectureIDTerminalRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//checks+=DatasheetPropertyCheck*
		public Assignment getChecksAssignment_3() { return cChecksAssignment_3; }
		
		//DatasheetPropertyCheck
		public RuleCall getChecksDatasheetPropertyCheckParserRuleCall_3_0() { return cChecksDatasheetPropertyCheckParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DatasheetPropertyCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.DatasheetPropertyCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDatasheetPropertyCheckAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFunctionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFunctionEvaluationFunctionEnumRuleCall_1_0 = (RuleCall)cFunctionAssignment_1.eContents().get(0);
		private final Assignment cPropertyNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPropertyNameIDTerminalRuleCall_2_0 = (RuleCall)cPropertyNameAssignment_2.eContents().get(0);
		private final Assignment cOperatorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOperatorEvaluationOperatorEnumRuleCall_3_0 = (RuleCall)cOperatorAssignment_3.eContents().get(0);
		private final Assignment cPropertyValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPropertyValueSTRINGTerminalRuleCall_4_0 = (RuleCall)cPropertyValueAssignment_4.eContents().get(0);
		private final Assignment cPropertyUnitAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertyUnitSTRINGTerminalRuleCall_5_0 = (RuleCall)cPropertyUnitAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DatasheetPropertyCheck:
		//	{DatasheetPropertyCheck} function=EvaluationFunction propertyName=ID operator=EvaluationOperator propertyValue=STRING
		//	propertyUnit=STRING? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{DatasheetPropertyCheck} function=EvaluationFunction propertyName=ID operator=EvaluationOperator propertyValue=STRING
		//propertyUnit=STRING? ';'?
		public Group getGroup() { return cGroup; }
		
		//{DatasheetPropertyCheck}
		public Action getDatasheetPropertyCheckAction_0() { return cDatasheetPropertyCheckAction_0; }
		
		//function=EvaluationFunction
		public Assignment getFunctionAssignment_1() { return cFunctionAssignment_1; }
		
		//EvaluationFunction
		public RuleCall getFunctionEvaluationFunctionEnumRuleCall_1_0() { return cFunctionEvaluationFunctionEnumRuleCall_1_0; }
		
		//propertyName=ID
		public Assignment getPropertyNameAssignment_2() { return cPropertyNameAssignment_2; }
		
		//ID
		public RuleCall getPropertyNameIDTerminalRuleCall_2_0() { return cPropertyNameIDTerminalRuleCall_2_0; }
		
		//operator=EvaluationOperator
		public Assignment getOperatorAssignment_3() { return cOperatorAssignment_3; }
		
		//EvaluationOperator
		public RuleCall getOperatorEvaluationOperatorEnumRuleCall_3_0() { return cOperatorEvaluationOperatorEnumRuleCall_3_0; }
		
		//propertyValue=STRING
		public Assignment getPropertyValueAssignment_4() { return cPropertyValueAssignment_4; }
		
		//STRING
		public RuleCall getPropertyValueSTRINGTerminalRuleCall_4_0() { return cPropertyValueSTRINGTerminalRuleCall_4_0; }
		
		//propertyUnit=STRING?
		public Assignment getPropertyUnitAssignment_5() { return cPropertyUnitAssignment_5; }
		
		//STRING
		public RuleCall getPropertyUnitSTRINGTerminalRuleCall_5_0() { return cPropertyUnitSTRINGTerminalRuleCall_5_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	
	public class EvaluationFunctionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationFunction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFOR_ALLEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFOR_ALLForAllKeyword_0_0 = (Keyword)cFOR_ALLEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSUMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSUMGreekCapitalLetterSigmaKeyword_1_0 = (Keyword)cSUMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEXISTSEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEXISTSThereExistsKeyword_2_0 = (Keyword)cEXISTSEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EvaluationFunction:
		//	FOR_ALL='∀' | SUM='Σ' | EXISTS='∃';
		public EnumRule getRule() { return rule; }
		
		//FOR_ALL='∀' | SUM='Σ' | EXISTS='∃'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FOR_ALL='∀'
		public EnumLiteralDeclaration getFOR_ALLEnumLiteralDeclaration_0() { return cFOR_ALLEnumLiteralDeclaration_0; }
		
		//'∀'
		public Keyword getFOR_ALLForAllKeyword_0_0() { return cFOR_ALLForAllKeyword_0_0; }
		
		//SUM='Σ'
		public EnumLiteralDeclaration getSUMEnumLiteralDeclaration_1() { return cSUMEnumLiteralDeclaration_1; }
		
		//'Σ'
		public Keyword getSUMGreekCapitalLetterSigmaKeyword_1_0() { return cSUMGreekCapitalLetterSigmaKeyword_1_0; }
		
		//EXISTS='∃'
		public EnumLiteralDeclaration getEXISTSEnumLiteralDeclaration_2() { return cEXISTSEnumLiteralDeclaration_2; }
		
		//'∃'
		public Keyword getEXISTSThereExistsKeyword_2_0() { return cEXISTSThereExistsKeyword_2_0; }
	}
	public class EvaluationOperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQEqualsSignEqualsSignKeyword_0_0 = (Keyword)cEQEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNEQEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNEQExclamationMarkEqualsSignKeyword_1_0 = (Keyword)cNEQEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLTLessThanSignKeyword_2_0 = (Keyword)cLTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLETEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLETLessThanSignEqualsSignKeyword_3_0 = (Keyword)cLETEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cGETEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cGETGreaterThanSignEqualsSignKeyword_4_0 = (Keyword)cGETEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cGTEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cGTGreaterThanSignKeyword_5_0 = (Keyword)cGTEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cCOMPATIBLE_TOEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cCOMPATIBLE_TOCompatible_toKeyword_6_0 = (Keyword)cCOMPATIBLE_TOEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum EvaluationOperator:
		//	EQ='==' | NEQ='!=' | LT='<' | LET='<=' | GET='>=' | GT='>' | COMPATIBLE_TO='compatible_to';
		public EnumRule getRule() { return rule; }
		
		//EQ='==' | NEQ='!=' | LT='<' | LET='<=' | GET='>=' | GT='>' | COMPATIBLE_TO='compatible_to'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQ='=='
		public EnumLiteralDeclaration getEQEnumLiteralDeclaration_0() { return cEQEnumLiteralDeclaration_0; }
		
		//'=='
		public Keyword getEQEqualsSignEqualsSignKeyword_0_0() { return cEQEqualsSignEqualsSignKeyword_0_0; }
		
		//NEQ='!='
		public EnumLiteralDeclaration getNEQEnumLiteralDeclaration_1() { return cNEQEnumLiteralDeclaration_1; }
		
		//'!='
		public Keyword getNEQExclamationMarkEqualsSignKeyword_1_0() { return cNEQExclamationMarkEqualsSignKeyword_1_0; }
		
		//LT='<'
		public EnumLiteralDeclaration getLTEnumLiteralDeclaration_2() { return cLTEnumLiteralDeclaration_2; }
		
		//'<'
		public Keyword getLTLessThanSignKeyword_2_0() { return cLTLessThanSignKeyword_2_0; }
		
		//LET='<='
		public EnumLiteralDeclaration getLETEnumLiteralDeclaration_3() { return cLETEnumLiteralDeclaration_3; }
		
		//'<='
		public Keyword getLETLessThanSignEqualsSignKeyword_3_0() { return cLETLessThanSignEqualsSignKeyword_3_0; }
		
		//GET='>='
		public EnumLiteralDeclaration getGETEnumLiteralDeclaration_4() { return cGETEnumLiteralDeclaration_4; }
		
		//'>='
		public Keyword getGETGreaterThanSignEqualsSignKeyword_4_0() { return cGETGreaterThanSignEqualsSignKeyword_4_0; }
		
		//GT='>'
		public EnumLiteralDeclaration getGTEnumLiteralDeclaration_5() { return cGTEnumLiteralDeclaration_5; }
		
		//'>'
		public Keyword getGTGreaterThanSignKeyword_5_0() { return cGTGreaterThanSignKeyword_5_0; }
		
		//COMPATIBLE_TO='compatible_to'
		public EnumLiteralDeclaration getCOMPATIBLE_TOEnumLiteralDeclaration_6() { return cCOMPATIBLE_TOEnumLiteralDeclaration_6; }
		
		//'compatible_to'
		public Keyword getCOMPATIBLE_TOCompatible_toKeyword_6_0() { return cCOMPATIBLE_TOCompatible_toKeyword_6_0; }
	}
	
	private final SystemDatasheetPropertyChecksModelElements pSystemDatasheetPropertyChecksModel;
	private final DatasheetPropertyCheckElements pDatasheetPropertyCheck;
	private final EvaluationFunctionElements eEvaluationFunction;
	private final EvaluationOperatorElements eEvaluationOperator;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SystemDatasheetPropertyChecksGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSystemDatasheetPropertyChecksModel = new SystemDatasheetPropertyChecksModelElements();
		this.pDatasheetPropertyCheck = new DatasheetPropertyCheckElements();
		this.eEvaluationFunction = new EvaluationFunctionElements();
		this.eEvaluationOperator = new EvaluationOperatorElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks".equals(grammar.getName())) {
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

	
	//SystemDatasheetPropertyChecksModel:
	//	'SystemDatasheetPropertyChecksModel' system=[componentArchitecture::SystemComponentArchitecture]
	//	'{'
	//	checks+=DatasheetPropertyCheck*
	//	'}';
	public SystemDatasheetPropertyChecksModelElements getSystemDatasheetPropertyChecksModelAccess() {
		return pSystemDatasheetPropertyChecksModel;
	}
	
	public ParserRule getSystemDatasheetPropertyChecksModelRule() {
		return getSystemDatasheetPropertyChecksModelAccess().getRule();
	}
	
	//DatasheetPropertyCheck:
	//	{DatasheetPropertyCheck} function=EvaluationFunction propertyName=ID operator=EvaluationOperator propertyValue=STRING
	//	propertyUnit=STRING? ';'?;
	public DatasheetPropertyCheckElements getDatasheetPropertyCheckAccess() {
		return pDatasheetPropertyCheck;
	}
	
	public ParserRule getDatasheetPropertyCheckRule() {
		return getDatasheetPropertyCheckAccess().getRule();
	}
	
	//enum EvaluationFunction:
	//	FOR_ALL='∀' | SUM='Σ' | EXISTS='∃';
	public EvaluationFunctionElements getEvaluationFunctionAccess() {
		return eEvaluationFunction;
	}
	
	public EnumRule getEvaluationFunctionRule() {
		return getEvaluationFunctionAccess().getRule();
	}
	
	//enum EvaluationOperator:
	//	EQ='==' | NEQ='!=' | LT='<' | LET='<=' | GET='>=' | GT='>' | COMPATIBLE_TO='compatible_to';
	public EvaluationOperatorElements getEvaluationOperatorAccess() {
		return eEvaluationOperator;
	}
	
	public EnumRule getEvaluationOperatorRule() {
		return getEvaluationOperatorAccess().getRule();
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
