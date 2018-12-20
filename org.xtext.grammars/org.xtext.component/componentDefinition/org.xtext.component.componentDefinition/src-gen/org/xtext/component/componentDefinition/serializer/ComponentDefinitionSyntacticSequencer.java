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
package org.xtext.component.componentDefinition.serializer;

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
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;

@SuppressWarnings("all")
public class ComponentDefinitionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ComponentDefinitionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActivationConstraints_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_ActivationConstraints_SemicolonKeyword_7_0_4_q;
	protected AbstractElementAlias match_ActivationConstraints_SemicolonKeyword_7_1_4_q;
	protected AbstractElementAlias match_ComponentParametersRef_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ComponentSubNodeObserver_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_CoordinationMasterPort_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_DefaultTrigger_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_OpcUaClientLink_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_OpcUaDeviceClient_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_OpcUaStatusServer_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_OperationModeBinding_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_PrivateOperationMode_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_RequestPortLink_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_ServiceRepoImport_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_SkillRealizationsRef_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_SupportedMiddleware_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ComponentDefinitionGrammarAccess) access;
		match_ActivationConstraints_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6());
		match_ActivationConstraints_SemicolonKeyword_7_0_4_q = new TokenAlias(false, true, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4());
		match_ActivationConstraints_SemicolonKeyword_7_1_4_q = new TokenAlias(false, true, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4());
		match_ComponentParametersRef_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3());
		match_ComponentSubNodeObserver_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2());
		match_CoordinationMasterPort_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4());
		match_DefaultTrigger_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2());
		match_OpcUaClientLink_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2());
		match_OpcUaDeviceClient_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3());
		match_OpcUaStatusServer_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOpcUaStatusServerAccess().getSemicolonKeyword_4());
		match_OperationModeBinding_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2());
		match_PrivateOperationMode_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2());
		match_RequestPortLink_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2());
		match_ServiceRepoImport_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2());
		match_SkillRealizationsRef_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2());
		match_SupportedMiddleware_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3());
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
			if (match_ActivationConstraints_SemicolonKeyword_6_q.equals(syntax))
				emit_ActivationConstraints_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActivationConstraints_SemicolonKeyword_7_0_4_q.equals(syntax))
				emit_ActivationConstraints_SemicolonKeyword_7_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActivationConstraints_SemicolonKeyword_7_1_4_q.equals(syntax))
				emit_ActivationConstraints_SemicolonKeyword_7_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentParametersRef_SemicolonKeyword_3_q.equals(syntax))
				emit_ComponentParametersRef_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentSubNodeObserver_SemicolonKeyword_2_q.equals(syntax))
				emit_ComponentSubNodeObserver_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CoordinationMasterPort_SemicolonKeyword_4_q.equals(syntax))
				emit_CoordinationMasterPort_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefaultTrigger_SemicolonKeyword_2_q.equals(syntax))
				emit_DefaultTrigger_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OpcUaClientLink_SemicolonKeyword_2_q.equals(syntax))
				emit_OpcUaClientLink_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OpcUaDeviceClient_SemicolonKeyword_3_q.equals(syntax))
				emit_OpcUaDeviceClient_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OpcUaStatusServer_SemicolonKeyword_4_q.equals(syntax))
				emit_OpcUaStatusServer_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationModeBinding_SemicolonKeyword_2_q.equals(syntax))
				emit_OperationModeBinding_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrivateOperationMode_SemicolonKeyword_2_q.equals(syntax))
				emit_PrivateOperationMode_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RequestPortLink_SemicolonKeyword_2_q.equals(syntax))
				emit_RequestPortLink_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ServiceRepoImport_SemicolonKeyword_2_q.equals(syntax))
				emit_ServiceRepoImport_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SkillRealizationsRef_SemicolonKeyword_2_q.equals(syntax))
				emit_SkillRealizationsRef_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SupportedMiddleware_SemicolonKeyword_3_q.equals(syntax))
				emit_SupportedMiddleware_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     configurable=EBoolean (ambiguity) 'maxActFreq' '=' maxActFreq=EDouble
	 *     configurable=EBoolean (ambiguity) 'minActFreq' '=' minActFreq=EDouble
	 *     configurable=EBoolean (ambiguity) '}' (rule end)
	 */
	protected void emit_ActivationConstraints_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     minActFreq=EDouble 'Hz' (ambiguity) 'maxActFreq' '=' maxActFreq=EDouble
	 *     minActFreq=EDouble 'Hz' (ambiguity) 'minActFreq' '=' minActFreq=EDouble
	 *     minActFreq=EDouble 'Hz' (ambiguity) '}' (rule end)
	 */
	protected void emit_ActivationConstraints_SemicolonKeyword_7_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     maxActFreq=EDouble 'Hz' (ambiguity) 'maxActFreq' '=' maxActFreq=EDouble
	 *     maxActFreq=EDouble 'Hz' (ambiguity) 'minActFreq' '=' minActFreq=EDouble
	 *     maxActFreq=EDouble 'Hz' (ambiguity) '}' (rule end)
	 */
	protected void emit_ActivationConstraints_SemicolonKeyword_7_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameter=[ComponentParameter|FQN] (ambiguity) (rule end)
	 *     slave=[CoordinationSlavePort|FQN] (ambiguity) (rule end)
	 */
	protected void emit_ComponentParametersRef_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     subject=[ComponentSubNode|FQN] (ambiguity) (rule end)
	 */
	protected void emit_ComponentSubNodeObserver_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     service=[CoordinationServiceDefinition|FQN] (ambiguity) (rule end)
	 */
	protected void emit_CoordinationMasterPort_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     element=[ComponentSubNode|FQN] (ambiguity) (rule end)
	 *     inputLink=[InputLinkExtension|FQN] (ambiguity) (rule end)
	 *     periodicActFreq=EDouble 'Hz' (ambiguity) (rule end)
	 *     prescale=EInt (ambiguity) (rule end)
	 */
	protected void emit_DefaultTrigger_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     client=[OpcUaDeviceClient|FQN] (ambiguity) (rule end)
	 */
	protected void emit_OpcUaClientLink_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     deviceURI=EString (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 *     opcuaXmlFile=EString (ambiguity) (rule end)
	 */
	protected void emit_OpcUaDeviceClient_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     outPort=[OutputPort|FQN] (ambiguity) (rule end)
	 */
	protected void emit_OpcUaStatusServer_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     mode=[PrivateOperationMode|FQN] (ambiguity) (rule end)
	 */
	protected void emit_OperationModeBinding_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_PrivateOperationMode_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     requestPort=[RequestPort|FQN] (ambiguity) (rule end)
	 */
	protected void emit_RequestPortLink_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     importedNamespace=FQNW (ambiguity) (rule end)
	 */
	protected void emit_ServiceRepoImport_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     skillRealizationSetRef=[SkillRealizationSet|FQN] (ambiguity) (rule end)
	 */
	protected void emit_SkillRealizationsRef_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     middleware=RoboticMiddleware (ambiguity) (rule end)
	 */
	protected void emit_SupportedMiddleware_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
