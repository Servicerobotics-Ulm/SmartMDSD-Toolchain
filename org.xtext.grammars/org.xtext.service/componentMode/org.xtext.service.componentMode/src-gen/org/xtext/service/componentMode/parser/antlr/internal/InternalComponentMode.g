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
grammar InternalComponentMode;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.service.componentMode.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.service.componentMode.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;

}

@parser::members {

 	private ComponentModeGrammarAccess grammarAccess;

    public InternalComponentModeParser(TokenStream input, ComponentModeGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ComponentModeModel";
   	}

   	@Override
   	protected ComponentModeGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComponentModeModel
entryRuleComponentModeModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModeModelRule()); }
	iv_ruleComponentModeModel=ruleComponentModeModel
	{ $current=$iv_ruleComponentModeModel.current; }
	EOF;

// Rule ComponentModeModel
ruleComponentModeModel returns [EObject current=null]
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
					grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0());
				}
				lv_repository_1_0=ruleComponentModeRepository
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentModeModelRule());
					}
					set(
						$current,
						"repository",
						lv_repository_1_0,
						"org.xtext.service.componentMode.ComponentMode.ComponentModeRepository");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleComponentModeRepository
entryRuleComponentModeRepository returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModeRepositoryRule()); }
	iv_ruleComponentModeRepository=ruleComponentModeRepository
	{ $current=$iv_ruleComponentModeRepository.current; }
	EOF;

// Rule ComponentModeRepository
ruleComponentModeRepository returns [EObject current=null]
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
					grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0(),
					$current);
			}
		)
		otherlv_1='ComponentModeRepository'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentModeRepositoryRule());
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
			newLeafNode(otherlv_3, grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0());
				}
				lv_collections_4_0=ruleComponentModeCollection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentModeRepositoryRule());
					}
					add(
						$current,
						"collections",
						lv_collections_4_0,
						"org.xtext.service.componentMode.ComponentMode.ComponentModeCollection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleComponentModeCollection
entryRuleComponentModeCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModeCollectionRule()); }
	iv_ruleComponentModeCollection=ruleComponentModeCollection
	{ $current=$iv_ruleComponentModeCollection.current; }
	EOF;

// Rule ComponentModeCollection
ruleComponentModeCollection returns [EObject current=null]
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
					grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0(),
					$current);
			}
		)
		otherlv_1='ComponentModeCollection'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentModeCollectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0());
				}
				lv_modes_4_0=ruleComponentModeDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentModeCollectionRule());
					}
					add(
						$current,
						"modes",
						lv_modes_4_0,
						"org.xtext.service.componentMode.ComponentMode.ComponentModeDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleComponentModeDefinition
entryRuleComponentModeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentModeDefinitionRule()); }
	iv_ruleComponentModeDefinition=ruleComponentModeDefinition
	{ $current=$iv_ruleComponentModeDefinition.current; }
	EOF;

// Rule ComponentModeDefinition
ruleComponentModeDefinition returns [EObject current=null]
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
					grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='ComponentModeDefinition'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentModeDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3());
			}
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
