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
package org.xtext.system.systemParameter.serializer;

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
import org.xtext.system.systemParameter.services.SystemParameterGrammarAccess;

@SuppressWarnings("all")
public class SystemParameterSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SystemParameterGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeDefinition_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_AttributeRefinement_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_EnumerationElement_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SystemParameterGrammarAccess) access;
		match_AttributeDefinition_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
		match_AttributeRefinement_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_4());
		match_EnumerationElement_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2());
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
			if (match_AttributeDefinition_SemicolonKeyword_5_q.equals(syntax))
				emit_AttributeDefinition_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AttributeRefinement_SemicolonKeyword_4_q.equals(syntax))
				emit_AttributeRefinement_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EnumerationElement_SemicolonKeyword_2_q.equals(syntax))
				emit_EnumerationElement_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     defaultvalue=AbstractValue (ambiguity) (rule end)
	 *     type=AbstractAttributeType (ambiguity) (rule end)
	 */
	protected void emit_AttributeDefinition_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     value=AbstractValue (ambiguity) (rule end)
	 */
	protected void emit_AttributeRefinement_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     value=EInt (ambiguity) (rule end)
	 */
	protected void emit_EnumerationElement_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
