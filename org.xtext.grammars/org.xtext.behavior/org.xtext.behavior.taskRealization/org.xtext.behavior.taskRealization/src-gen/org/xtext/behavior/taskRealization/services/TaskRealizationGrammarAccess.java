//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.behavior.taskRealization.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TaskRealizationGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TaskRealizationModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskRealization.TaskRealization.TaskRealizationModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTaskRealizationModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTaskRealizationModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAbstCoordInstAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0 = (RuleCall)cAbstCoordInstAssignment_4.eContents().get(0);
		private final Assignment cTasksAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTasksTaskRealizationParserRuleCall_5_0 = (RuleCall)cTasksAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TaskRealizationModel taskRealization::TaskRealizationModel:
		//	{taskRealization::TaskRealizationModel}
		//	'TaskRealizationModel' name=ID
		//	'{'
		//	abstCoordInst+=AbstractCoordinationModuleInstance*
		//	tasks+=TaskRealization*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{taskRealization::TaskRealizationModel} 'TaskRealizationModel' name=ID '{'
		//abstCoordInst+=AbstractCoordinationModuleInstance* tasks+=TaskRealization* '}'
		public Group getGroup() { return cGroup; }
		
		//{taskRealization::TaskRealizationModel}
		public Action getTaskRealizationModelAction_0() { return cTaskRealizationModelAction_0; }
		
		//'TaskRealizationModel'
		public Keyword getTaskRealizationModelKeyword_1() { return cTaskRealizationModelKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//abstCoordInst+=AbstractCoordinationModuleInstance*
		public Assignment getAbstCoordInstAssignment_4() { return cAbstCoordInstAssignment_4; }
		
		//AbstractCoordinationModuleInstance
		public RuleCall getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0() { return cAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0; }
		
		//tasks+=TaskRealization*
		public Assignment getTasksAssignment_5() { return cTasksAssignment_5; }
		
		//TaskRealization
		public RuleCall getTasksTaskRealizationParserRuleCall_5_0() { return cTasksTaskRealizationParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskRealization.TaskRealization.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class TaskRealizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskRealization.TaskRealization.TaskRealization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskRealizationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTaskDefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTaskDefTaskDefinitionCrossReference_1_0 = (CrossReference)cTaskDefAssignment_1.eContents().get(0);
		private final RuleCall cTaskDefTaskDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cTaskDefTaskDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TaskRealization taskRealization::TaskRealization:
		//	'TaskRealization' taskDef=[taskDefinition::TaskDefinition|FQN]
		//	'{'
		//	//FIXME: add implementation
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TaskRealization' taskDef=[taskDefinition::TaskDefinition|FQN] '{' //FIXME: add implementation
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'TaskRealization'
		public Keyword getTaskRealizationKeyword_0() { return cTaskRealizationKeyword_0; }
		
		//taskDef=[taskDefinition::TaskDefinition|FQN]
		public Assignment getTaskDefAssignment_1() { return cTaskDefAssignment_1; }
		
		//[taskDefinition::TaskDefinition|FQN]
		public CrossReference getTaskDefTaskDefinitionCrossReference_1_0() { return cTaskDefTaskDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1() { return cTaskDefTaskDefinitionFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		////FIXME: add implementation
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class AbstractCoordinationModuleInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.behavior.taskRealization.TaskRealization.AbstractCoordinationModuleInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbstractCoordinationModuleInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCoordModuleDefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCoordModuleDefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0 = (CrossReference)cCoordModuleDefAssignment_3.eContents().get(0);
		private final RuleCall cCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0.eContents().get(1);
		
		//AbstractCoordinationModuleInstance taskRealization::AbstractCoordinationModuleInstance:
		//	'AbstractCoordinationModuleInstance' name=ID 'coordModuleDef'
		//	coordModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'AbstractCoordinationModuleInstance' name=ID 'coordModuleDef'
		//coordModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN]
		public Group getGroup() { return cGroup; }
		
		//'AbstractCoordinationModuleInstance'
		public Keyword getAbstractCoordinationModuleInstanceKeyword_0() { return cAbstractCoordinationModuleInstanceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'coordModuleDef'
		public Keyword getCoordModuleDefKeyword_2() { return cCoordModuleDefKeyword_2; }
		
		//coordModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN]
		public Assignment getCoordModuleDefAssignment_3() { return cCoordModuleDefAssignment_3; }
		
		//[skillDefinition::CoordinationModuleDefinition|FQN]
		public CrossReference getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0() { return cCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1() { return cCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1; }
	}
	
	
	private final TaskRealizationModelElements pTaskRealizationModel;
	private final FQNElements pFQN;
	private final TaskRealizationElements pTaskRealization;
	private final AbstractCoordinationModuleInstanceElements pAbstractCoordinationModuleInstance;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TaskRealizationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTaskRealizationModel = new TaskRealizationModelElements();
		this.pFQN = new FQNElements();
		this.pTaskRealization = new TaskRealizationElements();
		this.pAbstractCoordinationModuleInstance = new AbstractCoordinationModuleInstanceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.behavior.taskRealization.TaskRealization".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TaskRealizationModel taskRealization::TaskRealizationModel:
	//	{taskRealization::TaskRealizationModel}
	//	'TaskRealizationModel' name=ID
	//	'{'
	//	abstCoordInst+=AbstractCoordinationModuleInstance*
	//	tasks+=TaskRealization*
	//	'}';
	public TaskRealizationModelElements getTaskRealizationModelAccess() {
		return pTaskRealizationModel;
	}
	
	public ParserRule getTaskRealizationModelRule() {
		return getTaskRealizationModelAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//TaskRealization taskRealization::TaskRealization:
	//	'TaskRealization' taskDef=[taskDefinition::TaskDefinition|FQN]
	//	'{'
	//	//FIXME: add implementation
	//	'}';
	public TaskRealizationElements getTaskRealizationAccess() {
		return pTaskRealization;
	}
	
	public ParserRule getTaskRealizationRule() {
		return getTaskRealizationAccess().getRule();
	}
	
	//AbstractCoordinationModuleInstance taskRealization::AbstractCoordinationModuleInstance:
	//	'AbstractCoordinationModuleInstance' name=ID 'coordModuleDef'
	//	coordModuleDef=[skillDefinition::CoordinationModuleDefinition|FQN];
	public AbstractCoordinationModuleInstanceElements getAbstractCoordinationModuleInstanceAccess() {
		return pAbstractCoordinationModuleInstance;
	}
	
	public ParserRule getAbstractCoordinationModuleInstanceRule() {
		return getAbstractCoordinationModuleInstanceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
