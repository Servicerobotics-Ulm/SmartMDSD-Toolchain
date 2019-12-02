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
package org.xtext.service.roboticMiddleware.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.service.roboticMiddleware.parser.antlr.internal.InternalRoboticMiddlewareParser;
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

public class RoboticMiddlewareParser extends AbstractAntlrParser {

	@Inject
	private RoboticMiddlewareGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRoboticMiddlewareParser createParser(XtextTokenStream stream) {
		return new InternalRoboticMiddlewareParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RoboticMiddleware";
	}

	public RoboticMiddlewareGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RoboticMiddlewareGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
