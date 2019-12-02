//===================================================================================
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
//===================================================================================
package org.xtext.base.docuterminals.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DocuTerminalsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AbstractDocumentedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.AbstractDocumentedElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAbstractDocumentedElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDocumentationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_1_0 = (RuleCall)cDocumentationAssignment_1.eContents().get(0);
		
		//AbstractDocumentedElement:
		//	{AbstractDocumentedElement} documentation=DOCU_COMMENT?;
		@Override public ParserRule getRule() { return rule; }
		
		//{AbstractDocumentedElement} documentation=DOCU_COMMENT?
		public Group getGroup() { return cGroup; }
		
		//{AbstractDocumentedElement}
		public Action getAbstractDocumentedElementAction_0() { return cAbstractDocumentedElementAction_0; }
		
		//// add this line as first element in your ParserRule(s) to implement the AbstractDocumentedElement base class
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_1() { return cDocumentationAssignment_1; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_1_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_1_0; }
	}
	
	
	private final AbstractDocumentedElementElements pAbstractDocumentedElement;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tML_DOCUMENTATION;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tSL_DOCUMENTATION;
	private final TerminalRule tDOCU_COMMENT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DocuTerminalsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAbstractDocumentedElement = new AbstractDocumentedElementElements();
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.ML_COMMENT");
		this.tML_DOCUMENTATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.ML_DOCUMENTATION");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.SL_COMMENT");
		this.tSL_DOCUMENTATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.SL_DOCUMENTATION");
		this.tDOCU_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.base.docuterminals.DocuTerminals".equals(grammar.getName())) {
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

	
	//AbstractDocumentedElement:
	//	{AbstractDocumentedElement} documentation=DOCU_COMMENT?;
	public AbstractDocumentedElementElements getAbstractDocumentedElementAccess() {
		return pAbstractDocumentedElement;
	}
	
	public ParserRule getAbstractDocumentedElementRule() {
		return getAbstractDocumentedElementAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*' !'*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal fragment ML_DOCUMENTATION:
	//	'/**'->'*/';
	public TerminalRule getML_DOCUMENTATIONRule() {
		return tML_DOCUMENTATION;
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !'/' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal fragment SL_DOCUMENTATION:
	//	'///' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_DOCUMENTATIONRule() {
		return tSL_DOCUMENTATION;
	}
	
	//terminal DOCU_COMMENT:
	//	ML_DOCUMENTATION | SL_DOCUMENTATION;
	public TerminalRule getDOCU_COMMENTRule() {
		return tDOCU_COMMENT;
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
