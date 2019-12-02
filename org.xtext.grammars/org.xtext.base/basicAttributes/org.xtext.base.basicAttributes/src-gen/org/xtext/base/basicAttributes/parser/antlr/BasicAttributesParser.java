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
package org.xtext.base.basicAttributes.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.base.basicAttributes.parser.antlr.internal.InternalBasicAttributesParser;
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

public class BasicAttributesParser extends AbstractAntlrParser {

	@Inject
	private BasicAttributesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBasicAttributesParser createParser(XtextTokenStream stream) {
		return new InternalBasicAttributesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AttributeDefinition";
	}

	public BasicAttributesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BasicAttributesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
