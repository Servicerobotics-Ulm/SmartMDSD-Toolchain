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
grammar InternalComponentDatasheet;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.component.componentDatasheet.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.component.componentDatasheet.parser.antlr.internal;

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
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;

}

@parser::members {

 	private ComponentDatasheetGrammarAccess grammarAccess;

    public InternalComponentDatasheetParser(TokenStream input, ComponentDatasheetGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ComponentDatasheet";
   	}

   	@Override
   	protected ComponentDatasheetGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComponentDatasheet
entryRuleComponentDatasheet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentDatasheetRule()); }
	iv_ruleComponentDatasheet=ruleComponentDatasheet
	{ $current=$iv_ruleComponentDatasheet.current; }
	EOF;

// Rule ComponentDatasheet
ruleComponentDatasheet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentDatasheet'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentDatasheetRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0());
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2());
		}
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getComponentDatasheetRule());
			}
			newCompositeNode(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetParserRuleCall_3());
		}
		this_GenericDatasheet_3=ruleGenericDatasheet[$current]
		{
			$current = $this_GenericDatasheet_3.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0);
					}
								({true}?=>(otherlv_5='purposeDescription'
								{
									newLeafNode(otherlv_5, grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_4_0_0());
								}
								(
									otherlv_6=':'
									{
										newLeafNode(otherlv_6, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_0_1());
									}
								)?
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_4_0_2_0());
										}
										lv_purposeDescription_7_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
											}
											set(
												$current,
												"purposeDescription",
												lv_purposeDescription_7_0,
												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1);
					}
								({true}?=>(otherlv_8='hardwareRequirementDescription'
								{
									newLeafNode(otherlv_8, grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_4_1_0());
								}
								(
									otherlv_9=':'
									{
										newLeafNode(otherlv_9, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_1_1());
									}
								)?
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_4_1_2_0());
										}
										lv_hardwareRequirementDescription_10_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
											}
											set(
												$current,
												"hardwareRequirementDescription",
												lv_hardwareRequirementDescription_10_0,
												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
				}
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_5());
		}
	)
;


// Rule GenericDatasheet
ruleGenericDatasheet[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='baseURI'
							{
								newLeafNode(otherlv_1, grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0());
							}
							(
								otherlv_2=':'
								{
									newLeafNode(otherlv_2, grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0());
									}
									lv_baseURI_3_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"baseURI",
											lv_baseURI_3_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
				}
							({true}?=>(otherlv_4='shortDescrition'
							{
								newLeafNode(otherlv_4, grammarAccess.getGenericDatasheetAccess().getShortDescritionKeyword_1_0());
							}
							(
								otherlv_5=':'
								{
									newLeafNode(otherlv_5, grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getShortDescritionEStringParserRuleCall_1_2_0());
									}
									lv_shortDescrition_6_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"shortDescrition",
											lv_shortDescrition_6_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
				}
							({true}?=>(otherlv_7='longDescription'
							{
								newLeafNode(otherlv_7, grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0());
							}
							(
								otherlv_8=':'
								{
									newLeafNode(otherlv_8, grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1());
								}
							)?
							(
								(
									lv_longDescription_9_0=RULE_TEXT_BLOCK
									{
										newLeafNode(lv_longDescription_9_0, grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getGenericDatasheetRule());
										}
										setWithLastConsumed(
											$current,
											"longDescription",
											lv_longDescription_9_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.TEXT_BLOCK");
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
				}
							({true}?=>(otherlv_10='supplierDescription'
							{
								newLeafNode(otherlv_10, grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0());
							}
							(
								otherlv_11=':'
								{
									newLeafNode(otherlv_11, grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0());
									}
									lv_supplierDescription_12_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"supplierDescription",
											lv_supplierDescription_12_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
				}
							({true}?=>(otherlv_13='homepage'
							{
								newLeafNode(otherlv_13, grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0());
							}
							(
								otherlv_14=':'
								{
									newLeafNode(otherlv_14, grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0());
									}
									lv_homepage_15_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"homepage",
											lv_homepage_15_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
				}
							({true}?=>(otherlv_16='trl'
							{
								newLeafNode(otherlv_16, grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0());
							}
							(
								otherlv_17=':'
								{
									newLeafNode(otherlv_17, grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0());
									}
									lv_trl_18_0=ruleTRL
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"trl",
											lv_trl_18_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.TRL");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
				}
							({true}?=>(otherlv_19='license'
							{
								newLeafNode(otherlv_19, grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0());
							}
							(
								otherlv_20=':'
								{
									newLeafNode(otherlv_20, grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1());
								}
							)?
							(
								(
									{
										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0());
									}
									lv_license_21_0=ruleAbstractLicense
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
										}
										set(
											$current,
											"license",
											lv_license_21_0,
											"org.xtext.base.genericDatasheet.GenericDatasheet.AbstractLicense");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleAbstractLicense
entryRuleAbstractLicense returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractLicenseRule()); }
	iv_ruleAbstractLicense=ruleAbstractLicense
	{ $current=$iv_ruleAbstractLicense.current; }
	EOF;

// Rule AbstractLicense
ruleAbstractLicense returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0());
		}
		this_SpdxLicense_0=ruleSpdxLicense
		{
			$current = $this_SpdxLicense_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1());
		}
		this_ProprietaryLicense_1=ruleProprietaryLicense
		{
			$current = $this_ProprietaryLicense_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleSpdxLicense
entryRuleSpdxLicense returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpdxLicenseRule()); }
	iv_ruleSpdxLicense=ruleSpdxLicense
	{ $current=$iv_ruleSpdxLicense.current; }
	EOF;

// Rule SpdxLicense
ruleSpdxLicense returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='spdx'
		{
			newLeafNode(otherlv_0, grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0());
				}
				lv_licenseID_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpdxLicenseRule());
					}
					set(
						$current,
						"licenseID",
						lv_licenseID_2_0,
						"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleProprietaryLicense
entryRuleProprietaryLicense returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProprietaryLicenseRule()); }
	iv_ruleProprietaryLicense=ruleProprietaryLicense
	{ $current=$iv_ruleProprietaryLicense.current; }
	EOF;

// Rule ProprietaryLicense
ruleProprietaryLicense returns [EObject current=null]
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
					grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0(),
					$current);
			}
		)
		otherlv_1='proprietary'
		{
			newLeafNode(otherlv_1, grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='name'
								{
									newLeafNode(otherlv_4, grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0());
								}
								(
									otherlv_5=':'
									{
										newLeafNode(otherlv_5, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
									}
								)?
								(
									(
										{
											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0());
										}
										lv_name_6_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
											}
											set(
												$current,
												"name",
												lv_name_6_0,
												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='fullText'
								{
									newLeafNode(otherlv_7, grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0());
								}
								(
									otherlv_8=':'
									{
										newLeafNode(otherlv_8, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
									}
								)?
								(
									(
										{
											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0());
										}
										lv_fullText_9_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
											}
											set(
												$current,
												"fullText",
												lv_fullText_9_0,
												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_10='URL'
								{
									newLeafNode(otherlv_10, grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0());
								}
								(
									otherlv_11=':'
									{
										newLeafNode(otherlv_11, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
									}
								)?
								(
									(
										{
											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0());
										}
										lv_url_12_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
											}
											set(
												$current,
												"url",
												lv_url_12_0,
												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
				}
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Rule TRL
ruleTRL returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Level1'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Level2'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Level3'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Level4'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Level5'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Level6'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='Level7'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='Level8'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='Level9'
			{
				$current = grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='Undefined'
			{
				$current = grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9());
			}
		)
	)
;

RULE_TEXT_BLOCK : '$%' ( options {greedy=false;} : . )*'%$';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
