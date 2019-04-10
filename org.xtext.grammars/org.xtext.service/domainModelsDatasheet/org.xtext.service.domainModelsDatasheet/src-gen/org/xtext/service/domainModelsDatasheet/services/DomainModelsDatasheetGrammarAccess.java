//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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
		private final RuleCall cGenericDatasheetParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DomainModelsDatasheet:
		//	'DomainModelsDatasheet' name=ID
		//	'{'
		//	GenericDatasheet
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DomainModelsDatasheet' name=ID '{' GenericDatasheet '}'
		public Group getGroup() { return cGroup; }
		
		//'DomainModelsDatasheet'
		public Keyword getDomainModelsDatasheetKeyword_0() { return cDomainModelsDatasheetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//GenericDatasheet
		public RuleCall getGenericDatasheetParserRuleCall_3() { return cGenericDatasheetParserRuleCall_3; }
		
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
	//	GenericDatasheet
	//	'}';
	public DomainModelsDatasheetElements getDomainModelsDatasheetAccess() {
		return pDomainModelsDatasheet;
	}
	
	public ParserRule getDomainModelsDatasheetRule() {
		return getDomainModelsDatasheetAccess().getRule();
	}
	
	//fragment GenericDatasheet:
	//	'baseURI' ':'? baseURI=EString & 'shortDescription' ':'? shortDescription=EString & ('longDescription' ':'?
	//	longDescription=TEXT_BLOCK)? & ('supplierDescription' ':'? supplierDescription=EString)? & ('homepage' ':'?
	//	homepage=EString)? & ('trl' ':'? trl=TRL)? & ('license' ':'? license=AbstractLicense)?;
	public GenericDatasheetGrammarAccess.GenericDatasheetElements getGenericDatasheetAccess() {
		return gaGenericDatasheet.getGenericDatasheetAccess();
	}
	
	public ParserRule getGenericDatasheetRule() {
		return getGenericDatasheetAccess().getRule();
	}
	
	//terminal TEXT_BLOCK:
	//	'$%'->'%$';
	public TerminalRule getTEXT_BLOCKRule() {
		return gaGenericDatasheet.getTEXT_BLOCKRule();
	}
	
	//AbstractLicense:
	//	SpdxLicense | ProprietaryLicense;
	public GenericDatasheetGrammarAccess.AbstractLicenseElements getAbstractLicenseAccess() {
		return gaGenericDatasheet.getAbstractLicenseAccess();
	}
	
	public ParserRule getAbstractLicenseRule() {
		return getAbstractLicenseAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public GenericDatasheetGrammarAccess.EStringElements getEStringAccess() {
		return gaGenericDatasheet.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//enum TRL:
	//	LEVEL1='Level1' | LEVEL2='Level2' | LEVEL3='Level3' | LEVEL4='Level4' | LEVEL5='Level5' | LEVEL6='Level6' |
	//	LEVEL7='Level7' | LEVEL8='Level8' | LEVEL9='Level9' | UNDEFINED='Undefined';
	public GenericDatasheetGrammarAccess.TRLElements getTRLAccess() {
		return gaGenericDatasheet.getTRLAccess();
	}
	
	public EnumRule getTRLRule() {
		return getTRLAccess().getRule();
	}
	
	//SpdxLicense:
	//	'spdx' '(' licenseID=EString ')';
	public GenericDatasheetGrammarAccess.SpdxLicenseElements getSpdxLicenseAccess() {
		return gaGenericDatasheet.getSpdxLicenseAccess();
	}
	
	public ParserRule getSpdxLicenseRule() {
		return getSpdxLicenseAccess().getRule();
	}
	
	//ProprietaryLicense:
	//	{ProprietaryLicense}
	//	'proprietary'
	//	'{' ('name' ':'? name=EString & ('fullText' ':'? fullText=EString)? & ('URL' ':'? url=EString)?)
	//	'}';
	public GenericDatasheetGrammarAccess.ProprietaryLicenseElements getProprietaryLicenseAccess() {
		return gaGenericDatasheet.getProprietaryLicenseAccess();
	}
	
	public ParserRule getProprietaryLicenseRule() {
		return getProprietaryLicenseAccess().getRule();
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
