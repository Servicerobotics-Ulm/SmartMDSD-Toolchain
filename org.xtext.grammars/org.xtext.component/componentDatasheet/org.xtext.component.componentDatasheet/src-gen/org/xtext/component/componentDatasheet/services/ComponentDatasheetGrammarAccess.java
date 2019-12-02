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
package org.xtext.component.componentDatasheet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class ComponentDatasheetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentDatasheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDatasheet.ComponentDatasheet.ComponentDatasheet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentDatasheetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentComponentDefinitionCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentComponentDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cComponentComponentDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cGenericDatasheetModelParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ComponentDatasheet:
		//	'ComponentDatasheet' component=[componentDefinition::ComponentDefinition]
		//	'{'
		//	GenericDatasheetModel
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentDatasheet' component=[componentDefinition::ComponentDefinition] '{' GenericDatasheetModel '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentDatasheet'
		public Keyword getComponentDatasheetKeyword_0() { return cComponentDatasheetKeyword_0; }
		
		//component=[componentDefinition::ComponentDefinition]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }
		
		//[componentDefinition::ComponentDefinition]
		public CrossReference getComponentComponentDefinitionCrossReference_1_0() { return cComponentComponentDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getComponentComponentDefinitionIDTerminalRuleCall_1_0_1() { return cComponentComponentDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//GenericDatasheetModel
		public RuleCall getGenericDatasheetModelParserRuleCall_3() { return cGenericDatasheetModelParserRuleCall_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractDatasheetElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDatasheet.ComponentDatasheet.AbstractDatasheetElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDatasheetPropertyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMandatoryDatasheetElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComponentPortDatasheetParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//@Override
		//AbstractDatasheetElement genericDatasheet::AbstractDatasheetElement:
		//	DatasheetProperty | MandatoryDatasheetElement | ComponentPortDatasheet;
		@Override public ParserRule getRule() { return rule; }
		
		//DatasheetProperty | MandatoryDatasheetElement | ComponentPortDatasheet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DatasheetProperty
		public RuleCall getDatasheetPropertyParserRuleCall_0() { return cDatasheetPropertyParserRuleCall_0; }
		
		//MandatoryDatasheetElement
		public RuleCall getMandatoryDatasheetElementParserRuleCall_1() { return cMandatoryDatasheetElementParserRuleCall_1; }
		
		//ComponentPortDatasheet
		public RuleCall getComponentPortDatasheetParserRuleCall_2() { return cComponentPortDatasheetParserRuleCall_2; }
	}
	public class ComponentPortDatasheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDatasheet.ComponentDatasheet.ComponentPortDatasheet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentPortDatasheetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortComponentPortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortComponentPortIDTerminalRuleCall_1_0_1 = (RuleCall)cPortComponentPortCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPropertiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertiesDatasheetPropertyParserRuleCall_3_0 = (RuleCall)cPropertiesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ComponentPortDatasheet:
		//	'ComponentPortDatasheet' port=[componentDefinition::ComponentPort] '{'
		//	properties+=DatasheetProperty*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentPortDatasheet' port=[componentDefinition::ComponentPort] '{' properties+=DatasheetProperty* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentPortDatasheet'
		public Keyword getComponentPortDatasheetKeyword_0() { return cComponentPortDatasheetKeyword_0; }
		
		//port=[componentDefinition::ComponentPort]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[componentDefinition::ComponentPort]
		public CrossReference getPortComponentPortCrossReference_1_0() { return cPortComponentPortCrossReference_1_0; }
		
		//ID
		public RuleCall getPortComponentPortIDTerminalRuleCall_1_0_1() { return cPortComponentPortIDTerminalRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//properties+=DatasheetProperty*
		public Assignment getPropertiesAssignment_3() { return cPropertiesAssignment_3; }
		
		//DatasheetProperty
		public RuleCall getPropertiesDatasheetPropertyParserRuleCall_3_0() { return cPropertiesDatasheetPropertyParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ComponentDatasheetElements pComponentDatasheet;
	private final AbstractDatasheetElementElements pAbstractDatasheetElement;
	private final ComponentPortDatasheetElements pComponentPortDatasheet;
	
	private final Grammar grammar;
	
	private final GenericDatasheetGrammarAccess gaGenericDatasheet;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentDatasheetGrammarAccess(GrammarProvider grammarProvider,
			GenericDatasheetGrammarAccess gaGenericDatasheet,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaGenericDatasheet = gaGenericDatasheet;
		this.gaTerminals = gaTerminals;
		this.pComponentDatasheet = new ComponentDatasheetElements();
		this.pAbstractDatasheetElement = new AbstractDatasheetElementElements();
		this.pComponentPortDatasheet = new ComponentPortDatasheetElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.component.componentDatasheet.ComponentDatasheet".equals(grammar.getName())) {
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

	
	//ComponentDatasheet:
	//	'ComponentDatasheet' component=[componentDefinition::ComponentDefinition]
	//	'{'
	//	GenericDatasheetModel
	//	'}';
	public ComponentDatasheetElements getComponentDatasheetAccess() {
		return pComponentDatasheet;
	}
	
	public ParserRule getComponentDatasheetRule() {
		return getComponentDatasheetAccess().getRule();
	}
	
	//@Override
	//AbstractDatasheetElement genericDatasheet::AbstractDatasheetElement:
	//	DatasheetProperty | MandatoryDatasheetElement | ComponentPortDatasheet;
	public AbstractDatasheetElementElements getAbstractDatasheetElementAccess() {
		return pAbstractDatasheetElement;
	}
	
	public ParserRule getAbstractDatasheetElementRule() {
		return getAbstractDatasheetElementAccess().getRule();
	}
	
	//ComponentPortDatasheet:
	//	'ComponentPortDatasheet' port=[componentDefinition::ComponentPort] '{'
	//	properties+=DatasheetProperty*
	//	'}';
	public ComponentPortDatasheetElements getComponentPortDatasheetAccess() {
		return pComponentPortDatasheet;
	}
	
	public ParserRule getComponentPortDatasheetRule() {
		return getComponentPortDatasheetAccess().getRule();
	}
	
	//fragment GenericDatasheetModel:
	//	elements+=super::AbstractDatasheetElement*;
	public GenericDatasheetGrammarAccess.GenericDatasheetModelElements getGenericDatasheetModelAccess() {
		return gaGenericDatasheet.getGenericDatasheetModelAccess();
	}
	
	public ParserRule getGenericDatasheetModelRule() {
		return getGenericDatasheetModelAccess().getRule();
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
