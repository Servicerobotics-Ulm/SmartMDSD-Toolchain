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
package org.xtext.component.componentDatasheet.serializer;

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
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;

@SuppressWarnings("all")
public class ComponentDatasheetSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ComponentDatasheetGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ComponentDatasheet_ColonKeyword_4_0_1_q;
	protected AbstractElementAlias match_ComponentDatasheet_ColonKeyword_4_1_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_0_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_1_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_2_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_3_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_4_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_5_1_q;
	protected AbstractElementAlias match_GenericDatasheet_ColonKeyword_6_1_q;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_0_1_q;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_1_1_q;
	protected AbstractElementAlias match_ProprietaryLicense_ColonKeyword_3_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ComponentDatasheetGrammarAccess) access;
		match_ComponentDatasheet_ColonKeyword_4_0_1_q = new TokenAlias(false, true, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_0_1());
		match_ComponentDatasheet_ColonKeyword_4_1_1_q = new TokenAlias(false, true, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_1_1());
		match_GenericDatasheet_ColonKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1());
		match_GenericDatasheet_ColonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1());
		match_GenericDatasheet_ColonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1());
		match_GenericDatasheet_ColonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1());
		match_GenericDatasheet_ColonKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1());
		match_GenericDatasheet_ColonKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1());
		match_GenericDatasheet_ColonKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1());
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
			if (match_ComponentDatasheet_ColonKeyword_4_0_1_q.equals(syntax))
				emit_ComponentDatasheet_ColonKeyword_4_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentDatasheet_ColonKeyword_4_1_1_q.equals(syntax))
				emit_ComponentDatasheet_ColonKeyword_4_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_0_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_1_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_2_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_3_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_4_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_5_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GenericDatasheet_ColonKeyword_6_1_q.equals(syntax))
				emit_GenericDatasheet_ColonKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProprietaryLicense_ColonKeyword_3_0_1_q.equals(syntax))
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
	 *     baseURI=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     component=[ComponentDefinition|ID] '{' 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     hardwareRequirementDescription=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     homepage=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     license=AbstractLicense 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     longDescription=TEXT_BLOCK 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     purposeDescription=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     shortDescription=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     supplierDescription=EString 'purposeDescription' (ambiguity) purposeDescription=EString
	 *     trl=TRL 'purposeDescription' (ambiguity) purposeDescription=EString
	 */
	protected void emit_ComponentDatasheet_ColonKeyword_4_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     component=[ComponentDefinition|ID] '{' 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     hardwareRequirementDescription=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     homepage=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     license=AbstractLicense 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     longDescription=TEXT_BLOCK 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     purposeDescription=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     shortDescription=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     supplierDescription=EString 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 *     trl=TRL 'hardwareRequirementDescription' (ambiguity) hardwareRequirementDescription=EString
	 */
	protected void emit_ComponentDatasheet_ColonKeyword_4_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'baseURI' (ambiguity) baseURI=EString
	 *     component=[ComponentDefinition|ID] '{' 'baseURI' (ambiguity) baseURI=EString
	 *     homepage=EString 'baseURI' (ambiguity) baseURI=EString
	 *     license=AbstractLicense 'baseURI' (ambiguity) baseURI=EString
	 *     longDescription=TEXT_BLOCK 'baseURI' (ambiguity) baseURI=EString
	 *     shortDescription=EString 'baseURI' (ambiguity) baseURI=EString
	 *     supplierDescription=EString 'baseURI' (ambiguity) baseURI=EString
	 *     trl=TRL 'baseURI' (ambiguity) baseURI=EString
	 */
	protected void emit_GenericDatasheet_ColonKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'shortDescription' (ambiguity) shortDescription=EString
	 *     component=[ComponentDefinition|ID] '{' 'shortDescription' (ambiguity) shortDescription=EString
	 *     homepage=EString 'shortDescription' (ambiguity) shortDescription=EString
	 *     license=AbstractLicense 'shortDescription' (ambiguity) shortDescription=EString
	 *     longDescription=TEXT_BLOCK 'shortDescription' (ambiguity) shortDescription=EString
	 *     shortDescription=EString 'shortDescription' (ambiguity) shortDescription=EString
	 *     supplierDescription=EString 'shortDescription' (ambiguity) shortDescription=EString
	 *     trl=TRL 'shortDescription' (ambiguity) shortDescription=EString
	 */
	protected void emit_GenericDatasheet_ColonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     component=[ComponentDefinition|ID] '{' 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     homepage=EString 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     license=AbstractLicense 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     longDescription=TEXT_BLOCK 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     shortDescription=EString 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     supplierDescription=EString 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 *     trl=TRL 'longDescription' (ambiguity) longDescription=TEXT_BLOCK
	 */
	protected void emit_GenericDatasheet_ColonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     component=[ComponentDefinition|ID] '{' 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     homepage=EString 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     license=AbstractLicense 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     longDescription=TEXT_BLOCK 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     shortDescription=EString 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     supplierDescription=EString 'supplierDescription' (ambiguity) supplierDescription=EString
	 *     trl=TRL 'supplierDescription' (ambiguity) supplierDescription=EString
	 */
	protected void emit_GenericDatasheet_ColonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'homepage' (ambiguity) homepage=EString
	 *     component=[ComponentDefinition|ID] '{' 'homepage' (ambiguity) homepage=EString
	 *     homepage=EString 'homepage' (ambiguity) homepage=EString
	 *     license=AbstractLicense 'homepage' (ambiguity) homepage=EString
	 *     longDescription=TEXT_BLOCK 'homepage' (ambiguity) homepage=EString
	 *     shortDescription=EString 'homepage' (ambiguity) homepage=EString
	 *     supplierDescription=EString 'homepage' (ambiguity) homepage=EString
	 *     trl=TRL 'homepage' (ambiguity) homepage=EString
	 */
	protected void emit_GenericDatasheet_ColonKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'trl' (ambiguity) trl=TRL
	 *     component=[ComponentDefinition|ID] '{' 'trl' (ambiguity) trl=TRL
	 *     homepage=EString 'trl' (ambiguity) trl=TRL
	 *     license=AbstractLicense 'trl' (ambiguity) trl=TRL
	 *     longDescription=TEXT_BLOCK 'trl' (ambiguity) trl=TRL
	 *     shortDescription=EString 'trl' (ambiguity) trl=TRL
	 *     supplierDescription=EString 'trl' (ambiguity) trl=TRL
	 *     trl=TRL 'trl' (ambiguity) trl=TRL
	 */
	protected void emit_GenericDatasheet_ColonKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseURI=EString 'license' (ambiguity) license=AbstractLicense
	 *     component=[ComponentDefinition|ID] '{' 'license' (ambiguity) license=AbstractLicense
	 *     homepage=EString 'license' (ambiguity) license=AbstractLicense
	 *     license=AbstractLicense 'license' (ambiguity) license=AbstractLicense
	 *     longDescription=TEXT_BLOCK 'license' (ambiguity) license=AbstractLicense
	 *     shortDescription=EString 'license' (ambiguity) license=AbstractLicense
	 *     supplierDescription=EString 'license' (ambiguity) license=AbstractLicense
	 *     trl=TRL 'license' (ambiguity) license=AbstractLicense
	 */
	protected void emit_GenericDatasheet_ColonKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
