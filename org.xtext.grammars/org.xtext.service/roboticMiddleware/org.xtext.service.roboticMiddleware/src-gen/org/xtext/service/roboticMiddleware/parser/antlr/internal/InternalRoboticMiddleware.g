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
grammar InternalRoboticMiddleware;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.service.roboticMiddleware.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.service.roboticMiddleware.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

}

@parser::members {

 	private RoboticMiddlewareGrammarAccess grammarAccess;

    public InternalRoboticMiddlewareParser(TokenStream input, RoboticMiddlewareGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RoboticMiddleware";
   	}

   	@Override
   	protected RoboticMiddlewareGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
