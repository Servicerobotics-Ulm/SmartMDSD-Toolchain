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
package org.xtext.system.activityArchitecture.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

@SuppressWarnings("all")
public class ActivityArchitectureSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActivityArchitectureGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActivityNode_SemicolonKeyword_5_0_2_q;
	protected AbstractElementAlias match_ActivityNode___InputsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_CPUCore_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_DataTriggered_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_ExecutionTime_SemicolonKeyword_1_0_2_q;
	protected AbstractElementAlias match_ExecutionTime_SemicolonKeyword_1_1_2_q;
	protected AbstractElementAlias match_HandlerTriggerInputNode_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_PeriodicTimer_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_RegisterInputNode_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Scheduler_SemicolonKeyword_2_0_2_q;
	protected AbstractElementAlias match_Scheduler_SemicolonKeyword_2_1_2_q;
	protected AbstractElementAlias match_Sporadic_SemicolonKeyword_3_0_3_q;
	protected AbstractElementAlias match_Sporadic_SemicolonKeyword_3_1_3_q;
	protected AbstractElementAlias match_TriggerInputNode_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActivityArchitectureGrammarAccess) access;
		match_ActivityNode_SemicolonKeyword_5_0_2_q = new TokenAlias(false, true, grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2());
		match_ActivityNode___InputsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3()));
		match_CPUCore_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5());
		match_DataTriggered_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5());
		match_ExecutionTime_SemicolonKeyword_1_0_2_q = new TokenAlias(false, true, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2());
		match_ExecutionTime_SemicolonKeyword_1_1_2_q = new TokenAlias(false, true, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2());
		match_HandlerTriggerInputNode_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3());
		match_PeriodicTimer_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5());
		match_RegisterInputNode_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3());
		match_Scheduler_SemicolonKeyword_2_0_2_q = new TokenAlias(false, true, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2());
		match_Scheduler_SemicolonKeyword_2_1_2_q = new TokenAlias(false, true, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2());
		match_Sporadic_SemicolonKeyword_3_0_3_q = new TokenAlias(false, true, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3());
		match_Sporadic_SemicolonKeyword_3_1_3_q = new TokenAlias(false, true, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3());
		match_TriggerInputNode_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ActivityNode_SemicolonKeyword_5_0_2_q.equals(syntax))
				emit_ActivityNode_SemicolonKeyword_5_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActivityNode___InputsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ActivityNode___InputsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CPUCore_SemicolonKeyword_5_q.equals(syntax))
				emit_CPUCore_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DataTriggered_SemicolonKeyword_5_q.equals(syntax))
				emit_DataTriggered_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExecutionTime_SemicolonKeyword_1_0_2_q.equals(syntax))
				emit_ExecutionTime_SemicolonKeyword_1_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExecutionTime_SemicolonKeyword_1_1_2_q.equals(syntax))
				emit_ExecutionTime_SemicolonKeyword_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HandlerTriggerInputNode_SemicolonKeyword_3_q.equals(syntax))
				emit_HandlerTriggerInputNode_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PeriodicTimer_SemicolonKeyword_5_q.equals(syntax))
				emit_PeriodicTimer_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RegisterInputNode_SemicolonKeyword_3_q.equals(syntax))
				emit_RegisterInputNode_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Scheduler_SemicolonKeyword_2_0_2_q.equals(syntax))
				emit_Scheduler_SemicolonKeyword_2_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Scheduler_SemicolonKeyword_2_1_2_q.equals(syntax))
				emit_Scheduler_SemicolonKeyword_2_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Sporadic_SemicolonKeyword_3_0_3_q.equals(syntax))
				emit_Sporadic_SemicolonKeyword_3_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Sporadic_SemicolonKeyword_3_1_3_q.equals(syntax))
				emit_Sporadic_SemicolonKeyword_3_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TriggerInputNode_SemicolonKeyword_3_q.equals(syntax))
				emit_TriggerInputNode_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     affinity=[CPUCore|FQN] (ambiguity) 'activationSource' activationSource=ActivationSource
	 *     affinity=[CPUCore|FQN] (ambiguity) 'cpuAffinity' affinity=[CPUCore|FQN]
	 *     affinity=[CPUCore|FQN] (ambiguity) 'executionTime' executionTime=ExecutionTime
	 *     affinity=[CPUCore|FQN] (ambiguity) 'scheduler' scheduler=Scheduler
	 *     affinity=[CPUCore|FQN] (ambiguity) '}' (rule end)
	 */
	protected void emit_ActivityNode_SemicolonKeyword_5_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('inputs' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '{' (ambiguity) 'activationSource' activationSource=ActivationSource
	 *     name=ID '{' (ambiguity) 'cpuAffinity' affinity=[CPUCore|FQN]
	 *     name=ID '{' (ambiguity) 'executionTime' executionTime=ExecutionTime
	 *     name=ID '{' (ambiguity) 'scheduler' scheduler=Scheduler
	 *     name=ID '{' (ambiguity) '}' (rule end)
	 */
	protected void emit_ActivityNode___InputsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     coreNumber=EInt (ambiguity) '}' (rule end)
	 */
	protected void emit_CPUCore_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     prescale=EInt (ambiguity) '}' (rule end)
	 */
	protected void emit_DataTriggered_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     minTime=TimeValue (ambiguity) 'maxTime' maxTime=TimeValue
	 *     minTime=TimeValue (ambiguity) 'minTime' minTime=TimeValue
	 *     minTime=TimeValue (ambiguity) '}' (rule end)
	 */
	protected void emit_ExecutionTime_SemicolonKeyword_1_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     maxTime=TimeValue (ambiguity) 'maxTime' maxTime=TimeValue
	 *     maxTime=TimeValue (ambiguity) 'minTime' minTime=TimeValue
	 *     maxTime=TimeValue (ambiguity) '}' (rule end)
	 */
	protected void emit_ExecutionTime_SemicolonKeyword_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_HandlerTriggerInputNode_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     periodicActFreq=EDouble 'Hz' (ambiguity) '}' (rule end)
	 */
	protected void emit_PeriodicTimer_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_RegisterInputNode_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=SchedulerType (ambiguity) 'priority' priority=EInt
	 *     type=SchedulerType (ambiguity) 'type' type=SchedulerType
	 *     type=SchedulerType (ambiguity) '}' (rule end)
	 */
	protected void emit_Scheduler_SemicolonKeyword_2_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     priority=EInt (ambiguity) 'priority' priority=EInt
	 *     priority=EInt (ambiguity) 'type' type=SchedulerType
	 *     priority=EInt (ambiguity) '}' (rule end)
	 */
	protected void emit_Scheduler_SemicolonKeyword_2_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     minActFreq=EDouble 'Hz' (ambiguity) 'maxActFreq' maxActFreq=EDouble
	 *     minActFreq=EDouble 'Hz' (ambiguity) 'minActFreq' minActFreq=EDouble
	 *     minActFreq=EDouble 'Hz' (ambiguity) '}' (rule end)
	 */
	protected void emit_Sporadic_SemicolonKeyword_3_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     maxActFreq=EDouble 'Hz' (ambiguity) 'maxActFreq' maxActFreq=EDouble
	 *     maxActFreq=EDouble 'Hz' (ambiguity) 'minActFreq' minActFreq=EDouble
	 *     maxActFreq=EDouble 'Hz' (ambiguity) '}' (rule end)
	 */
	protected void emit_Sporadic_SemicolonKeyword_3_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_TriggerInputNode_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
