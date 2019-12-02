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
package org.xtext.system.componentArchitecture.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

@SuppressWarnings("all")
public class ComponentArchitectureSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ComponentArchitectureGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActivityConfigurationMapping_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_Connection_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_InputHandlerConfigurationMapping_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_OpcUaDeviceClientInstance_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_OpcUaReadServerInstance_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ParameterStructInstance_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_ProvidedService_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_RequiredService_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ComponentArchitectureGrammarAccess) access;
		match_ActivityConfigurationMapping_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4());
		match_Connection_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getConnectionAccess().getSemicolonKeyword_5());
		match_InputHandlerConfigurationMapping_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4());
		match_OpcUaDeviceClientInstance_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4());
		match_OpcUaReadServerInstance_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3());
		match_ParameterStructInstance_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2());
		match_ProvidedService_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2());
		match_RequiredService_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2());
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
			if (match_ActivityConfigurationMapping_SemicolonKeyword_4_q.equals(syntax))
				emit_ActivityConfigurationMapping_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Connection_SemicolonKeyword_5_q.equals(syntax))
				emit_Connection_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InputHandlerConfigurationMapping_SemicolonKeyword_4_q.equals(syntax))
				emit_InputHandlerConfigurationMapping_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OpcUaDeviceClientInstance_SemicolonKeyword_4_q.equals(syntax))
				emit_OpcUaDeviceClientInstance_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OpcUaReadServerInstance_SemicolonKeyword_3_q.equals(syntax))
				emit_OpcUaReadServerInstance_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ParameterStructInstance_SemicolonKeyword_2_q.equals(syntax))
				emit_ParameterStructInstance_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProvidedService_SemicolonKeyword_2_q.equals(syntax))
				emit_ProvidedService_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RequiredService_SemicolonKeyword_2_q.equals(syntax))
				emit_RequiredService_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     config=[ActivityNode|FQN] (ambiguity) (rule end)
	 */
	protected void emit_ActivityConfigurationMapping_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     middlewareSelection=RoboticMiddleware (ambiguity) (rule end)
	 *     to=[ProvidedService|FQN] (ambiguity) (rule end)
	 */
	protected void emit_Connection_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     config=[InputHandlerNode|FQN] (ambiguity) (rule end)
	 */
	protected void emit_InputHandlerConfigurationMapping_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     deviceURI=EString (ambiguity) (rule end)
	 */
	protected void emit_OpcUaDeviceClientInstance_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     portNumber=EInt (ambiguity) (rule end)
	 *     readServer=[OpcUaReadServer|FQN] (ambiguity) (rule end)
	 */
	protected void emit_OpcUaReadServerInstance_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameter=[ComponentParameterInstance|FQN] (ambiguity) (rule end)
	 */
	protected void emit_ParameterStructInstance_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     port=[ComponentPort|ID] (ambiguity) (rule end)
	 */
	protected void emit_ProvidedService_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     port=[ComponentPort|ID] (ambiguity) (rule end)
	 */
	protected void emit_RequiredService_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
