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
package org.xtext.service.domainModelsDatasheet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class DomainModelsDatasheetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainModelsDatasheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.domainModelsDatasheet.DomainModelsDatasheet.DomainModelsDatasheet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainModelsDatasheetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cGenericDatasheetModelParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DomainModelsDatasheet:
		//	'DomainModelsDatasheet' name=ID
		//	'{'
		//	GenericDatasheetModel
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DomainModelsDatasheet' name=ID '{' GenericDatasheetModel '}'
		public Group getGroup() { return cGroup; }
		
		//'DomainModelsDatasheet'
		public Keyword getDomainModelsDatasheetKeyword_0() { return cDomainModelsDatasheetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//GenericDatasheetModel
		public RuleCall getGenericDatasheetModelParserRuleCall_3() { return cGenericDatasheetModelParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final DomainModelsDatasheetElements pDomainModelsDatasheet;
	
	private final Grammar grammar;
	
	private final GenericDatasheetGrammarAccess gaGenericDatasheet;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainModelsDatasheetGrammarAccess(GrammarProvider grammarProvider,
			GenericDatasheetGrammarAccess gaGenericDatasheet,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaGenericDatasheet = gaGenericDatasheet;
		this.gaTerminals = gaTerminals;
		this.pDomainModelsDatasheet = new DomainModelsDatasheetElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.domainModelsDatasheet.DomainModelsDatasheet".equals(grammar.getName())) {
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

	
	//DomainModelsDatasheet:
	//	'DomainModelsDatasheet' name=ID
	//	'{'
	//	GenericDatasheetModel
	//	'}';
	public DomainModelsDatasheetElements getDomainModelsDatasheetAccess() {
		return pDomainModelsDatasheet;
	}
	
	public ParserRule getDomainModelsDatasheetRule() {
		return getDomainModelsDatasheetAccess().getRule();
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
