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
package org.xtext.service.communicationObject.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.service.communicationObject.parser.antlr.internal.InternalCommunicationObjectParser;
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;

public class CommunicationObjectParser extends AbstractAntlrParser {

	@Inject
	private CommunicationObjectGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCommunicationObjectParser createParser(XtextTokenStream stream) {
		return new InternalCommunicationObjectParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CommObjectModel";
	}

	public CommunicationObjectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CommunicationObjectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
