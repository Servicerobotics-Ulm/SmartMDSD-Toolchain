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
package org.xtext.base.docuterminals.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.base.docuterminals.parser.antlr.internal.InternalDocuTerminalsParser;
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;

public class DocuTerminalsParser extends AbstractAntlrParser {

	@Inject
	private DocuTerminalsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDocuTerminalsParser createParser(XtextTokenStream stream) {
		return new InternalDocuTerminalsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AbstractDocumentedElement";
	}

	public DocuTerminalsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DocuTerminalsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
