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
package org.xtext.base.genericDatasheet.serializer;

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
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;

@SuppressWarnings("all")
public class GenericDatasheetSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GenericDatasheetGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_0_1_q;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_1_1_q;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GenericDatasheetGrammarAccess) access;
		match_ProprietaryLicense_ColonKeyword_3_0_1_q = new TokenAlias(false, true, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
		match_ProprietaryLicense_ColonKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
		match_ProprietaryLicense_ColonKeyword_3_2_1_q = new TokenAlias(false, true, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
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
			if (match_ProprietaryLicense_ColonKeyword_3_0_1_q.equals(syntax))
				emit_ProprietaryLicense_ColonKeyword_3_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProprietaryLicense_ColonKeyword_3_1_1_q.equals(syntax))
				emit_ProprietaryLicense_ColonKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProprietaryLicense_ColonKeyword_3_2_1_q.equals(syntax))
				emit_ProprietaryLicense_ColonKeyword_3_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'proprietary' '{' 'name' (ambiguity) name=EString
	 *     fullText=EString 'name' (ambiguity) name=EString
	 *     name=EString 'name' (ambiguity) name=EString
	 *     url=EString 'name' (ambiguity) name=EString
	 */
	protected void emit_ProprietaryLicense_ColonKeyword_3_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'proprietary' '{' 'fullText' (ambiguity) fullText=EString
	 *     fullText=EString 'fullText' (ambiguity) fullText=EString
	 *     name=EString 'fullText' (ambiguity) fullText=EString
	 *     url=EString 'fullText' (ambiguity) fullText=EString
	 */
	protected void emit_ProprietaryLicense_ColonKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'proprietary' '{' 'URL' (ambiguity) url=EString
	 *     fullText=EString 'URL' (ambiguity) url=EString
	 *     name=EString 'URL' (ambiguity) url=EString
	 *     url=EString 'URL' (ambiguity) url=EString
	 */
	protected void emit_ProprietaryLicense_ColonKeyword_3_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
