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
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.base.docuterminals.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.base.docuterminals.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;

}

@parser::members {

 	private DocuTerminalsGrammarAccess grammarAccess;

    public InternalDocuTerminalsParser(TokenStream input, DocuTerminalsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AbstractDocumentedElement";
   	}

   	@Override
   	protected DocuTerminalsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAbstractDocumentedElement
entryRuleAbstractDocumentedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractDocumentedElementRule()); }
	iv_ruleAbstractDocumentedElement=ruleAbstractDocumentedElement
	{ $current=$iv_ruleAbstractDocumentedElement.current; }
	EOF;

// Rule AbstractDocumentedElement
ruleAbstractDocumentedElement returns [EObject current=null]
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
					grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0(),
					$current);
			}
		)
		(
			(
				lv_documentation_1_0=RULE_DOCU_COMMENT
				{
					newLeafNode(lv_documentation_1_0, grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractDocumentedElementRule());
					}
					setWithLastConsumed(
						$current,
						"documentation",
						lv_documentation_1_0,
						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
				}
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
