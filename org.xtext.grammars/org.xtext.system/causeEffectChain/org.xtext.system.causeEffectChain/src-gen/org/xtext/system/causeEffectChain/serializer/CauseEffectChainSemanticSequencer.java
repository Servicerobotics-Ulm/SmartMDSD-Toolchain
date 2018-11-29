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
package org.xtext.system.causeEffectChain.serializer;

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
import org.ecore.system.causeEffectChain.ActivityChain;
import org.ecore.system.causeEffectChain.ActivityLink;
import org.ecore.system.causeEffectChain.CauseEffectChainPackage;
import org.ecore.system.causeEffectChain.CuaseEffectChainModel;
import org.ecore.system.causeEffectChain.InputHandlerLink;
import org.ecore.system.causeEffectChain.MaxResponseTime;
import org.ecore.system.causeEffectChain.MinResponseTime;
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;

@SuppressWarnings("all")
public class CauseEffectChainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CauseEffectChainGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CauseEffectChainPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CauseEffectChainPackage.ACTIVITY_CHAIN:
				sequence_ActivityChain(context, (ActivityChain) semanticObject); 
				return; 
			case CauseEffectChainPackage.ACTIVITY_LINK:
				sequence_ActivityLink(context, (ActivityLink) semanticObject); 
				return; 
			case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL:
				sequence_CuaseEffectChainModel(context, (CuaseEffectChainModel) semanticObject); 
				return; 
			case CauseEffectChainPackage.INPUT_HANDLER_LINK:
				sequence_InputHandlerLink(context, (InputHandlerLink) semanticObject); 
				return; 
			case CauseEffectChainPackage.MAX_RESPONSE_TIME:
				sequence_MaxResponseTime(context, (MaxResponseTime) semanticObject); 
				return; 
			case CauseEffectChainPackage.MIN_RESPONSE_TIME:
				sequence_MinResponseTime(context, (MinResponseTime) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivityChain returns ActivityChain
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (chainLinks+=AbstractChainLink chainLinks+=AbstractChainLink*)? 
	 *         (desiredMinResponse=MinResponseTime | desiredMaxResponse=MaxResponseTime)*
	 *     )
	 */
	protected void sequence_ActivityChain(ISerializationContext context, ActivityChain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractChainLink returns ActivityLink
	 *     ActivityLink returns ActivityLink
	 *
	 * Constraint:
	 *     ref=[ActivityNode|FQN]
	 */
	protected void sequence_ActivityLink(ISerializationContext context, ActivityLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.ACTIVITY_LINK__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.ACTIVITY_LINK__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActivityLinkAccess().getRefActivityNodeFQNParserRuleCall_1_0_1(), semanticObject.eGet(CauseEffectChainPackage.Literals.ACTIVITY_LINK__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CuaseEffectChainModel returns CuaseEffectChainModel
	 *
	 * Constraint:
	 *     (name=ID actArch=[ActivityArchitectureModel|FQN] chains+=ActivityChain*)
	 */
	protected void sequence_CuaseEffectChainModel(ISerializationContext context, CuaseEffectChainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractChainLink returns InputHandlerLink
	 *     InputHandlerLink returns InputHandlerLink
	 *
	 * Constraint:
	 *     ref=[InputHandlerNode|FQN]
	 */
	protected void sequence_InputHandlerLink(ISerializationContext context, InputHandlerLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.INPUT_HANDLER_LINK__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.INPUT_HANDLER_LINK__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeFQNParserRuleCall_1_0_1(), semanticObject.eGet(CauseEffectChainPackage.Literals.INPUT_HANDLER_LINK__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MaxResponseTime returns MaxResponseTime
	 *
	 * Constraint:
	 *     (value=EInt unit=TimeUnit)
	 */
	protected void sequence_MaxResponseTime(ISerializationContext context, MaxResponseTime semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.MAX_RESPONSE_TIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.MAX_RESPONSE_TIME__VALUE));
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.MAX_RESPONSE_TIME__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.MAX_RESPONSE_TIME__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMaxResponseTimeAccess().getValueEIntParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getMaxResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MinResponseTime returns MinResponseTime
	 *
	 * Constraint:
	 *     (value=EInt unit=TimeUnit)
	 */
	protected void sequence_MinResponseTime(ISerializationContext context, MinResponseTime semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.MIN_RESPONSE_TIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.MIN_RESPONSE_TIME__VALUE));
			if (transientValues.isValueTransient(semanticObject, CauseEffectChainPackage.Literals.MIN_RESPONSE_TIME__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CauseEffectChainPackage.Literals.MIN_RESPONSE_TIME__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMinResponseTimeAccess().getValueEIntParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getMinResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
}
