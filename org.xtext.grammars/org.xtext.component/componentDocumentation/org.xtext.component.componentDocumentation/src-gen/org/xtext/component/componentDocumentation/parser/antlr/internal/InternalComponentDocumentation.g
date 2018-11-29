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
grammar InternalComponentDocumentation;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.component.componentDocumentation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.component.componentDocumentation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;

}

@parser::members {

 	private ComponentDocumentationGrammarAccess grammarAccess;

    public InternalComponentDocumentationParser(TokenStream input, ComponentDocumentationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ComponentDocumentation";
   	}

   	@Override
   	protected ComponentDocumentationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComponentDocumentation
entryRuleComponentDocumentation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentDocumentationRule()); }
	iv_ruleComponentDocumentation=ruleComponentDocumentation
	{ $current=$iv_ruleComponentDocumentation.current; }
	EOF;

// Rule ComponentDocumentation
ruleComponentDocumentation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentDocumentation'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentDocumentationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='Description'
								{
									newLeafNode(otherlv_4, grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0());
								}
								otherlv_5=':'
								{
									newLeafNode(otherlv_5, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0());
										}
										lv_description_6_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
											}
											set(
												$current,
												"description",
												lv_description_6_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='Purpose'
								{
									newLeafNode(otherlv_7, grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0());
								}
								otherlv_8=':'
								{
									newLeafNode(otherlv_8, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0());
										}
										lv_purpose_9_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
											}
											set(
												$current,
												"purpose",
												lv_purpose_9_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_10='License'
								{
									newLeafNode(otherlv_10, grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0());
								}
								otherlv_11=':'
								{
									newLeafNode(otherlv_11, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0());
										}
										lv_license_12_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
											}
											set(
												$current,
												"license",
												lv_license_12_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>(otherlv_13='HardwareRequirements'
								{
									newLeafNode(otherlv_13, grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0());
								}
								otherlv_14=':'
								{
									newLeafNode(otherlv_14, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0());
										}
										lv_hardware_15_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
											}
											set(
												$current,
												"hardware",
												lv_hardware_15_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0());
				}
				lv_elements_16_0=ruleAbstractComponentDocuElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
					}
					add(
						$current,
						"elements",
						lv_elements_16_0,
						"org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractComponentDocuElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
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

// Entry rule entryRuleAbstractComponentDocuElement
entryRuleAbstractComponentDocuElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractComponentDocuElementRule()); }
	iv_ruleAbstractComponentDocuElement=ruleAbstractComponentDocuElement
	{ $current=$iv_ruleAbstractComponentDocuElement.current; }
	EOF;

// Rule AbstractComponentDocuElement
ruleAbstractComponentDocuElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0());
		}
		this_CoordinationSlavePortDocu_0=ruleCoordinationSlavePortDocu
		{
			$current = $this_CoordinationSlavePortDocu_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1());
		}
		this_ComponentServiceDocu_1=ruleComponentServiceDocu
		{
			$current = $this_ComponentServiceDocu_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2());
		}
		this_AbstractModeDocu_2=ruleAbstractModeDocu
		{
			$current = $this_AbstractModeDocu_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCoordinationSlavePortDocu
entryRuleCoordinationSlavePortDocu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationSlavePortDocuRule()); }
	iv_ruleCoordinationSlavePortDocu=ruleCoordinationSlavePortDocu
	{ $current=$iv_ruleCoordinationSlavePortDocu.current; }
	EOF;

// Rule CoordinationSlavePortDocu
ruleCoordinationSlavePortDocu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationSlavePort'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationSlavePortDocuRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='SlavePortDescription'
								{
									newLeafNode(otherlv_4, grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0());
								}
								otherlv_5=':'
								{
									newLeafNode(otherlv_5, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0());
										}
										lv_description_6_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
											}
											set(
												$current,
												"description",
												lv_description_6_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='DynamicWiringPort'
								{
									newLeafNode(otherlv_7, grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0());
								}
								otherlv_8=':'
								{
									newLeafNode(otherlv_8, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0());
										}
										lv_dynamicWiring_9_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
											}
											set(
												$current,
												"dynamicWiring",
												lv_dynamicWiring_9_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_10='StatePort'
								{
									newLeafNode(otherlv_10, grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0());
								}
								otherlv_11=':'
								{
									newLeafNode(otherlv_11, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0());
										}
										lv_state_12_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
											}
											set(
												$current,
												"state",
												lv_state_12_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>(otherlv_13='ParameterPort'
								{
									newLeafNode(otherlv_13, grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0());
								}
								otherlv_14=':'
								{
									newLeafNode(otherlv_14, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0());
										}
										lv_parameter_15_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
											}
											set(
												$current,
												"parameter",
												lv_parameter_15_0,
												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
				}
		)
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleComponentServiceDocu
entryRuleComponentServiceDocu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentServiceDocuRule()); }
	iv_ruleComponentServiceDocu=ruleComponentServiceDocu
	{ $current=$iv_ruleComponentServiceDocu.current; }
	EOF;

// Rule ComponentServiceDocu
ruleComponentServiceDocu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentServiceDocuRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Description'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0());
			}
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0());
					}
					lv_description_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentServiceDocuRule());
						}
						set(
							$current,
							"description",
							lv_description_5_0,
							"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0());
				}
				lv_states_6_0=ruleAbstractModeDocu
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentServiceDocuRule());
					}
					add(
						$current,
						"states",
						lv_states_6_0,
						"org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractModeDocu");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAbstractModeDocu
entryRuleAbstractModeDocu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractModeDocuRule()); }
	iv_ruleAbstractModeDocu=ruleAbstractModeDocu
	{ $current=$iv_ruleAbstractModeDocu.current; }
	EOF;

// Rule AbstractModeDocu
ruleAbstractModeDocu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0());
		}
		this_ComponentModeDocu_0=ruleComponentModeDocu
		{
			$current = $this_ComponentModeDocu_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1());
		}
		this_NeutralModeDocu_1=ruleNeutralModeDocu
		{
			$current = $this_NeutralModeDocu_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponentModeDocu
entryRuleComponentModeDocu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModeDocuRule()); }
	iv_ruleComponentModeDocu=ruleComponentModeDocu
	{ $current=$iv_ruleComponentModeDocu.current; }
	EOF;

// Rule ComponentModeDocu
ruleComponentModeDocu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentMode'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentModeDocuRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentModeDocuAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0());
				}
				lv_description_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentModeDocuRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNeutralModeDocu
entryRuleNeutralModeDocu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNeutralModeDocuRule()); }
	iv_ruleNeutralModeDocu=ruleNeutralModeDocu
	{ $current=$iv_ruleNeutralModeDocu.current; }
	EOF;

// Rule NeutralModeDocu
ruleNeutralModeDocu returns [EObject current=null]
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
					grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0(),
					$current);
			}
		)
		otherlv_1='NeutralMode'
		{
			newLeafNode(otherlv_1, grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0());
				}
				lv_description_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNeutralModeDocuRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
