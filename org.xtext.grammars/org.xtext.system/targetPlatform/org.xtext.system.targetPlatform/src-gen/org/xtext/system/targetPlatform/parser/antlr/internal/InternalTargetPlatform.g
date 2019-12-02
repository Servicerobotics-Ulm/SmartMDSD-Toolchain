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
grammar InternalTargetPlatform;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.targetPlatform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.targetPlatform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;

}

@parser::members {

 	private TargetPlatformGrammarAccess grammarAccess;

    public InternalTargetPlatformParser(TokenStream input, TargetPlatformGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TargetPlatformModel";
   	}

   	@Override
   	protected TargetPlatformGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTargetPlatformModel
entryRuleTargetPlatformModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetPlatformModelRule()); }
	iv_ruleTargetPlatformModel=ruleTargetPlatformModel
	{ $current=$iv_ruleTargetPlatformModel.current; }
	EOF;

// Rule TargetPlatformModel
ruleTargetPlatformModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TargetPlatformModel'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetPlatformModelRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleAbstractTPElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetPlatformModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"org.xtext.system.targetPlatform.TargetPlatform.AbstractTPElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAbstractTPElement
entryRuleAbstractTPElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractTPElementRule()); }
	iv_ruleAbstractTPElement=ruleAbstractTPElement
	{ $current=$iv_ruleAbstractTPElement.current; }
	EOF;

// Rule AbstractTPElement
ruleAbstractTPElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0());
		}
		this_TargetPlatformDefinition_0=ruleTargetPlatformDefinition
		{
			$current = $this_TargetPlatformDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1());
		}
		this_NetworkConnection_1=ruleNetworkConnection
		{
			$current = $this_NetworkConnection_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNetworkConnection
entryRuleNetworkConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNetworkConnectionRule()); }
	iv_ruleNetworkConnection=ruleNetworkConnection
	{ $current=$iv_ruleNetworkConnection.current; }
	EOF;

// Rule NetworkConnection
ruleNetworkConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NetworkConnection'
		{
			newLeafNode(otherlv_0, grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNetworkConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='<->'
		{
			newLeafNode(otherlv_3, grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNetworkConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='kind'
			{
				newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0());
					}
					lv_kind_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
						}
						set(
							$current,
							"kind",
							lv_kind_6_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleTargetPlatformDefinition
entryRuleTargetPlatformDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetPlatformDefinitionRule()); }
	iv_ruleTargetPlatformDefinition=ruleTargetPlatformDefinition
	{ $current=$iv_ruleTargetPlatformDefinition.current; }
	EOF;

// Rule TargetPlatformDefinition
ruleTargetPlatformDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TargetPlatformDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetPlatformDefinitionRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0());
				}
				lv_os_3_0=ruleOperatingSystem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetPlatformDefinitionRule());
					}
					set(
						$current,
						"os",
						lv_os_3_0,
						"org.xtext.system.targetPlatform.TargetPlatform.OperatingSystem");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0());
				}
				lv_elements_4_0=ruleAbstractTPSubNode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetPlatformDefinitionRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"org.xtext.system.targetPlatform.TargetPlatform.AbstractTPSubNode");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleOperatingSystem
entryRuleOperatingSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperatingSystemRule()); }
	iv_ruleOperatingSystem=ruleOperatingSystem
	{ $current=$iv_ruleOperatingSystem.current; }
	EOF;

// Rule OperatingSystem
ruleOperatingSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0());
		}
		this_Windows_0=ruleWindows
		{
			$current = $this_Windows_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1());
		}
		this_Linux_1=ruleLinux
		{
			$current = $this_Linux_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2());
		}
		this_MacOS_2=ruleMacOS
		{
			$current = $this_MacOS_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWindows
entryRuleWindows returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWindowsRule()); }
	iv_ruleWindows=ruleWindows
	{ $current=$iv_ruleWindows.current; }
	EOF;

// Rule Windows
ruleWindows returns [EObject current=null]
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
					grammarAccess.getWindowsAccess().getWindowsAction_0(),
					$current);
			}
		)
		otherlv_1='Windows'
		{
			newLeafNode(otherlv_1, grammarAccess.getWindowsAccess().getWindowsKeyword_1());
		}
		(
			(
				lv_kind_2_0=RULE_STRING
				{
					newLeafNode(lv_kind_2_0, grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWindowsRule());
					}
					setWithLastConsumed(
						$current,
						"kind",
						lv_kind_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getWindowsAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleLinux
entryRuleLinux returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinuxRule()); }
	iv_ruleLinux=ruleLinux
	{ $current=$iv_ruleLinux.current; }
	EOF;

// Rule Linux
ruleLinux returns [EObject current=null]
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
					grammarAccess.getLinuxAccess().getLinuxAction_0(),
					$current);
			}
		)
		otherlv_1='Linux'
		{
			newLeafNode(otherlv_1, grammarAccess.getLinuxAccess().getLinuxKeyword_1());
		}
		(
			(
				lv_kind_2_0=RULE_STRING
				{
					newLeafNode(lv_kind_2_0, grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinuxRule());
					}
					setWithLastConsumed(
						$current,
						"kind",
						lv_kind_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getLinuxAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleMacOS
entryRuleMacOS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMacOSRule()); }
	iv_ruleMacOS=ruleMacOS
	{ $current=$iv_ruleMacOS.current; }
	EOF;

// Rule MacOS
ruleMacOS returns [EObject current=null]
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
					grammarAccess.getMacOSAccess().getMacOSAction_0(),
					$current);
			}
		)
		otherlv_1='MacOS'
		{
			newLeafNode(otherlv_1, grammarAccess.getMacOSAccess().getMacOSKeyword_1());
		}
		(
			(
				lv_kind_2_0=RULE_STRING
				{
					newLeafNode(lv_kind_2_0, grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMacOSRule());
					}
					setWithLastConsumed(
						$current,
						"kind",
						lv_kind_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getMacOSAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleAbstractTPSubNode
entryRuleAbstractTPSubNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractTPSubNodeRule()); }
	iv_ruleAbstractTPSubNode=ruleAbstractTPSubNode
	{ $current=$iv_ruleAbstractTPSubNode.current; }
	EOF;

// Rule AbstractTPSubNode
ruleAbstractTPSubNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0());
		}
		this_NetworkInterface_0=ruleNetworkInterface
		{
			$current = $this_NetworkInterface_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1());
		}
		this_CPU_1=ruleCPU
		{
			$current = $this_CPU_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2());
		}
		this_LoginAccount_2=ruleLoginAccount
		{
			$current = $this_LoginAccount_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3());
		}
		this_TargetMiddleware_3=ruleTargetMiddleware
		{
			$current = $this_TargetMiddleware_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNetworkInterface
entryRuleNetworkInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNetworkInterfaceRule()); }
	iv_ruleNetworkInterface=ruleNetworkInterface
	{ $current=$iv_ruleNetworkInterface.current; }
	EOF;

// Rule NetworkInterface
ruleNetworkInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NetworkInterface'
		{
			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNetworkInterfaceRule());
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
			newLeafNode(otherlv_2, grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='HostAddress'
								{
									newLeafNode(otherlv_4, grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0());
								}
								(
									(
										lv_hostAddress_5_0=RULE_STRING
										{
											newLeafNode(lv_hostAddress_5_0, grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getNetworkInterfaceRule());
											}
											setWithLastConsumed(
												$current,
												"hostAddress",
												lv_hostAddress_5_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								(
									otherlv_6=':'
									{
										newLeafNode(otherlv_6, grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0());
											}
											lv_portNr_7_0=ruleEInt
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
												}
												set(
													$current,
													"portNr",
													lv_portNr_7_0,
													"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='Kind'
								{
									newLeafNode(otherlv_8, grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0());
										}
										lv_kind_9_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
											}
											set(
												$current,
												"kind",
												lv_kind_9_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
				}
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCPU
entryRuleCPU returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCPURule()); }
	iv_ruleCPU=ruleCPU
	{ $current=$iv_ruleCPU.current; }
	EOF;

// Rule CPU
ruleCPU returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CPU'
		{
			newLeafNode(otherlv_0, grammarAccess.getCPUAccess().getCPUKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCPURule());
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
			newLeafNode(otherlv_2, grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getCPUAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='Kind'
								{
									newLeafNode(otherlv_4, grammarAccess.getCPUAccess().getKindKeyword_3_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0());
										}
										lv_kind_5_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCPURule());
											}
											set(
												$current,
												"kind",
												lv_kind_5_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_6='CoresTally'
								{
									newLeafNode(otherlv_6, grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0());
										}
										lv_coresTally_7_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCPURule());
											}
											set(
												$current,
												"coresTally",
												lv_coresTally_7_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getCPUAccess().getUnorderedGroup_3());
				}
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLoginAccount
entryRuleLoginAccount returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoginAccountRule()); }
	iv_ruleLoginAccount=ruleLoginAccount
	{ $current=$iv_ruleLoginAccount.current; }
	EOF;

// Rule LoginAccount
ruleLoginAccount returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LoginAccount'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoginAccountRule());
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
			newLeafNode(otherlv_2, grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='FullName'
								{
									newLeafNode(otherlv_4, grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0());
								}
								(
									(
										lv_fullname_5_0=RULE_STRING
										{
											newLeafNode(lv_fullname_5_0, grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getLoginAccountRule());
											}
											setWithLastConsumed(
												$current,
												"fullname",
												lv_fullname_5_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_6='Email'
								{
									newLeafNode(otherlv_6, grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0());
								}
								(
									(
										lv_email_7_0=RULE_STRING
										{
											newLeafNode(lv_email_7_0, grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getLoginAccountRule());
											}
											setWithLastConsumed(
												$current,
												"email",
												lv_email_7_0,
												"org.eclipse.xtext.common.Terminals.STRING");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
				}
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTargetMiddleware
entryRuleTargetMiddleware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetMiddlewareRule()); }
	iv_ruleTargetMiddleware=ruleTargetMiddleware
	{ $current=$iv_ruleTargetMiddleware.current; }
	EOF;

// Rule TargetMiddleware
ruleTargetMiddleware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TargetMiddleware'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0());
				}
				lv_middleware_1_0=ruleRoboticMiddleware
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetMiddlewareRule());
					}
					set(
						$current,
						"middleware",
						lv_middleware_1_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleRoboticMiddleware
entryRuleRoboticMiddleware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoboticMiddlewareRule()); }
	iv_ruleRoboticMiddleware=ruleRoboticMiddleware
	{ $current=$iv_ruleRoboticMiddleware.current; }
	EOF;

// Rule RoboticMiddleware
ruleRoboticMiddleware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0());
		}
		this_ACE_SmartSoft_0=ruleACE_SmartSoft
		{
			$current = $this_ACE_SmartSoft_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1());
		}
		this_OpcUa_SeRoNet_1=ruleOpcUa_SeRoNet
		{
			$current = $this_OpcUa_SeRoNet_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2());
		}
		this_CORBA_SmartSoft_2=ruleCORBA_SmartSoft
		{
			$current = $this_CORBA_SmartSoft_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3());
		}
		this_DDS_SmartSoft_3=ruleDDS_SmartSoft
		{
			$current = $this_DDS_SmartSoft_3.current;
			afterParserOrEnumRuleCall();
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

// Entry rule entryRuleACE_SmartSoft
entryRuleACE_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getACE_SmartSoftRule()); }
	iv_ruleACE_SmartSoft=ruleACE_SmartSoft
	{ $current=$iv_ruleACE_SmartSoft.current; }
	EOF;

// Rule ACE_SmartSoft
ruleACE_SmartSoft returns [EObject current=null]
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
					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='ACE_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getACE_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOpcUa_SeRoNet
entryRuleOpcUa_SeRoNet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUa_SeRoNetRule()); }
	iv_ruleOpcUa_SeRoNet=ruleOpcUa_SeRoNet
	{ $current=$iv_ruleOpcUa_SeRoNet.current; }
	EOF;

// Rule OpcUa_SeRoNet
ruleOpcUa_SeRoNet returns [EObject current=null]
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
					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
					$current);
			}
		)
		otherlv_1='OpcUa_SeRoNet'
		{
			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOpcUa_SeRoNetRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCORBA_SmartSoft
entryRuleCORBA_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCORBA_SmartSoftRule()); }
	iv_ruleCORBA_SmartSoft=ruleCORBA_SmartSoft
	{ $current=$iv_ruleCORBA_SmartSoft.current; }
	EOF;

// Rule CORBA_SmartSoft
ruleCORBA_SmartSoft returns [EObject current=null]
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
					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='CORBA_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCORBA_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDDS_SmartSoft
entryRuleDDS_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDDS_SmartSoftRule()); }
	iv_ruleDDS_SmartSoft=ruleDDS_SmartSoft
	{ $current=$iv_ruleDDS_SmartSoft.current; }
	EOF;

// Rule DDS_SmartSoft
ruleDDS_SmartSoft returns [EObject current=null]
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
					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='DDS_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDDS_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

fragment RULE_ML_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~('/') ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_SL_DOCUMENTATION : '///' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_DOCU_COMMENT : (RULE_ML_DOCUMENTATION|RULE_SL_DOCUMENTATION);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
