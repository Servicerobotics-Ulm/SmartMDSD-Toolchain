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
grammar InternalCauseEffectChain;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.causeEffectChain.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.causeEffectChain.parser.antlr.internal;

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
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;

}

@parser::members {

 	private CauseEffectChainGrammarAccess grammarAccess;

    public InternalCauseEffectChainParser(TokenStream input, CauseEffectChainGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "CuaseEffectChainModel";
   	}

   	@Override
   	protected CauseEffectChainGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCuaseEffectChainModel
entryRuleCuaseEffectChainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCuaseEffectChainModelRule()); }
	iv_ruleCuaseEffectChainModel=ruleCuaseEffectChainModel
	{ $current=$iv_ruleCuaseEffectChainModel.current; }
	EOF;

// Rule CuaseEffectChainModel
ruleCuaseEffectChainModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CuaseEffectChainModel'
		{
			newLeafNode(otherlv_0, grammarAccess.getCuaseEffectChainModelAccess().getCuaseEffectChainModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCuaseEffectChainModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCuaseEffectChainModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='refinesActivityArch'
		{
			newLeafNode(otherlv_2, grammarAccess.getCuaseEffectChainModelAccess().getRefinesActivityArchKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCuaseEffectChainModelRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getCuaseEffectChainModelAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCuaseEffectChainModelAccess().getChainsActivityChainParserRuleCall_5_0());
				}
				lv_chains_5_0=ruleActivityChain
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCuaseEffectChainModelRule());
					}
					add(
						$current,
						"chains",
						lv_chains_5_0,
						"org.xtext.system.causeEffectChain.CauseEffectChain.ActivityChain");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCuaseEffectChainModelAccess().getRightCurlyBracketKeyword_6());
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

// Entry rule entryRuleActivityChain
entryRuleActivityChain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityChainRule()); }
	iv_ruleActivityChain=ruleActivityChain
	{ $current=$iv_ruleActivityChain.current; }
	EOF;

// Rule ActivityChain
ruleActivityChain returns [EObject current=null]
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
					grammarAccess.getActivityChainAccess().getActivityChainAction_0(),
					$current);
			}
		)
		otherlv_1='ActivityChain'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivityChainAccess().getActivityChainKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getActivityChainAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityChainRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='chainLinks'
			{
				newLeafNode(otherlv_4, grammarAccess.getActivityChainAccess().getChainLinksKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_2_0());
					}
					lv_chainLinks_6_0=ruleAbstractChainLink
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActivityChainRule());
						}
						add(
							$current,
							"chainLinks",
							lv_chainLinks_6_0,
							"org.xtext.system.causeEffectChain.CauseEffectChain.AbstractChainLink");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7='->'
				{
					newLeafNode(otherlv_7, grammarAccess.getActivityChainAccess().getHyphenMinusGreaterThanSignKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_3_1_0());
						}
						lv_chainLinks_8_0=ruleAbstractChainLink
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActivityChainRule());
							}
							add(
								$current,
								"chainLinks",
								lv_chainLinks_8_0,
								"org.xtext.system.causeEffectChain.CauseEffectChain.AbstractChainLink");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getActivityChainAccess().getDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0());
									}
									lv_desiredMinResponse_11_0=ruleMinResponseTime
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getActivityChainRule());
										}
										set(
											$current,
											"desiredMinResponse",
											lv_desiredMinResponse_11_0,
											"org.xtext.system.causeEffectChain.CauseEffectChain.MinResponseTime");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getActivityChainAccess().getDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0());
									}
									lv_desiredMaxResponse_12_0=ruleMaxResponseTime
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getActivityChainRule());
										}
										set(
											$current,
											"desiredMaxResponse",
											lv_desiredMaxResponse_12_0,
											"org.xtext.system.causeEffectChain.CauseEffectChain.MaxResponseTime");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
				}
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAbstractChainLink
entryRuleAbstractChainLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractChainLinkRule()); }
	iv_ruleAbstractChainLink=ruleAbstractChainLink
	{ $current=$iv_ruleAbstractChainLink.current; }
	EOF;

// Rule AbstractChainLink
ruleAbstractChainLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractChainLinkAccess().getActivityLinkParserRuleCall_0());
		}
		this_ActivityLink_0=ruleActivityLink
		{
			$current = $this_ActivityLink_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractChainLinkAccess().getInputHandlerLinkParserRuleCall_1());
		}
		this_InputHandlerLink_1=ruleInputHandlerLink
		{
			$current = $this_InputHandlerLink_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleActivityLink
entryRuleActivityLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityLinkRule()); }
	iv_ruleActivityLink=ruleActivityLink
	{ $current=$iv_ruleActivityLink.current; }
	EOF;

// Rule ActivityLink
ruleActivityLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='act.'
		{
			newLeafNode(otherlv_0, grammarAccess.getActivityLinkAccess().getActKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityLinkRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActivityLinkAccess().getRefActivityNodeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInputHandlerLink
entryRuleInputHandlerLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputHandlerLinkRule()); }
	iv_ruleInputHandlerLink=ruleInputHandlerLink
	{ $current=$iv_ruleInputHandlerLink.current; }
	EOF;

// Rule InputHandlerLink
ruleInputHandlerLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='hnd.'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputHandlerLinkAccess().getHndKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerLinkRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMinResponseTime
entryRuleMinResponseTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMinResponseTimeRule()); }
	iv_ruleMinResponseTime=ruleMinResponseTime
	{ $current=$iv_ruleMinResponseTime.current; }
	EOF;

// Rule MinResponseTime
ruleMinResponseTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='desiredMinResponse'
		{
			newLeafNode(otherlv_0, grammarAccess.getMinResponseTimeAccess().getDesiredMinResponseKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMinResponseTimeAccess().getValueEIntParserRuleCall_1_0());
				}
				lv_value_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMinResponseTimeRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.system.causeEffectChain.CauseEffectChain.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMinResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0());
				}
				lv_unit_2_0=ruleTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMinResponseTimeRule());
					}
					set(
						$current,
						"unit",
						lv_unit_2_0,
						"org.xtext.system.causeEffectChain.CauseEffectChain.TimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getMinResponseTimeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleMaxResponseTime
entryRuleMaxResponseTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaxResponseTimeRule()); }
	iv_ruleMaxResponseTime=ruleMaxResponseTime
	{ $current=$iv_ruleMaxResponseTime.current; }
	EOF;

// Rule MaxResponseTime
ruleMaxResponseTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='desiredMaxResponse'
		{
			newLeafNode(otherlv_0, grammarAccess.getMaxResponseTimeAccess().getDesiredMaxResponseKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMaxResponseTimeAccess().getValueEIntParserRuleCall_1_0());
				}
				lv_value_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMaxResponseTimeRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.system.causeEffectChain.CauseEffectChain.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMaxResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0());
				}
				lv_unit_2_0=ruleTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMaxResponseTimeRule());
					}
					set(
						$current,
						"unit",
						lv_unit_2_0,
						"org.xtext.system.causeEffectChain.CauseEffectChain.TimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getMaxResponseTimeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Rule TimeUnit
ruleTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='sec'
			{
				$current = grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ms'
			{
				$current = grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='us'
			{
				$current = grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2());
			}
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
