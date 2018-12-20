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
grammar InternalSkillRealization;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.behavior.skillRealization.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.behavior.skillRealization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

}

@parser::members {

 	private SkillRealizationGrammarAccess grammarAccess;

    public InternalSkillRealizationParser(TokenStream input, SkillRealizationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SkillRealizationModel";
   	}

   	@Override
   	protected SkillRealizationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSkillRealizationModel
entryRuleSkillRealizationModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationModelRule()); }
	iv_ruleSkillRealizationModel=ruleSkillRealizationModel
	{ $current=$iv_ruleSkillRealizationModel.current; }
	EOF;

// Rule SkillRealizationModel
ruleSkillRealizationModel returns [EObject current=null]
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
					grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelAction_0(),
					$current);
			}
		)
		otherlv_1='SkillRealizationModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkillRealizationModelAccess().getSkillsetsSkillRealizationSetParserRuleCall_3_0());
				}
				lv_skillsets_3_0=ruleSkillRealizationSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkillRealizationModelRule());
					}
					add(
						$current,
						"skillsets",
						lv_skillsets_3_0,
						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealizationSet");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationModelAccess().getRightCurlyBracketKeyword_4());
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

// Entry rule entryRuleSkillRealizationSet
entryRuleSkillRealizationSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationSetRule()); }
	iv_ruleSkillRealizationSet=ruleSkillRealizationSet
	{ $current=$iv_ruleSkillRealizationSet.current; }
	EOF;

// Rule SkillRealizationSet
ruleSkillRealizationSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SkillSetRealization'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationSetAccess().getSkillSetRealizationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSkillRealizationSetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillRealizationSetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='skillSetDef'
		{
			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationSetAccess().getSkillSetDefKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillRealizationSetRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationSetAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkillRealizationSetAccess().getSkillsSkillRealizationParserRuleCall_5_0());
				}
				lv_skills_5_0=ruleSkillRealization
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkillRealizationSetRule());
					}
					add(
						$current,
						"skills",
						lv_skills_5_0,
						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSkillRealizationSetAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleSkillRealization
entryRuleSkillRealization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationRule()); }
	iv_ruleSkillRealization=ruleSkillRealization
	{ $current=$iv_ruleSkillRealization.current; }
	EOF;

// Rule SkillRealization
ruleSkillRealization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SkillRealization'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_3());
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
