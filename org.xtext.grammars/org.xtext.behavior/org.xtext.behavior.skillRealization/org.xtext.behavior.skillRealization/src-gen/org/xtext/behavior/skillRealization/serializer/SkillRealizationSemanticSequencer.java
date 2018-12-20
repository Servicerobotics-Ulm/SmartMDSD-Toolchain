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
package org.xtext.behavior.skillRealization.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.behavior.skillRealization.SkillRealizationSet;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

@SuppressWarnings("all")
public class SkillRealizationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SkillRealizationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SkillRealizationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SkillRealizationPackage.SKILL_REALIZATION:
				sequence_SkillRealization(context, (SkillRealization) semanticObject); 
				return; 
			case SkillRealizationPackage.SKILL_REALIZATION_MODEL:
				sequence_SkillRealizationModel(context, (SkillRealizationModel) semanticObject); 
				return; 
			case SkillRealizationPackage.SKILL_REALIZATION_SET:
				sequence_SkillRealizationSet(context, (SkillRealizationSet) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SkillRealizationModel returns SkillRealizationModel
	 *
	 * Constraint:
	 *     skillsets+=SkillRealizationSet*
	 */
	protected void sequence_SkillRealizationModel(ISerializationContext context, SkillRealizationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillRealizationSet returns SkillRealizationSet
	 *
	 * Constraint:
	 *     (name=ID skillDefSet=[SkillDefinitionSet|FQN] skills+=SkillRealization*)
	 */
	protected void sequence_SkillRealizationSet(ISerializationContext context, SkillRealizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillRealization returns SkillRealization
	 *
	 * Constraint:
	 *     skillDef=[SkillDefinition|FQN]
	 */
	protected void sequence_SkillRealization(ISerializationContext context, SkillRealization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionFQNParserRuleCall_1_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF, false));
		feeder.finish();
	}
	
	
}
