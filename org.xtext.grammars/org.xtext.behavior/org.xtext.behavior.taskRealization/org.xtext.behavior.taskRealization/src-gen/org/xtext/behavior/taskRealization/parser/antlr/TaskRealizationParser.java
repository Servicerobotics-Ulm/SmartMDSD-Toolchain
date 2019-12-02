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
package org.xtext.behavior.taskRealization.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.behavior.taskRealization.parser.antlr.internal.InternalTaskRealizationParser;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;

public class TaskRealizationParser extends AbstractAntlrParser {

	@Inject
	private TaskRealizationGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTaskRealizationParser createParser(XtextTokenStream stream) {
		return new InternalTaskRealizationParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TaskRealizationModel";
	}

	public TaskRealizationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TaskRealizationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
