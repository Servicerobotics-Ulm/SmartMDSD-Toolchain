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
package org.xtext.system.systemDatasheet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;

@Singleton
public class SystemDatasheetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemDatasheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.systemDatasheet.SystemDatasheet.SystemDatasheet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSystemDatasheetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemDatasheetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cGenericDatasheetModelParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SystemDatasheet:
		//	{SystemDatasheet}
		//	'SystemDatasheet' name=ID
		//	'{'
		//	GenericDatasheetModel
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SystemDatasheet} 'SystemDatasheet' name=ID '{' GenericDatasheetModel '}'
		public Group getGroup() { return cGroup; }
		
		//{SystemDatasheet}
		public Action getSystemDatasheetAction_0() { return cSystemDatasheetAction_0; }
		
		//'SystemDatasheet'
		public Keyword getSystemDatasheetKeyword_1() { return cSystemDatasheetKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//GenericDatasheetModel
		public RuleCall getGenericDatasheetModelParserRuleCall_4() { return cGenericDatasheetModelParserRuleCall_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final SystemDatasheetElements pSystemDatasheet;
	
	private final Grammar grammar;
	
	private final GenericDatasheetGrammarAccess gaGenericDatasheet;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SystemDatasheetGrammarAccess(GrammarProvider grammarProvider,
			GenericDatasheetGrammarAccess gaGenericDatasheet,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaGenericDatasheet = gaGenericDatasheet;
		this.gaTerminals = gaTerminals;
		this.pSystemDatasheet = new SystemDatasheetElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.systemDatasheet.SystemDatasheet".equals(grammar.getName())) {
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
	
	
	public GenericDatasheetGrammarAccess getGenericDatasheetGrammarAccess() {
		return gaGenericDatasheet;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SystemDatasheet:
	//	{SystemDatasheet}
	//	'SystemDatasheet' name=ID
	//	'{'
	//	GenericDatasheetModel
	//	'}';
	public SystemDatasheetElements getSystemDatasheetAccess() {
		return pSystemDatasheet;
	}
	
	public ParserRule getSystemDatasheetRule() {
		return getSystemDatasheetAccess().getRule();
	}
	
	//fragment GenericDatasheetModel:
	//	elements+=AbstractDatasheetElement*;
	public GenericDatasheetGrammarAccess.GenericDatasheetModelElements getGenericDatasheetModelAccess() {
		return gaGenericDatasheet.getGenericDatasheetModelAccess();
	}
	
	public ParserRule getGenericDatasheetModelRule() {
		return getGenericDatasheetModelAccess().getRule();
	}
	
	//AbstractDatasheetElement:
	//	DatasheetProperty | MandatoryDatasheetElement;
	public GenericDatasheetGrammarAccess.AbstractDatasheetElementElements getAbstractDatasheetElementAccess() {
		return gaGenericDatasheet.getAbstractDatasheetElementAccess();
	}
	
	public ParserRule getAbstractDatasheetElementRule() {
		return getAbstractDatasheetElementAccess().getRule();
	}
	
	//DatasheetProperty:
	//	'DatasheetProperty' name=ID '{' ('value' value=STRING ('unit' unit=STRING)? & ('shortDescription'
	//	shortDescription=STRING)? & ('semanticID' semanticID=STRING)?)
	//	'}';
	public GenericDatasheetGrammarAccess.DatasheetPropertyElements getDatasheetPropertyAccess() {
		return gaGenericDatasheet.getDatasheetPropertyAccess();
	}
	
	public ParserRule getDatasheetPropertyRule() {
		return getDatasheetPropertyAccess().getRule();
	}
	
	//enum MandatoryDatasheetElementNames:
	//	BaseURI | ShortDescription;
	public GenericDatasheetGrammarAccess.MandatoryDatasheetElementNamesElements getMandatoryDatasheetElementNamesAccess() {
		return gaGenericDatasheet.getMandatoryDatasheetElementNamesAccess();
	}
	
	public EnumRule getMandatoryDatasheetElementNamesRule() {
		return getMandatoryDatasheetElementNamesAccess().getRule();
	}
	
	//MandatoryDatasheetElement:
	//	name=MandatoryDatasheetElementNames value=STRING;
	public GenericDatasheetGrammarAccess.MandatoryDatasheetElementElements getMandatoryDatasheetElementAccess() {
		return gaGenericDatasheet.getMandatoryDatasheetElementAccess();
	}
	
	public ParserRule getMandatoryDatasheetElementRule() {
		return getMandatoryDatasheetElementAccess().getRule();
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
