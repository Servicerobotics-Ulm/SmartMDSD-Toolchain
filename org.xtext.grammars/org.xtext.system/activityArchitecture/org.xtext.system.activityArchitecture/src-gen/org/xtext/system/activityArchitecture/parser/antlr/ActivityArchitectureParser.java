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
package org.xtext.system.activityArchitecture.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.system.activityArchitecture.parser.antlr.internal.InternalActivityArchitectureParser;
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

public class ActivityArchitectureParser extends AbstractAntlrParser {

	@Inject
	private ActivityArchitectureGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalActivityArchitectureParser createParser(XtextTokenStream stream) {
		return new InternalActivityArchitectureParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ActivityArchitectureModel";
	}

	public ActivityArchitectureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActivityArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
