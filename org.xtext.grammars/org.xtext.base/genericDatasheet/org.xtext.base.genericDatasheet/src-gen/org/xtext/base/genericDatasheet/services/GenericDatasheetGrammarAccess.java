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
package org.xtext.base.genericDatasheet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GenericDatasheetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GenericDatasheetModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.GenericDatasheetModel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractDatasheetElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//fragment GenericDatasheetModel:
		//	elements+=AbstractDatasheetElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractDatasheetElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractDatasheetElement
		public RuleCall getElementsAbstractDatasheetElementParserRuleCall_0() { return cElementsAbstractDatasheetElementParserRuleCall_0; }
	}
	public class AbstractDatasheetElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.AbstractDatasheetElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDatasheetPropertyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMandatoryDatasheetElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDatasheetElement:
		//	DatasheetProperty | MandatoryDatasheetElement;
		@Override public ParserRule getRule() { return rule; }
		
		//DatasheetProperty | MandatoryDatasheetElement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DatasheetProperty
		public RuleCall getDatasheetPropertyParserRuleCall_0() { return cDatasheetPropertyParserRuleCall_0; }
		
		//MandatoryDatasheetElement
		public RuleCall getMandatoryDatasheetElementParserRuleCall_1() { return cMandatoryDatasheetElementParserRuleCall_1; }
	}
	public class DatasheetPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.DatasheetProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatasheetPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cValueKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cValueAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cValueAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cUnitKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final Assignment cUnitAssignment_3_0_2_1 = (Assignment)cGroup_3_0_2.eContents().get(1);
		private final RuleCall cUnitSTRINGTerminalRuleCall_3_0_2_1_0 = (RuleCall)cUnitAssignment_3_0_2_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cShortDescriptionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cShortDescriptionAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cShortDescriptionSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cShortDescriptionAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cSemanticIDKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cSemanticIDAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cSemanticIDSTRINGTerminalRuleCall_3_2_1_0 = (RuleCall)cSemanticIDAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DatasheetProperty:
		//	'DatasheetProperty' name=ID '{' ('value' value=STRING ('unit' unit=STRING)? & ('shortDescription'
		//	shortDescription=STRING)? & ('semanticID' semanticID=STRING)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DatasheetProperty' name=ID '{' ('value' value=STRING ('unit' unit=STRING)? & ('shortDescription'
		//shortDescription=STRING)? & ('semanticID' semanticID=STRING)?) '}'
		public Group getGroup() { return cGroup; }
		
		//'DatasheetProperty'
		public Keyword getDatasheetPropertyKeyword_0() { return cDatasheetPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'value' value=STRING ('unit' unit=STRING)? & ('shortDescription' shortDescription=STRING)? & ('semanticID'
		//semanticID=STRING)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'value' value=STRING ('unit' unit=STRING)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'value'
		public Keyword getValueKeyword_3_0_0() { return cValueKeyword_3_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_3_0_1() { return cValueAssignment_3_0_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0_1_0() { return cValueSTRINGTerminalRuleCall_3_0_1_0; }
		
		//('unit' unit=STRING)?
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//'unit'
		public Keyword getUnitKeyword_3_0_2_0() { return cUnitKeyword_3_0_2_0; }
		
		//unit=STRING
		public Assignment getUnitAssignment_3_0_2_1() { return cUnitAssignment_3_0_2_1; }
		
		//STRING
		public RuleCall getUnitSTRINGTerminalRuleCall_3_0_2_1_0() { return cUnitSTRINGTerminalRuleCall_3_0_2_1_0; }
		
		//('shortDescription' shortDescription=STRING)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'shortDescription'
		public Keyword getShortDescriptionKeyword_3_1_0() { return cShortDescriptionKeyword_3_1_0; }
		
		//shortDescription=STRING
		public Assignment getShortDescriptionAssignment_3_1_1() { return cShortDescriptionAssignment_3_1_1; }
		
		//STRING
		public RuleCall getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0() { return cShortDescriptionSTRINGTerminalRuleCall_3_1_1_0; }
		
		//('semanticID' semanticID=STRING)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'semanticID'
		public Keyword getSemanticIDKeyword_3_2_0() { return cSemanticIDKeyword_3_2_0; }
		
		//semanticID=STRING
		public Assignment getSemanticIDAssignment_3_2_1() { return cSemanticIDAssignment_3_2_1; }
		
		//STRING
		public RuleCall getSemanticIDSTRINGTerminalRuleCall_3_2_1_0() { return cSemanticIDSTRINGTerminalRuleCall_3_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class MandatoryDatasheetElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.MandatoryDatasheetElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameMandatoryDatasheetElementNamesEnumRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MandatoryDatasheetElement:
		//	name=MandatoryDatasheetElementNames value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=MandatoryDatasheetElementNames value=STRING
		public Group getGroup() { return cGroup; }
		
		//name=MandatoryDatasheetElementNames
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//MandatoryDatasheetElementNames
		public RuleCall getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0() { return cNameMandatoryDatasheetElementNamesEnumRuleCall_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	
	public class MandatoryDatasheetElementNamesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.MandatoryDatasheetElementNames");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBaseURIEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBaseURIBaseURIKeyword_0_0 = (Keyword)cBaseURIEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cShortDescriptionEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cShortDescriptionShortDescriptionKeyword_1_0 = (Keyword)cShortDescriptionEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MandatoryDatasheetElementNames:
		//	BaseURI | ShortDescription;
		public EnumRule getRule() { return rule; }
		
		//BaseURI | ShortDescription
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BaseURI
		public EnumLiteralDeclaration getBaseURIEnumLiteralDeclaration_0() { return cBaseURIEnumLiteralDeclaration_0; }
		
		//'BaseURI'
		public Keyword getBaseURIBaseURIKeyword_0_0() { return cBaseURIBaseURIKeyword_0_0; }
		
		//ShortDescription
		public EnumLiteralDeclaration getShortDescriptionEnumLiteralDeclaration_1() { return cShortDescriptionEnumLiteralDeclaration_1; }
		
		//'ShortDescription'
		public Keyword getShortDescriptionShortDescriptionKeyword_1_0() { return cShortDescriptionShortDescriptionKeyword_1_0; }
	}
	
	private final GenericDatasheetModelElements pGenericDatasheetModel;
	private final AbstractDatasheetElementElements pAbstractDatasheetElement;
	private final DatasheetPropertyElements pDatasheetProperty;
	private final MandatoryDatasheetElementNamesElements eMandatoryDatasheetElementNames;
	private final MandatoryDatasheetElementElements pMandatoryDatasheetElement;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GenericDatasheetGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGenericDatasheetModel = new GenericDatasheetModelElements();
		this.pAbstractDatasheetElement = new AbstractDatasheetElementElements();
		this.pDatasheetProperty = new DatasheetPropertyElements();
		this.eMandatoryDatasheetElementNames = new MandatoryDatasheetElementNamesElements();
		this.pMandatoryDatasheetElement = new MandatoryDatasheetElementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.base.genericDatasheet.GenericDatasheet".equals(grammar.getName())) {
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

	
	//fragment GenericDatasheetModel:
	//	elements+=AbstractDatasheetElement*;
	public GenericDatasheetModelElements getGenericDatasheetModelAccess() {
		return pGenericDatasheetModel;
	}
	
	public ParserRule getGenericDatasheetModelRule() {
		return getGenericDatasheetModelAccess().getRule();
	}
	
	//AbstractDatasheetElement:
	//	DatasheetProperty | MandatoryDatasheetElement;
	public AbstractDatasheetElementElements getAbstractDatasheetElementAccess() {
		return pAbstractDatasheetElement;
	}
	
	public ParserRule getAbstractDatasheetElementRule() {
		return getAbstractDatasheetElementAccess().getRule();
	}
	
	//DatasheetProperty:
	//	'DatasheetProperty' name=ID '{' ('value' value=STRING ('unit' unit=STRING)? & ('shortDescription'
	//	shortDescription=STRING)? & ('semanticID' semanticID=STRING)?)
	//	'}';
	public DatasheetPropertyElements getDatasheetPropertyAccess() {
		return pDatasheetProperty;
	}
	
	public ParserRule getDatasheetPropertyRule() {
		return getDatasheetPropertyAccess().getRule();
	}
	
	//enum MandatoryDatasheetElementNames:
	//	BaseURI | ShortDescription;
	public MandatoryDatasheetElementNamesElements getMandatoryDatasheetElementNamesAccess() {
		return eMandatoryDatasheetElementNames;
	}
	
	public EnumRule getMandatoryDatasheetElementNamesRule() {
		return getMandatoryDatasheetElementNamesAccess().getRule();
	}
	
	//MandatoryDatasheetElement:
	//	name=MandatoryDatasheetElementNames value=STRING;
	public MandatoryDatasheetElementElements getMandatoryDatasheetElementAccess() {
		return pMandatoryDatasheetElement;
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
