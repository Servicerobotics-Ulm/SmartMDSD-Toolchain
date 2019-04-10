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
package org.xtext.base.genericDatasheet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
	
	public class GenericDatasheetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.GenericDatasheet");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cUnorderedGroup.eContents().get(0);
		private final Keyword cBaseURIKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cBaseURIAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cBaseURIEStringParserRuleCall_0_2_0 = (RuleCall)cBaseURIAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cUnorderedGroup.eContents().get(1);
		private final Keyword cShortDescriptionKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cShortDescriptionAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cShortDescriptionEStringParserRuleCall_1_2_0 = (RuleCall)cShortDescriptionAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cUnorderedGroup.eContents().get(2);
		private final Keyword cLongDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cLongDescriptionAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0 = (RuleCall)cLongDescriptionAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cUnorderedGroup.eContents().get(3);
		private final Keyword cSupplierDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cSupplierDescriptionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cSupplierDescriptionEStringParserRuleCall_3_2_0 = (RuleCall)cSupplierDescriptionAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cUnorderedGroup.eContents().get(4);
		private final Keyword cHomepageKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cHomepageAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cHomepageEStringParserRuleCall_4_2_0 = (RuleCall)cHomepageAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cUnorderedGroup.eContents().get(5);
		private final Keyword cTrlKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cColonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cTrlAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cTrlTRLEnumRuleCall_5_2_0 = (RuleCall)cTrlAssignment_5_2.eContents().get(0);
		private final Group cGroup_6 = (Group)cUnorderedGroup.eContents().get(6);
		private final Keyword cLicenseKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cLicenseAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cLicenseAbstractLicenseParserRuleCall_6_2_0 = (RuleCall)cLicenseAssignment_6_2.eContents().get(0);
		
		//fragment GenericDatasheet:
		//	'baseURI' ':'? baseURI=EString & 'shortDescription' ':'? shortDescription=EString & ('longDescription' ':'?
		//	longDescription=TEXT_BLOCK)? & ('supplierDescription' ':'? supplierDescription=EString)? & ('homepage' ':'?
		//	homepage=EString)? & ('trl' ':'? trl=TRL)? & ('license' ':'? license=AbstractLicense)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'baseURI' ':'? baseURI=EString & 'shortDescription' ':'? shortDescription=EString & ('longDescription' ':'?
		//longDescription=TEXT_BLOCK)? & ('supplierDescription' ':'? supplierDescription=EString)? & ('homepage' ':'?
		//homepage=EString)? & ('trl' ':'? trl=TRL)? & ('license' ':'? license=AbstractLicense)?
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//'baseURI' ':'? baseURI=EString
		public Group getGroup_0() { return cGroup_0; }
		
		//'baseURI'
		public Keyword getBaseURIKeyword_0_0() { return cBaseURIKeyword_0_0; }
		
		//':'?
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//baseURI=EString
		public Assignment getBaseURIAssignment_0_2() { return cBaseURIAssignment_0_2; }
		
		//EString
		public RuleCall getBaseURIEStringParserRuleCall_0_2_0() { return cBaseURIEStringParserRuleCall_0_2_0; }
		
		//'shortDescription' ':'? shortDescription=EString
		public Group getGroup_1() { return cGroup_1; }
		
		//'shortDescription'
		public Keyword getShortDescriptionKeyword_1_0() { return cShortDescriptionKeyword_1_0; }
		
		//':'?
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//shortDescription=EString
		public Assignment getShortDescriptionAssignment_1_2() { return cShortDescriptionAssignment_1_2; }
		
		//EString
		public RuleCall getShortDescriptionEStringParserRuleCall_1_2_0() { return cShortDescriptionEStringParserRuleCall_1_2_0; }
		
		//('longDescription' ':'? longDescription=TEXT_BLOCK)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'longDescription'
		public Keyword getLongDescriptionKeyword_2_0() { return cLongDescriptionKeyword_2_0; }
		
		//':'?
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//longDescription=TEXT_BLOCK
		public Assignment getLongDescriptionAssignment_2_2() { return cLongDescriptionAssignment_2_2; }
		
		//TEXT_BLOCK
		public RuleCall getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0() { return cLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0; }
		
		//('supplierDescription' ':'? supplierDescription=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'supplierDescription'
		public Keyword getSupplierDescriptionKeyword_3_0() { return cSupplierDescriptionKeyword_3_0; }
		
		//':'?
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//supplierDescription=EString
		public Assignment getSupplierDescriptionAssignment_3_2() { return cSupplierDescriptionAssignment_3_2; }
		
		//EString
		public RuleCall getSupplierDescriptionEStringParserRuleCall_3_2_0() { return cSupplierDescriptionEStringParserRuleCall_3_2_0; }
		
		//('homepage' ':'? homepage=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'homepage'
		public Keyword getHomepageKeyword_4_0() { return cHomepageKeyword_4_0; }
		
		//':'?
		public Keyword getColonKeyword_4_1() { return cColonKeyword_4_1; }
		
		//homepage=EString
		public Assignment getHomepageAssignment_4_2() { return cHomepageAssignment_4_2; }
		
		//EString
		public RuleCall getHomepageEStringParserRuleCall_4_2_0() { return cHomepageEStringParserRuleCall_4_2_0; }
		
		//('trl' ':'? trl=TRL)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'trl'
		public Keyword getTrlKeyword_5_0() { return cTrlKeyword_5_0; }
		
		//':'?
		public Keyword getColonKeyword_5_1() { return cColonKeyword_5_1; }
		
		//trl=TRL
		public Assignment getTrlAssignment_5_2() { return cTrlAssignment_5_2; }
		
		//TRL
		public RuleCall getTrlTRLEnumRuleCall_5_2_0() { return cTrlTRLEnumRuleCall_5_2_0; }
		
		//('license' ':'? license=AbstractLicense)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'license'
		public Keyword getLicenseKeyword_6_0() { return cLicenseKeyword_6_0; }
		
		//':'?
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }
		
		//license=AbstractLicense
		public Assignment getLicenseAssignment_6_2() { return cLicenseAssignment_6_2; }
		
		//AbstractLicense
		public RuleCall getLicenseAbstractLicenseParserRuleCall_6_2_0() { return cLicenseAbstractLicenseParserRuleCall_6_2_0; }
	}
	public class AbstractLicenseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.AbstractLicense");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSpdxLicenseParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProprietaryLicenseParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractLicense:
		//	SpdxLicense | ProprietaryLicense;
		@Override public ParserRule getRule() { return rule; }
		
		//SpdxLicense | ProprietaryLicense
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SpdxLicense
		public RuleCall getSpdxLicenseParserRuleCall_0() { return cSpdxLicenseParserRuleCall_0; }
		
		//ProprietaryLicense
		public RuleCall getProprietaryLicenseParserRuleCall_1() { return cProprietaryLicenseParserRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class SpdxLicenseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.SpdxLicense");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpdxKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLicenseIDAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLicenseIDEStringParserRuleCall_2_0 = (RuleCall)cLicenseIDAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SpdxLicense:
		//	'spdx' '(' licenseID=EString ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'spdx' '(' licenseID=EString ')'
		public Group getGroup() { return cGroup; }
		
		//'spdx'
		public Keyword getSpdxKeyword_0() { return cSpdxKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//licenseID=EString
		public Assignment getLicenseIDAssignment_2() { return cLicenseIDAssignment_2; }
		
		//EString
		public RuleCall getLicenseIDEStringParserRuleCall_2_0() { return cLicenseIDEStringParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ProprietaryLicenseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.ProprietaryLicense");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProprietaryLicenseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProprietaryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cNameKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cNameAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_3_0_2_0 = (RuleCall)cNameAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cFullTextKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cFullTextAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cFullTextEStringParserRuleCall_3_1_2_0 = (RuleCall)cFullTextAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cURLKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cUrlAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cUrlEStringParserRuleCall_3_2_2_0 = (RuleCall)cUrlAssignment_3_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ProprietaryLicense:
		//	{ProprietaryLicense}
		//	'proprietary'
		//	'{' ('name' ':'? name=EString & ('fullText' ':'? fullText=EString)? & ('URL' ':'? url=EString)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ProprietaryLicense} 'proprietary' '{' ('name' ':'? name=EString & ('fullText' ':'? fullText=EString)? & ('URL' ':'?
		//url=EString)?) '}'
		public Group getGroup() { return cGroup; }
		
		//{ProprietaryLicense}
		public Action getProprietaryLicenseAction_0() { return cProprietaryLicenseAction_0; }
		
		//'proprietary'
		public Keyword getProprietaryKeyword_1() { return cProprietaryKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'name' ':'? name=EString & ('fullText' ':'? fullText=EString)? & ('URL' ':'? url=EString)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'name' ':'? name=EString
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'name'
		public Keyword getNameKeyword_3_0_0() { return cNameKeyword_3_0_0; }
		
		//':'?
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//name=EString
		public Assignment getNameAssignment_3_0_2() { return cNameAssignment_3_0_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0_2_0() { return cNameEStringParserRuleCall_3_0_2_0; }
		
		//('fullText' ':'? fullText=EString)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'fullText'
		public Keyword getFullTextKeyword_3_1_0() { return cFullTextKeyword_3_1_0; }
		
		//':'?
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//fullText=EString
		public Assignment getFullTextAssignment_3_1_2() { return cFullTextAssignment_3_1_2; }
		
		//EString
		public RuleCall getFullTextEStringParserRuleCall_3_1_2_0() { return cFullTextEStringParserRuleCall_3_1_2_0; }
		
		//('URL' ':'? url=EString)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'URL'
		public Keyword getURLKeyword_3_2_0() { return cURLKeyword_3_2_0; }
		
		//':'?
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//url=EString
		public Assignment getUrlAssignment_3_2_2() { return cUrlAssignment_3_2_2; }
		
		//EString
		public RuleCall getUrlEStringParserRuleCall_3_2_2_0() { return cUrlEStringParserRuleCall_3_2_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	public class TRLElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.TRL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLEVEL1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLEVEL1Level1Keyword_0_0 = (Keyword)cLEVEL1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLEVEL2Level2Keyword_1_0 = (Keyword)cLEVEL2EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL3EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLEVEL3Level3Keyword_2_0 = (Keyword)cLEVEL3EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL4EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLEVEL4Level4Keyword_3_0 = (Keyword)cLEVEL4EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL5EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cLEVEL5Level5Keyword_4_0 = (Keyword)cLEVEL5EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL6EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cLEVEL6Level6Keyword_5_0 = (Keyword)cLEVEL6EnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL7EnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cLEVEL7Level7Keyword_6_0 = (Keyword)cLEVEL7EnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL8EnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cLEVEL8Level8Keyword_7_0 = (Keyword)cLEVEL8EnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cLEVEL9EnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cLEVEL9Level9Keyword_8_0 = (Keyword)cLEVEL9EnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cUNDEFINEDEnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cUNDEFINEDUndefinedKeyword_9_0 = (Keyword)cUNDEFINEDEnumLiteralDeclaration_9.eContents().get(0);
		
		//enum TRL:
		//	LEVEL1='Level1' | LEVEL2='Level2' | LEVEL3='Level3' | LEVEL4='Level4' | LEVEL5='Level5' | LEVEL6='Level6' |
		//	LEVEL7='Level7' | LEVEL8='Level8' | LEVEL9='Level9' | UNDEFINED='Undefined';
		public EnumRule getRule() { return rule; }
		
		//LEVEL1='Level1' | LEVEL2='Level2' | LEVEL3='Level3' | LEVEL4='Level4' | LEVEL5='Level5' | LEVEL6='Level6' |
		//LEVEL7='Level7' | LEVEL8='Level8' | LEVEL9='Level9' | UNDEFINED='Undefined'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LEVEL1='Level1'
		public EnumLiteralDeclaration getLEVEL1EnumLiteralDeclaration_0() { return cLEVEL1EnumLiteralDeclaration_0; }
		
		//'Level1'
		public Keyword getLEVEL1Level1Keyword_0_0() { return cLEVEL1Level1Keyword_0_0; }
		
		//LEVEL2='Level2'
		public EnumLiteralDeclaration getLEVEL2EnumLiteralDeclaration_1() { return cLEVEL2EnumLiteralDeclaration_1; }
		
		//'Level2'
		public Keyword getLEVEL2Level2Keyword_1_0() { return cLEVEL2Level2Keyword_1_0; }
		
		//LEVEL3='Level3'
		public EnumLiteralDeclaration getLEVEL3EnumLiteralDeclaration_2() { return cLEVEL3EnumLiteralDeclaration_2; }
		
		//'Level3'
		public Keyword getLEVEL3Level3Keyword_2_0() { return cLEVEL3Level3Keyword_2_0; }
		
		//LEVEL4='Level4'
		public EnumLiteralDeclaration getLEVEL4EnumLiteralDeclaration_3() { return cLEVEL4EnumLiteralDeclaration_3; }
		
		//'Level4'
		public Keyword getLEVEL4Level4Keyword_3_0() { return cLEVEL4Level4Keyword_3_0; }
		
		//LEVEL5='Level5'
		public EnumLiteralDeclaration getLEVEL5EnumLiteralDeclaration_4() { return cLEVEL5EnumLiteralDeclaration_4; }
		
		//'Level5'
		public Keyword getLEVEL5Level5Keyword_4_0() { return cLEVEL5Level5Keyword_4_0; }
		
		//LEVEL6='Level6'
		public EnumLiteralDeclaration getLEVEL6EnumLiteralDeclaration_5() { return cLEVEL6EnumLiteralDeclaration_5; }
		
		//'Level6'
		public Keyword getLEVEL6Level6Keyword_5_0() { return cLEVEL6Level6Keyword_5_0; }
		
		//LEVEL7='Level7'
		public EnumLiteralDeclaration getLEVEL7EnumLiteralDeclaration_6() { return cLEVEL7EnumLiteralDeclaration_6; }
		
		//'Level7'
		public Keyword getLEVEL7Level7Keyword_6_0() { return cLEVEL7Level7Keyword_6_0; }
		
		//LEVEL8='Level8'
		public EnumLiteralDeclaration getLEVEL8EnumLiteralDeclaration_7() { return cLEVEL8EnumLiteralDeclaration_7; }
		
		//'Level8'
		public Keyword getLEVEL8Level8Keyword_7_0() { return cLEVEL8Level8Keyword_7_0; }
		
		//LEVEL9='Level9'
		public EnumLiteralDeclaration getLEVEL9EnumLiteralDeclaration_8() { return cLEVEL9EnumLiteralDeclaration_8; }
		
		//'Level9'
		public Keyword getLEVEL9Level9Keyword_8_0() { return cLEVEL9Level9Keyword_8_0; }
		
		//UNDEFINED='Undefined'
		public EnumLiteralDeclaration getUNDEFINEDEnumLiteralDeclaration_9() { return cUNDEFINEDEnumLiteralDeclaration_9; }
		
		//'Undefined'
		public Keyword getUNDEFINEDUndefinedKeyword_9_0() { return cUNDEFINEDUndefinedKeyword_9_0; }
	}
	
	private final GenericDatasheetElements pGenericDatasheet;
	private final TerminalRule tTEXT_BLOCK;
	private final AbstractLicenseElements pAbstractLicense;
	private final EStringElements pEString;
	private final TRLElements eTRL;
	private final SpdxLicenseElements pSpdxLicense;
	private final ProprietaryLicenseElements pProprietaryLicense;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GenericDatasheetGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGenericDatasheet = new GenericDatasheetElements();
		this.tTEXT_BLOCK = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.base.genericDatasheet.GenericDatasheet.TEXT_BLOCK");
		this.pAbstractLicense = new AbstractLicenseElements();
		this.pEString = new EStringElements();
		this.eTRL = new TRLElements();
		this.pSpdxLicense = new SpdxLicenseElements();
		this.pProprietaryLicense = new ProprietaryLicenseElements();
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

	
	//fragment GenericDatasheet:
	//	'baseURI' ':'? baseURI=EString & 'shortDescription' ':'? shortDescription=EString & ('longDescription' ':'?
	//	longDescription=TEXT_BLOCK)? & ('supplierDescription' ':'? supplierDescription=EString)? & ('homepage' ':'?
	//	homepage=EString)? & ('trl' ':'? trl=TRL)? & ('license' ':'? license=AbstractLicense)?;
	public GenericDatasheetElements getGenericDatasheetAccess() {
		return pGenericDatasheet;
	}
	
	public ParserRule getGenericDatasheetRule() {
		return getGenericDatasheetAccess().getRule();
	}
	
	//terminal TEXT_BLOCK:
	//	'$%'->'%$';
	public TerminalRule getTEXT_BLOCKRule() {
		return tTEXT_BLOCK;
	}
	
	//AbstractLicense:
	//	SpdxLicense | ProprietaryLicense;
	public AbstractLicenseElements getAbstractLicenseAccess() {
		return pAbstractLicense;
	}
	
	public ParserRule getAbstractLicenseRule() {
		return getAbstractLicenseAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//enum TRL:
	//	LEVEL1='Level1' | LEVEL2='Level2' | LEVEL3='Level3' | LEVEL4='Level4' | LEVEL5='Level5' | LEVEL6='Level6' |
	//	LEVEL7='Level7' | LEVEL8='Level8' | LEVEL9='Level9' | UNDEFINED='Undefined';
	public TRLElements getTRLAccess() {
		return eTRL;
	}
	
	public EnumRule getTRLRule() {
		return getTRLAccess().getRule();
	}
	
	//SpdxLicense:
	//	'spdx' '(' licenseID=EString ')';
	public SpdxLicenseElements getSpdxLicenseAccess() {
		return pSpdxLicense;
	}
	
	public ParserRule getSpdxLicenseRule() {
		return getSpdxLicenseAccess().getRule();
	}
	
	//ProprietaryLicense:
	//	{ProprietaryLicense}
	//	'proprietary'
	//	'{' ('name' ':'? name=EString & ('fullText' ':'? fullText=EString)? & ('URL' ':'? url=EString)?)
	//	'}';
	public ProprietaryLicenseElements getProprietaryLicenseAccess() {
		return pProprietaryLicense;
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
