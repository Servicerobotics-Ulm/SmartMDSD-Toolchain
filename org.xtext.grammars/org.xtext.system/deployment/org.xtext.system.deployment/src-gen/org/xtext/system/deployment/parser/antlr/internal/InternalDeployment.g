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
grammar InternalDeployment;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.deployment.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.deployment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.deployment.services.DeploymentGrammarAccess;

}

@parser::members {

 	private DeploymentGrammarAccess grammarAccess;

    public InternalDeploymentParser(TokenStream input, DeploymentGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DeploymentModel";
   	}

   	@Override
   	protected DeploymentGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDeploymentModel
entryRuleDeploymentModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeploymentModelRule()); }
	iv_ruleDeploymentModel=ruleDeploymentModel
	{ $current=$iv_ruleDeploymentModel.current; }
	EOF;

// Rule DeploymentModel
ruleDeploymentModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DeploymentModel'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeploymentModelAccess().getDeploymentModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDeploymentModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeploymentModelRule());
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
			otherlv_2='using'
			{
				newLeafNode(otherlv_2, grammarAccess.getDeploymentModelAccess().getUsingKeyword_2_0());
			}
			otherlv_3='ComponentArchitecture'
			{
				newLeafNode(otherlv_3, grammarAccess.getDeploymentModelAccess().getComponentArchitectureKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDeploymentModelRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureCrossReference_2_2_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getDeploymentModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeploymentModelAccess().getElementsAbstractDeploymentElementParserRuleCall_4_0());
				}
				lv_elements_6_0=ruleAbstractDeploymentElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeploymentModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_6_0,
						"org.xtext.system.deployment.Deployment.AbstractDeploymentElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDeploymentModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAbstractDeploymentElement
entryRuleAbstractDeploymentElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractDeploymentElementRule()); }
	iv_ruleAbstractDeploymentElement=ruleAbstractDeploymentElement
	{ $current=$iv_ruleAbstractDeploymentElement.current; }
	EOF;

// Rule AbstractDeploymentElement
ruleAbstractDeploymentElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getNamingServiceParserRuleCall_0());
		}
		this_NamingService_0=ruleNamingService
		{
			$current = $this_NamingService_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getTargetPlatformReferenceParserRuleCall_1());
		}
		this_TargetPlatformReference_1=ruleTargetPlatformReference
		{
			$current = $this_TargetPlatformReference_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getComponentArtefactParserRuleCall_2());
		}
		this_ComponentArtefact_2=ruleComponentArtefact
		{
			$current = $this_ComponentArtefact_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getTargetModelIncludeParserRuleCall_3());
		}
		this_TargetModelInclude_3=ruleTargetModelInclude
		{
			$current = $this_TargetModelInclude_3.current;
			afterParserOrEnumRuleCall();
		}
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

// Entry rule entryRuleTargetModelInclude
entryRuleTargetModelInclude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetModelIncludeRule()); }
	iv_ruleTargetModelInclude=ruleTargetModelInclude
	{ $current=$iv_ruleTargetModelInclude.current; }
	EOF;

// Rule TargetModelInclude
ruleTargetModelInclude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#import'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetModelIncludeAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceEStringParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetModelIncludeRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.xtext.system.deployment.Deployment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getTargetModelIncludeAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleTargetPlatformReference
entryRuleTargetPlatformReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetPlatformReferenceRule()); }
	iv_ruleTargetPlatformReference=ruleTargetPlatformReference
	{ $current=$iv_ruleTargetPlatformReference.current; }
	EOF;

// Rule TargetPlatformReference
ruleTargetPlatformReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TargetPlatformReference'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformReferenceAccess().getTargetPlatformReferenceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformReferenceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetPlatformReferenceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='using'
		{
			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformReferenceAccess().getUsingKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetPlatformReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getTargetPlatformReferenceAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryUploadDirectoryParserRuleCall_5_0_0());
									}
									lv_directory_6_0=ruleUploadDirectory
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
										}
										set(
											$current,
											"directory",
											lv_directory_6_0,
											"org.xtext.system.deployment.Deployment.UploadDirectory");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getLoginLoginAccountSelectionParserRuleCall_5_1_0());
									}
									lv_login_7_0=ruleLoginAccountSelection
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
										}
										set(
											$current,
											"login",
											lv_login_7_0,
											"org.xtext.system.deployment.Deployment.LoginAccountSelection");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getHostNetworkInterfaceSelectionParserRuleCall_5_2_0());
									}
									lv_host_8_0=ruleNetworkInterfaceSelection
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
										}
										set(
											$current,
											"host",
											lv_host_8_0,
											"org.xtext.system.deployment.Deployment.NetworkInterfaceSelection");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
				}
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getTargetPlatformReferenceAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleUploadDirectory
entryRuleUploadDirectory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUploadDirectoryRule()); }
	iv_ruleUploadDirectory=ruleUploadDirectory
	{ $current=$iv_ruleUploadDirectory.current; }
	EOF;

// Rule UploadDirectory
ruleUploadDirectory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='UploadDirectory'
		{
			newLeafNode(otherlv_0, grammarAccess.getUploadDirectoryAccess().getUploadDirectoryKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getUploadDirectoryAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUploadDirectoryRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleLoginAccountSelection
entryRuleLoginAccountSelection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoginAccountSelectionRule()); }
	iv_ruleLoginAccountSelection=ruleLoginAccountSelection
	{ $current=$iv_ruleLoginAccountSelection.current; }
	EOF;

// Rule LoginAccountSelection
ruleLoginAccountSelection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LoginAccount'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoginAccountSelectionAccess().getLoginAccountKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoginAccountSelectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNetworkInterfaceSelection
entryRuleNetworkInterfaceSelection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNetworkInterfaceSelectionRule()); }
	iv_ruleNetworkInterfaceSelection=ruleNetworkInterfaceSelection
	{ $current=$iv_ruleNetworkInterfaceSelection.current; }
	EOF;

// Rule NetworkInterfaceSelection
ruleNetworkInterfaceSelection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NetworkInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkInterfaceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNetworkInterfaceSelectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComponentArtefact
entryRuleComponentArtefact returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentArtefactRule()); }
	iv_ruleComponentArtefact=ruleComponentArtefact
	{ $current=$iv_ruleComponentArtefact.current; }
	EOF;

// Rule ComponentArtefact
ruleComponentArtefact returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentArtefact'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentArtefactAccess().getComponentArtefactKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentArtefactRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentArtefactAccess().getDeployDeploymentParserRuleCall_2_0());
				}
				lv_deploy_2_0=ruleDeployment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentArtefactRule());
					}
					set(
						$current,
						"deploy",
						lv_deploy_2_0,
						"org.xtext.system.deployment.Deployment.Deployment");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponentArtefactAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleNamingService
entryRuleNamingService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamingServiceRule()); }
	iv_ruleNamingService=ruleNamingService
	{ $current=$iv_ruleNamingService.current; }
	EOF;

// Rule NamingService
ruleNamingService returns [EObject current=null]
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
					grammarAccess.getNamingServiceAccess().getNamingServiceAction_0(),
					$current);
			}
		)
		otherlv_1='NamingService'
		{
			newLeafNode(otherlv_1, grammarAccess.getNamingServiceAccess().getNamingServiceKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNamingServiceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='portNr'
								{
									newLeafNode(otherlv_4, grammarAccess.getNamingServiceAccess().getPortNrKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getNamingServiceAccess().getPortNrEIntParserRuleCall_3_0_1_0());
										}
										lv_portNr_5_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getNamingServiceRule());
											}
											set(
												$current,
												"portNr",
												lv_portNr_5_0,
												"org.xtext.system.deployment.Deployment.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getNamingServiceAccess().getDeployDeploymentParserRuleCall_3_1_0());
									}
									lv_deploy_6_0=ruleDeployment
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getNamingServiceRule());
										}
										set(
											$current,
											"deploy",
											lv_deploy_6_0,
											"org.xtext.system.deployment.Deployment.Deployment");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
				}
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getNamingServiceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDeployment
entryRuleDeployment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeploymentRule()); }
	iv_ruleDeployment=ruleDeployment
	{ $current=$iv_ruleDeployment.current; }
	EOF;

// Rule Deployment
ruleDeployment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='deploy-to'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeployToKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeploymentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceCrossReference_1_0());
				}
				ruleFQN
				{
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
