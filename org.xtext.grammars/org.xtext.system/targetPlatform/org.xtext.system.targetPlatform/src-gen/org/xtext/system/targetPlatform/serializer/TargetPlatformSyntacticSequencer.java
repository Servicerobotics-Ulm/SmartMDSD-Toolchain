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
package org.xtext.system.targetPlatform.serializer;

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
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;

@SuppressWarnings("all")
public class TargetPlatformSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TargetPlatformGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Linux_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_MacOS_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_TargetMiddleware_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_Windows_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TargetPlatformGrammarAccess) access;
		match_Linux_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getLinuxAccess().getSemicolonKeyword_3());
		match_MacOS_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMacOSAccess().getSemicolonKeyword_3());
		match_TargetMiddleware_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2());
		match_Windows_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getWindowsAccess().getSemicolonKeyword_3());
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
			if (match_Linux_SemicolonKeyword_3_q.equals(syntax))
				emit_Linux_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MacOS_SemicolonKeyword_3_q.equals(syntax))
				emit_MacOS_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TargetMiddleware_SemicolonKeyword_2_q.equals(syntax))
				emit_TargetMiddleware_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Windows_SemicolonKeyword_3_q.equals(syntax))
				emit_Windows_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Linux' (ambiguity) (rule start)
	 *     kind=STRING (ambiguity) (rule end)
	 */
	protected void emit_Linux_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'MacOS' (ambiguity) (rule start)
	 *     kind=STRING (ambiguity) (rule end)
	 */
	protected void emit_MacOS_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     middleware=RoboticMiddleware (ambiguity) (rule end)
	 */
	protected void emit_TargetMiddleware_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Windows' (ambiguity) (rule start)
	 *     kind=STRING (ambiguity) (rule end)
	 */
	protected void emit_Windows_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
