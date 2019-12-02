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
package org.xtext.service.roboticMiddleware.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;

@Singleton
public class RoboticMiddlewareGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RoboticMiddlewareElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cACE_SmartSoftParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOpcUa_SeRoNetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCORBA_SmartSoftParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDDS_SmartSoftParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//RoboticMiddleware:
		//	ACE_SmartSoft | OpcUa_SeRoNet | CORBA_SmartSoft | DDS_SmartSoft;
		@Override public ParserRule getRule() { return rule; }
		
		//ACE_SmartSoft | OpcUa_SeRoNet | CORBA_SmartSoft | DDS_SmartSoft
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ACE_SmartSoft
		public RuleCall getACE_SmartSoftParserRuleCall_0() { return cACE_SmartSoftParserRuleCall_0; }
		
		//OpcUa_SeRoNet
		public RuleCall getOpcUa_SeRoNetParserRuleCall_1() { return cOpcUa_SeRoNetParserRuleCall_1; }
		
		//CORBA_SmartSoft
		public RuleCall getCORBA_SmartSoftParserRuleCall_2() { return cCORBA_SmartSoftParserRuleCall_2; }
		
		//DDS_SmartSoft
		public RuleCall getDDS_SmartSoftParserRuleCall_3() { return cDDS_SmartSoftParserRuleCall_3; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
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
	public class FQNWElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.FQNW");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FQNW:
		//	FQN '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN '.*'?
		public Group getGroup() { return cGroup; }
		
		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
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
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.EBoolean");
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
	public class ACE_SmartSoftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.ACE_SmartSoft");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cACE_SmartSoftAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cACE_SmartSoftKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//ACE_SmartSoft:
		//	{ACE_SmartSoft}
		//	'ACE_SmartSoft' ('description' description=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ACE_SmartSoft} 'ACE_SmartSoft' ('description' description=EString)?
		public Group getGroup() { return cGroup; }
		
		//{ACE_SmartSoft}
		public Action getACE_SmartSoftAction_0() { return cACE_SmartSoftAction_0; }
		
		//'ACE_SmartSoft'
		public Keyword getACE_SmartSoftKeyword_1() { return cACE_SmartSoftKeyword_1; }
		
		//('description' description=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }
	}
	public class OpcUa_SeRoNetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.OpcUa_SeRoNet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOpcUa_SeRoNetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOpcUa_SeRoNetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//OpcUa_SeRoNet:
		//	{OpcUa_SeRoNet}
		//	'OpcUa_SeRoNet' ('description' description=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{OpcUa_SeRoNet} 'OpcUa_SeRoNet' ('description' description=EString)?
		public Group getGroup() { return cGroup; }
		
		//{OpcUa_SeRoNet}
		public Action getOpcUa_SeRoNetAction_0() { return cOpcUa_SeRoNetAction_0; }
		
		//'OpcUa_SeRoNet'
		public Keyword getOpcUa_SeRoNetKeyword_1() { return cOpcUa_SeRoNetKeyword_1; }
		
		//('description' description=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }
	}
	public class CORBA_SmartSoftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.CORBA_SmartSoft");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCORBA_SmartSoftAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCORBA_SmartSoftKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//CORBA_SmartSoft:
		//	{CORBA_SmartSoft}
		//	'CORBA_SmartSoft' ('description' description=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{CORBA_SmartSoft} 'CORBA_SmartSoft' ('description' description=EString)?
		public Group getGroup() { return cGroup; }
		
		//{CORBA_SmartSoft}
		public Action getCORBA_SmartSoftAction_0() { return cCORBA_SmartSoftAction_0; }
		
		//'CORBA_SmartSoft'
		public Keyword getCORBA_SmartSoftKeyword_1() { return cCORBA_SmartSoftKeyword_1; }
		
		//('description' description=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }
	}
	public class DDS_SmartSoftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.roboticMiddleware.RoboticMiddleware.DDS_SmartSoft");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDDS_SmartSoftAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDDS_SmartSoftKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//DDS_SmartSoft:
		//	{DDS_SmartSoft}
		//	'DDS_SmartSoft' ('description' description=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{DDS_SmartSoft} 'DDS_SmartSoft' ('description' description=EString)?
		public Group getGroup() { return cGroup; }
		
		//{DDS_SmartSoft}
		public Action getDDS_SmartSoftAction_0() { return cDDS_SmartSoftAction_0; }
		
		//'DDS_SmartSoft'
		public Keyword getDDS_SmartSoftKeyword_1() { return cDDS_SmartSoftKeyword_1; }
		
		//('description' description=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_2_1_0() { return cDescriptionEStringParserRuleCall_2_1_0; }
	}
	
	
	private final RoboticMiddlewareElements pRoboticMiddleware;
	private final FQNElements pFQN;
	private final FQNWElements pFQNW;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EDoubleElements pEDouble;
	private final EBooleanElements pEBoolean;
	private final ACE_SmartSoftElements pACE_SmartSoft;
	private final OpcUa_SeRoNetElements pOpcUa_SeRoNet;
	private final CORBA_SmartSoftElements pCORBA_SmartSoft;
	private final DDS_SmartSoftElements pDDS_SmartSoft;
	
	private final Grammar grammar;
	
	private final DocuTerminalsGrammarAccess gaDocuTerminals;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RoboticMiddlewareGrammarAccess(GrammarProvider grammarProvider,
			DocuTerminalsGrammarAccess gaDocuTerminals,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaDocuTerminals = gaDocuTerminals;
		this.gaTerminals = gaTerminals;
		this.pRoboticMiddleware = new RoboticMiddlewareElements();
		this.pFQN = new FQNElements();
		this.pFQNW = new FQNWElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEDouble = new EDoubleElements();
		this.pEBoolean = new EBooleanElements();
		this.pACE_SmartSoft = new ACE_SmartSoftElements();
		this.pOpcUa_SeRoNet = new OpcUa_SeRoNetElements();
		this.pCORBA_SmartSoft = new CORBA_SmartSoftElements();
		this.pDDS_SmartSoft = new DDS_SmartSoftElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.roboticMiddleware.RoboticMiddleware".equals(grammar.getName())) {
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
	
	
	public DocuTerminalsGrammarAccess getDocuTerminalsGrammarAccess() {
		return gaDocuTerminals;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RoboticMiddleware:
	//	ACE_SmartSoft | OpcUa_SeRoNet | CORBA_SmartSoft | DDS_SmartSoft;
	public RoboticMiddlewareElements getRoboticMiddlewareAccess() {
		return pRoboticMiddleware;
	}
	
	public ParserRule getRoboticMiddlewareRule() {
		return getRoboticMiddlewareAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FQNW:
	//	FQN '.*'?;
	public FQNWElements getFQNWAccess() {
		return pFQNW;
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
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
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//ACE_SmartSoft:
	//	{ACE_SmartSoft}
	//	'ACE_SmartSoft' ('description' description=EString)?;
	public ACE_SmartSoftElements getACE_SmartSoftAccess() {
		return pACE_SmartSoft;
	}
	
	public ParserRule getACE_SmartSoftRule() {
		return getACE_SmartSoftAccess().getRule();
	}
	
	//OpcUa_SeRoNet:
	//	{OpcUa_SeRoNet}
	//	'OpcUa_SeRoNet' ('description' description=EString)?;
	public OpcUa_SeRoNetElements getOpcUa_SeRoNetAccess() {
		return pOpcUa_SeRoNet;
	}
	
	public ParserRule getOpcUa_SeRoNetRule() {
		return getOpcUa_SeRoNetAccess().getRule();
	}
	
	//CORBA_SmartSoft:
	//	{CORBA_SmartSoft}
	//	'CORBA_SmartSoft' ('description' description=EString)?;
	public CORBA_SmartSoftElements getCORBA_SmartSoftAccess() {
		return pCORBA_SmartSoft;
	}
	
	public ParserRule getCORBA_SmartSoftRule() {
		return getCORBA_SmartSoftAccess().getRule();
	}
	
	//DDS_SmartSoft:
	//	{DDS_SmartSoft}
	//	'DDS_SmartSoft' ('description' description=EString)?;
	public DDS_SmartSoftElements getDDS_SmartSoftAccess() {
		return pDDS_SmartSoft;
	}
	
	public ParserRule getDDS_SmartSoftRule() {
		return getDDS_SmartSoftAccess().getRule();
	}
	
	//AbstractDocumentedElement:
	//	{AbstractDocumentedElement} documentation=DOCU_COMMENT?;
	public DocuTerminalsGrammarAccess.AbstractDocumentedElementElements getAbstractDocumentedElementAccess() {
		return gaDocuTerminals.getAbstractDocumentedElementAccess();
	}
	
	public ParserRule getAbstractDocumentedElementRule() {
		return getAbstractDocumentedElementAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*' !'*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaDocuTerminals.getML_COMMENTRule();
	}
	
	//terminal fragment ML_DOCUMENTATION:
	//	'/**'->'*/';
	public TerminalRule getML_DOCUMENTATIONRule() {
		return gaDocuTerminals.getML_DOCUMENTATIONRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !'/' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDocuTerminals.getSL_COMMENTRule();
	}
	
	//terminal fragment SL_DOCUMENTATION:
	//	'///' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_DOCUMENTATIONRule() {
		return gaDocuTerminals.getSL_DOCUMENTATIONRule();
	}
	
	//terminal DOCU_COMMENT:
	//	ML_DOCUMENTATION | SL_DOCUMENTATION;
	public TerminalRule getDOCU_COMMENTRule() {
		return gaDocuTerminals.getDOCU_COMMENTRule();
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
