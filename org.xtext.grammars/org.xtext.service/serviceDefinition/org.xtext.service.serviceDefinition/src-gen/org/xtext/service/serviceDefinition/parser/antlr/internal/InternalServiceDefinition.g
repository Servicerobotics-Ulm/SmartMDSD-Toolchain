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
grammar InternalServiceDefinition;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.service.serviceDefinition.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.service.serviceDefinition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;

}

@parser::members {

 	private ServiceDefinitionGrammarAccess grammarAccess;

    public InternalServiceDefinitionParser(TokenStream input, ServiceDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ServiceDefModel";
   	}

   	@Override
   	protected ServiceDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleServiceDefModel
entryRuleServiceDefModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceDefModelRule()); }
	iv_ruleServiceDefModel=ruleServiceDefModel
	{ $current=$iv_ruleServiceDefModel.current; }
	EOF;

// Rule ServiceDefModel
ruleServiceDefModel returns [EObject current=null]
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
					grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0());
				}
				lv_imports_1_0=ruleCommRepoImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceDefModelRule());
					}
					add(
						$current,
						"imports",
						lv_imports_1_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.CommRepoImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0());
				}
				lv_repository_2_0=ruleServiceDefRepository
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceDefModelRule());
					}
					set(
						$current,
						"repository",
						lv_repository_2_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceDefRepository");
					afterParserOrEnumRuleCall();
				}
			)
		)?
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

// Entry rule entryRuleFQNW
entryRuleFQNW returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNWRule()); }
	iv_ruleFQNW=ruleFQNW
	{ $current=$iv_ruleFQNW.current.getText(); }
	EOF;

// Rule FQNW
ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
		}
		this_FQN_0=ruleFQN
		{
			$current.merge(this_FQN_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
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

// Entry rule entryRuleServiceDefRepository
entryRuleServiceDefRepository returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceDefRepositoryRule()); }
	iv_ruleServiceDefRepository=ruleServiceDefRepository
	{ $current=$iv_ruleServiceDefRepository.current; }
	EOF;

// Rule ServiceDefRepository
ruleServiceDefRepository returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ServiceDefRepository'
		{
			newLeafNode(otherlv_0, grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServiceDefRepositoryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='version'
			{
				newLeafNode(otherlv_2, grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_2_1_0());
					}
					lv_version_3_0=ruleServiceRepoVersion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
						}
						set(
							$current,
							"version",
							lv_version_3_0,
							"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceRepoVersion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_4_0());
				}
				lv_services_5_0=ruleAbstractServiceDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
					}
					add(
						$current,
						"services",
						lv_services_5_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.AbstractServiceDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleServiceRepoVersion
entryRuleServiceRepoVersion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRepoVersionRule()); }
	iv_ruleServiceRepoVersion=ruleServiceRepoVersion
	{ $current=$iv_ruleServiceRepoVersion.current; }
	EOF;

// Rule ServiceRepoVersion
ruleServiceRepoVersion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0());
				}
				lv_major_0_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
					}
					set(
						$current,
						"major",
						lv_major_0_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0());
				}
				lv_minor_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
					}
					set(
						$current,
						"minor",
						lv_minor_2_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='.'
			{
				newLeafNode(otherlv_3, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0());
					}
					lv_patch_4_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
						}
						set(
							$current,
							"patch",
							lv_patch_4_0,
							"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCommRepoImport
entryRuleCommRepoImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommRepoImportRule()); }
	iv_ruleCommRepoImport=ruleCommRepoImport
	{ $current=$iv_ruleCommRepoImport.current; }
	EOF;

// Rule CommRepoImport
ruleCommRepoImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#import'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommRepoImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleFQNW
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommRepoImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.FQNW");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleAbstractServiceDefinition
entryRuleAbstractServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractServiceDefinitionRule()); }
	iv_ruleAbstractServiceDefinition=ruleAbstractServiceDefinition
	{ $current=$iv_ruleAbstractServiceDefinition.current; }
	EOF;

// Rule AbstractServiceDefinition
ruleAbstractServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0());
		}
		this_CommunicationServiceDefinition_0=ruleCommunicationServiceDefinition
		{
			$current = $this_CommunicationServiceDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1());
		}
		this_CoordinationServiceDefinition_1=ruleCoordinationServiceDefinition
		{
			$current = $this_CoordinationServiceDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCommunicationServiceDefinition
entryRuleCommunicationServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommunicationServiceDefinitionRule()); }
	iv_ruleCommunicationServiceDefinition=ruleCommunicationServiceDefinition
	{ $current=$iv_ruleCommunicationServiceDefinition.current; }
	EOF;

// Rule CommunicationServiceDefinition
ruleCommunicationServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0());
		}
		this_ForkingServiceDefinition_0=ruleForkingServiceDefinition
		{
			$current = $this_ForkingServiceDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1());
		}
		this_JoyningServiceDefinition_1=ruleJoyningServiceDefinition
		{
			$current = $this_JoyningServiceDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2());
		}
		this_RequestAnswerServiceDefinition_2=ruleRequestAnswerServiceDefinition
		{
			$current = $this_RequestAnswerServiceDefinition_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleForkingServiceDefinition
entryRuleForkingServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForkingServiceDefinitionRule()); }
	iv_ruleForkingServiceDefinition=ruleForkingServiceDefinition
	{ $current=$iv_ruleForkingServiceDefinition.current; }
	EOF;

// Rule ForkingServiceDefinition
ruleForkingServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ForkingServiceDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForkingServiceDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_3_0());
				}
				lv_pattern_3_0=ruleForkingPatternInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_3_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ForkingPatternInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='purposeDescription'
			{
				newLeafNode(otherlv_4, grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
					}
					lv_purposeDescription_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
						}
						set(
							$current,
							"purposeDescription",
							lv_purposeDescription_5_0,
							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
				}
				lv_properties_6_0=ruleServiceProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
					}
					add(
						$current,
						"properties",
						lv_properties_6_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleJoyningServiceDefinition
entryRuleJoyningServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJoyningServiceDefinitionRule()); }
	iv_ruleJoyningServiceDefinition=ruleJoyningServiceDefinition
	{ $current=$iv_ruleJoyningServiceDefinition.current; }
	EOF;

// Rule JoyningServiceDefinition
ruleJoyningServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='JoiningServiceDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJoyningServiceDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_3_0());
				}
				lv_pattern_3_0=ruleJoiningPatternInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_3_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.JoiningPatternInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='purposeDescription'
			{
				newLeafNode(otherlv_4, grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
					}
					lv_purposeDescription_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
						}
						set(
							$current,
							"purposeDescription",
							lv_purposeDescription_5_0,
							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
				}
				lv_properties_6_0=ruleServiceProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
					}
					add(
						$current,
						"properties",
						lv_properties_6_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleRequestAnswerServiceDefinition
entryRuleRequestAnswerServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionRule()); }
	iv_ruleRequestAnswerServiceDefinition=ruleRequestAnswerServiceDefinition
	{ $current=$iv_ruleRequestAnswerServiceDefinition.current; }
	EOF;

// Rule RequestAnswerServiceDefinition
ruleRequestAnswerServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RequestAnswerServiceDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestAnswerServiceDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_3_0());
				}
				lv_pattern_3_0=ruleRequestAnswerPattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_3_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.RequestAnswerPattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='purposeDescription'
			{
				newLeafNode(otherlv_4, grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
					}
					lv_purposeDescription_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
						}
						set(
							$current,
							"purposeDescription",
							lv_purposeDescription_5_0,
							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
				}
				lv_properties_6_0=ruleServiceProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
					}
					add(
						$current,
						"properties",
						lv_properties_6_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleCoordinationServiceDefinition
entryRuleCoordinationServiceDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationServiceDefinitionRule()); }
	iv_ruleCoordinationServiceDefinition=ruleCoordinationServiceDefinition
	{ $current=$iv_ruleCoordinationServiceDefinition.current; }
	EOF;

// Rule CoordinationServiceDefinition
ruleCoordinationServiceDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationServiceDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationServiceDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='purposeDescription'
								{
									newLeafNode(otherlv_4, grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_3_0_1_0());
										}
										lv_purposeDescription_5_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
											}
											set(
												$current,
												"purposeDescription",
												lv_purposeDescription_5_0,
												"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_1_0());
									}
									lv_statePattern_6_0=ruleStatePattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
										}
										set(
											$current,
											"statePattern",
											lv_statePattern_6_0,
											"org.xtext.service.serviceDefinition.ServiceDefinition.StatePattern");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_2_0());
									}
									lv_parameterPattern_7_0=ruleParameterPattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
										}
										set(
											$current,
											"parameterPattern",
											lv_parameterPattern_7_0,
											"org.xtext.service.serviceDefinition.ServiceDefinition.ParameterPattern");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_3_0());
									}
									lv_monitoringPattern_8_0=ruleMonitoringPattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
										}
										set(
											$current,
											"monitoringPattern",
											lv_monitoringPattern_8_0,
											"org.xtext.service.serviceDefinition.ServiceDefinition.MonitoringPattern");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_4_0());
									}
									lv_wiringPattern_9_0=ruleDynamicWiringPattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
										}
										set(
											$current,
											"wiringPattern",
											lv_wiringPattern_9_0,
											"org.xtext.service.serviceDefinition.ServiceDefinition.DynamicWiringPattern");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_4_0());
				}
				lv_services_10_0=ruleCommunicationServiceUsage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
					}
					add(
						$current,
						"services",
						lv_services_10_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.CommunicationServiceUsage");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
				}
				lv_properties_11_0=ruleServiceProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
					}
					add(
						$current,
						"properties",
						lv_properties_11_0,
						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleCommunicationServiceUsage
entryRuleCommunicationServiceUsage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommunicationServiceUsageRule()); }
	iv_ruleCommunicationServiceUsage=ruleCommunicationServiceUsage
	{ $current=$iv_ruleCommunicationServiceUsage.current; }
	EOF;

// Rule CommunicationServiceUsage
ruleCommunicationServiceUsage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CommunicationServiceUsage'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommunicationServiceUsageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='uses'
		{
			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommunicationServiceUsageRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatePattern
entryRuleStatePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatePatternRule()); }
	iv_ruleStatePattern=ruleStatePattern
	{ $current=$iv_ruleStatePattern.current; }
	EOF;

// Rule StatePattern
ruleStatePattern returns [EObject current=null]
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
					grammarAccess.getStatePatternAccess().getStatePatternAction_0(),
					$current);
			}
		)
		otherlv_1='StatePattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getStatePatternAccess().getStatePatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2());
		}
		otherlv_3='lifecycle'
		{
			newLeafNode(otherlv_3, grammarAccess.getStatePatternAccess().getLifecycleKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStatePatternRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='with'
			{
				newLeafNode(otherlv_5, grammarAccess.getStatePatternAccess().getWithKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStatePatternRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6());
		}
	)
;

// Entry rule entryRuleParameterPattern
entryRuleParameterPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterPatternRule()); }
	iv_ruleParameterPattern=ruleParameterPattern
	{ $current=$iv_ruleParameterPattern.current; }
	EOF;

// Rule ParameterPattern
ruleParameterPattern returns [EObject current=null]
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
					grammarAccess.getParameterPatternAccess().getParameterPatternAction_0(),
					$current);
			}
		)
		otherlv_1='ParameterPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterPatternRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleDynamicWiringPattern
entryRuleDynamicWiringPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDynamicWiringPatternRule()); }
	iv_ruleDynamicWiringPattern=ruleDynamicWiringPattern
	{ $current=$iv_ruleDynamicWiringPattern.current; }
	EOF;

// Rule DynamicWiringPattern
ruleDynamicWiringPattern returns [EObject current=null]
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
					grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0(),
					$current);
			}
		)
		otherlv_1='DynamicWiringPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1());
		}
	)
;

// Entry rule entryRuleMonitoringPattern
entryRuleMonitoringPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonitoringPatternRule()); }
	iv_ruleMonitoringPattern=ruleMonitoringPattern
	{ $current=$iv_ruleMonitoringPattern.current; }
	EOF;

// Rule MonitoringPattern
ruleMonitoringPattern returns [EObject current=null]
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
					grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0(),
					$current);
			}
		)
		otherlv_1='MonitoringPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1());
		}
	)
;

// Entry rule entryRuleForkingPatternInstance
entryRuleForkingPatternInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForkingPatternInstanceRule()); }
	iv_ruleForkingPatternInstance=ruleForkingPatternInstance
	{ $current=$iv_ruleForkingPatternInstance.current; }
	EOF;

// Rule ForkingPatternInstance
ruleForkingPatternInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0());
		}
		this_PushPattern_0=rulePushPattern
		{
			$current = $this_PushPattern_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1());
		}
		this_EventPattern_1=ruleEventPattern
		{
			$current = $this_EventPattern_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleJoiningPatternInstance
entryRuleJoiningPatternInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJoiningPatternInstanceRule()); }
	iv_ruleJoiningPatternInstance=ruleJoiningPatternInstance
	{ $current=$iv_ruleJoiningPatternInstance.current; }
	EOF;

// Rule JoiningPatternInstance
ruleJoiningPatternInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall());
	}
	this_SendPattern_0=ruleSendPattern
	{
		$current = $this_SendPattern_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleRequestAnswerPattern
entryRuleRequestAnswerPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequestAnswerPatternRule()); }
	iv_ruleRequestAnswerPattern=ruleRequestAnswerPattern
	{ $current=$iv_ruleRequestAnswerPattern.current; }
	EOF;

// Rule RequestAnswerPattern
ruleRequestAnswerPattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall());
	}
	this_QueryPattern_0=ruleQueryPattern
	{
		$current = $this_QueryPattern_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePushPattern
entryRulePushPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPushPatternRule()); }
	iv_rulePushPattern=rulePushPattern
	{ $current=$iv_rulePushPattern.current; }
	EOF;

// Rule PushPattern
rulePushPattern returns [EObject current=null]
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
					grammarAccess.getPushPatternAccess().getPushPatternAction_0(),
					$current);
			}
		)
		otherlv_1='PushPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getPushPatternAccess().getPushPatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2());
		}
		otherlv_3='DataType'
		{
			newLeafNode(otherlv_3, grammarAccess.getPushPatternAccess().getDataTypeKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPushPatternRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='>'
		{
			newLeafNode(otherlv_6, grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6());
		}
	)
;

// Entry rule entryRuleEventPattern
entryRuleEventPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventPatternRule()); }
	iv_ruleEventPattern=ruleEventPattern
	{ $current=$iv_ruleEventPattern.current; }
	EOF;

// Rule EventPattern
ruleEventPattern returns [EObject current=null]
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
					grammarAccess.getEventPatternAccess().getEventPatternAction_0(),
					$current);
			}
		)
		otherlv_1='EventPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getEventPatternAccess().getEventPatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='EventType'
								{
									newLeafNode(otherlv_4, grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0());
								}
								otherlv_5='='
								{
									newLeafNode(otherlv_5, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getEventPatternRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='ActivationType'
								{
									newLeafNode(otherlv_7, grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0());
								}
								otherlv_8='='
								{
									newLeafNode(otherlv_8, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getEventPatternRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_10='EventStateType'
								{
									newLeafNode(otherlv_10, grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0());
								}
								otherlv_11='='
								{
									newLeafNode(otherlv_11, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getEventPatternRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
				}
		)
		otherlv_13='>'
		{
			newLeafNode(otherlv_13, grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleQueryPattern
entryRuleQueryPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryPatternRule()); }
	iv_ruleQueryPattern=ruleQueryPattern
	{ $current=$iv_ruleQueryPattern.current; }
	EOF;

// Rule QueryPattern
ruleQueryPattern returns [EObject current=null]
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
					grammarAccess.getQueryPatternAccess().getQueryPatternAction_0(),
					$current);
			}
		)
		otherlv_1='QueryPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='RequestType'
								{
									newLeafNode(otherlv_4, grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0());
								}
								otherlv_5='='
								{
									newLeafNode(otherlv_5, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getQueryPatternRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_7='AnswerType'
								{
									newLeafNode(otherlv_7, grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0());
								}
								otherlv_8='='
								{
									newLeafNode(otherlv_8, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getQueryPatternRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0());
										}
										ruleFQN
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
				}
		)
		otherlv_10='>'
		{
			newLeafNode(otherlv_10, grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleSendPattern
entryRuleSendPattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSendPatternRule()); }
	iv_ruleSendPattern=ruleSendPattern
	{ $current=$iv_ruleSendPattern.current; }
	EOF;

// Rule SendPattern
ruleSendPattern returns [EObject current=null]
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
					grammarAccess.getSendPatternAccess().getSendPatternAction_0(),
					$current);
			}
		)
		otherlv_1='SendPattern'
		{
			newLeafNode(otherlv_1, grammarAccess.getSendPatternAccess().getSendPatternKeyword_1());
		}
		otherlv_2='<'
		{
			newLeafNode(otherlv_2, grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2());
		}
		otherlv_3='DataType'
		{
			newLeafNode(otherlv_3, grammarAccess.getSendPatternAccess().getDataTypeKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSendPatternRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='>'
		{
			newLeafNode(otherlv_6, grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6());
		}
	)
;

// Entry rule entryRuleServiceProperty
entryRuleServiceProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServicePropertyRule()); }
	iv_ruleServiceProperty=ruleServiceProperty
	{ $current=$iv_ruleServiceProperty.current; }
	EOF;

// Rule ServiceProperty
ruleServiceProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ServiceProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServicePropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
