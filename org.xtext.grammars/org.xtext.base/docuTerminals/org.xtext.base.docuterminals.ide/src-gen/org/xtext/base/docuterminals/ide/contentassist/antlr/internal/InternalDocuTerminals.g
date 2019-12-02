//===================================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
//===================================================================================
grammar InternalDocuTerminals;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.base.docuterminals.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.base.docuterminals.ide.contentassist.antlr.internal;

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
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;

}
@parser::members {
	private DocuTerminalsGrammarAccess grammarAccess;

	public void setGrammarAccess(DocuTerminalsGrammarAccess grammarAccess) {
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

// Entry rule entryRuleAbstractDocumentedElement
entryRuleAbstractDocumentedElement
:
{ before(grammarAccess.getAbstractDocumentedElementRule()); }
	 ruleAbstractDocumentedElement
{ after(grammarAccess.getAbstractDocumentedElementRule()); } 
	 EOF 
;

// Rule AbstractDocumentedElement
ruleAbstractDocumentedElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractDocumentedElementAccess().getGroup()); }
		(rule__AbstractDocumentedElement__Group__0)
		{ after(grammarAccess.getAbstractDocumentedElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDocumentedElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractDocumentedElement__Group__0__Impl
	rule__AbstractDocumentedElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDocumentedElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0()); }
	()
	{ after(grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDocumentedElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractDocumentedElement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDocumentedElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1()); }
	(rule__AbstractDocumentedElement__DocumentationAssignment_1)?
	{ after(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractDocumentedElement__DocumentationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
