//================================================================
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
//================================================================
package org.xtext.service.domainModelsDatasheet.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.service.domainModelsDatasheet.parser.antlr.internal.InternalDomainModelsDatasheetParser;
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;

public class DomainModelsDatasheetParser extends AbstractAntlrParser {

	@Inject
	private DomainModelsDatasheetGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDomainModelsDatasheetParser createParser(XtextTokenStream stream) {
		return new InternalDomainModelsDatasheetParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DomainModelsDatasheet";
	}

	public DomainModelsDatasheetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainModelsDatasheetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
