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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.componentMode.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.componentMode.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;

}
@parser::members {
	private ComponentModeGrammarAccess grammarAccess;

	public void setGrammarAccess(ComponentModeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleComponentModeModel
entryRuleComponentModeModel
:
{ before(grammarAccess.getComponentModeModelRule()); }
	 ruleComponentModeModel
{ after(grammarAccess.getComponentModeModelRule()); } 
	 EOF 
;

// Rule ComponentModeModel
ruleComponentModeModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentModeModelAccess().getGroup()); }
		(rule__ComponentModeModel__Group__0)
		{ after(grammarAccess.getComponentModeModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentModeRepository
entryRuleComponentModeRepository
:
{ before(grammarAccess.getComponentModeRepositoryRule()); }
	 ruleComponentModeRepository
{ after(grammarAccess.getComponentModeRepositoryRule()); } 
	 EOF 
;

// Rule ComponentModeRepository
ruleComponentModeRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentModeRepositoryAccess().getGroup()); }
		(rule__ComponentModeRepository__Group__0)
		{ after(grammarAccess.getComponentModeRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentModeCollection
entryRuleComponentModeCollection
:
{ before(grammarAccess.getComponentModeCollectionRule()); }
	 ruleComponentModeCollection
{ after(grammarAccess.getComponentModeCollectionRule()); } 
	 EOF 
;

// Rule ComponentModeCollection
ruleComponentModeCollection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentModeCollectionAccess().getGroup()); }
		(rule__ComponentModeCollection__Group__0)
		{ after(grammarAccess.getComponentModeCollectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentModeDefinition
entryRuleComponentModeDefinition
:
{ before(grammarAccess.getComponentModeDefinitionRule()); }
	 ruleComponentModeDefinition
{ after(grammarAccess.getComponentModeDefinitionRule()); } 
	 EOF 
;

// Rule ComponentModeDefinition
ruleComponentModeDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentModeDefinitionAccess().getGroup()); }
		(rule__ComponentModeDefinition__Group__0)
		{ after(grammarAccess.getComponentModeDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeModel__Group__0__Impl
	rule__ComponentModeModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0()); }
	()
	{ after(grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1()); }
	(rule__ComponentModeModel__RepositoryAssignment_1)?
	{ after(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentModeRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__0__Impl
	rule__ComponentModeRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0()); }
	()
	{ after(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__1__Impl
	rule__ComponentModeRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1()); }
	'ComponentModeRepository'
	{ after(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__2__Impl
	rule__ComponentModeRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2()); }
	(rule__ComponentModeRepository__NameAssignment_2)
	{ after(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__3__Impl
	rule__ComponentModeRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__4__Impl
	rule__ComponentModeRepository__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4()); }
	(rule__ComponentModeRepository__CollectionsAssignment_4)*
	{ after(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeRepository__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentModeCollection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__0__Impl
	rule__ComponentModeCollection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0()); }
	()
	{ after(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__1__Impl
	rule__ComponentModeCollection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1()); }
	'ComponentModeCollection'
	{ after(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__2__Impl
	rule__ComponentModeCollection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2()); }
	(rule__ComponentModeCollection__NameAssignment_2)
	{ after(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__3__Impl
	rule__ComponentModeCollection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__4__Impl
	rule__ComponentModeCollection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4()); }
	(rule__ComponentModeCollection__ModesAssignment_4)*
	{ after(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeCollection__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentModeDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDefinition__Group__0__Impl
	rule__ComponentModeDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0()); }
	()
	{ after(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDefinition__Group__1__Impl
	rule__ComponentModeDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1()); }
	'ComponentModeDefinition'
	{ after(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDefinition__Group__2__Impl
	rule__ComponentModeDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2()); }
	(rule__ComponentModeDefinition__NameAssignment_2)
	{ after(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentModeDefinition__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentModeModel__RepositoryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0()); }
		ruleComponentModeRepository
		{ after(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeRepository__CollectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0()); }
		ruleComponentModeCollection
		{ after(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeCollection__ModesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0()); }
		ruleComponentModeDefinition
		{ after(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentModeDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
